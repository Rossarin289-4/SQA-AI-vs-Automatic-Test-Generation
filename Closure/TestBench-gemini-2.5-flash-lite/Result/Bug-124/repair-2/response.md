```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ExploitAssignsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCollapseSimpleAssign() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newNumber(1.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextAssignNode = Node.newAssign(Node.newName("a"), Node.newName("x"));
        Node nextExpr = Node.newExpr(nextAssignNode);
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: x = 1; a = x;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(1.0, parent.getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("a", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseImmutableValue() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newString("hello"));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextExpr = Node.newExpr(Node.newString("hello"));
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: x = "hello"; "hello" = x;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals("hello", parent.getFirstChild().getLastChild().getString());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("hello", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseImmutableValueIntoName() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newNumber(42.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextExpr = Node.newExpr(Node.newName("y"));
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: x = 42; y = x;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(42.0, parent.getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseBoolean() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("flag"), Node.newTrue());
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextExpr = Node.newExpr(Node.newName("b"));
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: flag = true; b = flag;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("flag", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getFirstChild().getLastChild().getType());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("b", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("flag", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseGetPropOnThis() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node thisNode = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP, thisNode, Node.newString("prop"));
        Node assignNode = Node.newAssign(getProp, Node.newNumber(10.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextExpr = Node.newExpr(Node.newName("c"));
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: this.prop = 10; c = this.prop;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals(Token.GETPROP, parent.getFirstChild().getFirstChild().getType());
        assertEquals(Token.THIS, parent.getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals("prop", parent.getFirstChild().getFirstChild().getLastChild().getString());
        assertEquals(10.0, parent.getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("c", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.GETPROP, parent.getLastChild().getFirstChild().getLastChild().getType());
        assertEquals(Token.THIS, parent.getLastChild().getFirstChild().getLastChild().getFirstChild().getType());
        assertEquals("prop", parent.getLastChild().getFirstChild().getLastChild().getLastChild().getString());
    }

    @Test
    public void testCollapseNestedAssign() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node nestedAssign = Node.newAssign(Node.newName("y"), Node.newNumber(2.0));
        Node assignNode = Node.newAssign(Node.newName("x"), nestedAssign);
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextExpr = Node.newExpr(Node.newName("z"));
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: x = y = 2; z = x;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getLastChild().getType());
        assertEquals("y", parent.getFirstChild().getLastChild().getFirstChild().getString());
        assertEquals(2.0, parent.getFirstChild().getLastChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("z", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testNoCollapseGetPropOnNonThis() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node obj = Node.newName("obj");
        Node getProp = new Node(Token.GETPROP, obj, Node.newString("prop"));
        Node assignNode = Node.newAssign(getProp, Node.newNumber(10.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextExpr = Node.newExpr(Node.newName("c"));
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: obj.prop = 10; c = obj.prop; (no change to the first assign)
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals(Token.GETPROP, parent.getFirstChild().getFirstChild().getFirstChild().getType());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("c", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.GETPROP, parent.getLastChild().getFirstChild().getLastChild().getType());
    }

    @Test
    public void testNoCollapseComplexValue() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node add = Node.newAdd(Node.newNumber(1.0), Node.newNumber(2.0));
        Node assignNode = Node.newAssign(Node.newName("x"), add);
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextExpr = Node.newExpr(Node.newName("y"));
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: x = 1 + 2; y = x; (no change to the first assign)
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals(Token.ADD, parent.getFirstChild().getFirstChild().getLastChild().getType());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseValueIntoAnd() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newTrue());
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextAnd = Node.newAnd(Node.newName("y"), Node.newTrue());
        parent.addChildToBack(Node.newExpr(nextAnd));

        peephole.optimizeSubtree(parent);

        // Expected: x = true; y = x && true;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getFirstChild().getLastChild().getType());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.AND, parent.getLastChild().getFirstChild().getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseValueIntoOr() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newTrue());
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextOr = Node.newOr(Node.newName("y"), Node.newTrue());
        parent.addChildToBack(Node.newExpr(nextOr));

        peephole.optimizeSubtree(parent);

        // Expected: x = true; y = x || true;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getFirstChild().getLastChild().getType());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.OR, parent.getLastChild().getFirstChild().getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseValueIntoHook() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newTrue());
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node condition = Node.newName("y");
        Node thenBranch = Node.newAssign(Node.newName("x"), Node.newNumber(1.0)); // Use x here
        Node elseBranch = Node.newNumber(2.0);
        Node hook = new Node(Token.HOOK, condition, thenBranch, elseBranch);
        parent.addChildToBack(Node.newExpr(hook));

        peephole.optimizeSubtree(parent);

        // Expected: x = true; y ? x = 1 : 2;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getFirstChild().getLastChild().getType());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.HOOK, parent.getLastChild().getFirstChild().getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getChildAtIndex(1).getType());
        assertEquals("x", parent.getLastChild().getFirstChild().getChildAtIndex(1).getFirstChild().getString());
        assertEquals(1.0, parent.getLastChild().getFirstChild().getChildAtIndex(1).getLastChild().getDouble(), 0.0);
        assertEquals(2.0, parent.getLastChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testCollapseValueIntoIf() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newTrue());
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node condition = Node.newName("y");
        Node thenBranch = Node.newAssign(Node.newName("x"), Node.newNumber(1.0)); // Use x here
        Node ifNode = new Node(Token.IF, condition, thenBranch);
        parent.addChildToBack(ifNode);

        peephole.optimizeSubtree(parent);

        // Expected: x = true; if (y) x = 1;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getFirstChild().getLastChild().getType());

        assertEquals(Token.IF, parent.getLastChild().getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getString());
        assertEquals(Token.ASSIGN, parent.getLastChild().getChildAtIndex(1).getType());
        assertEquals("x", parent.getLastChild().getChildAtIndex(1).getFirstChild().getString());
        assertEquals(1.0, parent.getLastChild().getChildAtIndex(1).getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testCollapseValueIntoReturn() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newTrue());
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node returnNode = new Node(Token.RETURN, Node.newName("x")); // Return x
        parent.addChildToBack(returnNode);

        peephole.optimizeSubtree(parent);

        // Expected: x = true; return x;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getFirstChild().getLastChild().getType());

        assertEquals(Token.RETURN, parent.getLastChild().getType());
        assertEquals("x", parent.getLastChild().getFirstChild().getString());
    }

    @Test
    public void testCollapseValueIntoVarWithChildren() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newTrue());
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node varX = Node.newVar("x"); // Declaring x
        Node varY = Node.newVar("y");
        Node assignmentToY = Node.newAssign(Node.newName("y"), Node.newName("x"));
        Node varNode = Node.newExpr(assignmentToY); // Wrap assignment in EXPR_RESULT
        Node blockWithVar = Node.newBlock(varX, varY, varNode);
        parent.addChildToBack(blockWithVar);

        peephole.optimizeSubtree(parent);

        // Expected: x = true; var x; var y = x;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getFirstChild().getLastChild().getType());

        Node secondPart = parent.getLastChild();
        assertEquals(Token.BLOCK, secondPart.getType());
        assertEquals(3, secondPart.getChildCount());
        Node firstInSecondPart = secondPart.getFirstChild();
        assertEquals(Token.VAR, firstInSecondPart.getType());
        assertEquals("x", firstInSecondPart.getFirstChild().getString());

        Node secondInSecondPart = firstInSecondPart.getNext();
        assertEquals(Token.VAR, secondInSecondPart.getType());
        assertEquals("y", secondInSecondPart.getFirstChild().getString());

        Node thirdInSecondPart = secondInSecondPart.getNext();
        assertEquals(Token.EXPR_RESULT, thirdInSecondPart.getType());
        assertEquals(Token.ASSIGN, thirdInSecondPart.getFirstChild().getType());
        assertEquals("y", thirdInSecondPart.getFirstChild().getFirstChild().getString());
        assertEquals("x", thirdInSecondPart.getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseValueIntoVarWithoutChildren() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newTrue());
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node varNode = Node.newVar("y"); // var y;
        parent.addChildToBack(varNode);

        peephole.optimizeSubtree(parent);

        // Expected: x = true; var y; (no change)
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getFirstChild().getLastChild().getType());

        assertEquals(Token.VAR, parent.getLastChild().getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getString());
    }

    @Test
    public void testNoCollapseAssignToNonSimpleLValue() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newGetElem(Node.newName("arr"), Node.newNumber(0.0)), Node.newNumber(5.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextExpr = Node.newExpr(Node.newName("b"));
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: arr[0] = 5; b = arr[0]; (no change to first assign)
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals(Token.GETELEM, parent.getFirstChild().getFirstChild().getFirstChild().getType());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("b", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.GETELEM, parent.getLastChild().getFirstChild().getLastChild().getType());
    }

    @Test
    public void testCollapseAssignToQualifiedNameInAnotherAssign() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newNumber(1.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextAssignLhs = Node.newQualifiedName("x.y"); // Represents x.y
        Node nextAssign = Node.newAssign(nextAssignLhs, Node.newNumber(2.0));
        parent.addChildToBack(Node.newExpr(nextAssign));

        peephole.optimizeSubtree(parent);

        // Expected: x = 1; x.y = 2; (no change to first assign)
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getFirstChild().getString());
        assertEquals(1.0, parent.getFirstChild().getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals(Token.GETPROP, parent.getLastChild().getFirstChild().getFirstChild().getType());
        assertEquals("x", parent.getLastChild().getFirstChild().getFirstChild().getFirstChild().getString());
        assertEquals("y", parent.getLastChild().getFirstChild().getFirstChild().getLastChild().getString());
        assertEquals(2.0, parent.getLastChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testCollapseImmutableValueIntoQualifiedName() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newString("abc"));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextQualifiedName = Node.newQualifiedName("x"); // Represents x.prop
        Node getProp = new Node(Token.GETPROP, nextQualifiedName, Node.newString("prop"));
        Node nextExpr = Node.newExpr(getProp);
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: x = "abc"; x.prop;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals("abc", parent.getFirstChild().getLastChild().getString());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.GETPROP, parent.getLastChild().getFirstChild().getType());
        assertEquals("x", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("prop", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testNoCollapseIfNameAssignedInSecondPart() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newNumber(1.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextAssign = Node.newAssign(Node.newName("x"), Node.newNumber(2.0));
        parent.addChildToBack(Node.newExpr(nextAssign));

        peephole.optimizeSubtree(parent);

        // Expected: x = 1; x = 2; (no change)
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(1.0, parent.getFirstChild().getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("x", parent.getLastChild().getFirstChild().getString());
        assertEquals(2.0, parent.getLastChild().getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testCollapseWithVarAssignment() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newNumber(1.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node varX = Node.newVar("x"); // Declaring x
        Node varY = Node.newVar("y");
        Node assignmentToY = Node.newAssign(Node.newName("y"), Node.newName("x"));
        Node blockWithVar = Node.newBlock(varX, varY, Node.newExpr(assignmentToY));
        parent.addChildToBack(blockWithVar);

        peephole.optimizeSubtree(parent);

        // Expected: x = 1; { var x; var y = x; }
        // The optimization should not happen here because `var x` in the second part
        // shadows the `x` from the first part.
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(1.0, parent.getFirstChild().getFirstChild().getLastChild().getDouble(), 0.0);

        Node secondPart = parent.getLastChild();
        assertEquals(Token.BLOCK, secondPart.getType());
        assertEquals(3, secondPart.getChildCount());
        Node firstInSecondPart = secondPart.getFirstChild();
        assertEquals(Token.VAR, firstInSecondPart.getType());
        assertEquals("x", firstInSecondPart.getFirstChild().getString());

        Node secondInSecondPart = firstInSecondPart.getNext();
        assertEquals(Token.VAR, secondInSecondPart.getType());
        assertEquals("y", secondInSecondPart.getFirstChild().getString());

        Node thirdInSecondPart = secondInSecondPart.getNext();
        assertEquals(Token.EXPR_RESULT, thirdInSecondPart.getType());
        assertEquals(Token.ASSIGN, thirdInSecondPart.getFirstChild().getType());
        assertEquals("y", thirdInSecondPart.getFirstChild().getFirstChild().getString());
        assertEquals("x", thirdInSecondPart.getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseInConditionalAssignment() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newTrue());
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node condition = Node.newName("cond");
        Node thenPart = Node.newAssign(Node.newName("y"), Node.newTrue());
        Node elsePart = Node.newAssign(Node.newName("y"), Node.newFalse());
        Node hook = new Node(Token.HOOK, condition, thenPart, elsePart);
        parent.addChildToBack(Node.newExpr(hook));

        peephole.optimizeSubtree(parent);

        // Expected: x = true; cond ? y = true : y = false;
        // The assignment to `x` should be collapsed into the right side of the hook.
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getFirstChild().getLastChild().getType());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.HOOK, parent.getLastChild().getFirstChild().getType());
        assertEquals("cond", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getChildAtIndex(1).getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getChildAtIndex(1).getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getLastChild().getFirstChild().getChildAtIndex(1).getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getLastChild().getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getLastChild().getFirstChild().getString());
        assertEquals(Token.FALSE, parent.getLastChild().getFirstChild().getLastChild().getLastChild().getType());
    }

    @Test
    public void testNoCollapseIfNextIsDifferentImmutable() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newNumber(1.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextExpr = Node.newExpr(Node.newNumber(2.0)); // Different immutable value
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: x = 1; 2; (no change)
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(1.0, parent.getFirstChild().getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.NUMBER, parent.getLastChild().getFirstChild().getType());
        assertEquals(2.0, parent.getLastChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testCollapseWithCommaOperator() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newTrue());
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node firstArg = Node.newName("y");
        Node secondArg = Node.newName("x"); // Should be collapsed
        Node comma = new Node(Token.COMMA, firstArg, secondArg);
        parent.addChildToBack(Node.newExpr(comma));

        peephole.optimizeSubtree(parent);

        // Expected: x = true; y, x;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(Token.TRUE, parent.getFirstChild().getLastChild().getType());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.COMMA, parent.getLastChild().getFirstChild().getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseGetPropOnThisIntoAnotherGetProp() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node thisNode = new Node(Token.THIS);
        Node getProp1 = new Node(Token.GETPROP, thisNode, Node.newString("prop1"));
        Node assignNode = Node.newAssign(getProp1, Node.newNumber(10.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node obj2 = new Node(Token.GETPROP, new Node(Token.THIS), Node.newString("prop2"));
        Node getProp2 = new Node(Token.GETPROP, obj2, Node.newString("prop3"));
        parent.addChildToBack(Node.newExpr(getProp2));

        peephole.optimizeSubtree(parent);

        // Expected: this.prop1 = 10; this.prop2.prop3;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals(Token.GETPROP, parent.getFirstChild().getFirstChild().getType());
        assertEquals(Token.THIS, parent.getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals("prop1", parent.getFirstChild().getFirstChild().getLastChild().getString());
        assertEquals(10.0, parent.getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.GETPROP, parent.getLastChild().getFirstChild().getType());
        assertEquals(Token.GETPROP, parent.getLastChild().getFirstChild().getFirstChild().getType());
        assertEquals(Token.THIS, parent.getLastChild().getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals("prop2", parent.getLastChild().getFirstChild().getFirstChild().getLastChild().getString());
        assertEquals("prop3", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseImmutableValueIntoGetProp() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newString("value"));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node obj = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP, obj, Node.newString("prop"));
        parent.addChildToBack(Node.newExpr(getProp));

        peephole.optimizeSubtree(parent);

        // Expected: x = "value"; this.prop;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals("value", parent.getFirstChild().getLastChild().getString());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.GETPROP, parent.getLastChild().getFirstChild().getType());
        assertEquals(Token.THIS, parent.getLastChild().getFirstChild().getFirstChild().getType());
        assertEquals("prop", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testNoCollapseIfValueIsSelfAssigned() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newName("x")); // x = x
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextExpr = Node.newExpr(Node.newName("y"));
        parent.addChildToBack(nextExpr);

        peephole.optimizeSubtree(parent);

        // Expected: x = x; y = x; (no change to first assign)
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals("x", parent.getFirstChild().getFirstChild().getLastChild().getString());

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals("y", parent.getLastChild().getFirstChild().getFirstChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseAssignToGetPropOnThis() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node assignNode = Node.newAssign(Node.newName("x"), Node.newNumber(1.0));
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node thisNode = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP, thisNode, Node.newString("prop"));
        Node nextAssign = Node.newAssign(getProp, Node.newName("x"));
        parent.addChildToBack(Node.newExpr(nextAssign));

        peephole.optimizeSubtree(parent);

        // Expected: x = 1; this.prop = x;
        assertEquals(Token.ASSIGN, parent.getFirstChild().getType());
        assertEquals("x", parent.getFirstChild().getFirstChild().getString());
        assertEquals(1.0, parent.getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals(Token.GETPROP, parent.getLastChild().getFirstChild().getFirstChild().getType());
        assertEquals(Token.THIS, parent.getLastChild().getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals("prop", parent.getLastChild().getFirstChild().getFirstChild().getLastChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }

    @Test
    public void testCollapseAssignToGetPropOnThisIntoItself() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node thisNode = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP, thisNode, Node.newString("prop"));
        Node assignNode = Node.newAssign(getProp, Node.newNumber(1.0)); // this.prop = 1
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextAssign = Node.newAssign(getProp, Node.newName("x")); // this.prop = x
        parent.addChildToBack(Node.newExpr(nextAssign));

        peephole.optimizeSubtree(parent);

        // Expected: this.prop = 1; this.prop = x; (no change)
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals(Token.GETPROP, parent.getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals(Token.THIS, parent.getFirstChild().getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals("prop", parent.getFirstChild().getFirstChild().getFirstChild().getLastChild().getString());
        assertEquals(1.0, parent.getFirstChild().getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals(Token.GETPROP, parent.getLastChild().getFirstChild().getFirstChild().getType());
        assertEquals(Token.THIS, parent.getLastChild().getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals("prop", parent.getLastChild().getFirstChild().getFirstChild().getLastChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }
}
```

1. SOURCE CODE ANALYSIS - The code optimizes assignments by chaining them if possible. Tests cover simple variable assignments, immutable values, property assignments (`getprop`) on `this`, nested assignments, and assignments within logical and conditional expressions.
2. TEST CASE DESIGN - Tests cover scenarios like `x = 1; a = x;`, `x = "hello"; "hello" = x;`, `this.prop = 10; c = this.prop;`, `x = y = 2; z = x;`, and `x = true; y = x && true;`. Expected results are derived by tracing the `collapseAssign` and `collapseAssignEqualTo` methods.
4. DEFECT DETECTION STRATEGY - Tests focus on the logic within `collapseAssign` and `collapseAssignEqualTo`, particularly how different node types and their values are handled when attempting to chain assignments.
5. SUMMARY - 28 tests.
6. LIMITATIONS - Tests focus on successful collapses and non-collapses. Edge cases like extremely large numbers or complex objects are not explicitly tested due to limitations in test generation. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.