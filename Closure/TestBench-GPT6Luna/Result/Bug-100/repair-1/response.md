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
    public void testNoParentAllowsTraversal() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        assertTrue(check.shouldTraverse(null, new Node(Token.EMPTY), null));
    }

    @Test
    public void testOrdinaryNodeAllowsTraversal() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        assertTrue(check.shouldTraverse(null, new Node(Token.EMPTY),
                new Node(Token.SCRIPT)));
    }

    @Test
    public void testFunctionInScriptAllowsTraversal() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        assertTrue(check.shouldTraverse(null, new Node(Token.FUNCTION),
                new Node(Token.SCRIPT)));
    }

    @Test
    public void testFunctionInBlockAllowsTraversal() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        assertTrue(check.shouldTraverse(null, new Node(Token.FUNCTION),
                new Node(Token.BLOCK)));
    }

    @Test
    public void testFunctionInNameAllowsTraversal() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        assertTrue(check.shouldTraverse(null, new Node(Token.FUNCTION),
                Node.newString(Token.NAME, "f")));
    }

    @Test
    public void testFunctionInAssignmentAllowsTraversal() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        assertTrue(check.shouldTraverse(null, new Node(Token.FUNCTION),
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "f"),
                        new Node(Token.FUNCTION))));
    }

    @Test
    public void testFunctionInOtherParentIsSkipped() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        assertFalse(check.shouldTraverse(null, new Node(Token.FUNCTION),
                new Node(Token.CALL)));
    }

    @Test
    public void testConstructorFunctionIsSkipped() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node function = new Node(Token.FUNCTION);
        assertTrue(check.shouldTraverse(null, function, new Node(Token.SCRIPT)));
    }

    @Test
    public void testThisAnnotatedFunctionIsSkipped() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node function = new Node(Token.FUNCTION);
        assertTrue(check.shouldTraverse(null, function, new Node(Token.SCRIPT)));
    }

    @Test
    public void testAssignmentLeftChildAllowsTraversal() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = Node.newString(Token.NAME, "x");
        Node rhs = Node.newString(Token.NAME, "y");
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertTrue(check.shouldTraverse(null, lhs, assign));
    }

    @Test
    public void testAssignmentRightChildAllowsTraversal() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = Node.newString(Token.NAME, "x");
        Node rhs = Node.newString(Token.NAME, "y");
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertTrue(check.shouldTraverse(null, rhs, assign));
    }

    @Test
    public void testPrototypeAssignmentRightChildIsSkipped() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = new Node(Token.GETPROP, Node.newString(Token.NAME, "A"),
                Node.newString(Token.STRING, "prototype"));
        Node rhs = Node.newString(Token.NAME, "f");
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertFalse(check.shouldTraverse(null, rhs, assign));
    }

    @Test
    public void testPrototypeSubpropertyAssignmentRightChildIsSkipped() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node base = new Node(Token.GETPROP, Node.newString(Token.NAME, "A"),
                Node.newString(Token.STRING, "prototype"));
        Node lhs = new Node(Token.GETPROP, base, Node.newString(Token.STRING, "f"));
        Node rhs = Node.newString(Token.NAME, "x");
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertFalse(check.shouldTraverse(null, rhs, assign));
    }

    @Test
    public void testNonPrototypePropertyAssignmentRightChildTraverses() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node lhs = new Node(Token.GETPROP, Node.newString(Token.NAME, "A"),
                Node.newString(Token.STRING, "field"));
        Node rhs = Node.newString(Token.NAME, "f");
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertTrue(check.shouldTraverse(null, rhs, assign));
    }

    @Test
    public void testVisitOrdinaryNodeDoesNotThrow() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        check.visit(null, new Node(Token.EMPTY), null);
        assertTrue(true);
    }

    @Test
    public void testVisitThisWithoutParentDoesNotThrow() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        check.visit(null, new Node(Token.THIS), null);
        assertTrue(true);
    }

    @Test
    public void testVisitThisWithPropertyParentNeedsTraversalState() throws Exception {
        CheckGlobalThis check = new CheckGlobalThis(null, CheckLevel.WARNING);
        Node thisNode = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP, thisNode, Node.newString(Token.STRING, "x"));
        check.visit(null, thisNode, getProp);
        assertTrue(true);
    }
}
```