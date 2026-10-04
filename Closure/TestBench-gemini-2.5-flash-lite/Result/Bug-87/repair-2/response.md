```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.regex.Pattern;
import java.io.IOException; // Added for potential exceptions if needed by underlying methods.

public class PeepholeSubstituteAlternateSyntaxTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock AbstractCompiler to avoid instantiation issues. The actual methods tested
    // don't seem to rely on its full functionality in these tests.
    private final PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(null);

    // Helper methods to create nodes
    private Node makeNode(int type, Node... children) {
        Node n = new Node(type);
        for (Node child : children) {
            n.addChildToBack(child);
        }
        return n;
    }

    private Node makeExprResultNode(Node child) {
        return makeNode(Token.EXPR_RESULT, child);
    }

    private Node makeCallNode(Node target, Node... args) {
        Node call = makeNode(Token.CALL, target);
        for (Node arg : args) {
            call.addChildToBack(arg);
        }
        return call;
    }

    private Node makeNewNode(Node target, Node... args) {
        Node call = makeNode(Token.NEW, target);
        for (Node arg : args) {
            call.addChildToBack(arg);
        }
        return call;
    }

    private Node makeNameNode(String name) {
        return Node.newString(name);
    }

    private Node makeStringNode(String value) {
        return Node.newString(value);
    }

    private Node makeNumberNode(double value) {
        return Node.newNumber(value);
    }

    private Node makeBooleanNode(boolean value) {
        return new Node(value ? Token.TRUE : Token.FALSE);
    }

    // Mocking reportCodeChange and isASTNormalized as they are called internally
    // by optimizeSubtree but are not directly tested.
    private void reportCodeChange() {
        // Mock implementation
    }

    private boolean isASTNormalized() {
        // Mock implementation
        return true;
    }

    // Mocking error method as it is called in tryFoldRegularExpressionConstructor
    private void error(DiagnosticType type, Node node) {
        // Mock implementation
    }

    // The primary method to test
    private Node optimize(Node node) {
        return peephole.optimizeSubtree(node);
    }

    @Test
    public void testReduceReturnUndefined() {
        Node returnNode = makeNode(Token.RETURN, makeNameNode("undefined"));
        Node optimized = optimize(returnNode);
        assertEquals(Token.RETURN, optimized.getType());
        assertFalse(optimized.hasChildren());
    }

    @Test
    public void testReduceReturnVoid() {
        Node voidNode = makeNode(Token.VOID, makeNumberNode(1)); // Side effects don't matter here for reduction
        Node returnNode = makeNode(Token.RETURN, voidNode);
        Node optimized = optimize(returnNode);
        assertEquals(Token.RETURN, optimized.getType());
        assertFalse(optimized.hasChildren());
    }

    @Test
    public void testReduceReturnVoidWithSideEffect() {
        Node voidNode = makeNode(Token.VOID, makeCallNode(makeNameNode("alert"), makeStringNode("side effect")));
        Node returnNode = makeNode(Token.RETURN, voidNode);
        Node optimized = optimize(returnNode);
        assertEquals(Token.RETURN, optimized.getType());
        assertTrue(optimized.hasChildren()); // Should not remove if side effect
        assertEquals(Token.VOID, optimized.getFirstChild().getType());
    }

    @Test
    public void testReduceReturnVoidNoSideEffect() {
        Node voidNode = makeNode(Token.VOID, makeNumberNode(1));
        Node returnNode = makeNode(Token.RETURN, voidNode);
        Node optimized = optimize(returnNode);
        assertEquals(Token.RETURN, optimized.getType());
        assertFalse(optimized.hasChildren());
    }

    @Test
    public void testReduceReturnVoidNoChild() {
        Node voidNode = makeNode(Token.VOID); // void with no operand
        Node returnNode = makeNode(Token.RETURN, voidNode);
        Node optimized = optimize(returnNode);
        assertEquals(Token.RETURN, optimized.getType());
        assertFalse(optimized.hasChildren());
    }

    @Test
    public void testMinimizeNotEqual() {
        Node left = makeNameNode("a");
        Node right = makeNameNode("b");
        Node ne = makeNode(Token.NE, left, right);
        Node not = makeNode(Token.NOT, ne);
        // Need to ensure the node has a parent for replacement to work correctly
        Node parent = makeNode(Token.EXPR_RESULT, not);
        Node optimized = optimize(not);
        assertEquals(Token.EQ, optimized.getType());
        assertEquals("a", optimized.getFirstChild().getString());
        assertEquals("b", optimized.getLastChild().getString());
    }

    @Test
    public void testMinimizeNotStrictEqual() {
        Node left = makeNameNode("a");
        Node right = makeNameNode("b");
        Node sheq = makeNode(Token.SHEQ, left, right);
        Node not = makeNode(Token.NOT, sheq);
        Node parent = makeNode(Token.EXPR_RESULT, not);
        Node optimized = optimize(not);
        assertEquals(Token.SHNE, optimized.getType());
        assertEquals("a", optimized.getFirstChild().getString());
        assertEquals("b", optimized.getLastChild().getString());
    }

    @Test
    public void testMinimizeNotGreaterThan() {
        Node left = makeNameNode("a");
        Node right = makeNameNode("b");
        Node gt = makeNode(Token.GT, left, right);
        Node not = makeNode(Token.NOT, gt);
        Node parent = makeNode(Token.EXPR_RESULT, not);
        Node optimized = optimize(not); // Should not change GT
        assertEquals(Token.NOT, optimized.getType());
        assertEquals(Token.GT, optimized.getFirstChild().getType());
    }

    @Test
    public void testMinimizeIfElseBlock() {
        Node cond = makeNameNode("x");
        Node thenBranch = makeExprResultNode(makeNode(Token.ASSIGN, makeNameNode("y"), makeNumberNode(1)));
        Node elseBranch = makeExprResultNode(makeNode(Token.ASSIGN, makeNameNode("y"), makeNumberNode(2)));
        Node ifNode = makeNode(Token.IF, cond, thenBranch, elseBranch);
        Node parent = makeNode(Token.BLOCK, ifNode); // IF inside a block
        Node optimized = optimize(ifNode);

        // The optimization converts IF(cond, THEN, ELSE) to an assignment like "y = cond ? 1 : 2;"
        // The result of optimizeSubtree should be the new EXPR_RESULT node.
        assertEquals(Token.EXPR_RESULT, optimized.getType());
        Node assignmentNode = optimized.getFirstChild();
        assertEquals(Token.ASSIGN, assignmentNode.getType());
        assertEquals("y", assignmentNode.getFirstChild().getString()); // LHS
        Node hookNode = assignmentNode.getLastChild(); // RHS
        assertEquals(Token.HOOK, hookNode.getType());
        assertEquals("x", hookNode.getFirstChild().getString()); // Condition
        assertEquals("1", hookNode.getSecondChild().getString()); // True branch
        assertEquals("2", hookNode.getLastChild().getString());   // False branch
    }

    @Test
    public void testMinimizeIfElseNoElse() {
        Node cond = makeNameNode("x");
        Node thenBranch = makeExprResultNode(makeCallNode(makeNameNode("foo")));
        Node ifNode = makeNode(Token.IF, cond, thenBranch);
        Node parent = makeNode(Token.BLOCK, ifNode);
        Node optimized = optimize(ifNode);
        assertEquals(Token.EXPR_RESULT, optimized.getType());
        assertEquals(Token.AND, optimized.getFirstChild().getType());
        assertEquals("x", optimized.getFirstChild().getFirstChild().getString());
        assertEquals("foo", optimized.getFirstChild().getLastChild().getFirstChild().getString());
    }

    @Test
    public void testMinimizeIfElseNoElseNotCondition() {
        Node cond = makeNode(Token.NOT, makeNameNode("x"));
        Node thenBranch = makeExprResultNode(makeCallNode(makeNameNode("bar")));
        Node ifNode = makeNode(Token.IF, cond, thenBranch);
        Node parent = makeNode(Token.BLOCK, ifNode);
        Node optimized = optimize(ifNode);
        assertEquals(Token.EXPR_RESULT, optimized.getType());
        assertEquals(Token.OR, optimized.getFirstChild().getType()); // if(!x) bar() -> x || bar()
        assertEquals("x", optimized.getFirstChild().getFirstChild().getString());
        assertEquals("bar", optimized.getFirstChild().getLastChild().getFirstChild().getString());
    }

    @Test
    public void testMinimizeIfReturn() {
        Node cond = makeNameNode("x");
        Node thenBranch = makeNode(Token.BLOCK, makeNode(Token.RETURN, makeNumberNode(1)));
        Node elseBranch = makeNode(Token.BLOCK, makeNode(Token.RETURN, makeNumberNode(2)));
        Node ifNode = makeNode(Token.IF, cond, thenBranch, elseBranch);
        Node parent = makeNode(Token.BLOCK, ifNode);
        Node optimized = optimize(ifNode);
        assertEquals(Token.RETURN, optimized.getType());
        assertEquals(Token.HOOK, optimized.getFirstChild().getType());
        assertEquals("x", optimized.getFirstChild().getFirstChild().getString());
        assertEquals("1", optimized.getFirstChild().getSecondChild().getString());
        assertEquals("2", optimized.getFirstChild().getLastChild().getString());
    }

    @Test
    public void testMinimizeIfReturnNoElse() {
        Node cond = makeNameNode("x");
        Node thenBranch = makeNode(Token.BLOCK, makeNode(Token.RETURN, makeNumberNode(1)));
        Node ifNode = makeNode(Token.IF, cond, thenBranch);
        Node parent = makeNode(Token.BLOCK, ifNode);
        Node optimized = optimize(ifNode);
        assertEquals(Token.EXPR_RESULT, optimized.getType());
        assertEquals(Token.AND, optimized.getFirstChild().getType()); // if(x) return 1 -> x && return 1
        assertEquals("x", optimized.getFirstChild().getFirstChild().getString());
        // The second child should be the RETURN node itself.
        Node returnedNode = optimized.getFirstChild().getLastChild();
        assertEquals(Token.RETURN, returnedNode.getType());
        assertEquals("1", returnedNode.getFirstChild().getString());
    }

    @Test
    public void testMinimizeIfWithDanglingElse() {
        Node cond = makeNameNode("x");
        Node thenBranch = makeNode(Token.IF, makeNameNode("y"), makeExprResultNode(makeNumberNode(1))); // Inner IF with no else
        Node elseBranch = makeExprResultNode(makeNumberNode(2));
        Node ifNode = makeNode(Token.IF, cond, thenBranch, elseBranch);
        Node parent = makeNode(Token.BLOCK, ifNode);
        Node optimized = optimize(ifNode);
        // This should not be transformed because of dangling else
        assertEquals(Token.IF, optimized.getType());
        assertEquals(cond, optimized.getFirstChild());
        assertEquals(thenBranch, optimized.getSecondChild());
        assertEquals(elseBranch, optimized.getLastChild());
    }

    @Test
    public void testMinimizeIfSwapBranches() {
        Node cond = makeNode(Token.NOT, makeNameNode("x"));
        Node thenBranch = makeExprResultNode(makeNumberNode(1));
        Node elseBranch = makeExprResultNode(makeNumberNode(2));
        Node ifNode = makeNode(Token.IF, cond, thenBranch, elseBranch);
        Node parent = makeNode(Token.BLOCK, ifNode);
        Node optimized = optimize(ifNode);
        // if(!x) 1; else 2; -> if(x) 2; else 1;
        assertEquals(Token.IF, optimized.getType());
        // The condition should become !(!x) which is x
        Node innerCond = optimized.getFirstChild();
        assertEquals(Token.NOT, innerCond.getType());
        assertEquals(Token.NOT, innerCond.getFirstChild().getType());
        assertEquals("x", innerCond.getFirstChild().getFirstChild().getString());

        assertEquals(Token.EXPR_RESULT, optimized.getSecondChild().getType());
        assertEquals("2", optimized.getSecondChild().getFirstChild().getString()); // then branch is now 2
        assertEquals(Token.EXPR_RESULT, optimized.getLastChild().getType());
        assertEquals("1", optimized.getLastChild().getFirstChild().getString()); // else branch is now 1
    }

    @Test
    public void testMinimizeIfVarElseAssign() {
        Node cond = makeNameNode("x");
        Node thenVar = makeNode(Token.VAR, makeNode(Token.NAME, Node.newString("y")));
        thenVar.getChildAtIndex(0).addChildToBack(makeNumberNode(1)); // var y = 1
        Node thenBranch = makeNode(Token.BLOCK, thenVar);

        Node elseAssign = makeNode(Token.ASSIGN, makeNameNode("y"), makeNumberNode(2));
        Node elseBranch = makeExprResultNode(elseAssign);

        Node ifNode = makeNode(Token.IF, cond, thenBranch, elseBranch);
        Node parent = makeNode(Token.BLOCK, ifNode);
        Node optimized = optimize(ifNode);

        // Expected: var y = x ? 1 : 2;
        assertEquals(Token.VAR, optimized.getType());
        assertEquals("y", optimized.getFirstChild().getString()); // Variable name
        Node hookNode = optimized.getSecondChild(); // The initializer expression
        assertEquals(Token.HOOK, hookNode.getType());
        assertEquals("x", hookNode.getFirstChild().getString()); // Condition
        assertEquals("1", hookNode.getSecondChild().getString()); // True branch value
        assertEquals("2", hookNode.getLastChild().getString());   // False branch value
    }

    @Test
    public void testMinimizeIfAssignElseVar() {
        Node cond = makeNameNode("x");
        Node thenAssign = makeNode(Token.ASSIGN, makeNameNode("y"), makeNumberNode(1));
        Node thenBranch = makeExprResultNode(thenAssign);

        Node elseVar = makeNode(Token.VAR, makeNode(Token.NAME, Node.newString("y")));
        elseVar.getChildAtIndex(0).addChildToBack(makeNumberNode(2)); // var y = 2
        Node elseBranch = makeNode(Token.BLOCK, elseVar);

        Node ifNode = makeNode(Token.IF, cond, thenBranch, elseBranch);
        Node parent = makeNode(Token.BLOCK, ifNode);
        Node optimized = optimize(ifNode);

        // Expected: var y = x ? 1 : 2;
        assertEquals(Token.VAR, optimized.getType());
        assertEquals("y", optimized.getFirstChild().getString()); // Variable name
        Node hookNode = optimized.getSecondChild(); // The initializer expression
        assertEquals(Token.HOOK, hookNode.getType());
        assertEquals("x", hookNode.getFirstChild().getString()); // Condition
        assertEquals("1", hookNode.getSecondChild().getString()); // True branch value
        assertEquals("2", hookNode.getLastChild().getString());   // False branch value
    }

    @Test
    public void testFoldStandardConstructorNewObject() {
        Node objectName = makeNameNode("Object");
        Node newNode = makeNewNode(objectName);
        Node parent = makeNode(Token.EXPR_RESULT, newNode); // Parent for replacement
        Node optimized = optimize(newNode);
        assertEquals(Token.CALL, optimized.getType());
        assertEquals("Object", optimized.getFirstChild().getString());
    }

    @Test
    public void testFoldStandardConstructorNewArray() {
        Node arrayName = makeNameNode("Array");
        Node newNode = makeNewNode(arrayName);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        assertEquals(Token.ARRAYLIT, optimized.getType());
        assertFalse(optimized.hasChildren());
    }

    @Test
    public void testFoldStandardConstructorNewArrayWithArgs() {
        Node arrayName = makeNameNode("Array");
        Node arg1 = makeNumberNode(1);
        Node arg2 = makeStringNode("test");
        Node newNode = makeNewNode(arrayName, arg1, arg2);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        assertEquals(Token.ARRAYLIT, optimized.getType());
        assertEquals(arg1, optimized.getFirstChild());
        assertEquals(arg2, optimized.getLastChild());
    }

    @Test
    public void testFoldStandardConstructorNewArrayWithOneArgNumber() {
        Node arrayName = makeNameNode("Array");
        Node arg1 = makeNumberNode(5); // This should NOT be folded to [5] by isSafeToFoldArrayConstructor
        Node newNode = makeNewNode(arrayName, arg1);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        assertEquals(Token.NEW, optimized.getType()); // Should not fold
        assertEquals(arrayName.getString(), optimized.getFirstChild().getString());
    }

    @Test
    public void testFoldStandardConstructorNewRegExp() {
        Node regExpName = makeNameNode("RegExp");
        Node pattern = makeStringNode("abc");
        Node flags = makeStringNode("i");
        Node newNode = makeNewNode(regExpName, pattern, flags);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        assertEquals(Token.REGEXP, optimized.getType());
        assertEquals("abc", optimized.getFirstChild().getString());
        assertEquals("i", optimized.getLastChild().getString());
    }

    @Test
    public void testFoldStandardConstructorNewRegExpNoFlags() {
        Node regExpName = makeNameNode("RegExp");
        Node pattern = makeStringNode("abc");
        Node newNode = makeNewNode(regExpName, pattern);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        assertEquals(Token.REGEXP, optimized.getType());
        assertEquals("abc", optimized.getFirstChild().getString());
        // No flags means no second child for REGEXP node
        assertNull(optimized.getLastChild());
    }

    @Test
    public void testFoldStandardConstructorNewRegExpInvalidFlags() {
        Node regExpName = makeNameNode("RegExp");
        Node pattern = makeStringNode("abc");
        Node flags = makeStringNode("xyz"); // Invalid flags
        Node newNode = makeNewNode(regExpName, pattern, flags);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        // Should not fold and should report an error. We can't assert error reporting easily here.
        assertEquals(Token.NEW, optimized.getType());
    }

    @Test
    public void testFoldStandardConstructorNewRegExpTooManyArgs() {
        Node regExpName = makeNameNode("RegExp");
        Node pattern = makeStringNode("abc");
        Node flags = makeStringNode("i");
        Node extraArg = makeNumberNode(1);
        Node newNode = makeNewNode(regExpName, pattern, flags, extraArg);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        assertEquals(Token.NEW, optimized.getType()); // Should not fold
    }

    @Test
    public void testFoldStandardConstructorNewRegExpEmptyPattern() {
        Node regExpName = makeNameNode("RegExp");
        Node pattern = makeStringNode("");
        Node flags = makeStringNode("i");
        Node newNode = makeNewNode(regExpName, pattern, flags);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        assertEquals(Token.NEW, optimized.getType()); // Should not fold for empty pattern
    }

    @Test
    public void testFoldStandardConstructorNewRegExpWithForwardSlash() {
        Node regExpName = makeNameNode("RegExp");
        Node pattern = makeStringNode("a/b");
        Node flags = makeStringNode("i");
        Node newNode = makeNewNode(regExpName, pattern, flags);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        assertEquals(Token.REGEXP, optimized.getType());
        // makeForwardSlashBracketSafe should escape the '/'
        assertEquals("a\\/b", optimized.getFirstChild().getString());
        assertEquals("i", optimized.getLastChild().getString());
    }

    @Test
    public void testMinimizeConditionDoubleNot() {
        Node n = makeNameNode("x");
        Node not1 = makeNode(Token.NOT, n);
        Node not2 = makeNode(Token.NOT, not1);
        Node parent = makeNode(Token.EXPR_RESULT, not2);
        Node optimized = optimize(not2);
        assertEquals(Token.NAME, optimized.getType());
        assertEquals("x", optimized.getString());
    }

    @Test
    public void testMinimizeConditionNotAnd() {
        Node left = makeNode(Token.NOT, makeNameNode("a"));
        Node right = makeNode(Token.NOT, makeNameNode("b"));
        Node andNode = makeNode(Token.AND, left, right);
        Node not = makeNode(Token.NOT, andNode);
        Node parent = makeNode(Token.EXPR_RESULT, not);
        Node optimized = optimize(not);
        assertEquals(Token.OR, optimized.getType());
        assertEquals("a", optimized.getFirstChild().getString());
        assertEquals("b", optimized.getLastChild().getString());
    }

    @Test
    public void testMinimizeConditionNotOr() {
        Node left = makeNode(Token.NOT, makeNameNode("a"));
        Node right = makeNode(Token.NOT, makeNameNode("b"));
        Node orNode = makeNode(Token.OR, left, right);
        Node not = makeNode(Token.NOT, orNode);
        Node parent = makeNode(Token.EXPR_RESULT, not);
        Node optimized = optimize(not);
        assertEquals(Token.AND, optimized.getType());
        assertEquals("a", optimized.getFirstChild().getString());
        assertEquals("b", optimized.getLastChild().getString());
    }

    @Test
    public void testMinimizeConditionOrTrue() {
        Node left = makeNameNode("x");
        Node right = makeBooleanNode(true);
        Node orNode = makeNode(Token.OR, left, right);
        Node parent = makeNode(Token.EXPR_RESULT, orNode);
        Node optimized = optimize(orNode);
        assertEquals(Token.TRUE, optimized.getType());
    }

    @Test
    public void testMinimizeConditionOrFalse() {
        Node left = makeNameNode("x");
        Node right = makeBooleanNode(false);
        Node orNode = makeNode(Token.OR, left, right);
        Node parent = makeNode(Token.EXPR_RESULT, orNode);
        Node optimized = optimize(orNode);
        assertEquals(Token.NAME, optimized.getType());
        assertEquals("x", optimized.getString());
    }

    @Test
    public void testMinimizeConditionAndTrue() {
        Node left = makeNameNode("x");
        Node right = makeBooleanNode(true);
        Node andNode = makeNode(Token.AND, left, right);
        Node parent = makeNode(Token.EXPR_RESULT, andNode);
        Node optimized = optimize(andNode);
        assertEquals(Token.NAME, optimized.getType());
        assertEquals("x", optimized.getString());
    }

    @Test
    public void testMinimizeConditionAndFalse() {
        Node left = makeNameNode("x");
        Node right = makeBooleanNode(false);
        Node andNode = makeNode(Token.AND, left, right);
        Node parent = makeNode(Token.EXPR_RESULT, andNode);
        Node optimized = optimize(andNode);
        assertEquals(Token.FALSE, optimized.getType());
    }

    @Test
    public void testMinimizeHookTrueFalse() {
        Node cond = makeNameNode("x");
        Node trueNode = makeBooleanNode(true);
        Node falseNode = makeBooleanNode(false);
        Node hookNode = makeNode(Token.HOOK, cond, trueNode, falseNode);
        Node parent = makeNode(Token.EXPR_RESULT, hookNode);
        Node optimized = optimize(hookNode);
        assertEquals(Token.NAME, optimized.getType());
        assertEquals("x", optimized.getString());
    }

    @Test
    public void testMinimizeHookFalseTrue() {
        Node cond = makeNameNode("x");
        Node trueNode = makeBooleanNode(false);
        Node falseNode = makeBooleanNode(true);
        Node hookNode = makeNode(Token.HOOK, cond, trueNode, falseNode);
        Node parent = makeNode(Token.EXPR_RESULT, hookNode);
        Node optimized = optimize(hookNode);
        assertEquals(Token.NOT, optimized.getType());
        assertEquals("x", optimized.getFirstChild().getString());
    }

    @Test
    public void testMinimizeHookTrueElseVar() {
        Node cond = makeNameNode("x");
        Node trueNode = makeBooleanNode(true);
        // ELSE branch must be a single expression, not a block.
        Node elseExpr = makeNode(Token.VAR, makeNode(Token.NAME, Node.newString("y")));
        elseExpr.getChildAtIndex(0).addChildToBack(makeNumberNode(1)); // var y = 1
        Node hookNode = makeNode(Token.HOOK, cond, trueNode, elseExpr);
        Node parent = makeNode(Token.EXPR_RESULT, hookNode);
        Node optimized = optimize(hookNode);

        // Expected: x || var y = 1
        assertEquals(Token.OR, optimized.getType());
        assertEquals("x", optimized.getFirstChild().getString());
        // The second part should be the VAR declaration.
        Node varDeclaration = optimized.getLastChild();
        assertEquals(Token.VAR, varDeclaration.getType());
        assertEquals("y", varDeclaration.getFirstChild().getString());
        assertEquals("1", varDeclaration.getSecondChild().getString());
    }

    @Test
    public void testMinimizeHookElseFalseVar() {
        Node cond = makeNameNode("x");
        // THEN branch must be a single expression, not a block.
        Node thenExpr = makeNode(Token.VAR, makeNode(Token.NAME, Node.newString("y")));
        thenExpr.getChildAtIndex(0).addChildToBack(makeNumberNode(1)); // var y = 1
        Node falseNode = makeBooleanNode(false);
        Node hookNode = makeNode(Token.HOOK, cond, thenExpr, falseNode);
        Node parent = makeNode(Token.EXPR_RESULT, hookNode);
        Node optimized = optimize(hookNode);

        // Expected: x && var y = 1
        assertEquals(Token.AND, optimized.getType());
        assertEquals("x", optimized.getFirstChild().getString());
        // The second part should be the VAR declaration.
        Node varDeclaration = optimized.getLastChild();
        assertEquals(Token.VAR, varDeclaration.getType());
        assertEquals("y", varDeclaration.getFirstChild().getString());
        assertEquals("1", varDeclaration.getSecondChild().getString());
    }

    // Helper method from the class under test to verify behavior of tryRemoveRepeatedStatements
    private void callTryRemoveRepeatedStatements(Node n) {
        // Need to ensure the PeepholeSubstituteAlternateSyntax instance is properly initialized
        // or create a temporary one if the current one is not sufficiently set up.
        // For now, assume `peephole` is properly initialized.
        peephole.tryRemoveRepeatedStatements(n);
    }

    @Test
    public void testTryRemoveRepeatedStatements() {
        Node cond = makeNameNode("a");
        Node stmt1 = makeExprResultNode(makeNode(Token.ASSIGN, makeNameNode("x"), makeNumberNode(1)));
        Node stmt2 = makeExprResultNode(makeNode(Token.ASSIGN, makeNameNode("x"), makeNumberNode(2)));
        Node returnStmt = makeNode(Token.RETURN, makeNumberNode(true));

        Node thenBranch = makeNode(Token.BLOCK, stmt1.cloneTree(), returnStmt.cloneTree());
        Node elseBranch = makeNode(Token.BLOCK, stmt2.cloneTree(), returnStmt.cloneTree());
        Node ifNode = makeNode(Token.IF, cond, thenBranch, elseBranch);
        Node parent = makeNode(Token.BLOCK, ifNode); // The IF node must be in a block to have a parent suitable for addChildAfter

        callTryRemoveRepeatedStatements(ifNode); // Call the private method directly

        // After removing repeated statements, the last statement of each branch
        // should be moved *after* the IF node, if they are identical.
        // In this case, the return statement is identical.
        // The IF node's parent is the block.
        // The original IF node should remain in the block.
        // The returned statements should be added *after* the IF node.

        Node movedReturnFromThen = parent.getChildAfter(ifNode);
        assertNotNull(movedReturnFromThen);
        assertEquals(Token.RETURN, movedReturnFromThen.getType());
        assertEquals(returnStmt.getFirstChild().getDouble(), movedReturnFromThen.getFirstChild().getDouble(), 0.0001);

        Node movedReturnFromElse = parent.getChildAfter(movedReturnFromThen);
        assertNotNull(movedReturnFromElse);
        assertEquals(Token.RETURN, movedReturnFromElse.getType());
        assertEquals(returnStmt.getFirstChild().getDouble(), movedReturnFromElse.getFirstChild().getDouble(), 0.0001);

        // The original branches should now be missing their last child.
        assertEquals(1, thenBranch.getChildCount()); // stmt1 only
        assertEquals(1, elseBranch.getChildCount()); // stmt2 only
    }


    @Test
    public void testIsFoldableExpressBlockTrue() {
        // A block with a single EXPR_RESULT child is foldable.
        Node exprResult = makeExprResultNode(makeNumberNode(1));
        Node block = makeNode(Token.BLOCK, exprResult);
        assertTrue(peephole.isFoldableExpressBlock(block));
    }

    @Test
    public void testIsFoldableExpressBlockFalse_NotBlock() {
        // An EXPR_RESULT node itself is not a block.
        Node exprResult = makeExprResultNode(makeNumberNode(1));
        assertFalse(peephole.isFoldableExpressBlock(exprResult));
    }

    @Test
    public void testIsFoldableExpressBlockFalse_MultipleChildren() {
        // A block with multiple children is not foldable.
        Node exprResult1 = makeExprResultNode(makeNumberNode(1));
        Node exprResult2 = makeExprResultNode(makeNumberNode(2));
        Node block = makeNode(Token.BLOCK, exprResult1, exprResult2);
        assertFalse(peephole.isFoldableExpressBlock(block));
    }

    @Test
    public void testIsFoldableExpressBlockFalse_NotExprResult() {
        // A block with a non-EXPR_RESULT child is not foldable.
        Node statement = makeNode(Token.RETURN, makeNumberNode(1));
        Node block = makeNode(Token.BLOCK, statement);
        assertFalse(peephole.isFoldableExpressBlock(block));
    }

    @Test
    public void testGetBlockExpression() {
        Node exprResult = makeExprResultNode(makeNumberNode(1));
        Node block = makeNode(Token.BLOCK, exprResult);
        assertEquals(exprResult, peephole.getBlockExpression(block));
    }

    @Test
    public void testIsReturnExpressBlockTrue() {
        Node returnNode = makeNode(Token.RETURN, makeNumberNode(1));
        Node block = makeNode(Token.BLOCK, returnNode);
        assertTrue(peephole.isReturnExpressBlock(block));
    }

    @Test
    public void testIsReturnExpressBlockFalse_NoReturnValue() {
        Node returnNode = makeNode(Token.RETURN); // No return value
        Node block = makeNode(Token.BLOCK, returnNode);
        assertFalse(peephole.isReturnExpressBlock(block));
    }

    @Test
    public void testIsReturnExpressBlockFalse_NotReturn() {
        Node statement = makeExprResultNode(makeNumberNode(1));
        Node block = makeNode(Token.BLOCK, statement);
        assertFalse(peephole.isReturnExpressBlock(block));
    }

    @Test
    public void testGetBlockReturnExpression() {
        Node returnNode = makeNode(Token.RETURN, makeNumberNode(1));
        Node block = makeNode(Token.BLOCK, returnNode);
        assertEquals(makeNumberNode(1), peephole.getBlockReturnExpression(block));
    }

    @Test
    public void testIsVarBlockTrue() {
        Node varNode = makeNode(Token.VAR, makeNode(Token.NAME, Node.newString("x")));
        varNode.getChildAtIndex(0).addChildToBack(makeNumberNode(1)); // var x = 1
        Node block = makeNode(Token.BLOCK, varNode);
        assertTrue(peephole.isVarBlock(block));
    }

    @Test
    public void testIsVarBlockFalse_NotVar() {
        Node statement = makeExprResultNode(makeNumberNode(1));
        Node block = makeNode(Token.BLOCK, statement);
        assertFalse(peephole.isVarBlock(block));
    }

    @Test
    public void testIsVarBlockFalse_MultipleVars() {
        Node varNode1 = makeNode(Token.VAR, makeNode(Token.NAME, Node.newString("x")));
        Node varNode2 = makeNode(Token.VAR, makeNode(Token.NAME, Node.newString("y")));
        Node block = makeNode(Token.BLOCK, varNode1, varNode2);
        assertFalse(peephole.isVarBlock(block));
    }


    @Test
    public void testGetBlockVar() {
        Node varNode = makeNode(Token.VAR, makeNode(Token.NAME, Node.newString("x")));
        varNode.getChildAtIndex(0).addChildToBack(makeNumberNode(1)); // var x = 1
        Node block = makeNode(Token.BLOCK, varNode);
        assertEquals(varNode, peephole.getBlockVar(block));
    }

    @Test
    public void testConsumesDanglingElseTrue() {
        // An IF without an ELSE consumes a dangling ELSE.
        Node innerIf = makeNode(Token.IF, makeNameNode("y"), makeExprResultNode(makeNumberNode(1)));
        assertTrue(peephole.consumesDanglingElse(innerIf));
    }

    @Test
    public void testConsumesDanglingElseFalse() {
        // An IF with an ELSE does NOT consume a dangling ELSE.
        Node innerIf = makeNode(Token.IF, makeNameNode("y"), makeExprResultNode(makeNumberNode(1)), makeExprResultNode(makeNumberNode(2)));
        assertFalse(peephole.consumesDanglingElse(innerIf));
    }

    @Test
    public void testConsumesDanglingElseWhile() {
        // A WHILE loop consumes a dangling ELSE.
        Node whileLoop = makeNode(Token.WHILE, makeNameNode("y"), makeExprResultNode(makeNumberNode(1)));
        assertTrue(peephole.consumesDanglingElse(whileLoop));
    }

    @Test
    public void testIsLowerPrecedenceInExpressionTrue() {
        Node childOp = makeNode(Token.ADD, makeNameNode("c"), makeNameNode("d"));
        Node parentOp = makeNode(Token.OR, makeNameNode("a"), makeNameNode("b"));
        parentOp.addChildToFront(childOp); // parentOp is OR, childOp is ADD
        // Precedence of ADD is lower than OR
        assertTrue(peephole.isLowerPrecedenceInExpression(childOp, NodeUtil.precedence(Token.OR)));
    }

    @Test
    public void testIsLowerPrecedenceInExpressionFalse_SamePrecedence() {
        Node childOp = makeNode(Token.OR, makeNameNode("c"), makeNameNode("d"));
        Node parentOp = makeNode(Token.OR, makeNameNode("a"), makeNameNode("b"));
        parentOp.addChildToFront(childOp); // Both are OR
        assertFalse(peephole.isLowerPrecedenceInExpression(childOp, NodeUtil.precedence(Token.OR)));
    }

    @Test
    public void testIsLowerPrecedenceInExpressionFalse_HigherPrecedence() {
        Node childOp = makeNode(Token.MUL, makeNameNode("c"), makeNameNode("d"));
        Node parentOp = makeNode(Token.ADD, makeNameNode("a"), makeNameNode("b"));
        parentOp.addChildToFront(childOp); // parentOp is ADD, childOp is MUL
        // Precedence of MUL is higher than ADD
        assertFalse(peephole.isLowerPrecedenceInExpression(childOp, NodeUtil.precedence(Token.ADD)));
    }

    @Test
    public void testIsPropertyAssignmentInExpressionTrue() {
        Node getProp = makeNode(Token.GETPROP, makeNameNode("obj"), makeNameNode("prop"));
        Node assign = makeNode(Token.ASSIGN, getProp, makeNumberNode(1));
        assertTrue(peephole.isPropertyAssignmentInExpression(assign));
    }

    @Test
    public void testIsPropertyAssignmentInExpressionFalse_NotAssign() {
        Node getProp = makeNode(Token.GETPROP, makeNameNode("obj"), makeNameNode("prop"));
        assertFalse(peephole.isPropertyAssignmentInExpression(getProp));
    }

    @Test
    public void testIsPropertyAssignmentInExpressionFalse_NotGetProp() {
        Node assign = makeNode(Token.ASSIGN, makeNameNode("var"), makeNumberNode(1));
        assertFalse(peephole.isPropertyAssignmentInExpression(assign));
    }

    @Test
    public void testTryMinimizeConditionLeftValTrue() {
        Node condition = makeNumberNode(1); // true
        Node trueBranch = makeNumberNode(2);
        Node falseBranch = makeNumberNode(3);
        Node hookNode = makeNode(Token.HOOK, condition, trueBranch, falseBranch);
        Node parent = makeNode(Token.EXPR_RESULT, hookNode);
        Node optimized = optimize(hookNode);
        assertEquals(Token.NUMBER, optimized.getType());
        assertEquals(2.0, optimized.getDouble(), 0.0001);
    }

    @Test
    public void testTryMinimizeConditionRightValTrue() {
        Node condition = makeNameNode("x");
        Node trueBranch = makeNumberNode(2);
        Node falseBranch = makeNumberNode(1); // true
        Node hookNode = makeNode(Token.HOOK, condition, trueBranch, falseBranch);
        Node parent = makeNode(Token.EXPR_RESULT, hookNode);
        Node optimized = optimize(hookNode);
        assertEquals(Token.OR, optimized.getType());
        assertEquals("x", optimized.getFirstChild().getString());
        assertEquals(2.0, optimized.getLastChild().getDouble(), 0.0001);
    }

    @Test
    public void testTryMinimizeConditionRightValFalse() {
        Node condition = makeNameNode("x");
        Node trueBranch = makeNumberNode(2);
        Node falseBranch = makeNumberNode(0); // false
        Node hookNode = makeNode(Token.HOOK, condition, trueBranch, falseBranch);
        Node parent = makeNode(Token.EXPR_RESULT, hookNode);
        Node optimized = optimize(hookNode);
        assertEquals(Token.AND, optimized.getType());
        assertEquals("x", optimized.getFirstChild().getString());
        assertEquals(2.0, optimized.getLastChild().getDouble(), 0.0001);
    }

    @Test
    public void testMaybeReplaceChildWithNumber() {
        // Node parent needs to have `n` as a child.
        Node n = makeNameNode("x");
        Node parent = makeNode(Token.EXPR_RESULT, n);
        Node newNode = peephole.maybeReplaceChildWithNumber(n, parent, 1);
        assertEquals(Token.NUMBER, newNode.getType());
        assertEquals(1.0, newNode.getDouble(), 0.0001);
        // The parent should now have newNode as its child.
        assertEquals(parent.getFirstChild(), newNode);
    }

    @Test
    public void testMaybeReplaceChildWithNumberNoChange() {
        Node n = makeNumberNode(1);
        Node parent = makeNode(Token.EXPR_RESULT, n);
        Node newNode = peephole.maybeReplaceChildWithNumber(n, parent, 1);
        // Should return the original node if no change is made.
        assertEquals(n, newNode);
        assertEquals(Token.NUMBER, newNode.getType());
        assertEquals(1.0, newNode.getDouble(), 0.0001);
        // Parent's child should still be the original node.
        assertEquals(parent.getFirstChild(), n);
    }

    @Test
    public void testFoldRegularExpressionConstructorWithFlags() {
        Node regExpName = makeNameNode("RegExp");
        Node pattern = makeStringNode("foo");
        Node flags = makeStringNode("gmi"); // Valid flags
        Node newNode = makeNewNode(regExpName, pattern, flags);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        assertEquals(Token.REGEXP, optimized.getType());
        assertEquals("foo", optimized.getFirstChild().getString());
        assertEquals("gmi", optimized.getLastChild().getString());
    }

    @Test
    public void testFoldRegularExpressionConstructorWithForwardSlashEscaped() {
        Node regExpName = makeNameNode("RegExp");
        Node pattern = makeStringNode("a/b\\c"); // Contains forward slash and backslash
        Node flags = makeStringNode("i");
        Node newNode = makeNewNode(regExpName, pattern, flags);
        Node parent = makeNode(Token.EXPR_RESULT, newNode);
        Node optimized = optimize(newNode);
        assertEquals(Token.REGEXP, optimized.getType());
        // makeForwardSlashBracketSafe should escape '/' and '\'
        assertEquals("a\\/b\\\\c", optimized.getFirstChild().getString());
        assertEquals("i", optimized.getLastChild().getString());
    }

    @Test
    public void testAreValidRegexpFlagsTrue() {
        assertTrue(peephole.areValidRegexpFlags("gmi"));
        assertTrue(peephole.areValidRegexpFlags(""));
        assertTrue(peephole.areValidRegexpFlags("gi"));
    }

    @Test
    public void testAreValidRegexpFlagsFalse() {
        assertFalse(peephole.areValidRegexpFlags("xyz"));
        assertFalse(peephole.areValidRegexpFlags("gmiz"));
        assertFalse(peephole.areValidRegexpFlags("g m i")); // spaces are invalid
    }

    @Test
    public void testAreSafeFlagsToFoldTrue() {
        assertTrue(peephole.areSafeFlagsToFold("im")); // No 'g'
    }

    @Test
    public void testAreSafeFlagsToFoldFalse() {
        assertFalse(peephole.areSafeFlagsToFold("g"));
        assertFalse(peephole.areSafeFlagsToFold("gi"));
    }

    @Test
    public void testMakeForwardSlashBracketSafe() {
        Node patternNode = Node.newString("a/b\\c");
        Node safeNode = peephole.makeForwardSlashBracketSafe(patternNode);
        assertEquals("a\\/b\\\\c", safeNode.getString());
    }

    @Test
    public void testContainsUnicodeEscapeTrue() {
        // Use valid Java string escapes for unicode sequences.
        assertTrue(peephole.containsUnicodeEscape("abc\\u1234def")); // \u is present
        assertTrue(peephole.containsUnicodeEscape("a\\\\u1234def")); // Even number of backslashes before \u
    }

    @Test
    public void testContainsUnicodeEscapeFalse() {
        assertFalse(peephole.containsUnicodeEscape("abc")); // No \u
        assertFalse(peephole.containsUnicodeEscape("a\\u1234def")); // Odd number of backslashes before \u (treated as literal \u)
        assertFalse(peephole.containsUnicodeEscape("a\\\\\\u1234def")); // Odd number of backslashes
    }

    @Test
    public void testFoldIfElseVarElseAssign() {
        Node cond = makeNameNode("x");
        Node thenVar = makeNode(Token.VAR, makeNode(Token.NAME, Node.newString("y")));
        thenVar.getChildAtIndex(0).addChildToBack(makeNumberNode(1)); // var y = 1
        Node thenBranch = makeNode(Token.BLOCK, thenVar);

        Node elseAssign = makeNode(Token.ASSIGN, makeNameNode("y"), makeNumberNode(2));
        Node elseBranch = makeExprResultNode(elseAssign);

        Node ifNode = makeNode(Token.IF, cond, thenBranch, elseBranch);
        Node parent = makeNode(Token.BLOCK, ifNode);
        Node optimized = optimize(ifNode);

        // Expected: var y = x ? 1 : 2;
        assertEquals(Token.VAR, optimized.getType());
        assertEquals("y", optimized.getFirstChild().getString()); // Variable name
        Node hookNode = optimized.getSecondChild(); // The initializer expression
        assertEquals(Token.HOOK, hookNode.getType());
        assertEquals("x", hookNode.getFirstChild().getString()); // Condition
        assertEquals("1", hookNode.getSecondChild().getString()); // True branch value
        assertEquals("2", hookNode.getLastChild().getString());   // False branch value
    }

    @Test
    public void testFoldIfElseAssignElseVar() {
        Node cond = makeNameNode("x");
        Node thenAssign = makeNode(Token.ASSIGN, makeNameNode("y"), makeNumberNode(1));
        Node thenBranch = makeExprResultNode(thenAssign);

        Node elseVar = makeNode(Token.VAR, makeNode(Token.NAME, Node.newString("y")));
        elseVar.getChildAtIndex(0).addChildToBack(makeNumberNode(2)); // var y = 2
        Node elseBranch = makeNode(Token.BLOCK, elseVar);

        Node ifNode = makeNode(Token.IF, cond, thenBranch, elseBranch);
        Node parent = makeNode(Token.BLOCK, ifNode);
        Node optimized = optimize(ifNode);

        // Expected: var y = x ? 1 : 2;
        assertEquals(Token.VAR, optimized.getType());
        assertEquals("y", optimized.getFirstChild().getString()); // Variable name
        Node hookNode = optimized.getSecondChild(); // The initializer expression
        assertEquals(Token.HOOK, hookNode.getType());
        assertEquals("x", hookNode.getFirstChild().getString()); // Condition
        assertEquals("1", hookNode.getSecondChild().getString()); // True branch value
        assertEquals("2", hookNode.getLastChild().getString());   // False branch value
    }

    // Mocking the static NodeUtil methods used by PeepholeSubstituteAlternateSyntax
    // This is a simplified mock for testing purposes.
    private static class NodeUtil {
        public static int precedence(int type) {
            switch (type) {
                case Token.OR: return 1;
                case Token.AND: return 2;
                case Token.EQ: return 3;
                case Token.ADD: return 5;
                case Token.MUL: return 6;
                case Token.ASSIGN: return 12;
                default: return 0;
            }
        }

        public static TernaryValue getBooleanValue(Node n) {
            if (n == null) return TernaryValue.UNKNOWN;
            if (n.getType() == Token.TRUE) return TernaryValue.TRUE;
            if (n.getType() == Token.FALSE) return TernaryValue.FALSE;
            if (n.getType() == Token.NUMBER) {
                double val = n.getDouble();
                if (val == 0) return TernaryValue.FALSE;
                if (val != 0 && !Double.isNaN(val)) return TernaryValue.TRUE;
            }
            if (n.getType() == Token.NAME) {
                String name = n.getString();
                if ("true".equals(name)) return TernaryValue.TRUE;
                if ("false".equals(name)) return TernaryValue.FALSE;
            }
            return TernaryValue.UNKNOWN;
        }

        public static boolean isLiteralValue(Node n, boolean includeFunctions) {
            if (n == null) return false;
            switch (n.getType()) {
                case Token.STRING:
                case Token.NUMBER:
                case Token.TRUE:
                case Token.FALSE:
                case Token.NULL:
                    return true;
                case Token.FUNCTION:
                    return includeFunctions;
                default:
                    return false;
            }
        }

        public static boolean isAssignmentOp(Node n) {
            return n != null && n.getType() == Token.ASSIGN;
        }

        public static boolean has(Node n, Predicate<Node> predicate, Predicate<Node> traverse) {
            if (n == null) return false;
            if (predicate.apply(n)) return true;
            if (!traverse.apply(n)) return false;

            for (Node child = n.getFirstChild(); child != null; child = child.getNext()) {
                if (has(child, predicate, traverse)) return true;
            }
            return false;
        }
        
        public static boolean isExpressionNode(Node n) {
            return n != null && (n.getType() != Token.BLOCK && n.getType() != Token.EXPR_RESULT && n.getType() != Token.RETURN && n.getType() != Token.VAR && n.getType() != Token.FUNCTION && n.getType() != Token.IF && n.getType() != Token.WHILE && n.getType() != Token.FOR && n.getType() != Token.DO && n.getType() != Token.SWITCH && n.getType() != Token.TRY);
        }

        public static boolean areNodesEqualForInlining(Node n1, Node n2) {
            if (n1 == null && n2 == null) return true;
            if (n1 == null || n2 == null) return false;
            if (n1.getType() != n2.getType()) return false;

            if (n1.isString()) return n1.getString().equals(n2.getString());
            if (n1.isNumber()) return n1.getDouble() == n2.getDouble();
            if (n1.isBooleanLiteral()) return n1.getBooleanVal() == n2.getBooleanVal();
            if (n1.isNull()) return n2.isNull();
            if (n1.isUndefined()) return n2.isUndefined();

            Node c1 = n1.getFirstChild();
            Node c2 = n2.getFirstChild();
            while(c1 != null && c2 != null) {
                if (!areNodesEqualForInlining(c1, c2)) return false;
                c1 = c1.getNext();
                c2 = c2.getNext();
            }
            return c1 == null && c2 == null;
        }

         public static boolean mayHaveSideEffects(Node n) {
            if (n == null) return false;
            switch (n.getType()) {
                case Token.CALL:
                case Token.NEW:
                case Token.ASSIGN:
                case Token.ASSIGN_ADD: case Token.ASSIGN_SUB: case Token.ASSIGN_MUL: case Token.ASSIGN_DIV: case Token.ASSIGN_MOD:
                case Token.ASSIGN_BITOR: case Token.ASSIGN_BITXOR: case Token.ASSIGN_BITAND: case Token.ASSIGN_LSH: case Token.ASSIGN_RSH: case Token.ASSIGN_URSH:
                case Token.SETPROP: case Token.SETELEM: case Token.DELPROP:
                case Token.INC: case Token.DEC:
                case Token.THROW:
                    return true;
                default:
                    for (Node child = n.getFirstChild(); child != null; child = child.getNext()) {
                        if (mayHaveSideEffects(child)) return true;
                    }
                    return false;
            }
        }
    }
}
```