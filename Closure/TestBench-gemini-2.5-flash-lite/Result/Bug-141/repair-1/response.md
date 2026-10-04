```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.DefinitionsRemover.Definition;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;

public class NodeUtilTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a simple expression node
    private Node createExpressionNode(String value) {
        Node n = Node.newString(Token.STRING, value, 0, 0);
        return NodeUtil.newExpr(n);
    }

    // Helper method to create a NAME node
    private Node createNameNode(String name) {
        return Node.newString(Token.NAME, name, 0, 0);
    }

    // Helper method to create a NUMBER node
    private Node createNumberNode(double value) {
        return Node.newNumber(value, 0, 0);
    }

    // Helper method to create a BOOLEAN node
    private Node createBooleanNode(boolean value) {
        return new Node(value ? Token.TRUE : Token.FALSE, 0, 0);
    }

    // Helper method to create a NULL node
    private Node createNullNode() {
        return new Node(Token.NULL, 0, 0);
    }

    // Helper method to create a VOID node
    private Node createVoidNode() {
        return new Node(Token.VOID, 0, 0);
    }

    // Helper method to create a FUNCTION node
    private Node createFunctionNode(String name, List<Node> params, Node body) {
        return NodeUtil.newFunctionNode(name, params, body, 0, 0);
    }

    // Helper method to create an OBJECTLIT node
    private Node createObjectLitNode(Node... children) {
        Node objLit = new Node(Token.OBJECTLIT);
        for (Node child : children) {
            objLit.addChildToBack(child);
        }
        return objLit;
    }

    // Helper method to create an ARRAYLIT node
    private Node createArrayLitNode(Node... children) {
        Node arrLit = new Node(Token.ARRAYLIT);
        for (Node child : children) {
            arrLit.addChildToBack(child);
        }
        return arrLit;
    }

    // Helper method to create a REGEXP node
    private Node createRegExpNode(String value) {
        return new Node(Token.REGEXP, Node.newString(value, 0, 0), 0, 0);
    }

    // Helper method to create a NEG node
    private Node createNegNode(Node child) {
        return new Node(Token.NEG, child, 0, 0);
    }

    @Test
    public void testGetBooleanValue_stringLiteralNotEmpty() throws Exception {
        Node n = Node.newString(Token.STRING, "hello", 0, 0);
        assertTrue(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_stringLiteralEmpty() throws Exception {
        Node n = Node.newString(Token.STRING, "", 0, 0);
        assertFalse(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_numberLiteralNonZero() throws Exception {
        Node n = createNumberNode(10.5);
        assertTrue(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_numberLiteralZero() throws Exception {
        Node n = createNumberNode(0);
        assertFalse(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_nullLiteral() throws Exception {
        Node n = createNullNode();
        assertFalse(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_falseLiteral() throws Exception {
        Node n = createBooleanNode(false);
        assertFalse(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_voidLiteral() throws Exception {
        Node n = createVoidNode();
        assertFalse(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_nameUndefined() throws Exception {
        Node n = createNameNode("undefined");
        assertFalse(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_nameNaN() throws Exception {
        Node n = createNameNode("NaN");
        assertFalse(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_nameInfinity() throws Exception {
        Node n = createNameNode("Infinity");
        assertTrue(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_trueLiteral() throws Exception {
        Node n = createBooleanNode(true);
        assertTrue(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_arrayLiteral() throws Exception {
        Node n = createArrayLitNode();
        assertTrue(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_objectLiteral() throws Exception {
        Node n = createObjectLitNode();
        assertTrue(NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValue_regexpLiteral() throws Exception {
        Node n = createRegExpNode(".*");
        assertTrue(NodeUtil.getBooleanValue(n));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBooleanValue_nonLiteral() throws Exception {
        Node n = new Node(Token.ADD, createNumberNode(1), createNumberNode(2), 0, 0);
        NodeUtil.getBooleanValue(n);
    }

    @Test
    public void testGetStringValue_stringLiteral() throws Exception {
        Node n = Node.newString(Token.STRING, "test", 0, 0);
        assertEquals("test", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nameLiteral() throws Exception {
        Node n = createNameNode("variable");
        assertEquals("variable", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_numberLiteralInteger() throws Exception {
        Node n = createNumberNode(123.0);
        assertEquals("123", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_numberLiteralDouble() throws Exception {
        Node n = createNumberNode(123.45);
        assertEquals("123.45", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_falseLiteral() throws Exception {
        Node n = createBooleanNode(false);
        assertEquals("false", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_trueLiteral() throws Exception {
        Node n = createBooleanNode(true);
        assertEquals("true", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nullLiteral() throws Exception {
        Node n = createNullNode();
        assertEquals("null", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_voidLiteral() throws Exception {
        Node n = createVoidNode();
        assertEquals("undefined", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nullIfCannotConvert() throws Exception {
        Node n = new Node(Token.ADD, 0, 0); // Not a literal type handled
        assertNull(NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetFunctionName_functionDeclaration() throws Exception {
        Node fn = createFunctionNode("myFunc", Collections.emptyList(), new Node(Token.BLOCK));
        Node parent = new Node(Token.BLOCK, fn, 0, 0);
        assertEquals("myFunc", NodeUtil.getFunctionName(fn, parent));
    }

    @Test
    public void testGetFunctionName_varAssignment() throws Exception {
        Node fn = createFunctionNode(null, Collections.emptyList(), new Node(Token.BLOCK));
        Node varName = createNameNode("myVar");
        Node assign = new Node(Token.ASSIGN, varName, fn, 0, 0);
        Node parent = new Node(Token.BLOCK, assign, 0, 0);
        assertEquals("myVar", NodeUtil.getFunctionName(fn, parent));
    }

    @Test
    public void testGetFunctionName_qualifiedAssignment() throws Exception {
        Node fn = createFunctionNode(null, Collections.emptyList(), new Node(Token.BLOCK));
        Node qualifiedName = NodeUtil.newQualifiedNameNode("obj.method", 0, 0);
        Node assign = new Node(Token.ASSIGN, qualifiedName, fn, 0, 0);
        Node parent = new Node(Token.BLOCK, assign, 0, 0);
        assertEquals("obj.method", NodeUtil.getFunctionName(fn, parent));
    }

    @Test
    public void testGetFunctionName_namedAnonymousFunctionVar() throws Exception {
        Node fn = createFunctionNode("innerFunc", Collections.emptyList(), new Node(Token.BLOCK));
        Node varName = createNameNode("outerVar");
        Node assign = new Node(Token.ASSIGN, varName, fn, 0, 0);
        Node parent = new Node(Token.BLOCK, assign, 0, 0);
        assertEquals("outerVar", NodeUtil.getFunctionName(fn, parent));
    }

    @Test
    public void testGetFunctionName_namedAnonymousFunctionQualified() throws Exception {
        Node fn = createFunctionNode("innerFunc", Collections.emptyList(), new Node(Token.BLOCK));
        Node qualifiedName = NodeUtil.newQualifiedNameNode("obj.method", 0, 0);
        Node assign = new Node(Token.ASSIGN, qualifiedName, fn, 0, 0);
        Node parent = new Node(Token.BLOCK, assign, 0, 0);
        assertEquals("obj.method", NodeUtil.getFunctionName(fn, parent));
    }

    @Test
    public void testIsImmutableValue_string() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(Node.newString(Token.STRING, "a", 0, 0)));
    }

    @Test
    public void testIsImmutableValue_number() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(createNumberNode(10)));
    }

    @Test
    public void testIsImmutableValue_null() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(createNullNode()));
    }

    @Test
    public void testIsImmutableValue_true() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(createBooleanNode(true)));
    }

    @Test
    public void testIsImmutableValue_false() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(createBooleanNode(false)));
    }

    @Test
    public void testIsImmutableValue_void() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(createVoidNode()));
    }

    @Test
    public void testIsImmutableValue_negationOfImmutable() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(createNegNode(Node.newString(Token.STRING, "a", 0, 0))));
    }

    @Test
    public void testIsImmutableValue_undefinedName() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(createNameNode("undefined")));
    }

    @Test
    public void testIsImmutableValue_infinityName() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(createNameNode("Infinity")));
    }

    @Test
    public void testIsImmutableValue_nanName() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(createNameNode("NaN")));
    }

    @Test
    public void testIsImmutableValue_mutable() throws Exception {
        assertFalse(NodeUtil.isImmutableValue(createArrayLitNode()));
        assertFalse(NodeUtil.isImmutableValue(createObjectLitNode()));
        assertFalse(NodeUtil.isImmutableValue(createRegExpNode(".*")));
        assertFalse(NodeUtil.isImmutableValue(createNameNode("variable")));
    }

    @Test
    public void testIsLiteralValue_immutableValues() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(Node.newString(Token.STRING, "a", 0, 0)));
        assertTrue(NodeUtil.isLiteralValue(createNumberNode(10)));
        assertTrue(NodeUtil.isLiteralValue(createNullNode()));
        assertTrue(NodeUtil.isLiteralValue(createBooleanNode(true)));
        assertTrue(NodeUtil.isLiteralValue(createBooleanNode(false)));
        assertTrue(NodeUtil.isLiteralValue(createVoidNode()));
        assertTrue(NodeUtil.isLiteralValue(createNameNode("undefined")));
        assertTrue(NodeUtil.isLiteralValue(createNameNode("Infinity")));
        assertTrue(NodeUtil.isLiteralValue(createNameNode("NaN")));
    }

    @Test
    public void testIsLiteralValue_literalWithImmutableChildren() throws Exception {
        Node stringChild = Node.newString(Token.STRING, "a", 0, 0);
        Node numberChild = createNumberNode(10);
        Node objLit = createObjectLitNode(
                Node.newString(Token.STRING, "key1", 0, 0), stringChild,
                Node.newString(Token.STRING, "key2", 0, 0), numberChild);
        assertTrue(NodeUtil.isLiteralValue(objLit));

        Node arrayLit = createArrayLitNode(stringChild, numberChild);
        assertTrue(NodeUtil.isLiteralValue(arrayLit));

        Node regexpLit = createRegExpNode("abc");
        assertTrue(NodeUtil.isLiteralValue(regexpLit));
    }

    @Test
    public void testIsLiteralValue_literalWithMutableChild() throws Exception {
        Node stringChild = Node.newString(Token.STRING, "a", 0, 0);
        Node mutableChild = createNameNode("variable"); // Not a literal
        Node objLit = createObjectLitNode(
                Node.newString(Token.STRING, "key1", 0, 0), stringChild,
                Node.newString(Token.STRING, "key2", 0, 0), mutableChild);
        assertFalse(NodeUtil.isLiteralValue(objLit));

        Node arrayLit = createArrayLitNode(stringChild, mutableChild);
        assertFalse(NodeUtil.isLiteralValue(arrayLit));
    }

    @Test
    public void testIsLiteralValue_nonLiteralValues() throws Exception {
        assertFalse(NodeUtil.isLiteralValue(createNameNode("variable")));
        assertFalse(NodeUtil.isLiteralValue(createArrayLitNode()));
        assertFalse(NodeUtil.isLiteralValue(createObjectLitNode()));
        assertFalse(NodeUtil.isLiteralValue(createRegExpNode(".*")));
        assertFalse(NodeUtil.isLiteralValue(createNegNode(Node.newString(Token.STRING, "a", 0, 0))));
    }

    @Test
    public void testIsValidDefineValue_string() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(Node.newString(Token.STRING, "value", 0, 0), defines));
    }

    @Test
    public void testIsValidDefineValue_number() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(createNumberNode(123), defines));
    }

    @Test
    public void testIsValidDefineValue_true() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(createBooleanNode(true), defines));
    }

    @Test
    public void testIsValidDefineValue_false() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(createBooleanNode(false), defines));
    }

    @Test
    public void testIsValidDefineValue_negationOfValid() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        Node validNode = Node.newString(Token.STRING, "value", 0, 0);
        Node negNode = new Node(Token.NEG, validNode, 0, 0);
        assertTrue(NodeUtil.isValidDefineValue(negNode, defines));
    }

    @Test
    public void testIsValidDefineValue_qualifiedNameIsDefine() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        Node defineName = NodeUtil.newQualifiedNameNode("MY_DEFINE", 0, 0);
        assertTrue(NodeUtil.isValidDefineValue(defineName, defines));
    }

    @Test
    public void testIsValidDefineValue_qualifiedNameNotDefine() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        Node otherName = NodeUtil.newQualifiedNameNode("OTHER_DEFINE", 0, 0);
        assertFalse(NodeUtil.isValidDefineValue(otherName, defines));
    }

    @Test
    public void testIsValidDefineValue_nonLiteralOrDefine() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertFalse(NodeUtil.isValidDefineValue(createNameNode("variable"), defines));
        assertFalse(NodeUtil.isValidDefineValue(createArrayLitNode(), defines));
        assertFalse(NodeUtil.isValidDefineValue(new Node(Token.ADD, 0, 0), defines));
    }

    @Test
    public void testIsEmptyBlock_emptyBlock() throws Exception {
        Node block = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_blockWithEmpty() throws Exception {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_blockWithStatements() throws Exception {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EXPR_RESULT));
        assertFalse(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_nonBlockNode() throws Exception {
        Node notABlock = new Node(Token.EXPR_RESULT);
        assertFalse(NodeUtil.isEmptyBlock(notABlock));
    }

    @Test
    public void testIsSimpleOperatorType_add() throws Exception {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    }

    @Test
    public void testIsSimpleOperatorType_mul() throws Exception {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.MUL));
    }

    @Test
    public void testIsSimpleOperatorType_eq() throws Exception {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.EQ));
    }

    @Test
    public void testIsSimpleOperatorType_bitand() throws Exception {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.BITAND));
    }

    @Test
    public void testIsSimpleOperatorType_not() throws Exception {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.NOT));
    }

    @Test
    public void testIsSimpleOperatorType_neg() throws Exception {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.NEG));
    }

    @Test
    public void testIsSimpleOperatorType_assignmentAdd() throws Exception {
        assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN_ADD));
    }

    @Test
    public void testIsSimpleOperatorType_conditionalOr() throws Exception {
        assertFalse(NodeUtil.isSimpleOperatorType(Token.OR));
    }

    @Test
    public void testIsSimpleOperatorType_hook() throws Exception {
        assertFalse(NodeUtil.isSimpleOperatorType(Token.HOOK));
    }

    @Test
    public void testIsSimpleOperatorType_unknown() throws Exception {
        assertFalse(NodeUtil.isSimpleOperatorType(Token.FUNCTION));
    }

    @Test
    public void testNewExpr() throws Exception {
        Node child = Node.newString(Token.STRING, "value", 0, 0);
        Node exprResult = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, exprResult.getType());
        assertEquals(child, exprResult.getFirstChild());
        assertEquals(child.getLineno(), exprResult.getLineno());
        assertEquals(child.getCharno(), exprResult.getCharno());
    }

    @Test
    public void testMayEffectMutableState_objectLit() throws Exception {
        assertTrue(NodeUtil.mayEffectMutableState(createObjectLitNode()));
    }

    @Test
    public void testMayEffectMutableState_arrayLit() throws Exception {
        assertTrue(NodeUtil.mayEffectMutableState(createArrayLitNode()));
    }

    @Test
    public void testMayEffectMutableState_regexpLit() throws Exception {
        assertTrue(NodeUtil.mayEffectMutableState(createRegExpNode(".*")));
    }

    @Test
    public void testMayEffectMutableState_functionDeclarationNamed() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("myFunc", Collections.emptyList(), body, 0, 0);
        assertTrue(NodeUtil.mayEffectMutableState(fn));
    }

    @Test
    public void testMayEffectMutableState_functionDeclarationAnonymous() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode(null, Collections.emptyList(), body, 0, 0);
        assertFalse(NodeUtil.mayEffectMutableState(fn));
    }

    @Test
    public void testMayEffectMutableState_newExpression() throws Exception {
        Node constructorCall = new Node(Token.NEW, createNameNode("MyClass"), 0, 0);
        assertTrue(NodeUtil.mayEffectMutableState(constructorCall));
    }

    @Test
    public void testMayEffectMutableState_newExpressionNoSideEffects() throws Exception {
        Node constructorCall = new Node(Token.NEW, createNameNode("Array"), 0, 0);
        constructorCall.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.mayEffectMutableState(constructorCall));
    }

    @Test
    public void testMayEffectMutableState_callExpression() throws Exception {
        Node functionCall = new Node(Token.CALL, createNameNode("myFunc"), 0, 0);
        assertTrue(NodeUtil.mayEffectMutableState(functionCall));
    }

    @Test
    public void testMayEffectMutableState_callExpressionNoSideEffects() throws Exception {
        Node functionCall = new Node(Token.CALL, createNameNode("String"), 0, 0);
        functionCall.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.mayEffectMutableState(functionCall));
    }

    @Test
    public void testMayEffectMutableState_assignment() throws Exception {
        Node lhs = createNameNode("x");
        Node rhs = createNumberNode(10);
        Node assign = new Node(Token.ASSIGN, lhs, rhs, 0, 0);
        assertTrue(NodeUtil.mayEffectMutableState(assign));
    }

    @Test
    public void testMayEffectMutableState_assignmentRhsEffect() throws Exception {
        Node lhs = createNameNode("x");
        Node rhs = createObjectLitNode(); // Has effect
        Node assign = new Node(Token.ASSIGN, lhs, rhs, 0, 0);
        assertTrue(NodeUtil.mayEffectMutableState(assign));
    }

    @Test
    public void testMayEffectMutableState_assignmentLhsEffect() throws Exception {
        Node lhs = createObjectLitNode(); // Has effect (even though it's RHS in essence)
        Node rhs = createNumberNode(10);
        Node assign = new Node(Token.ASSIGN, lhs, rhs, 0, 0);
        assertTrue(NodeUtil.mayEffectMutableState(assign));
    }

    @Test
    public void testMayEffectMutableState_nameWithChild() throws Exception {
        Node nameNode = createNameNode("variable");
        nameNode.addChildToBack(createNumberNode(10)); // Represents declaration
        assertTrue(NodeUtil.mayEffectMutableState(nameNode));
    }

    @Test
    public void testMayEffectMutableState_throwStatement() throws Exception {
        assertTrue(NodeUtil.mayEffectMutableState(new Node(Token.THROW, 0, 0)));
    }

    @Test
    public void testMayEffectMutableState_simpleExpression() throws Exception {
        assertFalse(NodeUtil.mayEffectMutableState(createNumberNode(10)));
        assertFalse(NodeUtil.mayEffectMutableState(createNameNode("constant")));
        assertFalse(NodeUtil.mayEffectMutableState(new Node(Token.TRUE)));
    }

    @Test
    public void testMayHaveSideEffects_objectLit() throws Exception {
        assertTrue(NodeUtil.mayHaveSideEffects(createObjectLitNode()));
    }

    @Test
    public void testMayHaveSideEffects_arrayLit() throws Exception {
        assertTrue(NodeUtil.mayHaveSideEffects(createArrayLitNode()));
    }

    @Test
    public void testMayHaveSideEffects_regexpLit() throws Exception {
        assertTrue(NodeUtil.mayHaveSideEffects(createRegExpNode(".*")));
    }

    @Test
    public void testMayHaveSideEffects_functionDeclarationNamed() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("myFunc", Collections.emptyList(), body, 0, 0);
        assertTrue(NodeUtil.mayHaveSideEffects(fn));
    }

    @Test
    public void testMayHaveSideEffects_functionDeclarationAnonymous() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode(null, Collections.emptyList(), body, 0, 0);
        assertFalse(NodeUtil.mayHaveSideEffects(fn));
    }

    @Test
    public void testMayHaveSideEffects_newExpression() throws Exception {
        Node constructorCall = new Node(Token.NEW, createNameNode("MyClass"), 0, 0);
        assertTrue(NodeUtil.mayHaveSideEffects(constructorCall));
    }

    @Test
    public void testMayHaveSideEffects_newExpressionNoSideEffects() throws Exception {
        Node constructorCall = new Node(Token.NEW, createNameNode("Array"), 0, 0);
        constructorCall.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.mayHaveSideEffects(constructorCall));
    }

    @Test
    public void testMayHaveSideEffects_callExpression() throws Exception {
        Node functionCall = new Node(Token.CALL, createNameNode("myFunc"), 0, 0);
        assertTrue(NodeUtil.mayHaveSideEffects(functionCall));
    }

    @Test
    public void testMayHaveSideEffects_callExpressionNoSideEffects() throws Exception {
        Node functionCall = new Node(Token.CALL, createNameNode("String"), 0, 0);
        functionCall.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.mayHaveSideEffects(functionCall));
    }

    @Test
    public void testMayHaveSideEffects_assignment() throws Exception {
        Node lhs = createNameNode("x");
        Node rhs = createNumberNode(10);
        Node assign = new Node(Token.ASSIGN, lhs, rhs, 0, 0);
        assertTrue(NodeUtil.mayHaveSideEffects(assign));
    }

    @Test
    public void testMayHaveSideEffects_assignmentRhsEffect() throws Exception {
        Node lhs = createNameNode("x");
        Node rhs = createObjectLitNode(); // Has effect
        Node assign = new Node(Token.ASSIGN, lhs, rhs, 0, 0);
        assertTrue(NodeUtil.mayHaveSideEffects(assign));
    }

    @Test
    public void testMayHaveSideEffects_assignmentLhsEffect() throws Exception {
        Node lhs = createObjectLitNode(); // Has effect
        Node rhs = createNumberNode(10);
        Node assign = new Node(Token.ASSIGN, lhs, rhs, 0, 0);
        assertTrue(NodeUtil.mayHaveSideEffects(assign));
    }

    @Test
    public void testMayHaveSideEffects_nameWithChild() throws Exception {
        Node nameNode = createNameNode("variable");
        nameNode.addChildToBack(createNumberNode(10)); // Represents declaration
        assertTrue(NodeUtil.mayHaveSideEffects(nameNode));
    }

    @Test
    public void testMayHaveSideEffects_throwStatement() throws Exception {
        assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.THROW, 0, 0)));
    }

    @Test
    public void testMayHaveSideEffects_simpleExpression() throws Exception {
        assertFalse(NodeUtil.mayHaveSideEffects(createNumberNode(10)));
        assertFalse(NodeUtil.mayHaveSideEffects(createNameNode("constant")));
        assertFalse(NodeUtil.mayHaveSideEffects(new Node(Token.TRUE)));
    }

    @Test
    public void testConstructorCallHasSideEffects_knownSideEffect() throws Exception {
        Node constructorCall = new Node(Token.NEW, createNameNode("MyClass"), 0, 0);
        assertTrue(NodeUtil.constructorCallHasSideEffects(constructorCall));
    }

    @Test
    public void testConstructorCallHasSideEffects_knownNoSideEffect() throws Exception {
        Node constructorCall = new Node(Token.NEW, createNameNode("Array"), 0, 0);
        constructorCall.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.constructorCallHasSideEffects(constructorCall));
    }

    @Test
    public void testConstructorCallHasSideEffects_builtinWithoutSideEffects() throws Exception {
        Node constructorCall = new Node(Token.NEW, createNameNode("Date"), 0, 0);
        assertFalse(NodeUtil.constructorCallHasSideEffects(constructorCall));
    }

    @Test
    public void testConstructorCallHasSideEffects_builtinWithSideEffects() throws Exception {
        Node constructorCall = new Node(Token.NEW, createNameNode("Error"), 0, 0);
        assertTrue(NodeUtil.constructorCallHasSideEffects(constructorCall));
    }

    @Test
    public void testFunctionCallHasSideEffects_knownSideEffect() throws Exception {
        Node functionCall = new Node(Token.CALL, createNameNode("myFunc"), 0, 0);
        assertTrue(NodeUtil.functionCallHasSideEffects(functionCall));
    }

    @Test
    public void testFunctionCallHasSideEffects_knownNoSideEffect() throws Exception {
        Node functionCall = new Node(Token.CALL, createNameNode("String"), 0, 0);
        functionCall.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.functionCallHasSideEffects(functionCall));
    }

    @Test
    public void testFunctionCallHasSideEffects_stringConversion() throws Exception {
        Node functionCall = new Node(Token.CALL, createNameNode("String"), 0, 0);
        assertFalse(NodeUtil.functionCallHasSideEffects(functionCall));
    }

    @Test
    public void testFunctionCallHasSideEffects_mathMethod() throws Exception {
        Node mathGetProp = new Node(Token.GETPROP, createNameNode("Math"), Node.newString(Token.STRING, "random"), 0, 0);
        Node functionCall = new Node(Token.CALL, mathGetProp, 0, 0);
        assertFalse(NodeUtil.functionCallHasSideEffects(functionCall));
    }

    @Test
    public void testFunctionCallHasSideEffects_otherMethod() throws Exception {
        Node objGetProp = new Node(Token.GETPROP, createNameNode("obj"), Node.newString(Token.STRING, "method"), 0, 0);
        Node functionCall = new Node(Token.CALL, objGetProp, 0, 0);
        assertTrue(NodeUtil.functionCallHasSideEffects(functionCall));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_call() throws Exception {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.CALL, 0, 0)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_new() throws Exception {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NEW, 0, 0)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_inc() throws Exception {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC, 0, 0)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_dec() throws Exception {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC, 0, 0)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_throw() throws Exception {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW, 0, 0)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_assignment() throws Exception {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ASSIGN, 0, 0)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_nameWithChildren() throws Exception {
        Node nameNode = new Node(Token.NAME, 0, 0);
        nameNode.addChildToBack(new Node(Token.NUMBER, 0, 0)); // Represents declaration
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_nameWithoutChildren() throws Exception {
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NAME, 0, 0)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_otherTypes() throws Exception {
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NUMBER, 0, 0)));
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.STRING, 0, 0)));
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.BLOCK, 0, 0)));
    }

    @Test
    public void testCanBeSideEffected_call() throws Exception {
        Set<String> constants = Collections.emptySet();
        assertTrue(NodeUtil.canBeSideEffected(new Node(Token.CALL, 0, 0), constants));
    }

    @Test
    public void testCanBeSideEffected_new() throws Exception {
        Set<String> constants = Collections.emptySet();
        assertTrue(NodeUtil.canBeSideEffected(new Node(Token.NEW, 0, 0), constants));
    }

    @Test
    public void testCanBeSideEffected_nameNotConstant() throws Exception {
        Set<String> constants = Collections.emptySet();
        Node nameNode = createNameNode("variable");
        assertFalse(NodeUtil.isConstantName(nameNode)); // Ensure it's not constant
        assertTrue(NodeUtil.canBeSideEffected(nameNode, constants));
    }

    @Test
    public void testCanBeSideEffected_nameConstant() throws Exception {
        Set<String> constants = Collections.emptySet();
        Node nameNode = createNameNode("CONSTANT");
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertFalse(NodeUtil.canBeSideEffected(nameNode, constants));
    }

    @Test
    public void testCanBeSideEffected_nameKnownConstant() throws Exception {
        Set<String> constants = Collections.singleton("variable");
        Node nameNode = createNameNode("variable");
        assertFalse(NodeUtil.isConstantName(nameNode)); // Ensure it's not constant by property
        assertTrue(NodeUtil.canBeSideEffected(nameNode, constants));
    }

    @Test
    public void testCanBeSideEffected_getprop() throws Exception {
        Set<String> constants = Collections.emptySet();
        Node obj = createNameNode("obj");
        Node prop = Node.newString(Token.STRING, "prop", 0, 0);
        assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETPROP, obj, prop, 0, 0), constants));
    }

    @Test
    public void testCanBeSideEffected_getelem() throws Exception {
        Set<String> constants = Collections.emptySet();
        Node obj = createNameNode("obj");
        Node elem = createNumberNode(0);
        assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETELEM, obj, elem, 0, 0), constants));
    }

    @Test
    public void testCanBeSideEffected_anonymousFunction() throws Exception {
        Set<String> constants = Collections.emptySet();
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode(null, Collections.emptyList(), body, 0, 0);
        assertFalse(NodeUtil.canBeSideEffected(fn, constants));
    }

    @Test
    public void testCanBeSideEffected_namedFunction() throws Exception {
        Set<String> constants = Collections.emptySet();
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("myFunc", Collections.emptyList(), body, 0, 0);
        assertFalse(NodeUtil.canBeSideEffected(fn, constants));
    }

    @Test
    public void testCanBeSideEffected_emptySet() throws Exception {
        Set<String> constants = Collections.emptySet();
        Node numberNode = createNumberNode(123);
        assertFalse(NodeUtil.canBeSideEffected(numberNode, constants));
    }

    @Test
    public void testPrecedence_comma() throws Exception {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
    }

    @Test
    public void testPrecedence_assign() throws Exception {
        assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    }

    @Test
    public void testPrecedence_hook() throws Exception {
        assertEquals(2, NodeUtil.precedence(Token.HOOK));
    }

    @Test
    public void testPrecedence_or() throws Exception {
        assertEquals(3, NodeUtil.precedence(Token.OR));
    }

    @Test
    public void testPrecedence_and() throws Exception {
        assertEquals(4, NodeUtil.precedence(Token.AND));
    }

    @Test
    public void testPrecedence_bitOr() throws Exception {
        assertEquals(5, NodeUtil.precedence(Token.BITOR));
    }

    @Test
    public void testPrecedence_bitXor() throws Exception {
        assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    }

    @Test
    public void testPrecedence_bitAnd() throws Exception {
        assertEquals(7, NodeUtil.precedence(Token.BITAND));
    }

    @Test
    public void testPrecedence_eq() throws Exception {
        assertEquals(8, NodeUtil.precedence(Token.EQ));
    }

    @Test
    public void testPrecedence_lt() throws Exception {
        assertEquals(9, NodeUtil.precedence(Token.LT));
    }

    @Test
    public void testPrecedence_lsh() throws Exception {
        assertEquals(10, NodeUtil.precedence(Token.LSH));
    }

    @Test
    public void testPrecedence_add() throws Exception {
        assertEquals(11, NodeUtil.precedence(Token.ADD));
    }

    @Test
    public void testPrecedence_mul() throws Exception {
        assertEquals(12, NodeUtil.precedence(Token.MUL));
    }

    @Test
    public void testPrecedence_neg() throws Exception {
        assertEquals(13, NodeUtil.precedence(Token.NEG));
    }

    @Test
    public void testPrecedence_call() throws Exception {
        assertEquals(15, NodeUtil.precedence(Token.CALL));
    }

    @Test
    public void testPrecedence_number() throws Exception {
        assertEquals(15, NodeUtil.precedence(Token.NUMBER));
    }

    @Test(expected = Error.class)
    public void testPrecedence_unknown() throws Exception {
        NodeUtil.precedence(Token.LAST_TOKEN + 1);
    }

    @Test
    public void testIsAssociative_mul() throws Exception {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
    }

    @Test
    public void testIsAssociative_and() throws Exception {
        assertTrue(NodeUtil.isAssociative(Token.AND));
    }

    @Test
    public void testIsAssociative_or() throws Exception {
        assertTrue(NodeUtil.isAssociative(Token.OR));
    }

    @Test
    public void testIsAssociative_bitAnd() throws Exception {
        assertTrue(NodeUtil.isAssociative(Token.BITAND));
    }

    @Test
    public void testIsAssociative_bitOr() throws Exception {
        assertTrue(NodeUtil.isAssociative(Token.BITOR));
    }

    @Test
    public void testIsAssociative_add() throws Exception {
        assertFalse(NodeUtil.isAssociative(Token.ADD));
    }

    @Test
    public void testIsAssociative_sub() throws Exception {
        assertFalse(NodeUtil.isAssociative(Token.SUB));
    }

    @Test
    public void testIsAssignmentOp_assign() throws Exception {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN, 0, 0)));
    }

    @Test
    public void testIsAssignmentOp_assignAdd() throws Exception {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD, 0, 0)));
    }

    @Test
    public void testIsAssignmentOp_assignMod() throws Exception {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_MOD, 0, 0)));
    }

    @Test
    public void testIsAssignmentOp_notAssignment() throws Exception {
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD, 0, 0)));
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.EQ, 0, 0)));
    }

    @Test
    public void testGetOpFromAssignmentOp_assignAdd() throws Exception {
        assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD, 0, 0)));
    }

    @Test
    public void testGetOpFromAssignmentOp_assignSub() throws Exception {
        assertEquals(Token.SUB, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_SUB, 0, 0)));
    }

    @Test
    public void testGetOpFromAssignmentOp_assignBitAnd() throws Exception {
        assertEquals(Token.BITAND, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITAND, 0, 0)));
    }

    @Test
    public void testGetOpFromAssignmentOp_assignUrsh() throws Exception {
        assertEquals(Token.URSH, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_URSH, 0, 0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOpFromAssignmentOp_notAssignment() throws Exception {
        Node node = new Node(Token.ADD, 0, 0);
        NodeUtil.getOpFromAssignmentOp(node);
    }

    @Test
    public void testIsExpressionNode_exprResult() throws Exception {
        assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT, 0, 0)));
    }

    @Test
    public void testIsExpressionNode_notExprResult() throws Exception {
        assertFalse(NodeUtil.isExpressionNode(new Node(Token.NUMBER, 0, 0)));
    }

    @Test
    public void testContainsFunctionDeclaration_hasFunction() throws Exception {
        Node fn = NodeUtil.newFunctionNode("func", Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        Node script = new Node(Token.SCRIPT, fn, 0, 0);
        assertTrue(NodeUtil.containsFunctionDeclaration(script));
    }

    @Test
    public void testContainsFunctionDeclaration_noFunction() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NUMBER, 0, 0), 0, 0);
        assertFalse(NodeUtil.containsFunctionDeclaration(script));
    }

    @Test
    public void testReferencesThis_hasThis() throws Exception {
        Node thisNode = new Node(Token.THIS, 0, 0);
        Node functionBody = new Node(Token.BLOCK, thisNode, 0, 0);
        Node fn = NodeUtil.newFunctionNode("func", Collections.emptyList(), functionBody, 0, 0);
        assertTrue(NodeUtil.referencesThis(fn));
    }

    @Test
    public void testReferencesThis_noThis() throws Exception {
        Node functionBody = new Node(Token.BLOCK, new Node(Token.NUMBER, 0, 0), 0, 0);
        Node fn = NodeUtil.newFunctionNode("func", Collections.emptyList(), functionBody, 0, 0);
        assertFalse(NodeUtil.referencesThis(fn));
    }

    @Test
    public void testIsGet_getProp() throws Exception {
        Node obj = createNameNode("obj");
        Node prop = Node.newString(Token.STRING, "prop", 0, 0);
        assertTrue(NodeUtil.isGet(new Node(Token.GETPROP, obj, prop, 0, 0)));
    }

    @Test
    public void testIsGet_getElem() throws Exception {
        Node obj = createNameNode("obj");
        Node elem = createNumberNode(0);
        assertTrue(NodeUtil.isGet(new Node(Token.GETELEM, obj, elem, 0, 0)));
    }

    @Test
    public void testIsGet_notGet() throws Exception {
        assertFalse(NodeUtil.isGet(createNameNode("name")));
        assertFalse(NodeUtil.isGet(new Node(Token.CALL, 0, 0)));
    }

    @Test
    public void testIsGetProp_getProp() throws Exception {
        Node obj = createNameNode("obj");
        Node prop = Node.newString(Token.STRING, "prop", 0, 0);
        assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP, obj, prop, 0, 0)));
    }

    @Test
    public void testIsGetProp_notGetProp() throws Exception {
        assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM, 0, 0)));
        assertFalse(NodeUtil.isGetProp(createNameNode("name")));
    }

    @Test
    public void testIsName_nameNode() throws Exception {
        assertTrue(NodeUtil.isName(createNameNode("name")));
    }

    @Test
    public void testIsName_notNameNode() throws Exception {
        assertFalse(NodeUtil.isName(new Node(Token.STRING, 0, 0)));
        assertFalse(NodeUtil.isName(new Node(Token.NUMBER, 0, 0)));
    }

    @Test
    public void testIsNew_newNode() throws Exception {
        assertTrue(NodeUtil.isNew(new Node(Token.NEW, 0, 0)));
    }

    @Test
    public void testIsNew_notNewNode() throws Exception {
        assertFalse(NodeUtil.isNew(new Node(Token.CALL, 0, 0)));
        assertFalse(NodeUtil.isNew(createNameNode("name")));
    }

    @Test
    public void testIsVar_varNode() throws Exception {
        assertTrue(NodeUtil.isVar(new Node(Token.VAR, 0, 0)));
    }

    @Test
    public void testIsVar_notVarNode() throws Exception {
        assertFalse(NodeUtil.isVar(new Node(Token.NAME, 0, 0)));
        assertFalse(NodeUtil.isVar(new Node(Token.FUNCTION, 0, 0)));
    }

    @Test
    public void testIsVarDeclaration_varName() throws Exception {
        Node varNode = new Node(Token.VAR, createNameNode("varName"), 0, 0);
        assertTrue(NodeUtil.isVarDeclaration(varNode.getFirstChild()));
    }

    @Test
    public void testIsVarDeclaration_notVarName() throws Exception {
        assertFalse(NodeUtil.isVarDeclaration(createNameNode("notVarName")));
        assertFalse(NodeUtil.isVarDeclaration(new Node(Token.STRING, 0, 0)));
    }

    @Test
    public void testGetAssignedValue_varDeclaration() throws Exception {
        Node valueNode = createNumberNode(123);
        Node nameNode = new Node(Token.NAME, valueNode, 0, 0);
        Node varNode = new Node(Token.VAR, nameNode, 0, 0);
        assertEquals(valueNode, NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testGetAssignedValue_assignment() throws Exception {
        Node valueNode = createNumberNode(123);
        Node nameNode = createNameNode("varName");
        Node assignNode = new Node(Token.ASSIGN, nameNode, valueNode, 0, 0);
        assertEquals(valueNode, NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testGetAssignedValue_notDeclarationOrAssignment() throws Exception {
        Node nameNode = createNameNode("varName");
        assertNull(NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testGetAssignedValue_varDeclarationWithoutValue() throws Exception {
        Node nameNode = new Node(Token.NAME, 0, 0);
        Node varNode = new Node(Token.VAR, nameNode, 0, 0);
        assertNull(NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testIsString_stringNode() throws Exception {
        assertTrue(NodeUtil.isString(Node.newString(Token.STRING, "hello", 0, 0)));
    }

    @Test
    public void testIsString_notStringNode() throws Exception {
        assertFalse(NodeUtil.isString(createNameNode("name")));
        assertFalse(NodeUtil.isString(new Node(Token.NUMBER, 0, 0)));
    }

    @Test
    public void testIsExprAssign_exprResultWithAssign() throws Exception {
        Node assign = new Node(Token.ASSIGN, createNameNode("x"), createNumberNode(1), 0, 0);
        assertTrue(NodeUtil.isExprAssign(new Node(Token.EXPR_RESULT, assign, 0, 0)));
    }

    @Test
    public void testIsExprAssign_notExprResultAssign() throws Exception {
        Node assign = new Node(Token.ASSIGN, createNameNode("x"), createNumberNode(1), 0, 0);
        assertFalse(NodeUtil.isExprAssign(assign)); // Not EXPR_RESULT
        assertFalse(NodeUtil.isExprAssign(new Node(Token.EXPR_RESULT, createNumberNode(1), 0, 0))); // First child not ASSIGN
    }

    @Test
    public void testIsAssign_assignNode() throws Exception {
        assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN, 0, 0)));
    }

    @Test
    public void testIsAssign_notAssignNode() throws Exception {
        assertFalse(NodeUtil.isAssign(new Node(Token.ADD, 0, 0)));
        assertFalse(NodeUtil.isAssign(new Node(Token.EQ, 0, 0)));
    }

    @Test
    public void testIsExprCall_exprResultWithCall() throws Exception {
        Node call = new Node(Token.CALL, createNameNode("func"), 0, 0);
        assertTrue(NodeUtil.isExprCall(new Node(Token.EXPR_RESULT, call, 0, 0)));
    }

    @Test
    public void testIsExprCall_notExprCall() throws Exception {
        Node call = new Node(Token.CALL, createNameNode("func"), 0, 0);
        assertFalse(NodeUtil.isExprCall(call)); // Not EXPR_RESULT
        assertFalse(NodeUtil.isExprCall(new Node(Token.EXPR_RESULT, createNameNode("func"), 0, 0))); // First child not CALL
    }

    @Test
    public void testIsForIn_forInNode() throws Exception {
        Node forNode = new Node(Token.FOR, 0, 0);
        forNode.addChildToBack(createNameNode("i")); // Iterator
        forNode.addChildToBack(createArrayLitNode()); // Collection
        forNode.addChildToBack(new Node(Token.BLOCK)); // Body
        assertTrue(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsForIn_notForInNode() throws Exception {
        assertFalse(NodeUtil.isForIn(new Node(Token.FOR, 0, 0))); // Not enough children
        assertFalse(NodeUtil.isForIn(new Node(Token.WHILE, 0, 0))); // Not a FOR node
    }

    @Test
    public void testIsLoopStructure_for() throws Exception {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.FOR, 0, 0)));
    }

    @Test
    public void testIsLoopStructure_while() throws Exception {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.WHILE, 0, 0)));
    }

    @Test
    public void testIsLoopStructure_do() throws Exception {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.DO, 0, 0)));
    }

    @Test
    public void testIsLoopStructure_notLoop() throws Exception {
        assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF, 0, 0)));
        assertFalse(NodeUtil.isLoopStructure(new Node(Token.BLOCK, 0, 0)));
    }

    @Test
    public void testGetLoopCodeBlock_forLoop() throws Exception {
        Node forNode = new Node(Token.FOR, 0, 0);
        forNode.addChildToBack(createNameNode("i"));
        forNode.addChildToBack(createArrayLitNode());
        Node block = new Node(Token.BLOCK);
        forNode.addChildToBack(block);
        assertEquals(block, NodeUtil.getLoopCodeBlock(forNode));
    }

    @Test
    public void testGetLoopCodeBlock_whileLoop() throws Exception {
        Node whileNode = new Node(Token.WHILE, createNumberNode(1), 0, 0);
        Node block = new Node(Token.BLOCK);
        whileNode.addChildToBack(block);
        assertEquals(block, NodeUtil.getLoopCodeBlock(whileNode));
    }

    @Test
    public void testGetLoopCodeBlock_doLoop() throws Exception {
        Node doNode = new Node(Token.DO, 0, 0);
        Node block = new Node(Token.BLOCK);
        doNode.addChildToBack(block);
        doNode.addChildToBack(createNumberNode(1)); // condition
        assertEquals(block, NodeUtil.getLoopCodeBlock(doNode));
    }

    @Test
    public void testGetLoopCodeBlock_notLoop() throws Exception {
        assertNull(NodeUtil.getLoopCodeBlock(new Node(Token.IF, 0, 0)));
    }

    @Test
    public void testIsControlStructure_for() throws Exception {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.FOR, 0, 0)));
    }

    @Test
    public void testIsControlStructure_if() throws Exception {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.IF, 0, 0)));
    }

    @Test
    public void testIsControlStructure_switch() throws Exception {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.SWITCH, 0, 0)));
    }

    @Test
    public void testIsControlStructure_try() throws Exception {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.TRY, 0, 0)));
    }

    @Test
    public void testIsControlStructure_catch() throws Exception {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.CATCH, 0, 0)));
    }

    @Test
    public void testIsControlStructure_notControl() throws Exception {
        assertFalse(NodeUtil.isControlStructure(new Node(Token.BLOCK, 0, 0)));
        assertFalse(NodeUtil.isControlStructure(new Node(Token.FUNCTION, 0, 0)));
    }

    @Test
    public void testIsControlStructureCodeBlock_ifThen() throws Exception {
        Node ifNode = new Node(Token.IF, createNumberNode(1), new Node(Token.BLOCK), 0, 0);
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getLastChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_ifElse() throws Exception {
        Node ifNode = new Node(Token.IF, createNumberNode(1), new Node(Token.BLOCK), new Node(Token.BLOCK), 0, 0);
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getLastChild())); // The ELSE block
    }

    @Test
    public void testIsControlStructureCodeBlock_whileLoop() throws Exception {
        Node whileNode = new Node(Token.WHILE, createNumberNode(1), new Node(Token.BLOCK), 0, 0);
        assertTrue(NodeUtil.isControlStructureCodeBlock(whileNode, whileNode.getLastChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_forLoop() throws Exception {
        Node forNode = new Node(Token.FOR, createNameNode("i"), createArrayLitNode(), new Node(Token.BLOCK), 0, 0);
        assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, forNode.getLastChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_doLoop() throws Exception {
        Node doNode = new Node(Token.DO, new Node(Token.BLOCK), createNumberNode(1), 0, 0);
        assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, doNode.getFirstChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_switchCase() throws Exception {
        Node caseNode = new Node(Token.CASE, createNumberNode(1), new Node(Token.BLOCK), 0, 0);
        Node switchNode = new Node(Token.SWITCH, caseNode, 0, 0);
        assertTrue(NodeUtil.isControlStructureCodeBlock(switchNode, caseNode.getLastChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_switchDefault() throws Exception {
        Node defaultNode = new Node(Token.DEFAULT, new Node(Token.BLOCK), 0, 0);
        Node switchNode = new Node(Token.SWITCH, defaultNode, 0, 0);
        assertTrue(NodeUtil.isControlStructureCodeBlock(switchNode, defaultNode.getLastChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_tryBlock() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK), 0, 0);
        assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, tryNode.getFirstChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_tryCatch() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK), 0, 0);
        assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, tryNode.getFirstChild().getNext()));
    }

    @Test
    public void testIsControlStructureCodeBlock_tryFinally() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK), 0, 0);
        assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, tryNode.getLastChild()));
    }

    @Test
    public void testGetConditionExpression_ifNode() throws Exception {
        Node condition = createNumberNode(1);
        Node ifNode = new Node(Token.IF, condition, new Node(Token.BLOCK), 0, 0);
        assertEquals(condition, NodeUtil.getConditionExpression(ifNode));
    }

    @Test
    public void testGetConditionExpression_whileNode() throws Exception {
        Node condition = createNumberNode(1);
        Node whileNode = new Node(Token.WHILE, condition, new Node(Token.BLOCK), 0, 0);
        assertEquals(condition, NodeUtil.getConditionExpression(whileNode));
    }

    @Test
    public void testGetConditionExpression_doNode() throws Exception {
        Node condition = createNumberNode(1);
        Node doNode = new Node(Token.DO, new Node(Token.BLOCK), condition, 0, 0);
        assertEquals(condition, NodeUtil.getConditionExpression(doNode));
    }

    @Test
    public void testGetConditionExpression_forNodeWithCondition() throws Exception {
        Node condition = createNumberNode(1);
        Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), condition, new Node(Token.BLOCK), 0, 0); // 4 children
        assertEquals(condition, NodeUtil.getConditionExpression(forNode));
    }

    @Test
    public void testGetConditionExpression_forNodeWithoutCondition() throws Exception {
        Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.BLOCK), 0, 0); // 3 children
        assertNull(NodeUtil.getConditionExpression(forNode));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetConditionExpression_caseNode() throws Exception {
        Node caseNode = new Node(Token.CASE, createNumberNode(1), new Node(Token.BLOCK), 0, 0);
        NodeUtil.getConditionExpression(caseNode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetConditionExpression_malformedFor() throws Exception {
        Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.BLOCK), 0, 0); // 5 children
        NodeUtil.getConditionExpression(forNode);
    }

    @Test
    public void testIsStatementBlock_script() throws Exception {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT, 0, 0)));
    }

    @Test
    public void testIsStatementBlock_block() throws Exception {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK, 0, 0)));
    }

    @Test
    public void testIsStatementBlock_notStatementBlock() throws Exception {
        assertFalse(NodeUtil.isStatementBlock(new Node(Token.FUNCTION, 0, 0)));
        assertFalse(NodeUtil.isStatementBlock(new Node(Token.EXPR_RESULT, 0, 0)));
    }

    @Test
    public void testIsStatement_inScript() throws Exception {
        Node statement = new Node(Token.EXPR_RESULT, 0, 0);
        Node script = new Node(Token.SCRIPT, statement, 0, 0);
        assertTrue(NodeUtil.isStatement(statement));
    }

    @Test
    public void testIsStatement_inBlock() throws Exception {
        Node statement = new Node(Token.EXPR_RESULT, 0, 0);
        Node block = new Node(Token.BLOCK, statement, 0, 0);
        assertTrue(NodeUtil.isStatement(statement));
    }

    @Test
    public void testIsStatement_inLabel() throws Exception {
        Node statement = new Node(Token.EXPR_RESULT, 0, 0);
        Node label = new Node(Token.LABEL, Node.newString(Token.NAME, "mylabel"), statement, 0, 0);
        assertTrue(NodeUtil.isStatement(statement));
    }

    @Test
    public void testIsStatement_notStatement() throws Exception {
        Node function = NodeUtil.newFunctionNode("func", Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        assertFalse(NodeUtil.isStatement(function));
    }

    @Test
    public void testIsSwitchCase_caseNode() throws Exception {
        assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE, 0, 0)));
    }

    @Test
    public void testIsSwitchCase_defaultNode() throws Exception {
        assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT, 0, 0)));
    }

    @Test
    public void testIsSwitchCase_notSwitchCase() throws Exception {
        assertFalse(NodeUtil.isSwitchCase(new Node(Token.BLOCK, 0, 0)));
        assertFalse(NodeUtil.isSwitchCase(new Node(Token.IF, 0, 0)));
    }

    @Test
    public void testIsReferenceName_validName() throws Exception {
        assertTrue(NodeUtil.isReferenceName(createNameNode("varName")));
    }

    @Test
    public void testIsReferenceName_emptyName() throws Exception {
        assertFalse(NodeUtil.isReferenceName(createNameNode("")));
    }

    @Test
    public void testIsReferenceName_labelName() throws Exception {
        Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "myLabel"), new Node(Token.BLOCK), 0, 0);
        assertFalse(NodeUtil.isReferenceName(labelNode.getFirstChild()));
    }

    @Test
    public void testIsReferenceName_breakContinueTarget() throws Exception {
        Node breakNode = new Node(Token.BREAK, Node.newString(Token.NAME, "myLabel"), 0, 0);
        assertFalse(NodeUtil.isReferenceName(breakNode.getFirstChild()));
    }

    @Test
    public void testIsLabelName_labelNode() throws Exception {
        Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "myLabel"), new Node(Token.BLOCK), 0, 0);
        assertTrue(NodeUtil.isLabelName(labelNode.getFirstChild()));
    }

    @Test
    public void testIsLabelName_breakTarget() throws Exception {
        Node breakNode = new Node(Token.BREAK, Node.newString(Token.NAME, "myLabel"), 0, 0);
        assertTrue(NodeUtil.isLabelName(breakNode.getFirstChild()));
    }

    @Test
    public void testIsLabelName_continueTarget() throws Exception {
        Node continueNode = new Node(Token.CONTINUE, Node.newString(Token.NAME, "myLabel"), 0, 0);
        assertTrue(NodeUtil.isLabelName(continueNode.getFirstChild()));
    }

    @Test
    public void testIsLabelName_notLabel() throws Exception {
        assertFalse(NodeUtil.isLabelName(createNameNode("varName")));
    }

    @Test
    public void testIsTryFinallyNode_true() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK), 0, 0);
        assertTrue(NodeUtil.isTryFinallyNode(tryNode, tryNode.getLastChild()));
    }

    @Test
    public void testIsTryFinallyNode_false() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), 0, 0);
        assertFalse(NodeUtil.isTryFinallyNode(tryNode, tryNode.getFirstChild()));
    }

    @Test
    public void testRemoveChild_statementInBlock() throws Exception {
        Node block = new Node(Token.BLOCK);
        Node statement = new Node(Token.EXPR_RESULT, 0, 0);
        block.addChildToBack(statement);
        NodeUtil.removeChild(block, statement);
        assertNull(block.getFirstChild());
    }

    @Test
    public void testRemoveChild_varWithSingleChild() throws Exception {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME);
        varNode.addChildToBack(nameNode);
        Node parent = new Node(Token.BLOCK, varNode, 0, 0);
        NodeUtil.removeChild(parent, varNode);
        assertNull(parent.getFirstChild());
    }

    @Test
    public void testRemoveChild_varWithMultipleChildren() throws Exception {
        Node varNode = new Node(Token.VAR);
        Node name1 = new Node(Token.NAME);
        Node name2 = new Node(Token.NAME);
        varNode.addChildToBack(name1);
        varNode.addChildToBack(name2);
        Node parent = new Node(Token.BLOCK, varNode, 0, 0);
        NodeUtil.removeChild(varNode, name1);
        assertEquals(name2, varNode.getFirstChild());
        assertEquals(1, varNode.getChildCount());
    }

    @Test
    public void testRemoveChild_emptyBlock() throws Exception {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.STRING, "value", 0, 0));
        NodeUtil.removeChild(block, block); // Removing the block itself
        assertNull(block.getFirstChild());
        assertEquals(0, block.getChildCount());
    }

    @Test
    public void testRemoveChild_labelLastChild() throws Exception {
        Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "mylabel"), new Node(Token.BLOCK), 0, 0);
        Node parent = new Node(Token.BLOCK, labelNode, 0, 0);
        NodeUtil.removeChild(labelNode, labelNode.getLastChild());
        assertNull(labelNode.getFirstChild()); // Block removed
        assertNull(parent.getFirstChild()); // Label removed because it became empty
    }

    @Test
    public void testRemoveChild_forStatementEmpty() throws Exception {
        Node block = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), block, 0, 0);
        NodeUtil.removeChild(forNode, block);
        assertEquals(Token.EMPTY, forNode.getLastChild().getType());
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveChild_invalidAttempt() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node child = new Node(Token.NAME);
        parent.addChildToBack(child);
        NodeUtil.removeChild(parent, parent); // Trying to remove parent from parent
    }

    @Test
    public void testTryMergeBlock_mergeIntoBlock() throws Exception {
        Node parentBlock = new Node(Token.BLOCK);
        Node blockToMerge = new Node(Token.BLOCK);
        Node child1 = new Node(Token.NUMBER, 1, 0, 0);
        Node child2 = new Node(Token.NUMBER, 2, 0, 0);
        blockToMerge.addChildToBack(child1);
        blockToMerge.addChildToBack(child2);
        parentBlock.addChildToBack(blockToMerge);
        assertTrue(NodeUtil.tryMergeBlock(blockToMerge));
        assertEquals(child1, parentBlock.getFirstChild());
        assertEquals(child2, parentBlock.getLastChild());
        assertEquals(2, parentBlock.getChildCount());
    }

    @Test
    public void testTryMergeBlock_mergeIntoLabelWithOneChild() throws Exception {
        Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "myLabel"), 0, 0);
        Node blockToMerge = new Node(Token.BLOCK);
        Node child = new Node(Token.NUMBER, 1, 0, 0);
        blockToMerge.addChildToBack(child);
        labelNode.addChildToBack(blockToMerge);
        assertTrue(NodeUtil.tryMergeBlock(blockToMerge));
        assertEquals(child, labelNode.getFirstChild());
        assertEquals(1, labelNode.getChildCount());
    }

    @Test
    public void testTryMergeBlock_noMergeIntoLabelWithMultipleChildren() throws Exception {
        Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "myLabel"), 0, 0);
        Node blockToMerge = new Node(Token.BLOCK);
        Node child1 = new Node(Token.NUMBER, 1, 0, 0);
        Node child2 = new Node(Token.NUMBER, 2, 0, 0);
        blockToMerge.addChildToBack(child1);
        blockToMerge.addChildToBack(child2);
        labelNode.addChildToBack(blockToMerge);
        assertFalse(NodeUtil.tryMergeBlock(blockToMerge));
        assertEquals(blockToMerge, labelNode.getFirstChild());
        assertEquals(2, blockToMerge.getChildCount());
    }

    @Test
    public void testIsCall_callNode() throws Exception {
        assertTrue(NodeUtil.isCall(new Node(Token.CALL, 0, 0)));
    }

    @Test
    public void testIsCall_notCallNode() throws Exception {
        assertFalse(NodeUtil.isCall(new Node(Token.NEW, 0, 0)));
        assertFalse(NodeUtil.isCall(createNameNode("name")));
    }

    @Test
    public void testIsFunction_functionNode() throws Exception {
        assertTrue(NodeUtil.isFunction(NodeUtil.newFunctionNode("f", Collections.emptyList(), new Node(Token.BLOCK), 0, 0)));
    }

    @Test
    public void testIsFunction_notFunctionNode() throws Exception {
        assertFalse(NodeUtil.isFunction(new Node(Token.BLOCK, 0, 0)));
        assertFalse(NodeUtil.isFunction(new Node(Token.NAME, 0, 0)));
    }

    @Test
    public void testGetFunctionBody_validFunction() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("f", Collections.emptyList(), body, 0, 0);
        assertEquals(body, NodeUtil.getFunctionBody(fn));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFunctionBody_notFunction() throws Exception {
        NodeUtil.getFunctionBody(new Node(Token.BLOCK));
    }

    @Test
    public void testIsThis_thisNode() throws Exception {
        assertTrue(NodeUtil.isThis(new Node(Token.THIS, 0, 0)));
    }

    @Test
    public void testIsThis_notThisNode() throws Exception {
        assertFalse(NodeUtil.isThis(new Node(Token.NAME, 0, 0)));
        assertFalse(NodeUtil.isThis(new Node(Token.NUMBER, 0, 0)));
    }

    @Test
    public void testContainsCall_recursive() throws Exception {
        Node innerCall = new Node(Token.CALL, createNameNode("innerFunc"), 0, 0);
        Node functionBody = new Node(Token.BLOCK, innerCall, 0, 0);
        Node fn = NodeUtil.newFunctionNode("outerFunc", Collections.emptyList(), functionBody, 0, 0);
        assertTrue(NodeUtil.containsCall(fn));
    }

    @Test
    public void testContainsCall_noCall() throws Exception {
        Node functionBody = new Node(Token.BLOCK, new Node(Token.NUMBER, 0, 0), 0, 0);
        Node fn = NodeUtil.newFunctionNode("func", Collections.emptyList(), functionBody, 0, 0);
        assertFalse(NodeUtil.containsCall(fn));
    }

    @Test
    public void testIsFunctionDeclaration_namedFunctionStatement() throws Exception {
        Node fn = NodeUtil.newFunctionNode("func", Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        Node script = new Node(Token.SCRIPT, fn, 0, 0); // Function as statement
        assertTrue(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testIsFunctionDeclaration_anonymousFunctionExpression() throws Exception {
        Node fn = NodeUtil.newFunctionNode(null, Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        Node varAssign = new Node(Token.ASSIGN, createNameNode("x"), fn, 0, 0);
        assertFalse(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testIsFunctionDeclaration_namedAnonymousFunctionExpression() throws Exception {
        Node fn = NodeUtil.newFunctionNode("innerFunc", Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        Node varAssign = new Node(Token.ASSIGN, createNameNode("x"), fn, 0, 0);
        assertFalse(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_scriptLevel() throws Exception {
        Node fn = NodeUtil.newFunctionNode("func", Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        Node script = new Node(Token.SCRIPT, fn, 0, 0);
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_nestedInFunction() throws Exception {
        Node innerFn = NodeUtil.newFunctionNode("innerFunc", Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        Node outerFn = NodeUtil.newFunctionNode("outerFunc", Collections.emptyList(), new Node(Token.BLOCK, innerFn, 0, 0), 0, 0);
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(innerFn));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_anonymousFunction() throws Exception {
        Node fn = NodeUtil.newFunctionNode(null, Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        Node script = new Node(Token.SCRIPT, fn, 0, 0);
        assertFalse(NodeUtil.isHoistedFunctionDeclaration(fn));
    }

    @Test
    public void testIsAnonymousFunction_noNameNoStatement() throws Exception {
        Node fn = NodeUtil.newFunctionNode(null, Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        assertFalse(NodeUtil.isStatement(fn)); // Helper for understanding isAnonymousFunction
        assertTrue(NodeUtil.isAnonymousFunction(fn));
    }

    @Test
    public void testIsAnonymousFunction_namedButNotStatement() throws Exception {
        Node fn = NodeUtil.newFunctionNode("inner", Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        Node expression = new Node(Token.EXPR_RESULT, fn, 0, 0); // Not a statement
        assertFalse(NodeUtil.isStatement(fn)); // Helper for understanding isAnonymousFunction
        assertTrue(NodeUtil.isAnonymousFunction(fn));
    }

    @Test
    public void testIsAnonymousFunction_namedAndStatement() throws Exception {
        Node fn = NodeUtil.newFunctionNode("func", Collections.emptyList(), new Node(Token.BLOCK), 0, 0);
        Node script = new Node(Token.SCRIPT, fn, 0, 0); // Function declaration is a statement
        assertTrue(NodeUtil.isStatement(fn)); // Helper for understanding isAnonymousFunction
        assertFalse(NodeUtil.isAnonymousFunction(fn));
    }

    @Test
    public void testIsVarArgsFunction_hasArgumentsReference() throws Exception {
        Node argsName = createNameNode("arguments");
        Node block = new Node(Token.BLOCK, argsName, 0, 0);
        Node fn = NodeUtil.newFunctionNode("f", Collections.emptyList(), block, 0, 0);
        assertTrue(NodeUtil.isVarArgsFunction(fn));
    }

    @Test
    public void testIsVarArgsFunction_noArgumentsReference() throws Exception {
        Node block = new Node(Token.BLOCK, createNameNode("otherVar"), 0, 0);
        Node fn = NodeUtil.newFunctionNode("f", Collections.emptyList(), block, 0, 0);
        assertFalse(NodeUtil.isVarArgsFunction(fn));
    }

    @Test
    public void testIsVarArgsFunction_argumentsInInnerScope() throws Exception {
        Node innerArgsName = createNameNode("arguments");
        Node innerBlock = new Node(Token.BLOCK, innerArgsName, 0, 0);
        Node innerFn = NodeUtil.newFunctionNode("inner", Collections.emptyList(), innerBlock, 0, 0);
        Node outerBlock = new Node(Token.BLOCK, innerFn, 0, 0);
        Node outerFn = NodeUtil.newFunctionNode("outer", Collections.emptyList(), outerBlock, 0, 0);
        assertFalse(NodeUtil.isVarArgsFunction(outerFn)); // arguments in inner function, not detected by outer.

        Node directArgsName = createNameNode("arguments");
        Node outerDirectArgsBlock = new Node(Token.BLOCK, directArgsName, 0, 0);
        Node outerDirectArgsFn = NodeUtil.newFunctionNode("outerDirect", Collections.emptyList(), outerDirectArgsBlock, 0, 0);
        assertTrue(NodeUtil.isVarArgsFunction(outerDirectArgsFn));
    }

    @Test
    public void testIsObjectCallMethod_callMethodMatch() throws Exception {
        Node obj = createNameNode("obj");
        Node methodName = Node.newString(Token.STRING, "myMethod", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertTrue(NodeUtil.isObjectCallMethod(callNode, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_callMethodNoMatch() throws Exception {
        Node obj = createNameNode("obj");
        Node methodName = Node.newString(Token.STRING, "otherMethod", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertFalse(NodeUtil.isObjectCallMethod(callNode, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_callWithGetElem() throws Exception {
        Node obj = createNameNode("obj");
        Node methodIndex = createNumberNode(0);
        Node getElem = new Node(Token.GETELEM, obj, methodIndex, 0, 0);
        Node callNode = new Node(Token.CALL, getElem, 0, 0);
        assertFalse(NodeUtil.isObjectCallMethod(callNode, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_notCallNode() throws Exception {
        Node obj = createNameNode("obj");
        Node methodName = Node.newString(Token.STRING, "myMethod", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        assertFalse(NodeUtil.isObjectCallMethod(getProp, "myMethod"));
    }

    @Test
    public void testIsFunctionObjectCall_isCall() throws Exception {
        Node obj = createNameNode("obj");
        Node methodName = Node.newString(Token.STRING, "call", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertTrue(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsFunctionObjectCall_isApply() throws Exception {
        Node obj = createNameNode("obj");
        Node methodName = Node.newString(Token.STRING, "apply", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertTrue(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsFunctionObjectCall_isNotCallOrApply() throws Exception {
        Node obj = createNameNode("obj");
        Node methodName = Node.newString(Token.STRING, "other", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertFalse(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsFunctionObjectApply_isCall() throws Exception {
        Node obj = createNameNode("obj");
        Node methodName = Node.newString(Token.STRING, "call", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertTrue(NodeUtil.isFunctionObjectApply(callNode));
    }

    @Test
    public void testIsFunctionObjectApply_isApply() throws Exception {
        Node obj = createNameNode("obj");
        Node methodName = Node.newString(Token.STRING, "apply", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertTrue(NodeUtil.isFunctionObjectApply(callNode));
    }

    @Test
    public void testIsFunctionObjectApply_isNotCallOrApply() throws Exception {
        Node obj = createNameNode("obj");
        Node methodName = Node.newString(Token.STRING, "other", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertFalse(NodeUtil.isFunctionObjectApply(callNode));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_simpleCall() throws Exception {
        Node obj = createNameNode("myObject"); // NAME node
        Node methodName = Node.newString(Token.STRING, "call", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(callNode));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_complexObject() throws Exception {
        Node obj = new Node(Token.GETPROP, createNameNode("myObject"), Node.newString(Token.STRING, "prop", 0, 0), 0, 0); // Not a NAME
        Node methodName = Node.newString(Token.STRING, "call", 0, 0);
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(callNode));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_notCallMethod() throws Exception {
        Node obj = createNameNode("myObject");
        Node methodName = Node.newString(Token.STRING, "apply", 0, 0); // Not 'call'
        Node getProp = new Node(Token.GETPROP, obj, methodName, 0, 0);
        Node callNode = new Node(Token.CALL, getProp, 0, 0);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(callNode));
    }

    @Test
    public void testIsLhs_assignmentTarget() throws Exception {
        Node n = createNameNode("var");
        Node parent = new Node(Token.ASSIGN, n, createNumberNode(10), 0, 0);
        assertTrue(NodeUtil.isLhs(n, parent));
    }

    @Test
    public void testIsLhs_varDeclarationTarget() throws Exception {
        Node n = createNameNode("var");
        Node parent = new Node(Token.VAR, n, 0, 0);
        assertTrue(NodeUtil.isLhs(n, parent));
    }

    @Test
    public void testIsLhs_assignmentRhs() throws Exception {
        Node n = createNumberNode(10);
        Node parent = new Node(Token.ASSIGN, createNameNode("var"), n, 0, 0);
        assertFalse(NodeUtil.isLhs(n, parent));
    }

    @Test
    public void testIsLhs_regularNode() throws Exception {
        Node n = createNameNode("var");
        Node parent = new Node(Token.ADD, createNameNode("a"), createNameNode("b"), 0, 0);
        assertFalse(NodeUtil.isLhs(n, parent));
    }

    @Test
    public void testIsObjectLitKey_validKey() throws Exception {
        Node parent = new Node(Token.OBJECTLIT);
        Node keyNode = Node.newString(Token.STRING, "myKey", 0, 0);
        Node valueNode = createNumberNode(10);
        parent.addChildToBack(keyNode);
        parent.addChildToBack(valueNode);
        assertTrue(NodeUtil.isObjectLitKey(keyNode, parent));
    }

    @Test
    public void testIsObjectLitKey_valueNode() throws Exception {
        Node parent = new Node(Token.OBJECTLIT);
        Node keyNode = Node.newString(Token.STRING, "myKey", 0, 0);
        Node valueNode = createNumberNode(10);
        parent.addChildToBack(keyNode);
        parent.addChildToBack(valueNode);
        assertFalse(NodeUtil.isObjectLitKey(valueNode, parent));
    }

    @Test
    public void testIsObjectLitKey_notStringKey() throws Exception {
        Node parent = new Node(Token.OBJECTLIT);
        Node keyNode = createNumberNode(10); // Not a STRING node
        Node valueNode = createNumberNode(20);
        parent.addChildToBack(keyNode);
        parent.addChildToBack(valueNode);
        assertFalse(NodeUtil.isObjectLitKey(keyNode, parent));
    }

    @Test
    public void testIsObjectLitKey_notObjectLitParent() throws Exception {
        Node parent = new Node(Token.ARRAYLIT); // Not OBJECTLIT
        Node keyNode = Node.newString(Token.STRING, "myKey", 0, 0);
        Node valueNode = createNumberNode(10);
        parent.addChildToBack(keyNode);
        parent.addChildToBack(valueNode);
        assertFalse(NodeUtil.isObjectLitKey(keyNode, parent));
    }

    @Test
    public void testOpToStr_add() throws Exception {
        assertEquals("+", NodeUtil.opToStr(Token.ADD));
    }

    @Test
    public void testOpToStr_assignAdd() throws Exception {
        assertEquals("+=", NodeUtil.opToStr(Token.ASSIGN_ADD));
    }

    @Test
    public void testOpToStr_bitAnd() throws Exception {
        assertEquals("&", NodeUtil.opToStr(Token.BITAND));
    }

    @Test
    public void testOpToStr_sheq() throws Exception {
        assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    }

    @Test
    public void testOpToStr_void() throws Exception {
        assertEquals("void", NodeUtil.opToStr(Token.VOID));
    }

    @Test
    public void testOpToStr_unknown() throws Exception {
        assertNull(NodeUtil.opToStr(Token.LAST_TOKEN + 1));
    }

    @Test
    public void testOpToStrNoFail_add() throws Exception {
        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    }

    @Test(expected = Error.class)
    public void testOpToStrNoFail_unknown() throws Exception {
        NodeUtil.opToStrNoFail(Token.LAST_TOKEN + 1);
    }

    @Test
    public void testContainsTypeInOuterScope_findsDirectly() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NAME, 0, 0), 0, 0);
        assertTrue(NodeUtil.containsTypeInOuterScope(script, Token.NAME));
    }

    @Test
    public void testContainsTypeInOuterScope_doesNotFindInFunction() throws Exception {
        Node fnBody = new Node(Token.BLOCK, new Node(Token.NAME, 0, 0), 0, 0);
        Node fn = NodeUtil.newFunctionNode("f", Collections.emptyList(), fnBody, 0, 0);
        Node script = new Node(Token.SCRIPT, fn, 0, 0);
        assertFalse(NodeUtil.containsTypeInOuterScope(script, Token.NAME));
    }

    @Test
    public void testContainsType_directMatch() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NAME, 0, 0), 0, 0);
        assertTrue(NodeUtil.containsType(script, Token.NAME, Predicates.alwaysTrue()));
    }

    @Test
    public void testContainsType_recursiveMatch() throws Exception {
        Node block = new Node(Token.BLOCK, new Node(Token.NAME, 0, 0), 0, 0);
        Node script = new Node(Token.SCRIPT, block, 0, 0);
        assertTrue(NodeUtil.containsType(script, Token.NAME, Predicates.alwaysTrue()));
    }

    @Test
    public void testContainsType_noMatch() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NUMBER, 0, 0), 0, 0);
        assertFalse(NodeUtil.containsType(script, Token.NAME, Predicates.alwaysTrue()));
    }

    @Test
    public void testContainsType_withPredicate() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "test", 0, 0);
        Node script = new Node(Token.SCRIPT, nameNode, 0, 0);
        assertTrue(NodeUtil.containsType(script, Token.NAME, new NodeUtil.MatchNameNode("test")));
        assertFalse(NodeUtil.containsType(script, Token.NAME, new NodeUtil.MatchNameNode("other")));
    }

    @Test
    public void testContainsType_noTraversalPredicate() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "test", 0, 0);
        Node script = new Node(Token.SCRIPT, nameNode, 0, 0);
        // Predicate that prevents traversal
        assertFalse(NodeUtil.containsType(script, Token.NAME, Predicates.alwaysFalse()));
        assertTrue(NodeUtil.containsType(script, Token.SCRIPT, Predicates.alwaysFalse())); // Should find the script itself
    }

    @Test
    public void testContainsType_withScriptRoot() throws Exception {
        Node script = new Node(Token.SCRIPT, 0, 0);
        assertTrue(NodeUtil.containsType(script, Token.SCRIPT, Predicates.alwaysTrue()));
    }

    @Test
    public void testContainsType_withBlockRoot() throws Exception {
        Node block = new Node(Token.BLOCK, 0, 0);
        assertTrue(NodeUtil.containsType(block, Token.BLOCK, Predicates.alwaysTrue()));
    }

    @Test
    public void testGetVarsDeclaredInBranch_simpleVar() throws Exception {
        Node varDecl = new Node(Token.VAR, Node.newString(Token.NAME, "x", 0, 0), 0, 0);
        Node script = new Node(Token.SCRIPT, varDecl, 0, 0);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(script);
        assertEquals(1, vars.size());
        assertEquals("x", vars.iterator().next().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranch_nestedFunctionIgnored() throws Exception {
        Node innerFnBody = new Node(Token.BLOCK, new Node(Token.VAR, Node.newString(Token.NAME, "y", 0, 0), 0, 0), 0, 0);
        Node innerFn = NodeUtil.newFunctionNode("inner", Collections.emptyList(), innerFnBody, 0, 0);
        Node outerVarDecl = new Node(Token.VAR, Node.newString(Token.NAME, "x", 0, 0), 0, 0);
        Node script = new Node(Token.SCRIPT, outerVarDecl, innerFn, 0, 0);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(script);
        assertEquals(1, vars.size());
        assertEquals("x", vars.iterator().next().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranch_multipleVars() throws Exception {
        Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "x", 0, 0), 0, 0);
        Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "y", 0, 0), 0, 0);
        Node script = new Node(Token.SCRIPT, var1, var2, 0, 0);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(script);
        assertEquals(2, vars.size());
        Set<String> varNames = new HashSet<>();
        for (Node varNode : vars) {
            varNames.add(varNode.getString());
        }
        assertTrue(varNames.contains("x"));
        assertTrue(varNames.contains("y"));
    }

    @Test
    public void testGetVarsDeclaredInBranch_noVars() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NUMBER, 1, 0, 0), 0, 0);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(script);
        assertTrue(vars.isEmpty());
    }

    @Test
    public void testIsPrototypePropertyDeclaration_true() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.prototype.method", 0, 0);
        Node assign = new Node(Token.ASSIGN, qName, createNumberNode(10), 0, 0);
        assertTrue(NodeUtil.isPrototypePropertyDeclaration(new Node(Token.EXPR_RESULT, assign, 0, 0)));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_false_notExprAssign() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.prototype.method", 0, 0);
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(qName));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_false_notPrototype() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.other.method", 0, 0);
        Node assign = new Node(Token.ASSIGN, qName, createNumberNode(10), 0, 0);
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(new Node(Token.EXPR_RESULT, assign, 0, 0)));
    }

    @Test
    public void testIsPrototypeProperty_true() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.prototype.method", 0, 0);
        assertTrue(NodeUtil.isPrototypeProperty(qName));
    }

    @Test
    public void testIsPrototypeProperty_false_noPrototype() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.other.method", 0, 0);
        assertFalse(NodeUtil.isPrototypeProperty(qName));
    }

    @Test
    public void testIsPrototypeProperty_false_simpleName() throws Exception {
        Node qName = createNameNode("MyClass");
        assertFalse(NodeUtil.isPrototypeProperty(qName));
    }

    @Test
    public void testGetPrototypeClassName_simple() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.prototype.method", 0, 0);
        Node classNameNode = NodeUtil.getPrototypeClassName(qName);
        assertNotNull(classNameNode);
        assertEquals("MyClass", classNameNode.getString());
    }

    @Test
    public void testGetPrototypeClassName_nestedPrototype() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.prototype.sub.prototype.method", 0, 0);
        Node classNameNode = NodeUtil.getPrototypeClassName(qName);
        assertNotNull(classNameNode);
        assertEquals("MyClass", classNameNode.getString());
    }

    @Test
    public void testGetPrototypeClassName_noPrototype() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.other.method", 0, 0);
        assertNull(NodeUtil.getPrototypeClassName(qName));
    }

    @Test
    public void testGetPrototypePropertyName_simple() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.prototype.method", 0, 0);
        assertEquals("method", NodeUtil.getPrototypePropertyName(qName));
    }

    @Test
    public void testGetPrototypePropertyName_nestedPrototype() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.prototype.sub.prototype.method", 0, 0);
        assertEquals("method", NodeUtil.getPrototypePropertyName(qName));
    }

    @Test
    public void testGetPrototypePropertyName_noPrototype() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.other.method", 0, 0);
        assertEquals("other.method", NodeUtil.getPrototypePropertyName(qName));
    }

    @Test
    public void testNewUndefinedNode() throws Exception {
        Node undefinedNode = NodeUtil.newUndefinedNode();
        assertEquals(Token.VOID, undefinedNode.getType());
        assertEquals(Token.NUMBER, undefinedNode.getFirstChild().getType());
        assertEquals(0.0, undefinedNode.getFirstChild().getDouble(), 1e-9);
    }

    @Test
    public void testNewVarNode_withValue() throws Exception {
        Node value = createNumberNode(123);
        Node varNode = NodeUtil.newVarNode("myVar", value);
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(Token.NAME, varNode.getFirstChild().getType());
        assertEquals("myVar", varNode.getFirstChild().getString());
        assertEquals(value, varNode.getFirstChild().getFirstChild());
    }

    @Test
    public void testNewVarNode_withoutValue() throws Exception {
        Node varNode = NodeUtil.newVarNode("myVar", null);
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(Token.NAME, varNode.getFirstChild().getType());
        assertEquals("myVar", varNode.getFirstChild().getString());
        assertNull(varNode.getFirstChild().getFirstChild());
    }

    @Test
    public void testIsNodeTypeReferenced_true() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NAME, 0, 0), 0, 0);
        assertTrue(NodeUtil.isNodeTypeReferenced(script, Token.NAME));
    }

    @Test
    public void testIsNodeTypeReferenced_false() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NUMBER, 0, 0), 0, 0);
        assertFalse(NodeUtil.isNodeTypeReferenced(script, Token.NAME));
    }

    @Test
    public void testIsNodeTypeReferenced_recursiveFalse() throws Exception {
        Node block = new Node(Token.BLOCK, new Node(Token.NAME, 0, 0), 0, 0);
        Node script = new Node(Token.SCRIPT, block, 0, 0);
        assertFalse(NodeUtil.isNodeTypeReferenced(script, Token.NUMBER));
    }

    @Test
    public void testIsNodeTypeReferenced_withPredicate() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "test", 0, 0);
        Node script = new Node(Token.SCRIPT, nameNode, 0, 0);
        assertTrue(NodeUtil.isNodeTypeReferenced(script, Token.NAME, new NodeUtil.MatchNameNode("test")));
        assertFalse(NodeUtil.isNodeTypeReferenced(script, Token.NAME, new NodeUtil.MatchNameNode("other")));
    }

    @Test
    public void testGetNodeTypeReferenceCount_one() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NAME, 0, 0), 0, 0);
        assertEquals(1, NodeUtil.getNodeTypeReferenceCount(script, Token.NAME));
    }

    @Test
    public void testGetNodeTypeReferenceCount_multiple() throws Exception {
        Node name1 = new Node(Token.NAME, 0, 0);
        Node name2 = new Node(Token.NAME, 0, 0);
        Node script = new Node(Token.SCRIPT, name1, name2, 0, 0);
        assertEquals(2, NodeUtil.getNodeTypeReferenceCount(script, Token.NAME));
    }

    @Test
    public void testGetNodeTypeReferenceCount_zero() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NUMBER, 0, 0), 0, 0);
        assertEquals(0, NodeUtil.getNodeTypeReferenceCount(script, Token.NAME));
    }

    @Test
    public void testIsNameReferenced_true() throws Exception {
        Node script = new Node(Token.SCRIPT, createNameNode("targetName"), 0, 0);
        assertTrue(NodeUtil.isNameReferenced(script, "targetName"));
    }

    @Test
    public void testIsNameReferenced_false() throws Exception {
        Node script = new Node(Token.SCRIPT, createNameNode("otherName"), 0, 0);
        assertFalse(NodeUtil.isNameReferenced(script, "targetName"));
    }

    @Test
    public void testIsNameReferenced_recursiveFalse() throws Exception {
        Node block = new Node(Token.BLOCK, createNameNode("targetName"), 0, 0);
        Node script = new Node(Token.SCRIPT, block, 0, 0);
        assertFalse(NodeUtil.isNameReferenced(script, "otherName"));
    }

    @Test
    public void testIsNameReferenced_withPredicate() throws Exception {
        Node nameNode = createNameNode("testName");
        Node script = new Node(Token.SCRIPT, nameNode, 0, 0);
        assertTrue(NodeUtil.isNameReferenced(script, "testName", Predicates.alwaysTrue()));
        assertFalse(NodeUtil.isNameReferenced(script, "otherName", Predicates.alwaysTrue()));
    }

    @Test
    public void testGetNameReferenceCount_one() throws Exception {
        Node script = new Node(Token.SCRIPT, createNameNode("targetName"), 0, 0);
        assertEquals(1, NodeUtil.getNameReferenceCount(script, "targetName"));
    }

    @Test
    public void testGetNameReferenceCount_multiple() throws Exception {
        Node name1 = createNameNode("targetName");
        Node name2 = createNameNode("targetName");
        Node script = new Node(Token.SCRIPT, name1, name2, 0, 0);
        assertEquals(2, NodeUtil.getNameReferenceCount(script, "targetName"));
    }

    @Test
    public void testGetNameReferenceCount_zero() throws Exception {
        Node script = new Node(Token.SCRIPT, createNameNode("otherName"), 0, 0);
        assertEquals(0, NodeUtil.getNameReferenceCount(script, "targetName"));
    }

    @Test
    public void testHas_true() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NAME, 0, 0), 0, 0);
        assertTrue(NodeUtil.has(script, new NodeUtil.MatchNodeType(Token.NAME), Predicates.alwaysTrue()));
    }

    @Test
    public void testHas_false() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NUMBER, 0, 0), 0, 0);
        assertFalse(NodeUtil.has(script, new NodeUtil.MatchNodeType(Token.NAME), Predicates.alwaysTrue()));
    }

    @Test
    public void testHas_recursiveTrue() throws Exception {
        Node block = new Node(Token.BLOCK, new Node(Token.NAME, 0, 0), 0, 0);
        Node script = new Node(Token.SCRIPT, block, 0, 0);
        assertTrue(NodeUtil.has(script, new NodeUtil.MatchNodeType(Token.NAME), Predicates.alwaysTrue()));
    }

    @Test
    public void testHas_withTraversalPredicate() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "test", 0, 0);
        Node script = new Node(Token.SCRIPT, nameNode, 0, 0);
        assertTrue(NodeUtil.has(script, new NodeUtil.MatchNameNode("test"), Predicates.alwaysTrue()));
        assertFalse(NodeUtil.has(script, new NodeUtil.MatchNameNode("other"), Predicates.alwaysTrue()));
    }

    @Test
    public void testHas_withTraversalPredicatePreventing() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "test", 0, 0);
        Node script = new Node(Token.SCRIPT, nameNode, 0, 0);
        // Prevent traversal into script itself
        assertFalse(NodeUtil.has(script, new NodeUtil.MatchNodeType(Token.NAME), Predicates.alwaysFalse()));
    }

    @Test
    public void testGetCount_one() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NAME, 0, 0), 0, 0);
        assertEquals(1, NodeUtil.getCount(script, new NodeUtil.MatchNodeType(Token.NAME)));
    }

    @Test
    public void testGetCount_multiple() throws Exception {
        Node name1 = new Node(Token.NAME, 0, 0);
        Node name2 = new Node(Token.NAME, 0, 0);
        Node script = new Node(Token.SCRIPT, name1, name2, 0, 0);
        assertEquals(2, NodeUtil.getCount(script, new NodeUtil.MatchNodeType(Token.NAME)));
    }

    @Test
    public void testGetCount_zero() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.NUMBER, 0, 0), 0, 0);
        assertEquals(0, NodeUtil.getCount(script, new NodeUtil.MatchNodeType(Token.NAME)));
    }

    @Test
    public void testVisitPreOrder_visitsAllNodes() throws Exception {
        final Set<Node> visitedNodes = new HashSet<>();
        Node script = new Node(Token.SCRIPT, new Node(Token.NAME, 0, 0), 0, 0);
        NodeUtil.visitPreOrder(script, new NodeUtil.Visitor() {
            @Override
            public void visit(Node node) {
                visitedNodes.add(node);
            }
        }, Predicates.alwaysTrue());
        assertTrue(visitedNodes.contains(script));
        assertTrue(visitedNodes.contains(script.getFirstChild()));
    }

    @Test
    public void testVisitPostOrder_visitsAllNodes() throws Exception {
        final Set<Node> visitedNodes = new HashSet<>();
        Node script = new Node(Token.SCRIPT, new Node(Token.NAME, 0, 0), 0, 0);
        NodeUtil.visitPostOrder(script, new NodeUtil.Visitor() {
            @Override
            public void visit(Node node) {
                visitedNodes.add(node);
            }
        }, Predicates.alwaysTrue());
        assertTrue(visitedNodes.contains(script));
        assertTrue(visitedNodes.contains(script.getFirstChild()));
    }

    @Test
    public void testHasFinally_true() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK), 0, 0);
        assertTrue(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testHasFinally_false() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), 0, 0); // No finally block
        assertFalse(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testGetCatchBlock_present() throws Exception {
        Node catchBlock = new Node(Token.BLOCK);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchBlock, new Node(Token.BLOCK), 0, 0);
        assertEquals(catchBlock, NodeUtil.getCatchBlock(tryNode));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCatchBlock_noCatch() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), 0, 0);
        NodeUtil.getCatchBlock(tryNode);
    }

    @Test
    public void testHasCatchHandler_true() throws Exception {
        Node catchNode = new Node(Token.CATCH, new Node(Token.NAME, "e", 0, 0), new Node(Token.BLOCK), 0, 0);
        Node block = new Node(Token.BLOCK, catchNode, 0, 0);
        assertTrue(NodeUtil.hasCatchHandler(block));
    }

    @Test
    public void testHasCatchHandler_false() throws Exception {
        Node block = new Node(Token.BLOCK, new Node(Token.BLOCK, 0, 0), 0, 0);
        assertFalse(NodeUtil.hasCatchHandler(block));
    }

    @Test
    public void testGetFnParameters_validFunction() throws Exception {
        Node param1 = createNameNode("p1");
        Node param2 = createNameNode("p2");
        Node lpNode = new Node(Token.LP, param1, param2, 0, 0);
        Node fn = NodeUtil.newFunctionNode("f", Collections.emptyList(), new Node(Token.BLOCK), 0, 0); // Creates placeholder LP
        fn.replaceChild(fn.getFirstChild().getNext(), lpNode); // Replace placeholder LP with actual params
        assertEquals(lpNode, NodeUtil.getFnParameters(fn));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFnParameters_notFunction() throws Exception {
        NodeUtil.getFnParameters(new Node(Token.BLOCK));
    }

    @Test
    public void testIsConstantName_true() throws Exception {
        Node nameNode = new Node(Token.NAME, 0, 0);
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(NodeUtil.isConstantName(nameNode));
    }

    @Test
    public void testIsConstantName_false() throws Exception {
        Node nameNode = new Node(Token.NAME, 0, 0);
        assertFalse(NodeUtil.isConstantName(nameNode));
    }

    @Test
    public void testGetSourceName_nodeWithSource() throws Exception {
        Node node = new Node(Token.NAME, 0, 0);
        node.putProp(Node.SOURCENAME_PROP, "source.js");
        assertEquals("source.js", NodeUtil.getSourceName(node));
    }

    @Test
    public void testGetSourceName_parentWithSource() throws Exception {
        Node parent = new Node(Token.SCRIPT, 0, 0);
        parent.putProp(Node.SOURCENAME_PROP, "source.js");
        Node node = new Node(Token.NAME, 0, 0);
        parent.addChildToBack(node);
        assertEquals("source.js", NodeUtil.getSourceName(node));
    }

    @Test
    public void testGetSourceName_noSource() throws Exception {
        Node node = new Node(Token.NAME, 0, 0);
        assertNull(NodeUtil.getSourceName(node));
    }

    // New tests for uncovered methods
    @Test
    public void testApply_nameNode() throws Exception {
        Node nameNode = createNameNode("test");
        NodeUtil.MatchNameNode predicate = new NodeUtil.MatchNameNode("test");
        assertTrue(predicate.apply(nameNode));
    }

    @Test
    public void testApply_differentNameNode() throws Exception {
        Node nameNode = createNameNode("test");
        NodeUtil.MatchNameNode predicate = new NodeUtil.MatchNameNode("other");
        assertFalse(predicate.apply(nameNode));
    }

    @Test
    public void testApply_nonNameNode() throws Exception {
        Node numberNode = createNumberNode(10);
        NodeUtil.MatchNameNode predicate = new NodeUtil.MatchNameNode("test");
        assertFalse(predicate.apply(numberNode));
    }

    // The `process` method is part of `PureFunctionIdentifier`, not `NodeUtil`.
    // Therefore, it cannot be directly tested within NodeUtilTest without significant mocking.
    // The prompt asks to test methods of the "class under test". Based on the prompt's structure,
    // the class under test is `NodeUtil`. I will omit tests for `process`, `shouldTraverse`,
    // `traverseEdge` and `toString` as they belong to `PureFunctionIdentifier` and its inner classes.

    // The `NodeUtil.MatchNameNode` class is an inner class of `NodeUtil`.
    // Making it public allows direct instantiation in tests.
    // Since it's `private static`, it needs to be made `public static` or tested via
    // methods that use it, like `containsType` and `isNameReferenced`.
    // The existing tests for `containsType` and `isNameReferenced` cover its usage.
    // For direct testing of `apply`, I will make a public static version.
    @Test
    public void testMatchNameNode_apply() throws Exception {
        Node nameNode = createNameNode("test");
        NodeUtil.MatchNameNode predicate = new NodeUtil.MatchNameNode("test");
        assertTrue(predicate.apply(nameNode));
        assertFalse(predicate.apply(createNameNode("other")));
        assertFalse(predicate.apply(createNumberNode(10)));
    }

    @Test
    public void testMatchNodeType_apply() throws Exception {
        Node numberNode = createNumberNode(10);
        NodeUtil.MatchNodeType predicate = new NodeUtil.MatchNodeType(Token.NUMBER);
        assertTrue(predicate.apply(numberNode));
        assertFalse(predicate.apply(createNameNode("test")));
    }
}
```