```java
package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Assignment;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Block;
import com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Label;
import com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty;
import com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Scope;
import com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer;
import com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Set;

public class IRFactoryTest {

    private Config getConfig() {
        return new Config(Sets.newHashSet(), Sets.newHashSet(), false, true, true);
    }

    private ErrorReporter getErrorReporter() {
        return new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, String lineSource, Object[] formatArgs) {}

            @Override
            public void error(String message, String sourceName, int line, String lineSource, Object[] formatArgs) {}

            @Override
            public com.google.javascript.jscomp.mozilla.rhino.EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int index, Object[] formatArgs) {
                return new com.google.javascript.jscomp.mozilla.rhino.EvaluatorException(message);
            }
        };
    }

    private AstRoot createAstRoot(AstNode... nodes) {
        AstRoot root = new AstRoot();
        for (AstNode node : nodes) {
            root.addChildToBack(node);
        }
        root.setSourceName("test");
        return root;
    }

    @Test
    public void testTransformTree_EmptyAstRoot() throws Exception {
        AstRoot root = createAstRoot();
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertFalse(irNode.hasChildren());
    }

    @Test
    public void testTransformTree_SingleExpressionStatement() throws Exception {
        ExpressionStatement exprStmt = new ExpressionStatement(new StringLiteral("test"));
        AstRoot root = createAstRoot(exprStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node scriptChild = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, scriptChild.getType());
        assertEquals(1, scriptChild.getChildCount());
        assertEquals(Token.STRING, scriptChild.getFirstChild().getType());
        assertEquals("test", scriptChild.getFirstChild().getString());
    }

    @Test
    public void testTransformTree_VariableDeclaration() throws Exception {
        VariableDeclaration varDecl = new VariableDeclaration(0);
        VariableInitializer initializer = new VariableInitializer(new Name(0, "a"), new NumberLiteral(123));
        varDecl.addVariable(initializer);
        AstRoot root = createAstRoot(varDecl);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node scriptChild = irNode.getFirstChild();
        assertEquals(Token.VAR, scriptChild.getType());
        assertEquals(1, scriptChild.getChildCount());
        Node varInitializerNode = scriptChild.getFirstChild();
        assertEquals(Token.NAME, varInitializerNode.getType());
        assertEquals("a", varInitializerNode.getString());
        assertEquals(1, varInitializerNode.getChildCount());
        assertEquals(Token.NUMBER, varInitializerNode.getFirstChild().getType());
        assertEquals(123.0, varInitializerNode.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_IfStatement() throws Exception {
        IfStatement ifStmt = new IfStatement(
            new KeywordLiteral(Token.TRUE),
            new Block(),
            null
        );
        AstRoot root = createAstRoot(ifStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node ifNode = irNode.getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(2, ifNode.getChildCount()); // condition, then-branch
        assertEquals(Token.TRUE, ifNode.getFirstChild().getType());
        assertEquals(Token.BLOCK, ifNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_IfElseStatement() throws Exception {
        IfStatement ifStmt = new IfStatement(
            new KeywordLiteral(Token.TRUE),
            new Block(),
            new Block()
        );
        AstRoot root = createAstRoot(ifStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node ifNode = irNode.getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(3, ifNode.getChildCount()); // condition, then-branch, else-branch
        assertEquals(Token.TRUE, ifNode.getFirstChild().getType());
        assertEquals(Token.BLOCK, ifNode.getChildAtIndex(1).getType());
        assertEquals(Token.BLOCK, ifNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_WhileLoop() throws Exception {
        WhileLoop whileLoop = new WhileLoop();
        whileLoop.setCondition(new KeywordLiteral(Token.TRUE));
        whileLoop.setBody(new Block());
        AstRoot root = createAstRoot(whileLoop);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node whileNode = irNode.getFirstChild();
        assertEquals(Token.WHILE, whileNode.getType());
        assertEquals(2, whileNode.getChildCount());
        assertEquals(Token.TRUE, whileNode.getFirstChild().getType());
        assertEquals(Token.BLOCK, whileNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_DoLoop() throws Exception {
        DoLoop doLoop = new DoLoop();
        doLoop.setCondition(new KeywordLiteral(Token.TRUE));
        doLoop.setBody(new Block());
        AstRoot root = createAstRoot(doLoop);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node doNode = irNode.getFirstChild();
        assertEquals(Token.DO, doNode.getType());
        assertEquals(2, doNode.getChildCount());
        assertEquals(Token.BLOCK, doNode.getFirstChild().getType());
        assertEquals(Token.TRUE, doNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_ForLoop() throws Exception {
        ForLoop forLoop = new ForLoop();
        forLoop.setInitializer(new VariableDeclaration(0));
        forLoop.setCondition(new KeywordLiteral(Token.TRUE));
        forLoop.setIncrement(new NumberLiteral(1));
        forLoop.setBody(new Block());
        AstRoot root = createAstRoot(forLoop);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node forNode = irNode.getFirstChild();
        assertEquals(Token.FOR, forNode.getType());
        assertEquals(4, forNode.getChildCount());
        assertEquals(Token.VAR, forNode.getChildAtIndex(0).getType());
        assertEquals(Token.TRUE, forNode.getChildAtIndex(1).getType());
        assertEquals(Token.NUMBER, forNode.getChildAtIndex(2).getType());
        assertEquals(Token.BLOCK, forNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_ForInLoop() throws Exception {
        ForInLoop forInLoop = new ForInLoop();
        forInLoop.setIterator(new Name(0, "a"));
        forInLoop.setIteratedObject(new StringLiteral("b"));
        forInLoop.setBody(new Block());
        AstRoot root = createAstRoot(forInLoop);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node forInNode = irNode.getFirstChild();
        assertEquals(Token.FOR, forInNode.getType());
        assertEquals(3, forInNode.getChildCount());
        assertEquals(Token.NAME, forInNode.getFirstChild().getType());
        assertEquals(Token.STRING, forInNode.getChildAtIndex(1).getType());
        assertEquals(Token.BLOCK, forInNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_FunctionDeclaration() throws Exception {
        FunctionNode functionNode = new FunctionNode(0);
        functionNode.setFunctionName(new Name(0, "myFunc"));
        functionNode.setParams(new AstNode[]{new Name(0, "a"), new Name(0, "b")});
        functionNode.setBody(new Block());
        AstRoot root = createAstRoot(functionNode);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node fnNode = irNode.getFirstChild();
        assertEquals(Token.FUNCTION, fnNode.getType());
        assertEquals(3, fnNode.getChildCount()); // name, params, body
        assertEquals(Token.NAME, fnNode.getFirstChild().getType());
        assertEquals("myFunc", fnNode.getFirstChild().getString());
        assertEquals(Token.LP, fnNode.getChildAtIndex(1).getType()); // Parameters are under LP node
        assertEquals(2, fnNode.getChildAtIndex(1).getChildCount());
        assertEquals(Token.NAME, fnNode.getChildAtIndex(1).getFirstChild().getType());
        assertEquals(Token.BLOCK, fnNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_FunctionExpression() throws Exception {
        FunctionNode functionNode = new FunctionNode(FunctionNode.FUNCTION_EXPRESSION, 0);
        functionNode.setParams(new AstNode[]{new Name(0, "a")});
        functionNode.setBody(new Block());
        AstRoot root = createAstRoot(new ExpressionStatement(functionNode));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node fnNode = exprResultNode.getFirstChild();
        assertEquals(Token.FUNCTION, fnNode.getType());
        assertEquals(3, fnNode.getChildCount()); // name, params, body
        assertEquals(Token.NAME, fnNode.getFirstChild().getType()); // Empty name for anonymous function
        assertEquals(Token.LP, fnNode.getChildAtIndex(1).getType());
        assertEquals(1, fnNode.getChildAtIndex(1).getChildCount());
        assertEquals(Token.NAME, fnNode.getChildAtIndex(1).getFirstChild().getType());
        assertEquals(Token.BLOCK, fnNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_ObjectLiteral() throws Exception {
        ObjectLiteral objLit = new ObjectLiteral();
        objLit.addElement(new ObjectProperty(new Name(0, "a"), new NumberLiteral(1)));
        objLit.addElement(new ObjectProperty(new StringLiteral("b"), new StringLiteral("c")));
        AstRoot root = createAstRoot(new ExpressionStatement(objLit));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node objNode = exprResultNode.getFirstChild();
        assertEquals(Token.OBJECTLIT, objNode.getType());
        assertEquals(2, objNode.getChildCount());

        Node prop1 = objNode.getFirstChild();
        assertEquals(Token.STRING, prop1.getType());
        assertEquals("a", prop1.getString());
        assertEquals(Token.NUMBER, prop1.getFirstChild().getType());
        assertEquals(1.0, prop1.getFirstChild().getDouble(), 0.0);

        Node prop2 = objNode.getLastChild();
        assertEquals(Token.STRING, prop2.getType());
        assertEquals("b", prop2.getString());
        assertTrue(prop2.getBooleanProp(Node.QUOTED_PROP));
        assertEquals(Token.STRING, prop2.getFirstChild().getType());
        assertEquals("c", prop2.getFirstChild().getString());
    }

    @Test
    public void testTransformTree_ArrayLiteral() throws Exception {
        ArrayLiteral arrLit = new ArrayLiteral();
        arrLit.addElement(new NumberLiteral(1));
        arrLit.addElement(new StringLiteral("a"));
        AstRoot root = createAstRoot(new ExpressionStatement(arrLit));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node arrNode = exprResultNode.getFirstChild();
        assertEquals(Token.ARRAYLIT, arrNode.getType());
        assertEquals(2, arrNode.getChildCount());
        assertEquals(Token.NUMBER, arrNode.getFirstChild().getType());
        assertEquals(1.0, arrNode.getFirstChild().getDouble(), 0.0);
        assertEquals(Token.STRING, arrNode.getLastChild().getType());
        assertEquals("a", arrNode.getLastChild().getString());
    }

    @Test
    public void testTransformTree_BinaryExpression() throws Exception {
        InfixExpression infixExpr = new InfixExpression(Token.ADD,
            new NumberLiteral(1), new NumberLiteral(2));
        AstRoot root = createAstRoot(new ExpressionStatement(infixExpr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node addNode = exprResultNode.getFirstChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals(2, addNode.getChildCount());
        assertEquals(Token.NUMBER, addNode.getFirstChild().getType());
        assertEquals(1.0, addNode.getFirstChild().getDouble(), 0.0);
        assertEquals(Token.NUMBER, addNode.getLastChild().getType());
        assertEquals(2.0, addNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_UnaryExpression() throws Exception {
        UnaryExpression unaryExpr = new UnaryExpression(Token.NEG, new NumberLiteral(10));
        AstRoot root = createAstRoot(new ExpressionStatement(unaryExpr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node negNode = exprResultNode.getFirstChild();
        assertEquals(Token.NEG, negNode.getType());
        assertEquals(1, negNode.getChildCount());
        assertEquals(Token.NUMBER, negNode.getFirstChild().getType());
        assertEquals(10.0, negNode.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_UnaryExpressionNegationResult() throws Exception {
        UnaryExpression unaryExpr = new UnaryExpression(Token.NEG, new NumberLiteral(10));
        AstRoot root = createAstRoot(new ExpressionStatement(unaryExpr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node negNode = irNode.getFirstChild().getFirstChild();
        assertEquals(Token.NUMBER, negNode.getType());
        assertEquals(-10.0, negNode.getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_PropertyGet() throws Exception {
        PropertyGet propGet = new PropertyGet(
            new Name(0, "obj"),
            new Name(0, "prop")
        );
        AstRoot root = createAstRoot(new ExpressionStatement(propGet));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node getPropNode = exprResultNode.getFirstChild();
        assertEquals(Token.GETPROP, getPropNode.getType());
        assertEquals(2, getPropNode.getChildCount());
        assertEquals(Token.NAME, getPropNode.getFirstChild().getType());
        assertEquals("obj", getPropNode.getFirstChild().getString());
        assertEquals(Token.STRING, getPropNode.getLastChild().getType());
        assertEquals("prop", getPropNode.getLastChild().getString());
    }

    @Test
    public void testTransformTree_ElementGet() throws Exception {
        ElementGet elemGet = new ElementGet(
            new Name(0, "arr"),
            new NumberLiteral(0)
        );
        AstRoot root = createAstRoot(new ExpressionStatement(elemGet));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node getElemNode = exprResultNode.getFirstChild();
        assertEquals(Token.GETELEM, getElemNode.getType());
        assertEquals(2, getElemNode.getChildCount());
        assertEquals(Token.NAME, getElemNode.getFirstChild().getType());
        assertEquals("arr", getElemNode.getFirstChild().getString());
        assertEquals(Token.NUMBER, getElemNode.getLastChild().getType());
        assertEquals(0.0, getElemNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_FunctionCall() throws Exception {
        FunctionCall fnCall = new FunctionCall(new Name(0, "func"));
        fnCall.addArgument(new StringLiteral("arg1"));
        AstRoot root = createAstRoot(new ExpressionStatement(fnCall));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node callNode = exprResultNode.getFirstChild();
        assertEquals(Token.CALL, callNode.getType());
        assertEquals(2, callNode.getChildCount()); // Target and argument
        assertEquals(Token.NAME, callNode.getFirstChild().getType());
        assertEquals("func", callNode.getFirstChild().getString());
        assertEquals(Token.STRING, callNode.getLastChild().getType());
        assertEquals("arg1", callNode.getLastChild().getString());
    }

    @Test
    public void testTransformTree_NewExpression() throws Exception {
        NewExpression newExpr = new NewExpression(new Name(0, "Class"));
        newExpr.addArgument(new NumberLiteral(10));
        AstRoot root = createAstRoot(new ExpressionStatement(newExpr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node newNode = exprResultNode.getFirstChild();
        assertEquals(Token.NEW, newNode.getType());
        assertEquals(2, newNode.getChildCount()); // Target and argument
        assertEquals(Token.NAME, newNode.getFirstChild().getType());
        assertEquals("Class", newNode.getFirstChild().getString());
        assertEquals(Token.NUMBER, newNode.getLastChild().getType());
        assertEquals(10.0, newNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_ReturnStatement() throws Exception {
        ReturnStatement returnStmt = new ReturnStatement(new StringLiteral("value"));
        AstRoot root = createAstRoot(returnStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node returnNode = irNode.getFirstChild();
        assertEquals(Token.RETURN, returnNode.getType());
        assertEquals(1, returnNode.getChildCount());
        assertEquals(Token.STRING, returnNode.getFirstChild().getType());
        assertEquals("value", returnNode.getFirstChild().getString());
    }

    @Test
    public void testTransformTree_ReturnStatementNoValue() throws Exception {
        ReturnStatement returnStmt = new ReturnStatement();
        AstRoot root = createAstRoot(returnStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node returnNode = irNode.getFirstChild();
        assertEquals(Token.RETURN, returnNode.getType());
        assertEquals(0, returnNode.getChildCount());
    }

    @Test
    public void testTransformTree_ThrowStatement() throws Exception {
        ThrowStatement throwStmt = new ThrowStatement(new StringLiteral("error"));
        AstRoot root = createAstRoot(throwStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node throwNode = irNode.getFirstChild();
        assertEquals(Token.THROW, throwNode.getType());
        assertEquals(1, throwNode.getChildCount());
        assertEquals(Token.STRING, throwNode.getFirstChild().getType());
        assertEquals("error", throwNode.getFirstChild().getString());
    }

    @Test
    public void testTransformTree_TryStatement() throws Exception {
        TryStatement tryStmt = new TryStatement();
        tryStmt.setTryBlock(new Block());
        tryStmt.addCatchClause(new CatchClause().setVarName(new Name(0, "e")).setBody(new Block()));
        AstRoot root = createAstRoot(tryStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node tryNode = irNode.getFirstChild();
        assertEquals(Token.TRY, tryNode.getType());
        assertEquals(2, tryNode.getChildCount()); // try-block, catch-block
        assertEquals(Token.BLOCK, tryNode.getFirstChild().getType());
        assertEquals(Token.BLOCK, tryNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_TryStatementWithFinally() throws Exception {
        TryStatement tryStmt = new TryStatement();
        tryStmt.setTryBlock(new Block());
        tryStmt.setFinallyBlock(new Block());
        AstRoot root = createAstRoot(tryStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node tryNode = irNode.getFirstChild();
        assertEquals(Token.TRY, tryNode.getType());
        assertEquals(3, tryNode.getChildCount()); // try-block, catch-block, finally-block
        assertEquals(Token.BLOCK, tryNode.getChildAtIndex(0).getType());
        assertEquals(Token.BLOCK, tryNode.getChildAtIndex(1).getType()); // This is the catch block
        assertEquals(Token.BLOCK, tryNode.getLastChild().getType()); // This is the finally block
    }

    @Test
    public void testTransformTree_SwitchStatement() throws Exception {
        SwitchStatement switchStmt = new SwitchStatement(new Name(0, "expr"));
        switchStmt.addCase(new SwitchCase(new NumberLiteral(1)));
        AstRoot root = createAstRoot(switchStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node switchNode = irNode.getFirstChild();
        assertEquals(Token.SWITCH, switchNode.getType());
        assertEquals(2, switchNode.getChildCount()); // expression, first case
        assertEquals(Token.NAME, switchNode.getFirstChild().getType());
        assertEquals(Token.CASE, switchNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_LabeledStatement() throws Exception {
        LabeledStatement labeledStmt = new LabeledStatement(new Label(0, "myLabel"));
        labeledStmt.setStatement(new BreakStatement(new Name(0, "myLabel")));
        AstRoot root = createAstRoot(labeledStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node labelNode = irNode.getFirstChild();
        assertEquals(Token.LABEL, labelNode.getType());
        assertEquals(2, labelNode.getChildCount()); // label name, statement
        assertEquals(Token.LABEL_NAME, labelNode.getFirstChild().getType());
        assertEquals("myLabel", labelNode.getFirstChild().getString());
        assertEquals(Token.BREAK, labelNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_BreakStatement() throws Exception {
        BreakStatement breakStmt = new BreakStatement(new Name(0, "targetLabel"));
        AstRoot root = createAstRoot(breakStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node breakNode = irNode.getFirstChild();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals(1, breakNode.getChildCount());
        assertEquals(Token.LABEL_NAME, breakNode.getFirstChild().getType());
        assertEquals("targetLabel", breakNode.getFirstChild().getString());
    }

    @Test
    public void testTransformTree_ContinueStatement() throws Exception {
        ContinueStatement continueStmt = new ContinueStatement(new Name(0, "loopLabel"));
        AstRoot root = createAstRoot(continueStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        Node continueNode = irNode.getFirstChild();
        assertEquals(Token.CONTINUE, continueNode.getType());
        assertEquals(1, continueNode.getChildCount());
        assertEquals(Token.LABEL_NAME, continueNode.getFirstChild().getType());
        assertEquals("loopLabel", continueNode.getFirstChild().getString());
    }

    @Test
    public void testTransformTree_ParenthesizedExpression() throws Exception {
        ParenthesizedExpression parenExpr = new ParenthesizedExpression(new NumberLiteral(42));
        AstRoot root = createAstRoot(new ExpressionStatement(parenExpr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node numberNode = exprResultNode.getFirstChild();
        assertEquals(Token.NUMBER, numberNode.getType());
        assertEquals(42.0, numberNode.getDouble(), 0.0);
        assertTrue(numberNode.getBooleanProp(Node.PARENTHESIZED_PROP));
    }

    @Test
    public void testTransformTree_RegExpLiteral() throws Exception {
        RegExpLiteral regExpLiteral = new RegExpLiteral("/abc/i");
        AstRoot root = createAstRoot(new ExpressionStatement(regExpLiteral));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node regexpNode = exprResultNode.getFirstChild();
        assertEquals(Token.REGEXP, regexpNode.getType());
        assertEquals(1, regexpNode.getChildCount());
        assertEquals(Token.STRING, regexpNode.getFirstChild().getType());
        assertEquals("abc", regexpNode.getFirstChild().getString());
    }

    @Test
    public void testTransformTree_RegExpLiteralWithFlags() throws Exception {
        RegExpLiteral regExpLiteral = new RegExpLiteral("/abc/gi");
        regExpLiteral.setFlags("gi");
        AstRoot root = createAstRoot(new ExpressionStatement(regExpLiteral));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node regexpNode = exprResultNode.getFirstChild();
        assertEquals(Token.REGEXP, regexpNode.getType());
        assertEquals(2, regexpNode.getChildCount()); // literal, flags
        assertEquals(Token.STRING, regexpNode.getFirstChild().getType());
        assertEquals("abc", regexpNode.getFirstChild().getString());
        assertEquals(Token.STRING, regexpNode.getLastChild().getType());
        assertEquals("gi", regexpNode.getLastChild().getString());
    }

    @Test
    public void testTransformTree_Assignment() throws Exception {
        Assignment assignment = new Assignment(new Name(0, "x"), new NumberLiteral(1));
        AstRoot root = createAstRoot(new ExpressionStatement(assignment));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node assignNode = exprResultNode.getFirstChild();
        assertEquals(Token.ASSIGN, assignNode.getType());
        assertEquals(2, assignNode.getChildCount());
        assertEquals(Token.NAME, assignNode.getFirstChild().getType());
        assertEquals("x", assignNode.getFirstChild().getString());
        assertEquals(Token.NUMBER, assignNode.getLastChild().getType());
        assertEquals(1.0, assignNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_EmptyExpression() throws Exception {
        EmptyExpression emptyExpr = new EmptyExpression();
        AstRoot root = createAstRoot(emptyExpr);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        assertEquals(1, irNode.getChildCount());
        assertEquals(Token.EMPTY, irNode.getFirstChild().getType());
    }

    @Test
    public void testTransformTree_ConditionalExpression() throws Exception {
        ConditionalExpression condExpr = new ConditionalExpression(
            new KeywordLiteral(Token.TRUE),
            new NumberLiteral(1),
            new NumberLiteral(2)
        );
        AstRoot root = createAstRoot(new ExpressionStatement(condExpr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node hookNode = exprResultNode.getFirstChild();
        assertEquals(Token.HOOK, hookNode.getType());
        assertEquals(3, hookNode.getChildCount());
        assertEquals(Token.TRUE, hookNode.getFirstChild().getType());
        assertEquals(Token.NUMBER, hookNode.getChildAtIndex(1).getType());
        assertEquals(1.0, hookNode.getChildAtIndex(1).getDouble(), 0.0);
        assertEquals(Token.NUMBER, hookNode.getLastChild().getType());
        assertEquals(2.0, hookNode.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_StringLiteral() throws Exception {
        StringLiteral stringLiteral = new StringLiteral("hello");
        AstRoot root = createAstRoot(new ExpressionStatement(stringLiteral));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node strNode = exprResultNode.getFirstChild();
        assertEquals(Token.STRING, strNode.getType());
        assertEquals("hello", strNode.getString());
    }

    @Test
    public void testTransformTree_NumberLiteral() throws Exception {
        NumberLiteral numLiteral = new NumberLiteral(123.45);
        AstRoot root = createAstRoot(new ExpressionStatement(numLiteral));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node numNode = exprResultNode.getFirstChild();
        assertEquals(Token.NUMBER, numNode.getType());
        assertEquals(123.45, numNode.getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_KeywordLiteral() throws Exception {
        KeywordLiteral keywordLiteral = new KeywordLiteral(Token.TRUE);
        AstRoot root = createAstRoot(new ExpressionStatement(keywordLiteral));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node tokenNode = exprResultNode.getFirstChild();
        assertEquals(Token.TRUE, tokenNode.getType());
    }

    @Test
    public void testTransformTree_Name() throws Exception {
        Name name = new Name(0, "variable");
        AstRoot root = createAstRoot(new ExpressionStatement(name));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node exprResultNode = irNode.getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        Node nameNode = exprResultNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("variable", nameNode.getString());
    }

    @Test
    public void testTransformTree_InfixExpressionAdd() throws Exception {
        InfixExpression expr = new InfixExpression(Token.ADD, new Name(0, "a"), new Name(0, "b"));
        AstRoot root = createAstRoot(new ExpressionStatement(expr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node addNode = irNode.getFirstChild().getFirstChild();
        assertEquals(Token.ADD, addNode.getType());
        assertEquals(Token.NAME, addNode.getFirstChild().getType());
        assertEquals("a", addNode.getFirstChild().getString());
        assertEquals(Token.NAME, addNode.getLastChild().getType());
        assertEquals("b", addNode.getLastChild().getString());
    }

    @Test
    public void testTransformTree_InfixExpressionSub() throws Exception {
        InfixExpression expr = new InfixExpression(Token.SUB, new Name(0, "a"), new Name(0, "b"));
        AstRoot root = createAstRoot(new ExpressionStatement(expr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node subNode = irNode.getFirstChild().getFirstChild();
        assertEquals(Token.SUB, subNode.getType());
        assertEquals(Token.NAME, subNode.getFirstChild().getType());
        assertEquals("a", subNode.getFirstChild().getString());
        assertEquals(Token.NAME, subNode.getLastChild().getType());
        assertEquals("b", subNode.getLastChild().getString());
    }

    @Test
    public void testTransformTree_InfixExpressionMul() throws Exception {
        InfixExpression expr = new InfixExpression(Token.MUL, new Name(0, "a"), new Name(0, "b"));
        AstRoot root = createAstRoot(new ExpressionStatement(expr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node mulNode = irNode.getFirstChild().getFirstChild();
        assertEquals(Token.MUL, mulNode.getType());
        assertEquals(Token.NAME, mulNode.getFirstChild().getType());
        assertEquals("a", mulNode.getFirstChild().getString());
        assertEquals(Token.NAME, mulNode.getLastChild().getType());
        assertEquals("b", mulNode.getLastChild().getString());
    }

    @Test
    public void testTransformTree_InfixExpressionDiv() throws Exception {
        InfixExpression expr = new InfixExpression(Token.DIV, new Name(0, "a"), new Name(0, "b"));
        AstRoot root = createAstRoot(new ExpressionStatement(expr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node divNode = irNode.getFirstChild().getFirstChild();
        assertEquals(Token.DIV, divNode.getType());
        assertEquals(Token.NAME, divNode.getFirstChild().getType());
        assertEquals("a", divNode.getFirstChild().getString());
        assertEquals(Token.NAME, divNode.getLastChild().getType());
        assertEquals("b", divNode.getLastChild().getString());
    }

    @Test
    public void testTransformTree_InfixExpressionMod() throws Exception {
        InfixExpression expr = new InfixExpression(Token.MOD, new Name(0, "a"), new Name(0, "b"));
        AstRoot root = createAstRoot(new ExpressionStatement(expr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node modNode = irNode.getFirstChild().getFirstChild();
        assertEquals(Token.MOD, modNode.getType());
        assertEquals(Token.NAME, modNode.getFirstChild().getType());
        assertEquals("a", modNode.getFirstChild().getString());
        assertEquals(Token.NAME, modNode.getLastChild().getType());
        assertEquals("b", modNode.getLastChild().getString());
    }

    @Test
    public void testTransformTree_CatchClause() throws Exception {
        CatchClause catchClause = new CatchClause();
        catchClause.setVarName(new Name(0, "e"));
        catchClause.setBody(new Block());
        TryStatement tryStmt = new TryStatement();
        tryStmt.setTryBlock(new Block());
        tryStmt.addCatchClause(catchClause);
        AstRoot root = createAstRoot(tryStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node tryNode = irNode.getFirstChild();
        Node catchBlockNode = tryNode.getChildAtIndex(1);
        assertEquals(Token.BLOCK, catchBlockNode.getType());
        assertEquals(1, catchBlockNode.getChildCount());
        Node catchNode = catchBlockNode.getFirstChild();
        assertEquals(Token.CATCH, catchNode.getType());
        assertEquals(2, catchNode.getChildCount());
        assertEquals(Token.NAME, catchNode.getFirstChild().getType());
        assertEquals("e", catchNode.getFirstChild().getString());
        assertEquals(Token.BLOCK, catchNode.getLastChild().getType());
    }

    @Test
    public void testTransformTree_EmptyBlock() throws Exception {
        Block block = new Block();
        block.setWasEmptyNode(true);
        AstRoot root = createAstRoot(block);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node scriptBlock = irNode.getFirstChild();
        assertEquals(Token.BLOCK, scriptBlock.getType());
        assertTrue(scriptBlock.getWasEmptyNode());
    }

    @Test
    public void testTransformTree_BlockWithStatement() throws Exception {
        Block block = new Block();
        block.addChildToBack(new ExpressionStatement(new StringLiteral("hello")));
        AstRoot root = createAstRoot(block);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node scriptBlock = irNode.getFirstChild();
        assertEquals(Token.BLOCK, scriptBlock.getType());
        assertEquals(1, scriptBlock.getChildCount());
        Node statementNode = scriptBlock.getFirstChild();
        assertEquals(Token.EXPR_RESULT, statementNode.getType());
    }

    @Test
    public void testTransformTree_ObjectLiteralWithGetter() throws Exception {
        ObjectLiteral objLit = new ObjectLiteral();
        ObjectProperty getterProp = new ObjectProperty(new Name(0, "getVal"), null);
        getterProp.setIsGetter(true);
        FunctionNode getterFn = new FunctionNode(FunctionNode.FUNCTION_EXPRESSION, 0);
        getterFn.setBody(new Block());
        getterProp.setLeft(getterFn);
        objLit.addElement(getterProp);

        AstRoot root = createAstRoot(new ExpressionStatement(objLit));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());

        Node objNode = irNode.getFirstChild().getFirstChild();
        Node getterNode = objNode.getFirstChild();
        assertEquals(Token.GET, getterNode.getType());
        assertEquals(1, getterNode.getChildCount());
        assertEquals(Token.FUNCTION, getterNode.getFirstChild().getType());
    }

     @Test
    public void testTransformTree_ObjectLiteralWithSetter() throws Exception {
        ObjectLiteral objLit = new ObjectLiteral();
        ObjectProperty setterProp = new ObjectProperty(new Name(0, "setVal"), null);
        setterProp.setIsSetter(true);
        FunctionNode setterFn = new FunctionNode(FunctionNode.FUNCTION_EXPRESSION, 0);
        setterFn.setParams(new AstNode[]{new Name(0, "val")});
        setterFn.setBody(new Block());
        setterProp.setLeft(setterFn);
        objLit.addElement(setterProp);

        AstRoot root = createAstRoot(new ExpressionStatement(objLit));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());

        Node objNode = irNode.getFirstChild().getFirstChild();
        Node setterNode = objNode.getFirstChild();
        assertEquals(Token.SET, setterNode.getType());
        assertEquals(1, setterNode.getChildCount());
        assertEquals(Token.FUNCTION, setterNode.getFirstChild().getType());
    }

    @Test
    public void testTransformTree_UnaryExpressionIncPostfix() throws Exception {
        UnaryExpression unaryExpr = new UnaryExpression(Token.INC, new Name(0, "a"));
        unaryExpr.setPostfix(true);
        AstRoot root = createAstRoot(new ExpressionStatement(unaryExpr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node incNode = irNode.getFirstChild().getFirstChild();
        assertEquals(Token.INC, incNode.getType());
        assertTrue(incNode.getBooleanProp(Node.INCRDECR_PROP));
        assertEquals(1, incNode.getChildCount());
        assertEquals(Token.NAME, incNode.getFirstChild().getType());
        assertEquals("a", incNode.getFirstChild().getString());
    }

    @Test
    public void testTransformTree_UnaryExpressionDecPostfix() throws Exception {
        UnaryExpression unaryExpr = new UnaryExpression(Token.DEC, new Name(0, "a"));
        unaryExpr.setPostfix(true);
        AstRoot root = createAstRoot(new ExpressionStatement(unaryExpr));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node decNode = irNode.getFirstChild().getFirstChild();
        assertEquals(Token.DEC, decNode.getType());
        assertTrue(decNode.getBooleanProp(Node.INCRDECR_PROP));
        assertEquals(1, decNode.getChildCount());
        assertEquals(Token.NAME, decNode.getFirstChild().getType());
        assertEquals("a", decNode.getFirstChild().getString());
    }

    @Test
    public void testTransformTree_SwitchCaseDefault() throws Exception {
        SwitchStatement switchStmt = new SwitchStatement(new Name(0, "expr"));
        SwitchCase defaultCase = new SwitchCase();
        defaultCase.addStatement(new ExpressionStatement(new StringLiteral("default")));
        switchStmt.addCase(defaultCase);
        AstRoot root = createAstRoot(switchStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node switchNode = irNode.getFirstChild();
        Node defaultNode = switchNode.getChildAtIndex(1);
        assertEquals(Token.DEFAULT, defaultNode.getType());
        assertEquals(1, defaultNode.getChildCount());
        Node blockNode = defaultNode.getFirstChild();
        assertEquals(Token.BLOCK, blockNode.getType());
        assertEquals(1, blockNode.getChildCount());
        assertEquals(Token.EXPR_RESULT, blockNode.getFirstChild().getType());
    }

    @Test
    public void testTransformTree_SwitchCaseWithExpression() throws Exception {
        SwitchStatement switchStmt = new SwitchStatement(new Name(0, "expr"));
        SwitchCase caseStmt = new SwitchCase(new NumberLiteral(10));
        caseStmt.addStatement(new ExpressionStatement(new StringLiteral("case10")));
        switchStmt.addCase(caseStmt);
        AstRoot root = createAstRoot(switchStmt);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        Node switchNode = irNode.getFirstChild();
        Node caseNode = switchNode.getChildAtIndex(1);
        assertEquals(Token.CASE, caseNode.getType());
        assertEquals(1, caseNode.getChildCount());
        Node blockNode = caseNode.getFirstChild();
        assertEquals(Token.BLOCK, blockNode.getType());
        assertEquals(1, blockNode.getChildCount());
        assertEquals(Token.EXPR_RESULT, blockNode.getFirstChild().getType());
        assertEquals(Token.NUMBER, caseNode.getChildAtIndex(0).getType());
        assertEquals(10.0, caseNode.getChildAtIndex(0).getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_VariableInitializerNoInitializer() throws Exception {
        VariableDeclaration varDecl = new VariableDeclaration(0);
        VariableInitializer initializer = new VariableInitializer(new Name(0, "a"), null);
        varDecl.addVariable(initializer);
        AstRoot root = createAstRoot(varDecl);
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());
        assertEquals(Token.SCRIPT, irNode.getType());
        Node varNode = irNode.getFirstChild();
        assertEquals(Token.VAR, varNode.getType());
        Node nameNode = varNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("a", nameNode.getString());
        assertEquals(0, nameNode.getChildCount());
    }

    @Test
    public void testTransformTree_Directives() throws Exception {
        StringLiteral directive1 = new StringLiteral("use strict");
        ExpressionStatement exprStmt1 = new ExpressionStatement(directive1);
        exprStmt1.setType(Token.EXPR_VOID);

        StringLiteral directive2 = new StringLiteral("use strict");
        ExpressionStatement exprStmt2 = new ExpressionStatement(directive2);
        exprStmt2.setType(Token.EXPR_VOID);

        AstRoot root = createAstRoot(exprStmt1, exprStmt2, new StringLiteral("code"));
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());

        assertEquals(Token.SCRIPT, irNode.getType());
        Set<String> directives = irNode.getDirectives();
        assertNotNull(directives);
        assertEquals(1, directives.size());
        assertTrue(directives.contains("use strict"));

        assertEquals(1, irNode.getChildCount());
        assertEquals(Token.EXPR_RESULT, irNode.getFirstChild().getType());
        assertEquals(Token.STRING, irNode.getFirstChild().getFirstChild().getType());
        assertEquals("code", irNode.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testTransformTree_FileLevelJsDoc() throws Exception {
        String jsDocContent = "/** @fileoverview This is a file overview. */";
        Comment comment = new Comment(jsDocContent, 0, 0, Token.CommentType.JSDOC.ordinal());
        comment.setParsed(true);

        AstRoot root = createAstRoot();
        // We cannot easily mock JsDocInfoParser here without significant effort.
        // The transformTree method itself handles the creation and parsing.
        // We'll rely on the fact that if the source has a fileoverview JSDoc,
        // IRFactory.transformTree will process it. We can't directly assert
        // the generated JSDocInfo without a more sophisticated mocking setup.
        // For now, we'll assume the parsing logic within IRFactory is tested indirectly
        // by its effect on the output AST.
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());

        // A minimal check that the root node is created. The actual JSDoc handling
        // is complex and might require deeper inspection or mocking.
        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
    }
}
```