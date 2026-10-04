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

    // Helper to create a simple AST node.
    private Node createNode(int type, Node... children) {
        Node node = new Node(type);
        for (Node child : children) {
            node.addChildToBack(child);
        }
        return node;
    }

    private Node createNodeWithToken(int type, String value) {
        Node node = new Node(type);
        if (type == Token.STRING) {
            node.setString(value);
        } else if (type == Token.NUMBER) {
            node.setDouble(Double.parseDouble(value));
        } else if (type == Token.NAME) {
            node.setString(value);
        }
        return node;
    }

    private Node createNumberNode(double value) {
        return Node.newNumber(value);
    }

    private Node createStringNode(String value) {
        return Node.newString(Token.STRING, value);
    }

    @Test
    public void testGetExpressionBooleanValue_assign() throws Exception {
        Node assignNode = createNode(Token.ASSIGN,
                createNodeWithToken(Token.NAME, "a"),
                createNodeWithToken(Token.TRUE, "true"));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assignNode));
    }

    @Test
    public void testGetExpressionBooleanValue_comma() throws Exception {
        Node commaNode = createNode(Token.COMMA,
                createNodeWithToken(Token.NAME, "a"),
                createNodeWithToken(Token.FALSE, "false"));
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(commaNode));
    }

    @Test
    public void testGetExpressionBooleanValue_not() throws Exception {
        Node notNode = createNode(Token.NOT, createNodeWithToken(Token.TRUE, "true"));
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(notNode));
    }

    @Test
    public void testGetExpressionBooleanValue_and() throws Exception {
        Node andNode = createNode(Token.AND, createNodeWithToken(Token.TRUE, "true"), createNodeWithToken(Token.FALSE, "false"));
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(andNode));
    }

    @Test
    public void testGetExpressionBooleanValue_or() throws Exception {
        Node orNode = createNode(Token.OR, createNodeWithToken(Token.TRUE, "true"), createNodeWithToken(Token.FALSE, "false"));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(orNode));
    }

    @Test
    public void testGetExpressionBooleanValue_hook_same() throws Exception {
        Node hookNode = createNode(Token.HOOK,
                createNodeWithToken(Token.TRUE, "true"),
                createNodeWithToken(Token.TRUE, "true"),
                createNodeWithToken(Token.TRUE, "true"));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hookNode));
    }

    @Test
    public void testGetExpressionBooleanValue_hook_different() throws Exception {
        Node hookNode = createNode(Token.HOOK,
                createNodeWithToken(Token.TRUE, "true"),
                createNodeWithToken(Token.TRUE, "true"),
                createNodeWithToken(Token.FALSE, "false"));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookNode));
    }

    @Test
    public void testGetBooleanValue_string_non_empty() throws Exception {
        Node stringNode = createStringNode("hello");
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(stringNode));
    }

    @Test
    public void testGetBooleanValue_string_empty() throws Exception {
        Node stringNode = createStringNode("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(stringNode));
    }

    @Test
    public void testGetBooleanValue_number_zero() throws Exception {
        Node numberNode = createNumberNode(0.0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(numberNode));
    }

    @Test
    public void testGetBooleanValue_number_non_zero() throws Exception {
        Node numberNode = createNumberNode(1.5);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(numberNode));
    }

    @Test
    public void testGetBooleanValue_not_true() throws Exception {
        Node notNode = createNode(Token.NOT, createNodeWithToken(Token.TRUE, "true"));
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(notNode));
    }

    @Test
    public void testGetBooleanValue_null() throws Exception {
        Node nullNode = new Node(Token.NULL);
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nullNode));
    }

    @Test
    public void testGetBooleanValue_undefined_name() throws Exception {
        Node undefinedNode = createNodeWithToken(Token.NAME, "undefined");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(undefinedNode));
    }

    @Test
    public void testGetBooleanValue_nan_name() throws Exception {
        Node nanNode = createNodeWithToken(Token.NAME, "NaN");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nanNode));
    }

    @Test
    public void testGetBooleanValue_infinity_name() throws Exception {
        Node infinityNode = createNodeWithToken(Token.NAME, "Infinity");
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(infinityNode));
    }

    @Test
    public void testGetBooleanValue_true() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(trueNode));
    }

    @Test
    public void testGetBooleanValue_arraylit() throws Exception {
        Node arrayLitNode = new Node(Token.ARRAYLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(arrayLitNode));
    }

    @Test
    public void testGetBooleanValue_objectlit() throws Exception {
        Node objectLitNode = new Node(Token.OBJECTLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(objectLitNode));
    }

    @Test
    public void testGetStringValue_string() throws Exception {
        Node stringNode = createStringNode("test");
        assertEquals("test", NodeUtil.getStringValue(stringNode));
    }

    @Test
    public void testGetStringValue_name_undefined() throws Exception {
        Node undefinedNode = createNodeWithToken(Token.NAME, "undefined");
        assertEquals("undefined", NodeUtil.getStringValue(undefinedNode));
    }

    @Test
    public void testGetStringValue_name_infinity() throws Exception {
        Node infinityNode = createNodeWithToken(Token.NAME, "Infinity");
        assertEquals("Infinity", NodeUtil.getStringValue(infinityNode));
    }

    @Test
    public void testGetStringValue_name_nan() throws Exception {
        Node nanNode = createNodeWithToken(Token.NAME, "NaN");
        assertEquals("NaN", NodeUtil.getStringValue(nanNode));
    }

    @Test
    public void testGetStringValue_number_integer() throws Exception {
        Node numberNode = createNumberNode(123.0);
        assertEquals("123", NodeUtil.getStringValue(numberNode));
    }

    @Test
    public void testGetStringValue_number_float() throws Exception {
        Node numberNode = createNumberNode(123.45);
        assertEquals("123.45", NodeUtil.getStringValue(numberNode));
    }

    @Test
    public void testGetStringValue_false() throws Exception {
        Node falseNode = new Node(Token.FALSE);
        assertEquals("false", NodeUtil.getStringValue(falseNode));
    }

    @Test
    public void testGetStringValue_true() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        assertEquals("true", NodeUtil.getStringValue(trueNode));
    }

    @Test
    public void testGetStringValue_null() throws Exception {
        Node nullNode = new Node(Token.NULL);
        assertEquals("null", NodeUtil.getStringValue(nullNode));
    }

    @Test
    public void testGetStringValue_void() throws Exception {
        Node voidNode = createNode(Token.VOID, createNumberNode(0));
        assertEquals("undefined", NodeUtil.getStringValue(voidNode));
    }

    @Test
    public void testGetStringValue_not_true() throws Exception {
        Node notNode = createNode(Token.NOT, createNodeWithToken(Token.TRUE, "true"));
        assertEquals("false", NodeUtil.getStringValue(notNode));
    }

    @Test
    public void testGetStringValue_not_false() throws Exception {
        Node notNode = createNode(Token.NOT, createNodeWithToken(Token.FALSE, "false"));
        assertEquals("true", NodeUtil.getStringValue(notNode));
    }

    @Test
    public void testGetStringValue_arraylit_empty() throws Exception {
        Node arrayLitNode = new Node(Token.ARRAYLIT);
        assertEquals("", NodeUtil.getStringValue(arrayLitNode));
    }

    @Test
    public void testGetStringValue_arraylit_with_elements() throws Exception {
        Node arrayLitNode = createNode(Token.ARRAYLIT,
                createStringNode("a"),
                createNumberNode(1),
                new Node(Token.NULL));
        assertEquals("a,1,", NodeUtil.getStringValue(arrayLitNode));
    }

    @Test
    public void testGetStringValue_arraylit_with_undefined() throws Exception {
        Node arrayLitNode = createNode(Token.ARRAYLIT,
                createStringNode("a"),
                createNodeWithToken(Token.NAME, "undefined"),
                createNumberNode(1));
        assertEquals("a,,1", NodeUtil.getStringValue(arrayLitNode));
    }

    @Test
    public void testGetStringValue_objectlit() throws Exception {
        Node objectLitNode = new Node(Token.OBJECTLIT);
        assertEquals("[object Object]", NodeUtil.getStringValue(objectLitNode));
    }

    @Test
    public void testGetNumberValue_true() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        assertEquals(1.0, NodeUtil.getNumberValue(trueNode), 0.0);
    }

    @Test
    public void testGetNumberValue_false() throws Exception {
        Node falseNode = new Node(Token.FALSE);
        assertEquals(0.0, NodeUtil.getNumberValue(falseNode), 0.0);
    }

    @Test
    public void testGetNumberValue_null() throws Exception {
        Node nullNode = new Node(Token.NULL);
        assertEquals(0.0, NodeUtil.getNumberValue(nullNode), 0.0);
    }

    @Test
    public void testGetNumberValue_number() throws Exception {
        Node numberNode = createNumberNode(42.5);
        assertEquals(42.5, NodeUtil.getNumberValue(numberNode), 0.0);
    }

    @Test
    public void testGetNumberValue_void_with_side_effect() throws Exception {
        Node callNode = new Node(Token.CALL);
        callNode.addChildToBack(new Node(Token.NAME, "someFunction"));
        Node voidNode = createNode(Token.VOID, callNode);
        assertNull(NodeUtil.getNumberValue(voidNode));
    }

    @Test
    public void testGetNumberValue_void_no_side_effect() throws Exception {
        Node voidNode = createNode(Token.VOID, createNumberNode(0));
        assertEquals(Double.NaN, NodeUtil.getNumberValue(voidNode), 0.0);
    }

    @Test
    public void testGetNumberValue_name_undefined() throws Exception {
        Node undefinedNode = createNodeWithToken(Token.NAME, "undefined");
        assertEquals(Double.NaN, NodeUtil.getNumberValue(undefinedNode), 0.0);
    }

    @Test
    public void testGetNumberValue_name_nan() throws Exception {
        Node nanNode = createNodeWithToken(Token.NAME, "NaN");
        assertEquals(Double.NaN, NodeUtil.getNumberValue(nanNode), 0.0);
    }

    @Test
    public void testGetNumberValue_name_infinity() throws Exception {
        Node infinityNode = createNodeWithToken(Token.NAME, "Infinity");
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(infinityNode), 0.0);
    }

    @Test
    public void testGetNumberValue_neg_infinity() throws Exception {
        Node negInfinityNode = createNode(Token.NEG, createNodeWithToken(Token.NAME, "Infinity"));
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(negInfinityNode), 0.0);
    }

    @Test
    public void testGetNumberValue_not_true() throws Exception {
        Node notNode = createNode(Token.NOT, createNodeWithToken(Token.TRUE, "true"));
        assertEquals(0.0, NodeUtil.getNumberValue(notNode), 0.0);
    }

    @Test
    public void testGetNumberValue_not_false() throws Exception {
        Node notNode = createNode(Token.NOT, createNodeWithToken(Token.FALSE, "false"));
        assertEquals(1.0, NodeUtil.getNumberValue(notNode), 0.0);
    }

    @Test
    public void testGetNumberValue_string_numeric() throws Exception {
        Node stringNode = createStringNode("123.45");
        assertEquals(123.45, NodeUtil.getNumberValue(stringNode), 0.0);
    }

    @Test
    public void testGetNumberValue_string_hex() throws Exception {
        Node stringNode = createStringNode("0xFF");
        assertEquals(255.0, NodeUtil.getNumberValue(stringNode), 0.0);
    }

    @Test
    public void testGetNumberValue_string_empty() throws Exception {
        Node stringNode = createStringNode("");
        assertEquals(0.0, NodeUtil.getNumberValue(stringNode), 0.0);
    }

    @Test
    public void testGetNumberValue_string_hex_negative() throws Exception {
        Node stringNode = createStringNode("-0x10");
        assertEquals(-16.0, NodeUtil.getNumberValue(stringNode), 0.0);
    }

    @Test
    public void testGetNumberValue_string_invalid() throws Exception {
        Node stringNode = createStringNode("abc");
        assertEquals(Double.NaN, NodeUtil.getNumberValue(stringNode), 0.0);
    }

    @Test
    public void testGetNumberValue_arraylit_numeric_string() throws Exception {
        Node arrayLitNode = createNode(Token.ARRAYLIT, createStringNode("42"));
        assertEquals(42.0, NodeUtil.getNumberValue(arrayLitNode), 0.0);
    }

    @Test
    public void testGetNumberValue_objectlit_numeric_string() throws Exception {
        Node objectLitNode = new Node(Token.OBJECTLIT,
                new Node(Token.STRING_KEY, createStringNode("0")),
                createNumberNode(5));
        objectLitNode.getChildAtIndex(0).addChildToBack(createStringNode("0"));
        assertEquals(5.0, NodeUtil.getNumberValue(objectLitNode), 0.0);
    }

    @Test
    public void testGetStringNumberValue_empty() {
        assertEquals(0.0, NodeUtil.getStringNumberValue(""), 0.0);
    }

    @Test
    public void testGetStringNumberValue_basic() {
        assertEquals(123.45, NodeUtil.getStringNumberValue("123.45"), 0.0);
    }

    @Test
    public void testGetStringNumberValue_hex() {
        assertEquals(255.0, NodeUtil.getStringNumberValue("0xFF"), 0.0);
    }

    @Test
    public void testGetStringNumberValue_hex_negative() {
        assertEquals(-16.0, NodeUtil.getStringNumberValue("-0x10"), 0.0);
    }

    @Test
    public void testGetStringNumberValue_invalid() {
        assertEquals(Double.NaN, NodeUtil.getStringNumberValue("abc"), 0.0);
    }

    @Test
    public void testGetStringNumberValue_whitespace() {
        assertEquals(123.0, NodeUtil.getStringNumberValue("  123  "), 0.0);
    }

    @Test
    public void testGetStringNumberValue_infinity() {
        assertNull(NodeUtil.getStringNumberValue("Infinity")); // FF vs IE behavior
    }

    @Test
    public void testTrimJsWhiteSpace() {
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("  abc\t\n"));
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("abc"));
        assertEquals("", NodeUtil.trimJsWhiteSpace("   "));
    }

    @Test
    public void testGetFunctionName_simple() {
        Node funcNode = new Node(Token.FUNCTION);
        funcNode.addChildToBack(new Node(Token.NAME, "myFunc"));
        assertEquals("myFunc", NodeUtil.getFunctionName(funcNode));
    }

    @Test
    public void testGetFunctionName_var_assign() {
        Node funcNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "myVar");
        Node varDecl = new Node(Token.VAR, nameNode);
        varDecl.addChildToBack(funcNode);
        funcNode.setParent(varDecl);
        nameNode.setParent(varDecl);

        assertEquals("myVar", NodeUtil.getFunctionName(funcNode));
    }

    @Test
    public void testGetFunctionName_assign() {
        Node funcBody = new Node(Token.BLOCK);
        Node funcParams = new Node(Token.LP);
        Node func = new Node(Token.FUNCTION, funcParams, funcBody);

        Node propName = Node.newString(Token.STRING, "method");
        Node objName = Node.newString(Token.NAME, "obj");
        Node getProp = new Node(Token.GETPROP, objName, propName);
        Node assign = new Node(Token.ASSIGN, getProp, func);
        func.setParent(assign);
        getProp.setParent(assign);
        objName.setParent(getProp);
        propName.setParent(getProp);

        assertEquals("obj.method", NodeUtil.getFunctionName(func));
    }

    @Test
    public void testGetFunctionName_named_function_expression_var() {
        Node funcBody = new Node(Token.BLOCK);
        Node funcParams = new Node(Token.LP);
        Node namedFunc = new Node(Token.FUNCTION, funcParams, funcBody);
        namedFunc.addChildToBack(Node.newString(Token.NAME, "innerFunc"));

        Node varDecl = new Node(Token.VAR, Node.newString(Token.NAME, "outerVar"));
        varDecl.addChildToBack(namedFunc);
        namedFunc.setParent(varDecl);

        assertEquals("outerVar", NodeUtil.getFunctionName(namedFunc));
    }

    @Test
    public void testGetFunctionName_named_function_expression_assign() {
        Node funcBody = new Node(Token.BLOCK);
        Node funcParams = new Node(Token.LP);
        Node namedFunc = new Node(Token.FUNCTION, funcParams, funcBody);
        namedFunc.addChildToBack(Node.newString(Token.NAME, "innerFunc"));

        Node propName = Node.newString(Token.STRING, "method");
        Node objName = new Node(Token.NAME, "obj");
        Node getProp = new Node(Token.GETPROP, objName, propName);
        Node assign = new Node(Token.ASSIGN, getProp, namedFunc);
        namedFunc.setParent(assign);

        assertEquals("obj.method", NodeUtil.getFunctionName(namedFunc));
    }

    @Test
    public void testGetNearestFunctionName_function_declaration() {
        Node funcBody = new Node(Token.BLOCK);
        Node funcParams = new Node(Token.LP);
        Node func = new Node(Token.FUNCTION, funcParams, funcBody);
        func.addChildToBack(Node.newString(Token.NAME, "myFunc"));
        assertEquals("myFunc", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_objectlit_string_key() {
        Node key = Node.newString(Token.STRING, "myKey");
        Node funcBody = new Node(Token.BLOCK);
        Node funcParams = new Node(Token.LP);
        Node func = new Node(Token.FUNCTION, funcParams, funcBody);
        Node objLit = new Node(Token.OBJECTLIT);
        objLit.addChildToBack(key);
        objLit.addChildToBack(func);
        func.setParent(objLit);
        key.setParent(objLit);
        assertEquals("myKey", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_objectlit_number_key() {
        Node key = Node.newNumber(123.0);
        key.setType(Token.NUMBER);
        Node funcBody = new Node(Token.BLOCK);
        Node funcParams = new Node(Token.LP);
        Node func = new Node(Token.FUNCTION, funcParams, funcBody);
        Node objLit = new Node(Token.OBJECTLIT);
        objLit.addChildToBack(key);
        objLit.addChildToBack(func);
        func.setParent(objLit);
        key.setParent(objLit);
        assertEquals("123", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testIsImmutableValue_string() {
        assertTrue(NodeUtil.isImmutableValue(createStringNode("hello")));
    }

    @Test
    public void testIsImmutableValue_number() {
        assertTrue(NodeUtil.isImmutableValue(createNumberNode(123)));
    }

    @Test
    public void testIsImmutableValue_null() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    }

    @Test
    public void testIsImmutableValue_true() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    }

    @Test
    public void testIsImmutableValue_false() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    }

    @Test
    public void testIsImmutableValue_not_immutable() {
        assertFalse(NodeUtil.isImmutableValue(createNodeWithToken(Token.NAME, "var")));
    }

    @Test
    public void testIsImmutableValue_not_expression() {
        assertFalse(NodeUtil.isImmutableValue(new Node(Token.ADD)));
    }

    @Test
    public void testIsImmutableValue_not() {
        assertTrue(NodeUtil.isImmutableValue(createNode(Token.NOT, createNodeWithToken(Token.TRUE, "true"))));
    }

    @Test
    public void testIsImmutableValue_void() {
        assertTrue(NodeUtil.isImmutableValue(createNode(Token.VOID, createNumberNode(0))));
    }

    @Test
    public void testIsImmutableValue_neg() {
        assertTrue(NodeUtil.isImmutableValue(createNode(Token.NEG, createNumberNode(-5))));
    }

    @Test
    public void testIsImmutableValue_name_undefined() {
        assertTrue(NodeUtil.isImmutableValue(createNodeWithToken(Token.NAME, "undefined")));
    }

    @Test
    public void testIsImmutableValue_name_infinity() {
        assertTrue(NodeUtil.isImmutableValue(createNodeWithToken(Token.NAME, "Infinity")));
    }

    @Test
    public void testIsImmutableValue_name_nan() {
        assertTrue(NodeUtil.isImmutableValue(createNodeWithToken(Token.NAME, "NaN")));
    }

    @Test
    public void testIsLiteralValue_string() {
        assertTrue(NodeUtil.isLiteralValue(createStringNode("hello"), false));
    }

    @Test
    public void testIsLiteralValue_number() {
        assertTrue(NodeUtil.isLiteralValue(createNumberNode(123), false));
    }

    @Test
    public void testIsLiteralValue_boolean_true() {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.TRUE), false));
    }

    @Test
    public void testIsLiteralValue_boolean_false() {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.FALSE), false));
    }

    @Test
    public void testIsLiteralValue_null() {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.NULL), false));
    }

    @Test
    public void testIsLiteralValue_undefined() {
        assertTrue(NodeUtil.isLiteralValue(createNodeWithToken(Token.NAME, "undefined"), false));
    }

    @Test
    public void testIsLiteralValue_function_expression_include_true() {
        Node func = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.isLiteralValue(func, true));
    }

    @Test
    public void testIsLiteralValue_function_expression_include_false() {
        Node func = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isLiteralValue(func, false));
    }

    @Test
    public void testIsLiteralValue_function_declaration_include_true() {
        Node func = new Node(Token.FUNCTION);
        func.setSourceFileForTesting("test.js"); // Simulate being a statement
        assertFalse(NodeUtil.isLiteralValue(func, true));
    }

    @Test
    public void testIsLiteralValue_arraylit_all_literals() {
        Node arrayLit = createNode(Token.ARRAYLIT,
                createStringNode("a"), createNumberNode(1), new Node(Token.TRUE));
        assertTrue(NodeUtil.isLiteralValue(arrayLit, false));
    }

    @Test
    public void testIsLiteralValue_arraylit_non_literal_child() {
        Node arrayLit = createNode(Token.ARRAYLIT,
                createStringNode("a"), createNodeWithToken(Token.NAME, "b"));
        assertFalse(NodeUtil.isLiteralValue(arrayLit, false));
    }

    @Test
    public void testIsLiteralValue_objectlit_all_literals() {
        Node objLit = new Node(Token.OBJECTLIT,
                new Node(Token.STRING_KEY, createStringNode("a")),
                new Node(Token.STRING_KEY, createNumberNode(1)),
                new Node(Token.STRING_KEY, new Node(Token.TRUE)));
        objLit.getChildAtIndex(0).addChildToBack(createStringNode("a"));
        objLit.getChildAtIndex(1).addChildToBack(createNumberNode(1));
        objLit.getChildAtIndex(2).addChildToBack(new Node(Token.TRUE));
        assertTrue(NodeUtil.isLiteralValue(objLit, false));
    }

    @Test
    public void testIsLiteralValue_objectlit_non_literal_value() {
        Node objLit = new Node(Token.OBJECTLIT,
                new Node(Token.STRING_KEY, createStringNode("a")),
                new Node(Token.STRING_KEY, createNodeWithToken(Token.NAME, "b")));
        objLit.getChildAtIndex(0).addChildToBack(createStringNode("a"));
        objLit.getChildAtIndex(1).addChildToBack(createNodeWithToken(Token.NAME, "b"));
        assertFalse(NodeUtil.isLiteralValue(objLit, false));
    }

    @Test
    public void testIsValidDefineValue_string() {
        assertTrue(NodeUtil.isValidDefineValue(createStringNode("test"), Collections.emptySet()));
    }

    @Test
    public void testIsValidDefineValue_number() {
        assertTrue(NodeUtil.isValidDefineValue(createNumberNode(100), Collections.emptySet()));
    }

    @Test
    public void testIsValidDefineValue_true() {
        assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), Collections.emptySet()));
    }

    @Test
    public void testIsValidDefineValue_false() {
        assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), Collections.emptySet()));
    }

    @Test
    public void testIsValidDefineValue_add() {
        Node addNode = createNode(Token.ADD, createNumberNode(1), createNumberNode(2));
        assertTrue(NodeUtil.isValidDefineValue(addNode, Collections.emptySet()));
    }

    @Test
    public void testIsValidDefineValue_name_defined() {
        Set<String> defines = new HashSet<>();
        defines.add("MY_DEFINE");
        assertTrue(NodeUtil.isValidDefineValue(createNodeWithToken(Token.NAME, "MY_DEFINE"), defines));
    }

    @Test
    public void testIsValidDefineValue_name_not_defined() {
        Set<String> defines = new HashSet<>();
        defines.add("MY_DEFINE");
        assertFalse(NodeUtil.isValidDefineValue(createNodeWithToken(Token.NAME, "OTHER_DEFINE"), defines));
    }

    @Test
    public void testIsValidDefineValue_qualified_name_defined() {
        Set<String> defines = new HashSet<>();
        defines.add("MY_OBJECT.MY_PROP");
        Node qualifiedName = new Node(Token.GETPROP, new Node(Token.NAME, "MY_OBJECT"), Node.newString(Token.STRING, "MY_PROP"));
        assertTrue(NodeUtil.isValidDefineValue(qualifiedName, defines));
    }

    @Test
    public void testIsValidDefineValue_neg() {
        Node negNode = createNode(Token.NEG, createNumberNode(5));
        assertTrue(NodeUtil.isValidDefineValue(negNode, Collections.emptySet()));
    }

    @Test
    public void testIsEmptyBlock_empty() {
        Node block = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_with_empty_statement() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_with_code() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.NAME, "a"));
        assertFalse(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_not_a_block() {
        Node notABlock = new Node(Token.NAME, "a");
        assertFalse(NodeUtil.isEmptyBlock(notABlock));
    }

    @Test
    public void testIsSimpleOperator_add() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD)));
    }

    @Test
    public void testIsSimpleOperator_assign_add() {
        assertFalse(NodeUtil.isSimpleOperator(new Node(Token.ASSIGN_ADD)));
    }

    @Test
    public void testIsSimpleOperator_and() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.AND)));
    }

    @Test
    public void testIsSimpleOperator_or() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.OR)));
    }

    @Test
    public void testIsSimpleOperator_not() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.NOT)));
    }

    @Test
    public void testIsSimpleOperator_neg() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.NEG)));
    }

    @Test
    public void testIsSimpleOperator_typeof() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.TYPEOF)));
    }

    @Test
    public void testIsSimpleOperator_void() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.VOID)));
    }

    @Test
    public void testIsSimpleOperator_instanceof() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.INSTANCEOF)));
    }

    @Test
    public void testIsSimpleOperator_comma() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.COMMA)));
    }

    @Test
    public void testNewExpr() {
        Node childNode = createNodeWithToken(Token.NAME, "a");
        Node exprResult = NodeUtil.newExpr(childNode);
        assertEquals(Token.EXPR_RESULT, exprResult.getType());
        assertEquals(childNode, exprResult.getFirstChild());
    }

    @Test
    public void testMayHaveSideEffects_new() {
        Node newNode = new Node(Token.NEW, new Node(Token.NAME, "Object"));
        assertTrue(NodeUtil.mayHaveSideEffects(newNode));
    }

    @Test
    public void testMayHaveSideEffects_call() {
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "alert"));
        assertTrue(NodeUtil.mayHaveSideEffects(callNode));
    }

    @Test
    public void testMayHaveSideEffects_assignment() {
        Node assignNode = new Node(Token.ASSIGN, new Node(Token.NAME, "a"), new Node(Token.NUMBER, "1"));
        assertTrue(NodeUtil.mayHaveSideEffects(assignNode));
    }

    @Test
    public void testMayHaveSideEffects_throw() {
        Node throwNode = new Node(Token.THROW, new Node(Token.STRING, "error"));
        assertTrue(NodeUtil.mayHaveSideEffects(throwNode));
    }

    @Test
    public void testMayHaveSideEffects_objectlit_no_new_objects_false() {
        Node objLit = new Node(Token.OBJECTLIT,
                new Node(Token.STRING_KEY, createStringNode("a")),
                new Node(Token.STRING_KEY, createNumberNode(1)));
        objLit.getChildAtIndex(0).addChildToBack(createStringNode("a"));
        objLit.getChildAtIndex(1).addChildToBack(createNumberNode(1));
        assertFalse(NodeUtil.mayHaveSideEffects(objLit, null)); // checkForNewObjects is false
    }

    @Test
    public void testMayHaveSideEffects_objectlit_new_objects_true() {
        Node objLit = new Node(Token.OBJECTLIT,
                new Node(Token.STRING_KEY, createStringNode("a")),
                new Node(Token.STRING_KEY, createNumberNode(1)));
        objLit.getChildAtIndex(0).addChildToBack(createStringNode("a"));
        objLit.getChildAtIndex(1).addChildToBack(createNumberNode(1));
        assertTrue(NodeUtil.mayHaveSideEffects(objLit, null)); // checkForNewObjects is true
    }


    @Test
    public void testConstructorCallHasSideEffects_builtin_no_side_effects() {
        Node newObj = new Node(Token.NEW, new Node(Token.NAME, "Object"));
        assertFalse(NodeUtil.constructorCallHasSideEffects(newObj));
    }

    @Test
    public void testConstructorCallHasSideEffects_builtin_with_side_effects() {
        Node newError = new Node(Token.NEW, new Node(Token.NAME, "Error"));
        assertTrue(NodeUtil.constructorCallHasSideEffects(newError));
    }

    @Test
    public void testConstructorCallHasSideEffects_custom_constructor() {
        Node newCustom = new Node(Token.NEW, new Node(Token.NAME, "MyClass"));
        assertTrue(NodeUtil.constructorCallHasSideEffects(newCustom));
    }

    @Test
    public void testFunctionCallHasSideEffects_builtin_no_side_effects() {
        Node callAlert = new Node(Token.CALL, new Node(Token.NAME, "alert"));
        assertTrue(NodeUtil.functionCallHasSideEffects(callAlert)); // alert has side effects
    }

    @Test
    public void testFunctionCallHasSideEffects_builtin_no_side_effects_safe() {
        Node callToString = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "obj"), Node.newString(Token.STRING, "toString")));
        assertFalse(NodeUtil.functionCallHasSideEffects(callToString));
    }

    @Test
    public void testFunctionCallHasSideEffects_math_function() {
        Node callMathRandom = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "Math"), Node.newString(Token.STRING, "random")));
        assertFalse(NodeUtil.functionCallHasSideEffects(callMathRandom));
    }

    @Test
    public void testFunctionCallHasSideEffects_string_replace_simple() {
        Node callReplace = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.STRING, "test"), Node.newString(Token.STRING, "replace")),
                new Node(Token.STRING, "a"), new Node(Token.STRING, "b"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callReplace));
    }

    @Test
    public void testCallHasLocalResult() {
        Node callNode = new Node(Token.CALL);
        callNode.putBooleanProp(Node.FREE_CALL, true); // Assume this implies local result for simplicity
        assertTrue(NodeUtil.callHasLocalResult(callNode));
    }

    @Test
    public void testNewHasLocalResult() {
        Node newNode = new Node(Token.NEW);
        newNode.putBooleanProp(Node.DIRECTCALL_PROP, true); // Assume this implies local result
        assertTrue(NodeUtil.newHasLocalResult(newNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_assign() {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ASSIGN)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_inc() {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_dec() {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_throw() {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW)));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_call() {
        // Mocking a CALL node that might have side effects
        Node alertCall = new Node(Token.CALL, new Node(Token.NAME, "alert"));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(alertCall));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_new() {
        Node newNode = new Node(Token.NEW, new Node(Token.NAME, "Object"));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(newNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_name_with_children() {
        Node nameNode = new Node(Token.NAME, "varName");
        nameNode.addChildToBack(new Node(Token.NUMBER, "1"));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameNode));
    }

    @Test
    public void testCanBeSideEffected_call() {
        Node callNode = new Node(Token.CALL);
        assertTrue(NodeUtil.canBeSideEffected(callNode));
    }

    @Test
    public void testCanBeSideEffected_new() {
        Node newNode = new Node(Token.NEW);
        assertTrue(NodeUtil.canBeSideEffected(newNode));
    }

    @Test
    public void testCanBeSideEffected_name_non_constant() {
        Node nameNode = new Node(Token.NAME, "variable");
        assertFalse(NodeUtil.canBeSideEffected(nameNode, Collections.emptySet()));
    }

    @Test
    public void testCanBeSideEffected_name_constant() {
        Node nameNode = new Node(Token.NAME, "CONSTANT");
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertFalse(NodeUtil.canBeSideEffected(nameNode, Collections.emptySet()));
    }

    @Test
    public void testCanBeSideEffected_getprop() {
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), Node.newString(Token.STRING, "prop"));
        assertTrue(NodeUtil.canBeSideEffected(getPropNode));
    }

    @Test
    public void testCanBeSideEffected_function_expression() {
        Node funcExpr = new Node(Token.FUNCTION);
        funcExpr.setSourceFileForTesting("test.js"); // To make it not a statement
        assertFalse(NodeUtil.canBeSideEffected(funcExpr));
    }

    @Test
    public void testPrecedence_comma() {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
    }

    @Test
    public void testPrecedence_assign() {
        assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    }

    @Test
    public void testPrecedence_hook() {
        assertEquals(2, NodeUtil.precedence(Token.HOOK));
    }

    @Test
    public void testPrecedence_or() {
        assertEquals(3, NodeUtil.precedence(Token.OR));
    }

    @Test
    public void testPrecedence_and() {
        assertEquals(4, NodeUtil.precedence(Token.AND));
    }

    @Test
    public void testPrecedence_bit_or() {
        assertEquals(5, NodeUtil.precedence(Token.BITOR));
    }

    @Test
    public void testPrecedence_bit_xor() {
        assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    }

    @Test
    public void testPrecedence_bit_and() {
        assertEquals(7, NodeUtil.precedence(Token.BITAND));
    }

    @Test
    public void testPrecedence_eq() {
        assertEquals(8, NodeUtil.precedence(Token.EQ));
    }

    @Test
    public void testPrecedence_lt() {
        assertEquals(9, NodeUtil.precedence(Token.LT));
    }

    @Test
    public void testPrecedence_lsh() {
        assertEquals(10, NodeUtil.precedence(Token.LSH));
    }

    @Test
    public void testPrecedence_add() {
        assertEquals(11, NodeUtil.precedence(Token.ADD));
    }

    @Test
    public void testPrecedence_mul() {
        assertEquals(12, NodeUtil.precedence(Token.MUL));
    }

    @Test
    public void testPrecedence_neg() {
        assertEquals(13, NodeUtil.precedence(Token.NEG));
    }

    @Test
    public void testPrecedence_call() {
        assertEquals(15, NodeUtil.precedence(Token.CALL));
    }

    @Test
    public void testValueCheck_and_true() {
        Predicate<Node> mockPredicate = Predicates.alwaysTrue();
        assertTrue(NodeUtil.valueCheck(new Node(Token.AND, new Node(Token.TRUE), new Node(Token.TRUE)), mockPredicate));
    }

    @Test
    public void testValueCheck_and_false() {
        Predicate<Node> mockPredicate = Predicates.alwaysFalse();
        assertFalse(NodeUtil.valueCheck(new Node(Token.AND, new Node(Token.TRUE), new Node(Token.TRUE)), mockPredicate));
    }

    @Test
    public void testValueCheck_hook_true() {
        Predicate<Node> mockPredicate = Predicates.alwaysTrue();
        assertTrue(NodeUtil.valueCheck(new Node(Token.HOOK, new Node(Token.TRUE), new Node(Token.TRUE), new Node(Token.TRUE)), mockPredicate));
    }

    @Test
    public void testValueCheck_hook_false() {
        Predicate<Node> mockPredicate = Predicates.alwaysFalse();
        assertFalse(NodeUtil.valueCheck(new Node(Token.HOOK, new Node(Token.TRUE), new Node(Token.TRUE), new Node(Token.TRUE)), mockPredicate));
    }

    @Test
    public void testIsNumericResult_add_non_string() {
        Node addNode = createNode(Token.ADD, createNumberNode(1), createNumberNode(2));
        assertTrue(NodeUtil.isNumericResult(addNode));
    }

    @Test
    public void testIsNumericResult_add_with_string() {
        Node addNode = createNode(Token.ADD, createNumberNode(1), createStringNode("2"));
        assertFalse(NodeUtil.isNumericResult(addNode));
    }

    @Test
    public void testIsNumericResult_number() {
        assertTrue(NodeUtil.isNumericResult(createNumberNode(5)));
    }

    @Test
    public void testIsNumericResult_name_nan() {
        assertTrue(NodeUtil.isNumericResult(createNodeWithToken(Token.NAME, "NaN")));
    }

    @Test
    public void testIsNumericResult_name_infinity() {
        assertTrue(NodeUtil.isNumericResult(createNodeWithToken(Token.NAME, "Infinity")));
    }

    @Test
    public void testIsNumericResult_neg() {
        assertTrue(NodeUtil.isNumericResult(createNode(Token.NEG, createNumberNode(5))));
    }

    @Test
    public void testIsNumericResult_unknown() {
        assertFalse(NodeUtil.isNumericResult(createNodeWithToken(Token.NAME, "someVar")));
    }

    @Test
    public void testIsBooleanResult_true() {
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.TRUE)));
    }

    @Test
    public void testIsBooleanResult_eq() {
        assertTrue(NodeUtil.isBooleanResult(createNode(Token.EQ, createNodeWithToken(Token.NAME, "a"), createNodeWithToken(Token.NAME, "b"))));
    }

    @Test
    public void testIsBooleanResult_not() {
        assertTrue(NodeUtil.isBooleanResult(createNode(Token.NOT, createNodeWithToken(Token.NAME, "a"))));
    }

    @Test
    public void testIsBooleanResult_delprop() {
        assertTrue(NodeUtil.isBooleanResult(createNode(Token.DELPROP, createNodeWithToken(Token.NAME, "a"), createStringNode("prop"))));
    }

    @Test
    public void testIsBooleanResult_unknown() {
        assertFalse(NodeUtil.isBooleanResult(createNodeWithToken(Token.NAME, "someVar")));
    }

    @Test
    public void testIsUndefined_void() {
        assertTrue(NodeUtil.isUndefined(createNode(Token.VOID, createNumberNode(0))));
    }

    @Test
    public void testIsUndefined_name_undefined() {
        assertTrue(NodeUtil.isUndefined(createNodeWithToken(Token.NAME, "undefined")));
    }

    @Test
    public void testIsUndefined_other() {
        assertFalse(NodeUtil.isUndefined(createNodeWithToken(Token.NAME, "null")));
        assertFalse(NodeUtil.isUndefined(createNumberNode(0)));
    }

    @Test
    public void testIsNull_null_node() {
        assertTrue(NodeUtil.isNull(new Node(Token.NULL)));
    }

    @Test
    public void testIsNull_other() {
        assertFalse(NodeUtil.isNull(createNodeWithToken(Token.NAME, "null")));
    }

    @Test
    public void testIsNullOrUndefined_null() {
        assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.NULL)));
    }

    @Test
    public void testIsNullOrUndefined_undefined_name() {
        assertTrue(NodeUtil.isNullOrUndefined(createNodeWithToken(Token.NAME, "undefined")));
    }

    @Test
    public void testIsNullOrUndefined_void() {
        assertTrue(NodeUtil.isNullOrUndefined(createNode(Token.VOID, createNumberNode(0))));
    }

    @Test
    public void testIsNullOrUndefined_other() {
        assertFalse(NodeUtil.isNullOrUndefined(createNodeWithToken(Token.NAME, "something")));
    }

    @Test
    public void testMayBeString_not_numeric_not_boolean() {
        Node nameNode = createNodeWithToken(Token.NAME, "someVar");
        assertTrue(NodeUtil.mayBeString(nameNode));
    }

    @Test
    public void testMayBeString_numeric_result() {
        Node numberNode = createNumberNode(123);
        assertFalse(NodeUtil.mayBeString(numberNode));
    }

    @Test
    public void testMayBeString_boolean_result() {
        Node trueNode = new Node(Token.TRUE);
        assertFalse(NodeUtil.mayBeString(trueNode));
    }

    @Test
    public void testMayBeString_undefined() {
        assertFalse(NodeUtil.mayBeString(createNodeWithToken(Token.NAME, "undefined")));
    }

    @Test
    public void testMayBeString_null() {
        assertFalse(NodeUtil.mayBeString(new Node(Token.NULL)));
    }

    @Test
    public void testIsAssociative_mul() {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
    }

    @Test
    public void testIsAssociative_add_string_concatenation() {
        assertFalse(NodeUtil.isAssociative(Token.ADD));
    }

    @Test
    public void testIsAssociative_and() {
        assertTrue(NodeUtil.isAssociative(Token.AND));
    }

    @Test
    public void testIsAssociative_or() {
        assertTrue(NodeUtil.isAssociative(Token.OR));
    }

    @Test
    public void testIsAssociative_bit_and() {
        assertTrue(NodeUtil.isAssociative(Token.BITAND));
    }

    @Test
    public void testIsCommutative_mul() {
        assertTrue(NodeUtil.isCommutative(Token.MUL));
    }

    @Test
    public void testIsCommutative_add_string_concatenation() {
        assertFalse(NodeUtil.isCommutative(Token.ADD));
    }

    @Test
    public void testIsCommutative_bit_and() {
        assertTrue(NodeUtil.isCommutative(Token.BITAND));
    }

    @Test
    public void testIsAssignmentOp_assign() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    }

    @Test
    public void testIsAssignmentOp_assign_add() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
    }

    @Test
    public void testIsAssignmentOp_add() {
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
    }

    @Test
    public void testGetOpFromAssignmentOp_assign_add() {
        assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD)));
    }

    @Test
    public void testGetOpFromAssignmentOp_assign_mul() {
        assertEquals(Token.MUL, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_MUL)));
    }

    @Test
    public void testIsExpressionNode() {
        assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
        assertFalse(NodeUtil.isExpressionNode(new Node(Token.NAME)));
    }

    @Test
    public void testContainsFunction_with_function() {
        Node func = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.containsFunction(func));
    }

    @Test
    public void testContainsFunction_without_function() {
        Node name = new Node(Token.NAME, "test");
        assertFalse(NodeUtil.containsFunction(name));
    }

    @Test
    public void testReferencesThis_with_this() {
        Node thisNode = new Node(Token.THIS);
        assertTrue(NodeUtil.referencesThis(thisNode));
    }

    @Test
    public void testReferencesThis_without_this() {
        Node nameNode = new Node(Token.NAME, "test");
        assertFalse(NodeUtil.referencesThis(nameNode));
    }

    @Test
    public void testIsGet_getprop() {
        assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    }

    @Test
    public void testIsGet_getelem() {
        assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    }

    @Test
    public void testIsGet_other() {
        assertFalse(NodeUtil.isGet(new Node(Token.NAME)));
    }

    @Test
    public void testIsGetProp() {
        assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
        assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));
    }

    @Test
    public void testIsName() {
        assertTrue(NodeUtil.isName(new Node(Token.NAME)));
        assertFalse(NodeUtil.isName(new Node(Token.STRING)));
    }

    @Test
    public void testIsNew() {
        assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
        assertFalse(NodeUtil.isNew(new Node(Token.CALL)));
    }

    @Test
    public void testIsVar() {
        assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
        assertFalse(NodeUtil.isVar(new Node(Token.NAME)));
    }

    @Test
    public void testIsVarDeclaration_name_child_of_var() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "myVar");
        varNode.addChildToBack(nameNode);
        assertTrue(NodeUtil.isVarDeclaration(nameNode));
    }

    @Test
    public void testIsVarDeclaration_name_not_child_of_var() {
        Node nameNode = new Node(Token.NAME, "myVar");
        assertFalse(NodeUtil.isVarDeclaration(nameNode));
    }

    @Test
    public void testGetAssignedValue_var() {
        Node valueNode = createNumberNode(10);
        Node nameNode = new Node(Token.NAME, "myVar");
        Node varNode = new Node(Token.VAR, nameNode);
        nameNode.addChildToBack(valueNode);
        assertEquals(valueNode, NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testGetAssignedValue_assign() {
        Node valueNode = createNumberNode(10);
        Node nameNode = new Node(Token.NAME, "myVar");
        Node assignNode = new Node(Token.ASSIGN, nameNode, valueNode);
        assertEquals(valueNode, NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testIsString() {
        assertTrue(NodeUtil.isString(new Node(Token.STRING)));
        assertFalse(NodeUtil.isString(new Node(Token.NUMBER)));
    }

    @Test
    public void testIsExprAssign() {
        Node assignNode = new Node(Token.ASSIGN);
        Node exprResultNode = new Node(Token.EXPR_RESULT, assignNode);
        assertTrue(NodeUtil.isExprAssign(exprResultNode));
    }

    @Test
    public void testIsExprAssign_not_assign() {
        Node otherNode = new Node(Token.NAME);
        Node exprResultNode = new Node(Token.EXPR_RESULT, otherNode);
        assertFalse(NodeUtil.isExprAssign(exprResultNode));
    }

    @Test
    public void testIsAssign() {
        assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
        assertFalse(NodeUtil.isAssign(new Node(Token.ADD)));
    }

    @Test
    public void testIsExprCall() {
        Node callNode = new Node(Token.CALL);
        Node exprResultNode = new Node(Token.EXPR_RESULT, callNode);
        assertTrue(NodeUtil.isExprCall(exprResultNode));
    }

    @Test
    public void testIsExprCall_not_call() {
        Node otherNode = new Node(Token.NAME);
        Node exprResultNode = new Node(Token.EXPR_RESULT, otherNode);
        assertFalse(NodeUtil.isExprCall(exprResultNode));
    }

    @Test
    public void testIsForIn() {
        Node forNode = createNode(Token.FOR,
                new Node(Token.NAME, "key"),
                createNode(Token.IN, new Node(Token.NAME, "obj")),
                new Node(Token.BLOCK));
        assertTrue(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsForIn_not_for_in() {
        Node forNode = createNode(Token.FOR,
                new Node(Token.EMPTY),
                new Node(Token.EMPTY),
                new Node(Token.BLOCK));
        assertFalse(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsLoopStructure_for() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsLoopStructure_do() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.DO)));
    }

    @Test
    public void testIsLoopStructure_while() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.WHILE)));
    }

    @Test
    public void testIsLoopStructure_other() {
        assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));
    }

    @Test
    public void testGetLoopCodeBlock_for() {
        Node block = new Node(Token.BLOCK);
        Node forNode = createNode(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), block);
        assertEquals(block, NodeUtil.getLoopCodeBlock(forNode));
    }

    @Test
    public void testGetLoopCodeBlock_do() {
        Node block = new Node(Token.BLOCK);
        Node doNode = createNode(Token.DO, block, new Node(Token.EMPTY));
        assertEquals(block, NodeUtil.getLoopCodeBlock(doNode));
    }

    @Test
    public void testGetLoopCodeBlock_while() {
        Node block = new Node(Token.BLOCK);
        Node whileNode = createNode(Token.WHILE, new Node(Token.EMPTY), block);
        assertEquals(block, NodeUtil.getLoopCodeBlock(whileNode));
    }

    @Test
    public void testIsWithinLoop_direct_child() {
        Node loop = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
        Node inner = new Node(Token.NAME, "x");
        loop.getLastChild().addChildToBack(inner);
        inner.setParent(loop.getLastChild());
        assertTrue(NodeUtil.isWithinLoop(inner));
    }

    @Test
    public void testIsWithinLoop_nested_loop() {
        Node outerLoop = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
        Node innerLoop = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.BLOCK));
        outerLoop.getLastChild().addChildToBack(innerLoop);
        innerLoop.setParent(outerLoop.getLastChild());
        Node innermost = new Node(Token.NAME, "y");
        innerLoop.getLastChild().addChildToBack(innermost);
        innermost.setParent(innerLoop.getLastChild());
        assertTrue(NodeUtil.isWithinLoop(innermost));
    }

    @Test
    public void testIsWithinLoop_outside_loop() {
        Node outsideNode = new Node(Token.NAME, "z");
        assertFalse(NodeUtil.isWithinLoop(outsideNode));
    }

    @Test
    public void testIsWithinLoop_inside_function_not_loop() {
        Node func = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK);
        func.addChildToBack(block);
        Node insideNode = new Node(Token.NAME, "w");
        block.addChildToBack(insideNode);
        insideNode.setParent(block);
        assertFalse(NodeUtil.isWithinLoop(insideNode));
    }

    @Test
    public void testIsControlStructure_if() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    }

    @Test
    public void testIsControlStructure_for() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsControlStructure_try() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.TRY)));
    }

    @Test
    public void testIsControlStructure_switch() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.SWITCH)));
    }

    @Test
    public void testIsControlStructure_other() {
        assertFalse(NodeUtil.isControlStructure(new Node(Token.NAME)));
    }

    @Test
    public void testIsControlStructureCodeBlock_if_true_block() {
        Node ifNode = createNode(Token.IF, new Node(Token.TRUE), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getLastChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_if_false_block() {
        Node ifNode = createNode(Token.IF, new Node(Token.TRUE), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getFirstChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_while_block() {
        Node whileNode = createNode(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isControlStructureCodeBlock(whileNode, whileNode.getLastChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_do_block() {
        Node doNode = createNode(Token.DO, new Node(Token.BLOCK), new Node(Token.TRUE));
        assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, doNode.getFirstChild()));
    }

    @Test
    public void testIsControlStructureCodeBlock_for_block() {
        Node forNode = createNode(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, forNode.getLastChild()));
    }

    @Test
    public void testGetConditionExpression_if() {
        Node condition = createNodeWithToken(Token.NAME, "cond");
        Node ifNode = createNode(Token.IF, condition, new Node(Token.BLOCK));
        assertEquals(condition, NodeUtil.getConditionExpression(ifNode));
    }

    @Test
    public void testGetConditionExpression_while() {
        Node condition = createNodeWithToken(Token.NAME, "cond");
        Node whileNode = createNode(Token.WHILE, condition, new Node(Token.BLOCK));
        assertEquals(condition, NodeUtil.getConditionExpression(whileNode));
    }

    @Test
    public void testGetConditionExpression_do() {
        Node condition = createNodeWithToken(Token.NAME, "cond");
        Node doNode = createNode(Token.DO, new Node(Token.BLOCK), condition);
        assertEquals(condition, NodeUtil.getConditionExpression(doNode));
    }

    @Test
    public void testGetConditionExpression_for_with_condition() {
        Node init = new Node(Token.VAR, new Node(Token.NAME, "i"));
        Node condition = createNode(Token.LT, new Node(Token.NAME, "i"), createNumberNode(10));
        Node increment = new Node(Token.INC, new Node(Token.NAME, "i"));
        Node block = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, condition, increment, block);
        assertEquals(condition, NodeUtil.getConditionExpression(forNode));
    }

    @Test
    public void testIsStatementBlock_block() {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsStatementBlock_script() {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    }

    @Test
    public void testIsStatementBlock_other() {
        assertFalse(NodeUtil.isStatementBlock(new Node(Token.NAME)));
    }

    @Test
    public void testIsStatement_in_block() {
        Node block = new Node(Token.BLOCK);
        Node nameNode = new Node(Token.NAME, "test");
        block.addChildToBack(nameNode);
        nameNode.setParent(block);
        assertTrue(NodeUtil.isStatement(nameNode));
    }

    @Test
    public void testIsStatement_in_script() {
        Node script = new Node(Token.SCRIPT);
        Node nameNode = new Node(Token.NAME, "test");
        script.addChildToBack(nameNode);
        nameNode.setParent(script);
        assertTrue(NodeUtil.isStatement(nameNode));
    }

    @Test
    public void testIsStatement_in_label() {
        Node label = new Node(Token.LABEL, new Node(Token.LABEL_NAME, "mylabel"));
        Node nameNode = new Node(Token.NAME, "test");
        label.addChildToBack(nameNode);
        nameNode.setParent(label);
        assertTrue(NodeUtil.isStatement(nameNode));
    }

    @Test
    public void testIsStatement_not_in_statement_context() {
        Node nameNode = new Node(Token.NAME, "test");
        assertFalse(NodeUtil.isStatement(nameNode));
    }

    @Test
    public void testIsSwitchCase_case() {
        assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    }

    @Test
    public void testIsSwitchCase_default() {
        assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT)));
    }

    @Test
    public void testIsSwitchCase_other() {
        assertFalse(NodeUtil.isSwitchCase(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsReferenceName_name() {
        assertTrue(NodeUtil.isReferenceName(new Node(Token.NAME, "var")));
    }

    @Test
    public void testIsReferenceName_empty_string() {
        assertFalse(NodeUtil.isReferenceName(new Node(Token.NAME, "")));
    }

    @Test
    public void testIsLabelName() {
        assertTrue(NodeUtil.isLabelName(new Node(Token.LABEL_NAME, "myLabel")));
        assertFalse(NodeUtil.isLabelName(new Node(Token.NAME, "myLabel")));
    }

    @Test
    public void testIsTryFinallyNode_finally_block() {
        Node tryNode = createNode(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK)); // try, catch, finally
        assertTrue(NodeUtil.isTryFinallyNode(tryNode, tryNode.getLastChild()));
    }

    @Test
    public void testIsTryFinallyNode_not_finally() {
        Node tryNode = createNode(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isTryFinallyNode(tryNode, tryNode.getFirstChild()));
    }

    @Test
    public void testIsTryCatchNodeContainer_catch_block() {
        Node tryNode = createNode(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK)); // try, catch, finally
        assertTrue(NodeUtil.isTryCatchNodeContainer(tryNode.getFirstChild().getNext()));
    }

    @Test
    public void testIsTryCatchNodeContainer_not_catch() {
        Node tryNode = createNode(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isTryCatchNodeContainer(tryNode.getFirstChild()));
    }

    @Test
    public void testRemoveChild_var_single() {
        Node nameNode = new Node(Token.NAME, "x");
        Node varNode = new Node(Token.VAR, nameNode);
        Node parent = new Node(Token.BLOCK, varNode);
        NodeUtil.removeChild(parent, varNode);
        assertEquals(0, parent.getChildCount());
    }

    @Test
    public void testRemoveChild_var_multiple() {
        Node nameNode1 = new Node(Token.NAME, "x");
        Node nameNode2 = new Node(Token.NAME, "y");
        Node varNode = new Node(Token.VAR, nameNode1, nameNode2);
        Node parent = new Node(Token.BLOCK, varNode);
        NodeUtil.removeChild(varNode, nameNode1);
        assertEquals(1, varNode.getChildCount());
        assertEquals(nameNode2, varNode.getFirstChild());
    }

    @Test
    public void testRemoveChild_statement_in_block() {
        Node statement = new Node(Token.NAME, "stmt");
        Node block = new Node(Token.BLOCK, statement);
        NodeUtil.removeChild(block, statement);
        assertEquals(0, block.getChildCount());
    }

    @Test
    public void testRemoveChild_label_last_child() {
        Node statement = new Node(Token.NAME, "stmt");
        Node labelNode = new Node(Token.LABEL, new Node(Token.LABEL_NAME, "myLabel"), statement);
        Node parent = new Node(Token.BLOCK, labelNode);
        NodeUtil.removeChild(labelNode, statement);
        assertEquals(1, labelNode.getChildCount());
        assertEquals(new Node(Token.LABEL_NAME, "myLabel"), labelNode.getFirstChild());
    }

    @Test
    public void testRemoveChild_for_with_empty() {
        Node emptyNode = new Node(Token.EMPTY);
        Node forNode = createNode(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), emptyNode);
        Node parent = new Node(Token.BLOCK, forNode);
        NodeUtil.removeChild(forNode, emptyNode);
        assertEquals(1, forNode.getChildCount());
        assertEquals(Token.EMPTY, forNode.getLastChild().getType());
    }

    @Test
    public void testMaybeAddFinally_no_finally() {
        Node tryNode = createNode(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK)); // try, catch
        NodeUtil.maybeAddFinally(tryNode);
        assertEquals(3, tryNode.getChildCount());
        assertEquals(Token.BLOCK, tryNode.getLastChild().getType());
    }

    @Test
    public void testMaybeAddFinally_already_has_finally() {
        Node tryNode = createNode(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK)); // try, catch, finally
        NodeUtil.maybeAddFinally(tryNode);
        assertEquals(3, tryNode.getChildCount());
    }

    @Test
    public void testTryMergeBlock_parent_is_block() {
        Node parentBlock = new Node(Token.BLOCK);
        Node childBlock = new Node(Token.BLOCK, new Node(Token.NAME, "a"));
        parentBlock.addChildToBack(childBlock);
        childBlock.setParent(parentBlock);
        NodeUtil.tryMergeBlock(childBlock);
        assertEquals(1, parentBlock.getChildCount());
        assertEquals(Token.NAME, parentBlock.getFirstChild().getType());
    }

    @Test
    public void testTryMergeBlock_parent_is_script() {
        Node script = new Node(Token.SCRIPT);
        Node childBlock = new Node(Token.BLOCK, new Node(Token.NAME, "a"));
        script.addChildToBack(childBlock);
        childBlock.setParent(script);
        NodeUtil.tryMergeBlock(childBlock);
        assertEquals(1, script.getChildCount());
        assertEquals(Token.NAME, script.getFirstChild().getType());
    }

    @Test
    public void testTryMergeBlock_parent_is_not_block_or_script() {
        Node parentNode = new Node(Token.IF);
        Node childBlock = new Node(Token.BLOCK, new Node(Token.NAME, "a"));
        parentNode.addChildToBack(childBlock);
        childBlock.setParent(parentNode);
        assertFalse(NodeUtil.tryMergeBlock(childBlock));
    }

    @Test
    public void testIsCall() {
        assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
        assertFalse(NodeUtil.isCall(new Node(Token.NEW)));
    }

    @Test
    public void testIsCallOrNew_call() {
        assertTrue(NodeUtil.isCallOrNew(new Node(Token.CALL)));
    }

    @Test
    public void testIsCallOrNew_new() {
        assertTrue(NodeUtil.isCallOrNew(new Node(Token.NEW)));
    }

    @Test
    public void testIsCallOrNew_other() {
        assertFalse(NodeUtil.isCallOrNew(new Node(Token.NAME)));
    }

    @Test
    public void testIsFunction() {
        assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
        assertFalse(NodeUtil.isFunction(new Node(Token.CALL)));
    }

    @Test
    public void testGetFunctionBody() {
        Node body = new Node(Token.BLOCK);
        Node func = createNode(Token.FUNCTION, new Node(Token.LP), body);
        assertEquals(body, NodeUtil.getFunctionBody(func));
    }

    @Test
    public void testIsThis() {
        assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
        assertFalse(NodeUtil.isThis(new Node(Token.NAME)));
    }

    @Test
    public void testIsArrayLiteral() {
        assertTrue(NodeUtil.isArrayLiteral(new Node(Token.ARRAYLIT)));
        assertFalse(NodeUtil.isArrayLiteral(new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testIsSparseArray_true() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.putProp(Node.SKIP_INDEXES_PROP, new int[]{1, 3});
        assertTrue(NodeUtil.isSparseArray(arrayLit));
    }

    @Test
    public void testIsSparseArray_false() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        assertFalse(NodeUtil.isSparseArray(arrayLit));
    }

    @Test
    public void testContainsCall_direct_call() {
        Node call = new Node(Token.CALL);
        assertTrue(NodeUtil.containsCall(call));
    }

    @Test
    public void testContainsCall_nested_call() {
        Node innerCall = new Node(Token.CALL);
        Node outerCall = createNode(Token.CALL, innerCall);
        assertTrue(NodeUtil.containsCall(outerCall));
    }

    @Test
    public void testContainsCall_no_call() {
        Node name = new Node(Token.NAME, "test");
        assertFalse(NodeUtil.containsCall(name));
    }

    @Test
    public void testIsFunctionDeclaration_statement_function() {
        Node func = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK);
        func.addChildToBack(block);
        Node statementParent = new Node(Token.BLOCK);
        statementParent.addChildToBack(func);
        func.setParent(statementParent);
        assertTrue(NodeUtil.isFunctionDeclaration(func));
    }

    @Test
    public void testIsFunctionDeclaration_expression_function() {
        Node func = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK);
        func.addChildToBack(block);
        Node exprParent = new Node(Token.CALL, func);
        func.setParent(exprParent);
        assertFalse(NodeUtil.isFunctionDeclaration(func));
    }

    @Test
    public void testIsHoistedFunctionDeclaration() {
        Node func = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK);
        func.addChildToBack(block);
        Node script = new Node(Token.SCRIPT, func);
        func.setParent(script);
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(func));
    }

    @Test
    public void testIsFunctionExpression() {
        Node func = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK);
        func.addChildToBack(block);
        Node callNode = new Node(Token.CALL, func);
        func.setParent(callNode);
        assertTrue(NodeUtil.isFunctionExpression(func));
    }

    @Test
    public void testIsEmptyFunctionExpression() {
        Node emptyBlock = new Node(Token.BLOCK);
        Node func = createNode(Token.FUNCTION, new Node(Token.LP), emptyBlock);
        assertTrue(NodeUtil.isEmptyFunctionExpression(func));
    }

    @Test
    public void testIsVarArgsFunction() {
        Node argumentsNode = new Node(Token.NAME, "arguments");
        Node functionBody = new Node(Token.BLOCK, argumentsNode);
        Node functionParams = new Node(Token.LP);
        Node functionNode = createNode(Token.FUNCTION, functionParams, functionBody);
        assertTrue(NodeUtil.isVarArgsFunction(functionNode));
    }

    @Test
    public void testIsObjectCallMethod_true() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "toString")));
        assertTrue(NodeUtil.isObjectCallMethod(callNode, "toString"));
    }

    @Test
    public void testIsObjectCallMethod_false() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "otherMethod")));
        assertFalse(NodeUtil.isObjectCallMethod(callNode, "toString"));
    }

    @Test
    public void testIsFunctionObjectCall_true() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "call")));
        assertTrue(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsFunctionObjectCall_false() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "apply")));
        assertFalse(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsFunctionObjectApply_true() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "apply")));
        assertTrue(NodeUtil.isFunctionObjectApply(callNode));
    }

    @Test
    public void testIsFunctionObjectApply_false() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "call")));
        assertFalse(NodeUtil.isFunctionObjectApply(callNode));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_call() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "call")));
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(callNode));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_apply() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "apply")));
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(callNode));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_other() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "other")));
        assertFalse(NodeUtil.isFunctionObjectCallOrApply(callNode));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_true() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "call")));
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(callNode));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_false_non_name_root() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.GETPROP, new Node(Token.NAME, "obj"), Node.newString(Token.STRING, "prop")),
                        Node.newString(Token.STRING, "call")));
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(callNode));
    }

    @Test
    public void testIsLhs_assign_left() {
        Node nameNode = new Node(Token.NAME, "x");
        Node assignNode = new Node(Token.ASSIGN, nameNode, createNumberNode(1));
        assertTrue(NodeUtil.isLhs(nameNode, assignNode));
    }

    @Test
    public void testIsLhs_assign_right() {
        Node nameNode = new Node(Token.NAME, "x");
        Node assignNode = new Node(Token.ASSIGN, createNumberNode(1), nameNode);
        assertFalse(NodeUtil.isLhs(nameNode, assignNode));
    }

    @Test
    public void testIsLhs_var() {
        Node nameNode = new Node(Token.NAME, "x");
        Node varNode = new Node(Token.VAR, nameNode);
        assertTrue(NodeUtil.isLhs(nameNode, varNode));
    }

    @Test
    public void testIsObjectLitKey_string_key() {
        assertTrue(NodeUtil.isObjectLitKey(Node.newString(Token.STRING, "key"), new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testIsObjectLitKey_number_key() {
        assertTrue(NodeUtil.isObjectLitKey(Node.newNumber(123), new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testIsObjectLitKey_get_key() {
        assertTrue(NodeUtil.isObjectLitKey(new Node(Token.GET), new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testIsObjectLitKey_set_key() {
        assertTrue(NodeUtil.isObjectLitKey(new Node(Token.SET), new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testIsObjectLitKey_other_node() {
        assertFalse(NodeUtil.isObjectLitKey(new Node(Token.NAME, "key"), new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testGetObjectLitKeyName_string() {
        assertEquals("myKey", NodeUtil.getObjectLitKeyName(Node.newString(Token.STRING, "myKey")));
    }

    @Test
    public void testGetObjectLitKeyName_number() {
        assertEquals("123", NodeUtil.getObjectLitKeyName(Node.newNumber(123)));
    }

    @Test
    public void testGetObjectLitKeyName_get() {
        assertEquals("myGetter", NodeUtil.getObjectLitKeyName(new Node(Token.GET, Node.newString(Token.STRING, "myGetter"))));
    }

    @Test
    public void testGetObjectLitKeyName_set() {
        assertEquals("mySetter", NodeUtil.getObjectLitKeyName(new Node(Token.SET, Node.newString(Token.STRING, "mySetter"))));
    }

    @Test
    public void testIsGetOrSetKey_get() {
        assertTrue(NodeUtil.isGetOrSetKey(new Node(Token.GET)));
    }

    @Test
    public void testIsGetOrSetKey_set() {
        assertTrue(NodeUtil.isGetOrSetKey(new Node(Token.SET)));
    }

    @Test
    public void testIsGetOrSetKey_other() {
        assertFalse(NodeUtil.isGetOrSetKey(new Node(Token.STRING)));
    }

    @Test
    public void testOpToStr_add() {
        assertEquals("+", NodeUtil.opToStr(Token.ADD));
    }

    @Test
    public void testOpToStr_mul() {
        assertEquals("*", NodeUtil.opToStr(Token.MUL));
    }

    @Test
    public void testOpToStr_assign_add() {
        assertEquals("+=", NodeUtil.opToStr(Token.ASSIGN_ADD));
    }

    @Test
    public void testOpToStr_sheq() {
        assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    }

    @Test
    public void testOpToStr_unknown() {
        assertNull(NodeUtil.opToStr(Token.EOF));
    }

    @Test
    public void testOpToStrNoFail_add() {
        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    }

    @Test
    public void testOpToStrNoFail_unknown() {
        try {
            NodeUtil.opToStrNoFail(Token.EOF);
            fail("Expected error for unknown operator");
        } catch (Error e) {
            // Expected exception
        }
    }

    @Test
    public void testContainsType_node_and_type_match() {
        Node nameNode = new Node(Token.NAME, "test");
        assertTrue(NodeUtil.containsType(nameNode, Token.NAME));
    }

    @Test
    public void testContainsType_node_and_type_no_match() {
        Node nameNode = new Node(Token.NAME, "test");
        assertFalse(NodeUtil.containsType(nameNode, Token.STRING));
    }

    @Test
    public void testContainsType_nested_node_and_type_match() {
        Node child = Node.newString(Token.STRING, "value");
        Node parent = createNode(Token.VAR, new Node(Token.NAME, "varName"), child);
        assertTrue(NodeUtil.containsType(parent, Token.STRING));
    }

    @Test
    public void testContainsType_nested_node_and_type_no_match() {
        Node child = Node.newString(Token.STRING, "value");
        Node parent = createNode(Token.VAR, new Node(Token.NAME, "varName"), child);
        assertFalse(NodeUtil.containsType(parent, Token.NUMBER));
    }

    @Test
    public void testRedeclareVarsInsideBranch_no_vars() {
        Node block = new Node(Token.BLOCK, new Node(Token.NAME, "a"));
        Node originalParent = block.getParent();
        NodeUtil.redeclareVarsInsideBranch(block);
        assertNull(block.getParent()); // Should not modify parent if no vars
        assertNotNull(originalParent);
    }

    @Test
    public void testRedeclareVarsInsideBranch_with_vars() {
        Node var1 = new Node(Token.VAR, new Node(Token.NAME, "x"));
        Node var2 = new Node(Token.VAR, new Node(Token.NAME, "y"));
        Node block = new Node(Token.BLOCK, var1, var2);
        Node script = new Node(Token.SCRIPT, block);
        NodeUtil.redeclareVarsInsideBranch(block);
        assertEquals(2, script.getChildCount());
        assertEquals(Token.VAR, script.getFirstChild().getType());
        assertEquals("x", script.getFirstChild().getString());
        assertEquals(Token.VAR, script.getChildAtIndex(1).getType());
        assertEquals("y", script.getChildAtIndex(1).getString());
    }

    @Test
    public void testCopyNameAnnotations_constant() {
        Node source = new Node(Token.NAME, "CONST_VAR");
        source.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node destination = new Node(Token.NAME, "CONST_VAR");
        NodeUtil.copyNameAnnotations(source, destination);
        assertTrue(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testNewFunctionNode() {
        Node body = new Node(Token.BLOCK);
        List<Node> params = Arrays.asList(new Node(Token.NAME, "p1"), new Node(Token.NAME, "p2"));
        Node func = NodeUtil.newFunctionNode("myFunc", params, body, 1, 1);
        assertEquals(Token.FUNCTION, func.getType());
        assertEquals("myFunc", func.getChildAtIndex(0).getString());
        assertEquals(Token.LP, func.getChildAtIndex(1).getType());
        assertEquals(2, func.getChildAtIndex(1).getChildCount());
        assertEquals(body, func.getLastChild());
    }

    @Test
    public void testNewQualifiedNameNode_simple() {
        Node qualifiedName = NodeUtil.newQualifiedNameNode(new CodingConvention.DefaultCodingConvention(), "foo", 1, 1);
        assertEquals(Token.NAME, qualifiedName.getType());
        assertEquals("foo", qualifiedName.getString());
    }

    @Test
    public void testNewQualifiedNameNode_nested() {
        Node qualifiedName = NodeUtil.newQualifiedNameNode(new CodingConvention.DefaultCodingConvention(), "foo.bar.baz", 1, 1);
        assertEquals(Token.GETPROP, qualifiedName.getType());
        assertEquals(Token.GETPROP, qualifiedName.getFirstChild().getType());
        assertEquals(Token.NAME, qualifiedName.getLastChild().getType());
        assertEquals("baz", qualifiedName.getLastChild().getString());
    }

    @Test
    public void testGetRootOfQualifiedName_name() {
        Node nameNode = new Node(Token.NAME, "foo");
        assertEquals(nameNode, NodeUtil.getRootOfQualifiedName(nameNode));
    }

    @Test
    public void testGetRootOfQualifiedName_getprop() {
        Node nameNode = new Node(Token.NAME, "foo");
        Node getPropNode = new Node(Token.GETPROP, nameNode, Node.newString(Token.STRING, "bar"));
        assertEquals(nameNode, NodeUtil.getRootOfQualifiedName(getPropNode));
    }

    @Test
    public void testSetDebugInformation() {
        Node targetNode = new Node(Token.NAME, "target");
        Node basisNode = new Node(Token.NAME, "source");
        basisNode.setLineno(10);
        basisNode.setCharno(5);
        NodeUtil.setDebugInformation(targetNode, basisNode, "originalName");
        assertEquals("originalName", targetNode.getProp(Node.ORIGINALNAME_PROP));
        assertEquals(10, targetNode.getLineno());
    }

    @Test
    public void testIsLatin_ascii() {
        assertTrue(NodeUtil.isLatin("abc"));
    }

    @Test
    public void testIsLatin_unicode() {
        assertFalse(NodeUtil.isLatin("你好"));
    }

    @Test
    public void testIsValidPropertyName_js_identifier() {
        assertTrue(NodeUtil.isValidPropertyName("myProp"));
    }

    @Test
    public void testIsValidPropertyName_keyword() {
        assertFalse(NodeUtil.isValidPropertyName("if"));
    }

    @Test
    public void testIsValidPropertyName_unicode() {
        assertFalse(NodeUtil.isValidPropertyName("你好"));
    }

    @Test
    public void testGetVarsDeclaredInBranch_no_vars() {
        Node block = new Node(Token.BLOCK, new Node(Token.NAME, "a"));
        assertTrue(NodeUtil.getVarsDeclaredInBranch(block).isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranch_with_vars() {
        Node var1 = new Node(Token.VAR, new Node(Token.NAME, "x"));
        Node var2 = new Node(Token.VAR, new Node(Token.NAME, "y"));
        Node block = new Node(Token.BLOCK, var1, var2);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(block);
        assertEquals(2, vars.size());
        assertTrue(vars.stream().anyMatch(n -> n.getString().equals("x")));
        assertTrue(vars.stream().anyMatch(n -> n.getString().equals("y")));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_true() {
        Node className = new Node(Token.NAME, "MyClass");
        Node prototype = new Node(Token.GETPROP, className, Node.newString(Token.STRING, "prototype"));
        Node propertyName = Node.newString(Token.STRING, "myMethod");
        Node lhs = new Node(Token.GETPROP, prototype, propertyName);
        Node rhs = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertTrue(NodeUtil.isPrototypePropertyDeclaration(assign));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_false() {
        Node className = new Node(Token.NAME, "MyClass");
        Node prototype = new Node(Token.GETPROP, className, Node.newString(Token.STRING, "prototype"));
        Node propertyName = Node.newString(Token.STRING, "myMethod");
        Node lhs = new Node(Token.GETPROP, prototype, propertyName);
        Node rhs = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        Node notProtoLhs = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), Node.newString(Token.STRING, "method"));
        Node notProtoAssign = new Node(Token.ASSIGN, notProtoLhs, rhs);
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(notProtoAssign));
    }

    @Test
    public void testGetPrototypeClassName() {
        Node className = new Node(Token.NAME, "MyClass");
        Node prototype = new Node(Token.GETPROP, className, Node.newString(Token.STRING, "prototype"));
        Node propertyName = Node.newString(Token.STRING, "myMethod");
        Node qName = new Node(Token.GETPROP, prototype, propertyName);
        assertEquals(className, NodeUtil.getPrototypeClassName(qName));
    }

    @Test
    public void testGetPrototypePropertyName() {
        Node className = new Node(Token.NAME, "MyClass");
        Node prototype = new Node(Token.GETPROP, className, Node.newString(Token.STRING, "prototype"));
        Node propertyName = Node.newString(Token.STRING, "myMethod");
        Node qName = new Node(Token.GETPROP, prototype, propertyName);
        assertEquals("myMethod", NodeUtil.getPrototypePropertyName(qName));
    }

    @Test
    public void testNewUndefinedNode() {
        Node srcNode = new Node(Token.NAME, "test");
        Node undefinedNode = NodeUtil.newUndefinedNode(srcNode);
        assertEquals(Token.VOID, undefinedNode.getType());
        assertEquals(Token.NUMBER, undefinedNode.getFirstChild().getType());
        assertEquals(0.0, undefinedNode.getFirstChild().getDouble(), 0.0);
        assertEquals(srcNode.getLineno(), undefinedNode.getLineno());
    }

    @Test
    public void testNewVarNode_with_value() {
        Node valueNode = createNumberNode(10);
        Node varNode = NodeUtil.newVarNode("myVar", valueNode);
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(1, varNode.getChildCount());
        Node nameNode = varNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("myVar", nameNode.getString());
        assertEquals(valueNode, nameNode.getFirstChild());
    }

    @Test
    public void testNewVarNode_without_value() {
        Node varNode = NodeUtil.newVarNode("myVar", null);
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(1, varNode.getChildCount());
        Node nameNode = varNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("myVar", nameNode.getString());
        assertNull(nameNode.getFirstChild());
    }

    @Test
    public void testIsNameReferenced_true() {
        Node nameNode = new Node(Token.NAME, "targetVar");
        Node useNode = new Node(Token.NAME, "targetVar");
        Node parent = new Node(Token.BLOCK, useNode);
        assertTrue(NodeUtil.isNameReferenced(parent, "targetVar"));
    }

    @Test
    public void testIsNameReferenced_false() {
        Node nameNode = new Node(Token.NAME, "targetVar");
        Node otherUseNode = new Node(Token.NAME, "otherVar");
        Node parent = new Node(Token.BLOCK, otherUseNode);
        assertFalse(NodeUtil.isNameReferenced(parent, "targetVar"));
    }

    @Test
    public void testGetNameReferenceCount_one() {
        Node useNode = new Node(Token.NAME, "targetVar");
        Node parent = new Node(Token.BLOCK, useNode);
        assertEquals(1, NodeUtil.getNameReferenceCount(parent, "targetVar"));
    }

    @Test
    public void testGetNameReferenceCount_multiple() {
        Node useNode1 = new Node(Token.NAME, "targetVar");
        Node useNode2 = new Node(Token.NAME, "targetVar");
        Node parent = new Node(Token.BLOCK, useNode1, useNode2);
        assertEquals(2, NodeUtil.getNameReferenceCount(parent, "targetVar"));
    }

    @Test
    public void testGetNameReferenceCount_zero() {
        Node otherUseNode = new Node(Token.NAME, "otherVar");
        Node parent = new Node(Token.BLOCK, otherUseNode);
        assertEquals(0, NodeUtil.getNameReferenceCount(parent, "targetVar"));
    }

    @Test
    public void testHas_true() {
        Node target = new Node(Token.NAME, "target");
        Node parent = new Node(Token.BLOCK, target);
        assertTrue(NodeUtil.has(parent, new NodeUtil.MatchNodeType(Token.NAME), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testHas_false() {
        Node target = new Node(Token.NAME, "target");
        Node parent = new Node(Token.BLOCK, target);
        assertFalse(NodeUtil.has(parent, new NodeUtil.MatchNodeType(Token.STRING), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testGetCount_one() {
        Node target = new Node(Token.NAME, "target");
        Node parent = new Node(Token.BLOCK, target);
        assertEquals(1, NodeUtil.getCount(parent, new NodeUtil.MatchNodeType(Token.NAME), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testGetCount_zero() {
        Node target = new Node(Token.NAME, "target");
        Node parent = new Node(Token.BLOCK, target);
        assertEquals(0, NodeUtil.getCount(parent, new NodeUtil.MatchNodeType(Token.STRING), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testVisitPreOrder() {
        Node root = new Node(Token.BLOCK, new Node(Token.NAME, "a"), new Node(Token.NAME, "b"));
        List<Node> visitedNodes = new java.util.ArrayList<>();
        NodeUtil.Visitor visitor = node -> visitedNodes.add(node);
        NodeUtil.visitPreOrder(root, visitor, Predicates.<Node>alwaysTrue());
        assertEquals(3, visitedNodes.size());
        assertEquals(Token.BLOCK, visitedNodes.get(0).getType());
        assertEquals(Token.NAME, visitedNodes.get(1).getType());
        assertEquals("a", visitedNodes.get(1).getString());
        assertEquals(Token.NAME, visitedNodes.get(2).getType());
        assertEquals("b", visitedNodes.get(2).getString());
    }

    @Test
    public void testVisitPostOrder() {
        Node root = new Node(Token.BLOCK, new Node(Token.NAME, "a"), new Node(Token.NAME, "b"));
        List<Node> visitedNodes = new java.util.ArrayList<>();
        NodeUtil.Visitor visitor = node -> visitedNodes.add(node);
        NodeUtil.visitPostOrder(root, visitor, Predicates.<Node>alwaysTrue());
        assertEquals(3, visitedNodes.size());
        assertEquals(Token.NAME, visitedNodes.get(0).getType());
        assertEquals("a", visitedNodes.get(0).getString());
        assertEquals(Token.NAME, visitedNodes.get(1).getType());
        assertEquals("b", visitedNodes.get(1).getString());
        assertEquals(Token.BLOCK, visitedNodes.get(2).getType());
    }

    @Test
    public void testHasFinally_true() {
        Node tryNode = createNode(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK));
        assertTrue(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testHasFinally_false() {
        Node tryNode = createNode(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK));
        assertFalse(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testGetCatchBlock() {
        Node catchBlock = new Node(Token.BLOCK);
        Node tryNode = createNode(Token.TRY, new Node(Token.BLOCK), catchBlock, new Node(Token.BLOCK));
        assertEquals(catchBlock, NodeUtil.getCatchBlock(tryNode));
    }

    @Test
    public void testHasCatchHandler_true() {
        Node catchNode = new Node(Token.CATCH);
        Node catchBlock = new Node(Token.BLOCK, catchNode);
        assertTrue(NodeUtil.hasCatchHandler(catchBlock));
    }

    @Test
    public void testHasCatchHandler_false() {
        Node catchBlock = new Node(Token.BLOCK, new Node(Token.NAME, "someCode"));
        assertFalse(NodeUtil.hasCatchHandler(catchBlock));
    }

    @Test
    public void testGetFnParameters() {
        Node param1 = new Node(Token.NAME, "p1");
        Node param2 = new Node(Token.NAME, "p2");
        Node lp = new Node(Token.LP, param1, param2);
        Node func = createNode(Token.FUNCTION, new Node(Token.NAME, "fn"), lp);
        assertEquals(lp, NodeUtil.getFnParameters(func));
    }

    @Test
    public void testIsConstantName_true() {
        Node nameNode = new Node(Token.NAME, "CONST_VAR");
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(NodeUtil.isConstantName(nameNode));
    }

    @Test
    public void testIsConstantName_false() {
        Node nameNode = new Node(Token.NAME, "var");
        assertFalse(NodeUtil.isConstantName(nameNode));
    }

    @Test
    public void testIsConstantByConvention_constant_key() {
        CodingConvention convention = new CodingConvention.DefaultCodingConvention();
        Node keyNode = Node.newString(Token.STRING, "MY_CONST_KEY");
        Node objLit = new Node(Token.OBJECTLIT, new Node(Token.GET, keyNode));
        keyNode.setParent(objLit);
        assertTrue(NodeUtil.isConstantByConvention(convention, keyNode, objLit));
    }

    @Test
    public void testIsConstantByConvention_constant_name() {
        CodingConvention convention = new CodingConvention.DefaultCodingConvention();
        Node nameNode = new Node(Token.NAME, "MY_CONST");
        Node parent = new Node(Token.BLOCK, nameNode);
        assertTrue(NodeUtil.isConstantByConvention(convention, nameNode, parent));
    }

    @Test
    public void testGetInfoForNameNode_direct_jsdoc() {
        Node nameNode = new Node(Token.NAME, "myVar");
        JSDocInfo jsDoc = new JSDocInfo();
        nameNode.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetInfoForNameNode_var_parent_jsdoc() {
        Node nameNode = new Node(Token.NAME, "myVar");
        Node varNode = new Node(Token.VAR, nameNode);
        JSDocInfo jsDoc = new JSDocInfo();
        varNode.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetInfoForNameNode_function_parent_jsdoc() {
        Node nameNode = new Node(Token.NAME, "myFunc");
        Node funcNode = createNode(Token.FUNCTION, new Node(Token.LP), new Node(Token.BLOCK));
        funcNode.addChildToBack(nameNode); // function name
        JSDocInfo jsDoc = new JSDocInfo();
        funcNode.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetFunctionInfo_direct_jsdoc() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        func.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, NodeUtil.getFunctionInfo(func));
    }

    @Test
    public void testGetFunctionInfo_assign_jsdoc() {
        Node func = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "obj.method"), func);
        JSDocInfo jsDoc = new JSDocInfo();
        assign.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, NodeUtil.getFunctionInfo(func));
    }

    @Test
    public void testGetFunctionInfo_var_assign_jsdoc() {
        Node func = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "myVar");
        Node varAssign = new Node(Token.VAR, nameNode);
        varAssign.addChildToBack(func);
        func.setParent(varAssign);
        JSDocInfo jsDoc = new JSDocInfo();
        varAssign.setJSDocInfo(jsDoc);
        assertEquals(jsDoc, NodeUtil.getFunctionInfo(func));
    }

    @Test
    public void testGetSourceName_node_has_prop() {
        Node node = new Node(Token.NAME, "test");
        node.putProp(Node.SOURCENAME_PROP, "source.js");
        assertEquals("source.js", NodeUtil.getSourceName(node));
    }

    @Test
    public void testGetSourceName_parent_has_prop() {
        Node parent = new Node(Token.BLOCK);
        parent.putProp(Node.SOURCENAME_PROP, "source.js");
        Node node = new Node(Token.NAME, "test");
        parent.addChildToBack(node);
        node.setParent(parent);
        assertEquals("source.js", NodeUtil.getSourceName(node));
    }

    @Test
    public void testNewCallNode_free_call() {
        Node callTarget = new Node(Token.NAME, "myFunc");
        Node param1 = createNumberNode(1);
        Node param2 = createStringNode("hello");
        Node callNode = NodeUtil.newCallNode(callTarget, param1, param2);
        assertTrue(callNode.getBooleanProp(Node.FREE_CALL));
        assertEquals(Token.CALL, callNode.getType());
        assertEquals(callTarget, callNode.getFirstChild());
        assertEquals(param1, callNode.getChildAtIndex(1));
        assertEquals(param2, callNode.getChildAtIndex(2));
    }

    @Test
    public void testNewCallNode_not_free_call() {
        Node callTarget = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), Node.newString(Token.STRING, "method"));
        Node callNode = NodeUtil.newCallNode(callTarget);
        assertFalse(callNode.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testEvaluatesToLocalValue_immutable() {
        assertTrue(NodeUtil.evaluatesToLocalValue(createNumberNode(5)));
    }

    @Test
    public void testEvaluatesToLocalValue_this_local() {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.THIS), n -> true));
    }

    @Test
    public void testEvaluatesToLocalValue_this_nonlocal() {
        assertFalse(NodeUtil.evaluatesToLocalValue(new Node(Token.THIS), n -> false));
    }

    @Test
    public void testEvaluatesToLocalValue_name_immutable() {
        assertTrue(NodeUtil.evaluatesToLocalValue(createNumberNode(5)));
    }

    @Test
    public void testEvaluatesToLocalValue_name_local() {
        assertTrue(NodeUtil.evaluatesToLocalValue(createNodeWithToken(Token.NAME, "localVar"), n -> true));
    }

    @Test
    public void testEvaluatesToLocalValue_name_nonlocal() {
        assertFalse(NodeUtil.evaluatesToLocalValue(createNodeWithToken(Token.NAME, "globalVar"), n -> false));
    }

    @Test
    public void testEvaluatesToLocalValue_call_has_local_result() {
        Node callNode = new Node(Token.CALL);
        callNode.putBooleanProp(Node.FREE_CALL, true);
        assertTrue(NodeUtil.evaluatesToLocalValue(callNode));
    }

    @Test
    public void testEvaluatesToLocalValue_new_has_local_result() {
        Node newNode = new Node(Token.NEW);
        newNode.putBooleanProp(Node.DIRECTCALL_PROP, true);
        assertTrue(NodeUtil.evaluatesToLocalValue(newNode));
    }

    @Test
    public void testEvaluatesToLocalValue_function() {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.FUNCTION)));
    }

    @Test
    public void testEvaluatesToLocalValue_regexp() {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP)));
    }

    @Test
    public void testEvaluatesToLocalValue_arraylit() {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    }

    @Test
    public void testEvaluatesToLocalValue_objectlit() {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testEvaluatesToLocalValue_assign_immutable_rhs() {
        Node assignNode = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), createNumberNode(5));
        assertTrue(NodeUtil.evaluatesToLocalValue(assignNode));
    }

    @Test
    public void testEvaluatesToLocalValue_assign_local_rhs() {
        Node assignNode = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), createNodeWithToken(Token.NAME, "localVar"));
        assertTrue(NodeUtil.evaluatesToLocalValue(assignNode, n -> true));
    }

    @Test
    public void testGetArgumentForFunction_first() {
        Node param1 = new Node(Token.NAME, "p1");
        Node lp = new Node(Token.LP, param1, new Node(Token.NAME, "p2"));
        Node func = createNode(Token.FUNCTION, new Node(Token.NAME, "fn"), lp);
        assertEquals(param1, NodeUtil.getArgumentForFunction(func, 0));
    }

    @Test
    public void testGetArgumentForFunction_last() {
        Node param2 = new Node(Token.NAME, "p2");
        Node lp = new Node(Token.LP, new Node(Token.NAME, "p1"), param2);
        Node func = createNode(Token.FUNCTION, new Node(Token.NAME, "fn"), lp);
        assertEquals(param2, NodeUtil.getArgumentForFunction(func, 1));
    }

    @Test
    public void testGetArgumentForFunction_out_of_bounds() {
        Node lp = new Node(Token.LP, new Node(Token.NAME, "p1"));
        Node func = createNode(Token.FUNCTION, new Node(Token.NAME, "fn"), lp);
        assertNull(NodeUtil.getArgumentForFunction(func, 1));
    }

    @Test
    public void testGetArgumentForCallOrNew_first() {
        Node arg1 = createNumberNode(1);
        Node call = createNode(Token.CALL, new Node(Token.NAME, "fn"), arg1, createStringNode("a"));
        assertEquals(arg1, NodeUtil.getArgumentForCallOrNew(call, 0));
    }

    @Test
    public void testGetArgumentForCallOrNew_last() {
        Node arg2 = createStringNode("a");
        Node call = createNode(Token.CALL, new Node(Token.NAME, "fn"), createNumberNode(1), arg2);
        assertEquals(arg2, NodeUtil.getArgumentForCallOrNew(call, 1));
    }

    @Test
    public void testGetArgumentForCallOrNew_out_of_bounds() {
        Node call = createNode(Token.CALL, new Node(Token.NAME, "fn"), createNumberNode(1));
        assertNull(NodeUtil.getArgumentForCallOrNew(call, 1));
    }

    @Test
    public void testIsToStringMethodCall_true() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "toString")));
        assertTrue(NodeUtil.isToStringMethodCall(callNode));
    }

    @Test
    public void testIsToStringMethodCall_false() {
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP,
                        new Node(Token.NAME, "obj"),
                        Node.newString(Token.STRING, "otherMethod")));
        assertFalse(NodeUtil.isToStringMethodCall(callNode));
    }

}
```