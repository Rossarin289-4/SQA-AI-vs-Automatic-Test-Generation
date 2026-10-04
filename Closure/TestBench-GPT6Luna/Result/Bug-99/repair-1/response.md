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
    public void testNonFunctionIsTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        assertTrue(check.shouldTraverse(null, new Node(Token.NAME), null));
    }

    @Test
    public void testFunctionInBlockIsTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node block = new Node(Token.BLOCK);
        Node function = new Node(Token.FUNCTION);
        block.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, block));
    }

    @Test
    public void testFunctionInScriptIsTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node script = new Node(Token.SCRIPT);
        Node function = new Node(Token.FUNCTION);
        script.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, script));
    }

    @Test
    public void testFunctionAsNameIsTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node name = Node.newString(Token.NAME, "f");
        Node function = new Node(Token.FUNCTION);
        name.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, name));
    }

    @Test
    public void testFunctionAsAssignmentRhsIsTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "f"),
                new Node(Token.FUNCTION));
        assertTrue(check.shouldTraverse(null, assign.getLastChild(), assign));
    }

    @Test
    public void testFunctionInUnsupportedParentIsNotTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node parent = new Node(Token.CALL);
        Node function = new Node(Token.FUNCTION);
        parent.addChildToBack(function);
        assertFalse(check.shouldTraverse(null, function, parent));
    }

    @Test
    public void testAnnotatedConstructorFunctionIsNotTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node block = new Node(Token.BLOCK);
        Node function = new Node(Token.FUNCTION);
        block.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, block));
    }

    @Test
    public void testAnnotatedInterfaceFunctionIsNotTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node block = new Node(Token.BLOCK);
        Node function = new Node(Token.FUNCTION);
        block.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, block));
    }

    @Test
    public void testAnnotatedOverrideFunctionIsNotTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node block = new Node(Token.BLOCK);
        Node function = new Node(Token.FUNCTION);
        block.addChildToBack(function);
        assertTrue(check.shouldTraverse(null, function, block));
    }

    @Test
    public void testAssignmentLhsSetsTraversalState() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = Node.newString(Token.NAME, "x");
        Node assign = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
        assertTrue(check.shouldTraverse(null, lhs, assign));
        Node thisNode = new Node(Token.THIS);
        check.visit(null, thisNode, null);
        assertFalse(check.shouldTraverse(null, new Node(Token.NAME), null));
    }

    @Test
    public void testAssignmentRhsIsTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"),
                Node.newNumber(1));
        assertTrue(check.shouldTraverse(null, assign.getLastChild(), assign));
    }

    @Test
    public void testPrototypeAssignmentRhsIsNotTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = new Node(Token.GETPROP, Node.newString(Token.NAME, "A"),
                Node.newString(Token.STRING, "prototype"));
        Node assign = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
        assertFalse(check.shouldTraverse(null, assign.getLastChild(), assign));
    }

    @Test
    public void testPrototypeSubpropertyAssignmentRhsIsNotTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node prototype = new Node(Token.GETPROP, Node.newString(Token.NAME, "A"),
                Node.newString(Token.STRING, "prototype"));
        Node lhs = new Node(Token.GETPROP, prototype,
                Node.newString(Token.STRING, "x"));
        Node assign = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
        assertFalse(check.shouldTraverse(null, assign.getLastChild(), assign));
    }

    @Test
    public void testPropertyAccessRightSideIsTraversed() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = new Node(Token.GETPROP, Node.newString(Token.NAME, "A"),
                Node.newString(Token.STRING, "x"));
        Node assign = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
        assertTrue(check.shouldTraverse(null, assign.getLastChild(), assign));
    }

    @Test
    public void testVisitClearsAssignmentLhsState() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = Node.newString(Token.NAME, "x");
        Node assign = new Node(Token.ASSIGN, lhs, Node.newNumber(1));
        assertTrue(check.shouldTraverse(null, lhs, assign));
        check.visit(null, lhs, assign);
        assertTrue(check.shouldTraverse(null, new Node(Token.NAME), null));
    }

    @Test
    public void testVisitWithoutAssignmentStateDoesNotThrow() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        check.visit(null, new Node(Token.THIS), null);
        assertTrue(check.shouldTraverse(null, new Node(Token.NAME), null));
    }
}
```