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


    private AstRoot createAstRoot(AstNode... nodes) {
        AstRoot root = new AstRoot();
        for (AstNode node : nodes) {
            root.addChildToBack(node);
        }
        root.setSourceName("test");
        return root;
    }















































    @Test
    public void testTransformTree_BlockWithStatement() throws Exception {
        Block block = new Block();
        block.addChildToBack(new ExpressionStatement(new StringLiteral("hello", 0)));
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
        ObjectProperty getterProp = new ObjectProperty(new Name("getVal", 0), null);
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
        ObjectProperty setterProp = new ObjectProperty(new Name("setVal", 0), null);
        setterProp.setIsSetter(true);
        FunctionNode setterFn = new FunctionNode(FunctionNode.FUNCTION_EXPRESSION, 0);
        setterFn.setParams(new AstNode[]{new Name("val", 0)});
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
        UnaryExpression unaryExpr = new UnaryExpression(Token.INC, new Name("a", 0));
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
        UnaryExpression unaryExpr = new UnaryExpression(Token.DEC, new Name("a", 0));
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
        SwitchStatement switchStmt = new SwitchStatement(new Name("expr", 0));
        SwitchCase defaultCase = new SwitchCase();
        defaultCase.addStatement(new ExpressionStatement(new StringLiteral("default", 0)));
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
        SwitchStatement switchStmt = new SwitchStatement(new Name("expr", 0));
        SwitchCase caseStmt = new SwitchCase(new NumberLiteral(10, 0));
        caseStmt.addStatement(new ExpressionStatement(new StringLiteral("case10", 0)));
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
        VariableInitializer initializer = new VariableInitializer(new Name("a", 0), null);
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
        StringLiteral directive1 = new StringLiteral("use strict", 0);
        ExpressionStatement exprStmt1 = new ExpressionStatement(directive1);
        exprStmt1.setType(Token.EXPR_VOID);

        StringLiteral directive2 = new StringLiteral("use strict", 0);
        ExpressionStatement exprStmt2 = new ExpressionStatement(directive2);
        exprStmt2.setType(Token.EXPR_VOID);

        AstRoot root = createAstRoot(exprStmt1, exprStmt2, new StringLiteral("code", 0));
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
        Node irNode = IRFactory.transformTree(root, "", getConfig(), getErrorReporter());

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());
    }
}





