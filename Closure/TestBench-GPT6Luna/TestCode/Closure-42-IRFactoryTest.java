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
import java.util.Set;

public class IRFactoryTest {
    @Test
    public void testEmptyTreeProducesScript() throws Exception {
        AstRoot root = new AstRoot();
        Node result = IRFactory.transformTree(root, null, "", config(), null);
        assertEquals(Token.SCRIPT, result.getType());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testNameExpressionIsPreserved() throws Exception {
        AstRoot root = new AstRoot();
        Name name = new Name();
        name.setIdentifier("alpha");
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(name);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "alpha", config(), null);
        Node expr = result.getFirstChild();
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertEquals(Token.NAME, expr.getFirstChild().getType());
        assertEquals("alpha", expr.getFirstChild().getString());
    }

    @Test
    public void testNumberExpressionIsPreserved() throws Exception {
        AstRoot root = new AstRoot();
        NumberLiteral literal = new NumberLiteral();
        literal.setNumber(7.0);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(literal);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "7", config(), null);
        assertEquals(7.0, result.getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testNegativeNumericLiteralIsFolded() throws Exception {
        AstRoot root = new AstRoot();
        UnaryExpression neg = new UnaryExpression();
        neg.setType(com.google.javascript.rhino.head.Token.NEG);
        NumberLiteral literal = new NumberLiteral();
        literal.setNumber(3.0);
        neg.setOperand(literal);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(neg);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "-3", config(), null);
        Node value = result.getFirstChild().getFirstChild();
        assertEquals(Token.NUMBER, value.getType());
        assertEquals(-3.0, value.getDouble(), 0.0);
    }

    @Test
    public void testEmptyExpressionBecomesEmptyToken() throws Exception {
        AstRoot root = new AstRoot();
        EmptyExpression empty = new EmptyExpression();
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(empty);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "", config(), null);
        assertEquals(Token.EMPTY, result.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testStringExpressionKeepsValue() throws Exception {
        AstRoot root = new AstRoot();
        StringLiteral literal = new StringLiteral();
        literal.setValue("hello");
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(literal);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "'hello'", config(), null);
        Node value = result.getFirstChild().getFirstChild();
        assertEquals(Token.STRING, value.getType());
        assertEquals("hello", value.getString());
    }

    @Test
    public void testArrayLiteralPreservesElementOrder() throws Exception {
        AstRoot root = new AstRoot();
        ArrayLiteral array = new ArrayLiteral();
        NumberLiteral first = new NumberLiteral();
        first.setNumber(1.0);
        NumberLiteral second = new NumberLiteral();
        second.setNumber(2.0);
        array.addElement(first);
        array.addElement(second);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(array);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "[1,2]", config(), null);
        Node irArray = result.getFirstChild().getFirstChild();
        assertEquals(Token.ARRAYLIT, irArray.getType());
        assertEquals(1.0, irArray.getFirstChild().getDouble(), 0.0);
        assertEquals(2.0, irArray.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testAllowedUseStrictDirectiveMovesToScript() throws Exception {
        AstRoot root = new AstRoot();
        ExpressionStatement directive = new ExpressionStatement();
        StringLiteral literal = new StringLiteral();
        literal.setValue("use strict");
        directive.setExpression(literal);
        root.addChild(directive);

        Node result = IRFactory.transformTree(root, null, "'use strict';", config(), null);
        assertEquals(0, result.getChildCount());
        assertTrue(result.getDirectives().contains("use strict"));
    }

    @Test
    public void testNonDirectiveStringRemainsStatement() throws Exception {
        AstRoot root = new AstRoot();
        ExpressionStatement statement = new ExpressionStatement();
        StringLiteral literal = new StringLiteral();
        literal.setValue("other");
        statement.setExpression(literal);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "'other';", config(), null);
        assertEquals(1, result.getChildCount());
        assertEquals("other", result.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testConditionalExpressionHasThreeChildren() throws Exception {
        AstRoot root = new AstRoot();
        ConditionalExpression conditional = new ConditionalExpression();
        KeywordLiteral test = new KeywordLiteral();
        test.setType(com.google.javascript.rhino.head.Token.TRUE);
        NumberLiteral yes = new NumberLiteral();
        yes.setNumber(1.0);
        NumberLiteral no = new NumberLiteral();
        no.setNumber(2.0);
        conditional.setTestExpression(test);
        conditional.setTrueExpression(yes);
        conditional.setFalseExpression(no);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(conditional);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "true?1:2", config(), null);
        Node hook = result.getFirstChild().getFirstChild();
        assertEquals(Token.HOOK, hook.getType());
        assertEquals(3, hook.getChildCount());
        assertEquals(1.0, hook.getChildAtIndex(1).getDouble(), 0.0);
        assertEquals(2.0, hook.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testPropertyAccessTransformsPropertyNameToString() throws Exception {
        AstRoot root = new AstRoot();
        PropertyGet get = new PropertyGet();
        Name target = new Name();
        target.setIdentifier("obj");
        Name property = new Name();
        property.setIdentifier("field");
        get.setTarget(target);
        get.setProperty(property);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(get);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "obj.field", config(), null);
        Node access = result.getFirstChild().getFirstChild();
        assertEquals(Token.GETPROP, access.getType());
        assertEquals("field", access.getLastChild().getString());
        assertEquals(Token.STRING, access.getLastChild().getType());
    }

    @Test
    public void testParenthesizedExpressionRetainsValue() throws Exception {
        AstRoot root = new AstRoot();
        ParenthesizedExpression parens = new ParenthesizedExpression();
        NumberLiteral literal = new NumberLiteral();
        literal.setNumber(4.0);
        parens.setExpression(literal);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(parens);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "(4)", config(), null);
        Node value = result.getFirstChild().getFirstChild();
        assertEquals(Token.NUMBER, value.getType());
        assertEquals(4.0, value.getDouble(), 0.0);
    }

    @Test
    public void testRegularExpressionWithoutFlagsHasOneChild() throws Exception {
        AstRoot root = new AstRoot();
        RegExpLiteral regexp = new RegExpLiteral();
        regexp.setValue("ab");
        regexp.setFlags("");
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(regexp);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "/ab/", config(), null);
        Node value = result.getFirstChild().getFirstChild();
        assertEquals(Token.REGEXP, value.getType());
        assertEquals(1, value.getChildCount());
        assertEquals("ab", value.getFirstChild().getString());
    }

