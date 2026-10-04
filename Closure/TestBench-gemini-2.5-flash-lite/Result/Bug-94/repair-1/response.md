```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class NodeUtilTest {

    @Test
    public void testGetExpressionBooleanValue_assign() throws Exception {
        Node assignNode = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), Node.newTrue());
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assignNode));
    }

    @Test
    public void testGetExpressionBooleanValue_comma() throws Exception {
        Node commaNode = new Node(Token.COMMA, Node.newTrue(), Node.newFalse());
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(commaNode));
    }

    @Test
    public void testGetExpressionBooleanValue_not() throws Exception {
        Node notNode = new Node(Token.NOT, Node.newFalse());
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(notNode));
    }

    @Test
    public void testGetExpressionBooleanValue_and_true_true() throws Exception {
        Node andNode = new Node(Token.AND, Node.newTrue(), Node.newTrue());
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(andNode));
    }

    @Test
    public void testGetExpressionBooleanValue_and_true_false() throws Exception {
        Node andNode = new Node(Token.AND, Node.newTrue(), Node.newFalse());
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(andNode));
    }

    @Test
    public void testGetExpressionBooleanValue_or_true_false() throws Exception {
        Node orNode = new Node(Token.OR, Node.newTrue(), Node.newFalse());
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(orNode));
    }

    @Test
    public void testGetExpressionBooleanValue_or_false_false() throws Exception {
        Node orNode = new Node(Token.OR, Node.newFalse(), Node.newFalse());
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(orNode));
    }

    @Test
    public void testGetExpressionBooleanValue_hook_true_true() throws Exception {
        Node hookNode = new Node(Token.HOOK, Node.newTrue(), Node.newTrue(), Node.newTrue());
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hookNode));
    }

    @Test
    public void testGetExpressionBooleanValue_hook_true_false() throws Exception {
        Node hookNode = new Node(Token.HOOK, Node.newTrue(), Node.newTrue(), Node.newFalse());
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookNode));
    }

    @Test
    public void testGetExpressionBooleanValue_literalString() throws Exception {
        Node stringNode = Node.newString("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(stringNode));
        stringNode = Node.newString("abc");
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(stringNode));
    }

    @Test
    public void testGetExpressionBooleanValue_literalNumber() throws Exception {
        Node numberNode = Node.newNumber(0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(numberNode));
        numberNode = Node.newNumber(1.5);
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(numberNode));
    }

    @Test
    public void testGetExpressionBooleanValue_literalBoolean() throws Exception {
        Node falseNode = Node.newFalse();
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(falseNode));
        Node trueNode = Node.newTrue();
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(trueNode));
    }

    @Test
    public void testGetExpressionBooleanValue_literalNull() throws Exception {
        Node nullNode = new Node(Token.NULL);
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(nullNode));
    }

    @Test
    public void testGetExpressionBooleanValue_literalUndefined() throws Exception {
        Node undefinedNode = new Node(Token.VOID);
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(undefinedNode));
    }

    @Test
    public void testGetExpressionBooleanValue_literalNaN() throws Exception {
        Node nanNode = Node.newString("NaN");
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(nanNode));
    }

    @Test
    public void testGetExpressionBooleanValue_literalInfinity() throws Exception {
        Node infinityNode = Node.newString("Infinity");
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(infinityNode));
    }

    @Test
    public void testGetExpressionBooleanValue_literalArray() throws Exception {
        Node arrayNode = new Node(Token.ARRAYLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(arrayNode));
    }

    @Test
    public void testGetExpressionBooleanValue_literalObject() throws Exception {
        Node objectNode = new Node(Token.OBJECTLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(objectNode));
    }

    @Test
    public void testGetExpressionBooleanValue_literalRegExp() throws Exception {
        Node regexpNode = new Node(Token.REGEXP);
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(regexpNode));
    }

    @Test
    public void testGetExpressionBooleanValue_unknown() throws Exception {
        Node unknownNode = new Node(Token.ADD, new Node(Token.NAME, "a"), new Node(Token.NAME, "b"));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(unknownNode));
    }

    @Test
    public void testGetStringValue_stringLiteral() throws Exception {
        assertEquals("hello", NodeUtil.getStringValue(Node.newString("hello")));
    }

    @Test
    public void testGetStringValue_name() throws Exception {
        assertEquals("varName", NodeUtil.getStringValue(Node.newString(Token.NAME, "varName")));
    }

    @Test
    public void testGetStringValue_numberInteger() throws Exception {
        assertEquals("123", NodeUtil.getStringValue(Node.newNumber(123.0)));
    }

    @Test
    public void testGetStringValue_numberDouble() throws Exception {
        assertEquals("1.5", NodeUtil.getStringValue(Node.newNumber(1.5)));
    }

    @Test
    public void testGetStringValue_true() throws Exception {
        assertEquals("true", NodeUtil.getStringValue(Node.newTrue()));
    }

    @Test
    public void testGetStringValue_false() throws Exception {
        assertEquals("false", NodeUtil.getStringValue(Node.newFalse()));
    }

    @Test
    public void testGetStringValue_null() throws Exception {
        assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    }

    @Test
    public void testGetStringValue_undefined() throws Exception {
        assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));
    }

    @Test
    public void testGetStringValue_unknown() throws Exception {
        // The original code had Node(Token.ADD, Node(Token.NUMBER, 1), Node(Token.NUMBER, 2))
        // This constructor does not exist, and Node.newNumber expects a double
        Node unknownNode = new Node(Token.ADD, Node.newNumber(1.0), Node.newNumber(2.0));
        assertNull(NodeUtil.getStringValue(unknownNode));
    }

    @Test
    public void testGetFunctionName_simpleFunction() throws Exception {
        Node functionNode = new Node(Token.FUNCTION, Node.newString("myFunc"));
        assertEquals("myFunc", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetFunctionName_varAssignedFunction() throws Exception {
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "myVar"));
        varNode.addChildToBack(new Node(Token.FUNCTION));
        assertEquals("myVar", NodeUtil.getFunctionName(varNode.getLastChild()));
    }

    @Test
    public void testGetFunctionName_qualifiedAssignmentFunction() throws Exception {
        Node qualifiedName = NodeUtil.newQualifiedNameNode("obj.method", -1, -1);
        Node assignNode = new Node(Token.ASSIGN, qualifiedName, new Node(Token.FUNCTION));
        assertEquals("obj.method", NodeUtil.getFunctionName(assignNode.getLastChild()));
    }

    @Test
    public void testGetFunctionName_namedFunctionExpressionInVar() throws Exception {
        Node functionNode = new Node(Token.FUNCTION, Node.newString("innerFunc"));
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "outerVar"));
        varNode.addChildToBack(functionNode);
        assertEquals("outerVar", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetFunctionName_namedFunctionExpressionInAssign() throws Exception {
        Node functionNode = new Node(Token.FUNCTION, Node.newString("innerFunc"));
        Node qualifiedName = NodeUtil.newQualifiedNameNode("obj.method", -1, -1);
        Node assignNode = new Node(Token.ASSIGN, qualifiedName, functionNode);
        assertEquals("obj.method", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetNearestFunctionName_namedFunction() throws Exception {
        Node functionNode = new Node(Token.FUNCTION, Node.newString("myFunc"));
        assertEquals("myFunc", NodeUtil.getNearestFunctionName(functionNode));
    }

    @Test
    public void testGetNearestFunctionName_anonymousFunctionInVar() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "myVar"));
        varNode.addChildToBack(functionNode);
        assertEquals("myVar", NodeUtil.getNearestFunctionName(functionNode));
    }

    @Test
    public void testGetNearestFunctionName_anonymousFunctionInObjectLit() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        Node keyNode = Node.newString("myKey");
        Node objectLit = new Node(Token.OBJECTLIT, keyNode, functionNode);
        assertEquals("myKey", NodeUtil.getNearestFunctionName(functionNode));
    }

    @Test
    public void testIsImmutableValue_string() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(Node.newString("hello")));
    }

    @Test
    public void testIsImmutableValue_number() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(Node.newNumber(123.45)));
    }

    @Test
    public void testIsImmutableValue_booleanTrue() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(Node.newTrue()));
    }

    @Test
    public void testIsImmutableValue_booleanFalse() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(Node.newFalse()));
    }

    @Test
    public void testIsImmutableValue_null() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    }

    @Test
    public void testIsImmutableValue_undefined() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID)));
    }

    @Test
    public void testIsImmutableValue_negation() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NEG, Node.newNumber(5))));
    }

    @Test
    public void testIsImmutableValue_nameUndefined() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(Node.newString("undefined")));
    }

    @Test
    public void testIsImmutableValue_nameNaN() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(Node.newString("NaN")));
    }

    @Test
    public void testIsImmutableValue_nameInfinity() throws Exception {
        assertTrue(NodeUtil.isImmutableValue(Node.newString("Infinity")));
    }

    @Test
    public void testIsImmutableValue_variable() throws Exception {
        assertFalse(NodeUtil.isImmutableValue(Node.newString(Token.NAME, "x")));
    }

    @Test
    public void testIsLiteralValue_string() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(Node.newString("hello"), false));
    }

    @Test
    public void testIsLiteralValue_number() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(Node.newNumber(123.45), false));
    }

    @Test
    public void testIsLiteralValue_booleanTrue() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(Node.newTrue(), false));
    }

    @Test
    public void testIsLiteralValue_booleanFalse() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(Node.newFalse(), false));
    }

    @Test
    public void testIsLiteralValue_null() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.NULL), false));
    }

    @Test
    public void testIsLiteralValue_undefined() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.VOID), false));
    }

    @Test
    public void testIsLiteralValue_negation() throws Exception {
        assertFalse(NodeUtil.isLiteralValue(new Node(Token.NEG, Node.newNumber(5)), false));
    }

    @Test
    public void testIsLiteralValue_nameUndefined() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(Node.newString("undefined"), false));
    }

    @Test
    public void testIsLiteralValue_nameNaN() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(Node.newString("NaN"), false));
    }

    @Test
    public void testIsLiteralValue_nameInfinity() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(Node.newString("Infinity"), false));
    }

    @Test
    public void testIsLiteralValue_variable() throws Exception {
        assertFalse(NodeUtil.isLiteralValue(Node.newString(Token.NAME, "x"), false));
    }

    @Test
    public void testIsLiteralValue_arrayLiteral() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.ARRAYLIT), true));
        assertFalse(NodeUtil.isLiteralValue(new Node(Token.ARRAYLIT), false));
    }

    @Test
    public void testIsLiteralValue_objectLiteral() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.OBJECTLIT), true));
        assertFalse(NodeUtil.isLiteralValue(new Node(Token.OBJECTLIT), false));
    }

    @Test
    public void testIsLiteralValue_regExpLiteral() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.REGEXP), true));
        assertFalse(NodeUtil.isLiteralValue(new Node(Token.REGEXP), false));
    }

    @Test
    public void testIsLiteralValue_functionExpression() throws Exception {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.FUNCTION), true));
        assertFalse(NodeUtil.isLiteralValue(new Node(Token.FUNCTION), false));
    }

    @Test
    public void testIsValidDefineValue_string() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(Node.newString("value"), defines));
    }

    @Test
    public void testIsValidDefineValue_number() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(Node.newNumber(123), defines));
    }

    @Test
    public void testIsValidDefineValue_true() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(Node.newTrue(), defines));
    }

    @Test
    public void testIsValidDefineValue_false() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(Node.newFalse(), defines));
    }

    @Test
    public void testIsValidDefineValue_binaryOperator() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        Node addNode = new Node(Token.ADD, Node.newNumber(1.0), Node.newNumber(2.0));
        assertTrue(NodeUtil.isValidDefineValue(addNode, defines));
    }

    @Test
    public void testIsValidDefineValue_unaryOperator() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        Node negNode = new Node(Token.NEG, Node.newNumber(5.0));
        assertTrue(NodeUtil.isValidDefineValue(negNode, defines));
    }

    @Test
    public void testIsValidDefineValue_validDefineName() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "MY_DEFINE"), defines));
    }

    @Test
    public void testIsValidDefineValue_invalidDefineName() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertFalse(NodeUtil.isValidDefineValue(Node.newString(Token.NAME, "OTHER_DEFINE"), defines));
    }

    @Test
    public void testIsValidDefineValue_qualifiedName() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(NodeUtil.newQualifiedNameNode("MY_DEFINE", -1, -1), defines));
    }

    @Test
    public void testIsValidDefineValue_invalidQualifiedName() throws Exception {
        Set<String> defines = Collections.singleton("MY_DEFINE");
        assertFalse(NodeUtil.isValidDefineValue(NodeUtil.newQualifiedNameNode("obj.prop", -1, -1), defines));
    }

    @Test
    public void testIsValidDefineValue_complexValid() throws Exception {
        Set<String> defines = Collections.singleton("A");
        Node expr = new Node(Token.ADD, Node.newString(Token.NAME, "A"), Node.newNumber(5.0));
        assertTrue(NodeUtil.isValidDefineValue(expr, defines));
    }

    @Test
    public void testIsValidDefineValue_complexInvalid() throws Exception {
        Set<String> defines = Collections.singleton("A");
        Node expr = new Node(Token.ADD, Node.newString(Token.NAME, "A"), Node.newString(Token.NAME, "B"));
        assertFalse(NodeUtil.isValidDefineValue(expr, defines));
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
    public void testIsEmptyBlock_blockWithStatement() throws Exception {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EXPR_RESULT));
        assertFalse(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_notABlock() throws Exception {
        Node notABlock = new Node(Token.NAME, "test");
        assertFalse(NodeUtil.isEmptyBlock(notABlock));
    }

    @Test
    public void testIsSimpleOperator_add() throws Exception {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD)));
    }

    @Test
    public void testIsSimpleOperator_mul() throws Exception {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.MUL)));
    }

    @Test
    public void testIsSimpleOperator_assignAdd() throws Exception {
        assertFalse(NodeUtil.isSimpleOperator(new Node(Token.ASSIGN_ADD)));
    }

    @Test
    public void testIsSimpleOperator_comma() throws Exception {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.COMMA)));
    }

    @Test
    public void testIsSimpleOperator_logicalAnd() throws Exception {
        assertFalse(NodeUtil.isSimpleOperator(new Node(Token.AND)));
    }

    @Test
    public void testNewExpr() throws Exception {
        Node child = Node.newNumber(10);
        Node exprResult = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, exprResult.getType());
        assertSame(child, exprResult.getFirstChild());
    }

    @Test
    public void testMayHaveSideEffects_literalString() throws Exception {
        assertFalse(NodeUtil.mayHaveSideEffects(Node.newString("hello")));
    }

    @Test
    public void testMayHaveSideEffects_literalNumber() throws Exception {
        assertFalse(NodeUtil.mayHaveSideEffects(Node.newNumber(123.45)));
    }

    @Test
    public void testMayHaveSideEffects_variableDeclaration() throws Exception {
        Node varDecl = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        varDecl.getChildAtIndex(0).addChildToBack(Node.newNumber(5.0));
        assertTrue(NodeUtil.mayHaveSideEffects(varDecl));
    }

    @Test
    public void testMayHaveSideEffects_assignment() throws Exception {
        Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(5.0));
        assertTrue(NodeUtil.mayHaveSideEffects(assign));
    }

    @Test
    public void testMayHaveSideEffects_functionCall() throws Exception {
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
        assertTrue(NodeUtil.mayHaveSideEffects(call));
    }

    @Test
    public void testMayHaveSideEffects_newObject() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
        assertTrue(NodeUtil.mayHaveSideEffects(newNode));
    }

    @Test
    public void testMayHaveSideEffects_throwStatement() throws Exception {
        Node throwNode = new Node(Token.THROW, Node.newString("Error"));
        assertTrue(NodeUtil.mayHaveSideEffects(throwNode));
    }

    @Test
    public void testConstructorCallHasSideEffects_knownNoSideEffects() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
        assertFalse(NodeUtil.constructorCallHasSideEffects(newNode));
    }

    @Test
    public void testConstructorCallHasSideEffects_unknownConstructor() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "MyClass"));
        assertTrue(NodeUtil.constructorCallHasSideEffects(newNode));
    }

    @Test
    public void testConstructorCallHasSideEffects_withNoSideEffectsCallAnnotation() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString(Token.NAME, "MyClass"));
        newNode.putBooleanProp(Node.SIDE_EFFECT_FLAGS, true); // SIDE_EFFECT_FLAGS is int, needs boolean interpretation
        assertFalse(NodeUtil.constructorCallHasSideEffects(newNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_builtinNoSideEffects() throws Exception {
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "String"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_unknownFunction() throws Exception {
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "myFunc"));
        assertTrue(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_withNoSideEffectsCallAnnotation() throws Exception {
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "myFunc"));
        callNode.putBooleanProp(Node.SIDE_EFFECT_FLAGS, true); // SIDE_EFFECT_FLAGS is int, needs boolean interpretation
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_mathFunction() throws Exception {
        Node mathName = Node.newString(Token.NAME, "Math");
        Node getProp = new Node(Token.GETPROP, mathName, Node.newString("random"));
        Node callNode = new Node(Token.CALL, getProp);
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_stringReplaceWithLiteral() throws Exception {
        Node stringName = Node.newString(Token.STRING, "abc");
        Node getProp = new Node(Token.GETPROP, stringName, Node.newString("replace"));
        Node callNode = new Node(Token.CALL, getProp, Node.newString("a"), Node.newString("b"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_stringReplaceWithRegExp() throws Exception {
        Node stringName = Node.newString(Token.STRING, "abc");
        Node getProp = new Node(Token.GETPROP, stringName, Node.newString("replace"));
        Node callNode = new Node(Token.CALL, getProp, new Node(Token.REGEXP), Node.newString("b"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_regexpTest() throws Exception {
        Node regexpName = new Node(Token.REGEXP);
        Node getProp = new Node(Token.GETPROP, regexpName, Node.newString("test"));
        Node callNode = new Node(Token.CALL, getProp, Node.newString("abc"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testCallHasLocalResult_flagIsSet() throws Exception {
        Node callNode = new Node(Token.CALL);
        callNode.putIntProp(Node.SIDE_EFFECT_FLAGS, Node.FLAG_LOCAL_RESULTS);
        assertTrue(NodeUtil.callHasLocalResult(callNode));
    }

    @Test
    public void testCallHasLocalResult_flagNotSet() throws Exception {
        Node callNode = new Node(Token.CALL);
        assertFalse(NodeUtil.callHasLocalResult(callNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_assign() throws Exception {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ASSIGN)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_inc() throws Exception {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_call() throws Exception {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.CALL)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_new() throws Exception {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NEW)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_nameWithChild() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "x");
        nameNode.addChildToBack(Node.newNumber(5.0)); // Represents a declaration like `var x = 5;`
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_nameWithoutChild() throws Exception {
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(Node.newString(Token.NAME, "x")));
    }

    @Test
    public void testCanBeSideEffected_call() throws Exception {
        assertTrue(NodeUtil.canBeSideEffected(new Node(Token.CALL)));
    }

    @Test
    public void testCanBeSideEffected_new() throws Exception {
        assertTrue(NodeUtil.canBeSideEffected(new Node(Token.NEW)));
    }

    @Test
    public void testCanBeSideEffected_nameConstant() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "CONST_VAR");
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertFalse(NodeUtil.canBeSideEffected(nameNode));
    }

    @Test
    public void testCanBeSideEffected_nameNotConstant() throws Exception {
        assertTrue(NodeUtil.canBeSideEffected(Node.newString(Token.NAME, "normalVar")));
    }

    @Test
    public void testCanBeSideEffected_nameInKnownConstants() throws Exception {
        Set<String> knownConstants = Collections.singleton("myVar");
        assertTrue(NodeUtil.canBeSideEffected(Node.newString(Token.NAME, "myVar"), knownConstants));
    }

    @Test
    public void testCanBeSideEffected_getProp() throws Exception {
        assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETPROP)));
    }

    @Test
    public void testCanBeSideEffected_functionExpression() throws Exception {
        assertFalse(NodeUtil.canBeSideEffected(new Node(Token.FUNCTION)));
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
    public void testPrecedence_bitwiseOr() throws Exception {
        assertEquals(5, NodeUtil.precedence(Token.BITOR));
    }

    @Test
    public void testPrecedence_bitwiseXor() throws Exception {
        assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    }

    @Test
    public void testPrecedence_bitwiseAnd() throws Exception {
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
    public void testIsAssociative_mul() throws Exception {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
    }

    @Test
    public void testIsAssociative_add() throws Exception {
        assertFalse(NodeUtil.isAssociative(Token.ADD));
    }

    @Test
    public void testIsAssociative_and() throws Exception {
        assertTrue(NodeUtil.isAssociative(Token.AND));
    }

    @Test
    public void testIsAssignmentOp_assign() throws Exception {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    }

    @Test
    public void testIsAssignmentOp_add() throws Exception {
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
    }

    @Test
    public void testGetOpFromAssignmentOp_assignAdd() throws Exception {
        assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD)));
    }

    @Test
    public void testGetOpFromAssignmentOp_assignMod() throws Exception {
        assertEquals(Token.MOD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_MOD)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOpFromAssignmentOp_invalid() throws Exception {
        Node nonAssignment = new Node(Token.ADD);
        NodeUtil.getOpFromAssignmentOp(nonAssignment);
    }

    @Test
    public void testIsExpressionNode_exprResult() throws Exception {
        assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    }

    @Test
    public void testIsExpressionNode_block() throws Exception {
        assertFalse(NodeUtil.isExpressionNode(new Node(Token.BLOCK)));
    }

    @Test
    public void testContainsFunction_true() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.containsFunction(functionNode));
    }

    @Test
    public void testContainsFunction_false() throws Exception {
        Node numberNode = Node.newNumber(10.0);
        assertFalse(NodeUtil.containsFunction(numberNode));
    }

    @Test
    public void testReferencesThis_true() throws Exception {
        Node thisNode = new Node(Token.THIS);
        assertTrue(NodeUtil.referencesThis(thisNode));
    }

    @Test
    public void testReferencesThis_false() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "foo");
        assertFalse(NodeUtil.referencesThis(nameNode));
    }

    @Test
    public void testIsGet_getProp() throws Exception {
        assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    }

    @Test
    public void testIsGet_getElem() throws Exception {
        assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    }

    @Test
    public void testIsGet_name() throws Exception {
        assertFalse(NodeUtil.isGet(new Node(Token.NAME)));
    }

    @Test
    public void testIsGetProp_true() throws Exception {
        assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    }

    @Test
    public void testIsGetProp_false() throws Exception {
        assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));
    }

    @Test
    public void testIsName_true() throws Exception {
        assertTrue(NodeUtil.isName(new Node(Token.NAME)));
    }

    @Test
    public void testIsName_false() throws Exception {
        assertFalse(NodeUtil.isName(new Node(Token.STRING)));
    }

    @Test
    public void testIsNew_true() throws Exception {
        assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    }

    @Test
    public void testIsNew_false() throws Exception {
        assertFalse(NodeUtil.isNew(new Node(Token.CALL)));
    }

    @Test
    public void testIsVar_true() throws Exception {
        assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    }

    @Test
    public void testIsVar_false() throws Exception {
        assertFalse(NodeUtil.isVar(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsVarDeclaration_true() throws Exception {
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        assertTrue(NodeUtil.isVarDeclaration(varNode.getFirstChild()));
    }

    @Test
    public void testIsVarDeclaration_false() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isVarDeclaration(nameNode));
    }

    @Test
    public void testGetAssignedValue_var() throws Exception {
        Node valueNode = Node.newNumber(10.0);
        Node nameNode = Node.newString(Token.NAME, "x");
        nameNode.addChildToBack(valueNode);
        Node varNode = new Node(Token.VAR, nameNode);
        assertSame(valueNode, NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testGetAssignedValue_assign() throws Exception {
        Node valueNode = Node.newNumber(10.0);
        Node nameNode = Node.newString(Token.NAME, "x");
        Node assignNode = new Node(Token.ASSIGN, nameNode, valueNode);
        assertSame(valueNode, NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testGetAssignedValue_noAssignment() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertNull(NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testIsString_true() throws Exception {
        assertTrue(NodeUtil.isString(Node.newString("test")));
    }

    @Test
    public void testIsString_false() throws Exception {
        assertFalse(NodeUtil.isString(Node.newNumber(10.0)));
    }

    @Test
    public void testIsExprAssign_true() throws Exception {
        Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(5.0));
        assertTrue(NodeUtil.isExprAssign(new Node(Token.EXPR_RESULT, assignNode)));
    }

    @Test
    public void testIsExprAssign_false() throws Exception {
        assertFalse(NodeUtil.isExprAssign(new Node(Token.EXPR_RESULT, new Node(Token.ADD))));
    }

    @Test
    public void testIsAssign_true() throws Exception {
        assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    }

    @Test
    public void testIsAssign_false() throws Exception {
        assertFalse(NodeUtil.isAssign(new Node(Token.ADD)));
    }

    @Test
    public void testIsExprCall_true() throws Exception {
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
        assertTrue(NodeUtil.isExprCall(new Node(Token.EXPR_RESULT, callNode)));
    }

    @Test
    public void testIsExprCall_false() throws Exception {
        assertFalse(NodeUtil.isExprCall(new Node(Token.EXPR_RESULT, new Node(Token.ADD))));
    }

    @Test
    public void testIsForIn_true() throws Exception {
        Node forNode = new Node(Token.FOR, new Node(Token.VAR, Node.newString(Token.NAME, "x")), new Node(Token.IN), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsForIn_false() throws Exception {
        Node whileNode = new Node(Token.WHILE, Node.newTrue(), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isForIn(whileNode));
    }

    @Test
    public void testIsLoopStructure_for() throws Exception {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsLoopStructure_while() throws Exception {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.WHILE)));
    }

    @Test
    public void testIsLoopStructure_do() throws Exception {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.DO)));
    }

    @Test
    public void testIsLoopStructure_if() throws Exception {
        assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));
    }

    @Test
    public void testGetLoopCodeBlock_for() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, new Node(Token.VAR, Node.newString(Token.NAME, "x")), new Node(Token.IN), body);
        assertSame(body, NodeUtil.getLoopCodeBlock(forNode));
    }

    @Test
    public void testGetLoopCodeBlock_while() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, Node.newTrue(), body);
        assertSame(body, NodeUtil.getLoopCodeBlock(whileNode));
    }

    @Test
    public void testGetLoopCodeBlock_do() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node doNode = new Node(Token.DO, body, Node.newTrue());
        assertSame(body, NodeUtil.getLoopCodeBlock(doNode));
    }

    @Test
    public void testIsWithinLoop_true() throws Exception {
        Node loopBody = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, null, null, loopBody);
        Node nestedNode = new Node(Token.NAME, "y");
        loopBody.addChildToBack(nestedNode);
        assertTrue(NodeUtil.isWithinLoop(nestedNode));
    }

    @Test
    public void testIsWithinLoop_false() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        Node functionNode = new Node(Token.FUNCTION, Node.newString("f"), new Node(Token.LP), functionBody);
        Node nestedNode = new Node(Token.NAME, "y");
        functionBody.addChildToBack(nestedNode);
        assertFalse(NodeUtil.isWithinLoop(nestedNode));
    }

    @Test
    public void testIsControlStructure_for() throws Exception {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsControlStructure_if() throws Exception {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    }

    @Test
    public void testIsControlStructure_block() throws Exception {
        assertFalse(NodeUtil.isControlStructure(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsControlStructureCodeBlock_ifElse() throws Exception {
        Node ifNode = new Node(Token.IF, Node.newTrue(), new Node(Token.BLOCK), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getChildAtIndex(1)));
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getLastChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_for() throws Exception {
        Node forNode = new Node(Token.FOR, new Node(Token.VAR, Node.newString(Token.NAME, "i")), Node.newTrue(), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, forNode.getLastChild()));
    }

    @Test
    public void testGetConditionExpression_if() throws Exception {
        Node condition = Node.newTrue();
        Node ifNode = new Node(Token.IF, condition, new Node(Token.BLOCK));
        assertSame(condition, NodeUtil.getConditionExpression(ifNode));
    }

    @Test
    public void testGetConditionExpression_while() throws Exception {
        Node condition = Node.newTrue();
        Node whileNode = new Node(Token.WHILE, condition, new Node(Token.BLOCK));
        assertSame(condition, NodeUtil.getConditionExpression(whileNode));
    }

    @Test
    public void testGetConditionExpression_do() throws Exception {
        Node condition = Node.newTrue();
        Node doNode = new Node(Token.DO, new Node(Token.BLOCK), condition);
        assertSame(condition, NodeUtil.getConditionExpression(doNode));
    }

    @Test
    public void testGetConditionExpression_for() throws Exception {
        Node condition = Node.newTrue();
        Node forNode = new Node(Token.FOR, null, condition, null, new Node(Token.BLOCK)); // 4 children case
        assertSame(condition, NodeUtil.getConditionExpression(forNode));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetConditionExpression_malformedFor() throws Exception {
        Node forNode = new Node(Token.FOR); // malformed for statement
        NodeUtil.getConditionExpression(forNode);
    }

    @Test
    public void testIsStatementBlock_script() throws Exception {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    }

    @Test
    public void testIsStatementBlock_block() throws Exception {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsStatementBlock_name() throws Exception {
        assertFalse(NodeUtil.isStatementBlock(new Node(Token.NAME)));
    }

    @Test
    public void testIsStatement_block() throws Exception {
        Node block = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isStatement(block));
    }

    @Test
    public void testIsStatement_label() throws Exception {
        Node label = new Node(Token.LABEL, new Node(Token.BLOCK));
        assertTrue(NodeUtil.isStatement(label));
    }

    @Test
    public void testIsStatement_script() throws Exception {
        Node script = new Node(Token.SCRIPT, new Node(Token.BLOCK));
        assertTrue(NodeUtil.isStatement(script));
    }

    @Test
    public void testIsStatement_functionExpression() throws Exception {
        Node function = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isStatement(function));
    }

    @Test
    public void testIsSwitchCase_case() throws Exception {
        assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    }

    @Test
    public void testIsSwitchCase_default() throws Exception {
        assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT)));
    }

    @Test
    public void testIsSwitchCase_block() throws Exception {
        assertFalse(NodeUtil.isSwitchCase(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsReferenceName_true() throws Exception {
        assertTrue(NodeUtil.isReferenceName(Node.newString(Token.NAME, "myVar")));
    }

    @Test
    public void testIsReferenceName_emptyString() throws Exception {
        assertFalse(NodeUtil.isReferenceName(Node.newString(Token.NAME, "")));
    }

    @Test
    public void testIsLabelName_true() throws Exception {
        assertTrue(NodeUtil.isLabelName(new Node(Token.LABEL_NAME)));
    }

    @Test
    public void testIsLabelName_false() throws Exception {
        assertFalse(NodeUtil.isLabelName(new Node(Token.NAME)));
    }

    @Test
    public void testIsTryFinallyNode_true() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isTryFinallyNode(tryNode, tryNode.getLastChild()));
    }

    @Test
    public void testIsTryFinallyNode_false() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isTryFinallyNode(tryNode, tryNode.getLastChild()));
    }

    @Test
    public void testRemoveChild_varWithOtherChildren() throws Exception {
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
        Node childToRemove = varNode.getFirstChild();
        Node parent = new Node(Token.BLOCK, varNode);

        NodeUtil.removeChild(varNode, childToRemove);

        assertEquals(1, varNode.getChildCount());
        assertSame(varNode.getFirstChild(), varNode.getLastChild());
        assertEquals("b", varNode.getFirstChild().getString());
    }

    @Test
    public void testRemoveChild_varOnlyChild() throws Exception {
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node childToRemove = varNode.getFirstChild();
        Node parent = new Node(Token.BLOCK, varNode);

        NodeUtil.removeChild(varNode, childToRemove);

        assertEquals(0, varNode.getChildCount());
        // The VAR node itself should be removed when it becomes empty
        assertNotNull(parent.getFirstChild());
        assertNotSame(varNode, parent.getFirstChild());
        assertEquals(Token.BLOCK, parent.getFirstChild().getType()); // Should be just an empty block
    }

    @Test
    public void testRemoveChild_block() throws Exception {
        Node block = new Node(Token.BLOCK, Node.newString("a"));
        Node parent = new Node(Token.SCRIPT, block);
        NodeUtil.removeChild(parent, block);
        assertEquals(0, block.getChildCount()); // Block should be emptied
        assertNotNull(parent.getFirstChild());
        assertSame(block, parent.getFirstChild());
    }

    @Test
    public void testRemoveChild_labelOnlyChild() throws Exception {
        Node statement = new Node(Token.EXPR_RESULT);
        Node labelNode = new Node(Token.LABEL, statement);
        Node parent = new Node(Token.BLOCK, labelNode);

        NodeUtil.removeChild(labelNode, statement);

        // The LABEL node should be removed when it becomes empty
        assertNotNull(parent.getFirstChild());
        assertNotSame(labelNode, parent.getFirstChild());
        assertEquals(Token.BLOCK, parent.getFirstChild().getType()); // Should be just an empty block
    }

    @Test
    public void testTryMergeBlock_parentIsBlock() throws Exception {
        Node parentBlock = new Node(Token.BLOCK);
        Node childBlock = new Node(Token.BLOCK, Node.newString("a"), Node.newString("b"));
        parentBlock.addChildToBack(childBlock);

        NodeUtil.tryMergeBlock(childBlock);

        assertEquals(2, parentBlock.getChildCount());
        assertEquals(Token.STRING, parentBlock.getChildAtIndex(0).getType());
        assertEquals("a", parentBlock.getChildAtIndex(0).getString());
        assertEquals(Token.STRING, parentBlock.getChildAtIndex(1).getType());
        assertEquals("b", parentBlock.getChildAtIndex(1).getString());
    }

    @Test
    public void testTryMergeBlock_parentIsScript() throws Exception {
        Node scriptNode = new Node(Token.SCRIPT);
        Node childBlock = new Node(Token.BLOCK, Node.newString("a"), Node.newString("b"));
        scriptNode.addChildToBack(childBlock);

        NodeUtil.tryMergeBlock(childBlock);

        assertEquals(2, scriptNode.getChildCount());
        assertEquals(Token.STRING, scriptNode.getChildAtIndex(0).getType());
        assertEquals("a", scriptNode.getChildAtIndex(0).getString());
        assertEquals(Token.STRING, scriptNode.getChildAtIndex(1).getType());
        assertEquals("b", scriptNode.getChildAtIndex(1).getString());
    }

    @Test
    public void testTryMergeBlock_blockNotRemoved() throws Exception {
        Node parent = new Node(Token.NAME, "parent"); // Not a statement block
        Node block = new Node(Token.BLOCK);
        parent.addChildToBack(block);
        assertFalse(NodeUtil.tryMergeBlock(block));
    }

    @Test
    public void testIsCall_true() throws Exception {
        assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    }

    @Test
    public void testIsCall_false() throws Exception {
        assertFalse(NodeUtil.isCall(new Node(Token.NEW)));
    }

    @Test
    public void testIsFunction_true() throws Exception {
        assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsFunction_false() throws Exception {
        assertFalse(NodeUtil.isFunction(new Node(Token.CALL)));
    }

    @Test
    public void testGetFunctionBody_valid() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = new Node(Token.FUNCTION, Node.newString("name"), new Node(Token.LP), body);
        assertSame(body, NodeUtil.getFunctionBody(fn));
    }

    @Test
    public void testIsThis_true() throws Exception {
        assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    }

    @Test
    public void testIsThis_false() throws Exception {
        assertFalse(NodeUtil.isThis(new Node(Token.NAME)));
    }

    @Test
    public void testContainsCall_true() throws Exception {
        Node callNode = new Node(Token.CALL);
        assertTrue(NodeUtil.containsCall(new Node(Token.BLOCK, callNode)));
    }

    @Test
    public void testContainsCall_false() throws Exception {
        assertFalse(NodeUtil.containsCall(new Node(Token.BLOCK, new Node(Token.NAME))));
    }

    @Test
    public void testIsFunctionDeclaration_true() throws Exception {
        Node function = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK, function);
        assertTrue(NodeUtil.isFunctionDeclaration(function));
    }

    @Test
    public void testIsFunctionDeclaration_false() throws Exception {
        Node function = new Node(Token.FUNCTION);
        Node parent = new Node(Token.EXPR_RESULT, function);
        assertFalse(NodeUtil.isFunctionDeclaration(function));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_true() throws Exception {
        Node function = new Node(Token.FUNCTION);
        Node script = new Node(Token.SCRIPT, function);
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(function));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_false() throws Exception {
        Node function = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK, function);
        Node ifNode = new Node(Token.IF, Node.newTrue(), block);
        assertFalse(NodeUtil.isHoistedFunctionDeclaration(function));
    }

    @Test
    public void testIsFunctionExpression_true() throws Exception {
        Node function = new Node(Token.FUNCTION);
        Node parent = new Node(Token.EXPR_RESULT, function);
        assertTrue(NodeUtil.isFunctionExpression(function));
    }

    @Test
    public void testIsFunctionExpression_false() throws Exception {
        Node function = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK, function);
        assertFalse(NodeUtil.isFunctionExpression(function));
    }

    @Test
    public void testIsEmptyFunctionExpression_true() throws Exception {
        Node function = new Node(Token.FUNCTION, Node.newString("name"), new Node(Token.LP), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isEmptyFunctionExpression(function));
    }

    @Test
    public void testIsEmptyFunctionExpression_false() throws Exception {
        Node function = new Node(Token.FUNCTION, Node.newString("name"), new Node(Token.LP), new Node(Token.BLOCK, Node.newString("something")));
        assertFalse(NodeUtil.isEmptyFunctionExpression(function));
    }

    @Test
    public void testIsVarArgsFunction_true() throws Exception {
        Node argsName = Node.newString(Token.NAME, "arguments");
        Node function = new Node(Token.FUNCTION, Node.newString("name"), new Node(Token.LP), new Node(Token.BLOCK, argsName));
        assertTrue(NodeUtil.isVarArgsFunction(function));
    }

    @Test
    public void testIsVarArgsFunction_false() throws Exception {
        Node function = new Node(Token.FUNCTION, Node.newString("name"), new Node(Token.LP), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isVarArgsFunction(function));
    }

    @Test
    public void testIsObjectCallMethod_callMethodTrue() throws Exception {
        Node objName = Node.newString(Token.NAME, "obj");
        Node methodNameNode = Node.newString(Token.STRING, "myMethod");
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, objName, methodNameNode), Node.newNumber(1.0));
        assertTrue(NodeUtil.isObjectCallMethod(callNode, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_callMethodFalse() throws Exception {
        Node objName = Node.newString(Token.NAME, "obj");
        Node methodNameNode = Node.newString(Token.STRING, "otherMethod");
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, objName, methodNameNode), Node.newNumber(1.0));
        assertFalse(NodeUtil.isObjectCallMethod(callNode, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_callWithDifferentPropType() throws Exception {
        Node objName = Node.newString(Token.NAME, "obj");
        Node methodNameNode = Node.newString(Token.NAME, "myMethod"); // Should be STRING
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, objName, methodNameNode), Node.newNumber(1.0));
        assertFalse(NodeUtil.isObjectCallMethod(callNode, "myMethod"));
    }

    @Test
    public void testIsFunctionObjectCall_true() throws Exception {
        Node objName = Node.newString(Token.NAME, "obj");
        Node methodNameNode = Node.newString(Token.STRING, "call");
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, objName, methodNameNode));
        assertTrue(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsFunctionObjectCall_false() throws Exception {
        Node objName = Node.newString(Token.NAME, "obj");
        Node methodNameNode = Node.newString(Token.STRING, "apply");
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, objName, methodNameNode));
        assertFalse(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsFunctionObjectApply_true() throws Exception {
        Node objName = Node.newString(Token.NAME, "obj");
        Node methodNameNode = Node.newString(Token.STRING, "apply");
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, objName, methodNameNode));
        assertTrue(NodeUtil.isFunctionObjectApply(callNode));
    }

    @Test
    public void testIsFunctionObjectApply_false() throws Exception {
        Node objName = Node.newString(Token.NAME, "obj");
        Node methodNameNode = Node.newString(Token.STRING, "call");
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, objName, methodNameNode));
        assertFalse(NodeUtil.isFunctionObjectApply(callNode));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_true() throws Exception {
        Node objName = Node.newString(Token.NAME, "obj");
        Node methodNameNode = Node.newString(Token.STRING, "call");
        Node getProp = new Node(Token.GETPROP, objName, methodNameNode);
        Node callNode = new Node(Token.CALL, getProp);
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(callNode));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_false_notCall() throws Exception {
        Node objName = Node.newString(Token.NAME, "obj");
        Node methodNameNode = Node.newString(Token.STRING, "call");
        Node getProp = new Node(Token.GETPROP, objName, methodNameNode);
        Node notCallNode = new Node(Token.NEW, getProp);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(notCallNode));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_false_targetNotName() throws Exception {
        Node objName = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString(Token.STRING, "prop"));
        Node methodNameNode = Node.newString(Token.STRING, "call");
        Node getProp = new Node(Token.GETPROP, objName, methodNameNode);
        Node callNode = new Node(Token.CALL, getProp);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(callNode));
    }

    @Test
    public void testIsLhs_assignTarget() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "x");
        Node assignNode = new Node(Token.ASSIGN, nameNode, Node.newNumber(5.0));
        assertTrue(NodeUtil.isLhs(nameNode, assignNode));
    }

    @Test
    public void testIsLhs_varDeclaration() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "x");
        Node varNode = new Node(Token.VAR, nameNode);
        assertTrue(NodeUtil.isLhs(nameNode, varNode));
    }

    @Test
    public void testIsLhs_assignRhs() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "x");
        Node valueNode = Node.newNumber(5.0);
        Node assignNode = new Node(Token.ASSIGN, nameNode, valueNode);
        assertFalse(NodeUtil.isLhs(valueNode, assignNode));
    }

    @Test
    public void testIsObjectLitKey_true() throws Exception {
        Node keyNode = Node.newString(Token.STRING, "key");
        Node valueNode = Node.newNumber(1.0);
        Node objectLit = new Node(Token.OBJECTLIT, keyNode, valueNode);
        assertTrue(NodeUtil.isObjectLitKey(keyNode, objectLit));
    }

    @Test
    public void testIsObjectLitKey_false_value() throws Exception {
        Node keyNode = Node.newString(Token.STRING, "key");
        Node valueNode = Node.newNumber(1.0);
        Node objectLit = new Node(Token.OBJECTLIT, keyNode, valueNode);
        assertFalse(NodeUtil.isObjectLitKey(valueNode, objectLit));
    }

    @Test
    public void testIsObjectLitKey_false_notObjectLit() throws Exception {
        Node keyNode = Node.newString(Token.STRING, "key");
        Node valueNode = Node.newNumber(1.0);
        Node parent = new Node(Token.BLOCK, keyNode, valueNode);
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
    public void testOpToStr_eq() throws Exception {
        assertEquals("==", NodeUtil.opToStr(Token.EQ));
    }

    @Test
    public void testOpToStr_sheq() throws Exception {
        assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    }

    @Test
    public void testOpToStr_logicalAnd() throws Exception {
        assertEquals("&&", NodeUtil.opToStr(Token.AND));
    }

    @Test
    public void testOpToStr_logicalOr() throws Exception {
        assertEquals("||", NodeUtil.opToStr(Token.OR));
    }

    @Test
    public void testOpToStr_null() throws Exception {
        assertNull(NodeUtil.opToStr(Token.NAME)); // Not an operator
    }

    @Test
    public void testOpToStrNoFail_add() throws Exception {
        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    }

    @Test(expected = Error.class)
    public void testOpToStrNoFail_invalid() throws Exception {
        NodeUtil.opToStrNoFail(Token.NAME);
    }

    @Test
    public void testContainsType_true() throws Exception {
        assertTrue(NodeUtil.containsType(new Node(Token.BLOCK, new Node(Token.NAME)), Token.NAME));
    }

    @Test
    public void testContainsType_false() throws Exception {
        assertFalse(NodeUtil.containsType(new Node(Token.BLOCK, new Node(Token.NAME)), Token.STRING));
    }

    @Test
    public void testRedeclareVarsInsideBranch_noVars() throws Exception {
        Node branch = new Node(Token.BLOCK, new Node(Token.FUNCTION));
        Node originalParent = new Node(Token.SCRIPT, branch);
        NodeUtil.redeclareVarsInsideBranch(branch);
        assertEquals(0, branch.getChildCount());
        assertNull(originalParent.getFirstChild()); // The original branch should be removed
    }

    @Test
    public void testRedeclareVarsInsideBranch_withVars() throws Exception {
        Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
        Node branch = new Node(Token.BLOCK, var1, var2, new Node(Token.FUNCTION));
        Node addingRoot = new Node(Token.SCRIPT, branch); // The root where new vars are added

        NodeUtil.redeclareVarsInsideBranch(branch);

        // Original vars should be removed from branch
        assertEquals(1, branch.getChildCount());
        assertSame(Token.FUNCTION, branch.getFirstChild().getType());

        // Two new VAR nodes should be added to the front of the script
        assertEquals(3, addingRoot.getChildCount());
        assertEquals(Token.VAR, addingRoot.getChildAtIndex(0).getType());
        assertEquals("a", addingRoot.getChildAtIndex(0).getFirstChild().getString());
        assertEquals(Token.VAR, addingRoot.getChildAtIndex(1).getType());
        assertEquals("b", addingRoot.getChildAtIndex(1).getFirstChild().getString());
        assertSame(branch, addingRoot.getChildAtIndex(2));
    }

    @Test
    public void testCopyNameAnnotations_constant() throws Exception {
        Node source = Node.newString(Token.NAME, "myConst");
        source.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node destination = Node.newString(Token.NAME, "newConst");
        NodeUtil.copyNameAnnotations(source, destination);
        assertTrue(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testGetAddingRoot_script() throws Exception {
        Node script = new Node(Token.SCRIPT);
        assertEquals(script, NodeUtil.getAddingRoot(script));
    }

    @Test
    public void testGetAddingRoot_function() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        Node fn = new Node(Token.FUNCTION, Node.newString("f"), new Node(Token.LP), functionBody);
        assertEquals(functionBody, NodeUtil.getAddingRoot(fn));
    }

    @Test
    public void testNewFunctionNode() throws Exception {
        List<Node> params = Arrays.asList(Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
        Node body = new Node(Token.BLOCK);
        Node fn = NodeUtil.newFunctionNode("myFunc", params, body, -1, -1);

        assertEquals(Token.FUNCTION, fn.getType());
        assertEquals("myFunc", fn.getChildAtIndex(0).getString()); // FUNCTION NAME is first child
        assertEquals(Token.LP, fn.getChildAtIndex(1).getType());
        assertEquals(2, fn.getChildAtIndex(1).getChildCount());
        assertSame(params.get(0), fn.getChildAtIndex(1).getChildAtIndex(0));
        assertSame(params.get(1), fn.getChildAtIndex(1).getChildAtIndex(1));
        assertSame(body, fn.getLastChild());
    }

    @Test
    public void testNewQualifiedNameNode_simpleName() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("foo", -1, -1);
        assertEquals(Token.NAME, qName.getType());
        assertEquals("foo", qName.getString());
    }

    @Test
    public void testNewQualifiedNameNode_twoParts() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("foo.bar", -1, -1);
        assertEquals(Token.GETPROP, qName.getType());
        assertEquals(Token.NAME, qName.getFirstChild().getType());
        assertEquals("foo", qName.getFirstChild().getString());
        assertEquals(Token.STRING, qName.getLastChild().getType());
        assertEquals("bar", qName.getLastChild().getString());
    }

    @Test
    public void testNewQualifiedNameNode_threeParts() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("foo.bar.baz", -1, -1);
        assertEquals(Token.GETPROP, qName.getType());
        assertEquals(Token.GETPROP, qName.getFirstChild().getType());
        assertEquals("foo", qName.getFirstChild().getFirstChild().getString());
        assertEquals("bar", qName.getFirstChild().getLastChild().getString());
        assertEquals(Token.STRING, qName.getLastChild().getType());
        assertEquals("baz", qName.getLastChild().getString());
    }

    @Test
    public void testNewQualifiedNameNode_withBasisNode() throws Exception {
        Node basisNode = new Node(Token.NAME, "source.js");
        basisNode.copyInformationFrom(new Node(Token.STRING, "source.js")); // This line seems redundant, but keeping for original structure
        basisNode.putProp(Node.ORIGINALNAME_PROP, "original name");

        Node qName = NodeUtil.newQualifiedNameNode("foo.bar", basisNode, "originalName");

        assertEquals("foo.bar", qName.getQualifiedName());
        assertEquals("source.js", NodeUtil.getSourceName(qName));
        assertEquals("originalName", qName.getProp(Node.ORIGINALNAME_PROP));
    }

    @Test
    public void testNewName_simple() throws Exception {
        Node basisNode = new Node(Token.NAME, "source.js");
        basisNode.copyInformationFrom(new Node(Token.STRING, "source.js")); // Redundant, but keeping original structure
        Node newNode = NodeUtil.newName("newName", basisNode);
        assertEquals(Token.NAME, newNode.getType());
        assertEquals("newName", newNode.getString());
        assertEquals("source.js", NodeUtil.getSourceName(newNode));
    }

    @Test
    public void testNewName_withOriginalName() throws Exception {
        Node basisNode = new Node(Token.NAME, "source.js");
        basisNode.copyInformationFrom(new Node(Token.STRING, "source.js")); // Redundant
        Node newNode = NodeUtil.newName("newName", basisNode, "originalName");
        assertEquals(Token.NAME, newNode.getType());
        assertEquals("newName", newNode.getString());
        assertEquals("source.js", NodeUtil.getSourceName(newNode));
        assertEquals("originalName", newNode.getProp(Node.ORIGINALNAME_PROP));
    }

    @Test
    public void testIsLatin_allAscii() throws Exception {
        assertTrue(NodeUtil.isLatin("abcdefg123!@#"));
    }

    @Test
    public void testIsLatin_withUnicode() throws Exception {
        assertFalse(NodeUtil.isLatin("abc\u00E9")); // é
    }

    @Test
    public void testIsLatin_emptyString() throws Exception {
        assertTrue(NodeUtil.isLatin(""));
    }

    @Test
    public void testIsValidPropertyName_jsIdentifier() throws Exception {
        assertTrue(NodeUtil.isValidPropertyName("validName"));
    }

    @Test
    public void testIsValidPropertyName_keyword() throws Exception {
        assertFalse(NodeUtil.isValidPropertyName("if"));
    }

    @Test
    public void testIsValidPropertyName_unicode() throws Exception {
        assertFalse(NodeUtil.isValidPropertyName("abc\u00E9"));
    }

    @Test
    public void testIsValidPropertyName_empty() throws Exception {
        assertFalse(NodeUtil.isValidPropertyName(""));
    }

    @Test
    public void testGetVarsDeclaredInBranch_noVars() throws Exception {
        Node branch = new Node(Token.BLOCK, new Node(Token.FUNCTION));
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertTrue(vars.isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranch_withVars() throws Exception {
        Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
        Node branch = new Node(Token.BLOCK, var1, var2, new Node(Token.FUNCTION));
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(2, vars.size());
        assertTrue(vars.stream().anyMatch(v -> v.getString().equals("a")));
        assertTrue(vars.stream().anyMatch(v -> v.getString().equals("b")));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_true() throws Exception {
        Node protoName = NodeUtil.newQualifiedNameNode("MyClass.prototype.method", -1, -1);
        Node assign = new Node(Token.ASSIGN, protoName, Node.newString("value"));
        assertTrue(NodeUtil.isPrototypePropertyDeclaration(new Node(Token.EXPR_RESULT, assign)));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_false_notAssign() throws Exception {
        Node protoName = NodeUtil.newQualifiedNameNode("MyClass.prototype.method", -1, -1);
        Node expr = new Node(Token.EXPR_RESULT, protoName);
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(expr));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_false_notPrototype() throws Exception {
        Node propName = NodeUtil.newQualifiedNameNode("MyClass.someProp.method", -1, -1);
        Node assign = new Node(Token.ASSIGN, propName, Node.newString("value"));
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(new Node(Token.EXPR_RESULT, assign)));
    }

    @Test
    public void testIsPrototypeProperty_true() throws Exception {
        assertTrue(NodeUtil.isPrototypeProperty(NodeUtil.newQualifiedNameNode("MyClass.prototype.method", -1, -1)));
    }

    @Test
    public void testIsPrototypeProperty_false() throws Exception {
        assertFalse(NodeUtil.isPrototypeProperty(NodeUtil.newQualifiedNameNode("MyClass.method", -1, -1)));
    }

    @Test
    public void testGetPrototypeClassName_simple() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("MyClass.prototype.method", -1, -1);
        assertEquals("MyClass", NodeUtil.getPrototypeClassName(qName).getString());
    }

    @Test
    public void testGetPrototypeClassName_nested() throws Exception {
        Node qName = NodeUtil.newQualifiedNameNode("Namespace.Sub.prototype.method", -1, -1);
        assertEquals("Namespace.Sub", NodeUtil.getPrototypeClassName(qName).getQualifiedName());
    }

    @Test
    public void testGetPrototypeClassName_noPrototype() throws Exception {
        assertNull(NodeUtil.getPrototypeClassName(NodeUtil.newQualifiedNameNode("MyClass.method", -1, -1)));
    }

    @Test
    public void testGetPrototypePropertyName_simple() throws Exception {
        assertEquals("method", NodeUtil.getPrototypePropertyName(NodeUtil.newQualifiedNameNode("MyClass.prototype.method", -1, -1)));
    }

    @Test
    public void testGetPrototypePropertyName_nested() throws Exception {
        assertEquals("method", NodeUtil.getPrototypePropertyName(NodeUtil.newQualifiedNameNode("Namespace.Sub.prototype.method", -1, -1)));
    }

    @Test
    public void testGetPrototypePropertyName_noPrototype() throws Exception {
        assertNull(NodeUtil.getPrototypePropertyName(NodeUtil.newQualifiedNameNode("MyClass.method", -1, -1)));
    }

    @Test
    public void testNewUndefinedNode() throws Exception {
        Node basis = new Node(Token.NAME, "source.js");
        Node undefinedNode = NodeUtil.newUndefinedNode(basis);
        assertEquals(Token.VOID, undefinedNode.getType());
        assertEquals(0, undefinedNode.getChildCount());
        assertEquals(0, undefinedNode.getDouble(), 1e-9);
        assertEquals("source.js", NodeUtil.getSourceName(undefinedNode)); // Verify source info is copied
    }

    @Test
    public void testNewVarNode_withValue() throws Exception {
        Node value = Node.newNumber(10.0);
        Node varNode = NodeUtil.newVarNode("myVar", value);
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(1, varNode.getChildCount());
        Node nameNode = varNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("myVar", nameNode.getString());
        assertSame(value, nameNode.getFirstChild());
    }

    @Test
    public void testNewVarNode_noValue() throws Exception {
        Node varNode = NodeUtil.newVarNode("myVar", null);
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(1, varNode.getChildCount());
        Node nameNode = varNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("myVar", nameNode.getString());
        assertFalse(nameNode.hasChildren());
    }

    @Test
    public void testIsConstantName_true() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "CONST_VAR");
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(NodeUtil.isConstantName(nameNode));
    }

    @Test
    public void testIsConstantName_false() throws Exception {
        assertFalse(NodeUtil.isConstantName(Node.newString(Token.NAME, "normalVar")));
    }

    @Test
    public void testIsConstantByConvention_constantKey() throws Exception {
        CodingConvention mockConvention = new CodingConvention() {
            @Override public String getGlobalObjectKey(String s) { return null; }
            @Override public String getExportSymbolFunction(Node node) { return null; }
            @Override public boolean isConstantKey(String name) { return name.equals("CONSTANT_KEY"); }
            @Override public boolean isConstant(String name) { return false; }
            @Override public String getAbstractMethodName(Node n) { return null; }
            @Override public String getCtorName(Node n) { return null; }
            @Override public boolean isPropertyRenameable(String name) { return true; }
            @Override public String getFileOverview(Node node) { return null; }
            @Override public boolean isOptionalParameter(Node node) { return false; }
            @Override public boolean isVarArgParameter(Node node) { return false; }
            @Override public String getArrayWrapperName(Node node) { return null; }
            @Override public String getAnonFunctionPrefix() { return null; }
            @Override public String getObjectNewline() { return null; }
            @Override public boolean isSuperClass(Node n) { return false; }
            @Override public String getClassesDefinedBy(Node n) { return null; }
            @Override public void definePropUses(Node value, Node name) {}
            @Override public boolean isDefineCall(Node n) { return false;}
            @Override public boolean isGlobalMethod(Node n) { return false; }
            @Override public String getSingletonGetterName(Node n) { return null; }
            @Override public String extractConstructorName(Node n) { return null; }
            @Override public String normalizeInterfaceName(String name) { return null; }
            @Override public String normalizeConstructorName(String name) { return null; }
            @Override public String normalizeEnumName(String name) { return null; }
            @Override public boolean isImplement(Node n) { return false; }
            @Override public boolean isInterface(Node n) { return false; }
            @Override public boolean isPrivate(Node n) { return false; }
            @Override public boolean isProtected(Node n) { return false; }
            @Override public boolean isPublic(Node n) { return false; }
            @Override public String getCallSignature(Node n) { return null; }
            @Override public String getBuiltinExternalTypes(Node n) { return null; }
        };
        Node keyNode = Node.newString(Token.STRING, "CONSTANT_KEY");
        Node objectLit = new Node(Token.OBJECTLIT, keyNode, Node.newNumber(5.0));
        assertTrue(NodeUtil.isConstantByConvention(mockConvention, keyNode, objectLit));
    }

    @Test
    public void testIsConstantByConvention_constantName() throws Exception {
        CodingConvention mockConvention = new CodingConvention() {
            @Override public String getGlobalObjectKey(String s) { return null; }
            @Override public String getExportSymbolFunction(Node node) { return null; }
            @Override public boolean isConstantKey(String name) { return false; }
            @Override public boolean isConstant(String name) { return name.equals("CONSTANT_NAME"); }
            @Override public String getAbstractMethodName(Node n) { return null; }
            @Override public String getCtorName(Node n) { return null; }
            @Override public boolean isPropertyRenameable(String name) { return true; }
            @Override public String getFileOverview(Node node) { return null; }
            @Override public boolean isOptionalParameter(Node node) { return false; }
            @Override public boolean isVarArgParameter(Node node) { return false; }
            @Override public String getArrayWrapperName(Node node) { return null; }
            @Override public String getAnonFunctionPrefix() { return null; }
            @Override public String getObjectNewline() { return null; }
            @Override public boolean isSuperClass(Node n) { return false; }
            @Override public String getClassesDefinedBy(Node n) { return null; }
            @Override public void definePropUses(Node value, Node name) {}
            @Override public boolean isDefineCall(Node n) { return false;}
            @Override public boolean isGlobalMethod(Node n) { return false; }
            @Override public String getSingletonGetterName(Node n) { return null; }
            @Override public String extractConstructorName(Node n) { return null; }
            @Override public String normalizeInterfaceName(String name) { return null; }
            @Override public String normalizeConstructorName(String name) { return null; }
            @Override public String normalizeEnumName(String name) { return null; }
            @Override public boolean isImplement(Node n) { return false; }
            @Override public boolean isInterface(Node n) { return false; }
            @Override public boolean isPrivate(Node n) { return false; }
            @Override public boolean isProtected(Node n) { return false; }
            @Override public boolean isPublic(Node n) { return false; }
            @Override public String getCallSignature(Node n) { return null; }
            @Override public String getBuiltinExternalTypes(Node n) { return null; }
        };
        Node nameNode = Node.newString(Token.NAME, "CONSTANT_NAME");
        Node parent = new Node(Token.VAR, nameNode);
        assertTrue(NodeUtil.isConstantByConvention(mockConvention, nameNode, parent));
    }

    @Test
    public void testGetInfoForNameNode_direct() throws Exception {
        JSDocInfo info = new JSDocInfo();
        Node nameNode = Node.newString(Token.NAME, "myVar");
        nameNode.setJSDocInfo(info);
        assertSame(info, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetInfoForNameNode_fromVar() throws Exception {
        JSDocInfo info = new JSDocInfo();
        Node nameNode = Node.newString(Token.NAME, "myVar");
        Node varNode = new Node(Token.VAR, nameNode);
        varNode.setJSDocInfo(info);
        assertSame(info, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetInfoForNameNode_fromFunction() throws Exception {
        JSDocInfo info = new JSDocInfo();
        Node nameNode = Node.newString(Token.NAME, "myFunc");
        Node fnNode = new Node(Token.FUNCTION, nameNode, new Node(Token.LP), new Node(Token.BLOCK));
        fnNode.setJSDocInfo(info);
        assertSame(info, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetInfoForNameNode_null() throws Exception {
        assertNull(NodeUtil.getInfoForNameNode(null));
    }

    @Test
    public void testGetFunctionInfo_direct() throws Exception {
        JSDocInfo info = new JSDocInfo();
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.setJSDocInfo(info);
        assertSame(info, NodeUtil.getFunctionInfo(fnNode));
    }

    @Test
    public void testGetFunctionInfo_fromAssign() throws Exception {
        JSDocInfo info = new JSDocInfo();
        Node fnNode = new Node(Token.FUNCTION);
        Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), fnNode);
        assignNode.setJSDocInfo(info);
        assertSame(info, NodeUtil.getFunctionInfo(fnNode));
    }

    @Test
    public void testGetFunctionInfo_fromVar() throws Exception {
        JSDocInfo info = new JSDocInfo();
        Node fnNode = new Node(Token.FUNCTION);
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        varNode.addChildToBack(fnNode);
        varNode.setJSDocInfo(info);
        assertSame(info, NodeUtil.getFunctionInfo(fnNode));
    }

    @Test
    public void testGetSourceName_nodeHasProp() throws Exception {
        Node n = new Node(Token.NAME, "test");
        n.putProp(Node.SOURCENAME_PROP, "source.js");
        assertEquals("source.js", NodeUtil.getSourceName(n));
    }

    @Test
    public void testGetSourceName_parentHasProp() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        parent.putProp(Node.SOURCENAME_PROP, "source.js");
        Node n = new Node(Token.NAME, "test");
        parent.addChildToBack(n);
        assertEquals("source.js", NodeUtil.getSourceName(n));
    }

    @Test
    public void testGetSourceName_null() throws Exception {
        assertNull(NodeUtil.getSourceName(new Node(Token.NAME, "test")));
    }

    @Test
    public void testNewCallNode_freeCall() throws Exception {
        Node callTarget = Node.newString(Token.NAME, "foo");
        Node[] params = {Node.newNumber(1.0), Node.newNumber(2.0)};
        Node callNode = NodeUtil.newCallNode(callTarget, params);
        assertTrue(callNode.getBooleanProp(Node.FREE_CALL));
        assertEquals("foo", callNode.getFirstChild().getString());
        assertEquals(2, callNode.getChildCount() - 1); // -1 for the target itself
    }

    @Test
    public void testNewCallNode_nonFreeCall() throws Exception {
        Node objName = Node.newString(Token.NAME, "obj");
        Node methodName = Node.newString(Token.STRING, "method");
        Node getProp = new Node(Token.GETPROP, objName, methodName);
        Node[] params = {Node.newNumber(1.0)};
        Node callNode = NodeUtil.newCallNode(getProp, params);
        assertFalse(callNode.getBooleanProp(Node.FREE_CALL));
        assertSame(getProp, callNode.getFirstChild());
        assertEquals(1, callNode.getChildCount() - 1);
    }

    @Test
    public void testEvaluatesToLocalValue_assignImmutable() throws Exception {
        Node immutableChild = Node.newString("immutable");
        Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), immutableChild);
        assertTrue(NodeUtil.evaluatesToLocalValue(assignNode));
    }

    @Test
    public void testEvaluatesToLocalValue_assignMutable() throws Exception {
        Node mutableChild = Node.newString(Token.NAME, "x");
        Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "y"), mutableChild);
        assertFalse(NodeUtil.evaluatesToLocalValue(assignNode));
    }

    @Test
    public void testEvaluatesToLocalValue_comma() throws Exception {
        Node lastChild = Node.newNumber(10.0);
        Node commaNode = new Node(Token.COMMA, Node.newNumber(5.0), lastChild);
        assertTrue(NodeUtil.evaluatesToLocalValue(commaNode));
    }

    @Test
    public void testEvaluatesToLocalValue_and() throws Exception {
        Node left = Node.newNumber(1.0);
        Node right = Node.newNumber(2.0);
        Node andNode = new Node(Token.AND, left, right);
        assertTrue(NodeUtil.evaluatesToLocalValue(andNode));
    }

    @Test
    public void testEvaluatesToLocalValue_or() throws Exception {
        Node left = Node.newNumber(1.0);
        Node right = Node.newNumber(2.0);
        Node orNode = new Node(Token.OR, left, right);
        assertTrue(NodeUtil.evaluatesToLocalValue(orNode));
    }

    @Test
    public void testEvaluatesToLocalValue_hook() throws Exception {
        Node cond = Node.newNumber(1.0);
        Node trueBranch = Node.newNumber(2.0);
        Node falseBranch = Node.newNumber(3.0);
        Node hookNode = new Node(Token.HOOK, cond, trueBranch, falseBranch);
        assertTrue(NodeUtil.evaluatesToLocalValue(hookNode));
    }

    @Test
    public void testEvaluatesToLocalValue_inc() throws Exception {
        Node operand = Node.newNumber(5.0);
        Node incNode = new Node(Token.INC, operand);
        assertTrue(NodeUtil.evaluatesToLocalValue(incNode));
    }

    @Test
    public void testEvaluatesToLocalValue_dec() throws Exception {
        Node operand = Node.newNumber(5.0);
        Node decNode = new Node(Token.DEC, operand);
        assertTrue(NodeUtil.evaluatesToLocalValue(decNode));
    }

    @Test
    public void testEvaluatesToLocalValue_this() throws Exception {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.THIS)));
    }

    @Test
    public void testEvaluatesToLocalValue_nameImmutable() throws Exception {
        assertTrue(NodeUtil.evaluatesToLocalValue(Node.newString("immutable")));
    }

    @Test
    public void testEvaluatesToLocalValue_nameNonImmutable() throws Exception {
        assertFalse(NodeUtil.evaluatesToLocalValue(Node.newString(Token.NAME, "x")));
    }

    @Test
    public void testEvaluatesToLocalValue_getElem() throws Exception {
        assertFalse(NodeUtil.evaluatesToLocalValue(new Node(Token.GETELEM)));
    }

    @Test
    public void testEvaluatesToLocalValue_getProp() throws Exception {
        assertFalse(NodeUtil.evaluatesToLocalValue(new Node(Token.GETPROP)));
    }

    @Test
    public void testEvaluatesToLocalValue_callLocalResult() throws Exception {
        Node callNode = new Node(Token.CALL);
        callNode.putIntProp(Node.SIDE_EFFECT_FLAGS, Node.FLAG_LOCAL_RESULTS);
        assertTrue(NodeUtil.evaluatesToLocalValue(callNode));
    }

    @Test
    public void testEvaluatesToLocalValue_callNonLocalResult() throws Exception {
        assertFalse(NodeUtil.evaluatesToLocalValue(new Node(Token.CALL)));
    }

    @Test
    public void testEvaluatesToLocalValue_newObject() throws Exception {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.NEW)));
    }

    @Test
    public void testEvaluatesToLocalValue_functionLiteral() throws Exception {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.FUNCTION)));
    }

    @Test
    public void testEvaluatesToLocalValue_regExpLiteral() throws Exception {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP)));
    }

    @Test
    public void testEvaluatesToLocalValue_arrayLiteral() throws Exception {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    }

    @Test
    public void testEvaluatesToLocalValue_objectLiteral() throws Exception {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testEvaluatesToLocalValue_inOperator() throws Exception {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.IN)));
    }

    @Test
    public void testEvaluatesToLocalValue_simpleOperator() throws Exception {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ADD)));
    }
}
```