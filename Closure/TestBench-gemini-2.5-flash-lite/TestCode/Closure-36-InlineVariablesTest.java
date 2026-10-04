package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier; // Added for getUniqueNameIdSupplier

public class InlineVariablesTest {

    // Dummy implementation of AbstractCompiler for testing

    // Dummy implementation of ScopeCreator for testing

    // Helper to parse code into a Node tree (simplified)

    // Helper to generate code from a Node tree (simplified)








    private Node createNumberNode(double value) {
        return Node.newNumber(value);
    }

    private Node createStringNode(String value) {
        return Node.newString(value);
    }











    @Test
    public void testNoInlineMutableObject() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node objectLiteral = new Node(Token.OBJECTLIT, new Node(Token.STRING_KEY, "a"), createNumberNode(1));
        Node objDeclaration = createVarDeclaration("obj", objectLiteral);
        Node refObj = createNameNode("obj");
        Node propAccess = new Node(Token.GETPROP, refObj, createNameNode("a"));
        Node varBDelcaration = createVarDeclaration("b", propAccess);
        root.addChildToBack(objDeclaration);
        root.addChildToBack(varBDelcaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var obj = {a: 1}; var b = obj.a; (obj should not be inlined)
        assertEquals("var obj = {a: 1}; var b = obj.a;", codeGen(root));
    }

    @Test
    public void testInlineFunctionExpression() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node funcExpr = new Node(Token.FUNCTION);
        Node funcBody = new Node(Token.BLOCK, new Node(Token.RETURN, createNumberNode(1)));
        funcExpr.addChildToBack(funcBody);
        Node varFDeclaration = createVarDeclaration("f", funcExpr);

        Node refF = createNameNode("f");
        Node varGDeclaration = createVarDeclaration("g", refF);
        root.addChildToBack(varFDeclaration);
        root.addChildToBack(varGDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var g = function() { return 1; }; (f should be removed)
        assertEquals("var g = function() { return 1; };", codeGen(root));
    }

    @Test
    public void testNoInlineFunctionDeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionDecl = new Node(Token.FUNCTION);
        functionDecl.addChildToBack(new Node(Token.NAME, "f")); // Function name
        Node funcBody = new Node(Token.BLOCK, new Node(Token.RETURN, createNumberNode(1)));
        functionDecl.addChildToBack(funcBody);

        Node refF = createNameNode("f");
        Node varGDeclaration = createVarDeclaration("g", refF);
        root.addChildToBack(functionDecl);
        root.addChildToBack(varGDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: function f() { return 1; } var g = f; (f should not be inlined)
        assertEquals("function f() { return 1; } var g = f;", codeGen(root));
    }


    @Test
    public void testInlineAliasOfConstant() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constXDeclaration = createVarDeclaration("x", createNumberNode(1));
        Node refX = createNameNode("x");
        Node varYDeclaration = createVarDeclaration("y", refX);
        Node refY = createNameNode("y");
        Node varZDeclaration = createVarDeclaration("z", refY);
        root.addChildToBack(constXDeclaration);
        root.addChildToBack(varYDeclaration);
        root.addChildToBack(varZDeclaration);

