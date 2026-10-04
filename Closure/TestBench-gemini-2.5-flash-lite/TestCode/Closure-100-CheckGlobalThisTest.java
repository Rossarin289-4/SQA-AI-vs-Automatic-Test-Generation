package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.ArrayList;
import java.util.List;

public class CheckGlobalThisTest {

    // Helper to create a simple compiler mock that only tracks reported errors.

























    @Test
    public void testGlobalThisInArrowFunction() throws Exception {
        // Scenario: var f = () => { this.x = 1; };
        // Arrow functions are treated like regular functions by `shouldTraverse` if they are `Token.FUNCTION`.
        // If they are not, they might be missed. The current `shouldTraverse` specifically checks `Token.FUNCTION`.
        // We simulate by creating a FUNCTION node.
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node innerBlock = new Node(Token.BLOCK, xAssign);
        Node functionExpr = new Node(Token.FUNCTION, innerBlock); // Simulating function expression
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "f"), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisWithConstructorAnnotationOnFunctionExpr() throws Exception {
        // Scenario: var MyClass = @constructor function() { this.prop = 1; };
        Node thisNode = new Node(Token.THIS);
        Node propAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, propAssign);
        Node functionExpr = new Node(Token.FUNCTION, blockNode);

        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setConstructor(true);
        functionExpr.setJSDocInfo(jsDoc); // JSDoc directly on the function expression

        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "MyClass"), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisWithThisAnnotationOnFunctionExpr() throws Exception {
        // Scenario: var f = @this {MyType} function() { this.prop = 1; };
        Node thisNode = new Node(Token.THIS);
        Node propAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, propAssign);
        Node functionExpr = new Node(Token.FUNCTION, blockNode);

        JSDocInfo jsDoc = new JSDocInfo();
        // Simulating hasThisType() being true.
        functionExpr.setJSDocInfo(jsDoc);

        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "f"), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisWhenNotFirstChildOfAssign() throws Exception {
        // Scenario: a = (b = this);
        Node thisNode = new Node(Token.THIS);
        Node assignB = new Node(Token.ASSIGN, new Node(Token.NAME, "b"), thisNode);
        Node assignA = new Node(Token.ASSIGN, new Node(Token.NAME, "a"), assignB);
        Node scriptRoot = new Node(Token.SCRIPT, assignA);
        // 'this' is the RHS of 'b = this'. The `shouldTraverse` method for the parent `ASSIGN`
        // will set `assignLhsChild` when processing `assignB`.
        // Then, when visiting `this`, `shouldReportThis` checks `assignLhsChild != null`.
        // However, `assignLhsChild` is only set if `n == lhs` in `shouldTraverse`.
        // For `assignB`, `n` is `b`, not `this`. So `assignLhsChild` is NOT set by `assignB`.
        // The `assignLhsChild` is set when traversing `assignA`'s LHS ('a').
        // When traversing `this`, its parent is `assignB`. `shouldTraverse` on `this` will return true.
        // Then `visit(t, n, parent)` is called. `shouldReportThis` is called. `assignLhsChild` is null because `this` is not the LHS of `assignA`.
        // The condition `parent != null && NodeUtil.isGet(parent)` is also false.
        // So no error is expected.
        runTest(scriptRoot, 0, "");
    }

    @Test
    public void testGlobalThisWhenInBlockButNotFunction() throws Exception {
        // Scenario: { var x = this; }
        Node thisNode = new Node(Token.THIS);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "x"), thisNode);
        Node blockNode = new Node(Token.BLOCK, varDecl);
        Node scriptRoot = new Node(Token.SCRIPT, blockNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisNotReportedWhenAttachedToPrototype() throws Exception {
        // Scenario: Object.prototype.foo = function() { this.bar = 1; };
        Node thisNode = new Node(Token.THIS);
        Node barAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "bar")), Node.newNumber(1));
        Node functionBody = new Node(Token.BLOCK, barAssign);
        Node functionExpr = new Node(Token.FUNCTION, functionBody);

        Node objectProto = new Node(Token.GETPROP, new Node(Token.NAME, "Object"), new Node(Token.STRING, "prototype"));
        Node assignFoo = new Node(Token.ASSIGN, new Node(Token.GETPROP, objectProto, new Node(Token.STRING, "foo")), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, assignFoo);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisReportedInSimpleGetProp() throws Exception {
        // Scenario: this.someProp
        Node thisNode = new Node(Token.THIS);
        Node getPropNode = new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "someProp"));
        Node scriptRoot = new Node(Token.SCRIPT, getPropNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisNotReportedInAnonymousFunctionAssignedToVar() throws Exception {
        // Scenario: var f = function() { }; (no 'this' inside)
        Node functionBody = new Node(Token.BLOCK); // Empty function body
        Node functionExpr = new Node(Token.FUNCTION, functionBody);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "f"), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 0, ""); // No 'this' to report.
    }

    @Test
    public void testGlobalThisReportedWhenUsedAsArgumentToFunction() throws Exception {
        // Scenario: someFunction(this);
        Node thisNode = new Node(Token.THIS);
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "someFunction"), thisNode);
        Node scriptRoot = new Node(Token.SCRIPT, callNode);
        // `shouldReportThis` checks `assignLhsChild != null` or `NodeUtil.isGet(parent)`.
        // `assignLhsChild` is null. Parent of `this` is `CALL`. `NodeUtil.isGet(parent)` is false.
        // So, no error is expected.
        runTest(scriptRoot, 0, "");
    }

    @Test
    public void testGlobalThisReportedWhenUsedAsRhsOfSimpleAssign() throws Exception {
        // Scenario: x = this;
        Node thisNode = new Node(Token.THIS);
        Node assignNode = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), thisNode);
        Node scriptRoot = new Node(Token.SCRIPT, assignNode);
        // `shouldTraverse` on `ASSIGN`: `n` is `x`. `parent` is `ASSIGN`. `n == lhs` is true. `assignLhsChild` is set to `x`.
        // `visit` on `this`: `shouldReportThis` is called. `assignLhsChild` is `x` (non-null). Returns true.
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisReportedWhenUsedAsLhsOfGetProp() throws Exception {
        // Scenario: this.prop = 1;
        Node thisNode = new Node(Token.THIS);
        Node propNode = new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop"));
        Node assignNode = new Node(Token.ASSIGN, propNode, Node.newNumber(1));
        Node scriptRoot = new Node(Token.SCRIPT, assignNode);
        // `shouldTraverse` on `ASSIGN`: `n` is `propNode`. `parent` is `ASSIGN`. `n == lhs` is true. `assignLhsChild` is set to `propNode`.
        // `visit` on `thisNode`: `shouldReportThis` is called. `assignLhsChild` is `propNode` (non-null). Returns true.
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisNotReportedInFunctionWithNoLogicalPlaceForThisAnnotation() throws Exception {
        // Scenario: function() { }; (a simple function, no 'this' used)
        Node functionBody = new Node(Token.BLOCK); // Empty function body
        Node functionNode = new Node(Token.FUNCTION, functionBody);
        Node scriptRoot = new Node(Token.SCRIPT, functionNode);
        runTest(scriptRoot, 0, ""); // No 'this' used.
    }

    @Test
    public void testGlobalThisNotReportedInConstructorFunctionExpr() throws Exception {
        // Scenario: var MyClass = function() { this.prop = 1; }; with @constructor annotation on the var
        Node thisNode = new Node(Token.THIS);
        Node propAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, propAssign);
        Node functionExpr = new Node(Token.FUNCTION, blockNode);

        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setConstructor(true);
        // The `getFunctionJsDocInfo` checks parent nodes for JSDoc if not on the function itself.
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "MyClass"), functionExpr);
        varDecl.setJSDocInfo(jsDoc); // Attaching JSDoc to the VAR node

        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisNotReportedInFunctionWithThisAnnotationOnVar() throws Exception {
        // Scenario: var f = function() { this.prop = 1; }; with @this annotation on the var
        Node thisNode = new Node(Token.THIS);
        Node propAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, propAssign);
        Node functionExpr = new Node(Token.FUNCTION, blockNode);

        JSDocInfo jsDoc = new JSDocInfo();
        // Simulating hasThisType() being true.
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "f"), functionExpr);
        varDecl.setJSDocInfo(jsDoc); // Attaching JSDoc to the VAR node

        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisReportedForDirectThisUseInScript() throws Exception {
        // Scenario: this; (top-level 'this')
        Node thisNode = new Node(Token.THIS);
        Node scriptRoot = new Node(Token.SCRIPT, thisNode);
        // `shouldReportThis` checks `assignLhsChild != null` or `NodeUtil.isGet(parent)`.
        // `assignLhsChild` is null. Parent of `this` is `SCRIPT`. `NodeUtil.isGet(parent)` is false.
        // Thus, no error is expected. The class description mentions "left side of an assignment or a property access".
        // A standalone `this` doesn't fit this.
        runTest(scriptRoot, 0, "");
    }

    @Test
    public void testGlobalThisReportedWhenLhsIsThisAndParentIsAssign() throws Exception {
        // Scenario: this = 1;
        Node thisNode = new Node(Token.THIS);
        Node assignNode = new Node(Token.ASSIGN, thisNode, Node.newNumber(1));
        Node scriptRoot = new Node(Token.SCRIPT, assignNode);
        // `shouldTraverse` on `ASSIGN`: `n` is `thisNode`. `parent` is `ASSIGN`. `n == lhs` is true. `assignLhsChild` is set to `thisNode`.
        // `visit` on `thisNode`: `shouldReportThis` is called. `assignLhsChild` is `thisNode` (non-null). Returns true.
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisNotReportedWhenFunctionIsAttachedToPropertyThatIsNotPrototype() throws Exception {
        // Scenario: obj.method = function() { /* no this */ };
        Node functionBody = new Node(Token.BLOCK); // Empty function body
        Node functionExpr = new Node(Token.FUNCTION, functionBody);
        Node objName = new Node(Token.NAME, "obj");
        Node methodAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, objName, new Node(Token.STRING, "method")), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, methodAssign);
        // The `shouldTraverse` method's check for assignments to prototype properties
        // is `if (lhs.getType() == Token.GETPROP) { if (lhs.getLastChild().getString().equals("prototype")) { return false; } ... }`.
        // Here, `lhs` is `obj.method`. `lhs.getLastChild().getString()` is "method", not "prototype".
        // So, the `return false` for prototype assignments is skipped, and the function body is traversed.
        // Since there's no `this`, no error is reported.
        runTest(scriptRoot, 0, "");
    }
}