    @Test
    public void testRegularExpressionWithFlagsHasTwoChildren() throws Exception {
        AstRoot root = new AstRoot();
        RegExpLiteral regexp = new RegExpLiteral();
        regexp.setValue("ab");
        regexp.setFlags("i");
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(regexp);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "/ab/i", config(), null);
        Node value = result.getFirstChild().getFirstChild();
        assertEquals(2, value.getChildCount());
        assertEquals("i", value.getLastChild().getString());
    }

    @Test
    public void testUnaryPostfixIncrementIsMarked() throws Exception {
        AstRoot root = new AstRoot();
        UnaryExpression inc = new UnaryExpression();
        inc.setType(com.google.javascript.rhino.head.Token.INC);
        Name name = new Name();
        name.setIdentifier("x");
        inc.setOperand(name);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(inc);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "x++", config(), null);
        Node value = result.getFirstChild().getFirstChild();
        assertEquals(Token.INC, value.getType());
    }

    @Test
    public void testReturnStatementHasTransformedValue() throws Exception {
        AstRoot root = new AstRoot();
        ReturnStatement ret = new ReturnStatement();
        NumberLiteral literal = new NumberLiteral();
        literal.setNumber(5.0);
        ret.setReturnValue(literal);
        root.addChild(ret);

        Node result = IRFactory.transformTree(root, null, "return 5", config(), null);
        Node value = result.getFirstChild();
        assertEquals(Token.RETURN, value.getType());
        assertEquals(5.0, value.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testEmptyReturnHasNoChildren() throws Exception {
        AstRoot root = new AstRoot();
        ReturnStatement ret = new ReturnStatement();
        root.addChild(ret);

        Node result = IRFactory.transformTree(root, null, "return", config(), null);
        assertEquals(Token.RETURN, result.getFirstChild().getType());
        assertFalse(result.getFirstChild().hasChildren());
    }

    @Test
    public void testWhileLoopTransformsConditionAndBody() throws Exception {
        AstRoot root = new AstRoot();
        WhileLoop loop = new WhileLoop();
        KeywordLiteral condition = new KeywordLiteral();
        condition.setType(com.google.javascript.rhino.head.Token.TRUE);
        Block body = new Block();
        loop.setCondition(condition);
        loop.setBody(body);
        root.addChild(loop);

        Node result = IRFactory.transformTree(root, null, "while(true){}", config(), null);
        Node irLoop = result.getFirstChild();
        assertEquals(Token.WHILE, irLoop.getType());
        assertEquals(Token.TRUE, irLoop.getFirstChild().getType());
        assertEquals(Token.BLOCK, irLoop.getLastChild().getType());
    }

    @Test
    public void testUnlabelledBreakHasNoChild() throws Exception {
        AstRoot root = new AstRoot();
        BreakStatement statement = new BreakStatement();
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "break", config(), null);
        assertEquals(Token.BREAK, result.getFirstChild().getType());
        assertFalse(result.getFirstChild().hasChildren());
    }

    @Test
    public void testTryFinallyProducesThreeChildStructure() throws Exception {
        AstRoot root = new AstRoot();
        TryStatement statement = new TryStatement();
        Block tryBody = new Block();
        Block finallyBody = new Block();
        statement.setTryBlock(tryBody);
        statement.setFinallyBlock(finallyBody);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, null, "try{}finally{}", config(), null);
        Node irTry = result.getFirstChild();
        assertEquals(Token.TRY, irTry.getType());
        assertEquals(3, irTry.getChildCount());
        assertEquals(Token.BLOCK, irTry.getFirstChild().getType());
        assertEquals(Token.BLOCK, irTry.getLastChild().getType());
    }

    private Config config() {
        return new Config(Sets.<String>newHashSet(), Sets.<String>newHashSet(),
                false, LanguageMode.ECMASCRIPT5, true);
    }
}
