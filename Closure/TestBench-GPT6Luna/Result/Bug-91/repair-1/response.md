```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class CheckGlobalThisTest {
    @Test
    public void testShouldTraverseOrdinaryNode() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node script = new Node(Token.SCRIPT);
        Node expression = new Node(Token.EXPR_RESULT);
        script.addChildToBack(expression);
        assertTrue(check.shouldTraverse(null, expression, script));
    }

    @Test
    public void testShouldTraverseFunctionInScript() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node script = new Node(Token.SCRIPT);
        Node function = new Node(Token.FUNCTION);
        script.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, script));
    }

    @Test
    public void testShouldNotTraverseFunctionInUnsupportedParent() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node parent = new Node(Token.CALL);
        Node function = new Node(Token.FUNCTION);
        parent.addChildToBack(function);
        assertFalse(check.shouldTraverse(null, function, parent));
    }

    @Test
    public void testShouldTraverseFunctionAssignedToName() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node name = Node.newString(Token.NAME, "f");
        Node function = new Node(Token.FUNCTION);
        name.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, name));
    }

    @Test
    public void testShouldTraverseFunctionAssignedByAssignment() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = Node.newString(Token.NAME, "f");
        Node function = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN, lhs, function);
        assertTrue(check.shouldTraverse(null, function, assign));
    }

    @Test
    public void testShouldTraverseLeftHandSideOfAssignment() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = new Node(Token.GETPROP, new Node(Token.THIS), Node.newString("p"));
        Node rhs = Node.newNumber(1);
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertTrue(check.shouldTraverse(null, lhs, assign));
    }

    @Test
    public void testDoesNotTraversePrototypeAssignmentRightSide() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = new Node(Token.GETPROP, Node.newString(Token.NAME, "C"),
                Node.newString("prototype"));
        Node rhs = Node.newNumber(1);
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertFalse(check.shouldTraverse(null, rhs, assign));
    }

    @Test
    public void testDoesNotTraverseSubpropertyOfPrototypeAssignmentRightSide() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node prototype = new Node(Token.GETPROP, Node.newString(Token.NAME, "C"),
                Node.newString("prototype"));
        Node lhs = new Node(Token.GETPROP, prototype, Node.newString("m"));
        Node rhs = Node.newNumber(1);
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertFalse(check.shouldTraverse(null, rhs, assign));
    }

    @Test
    public void testTraversesNonPrototypeAssignmentRightSide() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = new Node(Token.GETPROP, Node.newString(Token.NAME, "C"),
                Node.newString("m"));
        Node rhs = Node.newNumber(1);
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertTrue(check.shouldTraverse(null, rhs, assign));
    }

    @Test
    public void testVisitClearsRememberedAssignmentLeftSide() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = new Node(Token.NAME);
        Node assign = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
        assertTrue(check.shouldTraverse(null, lhs, assign));
        check.visit(null, lhs, assign);
        assertTrue(check.shouldTraverse(null, lhs, assign));
    }

    @Test
    public void testShouldTraverseFunctionInBlock() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node block = new Node(Token.BLOCK);
        Node function = new Node(Token.FUNCTION);
        block.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, block));
    }

    @Test
    public void testShouldTraverseFunctionInNumberParent() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node parent = new Node(Token.NUMBER);
        Node function = new Node(Token.FUNCTION);
        parent.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, parent));
    }

    @Test
    public void testShouldTraverseFunctionInStringParent() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node parent = Node.newString(Token.STRING, "key");
        Node function = new Node(Token.FUNCTION);
        parent.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, parent));
    }
}
```