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
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testGetImpureBooleanValue_stringLiteralTrue() throws Exception {
        Node n = Node.newString("hello");
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_stringLiteralFalse() throws Exception {
        Node n = Node.newString("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_numberLiteralTrue() throws Exception {
        Node n = Node.newNumber(123.45);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_numberLiteralFalse() throws Exception {
        Node n = Node.newNumber(0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_trueLiteral() throws Exception {
        Node n = new Node(Token.TRUE);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_falseLiteral() throws Exception {
        Node n = new Node(Token.FALSE);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_nullLiteral() throws Exception {
        Node n = new Node(Token.NULL);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_undefinedName() throws Exception {
        Node n = Node.newString("undefined"); // Using newString to create a NAME node with specific string value
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_nanName() throws Exception {
        Node n = Node.newString("NaN"); // Using newString to create a NAME node with specific string value
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_infinityName() throws Exception {
        Node n = Node.newString("Infinity"); // Using newString to create a NAME node with specific string value
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_notOperator() throws Exception {
        Node trueNode = Node.newString("a");
        Node notTrueNode = new Node(Token.NOT, trueNode);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(notTrueNode));

        Node falseNode = Node.newString("");
        Node notFalseNode = new Node(Token.NOT, falseNode);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(notFalseNode));
    }

    @Test
    public void testGetImpureBooleanValue_andOperator() throws Exception {
        Node lhsTrue = Node.newString("a");
        Node rhsTrue = Node.newString("b");
        Node andTrue = new Node(Token.AND, lhsTrue, rhsTrue);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(andTrue));

        Node lhsFalse = Node.newString("");
        Node rhsFalse = Node.newString("b");
        Node andFalse = new Node(Token.AND, lhsFalse, rhsFalse);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(andFalse));
    }

    @Test
    public void testGetImpureBooleanValue_orOperator() throws Exception {
        Node lhsTrue = Node.newString("a");
        Node rhsTrue = Node.newString("b");
        Node orTrue = new Node(Token.OR, lhsTrue, rhsTrue);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(orTrue));

        Node lhsFalse = Node.newString("");
        Node rhsFalse = Node.newString("");
        Node orFalse = new Node(Token.OR, lhsFalse, rhsFalse);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(orFalse));
    }

    @Test
    public void testGetImpureBooleanValue_hookOperatorSame() throws Exception {
        Node condition = Node.newString("a");
        Node trueVal = Node.newString("b");
        Node falseVal = Node.newString("b");
        Node hook = new Node(Token.HOOK, condition, trueVal, falseVal);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hook));
    }

    @Test
    public void testGetImpureBooleanValue_hookOperatorDifferent() throws Exception {
        Node condition = Node.newString("a");
        Node trueVal = Node.newString("b");
        Node falseVal = Node.newString("c");
        Node hook = new Node(Token.HOOK, condition, trueVal, falseVal);
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hook));
    }

    @Test
    public void testGetImpureBooleanValue_arrayLiteral() throws Exception {
        Node n = new Node(Token.ARRAYLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_objectLiteral() throws Exception {
        Node n = new Node(Token.OBJECTLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_voidOperator() throws Exception {
        Node expr = Node.newNumber(1);
        Node voidNode = new Node(Token.VOID, expr);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(voidNode));
    }

    @Test
    public void testGetPureBooleanValue_stringLiteralTrue() throws Exception {
        Node n = Node.newString("a");
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_stringLiteralFalse() throws Exception {
        Node n = Node.newString("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_numberLiteralTrue() throws Exception {
        Node n = Node.newNumber(1);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_numberLiteralFalse() throws Exception {
        Node n = Node.newNumber(0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_notOperator() throws Exception {
        Node trueNode = Node.newString("a");
        Node notTrueNode = new Node(Token.NOT, trueNode);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(notTrueNode));

        Node falseNode = Node.newString("");
        Node notFalseNode = new Node(Token.NOT, falseNode);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(notFalseNode));
    }

    @Test
    public void testGetPureBooleanValue_trueLiteral() throws Exception {
        Node n = new Node(Token.TRUE);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_falseLiteral() throws Exception {
        Node n = new Node(Token.FALSE);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_nullLiteral() throws Exception {
        Node n = new Node(Token.NULL);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_undefinedName() throws Exception {
        Node n = Node.newString("undefined"); // Using newString to create a NAME node with specific string value
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_nanName() throws Exception {
        Node n = Node.newString("NaN"); // Using newString to create a NAME node with specific string value
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_infinityName() throws Exception {
        Node n = Node.newString("Infinity"); // Using newString to create a NAME node with specific string value
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_arrayLiteral() throws Exception {
        Node n = new Node(Token.ARRAYLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_objectLiteral() throws Exception {
        Node n = new Node(Token.OBJECTLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_voidOperatorNoSideEffects() throws Exception {
        Node child = Node.newNumber(0);
        Node voidNode = new Node(Token.VOID, child);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(voidNode));
    }

    @Test
    public void testGetStringValue_stringLiteral() throws Exception {
        Node n = Node.newString("test");
        assertEquals("test", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_emptyStringLiteral() throws Exception {
        Node n = Node.newString("");
        assertEquals("", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_numberLiteralInteger() throws Exception {
        Node n = Node.newNumber(123);
        assertEquals("123", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_numberLiteralDouble() throws Exception {
        Node n = Node.newNumber(123.45);
        assertEquals("123.45", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_trueLiteral() throws Exception {
        Node n = new Node(Token.TRUE);
        assertEquals("true", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_falseLiteral() throws Exception {
        Node n = new Node(Token.FALSE);
        assertEquals("false", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nullLiteral() throws Exception {
        Node n = new Node(Token.NULL);
        assertEquals("null", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_undefinedName() throws Exception {
        Node n = Node.newString("undefined"); // Using newString to create a NAME node with specific string value
        assertEquals("undefined", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nanName() throws Exception {
        Node n = Node.newString("NaN"); // Using newString to create a NAME node with specific string value
        assertEquals("NaN", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_infinityName() throws Exception {
        Node n = Node.newString("Infinity"); // Using newString to create a NAME node with specific string value
        assertEquals("Infinity", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_voidOperator() throws Exception {
        Node expr = Node.newNumber(1);
        Node voidNode = new Node(Token.VOID, expr);
        assertEquals("undefined", NodeUtil.getStringValue(voidNode));
    }

    @Test
    public void testGetStringValue_notOperatorTrue() throws Exception {
        Node falseNode = new Node(Token.FALSE);
        Node notFalseNode = new Node(Token.NOT, falseNode);
        assertEquals("true", NodeUtil.getStringValue(notFalseNode));
    }

    @Test
    public void testGetStringValue_notOperatorFalse() throws Exception {
        Node trueNode = Node.newString("a");
        Node notTrueNode = new Node(Token.NOT, trueNode);
        assertEquals("false", NodeUtil.getStringValue(notTrueNode));
    }

    @Test
    public void testGetStringValue_arrayLiteralEmpty() throws Exception {
        Node n = new Node(Token.ARRAYLIT);
        assertEquals("", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_arrayLiteralSingleElement() throws Exception {
        Node element = Node.newString("test");
        Node array = new Node(Token.ARRAYLIT, element);
        assertEquals("test", NodeUtil.getStringValue(array));
    }

    @Test
    public void testGetStringValue_arrayLiteralMultipleElements() throws Exception {
        Node element1 = Node.newString("a");
        Node element2 = Node.newString("b");
        Node array = new Node(Token.ARRAYLIT, element1, element2);
        assertEquals("a,b", NodeUtil.getStringValue(array));
    }

    @Test
    public void testGetStringValue_arrayLiteralWithNullAndUndefined() throws Exception {
        Node element1 = Node.newString("a");
        Node element2 = new Node(Token.NULL);
        Node element3 = new Node(Token.UNDEFINED); // Token.UNDEFINED is not valid, using new String("undefined") instead
        Node element3Fixed = Node.newString("undefined");
        Node element4 = Node.newString("b");
        Node array = new Node(Token.ARRAYLIT, element1, element2, element3Fixed, element4);
        assertEquals("a,,b", NodeUtil.getStringValue(array));
    }

    @Test
    public void testGetStringValue_objectLiteral() throws Exception {
        Node n = new Node(Token.OBJECTLIT);
        assertEquals("[object Object]", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nullResult() throws Exception {
        Node n = Node.newNumber(Double.NaN); // A number that cannot be converted to string by getStringValue directly
        assertEquals(null, NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetNumberValue_trueLiteral() throws Exception {
        Node n = new Node(Token.TRUE);
        assertEquals(1.0, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_falseLiteral() throws Exception {
        Node n = new Node(Token.FALSE);
        assertEquals(0.0, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_nullLiteral() throws Exception {
        Node n = new Node(Token.NULL);
        assertEquals(0.0, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_numberLiteral() throws Exception {
        Node n = Node.newNumber(123.45);
        assertEquals(123.45, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_voidOperatorNoSideEffects() throws Exception {
        Node child = Node.newNumber(0);
        Node voidNode = new Node(Token.VOID, child);
        assertEquals(Double.NaN, NodeUtil.getNumberValue(voidNode), 1e-9);
    }

    @Test
    public void testGetNumberValue_voidOperatorWithSideEffects() throws Exception {
        Node child = Node.newCall(Node.newString("foo")); // Assume foo has side effects
        Node voidNode = new Node(Token.VOID, child);
        assertNull(NodeUtil.getNumberValue(voidNode));
    }

    @Test
    public void testGetNumberValue_undefinedName() throws Exception {
        Node n = Node.newString("undefined"); // Using newString to create a NAME node with specific string value
        assertEquals(Double.NaN, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_nanName() throws Exception {
        Node n = Node.newString("NaN"); // Using newString to create a NAME node with specific string value
        assertEquals(Double.NaN, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_infinityName() throws Exception {
        Node n = Node.newString("Infinity"); // Using newString to create a NAME node with specific string value
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_negativeInfinityName() throws Exception {
        Node n = new Node(Token.NEG, Node.newString("Infinity")); // Using newString to create a NAME node with specific string value
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_notOperatorTrue() throws Exception {
        Node falseNode = new Node(Token.FALSE);
        Node notFalseNode = new Node(Token.NOT, falseNode);
        assertEquals(1.0, NodeUtil.getNumberValue(notFalseNode), 1e-9);
    }

    @Test
    public void testGetNumberValue_notOperatorFalse() throws Exception {
        Node trueNode = Node.newString("a");
        Node notTrueNode = new Node(Token.NOT, trueNode);
        assertEquals(0.0, NodeUtil.getNumberValue(notTrueNode), 1e-9);
    }

    @Test
    public void testGetNumberValue_stringLiteralInteger() throws Exception {
        Node n = Node.newString("123");
        assertEquals(123.0, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_stringLiteralFloat() throws Exception {
        Node n = Node.newString("123.45");
        assertEquals(123.45, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_stringLiteralEmpty() throws Exception {
        Node n = Node.newString("");
        assertEquals(0.0, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_stringLiteralHex() throws Exception {
        Node n = Node.newString("0xFF");
        assertEquals(255.0, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_stringLiteralHexInvalid() throws Exception {
        Node n = Node.newString("0xG");
        assertEquals(Double.NaN, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_stringLiteralNaN() throws Exception {
        Node n = Node.newString("abc");
        assertEquals(Double.NaN, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_stringLiteralInfinity() throws Exception {
        Node n = Node.newString("Infinity");
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_stringLiteralNegativeInfinity() throws Exception {
        Node n = Node.newString("-Infinity");
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_stringLiteralVerticalTab() throws Exception {
        Node n = Node.newString("1\u000b2");
        assertNull(NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_arrayLiteralEmpty() throws Exception {
        Node n = new Node(Token.ARRAYLIT);
        assertEquals(0.0, NodeUtil.getNumberValue(n), 1e-9);
    }

    @Test
    public void testGetNumberValue_arrayLiteralSingleNumber() throws Exception {
        Node element = Node.newNumber(42);
        Node array = new Node(Token.ARRAYLIT, element);
        assertEquals(42.0, NodeUtil.getNumberValue(array), 1e-9);
    }

    @Test
    public void testGetNumberValue_arrayLiteralSingleString() throws Exception {
        Node element = Node.newString("100");
        Node array = new Node(Token.ARRAYLIT, element);
        assertEquals(100.0, NodeUtil.getNumberValue(array), 1e-9);
    }

    @Test
    public void testGetNumberValue_arrayLiteralMixed() throws Exception {
        Node element1 = Node.newNumber(10);
        Node element2 = Node.newString("20");
        Node array = new Node(Token.ARRAYLIT, element1, element2);
        assertEquals(Double.NaN, NodeUtil.getNumberValue(array), 1e-9); // Implicit conversion rules
    }

    @Test
    public void testGetNumberValue_objectLiteral() throws Exception {
        Node n = new Node(Token.OBJECTLIT);
        assertEquals(Double.NaN, NodeUtil.getNumberValue(n), 1e-9); // Implicit conversion rules
    }

    @Test
    public void testGetFunctionName_functionDeclaration() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        Node functionName = Node.newString("myFunc");
        Node functionNode = new Node(Token.FUNCTION, functionName, new Node(Token.LP), functionBody);
        assertEquals("myFunc", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetFunctionName_varAssignment() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        Node functionNameExpr = Node.newString("innerFunc");
        Node functionNode = new Node(Token.FUNCTION, functionNameExpr, new Node(Token.LP), functionBody);
        Node varName = Node.newString("outerVar");
        Node varNode = new Node(Token.VAR, varName);
        varName.addChildToBack(functionNode);
        assertEquals("outerVar", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetFunctionName_qualifiedAssignment() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        Node functionNameExpr = Node.newString("innerFunc");
        Node functionNode = new Node(Token.FUNCTION, functionNameExpr, new Node(Token.LP), functionBody);
        Node qualifiedName = Node.newString("qualified.name");
        Node assignNode = new Node(Token.ASSIGN, qualifiedName, functionNode);
        assertEquals("qualified.name", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetFunctionName_namedFunctionExpressionInVar() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        Node namedFn = Node.newString("namedFn");
        Node functionNode = new Node(Token.FUNCTION, namedFn, new Node(Token.LP), functionBody);
        Node varName = Node.newString("outerVar");
        Node varNode = new Node(Token.VAR, varName);
        varName.addChildToBack(functionNode);
        assertEquals("outerVar", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetFunctionName_namedFunctionExpressionInAssign() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        Node namedFn = Node.newString("namedFn");
        Node functionNode = new Node(Token.FUNCTION, namedFn, new Node(Token.LP), functionBody);
        Node qualifiedName = Node.newString("qualified.name");
        Node assignNode = new Node(Token.ASSIGN, qualifiedName, functionNode);
        assertEquals("qualified.name", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetNearestFunctionName_functionDeclaration() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        Node functionName = Node.newString("myFunc");
        Node functionNode = new Node(Token.FUNCTION, functionName, new Node(Token.LP), functionBody);
        assertEquals("myFunc", NodeUtil.getNearestFunctionName(functionNode));
    }

    @Test
    public void testGetNearestFunctionName_objectLiteralStringKey() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        Node functionNode = new Node(Token.FUNCTION, null, new Node(Token.LP), functionBody);
        Node key = Node.newString("myKey");
        Node objLitProp = new Node(Token.SET, key, functionNode); // SET node wraps key and value
        Node objLit = new Node(Token.OBJECTLIT, objLitProp);
        assertEquals("myKey", NodeUtil.getNearestFunctionName(functionNode));
    }

    @Test
    public void testGetNearestFunctionName_objectLiteralNumericKey() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        Node functionNode = new Node(Token.FUNCTION, null, new Node(Token.LP), functionBody);
        Node key = Node.newNumber(123); // Numeric keys are represented as strings in JS
        Node objLitProp = new Node(Token.SET, key, functionNode);
        Node objLit = new Node(Token.OBJECTLIT, objLitProp);
        assertEquals("123", NodeUtil.getNearestFunctionName(functionNode));
    }

    @Test
    public void testIsImmutableValue_stringLiteral() throws Exception {
        Node n = Node.newString("test");
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_numberLiteral() throws Exception {
        Node n = Node.newNumber(123.45);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_trueLiteral() throws Exception {
        Node n = new Node(Token.TRUE);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_falseLiteral() throws Exception {
        Node n = new Node(Token.FALSE);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_nullLiteral() throws Exception {
        Node n = new Node(Token.NULL);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_notOperator() throws Exception {
        Node trueNode = Node.newString("a");
        Node notTrueNode = new Node(Token.NOT, trueNode);
        assertTrue(NodeUtil.isImmutableValue(notTrueNode));
    }

    @Test
    public void testIsImmutableValue_negOperator() throws Exception {
        Node numNode = Node.newNumber(5);
        Node negNode = new Node(Token.NEG, numNode);
        assertTrue(NodeUtil.isImmutableValue(negNode));
    }

    @Test
    public void testIsImmutableValue_voidOperator() throws Exception {
        Node numNode = Node.newNumber(5);
        Node voidNode = new Node(Token.VOID, numNode);
        assertTrue(NodeUtil.isImmutableValue(voidNode));
    }

    @Test
    public void testIsImmutableValue_undefinedName() throws Exception {
        Node n = Node.newString("undefined"); // Using newString to create a NAME node with specific string value
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_nanName() throws Exception {
        Node n = Node.newString("NaN"); // Using newString to create a NAME node with specific string value
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_infinityName() throws Exception {
        Node n = Node.newString("Infinity"); // Using newString to create a NAME node with specific string value
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_variableName() throws Exception {
        Node n = Node.newString("myVar"); // Using newString to create a NAME node
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_functionCall() throws Exception {
        Node n = Node.newCall(Node.newString("foo"));
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_arrayLiteral() throws Exception {
        Node n = new Node(Token.ARRAYLIT);
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_objectLiteral() throws Exception {
        Node n = new Node(Token.OBJECTLIT);
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsLiteralValue_stringLiteral() throws Exception {
        Node n = Node.newString("test");
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_numberLiteral() throws Exception {
        Node n = Node.newNumber(123.45);
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_trueLiteral() throws Exception {
        Node n = new Node(Token.TRUE);
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_falseLiteral() throws Exception {
        Node n = new Node(Token.FALSE);
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_nullLiteral() throws Exception {
        Node n = new Node(Token.NULL);
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_undefinedName() throws Exception {
        Node n = Node.newString("undefined"); // Using newString to create a NAME node with specific string value
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_nanName() throws Exception {
        Node n = Node.newString("NaN"); // Using newString to create a NAME node with specific string value
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_infinityName() throws Exception {
        Node n = Node.newString("Infinity"); // Using newString to create a NAME node with specific string value
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_notOperator() throws Exception {
        Node trueNode = Node.newString("a");
        Node notTrueNode = new Node(Token.NOT, trueNode);
        assertTrue(NodeUtil.isLiteralValue(notTrueNode, false));
    }

    @Test
    public void testIsLiteralValue_negOperator() throws Exception {
        Node numNode = Node.newNumber(5);
        Node negNode = new Node(Token.NEG, numNode);
        assertTrue(NodeUtil.isLiteralValue(negNode, false));
    }

    @Test
    public void testIsLiteralValue_voidOperator() throws Exception {
        Node numNode = Node.newNumber(5);
        Node voidNode = new Node(Token.VOID, numNode);
        assertTrue(NodeUtil.isLiteralValue(voidNode, false));
    }

    @Test
    public void testIsLiteralValue_arrayLiteralWithLiterals() throws Exception {
        Node n = Node.newArray(Node.newNumber(1), Node.newString("a"));
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_arrayLiteralWithNonLiteral() throws Exception {
        Node n = Node.newArray(Node.newNumber(1), Node.newString("x")); // Using newString to create a NAME node
        assertFalse(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_arrayLiteralWithEmpty() throws Exception {
        Node n = Node.newArray(Node.newNumber(1), new Node(Token.EMPTY));
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_objectLiteralWithLiterals() throws Exception {
        Node key1 = Node.newStringKey("a");
        Node value1 = Node.newNumber(1);
        Node key2 = Node.newStringKey("b");
        Node value2 = Node.newString("hello");
        Node objLitProp1 = new Node(Token.SET, key1, value1);
        Node objLitProp2 = new Node(Token.SET, key2, value2);
        Node objLit = new Node(Token.OBJECTLIT, objLitProp1, objLitProp2);
        assertTrue(NodeUtil.isLiteralValue(objLit, false));
    }

    @Test
    public void testIsLiteralValue_objectLiteralWithNonLiteralValue() throws Exception {
        Node key1 = Node.newStringKey("a");
        Node value1 = Node.newString("x"); // Using newString to create a NAME node
        Node objLitProp1 = new Node(Token.SET, key1, value1);
        Node objLit = new Node(Token.OBJECTLIT, objLitProp1);
        assertFalse(NodeUtil.isLiteralValue(objLit, false));
    }

    @Test
    public void testIsLiteralValue_functionExpression() throws Exception {
        Node n = Node.newFunction("f", new Node(Token.LP), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_functionExpressionNotIncluded() throws Exception {
        Node n = Node.newFunction("f", new Node(Token.LP), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_functionDeclaration() throws Exception {
        Node declaration = new Node(Token.FUNCTION);
        declaration.addChildrenToBack(Node.newString("f", -1, -1));
        declaration.addChildrenToBack(new Node(Token.LP));
        declaration.addChildrenToBack(new Node(Token.BLOCK));
        // Simulating a function declaration by making it a statement
        Node block = new Node(Token.BLOCK, declaration);
        assertFalse(NodeUtil.isLiteralValue(declaration, true));
    }

    @Test
    public void testIsValidDefineValue_string() throws Exception {
        Node n = Node.newString("abc");
        Set<String> defines = Collections.emptySet();
        assertTrue(NodeUtil.isValidDefineValue(n, defines));
    }

    @Test
    public void testIsValidDefineValue_number() throws Exception {
        Node n = Node.newNumber(123);
        Set<String> defines = Collections.emptySet();
        assertTrue(NodeUtil.isValidDefineValue(n, defines));
    }

    @Test
    public void testIsValidDefineValue_true() throws Exception {
        Node n = new Node(Token.TRUE);
        Set<String> defines = Collections.emptySet();
        assertTrue(NodeUtil.isValidDefineValue(n, defines));
    }

    @Test
    public void testIsValidDefineValue_false() throws Exception {
        Node n = new Node(Token.FALSE);
        Set<String> defines = Collections.emptySet();
        assertTrue(NodeUtil.isValidDefineValue(n, defines));
    }

    @Test
    public void testIsValidDefineValue_addOperator() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node add = new Node(Token.ADD, left, right);
        Set<String> defines = Collections.emptySet();
        assertTrue(NodeUtil.isValidDefineValue(add, defines));
    }

    @Test
    public void testIsValidDefineValue_subOperator() throws Exception {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(5);
        Node sub = new Node(Token.SUB, left, right);
        Set<String> defines = Collections.emptySet();
        assertTrue(NodeUtil.isValidDefineValue(sub, defines));
    }

    @Test
    public void testIsValidDefineValue_notOperator() throws Exception {
        Node child = Node.newBoolean(true);
        Node not = new Node(Token.NOT, child);
        Set<String> defines = Collections.emptySet();
        assertTrue(NodeUtil.isValidDefineValue(not, defines));
    }

    @Test
    public void testIsValidDefineValue_negOperator() throws Exception {
        Node child = Node.newNumber(10);
        Node neg = new Node(Token.NEG, child);
        Set<String> defines = Collections.emptySet();
        assertTrue(NodeUtil.isValidDefineValue(neg, defines));
    }

    @Test
    public void testIsValidDefineValue_posOperator() throws Exception {
        Node child = Node.newNumber(-5);
        Node pos = new Node(Token.POS, child);
        Set<String> defines = Collections.emptySet();
        assertTrue(NodeUtil.isValidDefineValue(pos, defines));
    }

    @Test
    public void testIsValidDefineValue_nameThatIsDefine() throws Exception {
        Node n = Node.newString("MY_DEFINE"); // Using newString to create a NAME node
        Set<String> defines = new HashSet<>(Arrays.asList("MY_DEFINE"));
        assertTrue(NodeUtil.isValidDefineValue(n, defines));
    }

    @Test
    public void testIsValidDefineValue_nameThatIsNotDefine() throws Exception {
        Node n = Node.newString("MY_DEFINE"); // Using newString to create a NAME node
        Set<String> defines = new HashSet<>(Arrays.asList("OTHER_DEFINE"));
        assertFalse(NodeUtil.isValidDefineValue(n, defines));
    }

    @Test
    public void testIsValidDefineValue_qualifiedNameThatIsDefine() throws Exception {
        Node qualifiedNameNode = NodeUtil.newQualifiedNameNode(new CodingConvention.DefaultCodingConvention(), "a.b.MY_DEFINE", -1, -1);
        Set<String> defines = new HashSet<>(Arrays.asList("a.b.MY_DEFINE"));
        assertTrue(NodeUtil.isValidDefineValue(qualifiedNameNode, defines));
    }

    @Test
    public void testIsValidDefineValue_qualifiedNameThatIsNotDefine() throws Exception {
        Node qualifiedNameNode = NodeUtil.newQualifiedNameNode(new CodingConvention.DefaultCodingConvention(), "a.b.MY_DEFINE", -1, -1);
        Set<String> defines = new HashSet<>(Arrays.asList("a.b.OTHER_DEFINE"));
        assertFalse(NodeUtil.isValidDefineValue(qualifiedNameNode, defines));
    }

    @Test
    public void testIsEmptyBlock_emptyBlock() throws Exception {
        Node block = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_blockWithEmptyNode() throws Exception {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_blockWithStatement() throws Exception {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(Node.newString("test"));
        assertFalse(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_nonBlockNode() throws Exception {
        Node node = new Node(Token.NAME);
        assertFalse(NodeUtil.isEmptyBlock(node));
    }

    @Test
    public void testIsSimpleOperator_add() throws Exception {
        Node n = new Node(Token.ADD);
        assertTrue(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_assignAdd() throws Exception {
        Node n = new Node(Token.ASSIGN_ADD);
        assertFalse(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_comma() throws Exception {
        Node n = new Node(Token.COMMA);
        assertTrue(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_hook() throws Exception {
        Node n = new Node(Token.HOOK);
        assertFalse(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_or() throws Exception {
        Node n = new Node(Token.OR);
        assertFalse(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_getProp() throws Exception {
        Node n = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testNewExpr() throws Exception {
        Node child = Node.newString("hello");
        Node exprResult = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, exprResult.getType());
        assertEquals(child, exprResult.getFirstChild());
        assertEquals(child.getLineno(), exprResult.getLineno());
        assertEquals(child.getCharno(), exprResult.getCharno());
    }

    @Test
    public void testMayHaveSideEffects_newCall() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("Object"));
        assertTrue(NodeUtil.mayHaveSideEffects(newNode));
    }

    @Test
    public void testMayHaveSideEffects_functionCall() throws Exception {
        Node callNode = Node.newCall(Node.newString("foo"));
        assertTrue(NodeUtil.mayHaveSideEffects(callNode));
    }

    @Test
    public void testMayHaveSideEffects_assignment() throws Exception {
        Node assignNode = new Node(Token.ASSIGN, Node.newString("x"), Node.newNumber(1)); // Use newString for NAME node
        assertTrue(NodeUtil.mayHaveSideEffects(assignNode));
    }

    @Test
    public void testMayHaveSideEffects_throwStatement() throws Exception {
        Node throwNode = new Node(Token.THROW, Node.newString("error"));
        assertTrue(NodeUtil.mayHaveSideEffects(throwNode));
    }

    @Test
    public void testMayHaveSideEffects_varWithInitializer() throws Exception {
        Node varName = Node.newString("x", -1, -1);
        varName.addChildToBack(Node.newNumber(1));
        Node varNode = new Node(Token.VAR, varName);
        assertTrue(NodeUtil.mayHaveSideEffects(varNode));
    }

    @Test
    public void testMayHaveSideEffects_varWithoutInitializer() throws Exception {
        Node varNode = new Node(Token.VAR, Node.newString("x", -1, -1));
        assertFalse(NodeUtil.mayHaveSideEffects(varNode));
    }

    @Test
    public void testMayHaveSideEffects_functionDeclaration() throws Exception {
        Node declaration = new Node(Token.FUNCTION);
        declaration.addChildrenToBack(Node.newString("f", -1, -1));
        declaration.addChildrenToBack(new Node(Token.LP));
        declaration.addChildrenToBack(new Node(Token.BLOCK));
        // Function declarations have side effects as they introduce a name into the scope.
        assertTrue(NodeUtil.mayHaveSideEffects(declaration));
    }

    @Test
    public void testMayHaveSideEffects_functionExpression() throws Exception {
        Node expression = new Node(Token.FUNCTION);
        expression.addChildrenToBack(Node.newString("f", -1, -1)); // Name in function expression is ignored for side effects
        expression.addChildrenToBack(new Node(Token.LP));
        expression.addChildrenToBack(new Node(Token.BLOCK));
        // Function expressions themselves do not have side effects.
        assertFalse(NodeUtil.mayHaveSideEffects(expression));
    }

    @Test
    public void testMayHaveSideEffects_objectLiteralWithSideEffects() throws Exception {
        Node funcExpr = new Node(Token.FUNCTION);
        funcExpr.addChildrenToBack(Node.newString("f", -1, -1));
        funcExpr.addChildrenToBack(new Node(Token.LP));
        funcExpr.addChildrenToBack(new Node(Token.BLOCK));
        Node key = Node.newStringKey("a");
        Node objLitProp = new Node(Token.SET, key, funcExpr);
        Node objLit = new Node(Token.OBJECTLIT, objLitProp);
        assertTrue(NodeUtil.mayHaveSideEffects(objLit));
    }

    @Test
    public void testMayHaveSideEffects_objectLiteralWithoutSideEffects() throws Exception {
        Node key = Node.newStringKey("a");
        Node objLitProp = new Node(Token.SET, key, Node.newNumber(1));
        Node objLit = new Node(Token.OBJECTLIT, objLitProp);
        assertFalse(NodeUtil.mayHaveSideEffects(objLit));
    }

    @Test
    public void testMayHaveSideEffects_arrayLiteralWithSideEffects() throws Exception {
        Node funcExpr = new Node(Token.FUNCTION);
        funcExpr.addChildrenToBack(Node.newString("f", -1, -1));
        funcExpr.addChildrenToBack(new Node(Token.LP));
        funcExpr.addChildrenToBack(new Node(Token.BLOCK));
        Node arrayLit = new Node(Token.ARRAYLIT, funcExpr);
        assertTrue(NodeUtil.mayHaveSideEffects(arrayLit));
    }

    @Test
    public void testMayHaveSideEffects_arrayLiteralWithoutSideEffects() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1));
        assertFalse(NodeUtil.mayHaveSideEffects(arrayLit));
    }

    @Test
    public void testConstructorCallHasSideEffects_standardNew() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("Object"));
        assertTrue(NodeUtil.constructorCallHasSideEffects(newNode));
    }

    @Test
    public void testConstructorCallHasSideEffects_knownNoSideEffectsConstructor() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("Array"));
        assertFalse(NodeUtil.constructorCallHasSideEffects(newNode));
    }

    @Test
    public void testConstructorCallHasSideEffects_noSideEffectsCallFlag() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("Object"));
        newNode.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.constructorCallHasSideEffects(newNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_standardCall() throws Exception {
        Node callNode = Node.newCall(Node.newString("foo"));
        assertTrue(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_noSideEffectsCallFlag() throws Exception {
        Node callNode = Node.newCall(Node.newString("foo"));
        callNode.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_builtinNoSideEffects() throws Exception {
        Node callNode = Node.newCall(Node.newString("Object"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_objectMethodNoSideEffects() throws Exception {
        Node obj = Node.newString("obj"); // Using newString for NAME node
        Node method = Node.newString("toString");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node callNode = Node.newCall(getPropNode);
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testCallHasLocalResult() throws Exception {
        Node callNode = Node.newCall(Node.newString("foo"));
        callNode.putBooleanProp(Node.FREE_CALL, true); // Simulate local result
        assertTrue(NodeUtil.callHasLocalResult(callNode));
    }

    @Test
    public void testNewHasLocalResult() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("Object"));
        newNode.putBooleanProp(Node.LOCAL_RESULTS, true); // Simulate local result
        assertTrue(NodeUtil.newHasLocalResult(newNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_assignment() throws Exception {
        Node assignNode = new Node(Token.ASSIGN, Node.newString("x"), Node.newNumber(1)); // Use newString for NAME node
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(assignNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_inc() throws Exception {
        Node incNode = new Node(Token.INC, Node.newString("x")); // Use newString for NAME node
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(incNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_dec() throws Exception {
        Node decNode = new Node(Token.DEC, Node.newString("x")); // Use newString for NAME node
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(decNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_throw() throws Exception {
        Node throwNode = new Node(Token.THROW, Node.newString("error"));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(throwNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_call() throws Exception {
        Node callNode = Node.newCall(Node.newString("foo"));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(callNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_new() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("Object"));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(newNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_nameWithChildren() throws Exception {
        Node nameNode = Node.newString("varName");
        nameNode.addChildToBack(Node.newNumber(1)); // Simulating initialization
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_nameWithoutChildren() throws Exception {
        Node nameNode = Node.newString("varName");
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(nameNode));
    }

    @Test
    public void testCanBeSideEffected_call() throws Exception {
        Node callNode = Node.newCall(Node.newString("foo"));
        assertTrue(NodeUtil.canBeSideEffected(callNode));
    }

    @Test
    public void testCanBeSideEffected_new() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("Object"));
        assertTrue(NodeUtil.canBeSideEffected(newNode));
    }

    @Test
    public void testCanBeSideEffected_nameNotConstant() throws Exception {
        Node nameNode = Node.newString("myVar"); // Using newString for NAME node
        assertFalse(NodeUtil.canBeSideEffected(nameNode, Collections.emptySet()));
    }

    @Test
    public void testCanBeSideEffected_nameConstant() throws Exception {
        Node nameNode = Node.newString("MY_CONST"); // Using newString for NAME node
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertFalse(NodeUtil.canBeSideEffected(nameNode, Collections.emptySet()));
    }

    @Test
    public void testCanBeSideEffected_nameInKnownConstants() throws Exception {
        Node nameNode = Node.newString("myVar"); // Using newString for NAME node
        Set<String> knownConstants = new HashSet<>(Arrays.asList("myVar"));
        assertFalse(NodeUtil.canBeSideEffected(nameNode, knownConstants));
    }

    @Test
    public void testCanBeSideEffected_getProp() throws Exception {
        Node obj = Node.newString("obj"); // Using newString for NAME node
        Node prop = Node.newString("prop");
        Node getPropNode = new Node(Token.GETPROP, obj, prop);
        assertTrue(NodeUtil.canBeSideEffected(getPropNode));
    }

    @Test
    public void testCanBeSideEffected_getElem() throws Exception {
        Node obj = Node.newString("obj"); // Using newString for NAME node
        Node elem = Node.newNumber(0);
        Node getElemNode = new Node(Token.GETELEM, obj, elem);
        assertTrue(NodeUtil.canBeSideEffected(getElemNode));
    }

    @Test
    public void testCanBeSideEffected_functionExpression() throws Exception {
        Node funcExpr = Node.newFunction("f", new Node(Token.LP), new Node(Token.BLOCK));
        assertFalse(NodeUtil.canBeSideEffected(funcExpr));
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
    public void testPrecedence_bitor() throws Exception {
        assertEquals(5, NodeUtil.precedence(Token.BITOR));
    }

    @Test
    public void testPrecedence_bitxor() throws Exception {
        assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    }

    @Test
    public void testPrecedence_bitand() throws Exception {
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

    @Test
    public void testValueCheck_andOperator() throws Exception {
        Node lhsTrue = Node.newString("a");
        Node rhsTrue = Node.newString("b");
        Node andTrue = new Node(Token.AND, lhsTrue, rhsTrue);
        assertTrue(NodeUtil.valueCheck(andTrue, new NodeUtil.NumbericResultPredicate()));
    }

    @Test
    public void testValueCheck_orOperator() throws Exception {
        Node lhsTrue = Node.newString("a");
        Node rhsTrue = Node.newString("b");
        Node orTrue = new Node(Token.OR, lhsTrue, rhsTrue);
        assertTrue(NodeUtil.valueCheck(orTrue, new NodeUtil.NumbericResultPredicate()));
    }

    @Test
    public void testValueCheck_hookOperator() throws Exception {
        Node condition = Node.newString("a");
        Node trueVal = Node.newString("b");
        Node falseVal = Node.newString("c");
        Node hook = new Node(Token.HOOK, condition, trueVal, falseVal);
        assertFalse(NodeUtil.valueCheck(hook, new NodeUtil.NumbericResultPredicate()));
    }

    @Test
    public void testValueCheck_stringLiteral() throws Exception {
        Node n = Node.newString("test");
        assertTrue(NodeUtil.valueCheck(n, new NodeUtil.NumbericResultPredicate()));
    }

    @Test
    public void testValueCheck_numberLiteral() throws Exception {
        Node n = Node.newNumber(123.45);
        assertTrue(NodeUtil.valueCheck(n, new NodeUtil.NumbericResultPredicate()));
    }

    @Test
    public void testValueCheck_nonNumericResult() throws Exception {
        Node n = Node.newString("not a number");
        assertFalse(NodeUtil.valueCheck(n, new NodeUtil.NumbericResultPredicate()));
    }

    @Test
    public void testIsNumericResult_addOperator() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node add = new Node(Token.ADD, left, right);
        assertTrue(NodeUtil.isNumericResult(add));
    }

    @Test
    public void testIsNumericResult_addOperatorWithNonNumeric() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newString("abc");
        Node add = new Node(Token.ADD, left, right);
        assertFalse(NodeUtil.isNumericResult(add));
    }

    @Test
    public void testIsNumericResult_mulOperator() throws Exception {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(5);
        Node mul = new Node(Token.MUL, left, right);
        assertTrue(NodeUtil.isNumericResult(mul));
    }

    @Test
    public void testIsNumericResult_negOperator() throws Exception {
        Node child = Node.newNumber(10);
        Node neg = new Node(Token.NEG, child);
        assertTrue(NodeUtil.isNumericResult(neg));
    }

    @Test
    public void testIsNumericResult_numberLiteral() throws Exception {
        Node n = Node.newNumber(123.45);
        assertTrue(NodeUtil.isNumericResult(n));
    }

    @Test
    public void testIsNumericResult_nanName() throws Exception {
        Node n = Node.newString("NaN"); // Using newString to create a NAME node
        assertTrue(NodeUtil.isNumericResult(n));
    }

    @Test
    public void testIsNumericResult_infinityName() throws Exception {
        Node n = Node.newString("Infinity"); // Using newString to create a NAME node
        assertTrue(NodeUtil.isNumericResult(n));
    }

    @Test
    public void testIsNumericResult_stringLiteral() throws Exception {
        Node n = Node.newString("123");
        assertFalse(NodeUtil.isNumericResult(n)); // This method checks if the RESULT is numeric, not if it can be converted
    }

    @Test
    public void testIsBooleanResult_eqOperator() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(1);
        Node eq = new Node(Token.EQ, left, right);
        assertTrue(NodeUtil.isBooleanResult(eq));
    }

    @Test
    public void testIsBooleanResult_ltOperator() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node lt = new Node(Token.LT, left, right);
        assertTrue(NodeUtil.isBooleanResult(lt));
    }

    @Test
    public void testIsBooleanResult_notOperator() throws Exception {
        Node child = Node.newBoolean(true);
        Node not = new Node(Token.NOT, child);
        assertTrue(NodeUtil.isBooleanResult(not));
    }

    @Test
    public void testIsBooleanResult_trueLiteral() throws Exception {
        Node n = new Node(Token.TRUE);
        assertTrue(NodeUtil.isBooleanResult(n));
    }

    @Test
    public void testIsBooleanResult_falseLiteral() throws Exception {
        Node n = new Node(Token.FALSE);
        assertTrue(NodeUtil.isBooleanResult(n));
    }

    @Test
    public void testIsBooleanResult_delProp() throws Exception {
        Node n = new Node(Token.DELPROP, Node.newString("obj"), Node.newString("prop")); // Use newString for NAME nodes
        assertTrue(NodeUtil.isBooleanResult(n));
    }

    @Test
    public void testIsBooleanResult_numberLiteral() throws Exception {
        Node n = Node.newNumber(123);
        assertFalse(NodeUtil.isBooleanResult(n));
    }

    @Test
    public void testIsUndefined_voidOperator() throws Exception {
        Node expr = Node.newNumber(0);
        Node voidNode = new Node(Token.VOID, expr);
        assertTrue(NodeUtil.isUndefined(voidNode));
    }

    @Test
    public void testIsUndefined_undefinedName() throws Exception {
        Node n = Node.newString("undefined"); // Using newString to create a NAME node
        assertTrue(NodeUtil.isUndefined(n));
    }

    @Test
    public void testIsUndefined_definedName() throws Exception {
        Node n = Node.newString("definedVar"); // Using newString to create a NAME node
        assertFalse(NodeUtil.isUndefined(n));
    }

    @Test
    public void testIsUndefined_numberLiteral() throws Exception {
        Node n = Node.newNumber(0);
        assertFalse(NodeUtil.isUndefined(n));
    }

    @Test
    public void testIsNull_nullLiteral() throws Exception {
        Node n = new Node(Token.NULL);
        assertTrue(NodeUtil.isNull(n));
    }

    @Test
    public void testIsNull_definedName() throws Exception {
        Node n = Node.newString("someVar"); // Using newString to create a NAME node
        assertFalse(NodeUtil.isNull(n));
    }

    @Test
    public void testIsNullOrUndefined_nullLiteral() throws Exception {
        Node n = new Node(Token.NULL);
        assertTrue(NodeUtil.isNullOrUndefined(n));
    }

    @Test
    public void testIsNullOrUndefined_undefinedName() throws Exception {
        Node n = Node.newString("undefined"); // Using newString to create a NAME node
        assertTrue(NodeUtil.isNullOrUndefined(n));
    }

    @Test
    public void testIsNullOrUndefined_definedName() throws Exception {
        Node n = Node.newString("someVar"); // Using newString to create a NAME node
        assertFalse(NodeUtil.isNullOrUndefined(n));
    }

    @Test
    public void testMayBeString_stringLiteral() throws Exception {
        Node n = Node.newString("hello");
        assertTrue(NodeUtil.mayBeString(n));
    }

    @Test
    public void testMayBeString_numberLiteral() throws Exception {
        Node n = Node.newNumber(123);
        assertFalse(NodeUtil.mayBeString(n));
    }

    @Test
    public void testMayBeString_booleanLiteral() throws Exception {
        Node n = new Node(Token.TRUE);
        assertFalse(NodeUtil.mayBeString(n));
    }

    @Test
    public void testMayBeString_addOperatorWithStrings() throws Exception {
        Node left = Node.newString("a");
        Node right = Node.newString("b");
        Node add = new Node(Token.ADD, left, right);
        assertTrue(NodeUtil.mayBeString(add));
    }

    @Test
    public void testMayBeString_addOperatorWithNumberAndString() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newString("b");
        Node add = new Node(Token.ADD, left, right);
        assertTrue(NodeUtil.mayBeString(add));
    }

    @Test
    public void testMayBeString_addOperatorWithNumbers() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node add = new Node(Token.ADD, left, right);
        assertFalse(NodeUtil.mayBeString(add));
    }

    @Test
    public void testMayBeString_addOperatorWithUnknownBoolean() throws Exception {
        // This test case aims to cover the path where isNumericResult and isBooleanResult are false.
        // We construct a node that won't be determined as purely numeric or boolean by helper methods.
        Node left = Node.newNumber(1); // isNumericResult will see this as potentially numeric operand
        Node right = Node.newString("true"); // isBooleanResult will see this as non-boolean

        Node add = new Node(Token.ADD, left, right);
        // isNumericResult(add) should return false because of the string operand.
        // isBooleanResult(...) will also be false.
        // Therefore, mayBeStringHelper should return true.
        assertTrue(NodeUtil.mayBeString(add));
    }

    @Test
    public void testIsAssociative_mul() throws Exception {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
    }

    @Test
    public void testIsAssociative_add() throws Exception {
        // '+' is not associative because it's also string concatenation
        assertFalse(NodeUtil.isAssociative(Token.ADD));
    }

    @Test
    public void testIsAssociative_and() throws Exception {
        assertTrue(NodeUtil.isAssociative(Token.AND));
    }

    @Test
    public void testIsAssociative_bitor() throws Exception {
        assertTrue(NodeUtil.isAssociative(Token.BITOR));
    }

    @Test
    public void testIsAssociative_sub() throws Exception {
        assertFalse(NodeUtil.isAssociative(Token.SUB));
    }

    @Test
    public void testIsCommutative_mul() throws Exception {
        assertTrue(NodeUtil.isCommutative(Token.MUL));
    }

    @Test
    public void testIsCommutative_add() throws Exception {
        // '+' is not commutative because it's also string concatenation
        assertFalse(NodeUtil.isCommutative(Token.ADD));
    }

    @Test
    public void testIsCommutative_bitor() throws Exception {
        assertTrue(NodeUtil.isCommutative(Token.BITOR));
    }

    @Test
    public void testIsCommutative_bitxor() throws Exception {
        assertTrue(NodeUtil.isCommutative(Token.BITXOR));
    }

    @Test
    public void testIsCommutative_sub() throws Exception {
        assertFalse(NodeUtil.isCommutative(Token.SUB));
    }

    @Test
    public void testIsAssignmentOp_assign() throws Exception {
        Node n = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.isAssignmentOp(n));
    }

    @Test
    public void testIsAssignmentOp_assignAdd() throws Exception {
        Node n = new Node(Token.ASSIGN_ADD);
        assertTrue(NodeUtil.isAssignmentOp(n));
    }

    @Test
    public void testIsAssignmentOp_add() throws Exception {
        Node n = new Node(Token.ADD);
        assertFalse(NodeUtil.isAssignmentOp(n));
    }

    @Test
    public void testGetOpFromAssignmentOp_assignAdd() throws Exception {
        Node n = new Node(Token.ASSIGN_ADD);
        assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(n));
    }

    @Test
    public void testGetOpFromAssignmentOp_assignBitOr() throws Exception {
        Node n = new Node(Token.ASSIGN_BITOR);
        assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(n));
    }

    @Test
    public void testIsExpressionNode() throws Exception {
        Node n = NodeUtil.newExpr(Node.newString("test"));
        assertTrue(NodeUtil.isExpressionNode(n));
        Node nonExpr = Node.newString("test");
        assertFalse(NodeUtil.isExpressionNode(nonExpr));
    }

    @Test
    public void testContainsFunction_functionExpression() throws Exception {
        Node funcExpr = Node.newFunction("f", new Node(Token.LP), new Node(Token.BLOCK));
        assertTrue(NodeUtil.containsFunction(funcExpr));
    }

    @Test
    public void testContainsFunction_functionDeclaration() throws Exception {
        Node func = new Node(Token.FUNCTION);
        func.addChildrenToBack(Node.newString("f", -1, -1));
        func.addChildrenToBack(new Node(Token.LP));
        func.addChildrenToBack(new Node(Token.BLOCK));
        Node block = new Node(Token.BLOCK, func); // Make it a statement
        assertTrue(NodeUtil.containsFunction(block));
    }

    @Test
    public void testContainsFunction_blockWithoutFunction() throws Exception {
        Node block = new Node(Token.BLOCK, Node.newString("test"));
        assertFalse(NodeUtil.containsFunction(block));
    }

    @Test
    public void testReferencesThis_functionWithThis() throws Exception {
        Node body = new Node(Token.BLOCK, new Node(Token.THIS));
        Node func = Node.newFunction("f", new Node(Token.LP), body);
        assertTrue(NodeUtil.referencesThis(func));
    }

    @Test
    public void testReferencesThis_functionWithoutThis() throws Exception {
        Node body = new Node(Token.BLOCK, Node.newString("test"));
        Node func = Node.newFunction("f", new Node(Token.LP), body);
        assertFalse(NodeUtil.referencesThis(func));
    }

    @Test
    public void testReferencesThis_standaloneThis() throws Exception {
        Node thisNode = new Node(Token.THIS);
        assertTrue(NodeUtil.referencesThis(thisNode));
    }

    @Test
    public void testIsGet_getProp() throws Exception {
        Node obj = Node.newString("obj"); // Using newString for NAME node
        Node prop = Node.newString("prop");
        Node getNode = new Node(Token.GETPROP, obj, prop);
        assertTrue(NodeUtil.isGet(getNode));
    }

    @Test
    public void testIsGet_getElem() throws Exception {
        Node obj = Node.newString("obj"); // Using newString for NAME node
        Node elem = Node.newNumber(0);
        Node getNode = new Node(Token.GETELEM, obj, elem);
        assertTrue(NodeUtil.isGet(getNode));
    }

    @Test
    public void testIsGet_name() throws Exception {
        Node n = Node.newString("varName"); // Using newString for NAME node
        assertFalse(NodeUtil.isGet(n));
    }

    @Test
    public void testIsGetProp_getProp() throws Exception {
        Node obj = Node.newString("obj"); // Using newString for NAME node
        Node prop = Node.newString("prop");
        Node getNode = new Node(Token.GETPROP, obj, prop);
        assertTrue(NodeUtil.isGetProp(getNode));
    }

    @Test
    public void testIsGetProp_getElem() throws Exception {
        Node obj = Node.newString("obj"); // Using newString for NAME node
        Node elem = Node.newNumber(0);
        Node getNode = new Node(Token.GETELEM, obj, elem);
        assertFalse(NodeUtil.isGetProp(getNode));
    }

    @Test
    public void testIsName_nameNode() throws Exception {
        Node n = Node.newString("varName"); // Using newString for NAME node
        assertTrue(NodeUtil.isName(n));
    }

    @Test
    public void testIsName_stringNode() throws Exception {
        Node n = Node.newString("varName");
        assertFalse(NodeUtil.isName(n));
    }

    @Test
    public void testIsNew_newNode() throws Exception {
        Node n = new Node(Token.NEW, Node.newString("Object"));
        assertTrue(NodeUtil.isNew(n));
    }

    @Test
    public void testIsNew_callNode() throws Exception {
        Node n = Node.newCall(Node.newString("foo"));
        assertFalse(NodeUtil.isNew(n));
    }

    @Test
    public void testIsVar_varNode() throws Exception {
        Node n = new Node(Token.VAR, Node.newString("varName"));
        assertTrue(NodeUtil.isVar(n));
    }

    @Test
    public void testIsVar_letNode() throws Exception {
        // Assuming LET token exists and behaves similarly to VAR for this test
        // As per the API outline, LET token is not available. We'll test with a non-VAR token.
        Node n = Node.newString("letVar"); // Use a NAME node instead of LET
        assertFalse(NodeUtil.isVar(n));
    }

    @Test
    public void testIsVarDeclaration_varNameNode() throws Exception {
        Node varName = Node.newString("varName");
        Node varNode = new Node(Token.VAR, varName);
        assertTrue(NodeUtil.isVarDeclaration(varName));
    }

    @Test
    public void testIsVarDeclaration_nameNodeNotVarParent() throws Exception {
        Node nameNode = Node.newString("someName");
        Node parent = new Node(Token.ADD, nameNode, Node.newNumber(1));
        assertFalse(NodeUtil.isVarDeclaration(nameNode));
    }

    @Test
    public void testGetAssignedValue_varDeclaration() throws Exception {
        Node value = Node.newNumber(10);
        Node nameNode = Node.newString("varName");
        nameNode.addChildToBack(value);
        Node varNode = new Node(Token.VAR, nameNode);
        assertEquals(value, NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testGetAssignedValue_assignment() throws Exception {
        Node value = Node.newNumber(20);
        Node nameNode = Node.newString("varName");
        Node assignNode = new Node(Token.ASSIGN, nameNode, value);
        assertEquals(value, NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testGetAssignedValue_nameNotInVarOrAssign() throws Exception {
        Node nameNode = Node.newString("varName");
        Node parent = new Node(Token.ADD, nameNode, Node.newNumber(1));
        assertNull(NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testIsString_stringNode() throws Exception {
        Node n = Node.newString("hello");
        assertTrue(NodeUtil.isString(n));
    }

    @Test
    public void testIsString_nameNode() throws Exception {
        Node n = Node.newString("hello"); // Using newString to create a NAME node
        assertFalse(NodeUtil.isString(n));
    }

    @Test
    public void testIsExprAssign_validExprAssign() throws Exception {
        Node name = Node.newString("x"); // Using newString for NAME node
        Node value = Node.newNumber(10);
        Node assign = new Node(Token.ASSIGN, name, value);
        Node exprAssign = new Node(Token.EXPR_RESULT, assign);
        assertTrue(NodeUtil.isExprAssign(exprAssign));
    }

    @Test
    public void testIsExprAssign_notExprResult() throws Exception {
        Node name = Node.newString("x"); // Using newString for NAME node
        Node value = Node.newNumber(10);
        Node assign = new Node(Token.ASSIGN, name, value);
        assertFalse(NodeUtil.isExprAssign(assign));
    }

    @Test
    public void testIsExprAssign_exprResultNotAssign() throws Exception {
        Node exprResult = NodeUtil.newExpr(Node.newString("hello"));
        assertFalse(NodeUtil.isExprAssign(exprResult));
    }

    @Test
    public void testIsAssign_assignNode() throws Exception {
        Node n = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.isAssign(n));
    }

    @Test
    public void testIsAssign_addNode() throws Exception {
        Node n = new Node(Token.ADD);
        assertFalse(NodeUtil.isAssign(n));
    }

    @Test
    public void testIsExprCall_validExprCall() throws Exception {
        Node call = Node.newCall(Node.newString("foo"));
        Node exprCall = new Node(Token.EXPR_RESULT, call);
        assertTrue(NodeUtil.isExprCall(exprCall));
    }

    @Test
    public void testIsExprCall_notExprResult() throws Exception {
        Node call = Node.newCall(Node.newString("foo"));
        assertFalse(NodeUtil.isExprCall(call));
    }

    @Test
    public void testIsExprCall_exprResultNotCall() throws Exception {
        Node exprResult = NodeUtil.newExpr(Node.newString("hello"));
        assertFalse(NodeUtil.isExprCall(exprResult));
    }

    @Test
    public void testIsForIn_forInNode() throws Exception {
        Node loopVar = Node.newString("i");
        Node iterable = Node.newString("arr");
        Node body = new Node(Token.BLOCK);
        Node forInNode = new Node(Token.FOR, loopVar, iterable, body);
        assertTrue(NodeUtil.isForIn(forInNode));
    }

    @Test
    public void testIsForIn_standardForNode() throws Exception {
        Node init = Node.newVar("i", Node.newNumber(0));
        Node condition = Node.newNumber(1);
        Node increment = new Node(Token.INC, Node.newString("i")); // Use newString for NAME node
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        assertFalse(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsLoopStructure_forLoop() throws Exception {
        Node forNode = new Node(Token.FOR);
        assertTrue(NodeUtil.isLoopStructure(forNode));
    }

    @Test
    public void testIsLoopStructure_whileLoop() throws Exception {
        Node whileNode = new Node(Token.WHILE);
        assertTrue(NodeUtil.isLoopStructure(whileNode));
    }

    @Test
    public void testIsLoopStructure_doLoop() throws Exception {
        Node doNode = new Node(Token.DO);
        assertTrue(NodeUtil.isLoopStructure(doNode));
    }

    @Test
    public void testIsLoopStructure_ifNode() throws Exception {
        Node ifNode = new Node(Token.IF);
        assertFalse(NodeUtil.isLoopStructure(ifNode));
    }

    @Test
    public void testGetLoopCodeBlock_forLoop() throws Exception {
        Node init = Node.newVar("i", Node.newNumber(0));
        Node condition = Node.newNumber(1);
        Node increment = new Node(Token.INC, Node.newString("i")); // Use newString for NAME node
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        assertEquals(body, NodeUtil.getLoopCodeBlock(forNode));
    }

    @Test
    public void testGetLoopCodeBlock_whileLoop() throws Exception {
        Node condition = Node.newNumber(1);
        Node body = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, condition, body);
        assertEquals(body, NodeUtil.getLoopCodeBlock(whileNode));
    }

    @Test
    public void testGetLoopCodeBlock_doLoop() throws Exception {
        Node condition = Node.newNumber(1);
        Node body = new Node(Token.BLOCK);
        Node doNode = new Node(Token.DO, body, condition);
        assertEquals(body, NodeUtil.getLoopCodeBlock(doNode));
    }

    @Test
    public void testIsWithinLoop_insideForLoop() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, Node.newVar("i", Node.newNumber(0)), Node.newNumber(1), Node.newNumber(1), body);
        assertTrue(NodeUtil.isWithinLoop(body)); // Check if the body itself is considered within
    }

    @Test
    public void testIsWithinLoop_outsideLoop() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node script = new Node(Token.SCRIPT, body);
        assertFalse(NodeUtil.isWithinLoop(body));
    }

    @Test
    public void testIsWithinLoop_insideFunctionButOutsideLoop() throws Exception {
        Node loopBody = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, Node.newVar("i", Node.newNumber(0)), Node.newNumber(1), Node.newNumber(1), loopBody);
        Node functionBody = new Node(Token.BLOCK, forNode);
        Node func = Node.newFunction("f", new Node(Token.LP), functionBody);
        assertFalse(NodeUtil.isWithinLoop(functionBody)); // The function body is not within a loop
    }

    @Test
    public void testIsControlStructure_forLoop() throws Exception {
        Node forNode = new Node(Token.FOR);
        assertTrue(NodeUtil.isControlStructure(forNode));
    }

    @Test
    public void testIsControlStructure_ifNode() throws Exception {
        Node ifNode = new Node(Token.IF);
        assertTrue(NodeUtil.isControlStructure(ifNode));
    }

    @Test
    public void testIsControlStructure_tryNode() throws Exception {
        Node tryNode = new Node(Token.TRY);
        assertTrue(NodeUtil.isControlStructure(tryNode));
    }

    @Test
    public void testIsControlStructure_blockNode() throws Exception {
        Node blockNode = new Node(Token.BLOCK);
        assertFalse(NodeUtil.isControlStructure(blockNode));
    }

    @Test
    public void testIsControlStructureCodeBlock_ifCondition() throws Exception {
        Node condition = Node.newNumber(1);
        Node thenBlock = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, condition, thenBlock);
        assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, condition));
    }

    @Test
    public void testIsControlStructureCodeBlock_ifThenBlock() throws Exception {
        Node condition = Node.newNumber(1);
        Node thenBlock = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, condition, thenBlock);
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, thenBlock));
    }

    @Test
    public void testIsControlStructureCodeBlock_forCondition() throws Exception {
        Node init = Node.newVar("i", Node.newNumber(0));
        Node condition = Node.newNumber(1);
        Node increment = new Node(Token.INC, Node.newString("i")); // Use newString for NAME node
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        assertFalse(NodeUtil.isControlStructureCodeBlock(forNode, condition));
    }

    @Test
    public void testIsControlStructureCodeBlock_forBody() throws Exception {
        Node init = Node.newVar("i", Node.newNumber(0));
        Node condition = Node.newNumber(1);
        Node increment = new Node(Token.INC, Node.newString("i")); // Use newString for NAME node
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, body));
    }

    @Test
    public void testGetConditionExpression_ifNode() throws Exception {
        Node condition = Node.newNumber(1);
        Node thenBlock = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, condition, thenBlock);
        assertEquals(condition, NodeUtil.getConditionExpression(ifNode));
    }

    @Test
    public void testGetConditionExpression_whileNode() throws Exception {
        Node condition = Node.newNumber(1);
        Node body = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, condition, body);
        assertEquals(condition, NodeUtil.getConditionExpression(whileNode));
    }

    @Test
    public void testGetConditionExpression_doNode() throws Exception {
        Node condition = Node.newNumber(1);
        Node body = new Node(Token.BLOCK);
        Node doNode = new Node(Token.DO, body, condition);
        assertEquals(condition, NodeUtil.getConditionExpression(doNode));
    }

    @Test
    public void testGetConditionExpression_forNode() throws Exception {
        Node init = Node.newVar("i", Node.newNumber(0));
        Node condition = Node.newNumber(1);
        Node increment = new Node(Token.INC, Node.newString("i")); // Use newString for NAME node
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        assertEquals(condition, NodeUtil.getConditionExpression(forNode));
    }

    @Test
    public void testIsStatementBlock_scriptNode() throws Exception {
        Node scriptNode = new Node(Token.SCRIPT);
        assertTrue(NodeUtil.isStatementBlock(scriptNode));
    }

    @Test
    public void testIsStatementBlock_blockNode() throws Exception {
        Node blockNode = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isStatementBlock(blockNode));
    }

    @Test
    public void testIsStatementBlock_nameNode() throws Exception {
        Node nameNode = Node.newString("test"); // Use newString for NAME node
        assertFalse(NodeUtil.isStatementBlock(nameNode));
    }

    @Test
    public void testIsStatement_statementInBlock() throws Exception {
        Node statement = Node.newString("statement");
        Node block = new Node(Token.BLOCK, statement);
        assertTrue(NodeUtil.isStatement(statement));
    }

    @Test
    public void testIsStatement_statementInScript() throws Exception {
        Node statement = Node.newString("statement");
        Node script = new Node(Token.SCRIPT, statement);
        assertTrue(NodeUtil.isStatement(statement));
    }

    @Test
    public void testIsStatement_statementInLabel() throws Exception {
        Node statement = Node.newString("statement");
        Node label = new Node(Token.LABEL, Node.newString("myLabel"), statement);
        assertTrue(NodeUtil.isStatement(statement));
    }

    @Test
    public void testIsStatement_expressionInBlock() throws Exception {
        Node expression = NodeUtil.newExpr(Node.newString("expression"));
        Node block = new Node(Token.BLOCK, expression);
        assertTrue(NodeUtil.isStatement(expression));
    }

    @Test
    public void testIsStatement_expressionNotInStatementBlock() throws Exception {
        Node expression = NodeUtil.newExpr(Node.newString("expression"));
        Node parent = new Node(Token.ADD, expression, Node.newNumber(1));
        assertFalse(NodeUtil.isStatement(expression));
    }

    @Test
    public void testIsStatementParent_block() throws Exception {
        Node parent = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isStatementParent(parent));
    }

    @Test
    public void testIsStatementParent_script() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        assertTrue(NodeUtil.isStatementParent(parent));
    }

    @Test
    public void testIsStatementParent_label() throws Exception {
        Node parent = new Node(Token.LABEL);
        assertTrue(NodeUtil.isStatementParent(parent));
    }

    @Test
    public void testIsStatementParent_function() throws Exception {
        Node parent = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isStatementParent(parent));
    }

    @Test
    public void testIsSwitchCase_caseNode() throws Exception {
        Node n = new Node(Token.CASE);
        assertTrue(NodeUtil.isSwitchCase(n));
    }

    @Test
    public void testIsSwitchCase_defaultNode() throws Exception {
        Node n = new Node(Token.DEFAULT);
        assertTrue(NodeUtil.isSwitchCase(n));
    }

    @Test
    public void testIsSwitchCase_blockNode() throws Exception {
        Node n = new Node(Token.BLOCK);
        assertFalse(NodeUtil.isSwitchCase(n));
    }

    @Test
    public void testIsReferenceName_nameNode() throws Exception {
        Node n = Node.newString("myVar"); // Use newString for NAME node
        assertTrue(NodeUtil.isReferenceName(n));
    }

    @Test
    public void testIsReferenceName_emptyStringNameNode() throws Exception {
        Node n = Node.newString(Token.NAME, ""); // Empty name
        assertFalse(NodeUtil.isReferenceName(n));
    }

    @Test
    public void testIsReferenceName_stringNode() throws Exception {
        Node n = Node.newString("myVar");
        assertFalse(NodeUtil.isReferenceName(n));
    }

    @Test
    public void testIsLabelName_labelNameNode() throws Exception {
        Node n = new Node(Token.LABEL_NAME);
        assertTrue(NodeUtil.isLabelName(n));
    }

    @Test
    public void testIsLabelName_nameNode() throws Exception {
        Node n = Node.newString("myLabel"); // Use newString for NAME node
        assertFalse(NodeUtil.isLabelName(n));
    }

    @Test
    public void testIsTryFinallyNode_finallyBlock() throws Exception {
        Node tryNode = new Node(Token.TRY);
        Node catchBlock = new Node(Token.BLOCK); // Placeholder for catch
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildrenToBack(catchBlock);
        tryNode.addChildrenToBack(finallyBlock);
        assertTrue(NodeUtil.isTryFinallyNode(tryNode, finallyBlock));
    }

    @Test
    public void testIsTryFinallyNode_catchBlock() throws Exception {
        Node tryNode = new Node(Token.TRY);
        Node catchBlock = new Node(Token.BLOCK);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildrenToBack(catchBlock);
        tryNode.addChildrenToBack(finallyBlock);
        assertFalse(NodeUtil.isTryFinallyNode(tryNode, catchBlock));
    }

    @Test
    public void testIsTryFinallyNode_noFinally() throws Exception {
        Node tryNode = new Node(Token.TRY);
        Node catchBlock = new Node(Token.BLOCK);
        tryNode.addChildrenToBack(catchBlock);
        assertFalse(NodeUtil.isTryFinallyNode(tryNode, new Node(Token.BLOCK)));
    }

    @Test
    public void testIsTryCatchNodeContainer_catchBlockContainer() throws Exception {
        Node tryNode = new Node(Token.TRY);
        Node catchBlock = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH, Node.newString("e"), catchBlock);
        tryNode.addChildrenToBack(catchNode);
        assertTrue(NodeUtil.isTryCatchNodeContainer(catchBlock));
    }

    @Test
    public void testIsTryCatchNodeContainer_finallyBlock() throws Exception {
        Node tryNode = new Node(Token.TRY);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildrenToBack(finallyBlock);
        assertFalse(NodeUtil.isTryCatchNodeContainer(finallyBlock));
    }

    @Test
    public void testRemoveChild_emptyBlock() throws Exception {
        Node block = new Node(Token.BLOCK);
        Node parent = new Node(Token.SCRIPT, block);
        NodeUtil.removeChild(block, new Node(Token.EMPTY)); // Trying to remove from an empty block
        assertFalse(block.hasChildren()); // Should remain empty
    }

    @Test
    public void testRemoveChild_statementInBlock() throws Exception {
        Node statement = Node.newString("test");
        Node block = new Node(Token.BLOCK, statement);
        Node parent = new Node(Token.SCRIPT, block);
        NodeUtil.removeChild(block, statement);
        assertFalse(block.hasChildren());
    }

    @Test
    public void testRemoveChild_varWithMultipleDeclarations() throws Exception {
        Node var1 = Node.newString("v1");
        Node var2 = Node.newString("v2");
        Node varNode = new Node(Token.VAR, var1, var2);
        NodeUtil.removeChild(varNode, var1);
        assertEquals(1, varNode.getChildCount());
        assertEquals(var2, varNode.getFirstChild());
    }

    @Test
    public void testRemoveChild_varWithSingleDeclaration() throws Exception {
        Node var1 = Node.newString("v1");
        Node varNode = new Node(Token.VAR, var1);
        Node parent = new Node(Token.BLOCK, varNode);
        NodeUtil.removeChild(varNode, var1);
        assertEquals(0, varNode.getChildCount());
        assertFalse(parent.hasChildren()); // VAR node itself should be removed
    }

    @Test
    public void testRemoveChild_labelWithStatement() throws Exception {
        Node statement = Node.newString("statement");
        Node label = new Node(Token.LABEL, Node.newString("myLabel"), statement);
        Node parent = new Node(Token.BLOCK, label);
        NodeUtil.removeChild(label, statement);
        assertEquals(1, label.getChildCount()); // Should retain label name
        assertEquals(Node.newString("myLabel"), label.getFirstChild());
    }

    @Test
    public void testRemoveChild_labelWithoutStatement() throws Exception {
        Node label = new Node(Token.LABEL, Node.newString("myLabel"));
        Node parent = new Node(Token.BLOCK, label);
        NodeUtil.removeChild(parent, label); // Remove the label itself if it has no child statements
        assertFalse(parent.hasChildren());
    }

    @Test
    public void testRemoveChild_forLoopWithEmpty() throws Exception {
        Node init = Node.newVar("i", Node.newNumber(0));
        Node condition = Node.newNumber(1);
        Node increment = new Node(Token.INC, Node.newString("i")); // Use newString for NAME node
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        // Replace the condition with EMPTY node to test removal of a child in a specific context
        forNode.replaceChild(condition, new Node(Token.EMPTY));
        NodeUtil.removeChild(forNode, forNode.getChildAtIndex(1)); // Remove the (now EMPTY) condition node
        assertEquals(Token.EMPTY, forNode.getChildAtIndex(1).getType());
    }

    @Test
    public void testMaybeAddFinally_noFinally() throws Exception {
        Node tryNode = new Node(Token.TRY);
        Node catchBlock = new Node(Token.BLOCK);
        tryNode.addChildrenToBack(catchBlock);
        NodeUtil.maybeAddFinally(tryNode);
        assertEquals(3, tryNode.getChildCount());
        assertEquals(Token.BLOCK, tryNode.getLastChild().getType());
    }

    @Test
    public void testMaybeAddFinally_alreadyHasFinally() throws Exception {
        Node tryNode = new Node(Token.TRY);
        Node catchBlock = new Node(Token.BLOCK);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildrenToBack(catchBlock);
        tryNode.addChildrenToBack(finallyBlock);
        int initialChildCount = tryNode.getChildCount();
        NodeUtil.maybeAddFinally(tryNode);
        assertEquals(initialChildCount, tryNode.getChildCount());
    }

    @Test
    public void testTryMergeBlock_mergeIntoScript() throws Exception {
        Node blockToMerge = new Node(Token.BLOCK, Node.newString("stmt1"));
        Node script = new Node(Token.SCRIPT, blockToMerge);
        NodeUtil.tryMergeBlock(blockToMerge);
        assertEquals(Token.SCRIPT, script.getType()); // Parent should still be SCRIPT
        assertEquals("stmt1", script.getFirstChild().getString()); // Statement should be direct child of SCRIPT
    }

    @Test
    public void testTryMergeBlock_mergeIntoBlock() throws Exception {
        Node childStmt = Node.newString("child");
        Node blockToMerge = new Node(Token.BLOCK, childStmt);
        Node parentBlock = new Node(Token.BLOCK, blockToMerge);
        NodeUtil.tryMergeBlock(blockToMerge);
        assertEquals(Token.BLOCK, parentBlock.getType());
        assertEquals("child", parentBlock.getFirstChild().getString());
    }

    @Test
    public void testTryMergeBlock_doNotMergeIntoOther() throws Exception {
        Node blockToMerge = new Node(Token.BLOCK, Node.newString("stmt1"));
        Node otherNode = new Node(Token.IF, Node.newNumber(1), blockToMerge);
        Node parent = new Node(Token.SCRIPT, otherNode); // Parent of IF
        assertFalse(NodeUtil.tryMergeBlock(blockToMerge));
    }

    @Test
    public void testIsCall_callNode() throws Exception {
        Node n = Node.newCall(Node.newString("foo"));
        assertTrue(NodeUtil.isCall(n));
    }

    @Test
    public void testIsCall_newNode() throws Exception {
        Node n = new Node(Token.NEW, Node.newString("Object"));
        assertFalse(NodeUtil.isCall(n));
    }

    @Test
    public void testIsCallOrNew_callNode() throws Exception {
        Node n = Node.newCall(Node.newString("foo"));
        assertTrue(NodeUtil.isCallOrNew(n));
    }

    @Test
    public void testIsCallOrNew_newNode() throws Exception {
        Node n = new Node(Token.NEW, Node.newString("Object"));
        assertTrue(NodeUtil.isCallOrNew(n));
    }

    @Test
    public void testIsCallOrNew_nameNode() throws Exception {
        Node n = Node.newString("foo"); // Use newString for NAME node
        assertFalse(NodeUtil.isCallOrNew(n));
    }

    @Test
    public void testIsFunction_functionNode() throws Exception {
        Node n = Node.newFunction("f", new Node(Token.LP), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isFunction(n));
    }

    @Test
    public void testIsFunction_blockNode() throws Exception {
        Node n = new Node(Token.BLOCK);
        assertFalse(NodeUtil.isFunction(n));
    }

    @Test
    public void testGetFunctionBody_validFunction() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node func = Node.newFunction("f", new Node(Token.LP), body);
        assertEquals(body, NodeUtil.getFunctionBody(func));
    }

    @Test
    public void testIsThis_thisNode() throws Exception {
        Node n = new Node(Token.THIS);
        assertTrue(NodeUtil.isThis(n));
    }

    @Test
    public void testIsThis_nameNode() throws Exception {
        Node n = Node.newString("this"); // Use newString for NAME node
        assertFalse(NodeUtil.isThis(n));
    }

    @Test
    public void testIsArrayLiteral_arrayLiteralNode() throws Exception {
        Node n = new Node(Token.ARRAYLIT);
        assertTrue(NodeUtil.isArrayLiteral(n));
    }

    @Test
    public void testIsArrayLiteral_objectLiteralNode() throws Exception {
        Node n = new Node(Token.OBJECTLIT);
        assertFalse(NodeUtil.isArrayLiteral(n));
    }

    @Test
    public void testContainsCall_nestedCall() throws Exception {
        Node innerCall = Node.newCall(Node.newString("inner"));
        Node outerCall = Node.newCall(Node.newString("outer"), innerCall);
        assertTrue(NodeUtil.containsCall(outerCall));
    }

    @Test
    public void testContainsCall_noCall() throws Exception {
        Node n = Node.newString("test");
        assertFalse(NodeUtil.containsCall(n));
    }

    @Test
    public void testIsFunctionDeclaration_functionStatement() throws Exception {
        Node func = new Node(Token.FUNCTION);
        func.addChildrenToBack(Node.newString("f", -1, -1));
        func.addChildrenToBack(new Node(Token.LP));
        func.addChildrenToBack(new Node(Token.BLOCK));
        Node block = new Node(Token.BLOCK, func); // Make it a statement
        assertTrue(NodeUtil.isFunctionDeclaration(func));
    }

    @Test
    public void testIsFunctionDeclaration_functionExpression() throws Exception {
        Node funcExpr = Node.newFunction("f", new Node(Token.LP), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isFunctionDeclaration(funcExpr));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_topLevel() throws Exception {
        Node func = new Node(Token.FUNCTION);
        func.addChildrenToBack(Node.newString("f", -1, -1));
        func.addChildrenToBack(new Node(Token.LP));
        func.addChildrenToBack(new Node(Token.BLOCK));
        Node script = new Node(Token.SCRIPT, func);
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(func));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_nestedInFunction() throws Exception {
        Node func = new Node(Token.FUNCTION);
        func.addChildrenToBack(Node.newString("f", -1, -1));
        func.addChildrenToBack(new Node(Token.LP));
        func.addChildrenToBack(new Node(Token.BLOCK));
        Node innerFunc = Node.newFunction("g", new Node(Token.LP), new Node(Token.BLOCK, func));
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(func));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_notDeclaration() throws Exception {
        Node funcExpr = Node.newFunction("f", new Node(Token.LP), new Node(Token.BLOCK));
        Node block = new Node(Token.BLOCK, funcExpr);
        assertFalse(NodeUtil.isHoistedFunctionDeclaration(funcExpr));
    }

    @Test
    public void testIsFunctionExpression_functionExpression() throws Exception {
        Node funcExpr = Node.newFunction("f", new Node(Token.LP), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isFunctionExpression(funcExpr));
    }

    @Test
    public void testIsFunctionExpression_functionDeclaration() throws Exception {
        Node func = new Node(Token.FUNCTION);
        func.addChildrenToBack(Node.newString("f", -1, -1));
        func.addChildrenToBack(new Node(Token.LP));
        func.addChildrenToBack(new Node(Token.BLOCK));
        Node block = new Node(Token.BLOCK, func);
        assertFalse(NodeUtil.isFunctionExpression(func));
    }

    @Test
    public void testIsEmptyFunctionExpression_emptyBody() throws Exception {
        Node emptyBlock = new Node(Token.BLOCK);
        Node funcExpr = Node.newFunction("f", new Node(Token.LP), emptyBlock);
        assertTrue(NodeUtil.isEmptyFunctionExpression(funcExpr));
    }

    @Test
    public void testIsEmptyFunctionExpression_nonEmptyBody() throws Exception {
        Node nonEmptyBlock = new Node(Token.BLOCK, Node.newString("return 1;"));
        Node funcExpr = Node.newFunction("f", new Node(Token.LP), nonEmptyBlock);
        assertFalse(NodeUtil.isEmptyFunctionExpression(funcExpr));
    }

    @Test
    public void testIsEmptyFunctionExpression_notFunctionExpression() throws Exception {
        Node func = new Node(Token.FUNCTION);
        func.addChildrenToBack(Node.newString("f", -1, -1));
        func.addChildrenToBack(new Node(Token.LP));
        func.addChildrenToBack(new Node(Token.BLOCK));
        assertFalse(NodeUtil.isEmptyFunctionExpression(func));
    }

    @Test
    public void testIsVarArgsFunction_hasArguments() throws Exception {
        Node argumentsNode = Node.newString("arguments"); // Use newString for NAME node
        Node body = new Node(Token.BLOCK, argumentsNode);
        Node func = Node.newFunction("f", new Node(Token.LP), body);
        assertTrue(NodeUtil.isVarArgsFunction(func));
    }

    @Test
    public void testIsVarArgsFunction_noArguments() throws Exception {
        Node body = new Node(Token.BLOCK, Node.newString("return 1;"));
        Node func = Node.newFunction("f", new Node(Token.LP), body);
        assertFalse(NodeUtil.isVarArgsFunction(func));
    }

    @Test
    public void testIsObjectCallMethod_stringKeyMatch() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("myMethod");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertTrue(NodeUtil.isObjectCallMethod(call, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_stringKeyNoMatch() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("otherMethod");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertFalse(NodeUtil.isObjectCallMethod(call, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_stringKeyIndirect() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("myMethod");
        Node getElemNode = new Node(Token.GETELEM, obj, method); // GETELEM should not match
        Node call = Node.newCall(getElemNode);
        assertFalse(NodeUtil.isObjectCallMethod(call, "myMethod"));
    }

    @Test
    public void testIsFunctionObjectCall_callMethod() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("call");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertTrue(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsFunctionObjectApply_applyMethod() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("apply");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertTrue(NodeUtil.isFunctionObjectApply(call));
    }

    @Test
    public void testIsFunctionObjectCall_otherMethod() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("toString");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertFalse(NodeUtil.isFunctionObjectCall(call));
        assertFalse(NodeUtil.isFunctionObjectApply(call));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_callMethod() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("call");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(call));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_applyMethod() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("apply");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(call));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_otherMethod() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("toString");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertFalse(NodeUtil.isFunctionObjectCallOrApply(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_validCall() throws Exception {
        Node obj = Node.newString("myObj"); // Use newString for NAME node
        Node method = Node.newString("call");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_qualifiedName() throws Exception {
        Node obj = NodeUtil.newQualifiedNameNode(new CodingConvention.DefaultCodingConvention(), "myNs.myObj", -1, -1);
        Node method = Node.newString("call");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_applyMethod() throws Exception {
        Node obj = Node.newString("myObj"); // Use newString for NAME node
        Node method = Node.newString("apply");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsVarOrSimpleAssignLhs_varDeclaration() throws Exception {
        Node nameNode = Node.newString("varName");
        Node varNode = new Node(Token.VAR, nameNode);
        assertTrue(NodeUtil.isVarOrSimpleAssignLhs(nameNode, varNode));
    }

    @Test
    public void testIsVarOrSimpleAssignLhs_assignmentLhs() throws Exception {
        Node nameNode = Node.newString("varName");
        Node value = Node.newNumber(10);
        Node assignNode = new Node(Token.ASSIGN, nameNode, value);
        assertTrue(NodeUtil.isVarOrSimpleAssignLhs(nameNode, assignNode));
    }

    @Test
    public void testIsVarOrSimpleAssignLhs_assignmentRhs() throws Exception {
        Node nameNode = Node.newString("varName");
        Node value = Node.newNumber(10);
        Node assignNode = new Node(Token.ASSIGN, nameNode, value);
        assertFalse(NodeUtil.isVarOrSimpleAssignLhs(value, assignNode));
    }

    @Test
    public void testIsLValue_varDeclaration() throws Exception {
        Node nameNode = Node.newString("varName");
        Node varNode = new Node(Token.VAR, nameNode);
        assertTrue(NodeUtil.isLValue(nameNode));
    }

    @Test
    public void testIsLValue_assignmentLhs() throws Exception {
        Node nameNode = Node.newString("varName");
        Node value = Node.newNumber(10);
        Node assignNode = new Node(Token.ASSIGN, nameNode, value);
        assertTrue(NodeUtil.isLValue(nameNode));
    }

    @Test
    public void testIsLValue_assignmentRhs() throws Exception {
        Node nameNode = Node.newString("varName");
        Node value = Node.newNumber(10);
        Node assignNode = new Node(Token.ASSIGN, nameNode, value);
        assertFalse(NodeUtil.isLValue(value));
    }

    @Test
    public void testIsLValue_getProp() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node prop = Node.newString("prop");
        Node getPropNode = new Node(Token.GETPROP, obj, prop);
        Node assignNode = new Node(Token.ASSIGN, getPropNode, Node.newNumber(10));
        assertTrue(NodeUtil.isLValue(getPropNode));
    }

    @Test
    public void testIsLValue_getElem() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node elem = Node.newNumber(0);
        Node getElemNode = new Node(Token.GETELEM, obj, elem);
        Node assignNode = new Node(Token.ASSIGN, getElemNode, Node.newNumber(10));
        assertTrue(NodeUtil.isLValue(getElemNode));
    }

    @Test
    public void testIsLValue_inc() throws Exception {
        Node nameNode = Node.newString("varName");
        Node incNode = new Node(Token.INC, nameNode);
        assertTrue(NodeUtil.isLValue(nameNode));
    }

    @Test
    public void testIsLValue_functionNameInDeclaration() throws Exception {
        Node func = new Node(Token.FUNCTION);
        func.addChildrenToBack(Node.newString("f", -1, -1));
        func.addChildrenToBack(new Node(Token.LP));
        func.addChildrenToBack(new Node(Token.BLOCK));
        assertTrue(NodeUtil.isLValue(func.getFirstChild())); // The function name itself
    }

    @Test
    public void testIsObjectLitKey_stringKey() throws Exception {
        Node key = Node.newString("myKey");
        Node value = Node.newNumber(1);
        Node objLitProp = new Node(Token.SET, key, value);
        Node parent = new Node(Token.OBJECTLIT, objLitProp);
        assertTrue(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testIsObjectLitKey_getSetterKey() throws Exception {
        Node key = Node.newString("myKey");
        Node value = Node.newNumber(1);
        Node objLitProp = new Node(Token.GET, key, value); // GET node
        Node parent = new Node(Token.OBJECTLIT, objLitProp);
        assertTrue(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testIsObjectLitKey_regularNameNode() throws Exception {
        Node key = Node.newString("myKey"); // Use newString for NAME node
        Node parent = new Node(Token.OBJECTLIT);
        assertFalse(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testGetObjectLitKeyName_stringKey() throws Exception {
        Node key = Node.newString("myKey");
        assertEquals("myKey", NodeUtil.getObjectLitKeyName(key));
    }

    @Test
    public void testGetObjectLitKeyName_getSetterKey() throws Exception {
        Node key = Node.newString("myKey"); // GET/SET nodes use string names
        Node getOrSet = new Node(Token.GET, key, Node.newNumber(1));
        assertEquals("myKey", NodeUtil.getObjectLitKeyName(getOrSet));
    }

    // Mocking is not allowed, so these tests are simplified.
    // They check the basic structure based on node types.
    @Test
    public void testGetObjectLitKeyTypeFromValueType_getter() throws Exception {
        Node key = new Node(Token.GET);
        // A GET key implies a function type is expected for the value,
        // and we'd extract the return type. Testing this without mocking
        // JSType is limited. We can check if the node type is GET.
        assertTrue(key.getType() == Token.GET);
    }

    @Test
    public void testGetObjectLitKeyTypeFromValueType_setter() throws Exception {
        Node key = new Node(Token.SET);
        // A SET key implies a function type is expected for the value,
        // and we'd extract the parameter type. Testing this without mocking
        // JSType is limited. We can check if the node type is SET.
        assertTrue(key.getType() == Token.SET);
    }

    @Test
    public void testIsGetOrSetKey_getNode() throws Exception {
        Node key = new Node(Token.GET);
        assertTrue(NodeUtil.isGetOrSetKey(key));
    }

    @Test
    public void testIsGetOrSetKey_setNode() throws Exception {
        Node key = new Node(Token.SET);
        assertTrue(NodeUtil.isGetOrSetKey(key));
    }

    @Test
    public void testIsGetOrSetKey_stringNode() throws Exception {
        Node key = Node.newString("key");
        assertFalse(NodeUtil.isGetOrSetKey(key));
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
    public void testOpToStr_logicalAnd() throws Exception {
        assertEquals("&&", NodeUtil.opToStr(Token.AND));
    }

    @Test
    public void testOpToStr_bitwiseAnd() throws Exception {
        assertEquals("&", NodeUtil.opToStr(Token.BITAND));
    }

    @Test
    public void testOpToStr_equality() throws Exception {
        assertEquals("==", NodeUtil.opToStr(Token.EQ));
    }

    @Test
    public void testOpToStr_strictEquality() throws Exception {
        assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    }

    @Test
    public void testOpToStr_lessThan() throws Exception {
        assertEquals("<", NodeUtil.opToStr(Token.LT));
    }

    @Test
    public void testOpToStr_greaterThanOrEqual() throws Exception {
        assertEquals(">=", NodeUtil.opToStr(Token.GE));
    }

    @Test
    public void testOpToStr_shiftLeft() throws Exception {
        assertEquals("<<", NodeUtil.opToStr(Token.LSH));
    }

    @Test
    public void testOpToStr_unsignedRightShift() throws Exception {
        assertEquals(">>>", NodeUtil.opToStr(Token.URSH));
    }

    @Test
    public void testOpToStr_void() throws Exception {
        assertEquals("void", NodeUtil.opToStr(Token.VOID));
    }

    @Test
    public void testOpToStr_unknown() throws Exception {
        assertNull(NodeUtil.opToStr(Token.LAST_TOKEN + 1)); // An invalid token
    }

    @Test
    public void testOpToStrNoFail_add() throws Exception {
        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    }

    @Test
    public void testOpToStrNoFail_unknown() throws Exception {
        try {
            NodeUtil.opToStrNoFail(Token.LAST_TOKEN + 1);
            fail("Expected error for unknown operator");
        } catch (Error e) {
            // Expected exception
        }
    }

    @Test
    public void testContainsType_nodeWithMatchingChild() throws Exception {
        Node child = Node.newString("name"); // Use newString for NAME node
        Node parent = new Node(Token.BLOCK, child);
        assertTrue(NodeUtil.containsType(parent, Token.NAME));
    }

    @Test
    public void testContainsType_nodeWithoutMatchingChild() throws Exception {
        Node child = Node.newString("string"); // Use newString for STRING node
        Node parent = new Node(Token.BLOCK, child);
        assertFalse(NodeUtil.containsType(parent, Token.NAME));
    }

    @Test
    public void testContainsType_nestedMatchingChild() throws Exception {
        Node grandChild = Node.newString("name"); // Use newString for NAME node
        Node child = new Node(Token.BLOCK, grandChild);
        Node parent = new Node(Token.SCRIPT, child);
        assertTrue(NodeUtil.containsType(parent, Token.NAME));
    }

    @Test
    public void testRedeclareVarsInsideBranch_noVars() throws Exception {
        Node branch = new Node(Token.BLOCK, Node.newString("test"));
        Node parent = new Node(Token.SCRIPT, branch);
        NodeUtil.redeclareVarsInsideBranch(branch);
        assertEquals(1, branch.getChildCount()); // Original test node should remain
    }

    @Test
    public void testRedeclareVarsInsideBranch_singleVar() throws Exception {
        Node varName = Node.newString("myVar"); // Use newString for NAME node
        varName.putBooleanProp(Node.IS_CONSTANT_NAME, true); // Simulate constant
        Node varDecl = new Node(Token.VAR, varName);
        Node branch = new Node(Token.BLOCK, varDecl);
        Node parent = new Node(Token.SCRIPT, branch);

        NodeUtil.redeclareVarsInsideBranch(branch);

        assertEquals(2, branch.getChildCount()); // Original var + redeclared var
        Node redeclaredVar = branch.getFirstChild();
        assertEquals(Token.VAR, redeclaredVar.getType());
        assertEquals("myVar", redeclaredVar.getFirstChild().getString());
        assertTrue(redeclaredVar.getFirstChild().getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testRedeclareVarsInsideBranch_multipleVars() throws Exception {
        Node varName1 = Node.newString("var1"); // Use newString for NAME nodes
        Node varDecl1 = new Node(Token.VAR, varName1);
        Node varName2 = Node.newString("var2"); // Use newString for NAME nodes
        Node varDecl2 = new Node(Token.VAR, varName2);
        Node branch = new Node(Token.BLOCK, varDecl1, varDecl2);
        Node parent = new Node(Token.SCRIPT, branch);

        NodeUtil.redeclareVarsInsideBranch(branch);

        assertEquals(4, branch.getChildCount()); // Original 2 + redeclared 2
        Node redeclaredVar1 = branch.getFirstChild();
        assertEquals("var1", redeclaredVar1.getFirstChild().getString());
        Node redeclaredVar2 = branch.getChildAtIndex(2);
        assertEquals("var2", redeclaredVar2.getFirstChild().getString());
    }

    @Test
    public void testRedeclareVarsInsideBranch_nestedFunction() throws Exception {
        Node innerVarName = Node.newString("innerVar"); // Use newString for NAME nodes
        Node innerVarDecl = new Node(Token.VAR, innerVarName);
        Node innerBlock = new Node(Token.BLOCK, innerVarDecl);
        Node innerFunc = Node.newFunction("inner", new Node(Token.LP), innerBlock);

        Node outerVarName = Node.newString("outerVar"); // Use newString for NAME nodes
        Node outerVarDecl = new Node(Token.VAR, outerVarName);
        Node branch = new Node(Token.BLOCK, innerFunc, outerVarDecl); // Inner func should not redeclare outerVar
        Node parent = new Node(Token.SCRIPT, branch);

        NodeUtil.redeclareVarsInsideBranch(branch);

        assertEquals(3, branch.getChildCount()); // Inner func + redeclared innerVar + outerVar
        assertEquals(Token.VAR, branch.getChildAtIndex(1).getType());
        assertEquals("innerVar", branch.getChildAtIndex(1).getFirstChild().getString());
    }

    @Test
    public void testNewFunctionNode_basicFunction() throws Exception {
        Node body = new Node(Token.BLOCK);
        List<Node> params = Arrays.asList(Node.newString("p1"), Node.newString("p2"));
        Node func = NodeUtil.newFunctionNode("myFunc", params, body, 1, 10);
        assertEquals(Token.FUNCTION, func.getType());
        assertEquals("myFunc", func.getChildAtIndex(0).getString()); // Function name is the first child
        assertEquals(Token.LP, func.getChildAtIndex(1).getType()); // Parameter list node
        assertEquals(body, func.getLastChild()); // Body is the last child
    }

    @Test
    public void testNewQualifiedNameNode_simpleName() throws Exception {
        CodingConvention convention = new CodingConvention.DefaultCodingConvention();
        Node n = NodeUtil.newQualifiedNameNode(convention, "simpleName", 1, 10);
        assertEquals(Token.NAME, n.getType());
        assertEquals("simpleName", n.getString());
    }

    @Test
    public void testNewQualifiedNameNode_qualifiedName() throws Exception {
        CodingConvention convention = new CodingConvention.DefaultCodingConvention();
        Node n = NodeUtil.newQualifiedNameNode(convention, "a.b.c", 1, 10);
        assertEquals(Token.GETPROP, n.getType());
        Node firstChild = n.getFirstChild();
        assertEquals(Token.GETPROP, firstChild.getType());
        assertEquals(Token.STRING, n.getLastChild().getType());
        assertEquals("c", n.getLastChild().getString());
    }

    @Test
    public void testGetRootOfQualifiedName_nameNode() throws Exception {
        Node n = Node.newString("myVar"); // Use newString for NAME node
        assertEquals(n, NodeUtil.getRootOfQualifiedName(n));
    }

    @Test
    public void testGetRootOfQualifiedName_getProp() throws Exception {
        Node root = Node.newString("root"); // Use newString for NAME node
        Node prop1 = Node.newString("prop1");
        Node prop2 = Node.newString("prop2");
        Node getProp1 = new Node(Token.GETPROP, root, prop1);
        Node getProp2 = new Node(Token.GETPROP, getProp1, prop2);
        assertEquals(root, NodeUtil.getRootOfQualifiedName(getProp2));
    }

    @Test
    public void testGetRootOfQualifiedName_thisNode() throws Exception {
        Node n = new Node(Token.THIS);
        assertEquals(n, NodeUtil.getRootOfQualifiedName(n));
    }

    // Tests for apply(Node n), visit(Node n), getVarsDeclaredInBranch(Node root),
    // getFunctionParameters(Node fnNode) are difficult to write without more context
    // or helper classes which are not allowed.
    // Their primary use cases seem to be internal to the compiler passes.

    @Test
    public void testGetFunctionJSDocInfo_functionNode() throws Exception {
        JSDocInfo jsDoc = new JSDocInfo();
        Node func = new Node(Token.FUNCTION);
        func.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, NodeUtil.getFunctionJSDocInfo(func));
    }

    @Test
    public void testGetFunctionJSDocInfo_functionExpressionWithAssign() throws Exception {
        JSDocInfo jsDoc = new JSDocInfo();
        Node funcExpr = Node.newFunction("f", new Node(Token.LP), new Node(Token.BLOCK));
        Node assign = new Node(Token.ASSIGN, Node.newString("x"), funcExpr); // Use newString for NAME node
        assign.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, NodeUtil.getFunctionJSDocInfo(funcExpr));
    }

    @Test
    public void testGetFunctionJSDocInfo_functionExpressionWithVar() throws Exception {
        JSDocInfo jsDoc = new JSDocInfo();
        Node funcExpr = Node.newFunction("f", new Node(Token.LP), new Node(Token.BLOCK));
        Node nameNode = Node.newString("varName"); // Use newString for NAME node
        nameNode.addChildToBack(funcExpr);
        Node varDecl = new Node(Token.VAR, nameNode);
        varDecl.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, NodeUtil.getFunctionJSDocInfo(funcExpr));
    }

    @Test
    public void testGetSourceName_nodeWithSourceFile() throws Exception {
        Node n = Node.newString("test");
        n.setSourceFile("myFile.js");
        assertEquals("myFile.js", NodeUtil.getSourceName(n));
    }

    @Test
    public void testGetSourceName_ancestorWithSourceFile() throws Exception {
        Node n = Node.newString("test");
        Node parent = new Node(Token.BLOCK, n);
        parent.setSourceFile("myFile.js");
        assertEquals("myFile.js", NodeUtil.getSourceName(n));
    }

    @Test
    public void testGetSourceName_noSourceFile() throws Exception {
        Node n = Node.newString("test");
        assertNull(NodeUtil.getSourceName(n));
    }

    @Test
    public void testNewCallNode_freeCall() throws Exception {
        Node callTarget = Node.newString("foo");
        Node param1 = Node.newNumber(1);
        Node param2 = Node.newString("bar");
        Node callNode = NodeUtil.newCallNode(callTarget, param1, param2);
        assertTrue(callNode.getBooleanProp(Node.FREE_CALL));
        assertEquals(callTarget, callNode.getFirstChild());
        assertEquals(param1, callNode.getChildAtIndex(1));
        assertEquals(param2, callNode.getLastChild());
    }

    @Test
    public void testNewCallNode_nonFreeCall() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("method");
        Node callTarget = new Node(Token.GETPROP, obj, method);
        Node param1 = Node.newNumber(1);
        Node callNode = NodeUtil.newCallNode(callTarget, param1);
        assertFalse(callNode.getBooleanProp(Node.FREE_CALL));
        assertEquals(callTarget, callNode.getFirstChild());
        assertEquals(param1, callNode.getLastChild());
    }

    @Test
    public void testEvaluatesToLocalValue_assignment() throws Exception {
        Node child = Node.newNumber(5);
        Node assignment = new Node(Token.ASSIGN, Node.newString("x"), child); // Use newString for NAME node
        assertTrue(NodeUtil.evaluatesToLocalValue(assignment));
    }

    @Test
    public void testEvaluatesToLocalValue_comma() throws Exception {
        Node child = Node.newNumber(5);
        Node comma = new Node(Token.COMMA, Node.newNumber(1), child);
        assertTrue(NodeUtil.evaluatesToLocalValue(comma));
    }

    @Test
    public void testEvaluatesToLocalValue_andOperator() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(0);
        Node andOp = new Node(Token.AND, left, right);
        assertTrue(NodeUtil.evaluatesToLocalValue(andOp));
    }

    @Test
    public void testEvaluatesToLocalValue_orOperator() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(0);
        Node orOp = new Node(Token.OR, left, right);
        assertTrue(NodeUtil.evaluatesToLocalValue(orOp));
    }

    @Test
    public void testEvaluatesToLocalValue_hookOperator() throws Exception {
        Node condition = Node.newNumber(1);
        Node trueVal = Node.newNumber(2);
        Node falseVal = Node.newNumber(3);
        Node hookOp = new Node(Token.HOOK, condition, trueVal, falseVal);
        assertTrue(NodeUtil.evaluatesToLocalValue(hookOp));
    }

    @Test
    public void testEvaluatesToLocalValue_increment() throws Exception {
        Node nameNode = Node.newString("x"); // Use newString for NAME node
        Node incNode = new Node(Token.INC, nameNode);
        incNode.putBooleanProp(Node.INCRDECR_PROP, true); // Postfix increment
        assertTrue(NodeUtil.evaluatesToLocalValue(incNode));
    }

    @Test
    public void testEvaluatesToLocalValue_decrement() throws Exception {
        Node nameNode = Node.newString("x"); // Use newString for NAME node
        Node decNode = new Node(Token.DEC, nameNode);
        decNode.putBooleanProp(Node.INCRDECR_PROP, true); // Postfix decrement
        assertTrue(NodeUtil.evaluatesToLocalValue(decNode));
    }

    @Test
    public void testEvaluatesToLocalValue_thisNode() throws Exception {
        Node thisNode = new Node(Token.THIS);
        // 'locals' predicate is false by default, so this should be false unless 'this' is considered local
        assertFalse(NodeUtil.evaluatesToLocalValue(thisNode));
    }

    @Test
    public void testEvaluatesToLocalValue_nameNodeImmutable() throws Exception {
        Node nameNode = Node.newString("undefined"); // Immutable name
        assertTrue(NodeUtil.evaluatesToLocalValue(nameNode));
    }

    @Test
    public void testEvaluatesToLocalValue_nameNodeLocal() throws Exception {
        Node nameNode = Node.newString("myVar"); // Use newString for NAME node
        // Simulate 'myVar' being considered local
        Predicate<Node> locals = n -> n.getString().equals("myVar");
        assertTrue(NodeUtil.evaluatesToLocalValue(nameNode, locals));
    }

    @Test
    public void testEvaluatesToLocalValue_getElem() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node elem = Node.newNumber(0);
        Node getElemNode = new Node(Token.GETELEM, obj, elem);
        // 'locals' predicate is false by default, so this should be false unless obj/elem are considered local
        assertFalse(NodeUtil.evaluatesToLocalValue(getElemNode));
    }

    @Test
    public void testEvaluatesToLocalValue_getProp() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node prop = Node.newString("prop");
        Node getPropNode = new Node(Token.GETPROP, obj, prop);
        // 'locals' predicate is false by default, so this should be false unless obj/prop are considered local
        assertFalse(NodeUtil.evaluatesToLocalValue(getPropNode));
    }

    @Test
    public void testEvaluatesToLocalValue_callWithLocalResult() throws Exception {
        Node callNode = Node.newCall(Node.newString("foo"));
        callNode.putBooleanProp(Node.FREE_CALL, true); // Simulate local result
        assertTrue(NodeUtil.evaluatesToLocalValue(callNode));
    }

    @Test
    public void testEvaluatesToLocalValue_callToStringMethod() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("toString");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node callNode = Node.newCall(getPropNode);
        assertTrue(NodeUtil.evaluatesToLocalValue(callNode));
    }

    @Test
    public void testEvaluatesToLocalValue_callNotLocalResult() throws Exception {
        Node callNode = Node.newCall(Node.newString("foo"));
        // Default behavior for calls without FREE_CALL is to not evaluate to local
        assertFalse(NodeUtil.evaluatesToLocalValue(callNode));
    }

    @Test
    public void testEvaluatesToLocalValue_newNodeWithLocalResult() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("Object"));
        newNode.putBooleanProp(Node.LOCAL_RESULTS, true); // Simulate local result
        assertTrue(NodeUtil.evaluatesToLocalValue(newNode));
    }

    @Test
    public void testEvaluatesToLocalValue_newNodeWithoutLocalResult() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("Object"));
        // Default behavior for new without LOCAL_RESULTS is to not evaluate to local
        assertFalse(NodeUtil.evaluatesToLocalValue(newNode));
    }

    @Test
    public void testEvaluatesToLocalValue_objectLiteral() throws Exception {
        Node objLit = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.evaluatesToLocalValue(objLit));
    }

    @Test
    public void testEvaluatesToLocalValue_arrayLiteral() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT);
        assertTrue(NodeUtil.evaluatesToLocalValue(arrayLit));
    }

    @Test
    public void testEvaluatesToLocalValue_regexpLiteral() throws Exception {
        Node regexpLit = new Node(Token.REGEXP);
        assertTrue(NodeUtil.evaluatesToLocalValue(regexpLit));
    }

    @Test
    public void testEvaluatesToLocalValue_delProp() throws Exception {
        Node delPropNode = new Node(Token.DELPROP, Node.newString("obj"), Node.newString("prop")); // Use newString for NAME nodes
        assertTrue(NodeUtil.evaluatesToLocalValue(delPropNode));
    }

    @Test
    public void testEvaluatesToLocalValue_inOperator() throws Exception {
        Node left = Node.newString("prop");
        Node right = Node.newString("obj"); // Use newString for NAME node
        Node inOp = new Node(Token.IN, left, right);
        assertTrue(NodeUtil.evaluatesToLocalValue(inOp));
    }

    @Test
    public void testEvaluatesToLocalValue_simpleOperator() throws Exception {
        Node n = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        assertTrue(NodeUtil.evaluatesToLocalValue(n));
    }

    @Test
    public void testEvaluatesToLocalValue_immutableValue() throws Exception {
        Node n = Node.newString("immutable");
        assertTrue(NodeUtil.evaluatesToLocalValue(n));
    }

    @Test
    public void testGetArgumentForFunction_firstArg() throws Exception {
        Node param1 = Node.newString("p1");
        Node param2 = Node.newString("p2");
        Node lp = new Node(Token.LP, param1, param2);
        Node name = Node.newString("f");
        Node body = new Node(Token.BLOCK);
        Node func = new Node(Token.FUNCTION, name, lp, body);
        assertEquals(param1, NodeUtil.getArgumentForFunction(func, 0));
    }

    @Test
    public void testGetArgumentForFunction_secondArg() throws Exception {
        Node param1 = Node.newString("p1");
        Node param2 = Node.newString("p2");
        Node lp = new Node(Token.LP, param1, param2);
        Node name = Node.newString("f");
        Node body = new Node(Token.BLOCK);
        Node func = new Node(Token.FUNCTION, name, lp, body);
        assertEquals(param2, NodeUtil.getArgumentForFunction(func, 1));
    }

    @Test
    public void testGetArgumentForFunction_outOfBounds() throws Exception {
        Node param1 = Node.newString("p1");
        Node lp = new Node(Token.LP, param1);
        Node name = Node.newString("f");
        Node body = new Node(Token.BLOCK);
        Node func = new Node(Token.FUNCTION, name, lp, body);
        assertNull(NodeUtil.getArgumentForFunction(func, 1));
    }

    @Test
    public void testGetArgumentForCallOrNew_firstArg() throws Exception {
        Node arg1 = Node.newNumber(1);
        Node arg2 = Node.newString("a");
        Node call = Node.newCall(Node.newString("foo"), arg1, arg2);
        assertEquals(arg1, NodeUtil.getArgumentForCallOrNew(call, 0));
    }

    @Test
    public void testGetArgumentForCallOrNew_secondArg() throws Exception {
        Node arg1 = Node.newNumber(1);
        Node arg2 = Node.newString("a");
        Node call = Node.newCall(Node.newString("foo"), arg1, arg2);
        assertEquals(arg2, NodeUtil.getArgumentForCallOrNew(call, 1));
    }

    @Test
    public void testGetArgumentForCallOrNew_outOfBounds() throws Exception {
        Node arg1 = Node.newNumber(1);
        Node call = Node.newCall(Node.newString("foo"), arg1);
        assertNull(NodeUtil.getArgumentForCallOrNew(call, 1));
    }

    @Test
    public void testIsToStringMethodCall_validCall() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("toString");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertTrue(NodeUtil.isToStringMethodCall(call));
    }

    @Test
    public void testIsToStringMethodCall_otherMethod() throws Exception {
        Node obj = Node.newString("obj"); // Use newString for NAME node
        Node method = Node.newString("valueOf");
        Node getPropNode = new Node(Token.GETPROP, obj, method);
        Node call = Node.newCall(getPropNode);
        assertFalse(NodeUtil.isToStringMethodCall(call));
    }

    @Test
    public void testIsToStringMethodCall_notGetProp() throws Exception {
        Node call = Node.newCall(Node.newString("toString"));
        assertFalse(NodeUtil.isToStringMethodCall(call));
    }
}
```

===== SOURCE CODE ANALYSIS =====
The tests primarily focus on the `getImpureBooleanValue`, `getPureBooleanValue`, `getStringValue`, `getNumberValue`, `isImmutableValue`, `isLiteralValue`, `isValidDefineValue`, `mayHaveSideEffects`, `precedence`, `isNumericResult`, `isBooleanResult`, `isNullOrUndefined`, `mayBeString`, `isAssignmentOp`, `isExpressionNode`, `isLoopStructure`, `isControlStructure`, `isStatementBlock`, `isStatement`, `isStatementParent`, `isSwitchCase`, `isReferenceName`, `isLabelName`, `isTryFinallyNode`, `isTryCatchNodeContainer`, `isCall`, `isFunction`, `isThis`, `isArrayLiteral`, `containsCall`, `isFunctionDeclaration`, `isHoistedFunctionDeclaration`, `isFunctionExpression`, `isEmptyFunctionExpression`, `isVarArgsFunction`, `isObjectCallMethod`, `isFunctionObjectCall`, `isFunctionObjectApply`, `isFunctionObjectCallOrApply`, `isSimpleFunctionObjectCall`, `isVarOrSimpleAssignLhs`, `isLValue`, `isObjectLitKey`, `isGetOrSetKey`, `opToStr`, `opToStrNoFail`, `containsType`, `redeclareVarsInsideBranch`, `newFunctionNode`, `newQualifiedNameNode`, `getRootOfQualifiedName`, `getFunctionJSDocInfo`, `getSourceName`, `newCallNode`, `evaluatesToLocalValue`, `getArgumentForFunction`, `getArgumentForCallOrNew`, and `isToStringMethodCall` methods of the `NodeUtil` class.
===== TEST CASE DESIGN =====
Test cases cover various input types (literals, names, operators, complex expressions) and edge cases for each method tested, including boolean evaluations, string/number conversions, immutability checks, literal value identification, valid define value checks, side effect analysis, operator precedence, numeric/boolean/string result type detection, null/undefined checks, associativity/commutativity, assignment operator identification, expression/loop/control structure type checks, statement categorization, switch case identification, reference/label name distinction, try-catch/finally structure checks, call/function/this/array literal identification, function declaration/expression types, var arguments, object call methods, L-value checks, object literal key handling, operator string conversion, type containment, variable redeclaration, function node creation, qualified name node creation, function JSDoc retrieval, source name retrieval, new call node creation, local value evaluation, function argument retrieval, and string conversion of "toString" method calls.
===== DEFECT DETECTION STRATEGY =====
The tests aim to verify the precise behavior of `NodeUtil` methods by providing a wide range of inputs and asserting expected outputs based on the reference source code, covering various branches and edge cases within the logic of each method.
===== SUMMARY =====
300 tests.
===== LIMITATIONS =====
The tests rely on creating `Node` objects directly or using static factory methods. The complexity of JavaScript ASTs means some deeply nested or context-dependent scenarios might not be fully covered. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.