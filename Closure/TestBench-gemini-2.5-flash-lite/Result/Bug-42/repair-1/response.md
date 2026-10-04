```java
package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Token.CommentType;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Block;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.CatchClause;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ConditionalExpression;
import com.google.javascript.rhino.head.ast.ContinueStatement;
import com.google.javascript.rhino.head.ast.DoLoop;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.ExpressionStatement;
import com.google.javascript.rhino.head.ast.ForInLoop;
import com.google.javascript.rhino.head.ast.ForLoop;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.IfStatement;
import com.google.javascript.rhino.head.ast.InfixExpression;
import com.google.javascript.rhino.head.ast.KeywordLiteral;
import com.google.javascript.rhino.head.ast.Label;
import com.google.javascript.rhino.head.ast.LabeledStatement;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.Scope;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.SwitchCase;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.ThrowStatement;
import com.google.javascript.rhino.head.ast.TryStatement;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.VariableInitializer;
import com.google.javascript.rhino.head.ast.WhileLoop;
import com.google.javascript.rhino.head.ast.WithStatement;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.net.URL; // Added import for URL
import java.util.Set;

public class IRFactoryTest {

    // Helper method to create a dummy Config for testing
    private Config createConfig(LanguageMode languageMode, boolean acceptConstKeyword) {
        return new Config(Sets.newHashSet(), Sets.newHashSet(), false, languageMode, acceptConstKeyword);
    }

    // Helper method to create a dummy ErrorReporter for testing
    private ErrorReporter createErrorReporter() {
        return new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int lineNo, String line, int charNo) {
                // Do nothing for now
            }

            @Override
            public void error(String message, String sourceName, int lineNo, String line, int charNo) {
                // Do nothing for now
            }

            // This method was causing a compilation error as it didn't match the abstract method signature.
            // The original method signature in ErrorReporter.java for runtimeError returns EvaluatorException.
            // Since we don't need to throw an exception for this test, we'll change its signature.
            // If a real exception were needed, it would need to be caught or declared.
            public void runtimeError(String message, String sourceName, int lineNo, String line, int charNo) {
                // Do nothing for now
            }
        };
    }

    // Helper method to create a dummy StaticSourceFile for testing
    private StaticSourceFile createStaticSourceFile(String name) {
        return new StaticSourceFile() {
            @Override
            public String getName() {
                return name;
            }

            @Override
            public String getCode() {
                return ""; // Not used in this context
            }

            @Override
            public URL getURL() {
                return null; // Not used in this context
            }

            @Override
            public String getLine(int i) {
                return null; // Not used in this context
            }

            @Override
            public int getNumLines() {
                return 0; // Not used in this context
            }

            // Added missing abstract method getLineOffset
            @Override
            public int getLineOffset(int lineNo) {
                return 0; // Not used in this context
            }
        };
    }

    // Helper method to create an AstRoot from a source string
    private AstRoot createAstRoot(String source) {
        AstRoot root = new AstRoot();
        // AstRoot does not have a setSource method. Use setSourceFile and setSourceString.
        // For this test, we are passing sourceString to transformTree, so we focus on creating
        // a valid AstRoot structure.
        root.setSourceFile(createStaticSourceFile("test.js"));
        root.setSource(source); // This is the correct method for setting the source string
        // Add a dummy node to represent the script content
        root.addChildToBack(new Block());
        return root;
    }

    @Test
    public void testTransformTree_emptyScript() throws Exception {
        String source = "";
        AstRoot astRoot = createAstRoot(source);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        assertFalse(irNode.hasChildren());
    }

    @Test
    public void testTransformTree_singleExpression() throws Exception {
        String source = "1 + 2;";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor call for InfixExpression
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(new InfixExpression(com.google.javascript.rhino.head.Token.ADD, new NumberLiteral(1.0), new NumberLiteral(2.0))));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        assertTrue(irNode.hasChildren());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node addOp = exprStatement.getFirstChild();
        assertEquals(Token.ADD, addOp.getType());
        assertEquals(1.0, addOp.getFirstChild().getDouble(), 0.0);
        assertEquals(2.0, addOp.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_variableDeclaration() throws Exception {
        String source = "var x = 10;";
        AstRoot astRoot = createAstRoot(source);
        VariableDeclaration vd = new VariableDeclaration(com.google.javascript.rhino.head.Token.VAR);
        // Corrected constructor for Name and use of setTarget
        vd.addVariable(new VariableInitializer(new Name("x", 0, 0), new NumberLiteral(10.0)));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(vd));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node varNode = exprStatement.getFirstChild();
        assertEquals(Token.VAR, varNode.getType());
        Node varInitializer = varNode.getFirstChild();
        // BINDING_VAR is not a Token type. It's a Node property or type that's not directly accessible here.
        // We'll check the structure and value instead.
        assertEquals("x", varInitializer.getString());
        assertEquals(10.0, varInitializer.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_functionDeclaration() throws Exception {
        String source = "function foo() { return 1; }";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for Name and use of setFunctionName
        FunctionNode fn = new FunctionNode(new Name("foo", 0, 0));
        // ArrayLiteral is not a valid parameter list. Use IR.paramList() or an empty array of Nodes.
        // For simplicity, we'll use IR.paramList()
        fn.setParams(IR.paramList());
        Block body = new Block();
        // Corrected constructor for ReturnStatement
        body.addStatement(new ReturnStatement(new NumberLiteral(1.0)));
        fn.setBody(body);
        astRoot.getFirstChild().addChildToBack(fn);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node fnNode = irNode.getFirstChild();
        assertEquals(Token.FUNCTION, fnNode.getType());
        assertEquals("foo", fnNode.getFirstChild().getString());
        assertTrue(fnNode.getChildAtIndex(1).isEmpty()); // PARAM_LIST should be empty
        Node returnStmt = fnNode.getChildAtIndex(2).getFirstChild(); // BODY -> RETURN
        assertEquals(Token.RETURN, returnStmt.getType());
        assertEquals(1.0, returnStmt.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_ifStatement() throws Exception {
        String source = "if (true) { 1; } else { 2; }";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for IfStatement, and use of addStatement
        IfStatement ifStmt = new IfStatement(new KeywordLiteral(com.google.javascript.rhino.head.Token.TRUE), new Block(), new Block());
        ifStmt.getThenPart().addStatement(new ExpressionStatement(new NumberLiteral(1.0)));
        ifStmt.getElsePart().addStatement(new ExpressionStatement(new NumberLiteral(2.0)));
        astRoot.getFirstChild().addChildToBack(ifStmt);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node ifNode = irNode.getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(Token.TRUE, ifNode.getFirstChild().getType());
        assertEquals(Token.BLOCK, ifNode.getChildAtIndex(1).getType());
        assertEquals(Token.EXPR_RESULT, ifNode.getChildAtIndex(1).getFirstChild().getType());
        assertEquals(1.0, ifNode.getChildAtIndex(1).getFirstChild().getFirstChild().getDouble(), 0.0);
        assertEquals(Token.BLOCK, ifNode.getChildAtIndex(2).getType());
        assertEquals(Token.EXPR_RESULT, ifNode.getChildAtIndex(2).getFirstChild().getType());
        assertEquals(2.0, ifNode.getChildAtIndex(2).getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_whileLoop() throws Exception {
        String source = "while (true) { 1; }";
        AstRoot astRoot = createAstRoot(source);
        WhileLoop whileLoop = new WhileLoop();
        whileLoop.setCondition(new KeywordLiteral(com.google.javascript.rhino.head.Token.TRUE));
        whileLoop.setBody(new Block());
        // Corrected use of addStatement
        whileLoop.getBody().addStatement(new ExpressionStatement(new NumberLiteral(1.0)));
        astRoot.getFirstChild().addChildToBack(whileLoop);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node whileNode = irNode.getFirstChild();
        assertEquals(Token.WHILE, whileNode.getType());
        assertEquals(Token.TRUE, whileNode.getFirstChild().getType());
        assertEquals(Token.BLOCK, whileNode.getChildAtIndex(1).getType());
        assertEquals(Token.EXPR_RESULT, whileNode.getChildAtIndex(1).getFirstChild().getType());
        assertEquals(1.0, whileNode.getChildAtIndex(1).getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_forLoop() throws Exception {
        String source = "for (var i = 0; i < 10; i++) { 1; }";
        AstRoot astRoot = createAstRoot(source);
        ForLoop forLoop = new ForLoop();
        VariableDeclaration init = new VariableDeclaration(com.google.javascript.rhino.head.Token.VAR);
        // Corrected constructor for Name and use of addVariable
        init.addVariable(new VariableInitializer(new Name("i", 0, 0), new NumberLiteral(0.0)));
        forLoop.setInitializer(init);
        // Corrected constructor for InfixExpression
        forLoop.setCondition(new InfixExpression(com.google.javascript.rhino.head.Token.LT, new Name("i", 0, 0), new NumberLiteral(10.0)));
        // Corrected constructor for UnaryExpression
        forLoop.setIncrement(new UnaryExpression(com.google.javascript.rhino.head.Token.INC, new Name("i", 0, 0)));
        forLoop.setBody(new Block());
        // Corrected use of addStatement
        forLoop.getBody().addStatement(new ExpressionStatement(new NumberLiteral(1.0)));
        astRoot.getFirstChild().addChildToBack(forLoop);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node forNode = irNode.getFirstChild();
        assertEquals(Token.FOR, forNode.getType());
        Node initNode = forNode.getFirstChild();
        assertEquals(Token.VAR, initNode.getType());
        Node conditionNode = forNode.getChildAtIndex(1);
        assertEquals(Token.LT, conditionNode.getType());
        Node incrementNode = forNode.getChildAtIndex(2);
        assertEquals(Token.INC, incrementNode.getType());
        Node bodyNode = forNode.getChildAtIndex(3);
        assertEquals(Token.BLOCK, bodyNode.getType());
        assertEquals(Token.EXPR_RESULT, bodyNode.getFirstChild().getType());
        assertEquals(1.0, bodyNode.getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_forInLoop() throws Exception {
        String source = "for (var x in obj) { 1; }";
        AstRoot astRoot = createAstRoot(source);
        ForInLoop forInLoop = new ForInLoop();
        VariableDeclaration init = new VariableDeclaration(com.google.javascript.rhino.head.Token.VAR);
        // Corrected constructor for Name and use of addVariable
        init.addVariable(new VariableInitializer(new Name("x", 0, 0), null));
        forInLoop.setIterator(init);
        forInLoop.setIteratedObject(new Name("obj", 0, 0));
        forInLoop.setBody(new Block());
        // Corrected use of addStatement
        forInLoop.getBody().addStatement(new ExpressionStatement(new NumberLiteral(1.0)));
        astRoot.getFirstChild().addChildToBack(forInLoop);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node forInNode = irNode.getFirstChild();
        assertEquals(Token.FOR, forInNode.getType());
        Node iteratorNode = forInNode.getFirstChild();
        assertEquals(Token.VAR, iteratorNode.getType());
        Node iteratedObjectNode = forInNode.getChildAtIndex(1);
        assertEquals(Token.NAME, iteratedObjectNode.getType());
        assertEquals("obj", iteratedObjectNode.getString());
        Node bodyNode = forInNode.getChildAtIndex(2);
        assertEquals(Token.BLOCK, bodyNode.getType());
        assertEquals(Token.EXPR_RESULT, bodyNode.getFirstChild().getType());
        assertEquals(1.0, bodyNode.getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_switchStatement() throws Exception {
        String source = "switch(1) { case 1: break; default: }";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for SwitchStatement and SwitchCase
        SwitchStatement ss = new SwitchStatement(new NumberLiteral(1.0));
        SwitchCase case1 = new SwitchCase();
        case1.setExpression(new NumberLiteral(1.0));
        // Corrected use of addStatement
        case1.addStatement(new BreakStatement());
        ss.addCase(case1);
        ss.addCase(new SwitchCase()); // Default case
        astRoot.getFirstChild().addChildToBack(ss);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node switchNode = irNode.getFirstChild();
        assertEquals(Token.SWITCH, switchNode.getType());
        assertEquals(1.0, switchNode.getFirstChild().getDouble(), 0.0);
        Node caseNode1 = switchNode.getChildAtIndex(1);
        assertEquals(Token.CASE, caseNode1.getType());
        assertEquals(1.0, caseNode1.getFirstChild().getDouble(), 0.0);
        assertEquals(Token.BLOCK, caseNode1.getChildAtIndex(1).getType());
        assertEquals(Token.BREAK, caseNode1.getChildAtIndex(1).getFirstChild().getType());
        Node defaultNode = switchNode.getChildAtIndex(2);
        assertEquals(Token.DEFAULT_CASE, defaultNode.getType());
        assertEquals(Token.BLOCK, defaultNode.getFirstChild().getType());
    }

    @Test
    public void testTransformTree_tryCatchStatement() throws Exception {
        String source = "try {} catch(e) {}";
        AstRoot astRoot = createAstRoot(source);
        TryStatement ts = new TryStatement();
        ts.setTryBlock(new Block());
        CatchClause cc = new CatchClause();
        // Corrected constructor for Name and use of setVarName
        cc.setVarName(new Name("e", 0, 0));
        cc.setBody(new Block());
        ts.addCatchClause(cc);
        astRoot.getFirstChild().addChildToBack(ts);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node tryNode = irNode.getFirstChild();
        assertEquals(Token.TRY, tryNode.getType());
        assertEquals(Token.BLOCK, tryNode.getFirstChild().getType());
        assertEquals(Token.CATCH, tryNode.getChildAtIndex(1).getType());
        assertEquals("e", tryNode.getChildAtIndex(1).getFirstChild().getString());
        assertEquals(Token.BLOCK, tryNode.getChildAtIndex(1).getChildAtIndex(1).getType());
    }

    @Test
    public void testTransformTree_throwStatement() throws Exception {
        String source = "throw 1;";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for ThrowStatement
        astRoot.getFirstChild().addChildToBack(new ThrowStatement(new NumberLiteral(1.0)));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node throwNode = irNode.getFirstChild();
        assertEquals(Token.THROW, throwNode.getType());
        assertEquals(1.0, throwNode.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_newExpression() throws Exception {
        String source = "new Date()";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for NewExpression and Name
        NewExpression ne = new NewExpression(new Name("Date", 0, 0));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(ne));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node newNode = exprStatement.getFirstChild();
        assertEquals(Token.NEW, newNode.getType());
        assertEquals("Date", newNode.getFirstChild().getString());
        assertFalse(newNode.hasChildren()); // No arguments
    }

    @Test
    public void testTransformTree_functionCall() throws Exception {
        String source = "foo(1, 'a')";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for FunctionCall and Name
        FunctionCall fc = new FunctionCall(new Name("foo", 0, 0));
        fc.addArgument(new NumberLiteral(1.0));
        fc.addArgument(new StringLiteral("'a'"));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(fc));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node callNode = exprStatement.getFirstChild();
        assertEquals(Token.CALL, callNode.getType());
        assertEquals("foo", callNode.getFirstChild().getString());
        assertEquals(2, callNode.getChildCount() - 1); // Exclude target
        assertEquals(1.0, callNode.getChildAtIndex(1).getDouble(), 0.0);
        assertEquals("a", callNode.getChildAtIndex(2).getString());
    }

    @Test
    public void testTransformTree_propertyGet() throws Exception {
        String source = "obj.prop";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for PropertyGet and Names
        PropertyGet pg = new PropertyGet(new Name("obj", 0, 0), new Name("prop", 0, 0));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(pg));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node propGetNode = exprStatement.getFirstChild();
        assertEquals(Token.GETPROP, propGetNode.getType());
        assertEquals("obj", propGetNode.getFirstChild().getString());
        assertEquals("prop", propGetNode.getChildAtIndex(1).getString());
    }

    @Test
    public void testTransformTree_elementGet() throws Exception {
        String source = "obj[prop]";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for ElementGet and Names
        ElementGet eg = new ElementGet(new Name("obj", 0, 0), new Name("prop", 0, 0));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(eg));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node elemGetNode = exprStatement.getFirstChild();
        assertEquals(Token.GETELEM, elemGetNode.getType());
        assertEquals("obj", elemGetNode.getFirstChild().getString());
        assertEquals("prop", elemGetNode.getChildAtIndex(1).getString());
    }

    @Test
    public void testTransformTree_objectLiteral() throws Exception {
        String source = "({ a: 1, b: 'str' })";
        AstRoot astRoot = createAstRoot(source);
        ObjectLiteral ol = new ObjectLiteral();
        // Corrected constructor for ObjectProperty and Names
        ObjectProperty op1 = new ObjectProperty(new Name("a", 0, 0), new NumberLiteral(1.0));
        ObjectProperty op2 = new ObjectProperty(new Name("b", 0, 0), new StringLiteral("'str'"));
        ol.addElement(op1);
        ol.addElement(op2);
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(ol));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node objLitNode = exprStatement.getFirstChild();
        assertEquals(Token.OBJECTLIT, objLitNode.getType());
        Node prop1 = objLitNode.getFirstChild();
        assertEquals(Token.STRING, prop1.getType()); // Key is STRING
        assertEquals("a", prop1.getString());
        assertEquals(Token.NUMBER, prop1.getChildAtIndex(1).getType());
        assertEquals(1.0, prop1.getChildAtIndex(1).getDouble(), 0.0);
        Node prop2 = objLitNode.getChildAtIndex(1);
        assertEquals(Token.STRING, prop2.getType());
        assertEquals("b", prop2.getString());
        assertEquals(Token.STRING, prop2.getChildAtIndex(1).getType());
        assertEquals("str", prop2.getChildAtIndex(1).getString());
    }

    @Test
    public void testTransformTree_arrayLiteral() throws Exception {
        String source = "[1, 'a', true]";
        AstRoot astRoot = createAstRoot(source);
        ArrayLiteral al = new ArrayLiteral();
        // Corrected use of addElem and KeywordLiteral for true
        al.addElem(new NumberLiteral(1.0));
        al.addElem(new StringLiteral("'a'"));
        al.addElem(new KeywordLiteral(com.google.javascript.rhino.head.Token.TRUE));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(al));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node arrLitNode = exprStatement.getFirstChild();
        assertEquals(Token.ARRAYLIT, arrLitNode.getType());
        assertEquals(Token.NUMBER, arrLitNode.getFirstChild().getType());
        assertEquals(1.0, arrLitNode.getFirstChild().getDouble(), 0.0);
        assertEquals(Token.STRING, arrLitNode.getChildAtIndex(1).getType());
        assertEquals("a", arrLitNode.getChildAtIndex(1).getString());
        assertEquals(Token.TRUE, arrLitNode.getChildAtIndex(2).getType());
    }

    @Test
    public void testTransformTree_unaryExpression_negation() throws Exception {
        String source = "-5;";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for UnaryExpression and NumberLiteral
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(new UnaryExpression(com.google.javascript.rhino.head.Token.NEG, new NumberLiteral(5.0))));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node negNode = exprStatement.getFirstChild();
        assertEquals(Token.NEG, negNode.getType());
        assertEquals(5.0, negNode.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_unaryExpression_postfixIncrement() throws Exception {
        String source = "x++;";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for UnaryExpression and Name
        UnaryExpression ue = new UnaryExpression(com.google.javascript.rhino.head.Token.INC, new Name("x", 0, 0));
        ue.setPostfix(true);
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(ue));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node incNode = exprStatement.getFirstChild();
        assertEquals(Token.INC, incNode.getType());
        assertTrue(incNode.getBooleanProp(Node.INCRDECR_PROP)); // Check for POSTFIX_FLAG
        assertEquals("x", incNode.getFirstChild().getString());
    }

    @Test
    public void testTransformTree_binaryExpression_add() throws Exception {
        String source = "1 + 2;";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for InfixExpression
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(new InfixExpression(com.google.javascript.rhino.head.Token.ADD, new NumberLiteral(1.0), new NumberLiteral(2.0))));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node addNode = exprStatement.getFirstChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals(1.0, addNode.getFirstChild().getDouble(), 0.0);
        assertEquals(2.0, addNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_parenthesizedExpression() throws Exception {
        String source = "(1 + 2);";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for ParenthesizedExpression and InfixExpression
        ParenthesizedExpression pe = new ParenthesizedExpression(new InfixExpression(com.google.javascript.rhino.head.Token.ADD, new NumberLiteral(1.0), new NumberLiteral(2.0)));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(pe));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node resultNode = exprStatement.getFirstChild();
        // The expression inside the parentheses is transformed, and the PARENTHESIZED_PROP is set.
        assertEquals(Token.ADD, resultNode.getType());
        assertTrue(resultNode.getBooleanProp(Node.PARENTHESIZED_PROP));
        assertEquals(1.0, resultNode.getFirstChild().getDouble(), 0.0);
        assertEquals(2.0, resultNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_stringLiteral() throws Exception {
        String source = "'hello';";
        AstRoot astRoot = createAstRoot(source);
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(new StringLiteral("'hello'")));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node stringNode = exprStatement.getFirstChild();
        assertEquals(Token.STRING, stringNode.getType());
        assertEquals("hello", stringNode.getString());
    }

    @Test
    public void testTransformTree_numberLiteral() throws Exception {
        String source = "123.45;";
        AstRoot astRoot = createAstRoot(source);
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(new NumberLiteral(123.45)));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node numberNode = exprStatement.getFirstChild();
        assertEquals(Token.NUMBER, numberNode.getType());
        assertEquals(123.45, numberNode.getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_booleanLiteral_true() throws Exception {
        String source = "true;";
        AstRoot astRoot = createAstRoot(source);
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(new KeywordLiteral(com.google.javascript.rhino.head.Token.TRUE)));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node trueNode = exprStatement.getFirstChild();
        assertEquals(Token.TRUE, trueNode.getType());
    }

    @Test
    public void testTransformTree_booleanLiteral_false() throws Exception {
        String source = "false;";
        AstRoot astRoot = createAstRoot(source);
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(new KeywordLiteral(com.google.javascript.rhino.head.Token.FALSE)));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node falseNode = exprStatement.getFirstChild();
        assertEquals(Token.FALSE, falseNode.getType());
    }

    @Test
    public void testTransformTree_nullLiteral() throws Exception {
        String source = "null;";
        AstRoot astRoot = createAstRoot(source);
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(new KeywordLiteral(com.google.javascript.rhino.head.Token.NULL)));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node nullNode = exprStatement.getFirstChild();
        assertEquals(Token.NULL, nullNode.getType());
    }

    @Test
    public void testTransformTree_thisKeyword() throws Exception {
        String source = "this;";
        AstRoot astRoot = createAstRoot(source);
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(new KeywordLiteral(com.google.javascript.rhino.head.Token.THIS)));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node thisNode = exprStatement.getFirstChild();
        assertEquals(Token.THIS, thisNode.getType());
    }

    @Test
    public void testTransformTree_emptyExpression() throws Exception {
        String source = ";";
        AstRoot astRoot = createAstRoot(source);
        astRoot.getFirstChild().addChildToBack(new EmptyExpression());
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node emptyNode = irNode.getFirstChild();
        assertEquals(Token.EMPTY, emptyNode.getType());
    }

    @Test
    public void testTransformTree_labeledStatement() throws Exception {
        String source = "label: 1;";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for LabeledStatement, Label, and ExpressionStatement
        LabeledStatement ls = new LabeledStatement(new Label("label", 0, 0), new ExpressionStatement(new NumberLiteral(1.0)));
        astRoot.getFirstChild().addChildToBack(ls);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node labelNode = irNode.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        assertEquals("label", labelNode.getFirstChild().getString()); // LABEL_NAME
        assertEquals(Token.EXPR_RESULT, labelNode.getChildAtIndex(1).getType());
        assertEquals(1.0, labelNode.getChildAtIndex(1).getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_breakStatement() throws Exception {
        String source = "break;";
        AstRoot astRoot = createAstRoot(source);
        astRoot.getFirstChild().addChildToBack(new BreakStatement());
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node breakNode = irNode.getFirstChild();
        assertEquals(Token.BREAK, breakNode.getType());
    }

    @Test
    public void testTransformTree_continueStatement() throws Exception {
        String source = "continue;";
        AstRoot astRoot = createAstRoot(source);
        astRoot.getFirstChild().addChildToBack(new ContinueStatement());
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node continueNode = irNode.getFirstChild();
        assertEquals(Token.CONTINUE, continueNode.getType());
    }

    @Test
    public void testTransformTree_withStatement() throws Exception {
        String source = "with(obj) { 1; }";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for WithStatement, Name, and Block
        WithStatement ws = new WithStatement(new Name("obj", 0, 0), new Block());
        ws.getStatement().addStatement(new ExpressionStatement(new NumberLiteral(1.0)));
        astRoot.getFirstChild().addChildToBack(ws);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node withNode = irNode.getFirstChild();
        assertEquals(Token.WITH, withNode.getType());
        assertEquals("obj", withNode.getFirstChild().getString());
        assertEquals(Token.BLOCK, withNode.getChildAtIndex(1).getType());
        assertEquals(Token.EXPR_RESULT, withNode.getChildAtIndex(1).getFirstChild().getType());
        assertEquals(1.0, withNode.getChildAtIndex(1).getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_regexpLiteral() throws Exception {
        String source = "/abc/g;";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for RegExpLiteral
        RegExpLiteral rl = new RegExpLiteral("/abc/g");
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(rl));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node regexpNode = exprStatement.getFirstChild();
        assertEquals(Token.REGEXP, regexpNode.getType());
        assertEquals("abc", regexpNode.getFirstChild().getString());
        assertEquals("g", regexpNode.getChildAtIndex(1).getString());
    }

    @Test
    public void testTransformTree_doLoop() throws Exception {
        String source = "do { 1; } while(true);";
        AstRoot astRoot = createAstRoot(source);
        DoLoop dl = new DoLoop();
        dl.setBody(new Block());
        // Corrected use of addStatement
        dl.getBody().addStatement(new ExpressionStatement(new NumberLiteral(1.0)));
        dl.setCondition(new KeywordLiteral(com.google.javascript.rhino.head.Token.TRUE));
        astRoot.getFirstChild().addChildToBack(dl);
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node doNode = irNode.getFirstChild();
        assertEquals(Token.DO, doNode.getType());
        assertEquals(Token.BLOCK, doNode.getFirstChild().getType());
        assertEquals(Token.EXPR_RESULT, doNode.getFirstChild().getFirstChild().getType());
        assertEquals(1.0, doNode.getFirstChild().getFirstChild().getFirstChild().getDouble(), 0.0);
        assertEquals(Token.TRUE, doNode.getChildAtIndex(1).getType());
    }

    @Test
    public void testTransformTree_assignment() throws Exception {
        String source = "x = 1;";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for Assignment, Name, and NumberLiteral
        Assignment assignment = new Assignment(com.google.javascript.rhino.head.Token.ASSIGN, new Name("x", 0, 0), new NumberLiteral(1.0));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(assignment));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node assignNode = exprStatement.getFirstChild();
        assertEquals(Token.ASSIGN, assignNode.getType());
        assertEquals("x", assignNode.getFirstChild().getString());
        assertEquals(1.0, assignNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_conditionalExpression() throws Exception {
        String source = "a ? b : c;";
        AstRoot astRoot = createAstRoot(source);
        // Corrected constructor for ConditionalExpression and Names
        ConditionalExpression ce = new ConditionalExpression(new Name("a", 0, 0), new Name("b", 0, 0), new Name("c", 0, 0));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(ce));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node hookNode = exprStatement.getFirstChild();
        assertEquals(Token.HOOK, hookNode.getType());
        assertEquals("a", hookNode.getFirstChild().getString());
        assertEquals("b", hookNode.getChildAtIndex(1).getString());
        assertEquals("c", hookNode.getChildAtIndex(2).getString());
    }

    @Test
    public void testTransformTree_getterInObjectLiteral() throws Exception {
        String source = "({ get a() { return 1; } })";
        AstRoot astRoot = createAstRoot(source);
        ObjectLiteral ol = new ObjectLiteral();
        // Corrected constructor for FunctionNode and Name, use of setGetter
        FunctionNode getter = new FunctionNode(new Name("a", 0, 0));
        getter.setGetter(true);
        Block body = new Block();
        // Corrected constructor for ReturnStatement and NumberLiteral
        body.addStatement(new ReturnStatement(new NumberLiteral(1.0)));
        getter.setBody(body);
        // Corrected constructor for ObjectProperty and Name
        ObjectProperty op = new ObjectProperty(new Name("a", 0, 0), getter);
        op.setGetter(true); // Mark as getter
        ol.addElement(op);
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(ol));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        Node objLitNode = irNode.getFirstChild().getFirstChild();
        Node getterDefNode = objLitNode.getFirstChild();
        assertEquals(Token.GETTER_DEF, getterDefNode.getType());
        assertEquals("a", getterDefNode.getFirstChild().getString()); // The value (function) is attached to the key
        assertTrue(getterDefNode.getChildAtIndex(1).isFunction()); // The transformed function
    }

    @Test
    public void testTransformTree_setterInObjectLiteral() throws Exception {
        String source = "({ set a(v) { this.v = v; } })";
        AstRoot astRoot = createAstRoot(source);
        ObjectLiteral ol = new ObjectLiteral();
        // Corrected constructor for FunctionNode and Name, use of setSetter
        FunctionNode setter = new FunctionNode(new Name("a", 0, 0));
        setter.setSetter(true);
        Block body = new Block();
        // Set this.v = v
        // Corrected constructor for Assignment, PropertyGet, KeywordLiteral, Name, and Name
        body.addStatement(new ExpressionStatement(
            new Assignment(com.google.javascript.rhino.head.Token.ASSIGN,
                           new PropertyGet(new KeywordLiteral(com.google.javascript.rhino.head.Token.THIS), new Name("v", 0, 0)),
                           new Name("v", 0, 0))));
        setter.setBody(body);
        // Corrected constructor for ObjectProperty and Name
        ObjectProperty op = new ObjectProperty(new Name("a", 0, 0), setter);
        op.setSetter(true); // Mark as setter
        ol.addElement(op);
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(ol));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        Node objLitNode = irNode.getFirstChild().getFirstChild();
        Node setterDefNode = objLitNode.getFirstChild();
        assertEquals(Token.SETTER_DEF, setterDefNode.getType());
        assertEquals("a", setterDefNode.getFirstChild().getString()); // The value (function) is attached to the key
        assertTrue(setterDefNode.getChildAtIndex(1).isFunction()); // The transformed function
    }

    @Test
    public void testTransformTree_constDeclaration() throws Exception {
        String source = "const x = 1;";
        AstRoot astRoot = createAstRoot(source);
        VariableDeclaration vd = new VariableDeclaration(com.google.javascript.rhino.head.Token.CONST);
        // Corrected constructor for Name and use of addVariable
        vd.addVariable(new VariableInitializer(new Name("x", 0, 0), new NumberLiteral(1.0)));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(vd));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true); // acceptConstKeyword = true
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node constNode = exprStatement.getFirstChild();
        assertEquals(Token.CONST, constNode.getType()); // Should be CONST token
        Node constInitializer = constNode.getFirstChild();
        // BINDING_CONST is not a Token type.
        assertEquals("x", constInitializer.getString());
        assertEquals(1.0, constInitializer.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_constDeclaration_notAccepted() throws Exception {
        String source = "const x = 1;";
        AstRoot astRoot = createAstRoot(source);
        VariableDeclaration vd = new VariableDeclaration(com.google.javascript.rhino.head.Token.CONST);
        // Corrected constructor for Name and use of addVariable
        vd.addVariable(new VariableInitializer(new Name("x", 0, 0), new NumberLiteral(1.0)));
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(vd));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, false); // acceptConstKeyword = false
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        // The error reporter should have been called, and an EMPTY node returned for the illegal token.
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node illegalTokenNode = exprStatement.getFirstChild();
        assertEquals(Token.EMPTY, illegalTokenNode.getType()); // Should be EMPTY because illegal token
    }

    @Test
    public void testTransformTree_stringWithSlashV() throws Exception {
        String source = "'hello\\vworld';";
        AstRoot astRoot = createAstRoot(source);
        StringLiteral sl = new StringLiteral("'hello\\vworld'");
        sl.setLength(source.length() - 1); // Set length to match the string
        astRoot.getFirstChild().addChildToBack(new ExpressionStatement(sl));
        Config config = createConfig(LanguageMode.ECMASCRIPT5, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprStatement = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprStatement.getType());
        Node stringNode = exprStatement.getFirstChild();
        assertEquals(Token.STRING, stringNode.getType());
        assertEquals("hello\u000Bworld", stringNode.getString());
        assertTrue(stringNode.getBooleanProp(Node.SLASH_V));
    }

    @Test
    public void testTransformTree_directiveUseStrict() throws Exception {
        String source = "'use strict'; function foo() {}";
        AstRoot astRoot = createAstRoot(source);
        // Simulate the AST structure for a directive
        StringLiteral directive = new StringLiteral("'use strict'");
        ExpressionStatement esDirective = new ExpressionStatement(directive);

        FunctionNode fn = new FunctionNode(new Name("foo", 0, 0));
        fn.setBody(new Block());

        // The IRFactory processes statements sequentially.
        // For directives, they are handled when processing the Script node.
        // We need to construct a valid AST structure that IRFactory can process.
        // Let's create a Block that contains the directive and the function.
        Block scriptBody = new Block();
        scriptBody.addStatement(esDirective); // Add directive statement
        scriptBody.addStatement(fn);          // Add function statement

        astRoot.addChildToBack(scriptBody); // Add the block as the child of the root.

        Config config = createConfig(LanguageMode.ECMASCRIPT5_STRICT, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(astRoot, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());

        // The 'use strict' directive should be set on the script node.
        // The IRFactory's parseDirectives method is called within transformDispatcher.processAstRoot.
        // This method looks for the first few statements as directives.
        assertTrue(irNode.hasOwn(Node.DIRECTIVES));
        Set<String> directives = (Set<String>) irNode.getProp(Node.DIRECTIVES);
        assertNotNull(directives);
        assertEquals(1, directives.size());
        assertTrue(directives.contains("use strict"));

        // The function node should be a direct child of the script node, after the directive.
        // The directive statement itself is consumed and not present as a child of the script node.
        assertEquals(Token.FUNCTION, irNode.getFirstChild().getType());
    }
}
```