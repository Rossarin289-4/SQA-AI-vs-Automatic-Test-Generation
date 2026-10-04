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

    // Helper method to create a dummy Config for testing
    private Config createConfig(LanguageMode languageMode, boolean acceptConstKeyword) {
        return new Config(Sets.newHashSet(), Sets.newHashSet(), false, languageMode, acceptConstKeyword);
    }

    // Helper method to create a dummy ErrorReporter for testing

    // Helper method to create a dummy StaticSourceFile for testing

    // Helper method to create an AstRoot from a source string

































    @Test
    public void testTransformTree_regexpLiteral() throws Exception {
        String source = "/abc/g;";
        AstRoot astRoot = createAstRoot(source);
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
        FunctionNode getter = new FunctionNode(new Name("a", 0, 0));
        getter.setGetter(true);
        Block body = new Block();
        body.addStatement(new ReturnStatement(new NumberLiteral(1.0)));
        getter.setBody(body);
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
        FunctionNode setter = new FunctionNode(new Name("a", 0, 0));
        setter.setSetter(true);
        Block body = new Block();
        // Set this.v = v
        body.addStatement(new ExpressionStatement(
            new Assignment(com.google.javascript.rhino.head.Token.ASSIGN,
                           new PropertyGet(new KeywordLiteral(com.google.javascript.rhino.head.Token.THIS), new Name("v", 0, 0)),
                           new Name("v", 0, 0))));
        setter.setBody(body);
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
        assertEquals(Token.NAME, constInitializer.getType()); // The target of initializer is NAME
        assertEquals("x", constInitializer.getString());
        assertEquals(1.0, constInitializer.getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testTransformTree_constDeclaration_notAccepted() throws Exception {
        String source = "const x = 1;";
        AstRoot astRoot = createAstRoot(source);
        VariableDeclaration vd = new VariableDeclaration(com.google.javascript.rhino.head.Token.CONST);
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
        // The string literal's length needs to be correctly set.
        // The source string itself includes the quotes and the backslash for \v.
        sl.setLength(source.length() - 1); // length of the string content, excluding semicolon and trailing newline.
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
        // The escape sequence \v should be interpreted as a vertical tab character \u000B.
        assertEquals("hello\u000Bworld", stringNode.getString());
        assertTrue(stringNode.getBooleanProp(Node.SLASH_V));
    }

    @Test
    public void testTransformTree_directiveUseStrict() throws Exception {
        String source = "'use strict'; function foo() {}";
        AstRoot astRoot = createAstRoot(source);

        // Construct the AST manually to simulate a script with a directive.
        // The IRFactory processes the AstRoot directly.
        Block scriptBody = new Block(); // This will represent the body of the script.

        // Add the directive as an ExpressionStatement with a StringLiteral.
        StringLiteral directiveLiteral = new StringLiteral("'use strict'");
        ExpressionStatement directiveStmt = new ExpressionStatement(directiveLiteral);
        scriptBody.addStatement(directiveStmt);

        // Add the function declaration.
        FunctionNode fn = new FunctionNode(new Name("foo", 0, 0));
        fn.setBody(new Block());
        scriptBody.addStatement(fn);

        // The AstRoot itself should have the script content, not just a Block.
        // We need to replace the initial dummy Block in createAstRoot.
        AstRoot root = astRoot; // Use the astRoot created by createAstRoot
        root.removeChildren(); // Remove the dummy Block
        root.addChildToBack(scriptBody); // Add our constructed script body

        Config config = createConfig(LanguageMode.ECMASCRIPT5_STRICT, true);
        ErrorReporter errorReporter = createErrorReporter();
        StaticSourceFile sourceFile = createStaticSourceFile("test.js");

        Node irNode = IRFactory.transformTree(root, sourceFile, source, config, errorReporter);

        assertNotNull(irNode);
        assertEquals(Token.SCRIPT, irNode.getType());

        // The 'use strict' directive should be set on the script node.
        assertTrue(irNode.hasOwn(Node.DIRECTIVES));
        Set<String> directives = (Set<String>) irNode.getProp(Node.DIRECTIVES);
        assertNotNull(directives);
        assertEquals(1, directives.size());
        assertTrue(directives.contains("use strict"));

        // The function node should be a direct child of the script node.
        // The directive statement itself is consumed by IRFactory and not present as a child.
        assertEquals(Token.FUNCTION, irNode.getFirstChild().getType());
    }
}





