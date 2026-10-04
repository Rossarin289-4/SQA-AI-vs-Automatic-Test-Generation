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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEmptyRootTransformsToScript() throws Exception {
        AstRoot root = new AstRoot();
        Node result = IRFactory.transformTree(root, "", new Config(Sets.<String>newHashSet(),
                Sets.<String>newHashSet(), false, true, true), null);
        assertEquals(Token.SCRIPT, result.getType());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testNameExpressionBecomesExpressionStatement() throws Exception {
        AstRoot root = new AstRoot();
        Name name = new Name();
        name.setIdentifier("x");
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(name);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "x", new Config(Sets.<String>newHashSet(),
                Sets.<String>newHashSet(), false, true, true), null);
        assertEquals(Token.SCRIPT, result.getType());
        assertEquals(Token.EXPR_RESULT, result.getFirstChild().getType());
        assertEquals(Token.NAME, result.getFirstChild().getFirstChild().getType());
        assertEquals("x", result.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testNumberExpressionPreservesValue() throws Exception {
        AstRoot root = new AstRoot();
        NumberLiteral number = new NumberLiteral();
        number.setNumber(7.0);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(number);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "7", new Config(Sets.<String>newHashSet(),
                Sets.<String>newHashSet(), false, true, true), null);
        assertEquals(7.0, result.getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testZeroNumberExpression() throws Exception {
        AstRoot root = new AstRoot();
        NumberLiteral number = new NumberLiteral();
        number.setNumber(0.0);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(number);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "0", new Config(Sets.<String>newHashSet(),
                Sets.<String>newHashSet(), false, true, true), null);
        assertEquals(0.0, result.getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testStringExpressionPreservesValue() throws Exception {
        AstRoot root = new AstRoot();
        StringLiteral literal = new StringLiteral();
        literal.setValue("abc");
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(literal);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "'abc'", new Config(Sets.<String>newHashSet(),
                Sets.<String>newHashSet(), false, true, true), null);
        assertEquals(Token.STRING, result.getFirstChild().getFirstChild().getType());
        assertEquals("abc", result.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testTrueKeywordRemainsTrue() throws Exception {
        AstRoot root = new AstRoot();
        KeywordLiteral literal = new KeywordLiteral();
        literal.setType(com.google.javascript.jscomp.mozilla.rhino.Token.TRUE);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(literal);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "true", new Config(Sets.<String>newHashSet(),
                Sets.<String>newHashSet(), false, true, true), null);
        assertEquals(Token.TRUE, result.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testNegativeNumberFoldsSignIntoNumber() throws Exception {
        AstRoot root = new AstRoot();
        NumberLiteral number = new NumberLiteral();
        number.setNumber(3.0);
        UnaryExpression negative = new UnaryExpression();
        negative.setType(com.google.javascript.jscomp.mozilla.rhino.Token.NEG);
        negative.setOperand(number);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(negative);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "-3", new Config(Sets.<String>newHashSet(),
                Sets.<String>newHashSet(), false, true, true), null);
        assertEquals(Token.NUMBER, result.getFirstChild().getFirstChild().getType());
        assertEquals(-3.0, result.getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testPositiveUnaryExpressionRetainsOperator() throws Exception {
        AstRoot root = new AstRoot();
        Name name = new Name();
        name.setIdentifier("x");
        UnaryExpression positive = new UnaryExpression();
        positive.setType(com.google.javascript.jscomp.mozilla.rhino.Token.POS);
        positive.setOperand(name);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(positive);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "+x", new Config(Sets.<String>newHashSet(),
                Sets.<String>newHashSet(), false, true, true), null);
        assertEquals(Token.POS, result.getFirstChild().getFirstChild().getType());
        assertEquals(Token.NAME, result.getFirstChild().getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testAllowedUseStrictDirectiveIsRecordedAndRemoved() throws Exception {
        AstRoot root = new AstRoot();
        StringLiteral literal = new StringLiteral();
        literal.setValue("use strict");
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(literal);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "'use strict';",
                new Config(Sets.<String>newHashSet(), Sets.<String>newHashSet(),
                        false, true, true), null);
        assertFalse(result.hasChildren());
        assertTrue(((Set<?>) result.getProp(Node.DIRECTIVES)).contains("use strict"));
    }

    @Test
    public void testOtherStringIsNotTreatedAsDirective() throws Exception {
        AstRoot root = new AstRoot();
        StringLiteral literal = new StringLiteral();
        literal.setValue("other");
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(literal);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "'other';",
                new Config(Sets.<String>newHashSet(), Sets.<String>newHashSet(),
                        false, true, true), null);
        assertEquals(1, result.getChildCount());
        assertNull(result.getProp(Node.DIRECTIVES));
    }

    @Test
    public void testEmptyArrayTransformsToArrayLiteral() throws Exception {
        AstRoot root = new AstRoot();
        ArrayLiteral array = new ArrayLiteral();
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(array);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "[]", new Config(Sets.<String>newHashSet(),
                Sets.<String>newHashSet(), false, true, true), null);
        assertEquals(Token.ARRAYLIT, result.getFirstChild().getFirstChild().getType());
        assertFalse(result.getFirstChild().getFirstChild().hasChildren());
    }

    @Test
    public void testPropertyAccessTransformsToGetProp() throws Exception {
        AstRoot root = new AstRoot();
        Name target = new Name();
        target.setIdentifier("obj");
        Name property = new Name();
        property.setIdentifier("field");
        PropertyGet get = new PropertyGet();
        get.setTarget(target);
        get.setProperty(property);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(get);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "obj.field",
                new Config(Sets.<String>newHashSet(), Sets.<String>newHashSet(),
                        false, true, true), null);
        Node getProp = result.getFirstChild().getFirstChild();
        assertEquals(Token.GETPROP, getProp.getType());
        assertEquals(Token.NAME, getProp.getFirstChild().getType());
        assertEquals("field", getProp.getLastChild().getString());
    }

    @Test
    public void testElementAccessTransformsToGetElem() throws Exception {
        AstRoot root = new AstRoot();
        Name target = new Name();
        target.setIdentifier("arr");
        NumberLiteral index = new NumberLiteral();
        index.setNumber(0.0);
        ElementGet get = new ElementGet();
        get.setTarget(target);
        get.setElement(index);
        ExpressionStatement statement = new ExpressionStatement();
        statement.setExpression(get);
        root.addChild(statement);

        Node result = IRFactory.transformTree(root, "arr[0]",
                new Config(Sets.<String>newHashSet(), Sets.<String>newHashSet(),
                        false, true, true), null);
        Node getElem = result.getFirstChild().getFirstChild();
        assertEquals(Token.GETELEM, getElem.getType());
        assertEquals(Token.NAME, getElem.getFirstChild().getType());
        assertEquals(0.0, getElem.getLastChild().getDouble(), 0.0);
    }
}