        AbstractCompiler compiler = new TestCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new CodingConvention.DefaultCodingConvention() {
                    @Override
                    public boolean isConstant(Var var) {
                        return "x".equals(var.getName());
                    }
                };
            }
        };

        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.CONSTANTS_ONLY, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var z = 1; (y should also be removed as unused)
        assertEquals("var z = 1;", codeGen(root));
    }

    @Test
    public void testInlineShortString() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constSDeclaration = createVarDeclaration("s", createStringNode("a"));
        Node refS1 = createNameNode("s");
        Node refS2 = createNameNode("s");
        Node exprT = new Node(Token.ADD, refS1, refS2);
        Node varTDeclaration = createVarDeclaration("t", exprT);
        root.addChildToBack(constSDeclaration);
        root.addChildToBack(varTDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        // inlineAllStrings = true
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, true), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var t = "a" + "a";
        assertEquals("var t = \"a\" + \"a\";", codeGen(root));
    }

    @Test
    public void testNoInlineLongString() throws Exception {
        String longString = "this is a very long string that might not be worth inlining";
        Node root = new Node(Token.SCRIPT);
        Node constSDeclaration = createVarDeclaration("s", createStringNode(longString));
        Node refS = createNameNode("s");
        Node varTDeclaration = createVarDeclaration("t", refS);
        root.addChildToBack(constSDeclaration);
        root.addChildToBack(varTDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        // inlineAllStrings = false, and string is long, so it should not be inlined.
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var s = "long string..."; var t = s;
        assertEquals("var s = \"" + longString + "\"; var t = s;", codeGen(root));
    }

    @Test
    public void testInlineStringDefine() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constSDeclaration = createConstDeclaration("S", createStringNode("abc"));
        // Simulate @define annotation by overriding isDefine
        AbstractCompiler compiler = new TestCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new CodingConvention.DefaultCodingConvention() {
                    @Override
                    public boolean isDefine(Var var) {
                        return "S".equals(var.getName());
                    }
                };
            }
        };
        Node refS = createNameNode("S");
        Node varTDeclaration = createVarDeclaration("t", refS);
        root.addChildToBack(constSDeclaration);
        root.addChildToBack(varTDeclaration);

        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var t = "abc";
        assertEquals("var t = \"abc\";", codeGen(root));
    }

    @Test
    public void testInlineConstantWithComplexReferences() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constCDeclaration = createVarDeclaration("C", createNumberNode(5));
        Node refC1 = createNameNode("C");
        Node exprX = new Node(Token.ADD, refC1, createNumberNode(1));
        Node varXDeclaration = createVarDeclaration("x", exprX);

        Node refC2 = createNameNode("C");
        Node exprY = new Node(Token.MUL, refC2, createNumberNode(2));
        Node varYDeclaration = createVarDeclaration("y", exprY);

        Node refC3 = createNameNode("C");
        Node varZDeclaration = createVarDeclaration("z", refC3);

        root.addChildToBack(constCDeclaration);
        root.addChildToBack(varXDeclaration);
        root.addChildToBack(varYDeclaration);
        root.addChildToBack(varZDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var x = 5 + 1; var y = 5 * 2; var z = 5;
        assertEquals("var x = 5 + 1; var y = 5 * 2; var z = 5;", codeGen(root));
    }

    @Test
    public void testNoInlineIfVariableCapturedByClosure() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varXDeclaration = createVarDeclaration("x", createNumberNode(1));
        Node innerFunction = new Node(Token.FUNCTION);
        Node innerBody = new Node(Token.BLOCK, new Node(Token.RETURN, createNameNode("x")));
        innerFunction.addChildToBack(innerBody);

        Node returnExpr = new Node(Token.RETURN, innerFunction);
        Node outerFunctionBody = new Node(Token.BLOCK, varXDeclaration, returnExpr);
        Node outerFunction = new Node(Token.FUNCTION);
        outerFunction.addChildToBack(outerFunctionBody);

        root.addChildToBack(outerFunction);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: function() { var x = 1; return function() { return x; }; } (x should not be inlined)
        // The outer function is not called, so codeGen might simplify it.
        // We expect 'x' to remain declared and used.
        assertEquals("function() { var x = 1; return function() { return x; }; }", codeGen(root));
    }

    @Test
    public void testNoInlineIfArgumentsModified() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME, "f")); // Function name

        Node argumentsNode = new Node(Token.ARGUMENTS);
        Node accessArgumentsZero = new Node(Token.GETElem, argumentsNode, createNumberNode(0));
        Node assignment = new Node(Token.ASSIGN, accessArgumentsZero, createNumberNode(1));
        Node exprResult = new Node(Token.EXPR_RESULT, assignment);

        Node paramA = new Node(Token.NAME, "a");
        Node paramB = new Node(Token.NAME, "b");
        Node returnExpr = new Node(Token.ADD, paramA, paramB);

        Node functionBody = new Node(Token.BLOCK, exprResult, new Node(Token.RETURN, returnExpr));
        functionNode.addChildToBack(paramA);
        functionNode.addChildToBack(paramB);
        functionNode.addChildToBack(functionBody);

        root.addChildToBack(functionNode);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: function f(a, b) { arguments[0] = 1; return a + b; } (arguments[0] modification should prevent inlining)
        assertEquals("function f(a, b) { arguments[0] = 1; return a + b; }", codeGen(root));
    }

    @Test
    public void testNoInlineIfArgumentsEscaped() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME, "f")); // Function name

        Node argumentsNode = new Node(Token.ARGUMENTS);
        Node varArgsDeclaration = createVarDeclaration("args", argumentsNode);

        Node refArgs = createNameNode("args");
        Node accessArgsZero = new Node(Token.GETElem, refArgs, createNumberNode(0));
        Node returnExpr = new Node(Token.RETURN, accessArgsZero);

        Node paramA = new Node(Token.NAME, "a");
        Node paramB = new Node(Token.NAME, "b");
        Node functionBody = new Node(Token.BLOCK, varArgsDeclaration, returnExpr);
        functionNode.addChildToBack(paramA);
        functionNode.addChildToBack(paramB);
        functionNode.addChildToBack(functionBody);

        root.addChildToBack(functionNode);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: function f(a, b) { var args = arguments; return args[0]; } (assigning arguments to another var should prevent inlining)
        assertEquals("function f(a, b) { var args = arguments; return args[0]; }", codeGen(root));
    }

    @Test
    public void testInlineVariableReadOnce() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constA = createVarDeclaration("a", createNumberNode(10));
        Node refA = createNameNode("a");
        Node varB = createVarDeclaration("b", refA);
        root.addChildToBack(constA);
        root.addChildToBack(varB);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        assertEquals("var b = 10;", codeGen(root));
    }

    @Test
    public void testInlineVariableAssignedOnceAndReadOnce() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node valProvider = new Node(Token.CALL, createNameNode("getVal"));
        Node assignA = createAssignment(createNameNode("a"), valProvider);
        Node refA = createNameNode("a");
        Node varB = createVarDeclaration("b", refA);
        root.addChildToBack(assignA);
        root.addChildToBack(varB);

        AbstractCompiler compiler = new TestCompiler() {
            @Override
            public boolean isPure(Node expression) {
                return expression.isCall() && expression.getFirstChild().isName() && "getVal".equals(expression.getFirstChild().getString());
            }
        };
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: b = getVal(); // 'a' is removed
        assertEquals("b = getVal();", codeGen(root));
    }

    @Test
    public void testInlineImmutableValueReadOnce() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node arrayLiteral = new Node(Token.ARRAYLIT, createNumberNode(1), createNumberNode(2));
        Node constArrDeclaration = createVarDeclaration("arr", arrayLiteral);
        Node refArr = createNameNode("arr");
        Node indexAccess = new Node(Token.GETELEM, refArr, createNumberNode(0));
        Node varBDeclaration = createVarDeclaration("b", indexAccess);
        root.addChildToBack(constArrDeclaration);
        root.addChildToBack(varBDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var arr = [1, 2]; var b = arr[0]; // arr is not inlined because it's mutable.
        assertEquals("var arr = [1, 2]; var b = arr[0];", codeGen(root));
    }

    @Test
    public void testNoInlineIfValueIsFunction() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node funcExpr = new Node(Token.FUNCTION);
        Node funcBody = new Node(Token.BLOCK, new Node(Token.RETURN, createNumberNode(1)));
        funcExpr.addChildToBack(funcBody);
        Node varFDeclaration = createVarDeclaration("f", funcExpr);

        Node refF = createNameNode("f");
        Node varGDeclaration = createVarDeclaration("g", refF);
        root.addChildToBack(varFDeclaration);
        root.addChildToBack(varGDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var f = function() { return 1; }; var g = f; (f itself is a function value, not inlined as a literal)
        assertEquals("var f = function() { return 1; }; var g = f;", codeGen(root));
    }

    @Test
    public void testInlineFunctionExpressionAsValue() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node funcExpr = new Node(Token.FUNCTION);
        Node funcBody = new Node(Token.BLOCK, new Node(Token.RETURN, createNumberNode(1)));
        funcExpr.addChildToBack(funcBody);
        Node varFDeclaration = createVarDeclaration("f", funcExpr);

        Node refF = createNameNode("f");
        Node varGDeclaration = createVarDeclaration("g", refF);
        root.addChildToBack(varFDeclaration);
        root.addChildToBack(varGDeclaration);

        AbstractCompiler compiler = new TestCompiler();
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var g = function() { return 1; };
        assertEquals("var g = function() { return 1; };", codeGen(root));
    }

    @Test
    public void testNoInlineExportedVariable() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node constXDeclaration = createVarDeclaration("x", createNumberNode(1));
        Node refX = createNameNode("x");
        Node varYDeclaration = createVarDeclaration("y", refX);
        root.addChildToBack(constXDeclaration);
        root.addChildToBack(varYDeclaration);

        AbstractCompiler compiler = new TestCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new CodingConvention.DefaultCodingConvention() {
                    @Override
                    public boolean isExported(String name) {
                        return "x".equals(name);
                    }
                };
            }
        };
        NodeTraversal traversal = new NodeTraversal(compiler, new InlineVariables(compiler, Mode.ALL, false), new TestScopeCreator());
        Scope globalScope = new Scope(root, compiler);
        traversal.traverseWithScope(root, globalScope);

        // Expected: var x = 1; var y = x; (x is exported, not inlined)
        assertEquals("var x = 1; var y = x;", codeGen(root));
    }
}





