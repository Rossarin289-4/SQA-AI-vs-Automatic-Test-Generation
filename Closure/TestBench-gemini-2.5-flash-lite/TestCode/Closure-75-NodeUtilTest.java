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
    public void testGetImpureBooleanValue_stringLiteralEmpty() throws Exception {
        Node n = Node.newString("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_stringLiteralNonEmpty() throws Exception {
        Node n = Node.newString("hello");
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_numberLiteralZero() throws Exception {
        Node n = Node.newNumber(0.0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_numberLiteralNonZero() throws Exception {
        Node n = Node.newNumber(123.45);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_notEmptyString() throws Exception {
        Node str = Node.newString("test");
        Node not = new Node(Token.NOT, str);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(not));
    }

    @Test
    public void testGetImpureBooleanValue_notZeroNumber() throws Exception {
        Node num = Node.newNumber(1.0);
        Node not = new Node(Token.NOT, num);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(not));
    }

    @Test
    public void testGetImpureBooleanValue_andTrueTrue() throws Exception {
        Node left = Node.newString("a");
        Node right = Node.newString("b");
        Node and = new Node(Token.AND, left, right);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(and));
    }

    @Test
    public void testGetImpureBooleanValue_andTrueFalse() throws Exception {
        Node left = Node.newString("a");
        Node right = Node.newString("");
        Node and = new Node(Token.AND, left, right);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(and));
    }

    @Test
    public void testGetImpureBooleanValue_orFalseFalse() throws Exception {
        Node left = Node.newString("");
        Node right = Node.newString("");
        Node or = new Node(Token.OR, left, right);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(or));
    }

    @Test
    public void testGetImpureBooleanValue_orFalseTrue() throws Exception {
        Node left = Node.newString("");
        Node right = Node.newString("b");
        Node or = new Node(Token.OR, left, right);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(or));
    }

    @Test
    public void testGetImpureBooleanValue_hookTrue() throws Exception {
        Node cond = Node.newString("a"); // true
        Node trueBranch = Node.newString("b"); // true
        Node falseBranch = Node.newString("c"); // true
        Node hook = new Node(Token.HOOK, cond, trueBranch, falseBranch);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hook));
    }

    @Test
    public void testGetImpureBooleanValue_hookFalse() throws Exception {
        Node cond = Node.newString(""); // false
        Node trueBranch = Node.newString("b"); // true
        Node falseBranch = Node.newString("c"); // true
        Node hook = new Node(Token.HOOK, cond, trueBranch, falseBranch);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hook));
    }

    @Test
    public void testGetImpureBooleanValue_hookUnknown() throws Exception {
        Node cond = Node.newNumber(1); // true
        Node trueBranch = Node.newString("b"); // true
        Node falseBranch = Node.newNumber(0); // false
        Node hook = new Node(Token.HOOK, cond, trueBranch, falseBranch);
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hook));
    }

    @Test
    public void testGetImpureBooleanValue_arrayLiteral() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(arrayLit));
    }

    @Test
    public void testGetImpureBooleanValue_objectLiteral() throws Exception {
        Node objectLit = new Node(Token.OBJECTLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(objectLit));
    }

    @Test
    public void testGetPureBooleanValue_stringLiteralEmpty() throws Exception {
        Node n = Node.newString("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_stringLiteralNonEmpty() throws Exception {
        Node n = Node.newString("hello");
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_numberLiteralZero() throws Exception {
        Node n = Node.newNumber(0.0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_numberLiteralNonZero() throws Exception {
        Node n = Node.newNumber(123.45);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_notEmptyString() throws Exception {
        Node str = Node.newString("test");
        Node not = new Node(Token.NOT, str);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(not));
    }

    @Test
    public void testGetPureBooleanValue_notZeroNumber() throws Exception {
        Node num = Node.newNumber(1.0);
        Node not = new Node(Token.NOT, num);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(not));
    }

    @Test
    public void testGetPureBooleanValue_nullNode() throws Exception {
        Node n = new Node(Token.NULL);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_falseNode() throws Exception {
        Node n = new Node(Token.FALSE);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_voidNode() throws Exception {
        Node n = new Node(Token.VOID);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_nameUndefined() throws Exception {
        Node n = Node.newString("undefined");
        n.setType(Token.NAME);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_nameNaN() throws Exception {
        Node n = Node.newString("NaN");
        n.setType(Token.NAME);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_nameInfinity() throws Exception {
        Node n = Node.newString("Infinity");
        n.setType(Token.NAME);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_trueNode() throws Exception {
        Node n = new Node(Token.TRUE);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_regexpLiteral() throws Exception {
        Node n = new Node(Token.REGEXP);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_arrayLiteralNoSideEffects() throws Exception {
        Node n = new Node(Token.ARRAYLIT);
        // Assume no side effects for this test
        // Based on the code, ARRAYLIT without side effects returns TRUE.
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_objectLiteralNoSideEffects() throws Exception {
        Node n = new Node(Token.OBJECTLIT);
        // Assume no side effects for this test
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetStringValue_stringLiteral() throws Exception {
        Node n = Node.newString("test string");
        assertEquals("test string", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nameUndefined() throws Exception {
        Node n = Node.newString("undefined");
        n.setType(Token.NAME);
        assertEquals("undefined", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nameNaN() throws Exception {
        Node n = Node.newString("NaN");
        n.setType(Token.NAME);
        assertEquals("NaN", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nameInfinity() throws Exception {
        Node n = Node.newString("Infinity");
        n.setType(Token.NAME);
        assertEquals("Infinity", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_numberLiteralInteger() throws Exception {
        Node n = Node.newNumber(123.0);
        assertEquals("123", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_numberLiteralDouble() throws Exception {
        Node n = Node.newNumber(123.45);
        assertEquals("123.45", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_falseNode() throws Exception {
        Node n = new Node(Token.FALSE);
        assertEquals("false", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_trueNode() throws Exception {
        Node n = new Node(Token.TRUE);
        assertEquals("true", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nullNode() throws Exception {
        Node n = new Node(Token.NULL);
        assertEquals("null", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_voidNode() throws Exception {
        Node n = new Node(Token.VOID);
        assertEquals("undefined", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_notTrue() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        assertEquals("false", NodeUtil.getStringValue(notNode));
    }

    @Test
    public void testGetStringValue_notFalse() throws Exception {
        Node falseNode = new Node(Token.FALSE);
        Node notNode = new Node(Token.NOT, falseNode);
        assertEquals("true", NodeUtil.getStringValue(notNode));
    }

    @Test
    public void testGetStringValue_arrayLiteralSimple() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"));
        assertEquals("a,b", NodeUtil.getStringValue(arrayLit));
    }

    @Test
    public void testGetStringValue_arrayLiteralWithEmpty() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), new Node(Token.EMPTY), Node.newString("c"));
        assertEquals("a,,c", NodeUtil.getStringValue(arrayLit));
    }

    @Test
    public void testGetStringValue_arrayLiteralWithNull() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), new Node(Token.NULL), Node.newString("c"));
        assertEquals("a,,c", NodeUtil.getStringValue(arrayLit));
    }

    @Test
    public void testGetStringValue_arrayLiteralWithUndefined() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), new Node(Token.VOID), Node.newString("c"));
        assertEquals("a,,c", NodeUtil.getStringValue(arrayLit));
    }

    @Test
    public void testGetStringValue_objectLiteral() throws Exception {
        Node objectLit = new Node(Token.OBJECTLIT);
        assertEquals("[object Object]", NodeUtil.getStringValue(objectLit));
    }

    @Test
    public void testGetArrayElementStringValue_emptyString() throws Exception {
        Node n = Node.newString("");
        assertEquals("", NodeUtil.getArrayElementStringValue(n));
    }

    @Test
    public void testGetArrayElementStringValue_nullNode() throws Exception {
        Node n = new Node(Token.NULL);
        assertEquals("", NodeUtil.getArrayElementStringValue(n));
    }

    @Test
    public void testGetArrayElementStringValue_voidNode() throws Exception {
        Node n = new Node(Token.VOID);
        assertEquals("", NodeUtil.getArrayElementStringValue(n));
    }

    @Test
    public void testGetArrayElementStringValue_stringLiteral() throws Exception {
        Node n = Node.newString("test");
        assertEquals("test", NodeUtil.getArrayElementStringValue(n));
    }

    @Test
    public void testGetArrayElementStringValue_numberLiteral() throws Exception {
        Node n = Node.newNumber(123.0);
        assertEquals("123", NodeUtil.getArrayElementStringValue(n));
    }

    @Test
    public void testGetNumberValue_trueNode() throws Exception {
        Node n = new Node(Token.TRUE);
        assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_falseNode() throws Exception {
        Node n = new Node(Token.FALSE);
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_nullNode() throws Exception {
        Node n = new Node(Token.NULL);
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_numberLiteral() throws Exception {
        Node n = Node.newNumber(42.5);
        assertEquals(Double.valueOf(42.5), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_voidNode() throws Exception {
        Node n = new Node(Token.VOID);
        // Assuming mayHaveSideEffects(n.getFirstChild()) is false for a void node.
        assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_nameUndefined() throws Exception {
        Node n = Node.newString("undefined");
        n.setType(Token.NAME);
        assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_nameNaN() throws Exception {
        Node n = Node.newString("NaN");
        n.setType(Token.NAME);
        assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_nameInfinity() throws Exception {
        Node n = Node.newString("Infinity");
        n.setType(Token.NAME);
        assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_negInfinity() throws Exception {
        Node infinityName = Node.newString("Infinity");
        infinityName.setType(Token.NAME);
        Node negNode = new Node(Token.NEG, infinityName);
        assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), NodeUtil.getNumberValue(negNode));
    }

    @Test
    public void testGetNumberValue_notTrue() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(notNode));
    }

    @Test
    public void testGetNumberValue_notFalse() throws Exception {
        Node falseNode = new Node(Token.FALSE);
        Node notNode = new Node(Token.NOT, falseNode);
        assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(notNode));
    }

    @Test
    public void testGetNumberValue_stringNumber() throws Exception {
        Node n = Node.newString("123.45");
        assertEquals(Double.valueOf(123.45), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringHex() throws Exception {
        Node n = Node.newString("0xFF");
        assertEquals(Double.valueOf(255.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringEmpty() throws Exception {
        Node n = Node.newString("");
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringWhitespace() throws Exception {
        Node n = Node.newString("   \t\n  ");
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringInvalid() throws Exception {
        Node n = Node.newString("abc");
        assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_arrayLiteralToString() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
        assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(arrayLit)); // StringValue "1,2" becomes 1.0
    }

    @Test
    public void testGetNumberValue_objectLiteralToString() throws Exception {
        Node objectLit = new Node(Token.OBJECTLIT);
        assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(objectLit)); // StringValue "[object Object]" becomes NaN
    }

    @Test
    public void testGetStringNumberValue_emptyString() throws Exception {
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue(""));
    }

    @Test
    public void testGetStringNumberValue_whitespaceString() throws Exception {
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   \t\n  "));
    }

    @Test
    public void testGetStringNumberValue_integerString() throws Exception {
        assertEquals(Double.valueOf(123.0), NodeUtil.getStringNumberValue("123"));
    }

    @Test
    public void testGetStringNumberValue_doubleString() throws Exception {
        assertEquals(Double.valueOf(123.45), NodeUtil.getStringNumberValue("123.45"));
    }

    @Test
    public void testGetStringNumberValue_hexString() throws Exception {
        assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    }

    @Test
    public void testGetStringNumberValue_hexStringWithSign() throws Exception {
        // Firefox and IE treat "+" prefix differently. Returning null for this edge case.
        assertNull(NodeUtil.getStringNumberValue("+0x10"));
    }

    @Test
    public void testGetStringNumberValue_invalidString() throws Exception {
        assertEquals(Double.valueOf(Double.NaN), NodeUtil.getStringNumberValue("abc"));
    }

    @Test
    public void testGetStringNumberValue_infinityString() throws Exception {
        assertNull(NodeUtil.getStringNumberValue("infinity"));
    }

    @Test
    public void testGetStringNumberValue_negativeInfinityString() throws Exception {
        assertNull(NodeUtil.getStringNumberValue("-infinity"));
    }

    @Test
    public void testGetStringNumberValue_plusInfinityString() throws Exception {
        assertNull(NodeUtil.getStringNumberValue("+infinity"));
    }

    @Test
    public void testTrimJsWhiteSpace_leadingAndTrailing() throws Exception {
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("  abc  "));
    }

    @Test
    public void testTrimJsWhiteSpace_onlyLeading() throws Exception {
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("  abc"));
    }

    @Test
    public void testTrimJsWhiteSpace_onlyTrailing() throws Exception {
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("abc  "));
    }

    @Test
    public void testTrimJsWhiteSpace_noWhitespace() throws Exception {
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("abc"));
    }

    @Test
    public void testTrimJsWhiteSpace_emptyString() throws Exception {
        assertEquals("", NodeUtil.trimJsWhiteSpace(""));
    }

    @Test
    public void testTrimJsWhiteSpace_onlyWhitespace() throws Exception {
        assertEquals("", NodeUtil.trimJsWhiteSpace("   \n\t "));
    }

    @Test
    public void testIsStrWhiteSpaceChar_space() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    }

    @Test
    public void testIsStrWhiteSpaceChar_newline() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_carriageReturn() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\r'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_tab() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\t'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_verticalTab() throws Exception {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_nonBreakingSpace() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u00A0'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_formFeed() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u000C'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_lineSeparator() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2028'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_paragraphSeparator() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2029'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_byteOrderMark() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\uFEFF'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_otherSpaceSeparator() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(Character.SPACE_SEPARATOR));
    }

    @Test
    public void testIsStrWhiteSpaceChar_otherNonSpace() throws Exception {
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
    }

    @Test
    public void testGetFunctionName_simpleFunction() throws Exception {
        Node fn = new Node(Token.FUNCTION, Node.newString("myFunc"));
        assertEquals("myFunc", NodeUtil.getFunctionName(fn));
    }

    @Test
    public void testGetFunctionName_varAssignedFunction() throws Exception {
        Node nameNode = Node.newString("myVar");
        Node functionExpr = new Node(Token.FUNCTION, Node.newString(""), nameNode); // Function has no explicit name
        Node varNode = new Node(Token.VAR, functionExpr);
        assertEquals("myVar", NodeUtil.getFunctionName(functionExpr));
    }

    @Test
    public void testGetFunctionName_qualifiedNameAssignedFunction() throws Exception {
        Node qualifiedName = Node.newString("obj.method");
        qualifiedName.setType(Token.GETPROP);
        Node functionExpr = new Node(Token.FUNCTION, Node.newString(""), qualifiedName); // Function has no explicit name
        Node assignNode = new Node(Token.ASSIGN, qualifiedName, functionExpr);
        assertEquals("obj.method", NodeUtil.getFunctionName(functionExpr));
    }

    @Test
    public void testGetFunctionName_namedFunctionExpressionAssignedToVar() throws Exception {
        Node namedFn = new Node(Token.FUNCTION, Node.newString("innerName"));
        Node varDecl = new Node(Token.VAR, namedFn);
        assertEquals("innerName", NodeUtil.getFunctionName(namedFn)); // Should return the function's name, not the var name
    }

    @Test
    public void testGetFunctionName_namedFunctionExpressionAssignedToQualifiedName() throws Exception {
        Node qualifiedName = Node.newString("obj.method");
        qualifiedName.setType(Token.GETPROP);
        Node namedFn = new Node(Token.FUNCTION, Node.newString("innerName"), qualifiedName);
        Node assignNode = new Node(Token.ASSIGN, qualifiedName, namedFn);
        assertEquals("innerName", NodeUtil.getFunctionName(namedFn)); // Should return the function's name, not the qualified name
    }


    @Test
    public void testGetNearestFunctionName_functionDeclaration() throws Exception {
        Node fn = new Node(Token.FUNCTION, Node.newString("myFunc"));
        assertEquals("myFunc", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testGetNearestFunctionName_varAssignedFunction() throws Exception {
        Node nameNode = Node.newString("myVar");
        Node functionExpr = new Node(Token.FUNCTION, Node.newString(""), nameNode);
        Node varNode = new Node(Token.VAR, functionExpr);
        assertEquals("myVar", NodeUtil.getNearestFunctionName(functionExpr));
    }

    @Test
    public void testGetNearestFunctionName_qualifiedNameAssignedFunction() throws Exception {
        Node qualifiedName = Node.newString("obj.method");
        qualifiedName.setType(Token.GETPROP);
        Node functionExpr = new Node(Token.FUNCTION, Node.newString(""), qualifiedName);
        Node assignNode = new Node(Token.ASSIGN, qualifiedName, functionExpr);
        assertEquals("obj.method", NodeUtil.getNearestFunctionName(functionExpr));
    }

    @Test
    public void testGetNearestFunctionName_objectLiteralMethodStringKey() throws Exception {
        Node fn = new Node(Token.FUNCTION);
        Node stringKey = Node.newString("myMethod");
        Node objectLit = new Node(Token.OBJECTLIT, new Node(Token.GET, stringKey, fn));
        assertEquals("myMethod", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testGetNearestFunctionName_objectLiteralMethodNumberKey() throws Exception {
        Node fn = new Node(Token.FUNCTION);
        Node numberKey = Node.newNumber(123.0);
        Node objectLit = new Node(Token.OBJECTLIT, new Node(Token.GET, numberKey, fn));
        assertEquals("123", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testGetNearestFunctionName_noName() throws Exception {
        Node fn = new Node(Token.FUNCTION);
        assertNull(NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testIsImmutableValue_string() throws Exception {
        Node n = Node.newString("hello");
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_number() throws Exception {
        Node n = Node.newNumber(123.45);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_null() throws Exception {
        Node n = new Node(Token.NULL);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_true() throws Exception {
        Node n = new Node(Token.TRUE);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_false() throws Exception {
        Node n = new Node(Token.FALSE);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_notTrue() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        assertTrue(NodeUtil.isImmutableValue(notNode));
    }

    @Test
    public void testIsImmutableValue_void() throws Exception {
        Node voidNode = new Node(Token.VOID);
        assertTrue(NodeUtil.isImmutableValue(voidNode));
    }

    @Test
    public void testIsImmutableValue_negNumber() throws Exception {
        Node num = Node.newNumber(10.0);
        Node negNode = new Node(Token.NEG, num);
        assertTrue(NodeUtil.isImmutableValue(negNode));
    }

    @Test
    public void testIsImmutableValue_nameUndefined() throws Exception {
        Node n = Node.newString("undefined");
        n.setType(Token.NAME);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_nameNaN() throws Exception {
        Node n = Node.newString("NaN");
        n.setType(Token.NAME);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_nameInfinity() throws Exception {
        Node n = Node.newString("Infinity");
        n.setType(Token.NAME);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_nameOther() throws Exception {
        Node n = Node.newString("someVar");
        n.setType(Token.NAME);
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_regexpLiteral() throws Exception {
        Node n = new Node(Token.REGEXP);
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsLiteralValue_stringLiteral() throws Exception {
        Node n = Node.newString("hello");
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_numberLiteral() throws Exception {
        Node n = Node.newNumber(123.45);
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_nullLiteral() throws Exception {
        Node n = new Node(Token.NULL);
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
    public void testIsLiteralValue_undefinedName() throws Exception {
        Node n = Node.newString("undefined");
        n.setType(Token.NAME);
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_NaNName() throws Exception {
        Node n = Node.newString("NaN");
        n.setType(Token.NAME);
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_InfinityName() throws Exception {
        Node n = Node.newString("Infinity");
        n.setType(Token.NAME);
        assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_variableName() throws Exception {
        Node n = Node.newString("myVar");
        n.setType(Token.NAME);
        assertFalse(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_notTrue() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        assertTrue(NodeUtil.isLiteralValue(notNode, false));
    }

    @Test
    public void testIsLiteralValue_voidNode() throws Exception {
        Node voidNode = new Node(Token.VOID);
        assertTrue(NodeUtil.isLiteralValue(voidNode, false));
    }

    @Test
    public void testIsLiteralValue_negNumber() throws Exception {
        Node num = Node.newNumber(10.0);
        Node negNode = new Node(Token.NEG, num);
        assertTrue(NodeUtil.isLiteralValue(negNode, false));
    }

    @Test
    public void testIsLiteralValue_arrayLiteralWithLiterals() throws Exception {
        Node child1 = Node.newString("a");
        Node child2 = Node.newNumber(1);
        Node arrayLit = new Node(Token.ARRAYLIT, child1, child2);
        assertTrue(NodeUtil.isLiteralValue(arrayLit, false));
    }

    @Test
    public void testIsLiteralValue_arrayLiteralWithNonLiteral() throws Exception {
        Node varName = Node.newString("myVar");
        varName.setType(Token.NAME);
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), varName);
        assertFalse(NodeUtil.isLiteralValue(arrayLit, false));
    }

    @Test
    public void testIsLiteralValue_objectLiteralWithLiterals() throws Exception {
        Node prop1Value = Node.newString("a");
        Node prop1Key = Node.newString("key1");
        Node prop1 = new Node(Token.GET, prop1Key, prop1Value);

        Node prop2Value = Node.newNumber(1);
        Node prop2Key = Node.newString("key2");
        Node prop2 = new Node(Token.GET, prop2Key, prop2Value);

        Node objectLit = new Node(Token.OBJECTLIT, prop1, prop2);
        assertTrue(NodeUtil.isLiteralValue(objectLit, false));
    }

    @Test
    public void testIsLiteralValue_objectLiteralWithNonLiteral() throws Exception {
        Node varName = Node.newString("myVar");
        varName.setType(Token.NAME);
        Node propKey = Node.newString("key1");
        Node prop = new Node(Token.GET, propKey, varName);

        Node objectLit = new Node(Token.OBJECTLIT, prop);
        assertFalse(NodeUtil.isLiteralValue(objectLit, false));
    }

    @Test
    public void testIsLiteralValue_functionExpressionIncluded() throws Exception {
        Node fnExpr = new Node(Token.FUNCTION, Node.newString(""));
        assertTrue(NodeUtil.isLiteralValue(fnExpr, true));
    }

    @Test
    public void testIsLiteralValue_functionExpressionExcluded() throws Exception {
        Node fnExpr = new Node(Token.FUNCTION, Node.newString(""));
        assertFalse(NodeUtil.isLiteralValue(fnExpr, false));
    }

    @Test
    public void testIsLiteralValue_functionDeclarationExcluded() throws Exception {
        Node fnDecl = new Node(Token.FUNCTION, Node.newString("myFunc"));
        // Mark it as a statement to simulate a declaration
        Node dummyParent = new Node(Token.BLOCK); // Parent must exist for isStatement check
        dummyParent.addChildToBack(fnDecl);
        assertTrue(NodeUtil.isFunctionDeclaration(fnDecl)); // Assume this helper works
        assertFalse(NodeUtil.isLiteralValue(fnDecl, true));
        assertFalse(NodeUtil.isLiteralValue(fnDecl, false));
    }


    @Test
    public void testIsValidDefineValue_string() throws Exception {
        Set<String> defines = Collections.emptySet();
        Node val = Node.newString("hello");
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_number() throws Exception {
        Set<String> defines = Collections.emptySet();
        Node val = Node.newNumber(123.45);
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_true() throws Exception {
        Set<String> defines = Collections.emptySet();
        Node val = new Node(Token.TRUE);
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_false() throws Exception {
        Set<String> defines = Collections.emptySet();
        Node val = new Node(Token.FALSE);
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_addValid() throws Exception {
        Set<String> defines = Collections.emptySet();
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node add = new Node(Token.ADD, left, right);
        assertTrue(NodeUtil.isValidDefineValue(add, defines));
    }

    @Test
    public void testIsValidDefineValue_addInvalidString() throws Exception {
        Set<String> defines = Collections.emptySet();
        Node left = Node.newString("a");
        Node right = Node.newNumber(2);
        Node add = new Node(Token.ADD, left, right);
        assertFalse(NodeUtil.isValidDefineValue(add, defines));
    }

    @Test
    public void testIsValidDefineValue_notValid() throws Exception {
        Set<String> defines = Collections.emptySet();
        Node child = Node.newNumber(1);
        Node not = new Node(Token.NOT, child);
        assertTrue(NodeUtil.isValidDefineValue(not, defines));
    }

    @Test
    public void testIsValidDefineValue_negValid() throws Exception {
        Set<String> defines = Collections.emptySet();
        Node child = Node.newNumber(1);
        Node neg = new Node(Token.NEG, child);
        assertTrue(NodeUtil.isValidDefineValue(neg, defines));
    }

    @Test
    public void testIsValidDefineValue_nameDefine() throws Exception {
        Set<String> defines = new HashSet<>(Arrays.asList("MY_DEFINE"));
        Node name = Node.newString("MY_DEFINE");
        name.setType(Token.NAME);
        assertTrue(NodeUtil.isValidDefineValue(name, defines));
    }

    @Test
    public void testIsValidDefineValue_nameNotDefine() throws Exception {
        Set<String> defines = Collections.emptySet();
        Node name = Node.newString("myVar");
        name.setType(Token.NAME);
        assertFalse(NodeUtil.isValidDefineValue(name, defines));
    }

    @Test
    public void testIsValidDefineValue_qualifiedNameDefine() throws Exception {
        Set<String> defines = new HashSet<>(Arrays.asList("ns.MY_DEFINE"));
        Node qualifiedName = Node.newString("ns.MY_DEFINE");
        qualifiedName.setType(Token.GETPROP);
        assertTrue(NodeUtil.isValidDefineValue(qualifiedName, defines));
    }

    @Test
    public void testIsValidDefineValue_qualifiedNameNotDefine() throws Exception {
        Set<String> defines = Collections.emptySet();
        Node qualifiedName = Node.newString("ns.myVar");
        qualifiedName.setType(Token.GETPROP);
        assertFalse(NodeUtil.isValidDefineValue(qualifiedName, defines));
    }

    @Test
    public void testIsEmptyBlock_emptyBlock() throws Exception {
        Node block = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_blockWithEmptyStatement() throws Exception {
        Node block = new Node(Token.BLOCK, new Node(Token.EMPTY));
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_blockWithNonEmptyStatement() throws Exception {
        Node block = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT));
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
    public void testIsSimpleOperatorType_add() throws Exception {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    }

    @Test
    public void testIsSimpleOperatorType_assignAdd() throws Exception {
        assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN_ADD));
    }

    @Test
    public void testIsSimpleOperatorType_and() throws Exception {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.AND));
    }

    @Test
    public void testIsSimpleOperatorType_or() throws Exception {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.OR));
    }

    @Test
    public void testIsSimpleOperatorType_hook() throws Exception {
        assertFalse(NodeUtil.isSimpleOperatorType(Token.HOOK));
    }

    @Test
    public void testNewExpr_basic() throws Exception {
        Node child = Node.newString("test");
        Node exprResult = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, exprResult.getType());
        assertSame(child, exprResult.getFirstChild());
    }

    @Test
    public void testMayHaveSideEffects_call() throws Exception {
        Node callNode = new Node(Token.CALL);
        // This is a simplified test; the actual side effect check is complex.
        // Assuming a basic CALL node might have side effects.
        assertTrue(NodeUtil.mayHaveSideEffects(callNode));
    }

    @Test
    public void testMayHaveSideEffects_new() throws Exception {
        Node newNode = new Node(Token.NEW);
        assertTrue(NodeUtil.mayHaveSideEffects(newNode));
    }

    @Test
    public void testMayHaveSideEffects_assignment() throws Exception {
        Node assignNode = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.mayHaveSideEffects(assignNode));
    }

    @Test
    public void testMayHaveSideEffects_numberLiteral() throws Exception {
        Node numLit = Node.newNumber(5);
        assertFalse(NodeUtil.mayHaveSideEffects(numLit));
    }

    @Test
    public void testMayHaveSideEffects_stringLiteral() throws Exception {
        Node strLit = Node.newString("hello");
        assertFalse(NodeUtil.mayHaveSideEffects(strLit));
    }

    @Test
    public void testConstructorCallHasSideEffects_builtinWithoutSideEffects() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("Array"));
        newNode.setType(Token.NEW); // Ensure type is set
        assertFalse(NodeUtil.constructorCallHasSideEffects(newNode));
    }

    @Test
    public void testConstructorCallHasSideEffects_customConstructor() throws Exception {
        Node newNode = new Node(Token.NEW, Node.newString("MyClass"));
        newNode.setType(Token.NEW); // Ensure type is set
        assertTrue(NodeUtil.constructorCallHasSideEffects(newNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_builtinWithoutSideEffects() throws Exception {
        Node callNode = new Node(Token.CALL, Node.newString("Object"));
        callNode.setType(Token.CALL); // Ensure type is set
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_customFunction() throws Exception {
        Node callNode = new Node(Token.CALL, Node.newString("myFunc"));
        callNode.setType(Token.CALL); // Ensure type is set
        assertTrue(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffects_stringReplace() throws Exception {
        Node callNode = new Node(Token.CALL,
            new Node(Token.GETPROP,
                Node.newString("someString"),
                Node.newString("replace")),
            Node.newString("a"), Node.newString("b"));
        callNode.setType(Token.CALL);
        // Assuming no global RegExp references for this test
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode, null));
    }

    @Test
    public void testCallHasLocalResult_true() throws Exception {
        Node callNode = new Node(Token.CALL);
        callNode.putBooleanProp(Node.FLAG_LOCAL_RESULTS, true);
        assertTrue(NodeUtil.callHasLocalResult(callNode));
    }

    @Test
    public void testCallHasLocalResult_false() throws Exception {
        Node callNode = new Node(Token.CALL);
        callNode.putBooleanProp(Node.FLAG_LOCAL_RESULTS, false);
        assertFalse(NodeUtil.callHasLocalResult(callNode));
    }

    @Test
    public void testNewHasLocalResult_true() throws Exception {
        Node newNode = new Node(Token.NEW);
        newNode.putBooleanProp(Node.SIDE_EFFECT_FLAGS, true); // isOnlyModifiesThisCall is related to side effect flags
        assertTrue(NodeUtil.newHasLocalResult(newNode));
    }

    @Test
    public void testNewHasLocalResult_false() throws Exception {
        Node newNode = new Node(Token.NEW);
        newNode.putBooleanProp(Node.SIDE_EFFECT_FLAGS, false);
        assertFalse(NodeUtil.newHasLocalResult(newNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_assign() throws Exception {
        Node assignNode = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(assignNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_call() throws Exception {
        Node callNode = new Node(Token.CALL);
        // This depends on functionCallHasSideEffects, assuming true for a generic CALL
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(callNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_new() throws Exception {
        Node newNode = new Node(Token.NEW);
        // This depends on constructorCallHasSideEffects, assuming true for a generic NEW
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(newNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_number() throws Exception {
        Node numNode = Node.newNumber(5);
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(numNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_var() throws Exception {
        Node varNode = new Node(Token.VAR, Node.newString("x"));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(varNode));
    }

    @Test
    public void testCanBeSideEffected_call() throws Exception {
        Node callNode = new Node(Token.CALL);
        assertTrue(NodeUtil.canBeSideEffected(callNode));
    }

    @Test
    public void testCanBeSideEffected_nameConstant() throws Exception {
        Node nameNode = Node.newString("CONST");
        nameNode.setType(Token.NAME);
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertFalse(NodeUtil.canBeSideEffected(nameNode, Collections.emptySet()));
    }

    @Test
    public void testCanBeSideEffected_nameKnownConstant() throws Exception {
        Node nameNode = Node.newString("myVar");
        nameNode.setType(Token.NAME);
        Set<String> knownConstants = new HashSet<>(Arrays.asList("myVar"));
        assertFalse(NodeUtil.canBeSideEffected(nameNode, knownConstants));
    }

    @Test
    public void testCanBeSideEffected_nameUnknown() throws Exception {
        Node nameNode = Node.newString("myVar");
        nameNode.setType(Token.NAME);
        assertFalse(NodeUtil.canBeSideEffected(nameNode, Collections.emptySet()));
    }

    @Test
    public void testCanBeSideEffected_getProp() throws Exception {
        Node obj = Node.newString("obj");
        obj.setType(Token.NAME);
        Node prop = Node.newString("prop");
        Node getPropNode = new Node(Token.GETPROP, obj, prop);
        assertTrue(NodeUtil.canBeSideEffected(getPropNode));
    }

    @Test
    public void testCanBeSideEffected_functionExpression() throws Exception {
        Node fnExpr = new Node(Token.FUNCTION);
        // Mark it as not a statement to ensure it's treated as an expression
        Node dummyParent = new Node(Token.LP); // Dummy parent type
        dummyParent.addChildToBack(fnExpr);
        assertFalse(NodeUtil.canBeSideEffected(fnExpr, Collections.emptySet()));
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
    public void testPrecedence_or() throws Exception {
        assertEquals(3, NodeUtil.precedence(Token.OR));
    }

    @Test
    public void testPrecedence_and() throws Exception {
        assertEquals(4, NodeUtil.precedence(Token.AND));
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
    public void testValueCheck_stringLiteral() throws Exception {
        Node n = Node.newString("hello");
        assertTrue(NodeUtil.valueCheck(n, NodeUtil.MAY_BE_STRING_PREDICATE));
    }

    @Test
    public void testValueCheck_numberLiteral() throws Exception {
        Node n = Node.newNumber(123);
        assertFalse(NodeUtil.valueCheck(n, NodeUtil.MAY_BE_STRING_PREDICATE));
    }

    @Test
    public void testIsNumericResult_addWithNumbers() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node add = new Node(Token.ADD, left, right);
        assertTrue(NodeUtil.isNumericResult(add));
    }

    @Test
    public void testIsNumericResult_addWithString() throws Exception {
        Node left = Node.newString("a");
        Node right = Node.newNumber(2);
        Node add = new Node(Token.ADD, left, right);
        assertFalse(NodeUtil.isNumericResult(add));
    }

    @Test
    public void testIsNumericResultHelper_add() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node add = new Node(Token.ADD, left, right);
        assertTrue(NodeUtil.isNumericResultHelper(add));
    }

    @Test
    public void testIsNumericResultHelper_mul() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node mul = new Node(Token.MUL, left, right);
        assertTrue(NodeUtil.isNumericResultHelper(mul));
    }

    @Test
    public void testIsNumericResultHelper_string() throws Exception {
        Node str = Node.newString("abc");
        assertFalse(NodeUtil.isNumericResultHelper(str));
    }

    @Test
    public void testIsBooleanResult_eq() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node eq = new Node(Token.EQ, left, right);
        assertTrue(NodeUtil.isBooleanResult(eq));
    }

    @Test
    public void testIsBooleanResult_string() throws Exception {
        Node str = Node.newString("abc");
        assertFalse(NodeUtil.isBooleanResult(str));
    }

    @Test
    public void testIsBooleanResultHelper_eq() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node eq = new Node(Token.EQ, left, right);
        assertTrue(NodeUtil.isBooleanResultHelper(eq));
    }

    @Test
    public void testIsBooleanResultHelper_not() throws Exception {
        Node child = Node.newNumber(1);
        Node not = new Node(Token.NOT, child);
        assertTrue(NodeUtil.isBooleanResultHelper(not));
    }

    @Test
    public void testIsBooleanResultHelper_delprop() throws Exception {
        Node child = Node.newString("prop");
        Node delprop = new Node(Token.DELPROP, child);
        assertTrue(NodeUtil.isBooleanResultHelper(delprop));
    }

    @Test
    public void testIsUndefined_voidNode() throws Exception {
        Node n = new Node(Token.VOID);
        assertTrue(NodeUtil.isUndefined(n));
    }

    @Test
    public void testIsUndefined_nameUndefined() throws Exception {
        Node n = Node.newString("undefined");
        n.setType(Token.NAME);
        assertTrue(NodeUtil.isUndefined(n));
    }

    @Test
    public void testIsUndefined_nameOther() throws Exception {
        Node n = Node.newString("other");
        n.setType(Token.NAME);
        assertFalse(NodeUtil.isUndefined(n));
    }

    @Test
    public void testIsNull_nullNode() throws Exception {
        Node n = new Node(Token.NULL);
        assertTrue(NodeUtil.isNull(n));
    }

    @Test
    public void testIsNull_otherNode() throws Exception {
        Node n = Node.newString("null");
        n.setType(Token.STRING);
        assertFalse(NodeUtil.isNull(n));
    }

    @Test
    public void testIsNullOrUndefined_nullNode() throws Exception {
        Node n = new Node(Token.NULL);
        assertTrue(NodeUtil.isNullOrUndefined(n));
    }

    @Test
    public void testIsNullOrUndefined_voidNode() throws Exception {
        Node n = new Node(Token.VOID);
        assertTrue(NodeUtil.isNullOrUndefined(n));
    }

    @Test
    public void testIsNullOrUndefined_nameUndefined() throws Exception {
        Node n = Node.newString("undefined");
        n.setType(Token.NAME);
        assertTrue(NodeUtil.isNullOrUndefined(n));
    }

    @Test
    public void testIsNullOrUndefined_otherNode() throws Exception {
        Node n = Node.newString("test");
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
    public void testMayBeString_addWithOneString() throws Exception {
        Node left = Node.newString("a");
        Node right = Node.newNumber(1);
        Node add = new Node(Token.ADD, left, right);
        assertTrue(NodeUtil.mayBeString(add));
    }

    @Test
    public void testMayBeString_addWithTwoNumbers() throws Exception {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node add = new Node(Token.ADD, left, right);
        assertFalse(NodeUtil.mayBeString(add));
    }

    @Test
    public void testMayBeStringHelper_stringLiteral() throws Exception {
        Node n = Node.newString("hello");
        assertTrue(NodeUtil.mayBeStringHelper(n));
    }

    @Test
    public void testMayBeStringHelper_numberLiteral() throws Exception {
        Node n = Node.newNumber(123);
        assertFalse(NodeUtil.mayBeStringHelper(n));
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
    public void testIsCommutative_mul() throws Exception {
        assertTrue(NodeUtil.isCommutative(Token.MUL));
    }

    @Test
    public void testIsCommutative_add() throws Exception {
        assertFalse(NodeUtil.isCommutative(Token.ADD));
    }

    @Test
    public void testIsCommutative_xor() throws Exception {
        assertTrue(NodeUtil.isCommutative(Token.BITXOR));
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

    @Test
    public void testIsExpressionNode_exprResult() throws Exception {
        assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    }

    @Test
    public void testIsExpressionNode_call() throws Exception {
        assertFalse(NodeUtil.isExpressionNode(new Node(Token.CALL)));
    }

    @Test
    public void testContainsFunction_functionNode() throws Exception {
        Node fn = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.containsFunction(fn));
    }

    @Test
    public void testContainsFunction_blockWithFunction() throws Exception {
        Node fn = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK, fn);
        assertTrue(NodeUtil.containsFunction(block));
    }

    @Test
    public void testContainsFunction_noFunction() throws Exception {
        Node block = new Node(Token.BLOCK);
        assertFalse(NodeUtil.containsFunction(block));
    }

    @Test
    public void testReferencesThis_functionWithThis() throws Exception {
        Node thisNode = new Node(Token.THIS);
        Node fnBody = new Node(Token.BLOCK, thisNode);
        Node fn = new Node(Token.FUNCTION, Node.newString(""), Node.newString(""), fnBody);
        assertTrue(NodeUtil.referencesThis(fn));
    }

    @Test
    public void testReferencesThis_functionWithoutThis() throws Exception {
        Node fnBody = new Node(Token.BLOCK, Node.newString("hello"));
        Node fn = new Node(Token.FUNCTION, Node.newString(""), Node.newString(""), fnBody);
        assertFalse(NodeUtil.referencesThis(fn));
    }

    @Test
    public void testIsGet_getProp() throws Exception {
        Node n = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isGet(n));
    }

    @Test
    public void testIsGet_getElem() throws Exception {
        Node n = new Node(Token.GETELEM);
        assertTrue(NodeUtil.isGet(n));
    }

    @Test
    public void testIsGet_name() throws Exception {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.isGet(n));
    }

    @Test
    public void testIsGetProp_getProp() throws Exception {
        Node n = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isGetProp(n));
    }

    @Test
    public void testIsGetProp_getElem() throws Exception {
        Node n = new Node(Token.GETELEM);
        assertFalse(NodeUtil.isGetProp(n));
    }

    @Test
    public void testIsName_nameNode() throws Exception {
        Node n = new Node(Token.NAME);
        assertTrue(NodeUtil.isName(n));
    }

    @Test
    public void testIsName_stringNode() throws Exception {
        Node n = Node.newString("test");
        assertFalse(NodeUtil.isName(n));
    }

    @Test
    public void testIsNew_newNode() throws Exception {
        Node n = new Node(Token.NEW);
        assertTrue(NodeUtil.isNew(n));
    }

    @Test
    public void testIsNew_callNode() throws Exception {
        Node n = new Node(Token.CALL);
        assertFalse(NodeUtil.isNew(n));
    }

    @Test
    public void testIsVar_varNode() throws Exception {
        Node n = new Node(Token.VAR, Node.newString("x"));
        assertTrue(NodeUtil.isVar(n));
    }

    @Test
    public void testIsVar_nameNode() throws Exception {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.isVar(n));
    }

    @Test
    public void testIsVarDeclaration_true() throws Exception {
        Node name = Node.newString("x");
        Node var = new Node(Token.VAR, name);
        assertTrue(NodeUtil.isVarDeclaration(name));
    }

    @Test
    public void testIsVarDeclaration_false() throws Exception {
        Node name = Node.newString("x");
        Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
        assertFalse(NodeUtil.isVarDeclaration(name));
    }

    @Test
    public void testGetAssignedValue_var() throws Exception {
        Node value = Node.newNumber(10);
        Node name = Node.newString("x");
        Node var = new Node(Token.VAR, name);
        name.addChildToBack(value); // Simulate assignment in VAR
        assertEquals(value, NodeUtil.getAssignedValue(name));
    }

    @Test
    public void testGetAssignedValue_assign() throws Exception {
        Node value = Node.newNumber(10);
        Node name = Node.newString("x");
        Node assign = new Node(Token.ASSIGN, name, value);
        assertEquals(value, NodeUtil.getAssignedValue(name));
    }

    @Test
    public void testGetAssignedValue_notAssigned() throws Exception {
        Node name = Node.newString("x");
        Node parent = new Node(Token.NAME, name); // Parent is not VAR or ASSIGN
        assertNull(NodeUtil.getAssignedValue(name));
    }

    @Test
    public void testIsString_stringNode() throws Exception {
        Node n = Node.newString("test");
        assertTrue(NodeUtil.isString(n));
    }

    @Test
    public void testIsString_nameNode() throws Exception {
        Node n = Node.newString("test");
        n.setType(Token.NAME);
        assertFalse(NodeUtil.isString(n));
    }

    @Test
    public void testIsExprAssign_true() throws Exception {
        Node assign = new Node(Token.ASSIGN);
        Node exprResult = new Node(Token.EXPR_RESULT, assign);
        assertTrue(NodeUtil.isExprAssign(exprResult));
    }

    @Test
    public void testIsExprAssign_false() throws Exception {
        Node call = new Node(Token.CALL);
        Node exprResult = new Node(Token.EXPR_RESULT, call);
        assertFalse(NodeUtil.isExprAssign(exprResult));
    }

    @Test
    public void testIsAssign_assignNode() throws Exception {
        assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    }

    @Test
    public void testIsAssign_addNode() throws Exception {
        assertFalse(NodeUtil.isAssign(new Node(Token.ADD)));
    }

    @Test
    public void testIsExprCall_true() throws Exception {
        Node call = new Node(Token.CALL);
        Node exprResult = new Node(Token.EXPR_RESULT, call);
        assertTrue(NodeUtil.isExprCall(exprResult));
    }

    @Test
    public void testIsExprCall_false() throws Exception {
        Node assign = new Node(Token.ASSIGN);
        Node exprResult = new Node(Token.EXPR_RESULT, assign);
        assertFalse(NodeUtil.isExprCall(exprResult));
    }

    @Test
    public void testIsForIn_true() throws Exception {
        Node forNode = new Node(Token.FOR,
            Node.newString("var"), Node.newString("item"), Node.newString("list"), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsForIn_false() throws Exception {
        Node forNode = new Node(Token.FOR, Node.newString("init"), Node.newString("cond"), Node.newString("next"), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsLoopStructure_for() throws Exception {
        Node forNode = new Node(Token.FOR);
        assertTrue(NodeUtil.isLoopStructure(forNode));
    }

    @Test
    public void testIsLoopStructure_while() throws Exception {
        Node whileNode = new Node(Token.WHILE);
        assertTrue(NodeUtil.isLoopStructure(whileNode));
    }

    @Test
    public void testIsLoopStructure_do() throws Exception {
        Node doNode = new Node(Token.DO);
        assertTrue(NodeUtil.isLoopStructure(doNode));
    }

    @Test
    public void testIsLoopStructure_if() throws Exception {
        Node ifNode = new Node(Token.IF);
        assertFalse(NodeUtil.isLoopStructure(ifNode));
    }

    @Test
    public void testGetLoopCodeBlock_for() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, Node.newString("init"), Node.newString("cond"), Node.newString("next"), body);
        assertEquals(body, NodeUtil.getLoopCodeBlock(forNode));
    }

    @Test
    public void testGetLoopCodeBlock_while() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, Node.newString("cond"), body);
        assertEquals(body, NodeUtil.getLoopCodeBlock(whileNode));
    }

    @Test
    public void testGetLoopCodeBlock_do() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node doNode = new Node(Token.DO, body, Node.newString("cond"));
        assertEquals(body, NodeUtil.getLoopCodeBlock(doNode));
    }

    @Test
    public void testIsWithinLoop_true() throws Exception {
        Node loopBody = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, Node.newString("cond"), loopBody);
        // Test on a node inside the loop. If loopBody is empty, getFirstChild() is null.
        // To ensure we test a node within the loop, we create a simple statement.
        loopBody.addChildToBack(Node.newString("statement"));
        assertTrue(NodeUtil.isWithinLoop(loopBody.getFirstChild()));
    }

    @Test
    public void testIsWithinLoop_false() throws Exception {
        Node block = new Node(Token.BLOCK);
        assertFalse(NodeUtil.isWithinLoop(block));
    }

    @Test
    public void testIsControlStructure_if() throws Exception {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    }

    @Test
    public void testIsControlStructure_for() throws Exception {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsControlStructure_block() throws Exception {
        assertFalse(NodeUtil.isControlStructure(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsControlStructureCodeBlock_ifTrue() throws Exception {
        Node cond = Node.newString("cond");
        Node then = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, cond, then);
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, then));
    }

    @Test
    public void testIsControlStructureCodeBlock_ifFalse() throws Exception {
        Node cond = Node.newString("cond");
        Node then = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, cond, then);
        assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, cond));
    }

    @Test
    public void testIsControlStructureCodeBlock_forTrue() throws Exception {
        Node init = Node.newString("init");
        Node cond = Node.newString("cond");
        Node next = Node.newString("next");
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, cond, next, body);
        assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, body));
    }

    @Test
    public void testIsControlStructureCodeBlock_forFalse() throws Exception {
        Node init = Node.newString("init");
        Node cond = Node.newString("cond");
        Node next = Node.newString("next");
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, cond, next, body);
        assertFalse(NodeUtil.isControlStructureCodeBlock(forNode, init));
    }

    @Test
    public void testGetConditionExpression_if() throws Exception {
        Node cond = Node.newString("cond");
        Node then = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, cond, then);
        assertEquals(cond, NodeUtil.getConditionExpression(ifNode));
    }

    @Test
    public void testGetConditionExpression_while() throws Exception {
        Node cond = Node.newString("cond");
        Node body = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, cond, body);
        assertEquals(cond, NodeUtil.getConditionExpression(whileNode));
    }

    @Test
    public void testGetConditionExpression_do() throws Exception {
        Node cond = Node.newString("cond");
        Node body = new Node(Token.BLOCK);
        Node doNode = new Node(Token.DO, body, cond);
        assertEquals(cond, NodeUtil.getConditionExpression(doNode));
    }

    @Test
    public void testGetConditionExpression_forWithCond() throws Exception {
        Node init = Node.newString("init");
        Node cond = Node.newString("cond");
        Node next = Node.newString("next");
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, cond, next, body); // 4 children
        assertEquals(cond, NodeUtil.getConditionExpression(forNode));
    }

    @Test
    public void testGetConditionExpression_forNoCond() throws Exception {
        Node init = Node.newString("init");
        Node next = Node.newString("next");
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, next, body); // 3 children
        assertNull(NodeUtil.getConditionExpression(forNode));
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
    public void testIsStatement_true() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node child = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(child);
        assertTrue(NodeUtil.isStatement(child));
    }

    @Test
    public void testIsStatement_false() throws Exception {
        Node parent = new Node(Token.FUNCTION);
        Node child = new Node(Token.BLOCK);
        parent.addChildToBack(child);
        assertFalse(NodeUtil.isStatement(child));
    }

    @Test
    public void testIsStatementParent_block() throws Exception {
        assertTrue(NodeUtil.isStatementParent(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsStatementParent_script() throws Exception {
        assertTrue(NodeUtil.isStatementParent(new Node(Token.SCRIPT)));
    }

    @Test
    public void testIsStatementParent_label() throws Exception {
        assertTrue(NodeUtil.isStatementParent(new Node(Token.LABEL)));
    }

    @Test
    public void testIsStatementParent_function() throws Exception {
        assertFalse(NodeUtil.isStatementParent(new Node(Token.FUNCTION)));
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
    public void testIsReferenceName_name() throws Exception {
        Node name = Node.newString("myVar");
        name.setType(Token.NAME);
        assertTrue(NodeUtil.isReferenceName(name));
    }

    @Test
    public void testIsReferenceName_emptyName() throws Exception {
        Node name = Node.newString("");
        name.setType(Token.NAME);
        assertFalse(NodeUtil.isReferenceName(name));
    }

    @Test
    public void testIsLabelName_labelNameNode() throws Exception {
        Node labelName = new Node(Token.LABEL_NAME);
        assertTrue(NodeUtil.isLabelName(labelName));
    }

    @Test
    public void testIsLabelName_nameNode() throws Exception {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isLabelName(name));
    }

    @Test
    public void testIsTryFinallyNode_true() throws Exception {
        Node finallyBlock = new Node(Token.BLOCK);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), finallyBlock); // 3 children
        assertTrue(NodeUtil.isTryFinallyNode(tryNode, finallyBlock));
    }

    @Test
    public void testIsTryFinallyNode_false() throws Exception {
        Node catchBlock = new Node(Token.BLOCK);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchBlock); // 2 children
        assertFalse(NodeUtil.isTryFinallyNode(tryNode, catchBlock));
    }

    @Test
    public void testIsTryCatchNodeContainer_true() throws Exception {
        Node catchBlock = new Node(Token.CATCH);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchBlock, new Node(Token.BLOCK));
        Node catchContainer = new Node(Token.BLOCK); // The container for CATCH
        catchContainer.addChildToBack(catchBlock);
        assertTrue(NodeUtil.isTryCatchNodeContainer(catchContainer));
    }

    @Test
    public void testIsTryCatchNodeContainer_false() throws Exception {
        Node block = new Node(Token.BLOCK);
        assertFalse(NodeUtil.isTryCatchNodeContainer(block));
    }

    @Test
    public void testRemoveChild_simpleBlockRemoval() throws Exception {
        Node parentBlock = new Node(Token.BLOCK);
        Node childToRemove = new Node(Token.EXPR_RESULT);
        parentBlock.addChildToBack(childToRemove);
        NodeUtil.removeChild(parentBlock, childToRemove);
        assertNull(parentBlock.getFirstChild());
    }

    @Test
    public void testRemoveChild_varRemoval() throws Exception {
        Node nameNode = Node.newString("x");
        Node varNode = new Node(Token.VAR, nameNode);
        Node parent = new Node(Token.BLOCK, varNode);
        NodeUtil.removeChild(parent, varNode);
        assertNull(parent.getFirstChild());
    }

    @Test
    public void testRemoveChild_labelRemoval() throws Exception {
        Node labeledStatement = new Node(Token.EXPR_RESULT);
        Node labelNode = new Node(Token.LABEL, Node.newString("myLabel"), labeledStatement);
        Node parent = new Node(Token.BLOCK, labelNode);
        NodeUtil.removeChild(parent, labelNode);
        assertNull(parent.getFirstChild());
    }

    @Test
    public void testMaybeAddFinally_noFinally() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK)); // No finally
        NodeUtil.maybeAddFinally(tryNode);
        assertEquals(3, tryNode.getChildCount());
        assertEquals(Token.BLOCK, tryNode.getLastChild().getType());
    }

    @Test
    public void testMaybeAddFinally_hasFinally() throws Exception {
        Node finallyBlock = new Node(Token.BLOCK);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), finallyBlock); // Has finally
        NodeUtil.maybeAddFinally(tryNode);
        assertEquals(3, tryNode.getChildCount()); // Should not add another finally
        assertSame(finallyBlock, tryNode.getLastChild());
    }

    @Test
    public void testTryMergeBlock_parentIsBlock() throws Exception {
        Node parentBlock = new Node(Token.BLOCK);
        Node child1 = Node.newString("a");
        Node child2 = Node.newString("b");
        Node blockToMerge = new Node(Token.BLOCK, child1, child2);
        parentBlock.addChildToBack(blockToMerge);
        NodeUtil.tryMergeBlock(blockToMerge);
        assertEquals(2, parentBlock.getChildCount());
        assertSame(child1, parentBlock.getFirstChild());
        assertSame(child2, parentBlock.getLastChild());
    }

    @Test
    public void testTryMergeBlock_parentIsNotBlock() throws Exception {
        Node parentLabel = new Node(Token.LABEL, Node.newString("lbl"));
        Node child1 = Node.newString("a");
        Node blockToMerge = new Node(Token.BLOCK, child1);
        parentLabel.addChildToBack(blockToMerge);
        assertFalse(NodeUtil.tryMergeBlock(blockToMerge));
        assertEquals(1, parentLabel.getChildCount()); // Block should not be merged
        assertSame(blockToMerge, parentLabel.getLastChild());
    }

    @Test
    public void testIsCall_callNode() throws Exception {
        assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    }

    @Test
    public void testIsCall_newNode() throws Exception {
        assertFalse(NodeUtil.isCall(new Node(Token.NEW)));
    }

    @Test
    public void testIsCallOrNew_callNode() throws Exception {
        assertTrue(NodeUtil.isCallOrNew(new Node(Token.CALL)));
    }

    @Test
    public void testIsCallOrNew_newNode() throws Exception {
        assertTrue(NodeUtil.isCallOrNew(new Node(Token.NEW)));
    }

    @Test
    public void testIsCallOrNew_nameNode() throws Exception {
        assertFalse(NodeUtil.isCallOrNew(new Node(Token.NAME)));
    }

    @Test
    public void testIsFunction_functionNode() throws Exception {
        assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsFunction_blockNode() throws Exception {
        assertFalse(NodeUtil.isFunction(new Node(Token.BLOCK)));
    }

    @Test
    public void testGetFunctionBody_basic() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = new Node(Token.FUNCTION, Node.newString("name"), Node.newString("params"), body);
        assertEquals(body, NodeUtil.getFunctionBody(fn));
    }

    @Test
    public void testIsThis_thisNode() throws Exception {
        assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    }

    @Test
    public void testIsThis_nameNode() throws Exception {
        assertFalse(NodeUtil.isThis(new Node(Token.NAME)));
    }

    @Test
    public void testIsArrayLiteral_arrayLitNode() throws Exception {
        assertTrue(NodeUtil.isArrayLiteral(new Node(Token.ARRAYLIT)));
    }

    @Test
    public void testIsArrayLiteral_objectLitNode() throws Exception {
        assertFalse(NodeUtil.isArrayLiteral(new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testContainsCall_callNode() throws Exception {
        Node call = new Node(Token.CALL);
        assertTrue(NodeUtil.containsCall(call));
    }

    @Test
    public void testContainsCall_blockWithCall() throws Exception {
        Node call = new Node(Token.CALL);
        Node block = new Node(Token.BLOCK, call);
        assertTrue(NodeUtil.containsCall(block));
    }

    @Test
    public void testContainsCall_noCall() throws Exception {
        Node block = new Node(Token.BLOCK);
        assertFalse(NodeUtil.containsCall(block));
    }

    @Test
    public void testIsFunctionDeclaration_true() throws Exception {
        Node fn = new Node(Token.FUNCTION, Node.newString("foo"));
        Node dummyParent = new Node(Token.BLOCK); // Parent must exist for isStatement check
        dummyParent.addChildToBack(fn);
        assertTrue(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testIsFunctionDeclaration_false() throws Exception {
        Node fn = new Node(Token.FUNCTION, Node.newString("")); // No name, expression
        Node expr = new Node(Token.EXPR_RESULT, fn);
        assertFalse(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_true() throws Exception {
        Node fn = new Node(Token.FUNCTION, Node.newString("foo"));
        Node script = new Node(Token.SCRIPT, fn);
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_false() throws Exception {
        Node fn = new Node(Token.FUNCTION, Node.newString("foo"));
        Node block = new Node(Token.BLOCK, fn);
        assertFalse(NodeUtil.isHoistedFunctionDeclaration(fn));
    }

    @Test
    public void testIsFunctionExpression_true() throws Exception {
        Node fn = new Node(Token.FUNCTION, Node.newString("")); // No name, expression
        Node expr = new Node(Token.EXPR_RESULT, fn);
        assertTrue(NodeUtil.isFunctionExpression(fn));
    }

    @Test
    public void testIsFunctionExpression_false() throws Exception {
        Node fn = new Node(Token.FUNCTION, Node.newString("foo"));
        Node block = new Node(Token.BLOCK, fn); // Declaration
        assertFalse(NodeUtil.isFunctionExpression(fn));
    }

    @Test
    public void testIsEmptyFunctionExpression_true() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = new Node(Token.FUNCTION, Node.newString(""), body); // Expression with empty body
        assertTrue(NodeUtil.isEmptyFunctionExpression(fn));
    }

    @Test
    public void testIsEmptyFunctionExpression_falseNonEmptyBody() throws Exception {
        Node body = new Node(Token.BLOCK, Node.newString("return 1;"));
        Node fn = new Node(Token.FUNCTION, Node.newString(""), body); // Expression with non-empty body
        assertFalse(NodeUtil.isEmptyFunctionExpression(fn));
    }

    @Test
    public void testIsEmptyFunctionExpression_falseDeclaration() throws Exception {
        Node body = new Node(Token.BLOCK);
        Node fn = new Node(Token.FUNCTION, Node.newString("foo"), body); // Declaration
        assertFalse(NodeUtil.isEmptyFunctionExpression(fn));
    }

    @Test
    public void testIsVarArgsFunction_true() throws Exception {
        Node argumentsName = Node.newString("arguments");
        argumentsName.setType(Token.NAME);
        Node body = new Node(Token.BLOCK, argumentsName);
        Node fn = new Node(Token.FUNCTION, Node.newString("foo"), Node.newString("params"), body);
        assertTrue(NodeUtil.isVarArgsFunction(fn));
    }

    @Test
    public void testIsVarArgsFunction_false() throws Exception {
        Node body = new Node(Token.BLOCK, Node.newString("return 1;"));
        Node fn = new Node(Token.FUNCTION, Node.newString("foo"), Node.newString("params"), body);
        assertFalse(NodeUtil.isVarArgsFunction(fn));
    }

    @Test
    public void testIsObjectCallMethod_true() throws Exception {
        Node methodName = Node.newString("myMethod");
        Node prop = Node.newString("myMethod");
        Node obj = Node.newString("obj");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertTrue(NodeUtil.isObjectCallMethod(call, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_trueWithStringKey() throws Exception {
        Node methodName = Node.newString("myMethod");
        Node prop = Node.newString("myMethod");
        Node obj = Node.newString("obj");
        Node getElem = new Node(Token.GETELEM, obj, methodName); // obj['myMethod']
        Node call = new Node(Token.CALL, getElem, Node.newString("arg1"));
        assertTrue(NodeUtil.isObjectCallMethod(call, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_false() throws Exception {
        Node methodName = Node.newString("otherMethod");
        Node prop = Node.newString("otherMethod");
        Node obj = Node.newString("obj");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertFalse(NodeUtil.isObjectCallMethod(call, "myMethod"));
    }

    @Test
    public void testIsFunctionObjectCall_true() throws Exception {
        Node methodName = Node.newString("call");
        Node prop = Node.newString("call");
        Node obj = Node.newString("func");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertTrue(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsFunctionObjectCall_false() throws Exception {
        Node methodName = Node.newString("apply");
        Node prop = Node.newString("apply");
        Node obj = Node.newString("func");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertFalse(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsFunctionObjectApply_true() throws Exception {
        Node methodName = Node.newString("apply");
        Node prop = Node.newString("apply");
        Node obj = Node.newString("func");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertTrue(NodeUtil.isFunctionObjectApply(call));
    }

    @Test
    public void testIsFunctionObjectApply_false() throws Exception {
        Node methodName = Node.newString("call");
        Node prop = Node.newString("call");
        Node obj = Node.newString("func");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertFalse(NodeUtil.isFunctionObjectApply(call));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_callTrue() throws Exception {
        Node methodName = Node.newString("call");
        Node prop = Node.newString("call");
        Node obj = Node.newString("func");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(call));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_applyTrue() throws Exception {
        Node methodName = Node.newString("apply");
        Node prop = Node.newString("apply");
        Node obj = Node.newString("func");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(call));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_false() throws Exception {
        Node methodName = Node.newString("other");
        Node prop = Node.newString("other");
        Node obj = Node.newString("func");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertFalse(NodeUtil.isFunctionObjectCallOrApply(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_true() throws Exception {
        Node callTarget = Node.newString("call");
        Node prop = Node.newString("call");
        Node obj = Node.newString("func");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_falseNotNameRoot() throws Exception {
        Node callTarget = Node.newString("call");
        Node prop = Node.newString("call");
        Node obj = new Node(Token.GETPROP, Node.newString("obj"), Node.newString("prop")); // obj.prop.call
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_falseNotCallMethod() throws Exception {
        Node callTarget = Node.newString("apply");
        Node prop = Node.newString("apply");
        Node obj = Node.newString("func");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp, Node.newString("arg1"));
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsLhs_assignLeft() throws Exception {
        Node name = Node.newString("x");
        Node value = Node.newNumber(1);
        Node assign = new Node(Token.ASSIGN, name, value);
        assertTrue(NodeUtil.isLhs(name, assign));
    }

    @Test
    public void testIsLhs_varInit() throws Exception {
        Node name = Node.newString("x");
        Node value = Node.newNumber(1);
        Node var = new Node(Token.VAR, name);
        name.addChildToBack(value);
        assertTrue(NodeUtil.isLhs(name, var));
    }

    @Test
    public void testIsLhs_assignRight() throws Exception {
        Node name = Node.newString("x");
        Node value = Node.newNumber(1);
        Node assign = new Node(Token.ASSIGN, name, value);
        assertFalse(NodeUtil.isLhs(value, assign));
    }

    @Test
    public void testIsObjectLitKey_numberKey() throws Exception {
        Node key = Node.newNumber(1);
        Node parent = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testIsObjectLitKey_stringKey() throws Exception {
        Node key = Node.newString("key");
        Node parent = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testIsObjectLitKey_getKey() throws Exception {
        Node key = new Node(Token.GET);
        Node parent = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testIsObjectLitKey_notObjectLitParent() throws Exception {
        Node key = Node.newString("key");
        Node parent = new Node(Token.NAME);
        assertFalse(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testGetObjectLitKeyName_stringKey() throws Exception {
        Node key = Node.newString("myKey");
        assertEquals("myKey", NodeUtil.getObjectLitKeyName(key));
    }

    @Test
    public void testGetObjectLitKeyName_numberKey() throws Exception {
        Node key = Node.newNumber(123.0);
        assertEquals("123", NodeUtil.getObjectLitKeyName(key));
    }

    @Test
    public void testGetObjectLitKeyName_getKey() throws Exception {
        Node key = new Node(Token.GET);
        key.setString("myKey"); // Simulate string property name
        assertEquals("myKey", NodeUtil.getObjectLitKeyName(key));
    }

    // Mock JSType and FunctionType for testing getObjectLitKeyTypeFromValueType







    @Test
    public void testIsGetOrSetKey_getKey() throws Exception {
        assertTrue(NodeUtil.isGetOrSetKey(new Node(Token.GET)));
    }

    @Test
    public void testIsGetOrSetKey_setKey() throws Exception {
        assertTrue(NodeUtil.isGetOrSetKey(new Node(Token.SET)));
    }

    @Test
    public void testIsGetOrSetKey_stringKey() throws Exception {
        assertFalse(NodeUtil.isGetOrSetKey(Node.newString("key")));
    }

    @Test
    public void testOpToStr_add() throws Exception {
        assertEquals("+", NodeUtil.opToStr(Token.ADD));
    }

    @Test
    public void testOpToStr_mul() throws Exception {
        assertEquals("*", NodeUtil.opToStr(Token.MUL));
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
    public void testOpToStr_assignAdd() throws Exception {
        assertEquals("+=", NodeUtil.opToStr(Token.ASSIGN_ADD));
    }

    @Test
    public void testOpToStr_void() throws Exception {
        assertEquals("void", NodeUtil.opToStr(Token.VOID));
    }

    @Test
    public void testOpToStr_unknown() throws Exception {
        assertNull(NodeUtil.opToStr(Token.LAST_TOKEN + 1)); // Non-operator token
    }

    @Test
    public void testOpToStrNoFail_add() throws Exception {
        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    }

    @Test
    public void testOpToStrNoFail_unknown_throwsError() throws Exception {
        try {
            NodeUtil.opToStrNoFail(Token.LAST_TOKEN + 1);
            fail("Expected an error for unknown operator");
        } catch (Error e) {
            // Expected
        }
    }

    @Test
    public void testContainsType_true() throws Exception {
        Node nameNode = Node.newString("test");
        nameNode.setType(Token.NAME);
        Node block = new Node(Token.BLOCK, nameNode);
        assertTrue(NodeUtil.containsType(block, Token.NAME));
    }

    @Test
    public void testContainsType_false() throws Exception {
        Node numberNode = Node.newNumber(123);
        Node block = new Node(Token.BLOCK, numberNode);
        assertFalse(NodeUtil.containsType(block, Token.NAME));
    }

    @Test
    public void testRedeclareVarsInsideBranch_noVars() throws Exception {
        Node block = new Node(Token.BLOCK, Node.newString("foo"));
        Node root = new Node(Token.SCRIPT, block);
        Node originalRootFirstChild = root.getFirstChild();
        NodeUtil.redeclareVarsInsideBranch(block);
        assertSame(originalRootFirstChild, root.getFirstChild()); // No change
    }

    @Test
    public void testRedeclareVarsInsideBranch_withVars() throws Exception {
        Node varName1 = Node.newString("x");
        Node varNode1 = new Node(Token.VAR, varName1);
        varName1.copyInformationFrom(Node.newString("original_x"));

        Node varName2 = Node.newString("y");
        Node varNode2 = new Node(Token.VAR, varName2);
        varName2.copyInformationFrom(Node.newString("original_y"));

        Node block = new Node(Token.BLOCK, varNode1, varNode2, Node.newString("foo"));
        Node root = new Node(Token.SCRIPT, block);

        NodeUtil.redeclareVarsInsideBranch(block);

        assertEquals(4, root.getChildCount()); // Original block + 2 new VARs
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("x", root.getFirstChild().getString());
        assertEquals(Token.VAR, root.getChildAtIndex(1).getType());
        assertEquals("y", root.getChildAtIndex(1).getString());
        assertSame(block, root.getLastChild()); // Original block should still be there
    }

    @Test
    public void testCopyNameAnnotations_constantName() throws Exception {
        Node source = Node.newString("CONSTANT");
        source.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node destination = Node.newString("CONSTANT");
        NodeUtil.copyNameAnnotations(source, destination);
        assertTrue(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testCopyNameAnnotations_nonConstantName() throws Exception {
        Node source = Node.newString("variable");
        Node destination = Node.newString("variable");
        NodeUtil.copyNameAnnotations(source, destination);
        assertFalse(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testNewFunctionNode_basic() throws Exception {
        String name = "myFunc";
        List<Node> params = Arrays.asList(Node.newString("a"), Node.newString("b"));
        Node body = new Node(Token.BLOCK);
        int lineno = 10, charno = 5;

        Node fnNode = NodeUtil.newFunctionNode(name, params, body, lineno, charno);

        assertEquals(Token.FUNCTION, fnNode.getType());
        assertEquals(lineno, fnNode.getLineno());
        assertEquals(charno, fnNode.getCharno());

        Node nameNode = fnNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals(name, nameNode.getString());

        Node paramsNode = nameNode.getNext();
        assertEquals(Token.LP, paramsNode.getType());
        assertEquals(2, paramsNode.getChildCount());
        assertEquals("a", paramsNode.getChildAtIndex(0).getString());
        assertEquals("b", paramsNode.getChildAtIndex(1).getString());

        Node bodyNode = paramsNode.getNext();
        assertEquals(Token.BLOCK, bodyNode.getType());
        assertSame(body, bodyNode);
    }

    @Test
    public void testNewQualifiedNameNode_simpleName() throws Exception {
        CodingConvention convention = null; // Dummy convention
        String name = "myVar";
        int lineno = 10, charno = 5;
        // Node.newString(String) is sufficient for creating a NAME node.
        // No need for a basisNode with lineno/charno if constructing directly.
        Node qualifiedName = NodeUtil.newQualifiedNameNode(convention, name, lineno, charno);
        assertEquals(Token.NAME, qualifiedName.getType());
        assertEquals(name, qualifiedName.getString());
        assertEquals(lineno, qualifiedName.getLineno());
        assertEquals(charno, qualifiedName.getCharno());
    }

    @Test
    public void testNewQualifiedNameNode_complexName() throws Exception {
        CodingConvention convention = null; // Dummy convention
        String name = "a.b.c";
        int lineno = 10, charno = 5;

        Node qualifiedName = NodeUtil.newQualifiedNameNode(convention, name, lineno, charno);

        assertEquals(Token.GETPROP, qualifiedName.getType());
        assertEquals(lineno, qualifiedName.getLineno());
        assertEquals(charno, qualifiedName.getCharno());

        Node firstGetProp = qualifiedName;
        assertEquals(Token.GETPROP, firstGetProp.getType());
        assertEquals(lineno, firstGetProp.getLineno());
        assertEquals(charno, firstGetProp.getCharno());

        Node secondGetProp = firstGetProp.getFirstChild();
        assertEquals(Token.GETPROP, secondGetProp.getType());
        assertEquals(lineno, secondGetProp.getLineno());
        assertEquals(charno, secondGetProp.getCharno());

        Node nameNode = secondGetProp.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("a", nameNode.getString());

        Node propA = secondGetProp.getLastChild();
        assertEquals(Token.STRING, propA.getType());
        assertEquals("b", propA.getString());

        Node propB = firstGetProp.getLastChild();
        assertEquals(Token.STRING, propB.getType());
        assertEquals("c", propB.getString());
    }

    @Test
    public void testSetDebugInformation_basic() throws Exception {
        Node node = new Node(Token.NAME);
        Node basisNode = new Node(Token.NAME, 10, 5); // Create Node with lineno and charno
        String originalName = "originalName";

        NodeUtil.setDebugInformation(node, basisNode, originalName);

        assertEquals(10, node.getLineno());
        assertEquals(5, node.getCharno());
        assertEquals(originalName, node.getProp(Node.ORIGINALNAME_PROP));
    }

    @Test
    public void testNewName_simple() throws Exception {
        CodingConvention convention = null;
        String name = "myVar";
        Node basisNode = new Node(Token.NAME, 10, 5); // Create Node with lineno and charno

        Node nameNode = NodeUtil.newName(convention, name, basisNode);

        assertEquals(Token.NAME, nameNode.getType());
        assertEquals(name, nameNode.getString());
        assertEquals(10, nameNode.getLineno());
        assertEquals(5, nameNode.getCharno());
    }

    @Test
    public void testNewName_withOriginalName() throws Exception {
        CodingConvention convention = null;
        String name = "myVar";
        Node basisNode = new Node(Token.NAME, 10, 5); // Create Node with lineno and charno
        String originalName = "originalVar";

        Node nameNode = NodeUtil.newName(convention, name, basisNode, originalName);

        assertEquals(Token.NAME, nameNode.getType());
        assertEquals(name, nameNode.getString());
        assertEquals(10, nameNode.getLineno());
        assertEquals(5, nameNode.getCharno());
        assertEquals(originalName, nameNode.getProp(Node.ORIGINALNAME_PROP));
    }

    @Test
    public void testIsLatin_asciiString() throws Exception {
        assertTrue(NodeUtil.isLatin("abcABC123"));
    }

    @Test
    public void testIsLatin_unicodeString() throws Exception {
        assertFalse(NodeUtil.isLatin("你好"));
    }

    @Test
    public void testIsLatin_mixedString() throws Exception {
        assertFalse(NodeUtil.isLatin("abc你好"));
    }

    @Test
    public void testIsLatin_extendedAscii() throws Exception {
        // Character with code 127 is the largest basic Latin char
        char extendedAsciiChar = (char) 127;
        assertTrue(NodeUtil.isLatin(String.valueOf(extendedAsciiChar)));
    }

    @Test
    public void testIsValidPropertyName_validIdentifier() throws Exception {
        assertTrue(NodeUtil.isValidPropertyName("myProperty"));
    }

    @Test
    public void testIsValidPropertyName_keyword() throws Exception {
        assertFalse(NodeUtil.isValidPropertyName("if")); // 'if' is a keyword
    }

    @Test
    public void testIsValidPropertyName_unicode() throws Exception {
        assertFalse(NodeUtil.isValidPropertyName("你好")); // Unicode
    }

    @Test
    public void testGetVarsDeclaredInBranch_noVars() throws Exception {
        Node script = new Node(Token.SCRIPT, Node.newString("foo"));
        assertTrue(NodeUtil.getVarsDeclaredInBranch(script).isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranch_singleVar() throws Exception {
        Node nameNode = Node.newString("x");
        Node varNode = new Node(Token.VAR, nameNode);
        Node script = new Node(Token.SCRIPT, varNode);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(script);
        assertEquals(1, vars.size());
        assertSame(nameNode, vars.iterator().next());
    }

    @Test
    public void testGetVarsDeclaredInBranch_multipleVars() throws Exception {
        Node nameNode1 = Node.newString("x");
        Node varNode1 = new Node(Token.VAR, nameNode1);
        Node nameNode2 = Node.newString("y");
        Node varNode2 = new Node(Token.VAR, nameNode2);
        Node script = new Node(Token.SCRIPT, varNode1, varNode2);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(script);
        assertEquals(2, vars.size());
        assertTrue(vars.contains(nameNode1));
        assertTrue(vars.contains(nameNode2));
    }

    @Test
    public void testGetVarsDeclaredInBranch_nestedFunction() throws Exception {
        Node innerVarName = Node.newString("inner");
        Node innerVarNode = new Node(Token.VAR, innerVarName);
        Node innerFnBody = new Node(Token.BLOCK, innerVarNode);
        Node innerFn = new Node(Token.FUNCTION, Node.newString("innerFn"), Node.newString(""), innerFnBody);

        Node outerVarName = Node.newString("outer");
        Node outerVarNode = new Node(Token.VAR, outerVarName);
        Node script = new Node(Token.SCRIPT, outerVarNode, innerFn);

        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(script);
        assertEquals(1, vars.size()); // Only outer var should be returned
        assertSame(outerVarName, vars.iterator().next());
    }

    @Test
    public void testIsPrototypePropertyDeclaration_true() throws Exception {
        Node prototype = Node.newString("prototype");
        Node className = Node.newString("MyClass");
        Node getProp = new Node(Token.GETPROP, className, prototype);
        Node value = Node.newNumber(1);
        Node assign = new Node(Token.ASSIGN, getProp, value);
        Node exprResult = new Node(Token.EXPR_RESULT, assign);
        assertTrue(NodeUtil.isPrototypePropertyDeclaration(exprResult));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_falseNotAssign() throws Exception {
        Node prototype = Node.newString("prototype");
        Node className = Node.newString("MyClass");
        Node getProp = new Node(Token.GETPROP, className, prototype);
        Node exprResult = new Node(Token.EXPR_RESULT, getProp);
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(exprResult));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_falseNotPrototype() throws Exception {
        Node className = Node.newString("MyClass");
        Node methodName = Node.newString("myMethod");
        Node getProp = new Node(Token.GETPROP, className, methodName);
        Node value = Node.newNumber(1);
        Node assign = new Node(Token.ASSIGN, getProp, value);
        Node exprResult = new Node(Token.EXPR_RESULT, assign);
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(exprResult));
    }

    @Test
    public void testIsPrototypeProperty_true() throws Exception {
        Node qName = Node.newString("MyClass.prototype.myMethod");
        qName.setType(Token.GETPROP); // Ensure it's a GETPROP node
        assertTrue(NodeUtil.isPrototypeProperty(qName));
    }

    @Test
    public void testIsPrototypeProperty_false() throws Exception {
        Node qName = Node.newString("MyClass.myMethod");
        qName.setType(Token.GETPROP);
        assertFalse(NodeUtil.isPrototypeProperty(qName));
    }

    @Test
    public void testGetPrototypeClassName_basic() throws Exception {
        Node className = Node.newString("MyClass");
        Node prototype = Node.newString("prototype");
        Node method = Node.newString("myMethod");
        Node getProp1 = new Node(Token.GETPROP, className, prototype);
        Node getProp2 = new Node(Token.GETPROP, getProp1, method);
        assertEquals(className, NodeUtil.getPrototypeClassName(getProp2));
    }

    @Test
    public void testGetPrototypeClassName_noPrototype() throws Exception {
        Node className = Node.newString("MyClass");
        Node methodName = Node.newString("myMethod");
        Node getProp = new Node(Token.GETPROP, className, methodName);
        assertNull(NodeUtil.getPrototypeClassName(getProp));
    }

    @Test
    public void testGetPrototypePropertyName_basic() throws Exception {
        Node className = Node.newString("MyClass");
        Node prototype = Node.newString("prototype");
        Node method = Node.newString("myMethod");
        Node getProp1 = new Node(Token.GETPROP, className, prototype);
        Node getProp2 = new Node(Token.GETPROP, getProp1, method);
        assertEquals("myMethod", NodeUtil.getPrototypePropertyName(getProp2));
    }

    @Test
    public void testGetPrototypePropertyName_nestedProto() throws Exception {
        Node className = Node.newString("MyClass");
        Node prototype1 = Node.newString("prototype");
        Node prototype2 = Node.newString("prototype");
        Node method = Node.newString("myMethod");
        Node getProp1 = new Node(Token.GETPROP, className, prototype1);
        Node getProp2 = new Node(Token.GETPROP, getProp1, prototype2);
        Node getProp3 = new Node(Token.GETPROP, getProp2, method);
        assertEquals("myMethod", NodeUtil.getPrototypePropertyName(getProp3));
    }



    @Test
    public void testNewUndefinedNode_withoutSrcRef() throws Exception {
        Node undefinedNode = NodeUtil.newUndefinedNode(null);
        assertEquals(Token.VOID, undefinedNode.getType());
        assertEquals(-1, undefinedNode.getLineno()); // Default lineno
        assertEquals(-1, undefinedNode.getCharno()); // Default charno
        assertEquals(1, undefinedNode.getChildCount());
        assertEquals(Token.NUMBER, undefinedNode.getFirstChild().getType());
        assertEquals(0.0, undefinedNode.getFirstChild().getDouble(), 1e-9);
    }

    @Test
    public void testNewVarNode_withValue() throws Exception {
        Node value = Node.newNumber(42);
        Node varNode = NodeUtil.newVarNode("myVar", value);
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(1, varNode.getChildCount());
        Node nameNode = varNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("myVar", nameNode.getString());
        assertEquals(1, nameNode.getChildCount());
        assertSame(value, nameNode.getFirstChild());
    }

    @Test
    public void testNewVarNode_withoutValue() throws Exception {
        Node varNode = NodeUtil.newVarNode("myVar", null);
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(1, varNode.getChildCount());
        Node nameNode = varNode.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("myVar", nameNode.getString());
        assertFalse(nameNode.hasChildren());
    }




    @Test
    public void testMatchNodeType_match() throws Exception {
        Predicate<Node> matcher = new NodeUtil.MatchNodeType(Token.NAME);
        Node nameNode = Node.newString("test");
        nameNode.setType(Token.NAME);
        assertTrue(matcher.apply(nameNode));
    }

    @Test
    public void testMatchNodeType_noMatch() throws Exception {
        Predicate<Node> matcher = new NodeUtil.MatchNodeType(Token.NAME);
        Node numberNode = Node.newNumber(123);
        assertFalse(matcher.apply(numberNode));
    }

    @Test
    public void testMatchDeclaration_var() throws Exception {
        Predicate<Node> matcher = new NodeUtil.MatchDeclaration();
        Node nameNode = Node.newString("x");
        Node varNode = new Node(Token.VAR, nameNode);
        assertTrue(matcher.apply(varNode));
    }

    @Test
    public void testMatchDeclaration_functionDeclaration() throws Exception {
        Predicate<Node> matcher = new NodeUtil.MatchDeclaration();
        Node fn = new Node(Token.FUNCTION, Node.newString("foo"));
        Node dummyParent = new Node(Token.BLOCK); // Parent must exist for isStatement check
        dummyParent.addChildToBack(fn);
        assertTrue(matcher.apply(fn));
    }

    @Test
    public void testMatchDeclaration_functionExpression() throws Exception {
        Predicate<Node> matcher = new NodeUtil.MatchDeclaration();
        Node fn = new Node(Token.FUNCTION, Node.newString(""));
        Node expr = new Node(Token.EXPR_RESULT, fn);
        assertFalse(matcher.apply(fn));
    }

    @Test
    public void testMatchNotFunction_functionNode() throws Exception {
        Predicate<Node> matcher = new NodeUtil.MatchNotFunction();
        Node fn = new Node(Token.FUNCTION);
        assertFalse(matcher.apply(fn));
    }

    @Test
    public void testMatchNotFunction_otherNode() throws Exception {
        Predicate<Node> matcher = new NodeUtil.MatchNotFunction();
        Node nameNode = Node.newString("test");
        nameNode.setType(Token.NAME);
        assertTrue(matcher.apply(nameNode));
    }

    @Test
    public void testMatchShallowStatement_block() throws Exception {
        Predicate<Node> matcher = new NodeUtil.MatchShallowStatement();
        Node block = new Node(Token.BLOCK);
        assertTrue(matcher.apply(block));
    }

    @Test
    public void testMatchShallowStatement_functionExpression() throws Exception {
        Predicate<Node> matcher = new NodeUtil.MatchShallowStatement();
        Node fnExpr = new Node(Token.FUNCTION, Node.newString(""));
        Node expr = new Node(Token.EXPR_RESULT, fnExpr);
        // Function expression is not a statement itself and not in a control structure
        assertFalse(matcher.apply(fnExpr));
    }

    @Test
    public void testMatchShallowStatement_ifStatement() throws Exception {
        Predicate<Node> matcher = new NodeUtil.MatchShallowStatement();
        Node cond = Node.newString("cond");
        Node then = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, cond, then);
        assertTrue(matcher.apply(ifNode));
    }

    @Test
    public void testGetNodeTypeReferenceCount_countPresent() throws Exception {
        Node name1 = Node.newString("test"); name1.setType(Token.NAME);
        Node name2 = Node.newString("test"); name2.setType(Token.NAME);
        Node block = new Node(Token.BLOCK, name1, name2, Node.newNumber(1));
        assertEquals(2, NodeUtil.getNodeTypeReferenceCount(block, Token.NAME, Predicates.alwaysTrue()));
    }

    @Test
    public void testGetNodeTypeReferenceCount_countAbsent() throws Exception {
        Node number1 = Node.newNumber(1);
        Node number2 = Node.newNumber(2);
        Node block = new Node(Token.BLOCK, number1, number2);
        assertEquals(0, NodeUtil.getNodeTypeReferenceCount(block, Token.NAME, Predicates.alwaysTrue()));
    }

    @Test
    public void testIsNameReferenced_true() throws Exception {
        Node name = Node.newString("targetName");
        name.setType(Token.NAME);
        Node otherName = Node.newString("other");
        otherName.setType(Token.NAME);
        Node block = new Node(Token.BLOCK, name, otherName);
        assertTrue(NodeUtil.isNameReferenced(block, "targetName"));
    }

    @Test
    public void testIsNameReferenced_false() throws Exception {
        Node name1 = Node.newString("other1");
        name1.setType(Token.NAME);
        Node name2 = Node.newString("other2");
        name2.setType(Token.NAME);
        Node block = new Node(Token.BLOCK, name1, name2);
        assertFalse(NodeUtil.isNameReferenced(block, "targetName"));
    }

    @Test
    public void testGetNameReferenceCount_countPresent() throws Exception {
        Node name1 = Node.newString("target"); name1.setType(Token.NAME);
        Node name2 = Node.newString("target"); name2.setType(Token.NAME);
        Node block = new Node(Token.BLOCK, name1, name2, Node.newString("other"));
        assertEquals(2, NodeUtil.getNameReferenceCount(block, "target"));
    }

    @Test
    public void testGetNameReferenceCount_countAbsent() throws Exception {
        Node name1 = Node.newString("other1"); name1.setType(Token.NAME);
        Node name2 = Node.newString("other2"); name2.setType(Token.NAME);
        Node block = new Node(Token.BLOCK, name1, name2);
        assertEquals(0, NodeUtil.getNameReferenceCount(block, "target"));
    }





    @Test
    public void testVisitPreOrder_basic() throws Exception {
        final List<Node> visitedNodes = new java.util.ArrayList<>();
        NodeUtil.Visitor visitor = new NodeUtil.Visitor() {
            @Override
            public void visit(Node node) {
                visitedNodes.add(node);
            }
        };
        Node child1 = Node.newString("c1");
        Node child2 = Node.newString("c2");
        Node parent = new Node(Token.BLOCK, child1, child2);

        NodeUtil.visitPreOrder(parent, visitor, Predicates.alwaysTrue());

        assertEquals(3, visitedNodes.size());
        assertSame(parent, visitedNodes.get(0));
        assertSame(child1, visitedNodes.get(1));
        assertSame(child2, visitedNodes.get(2));
    }

    @Test
    public void testVisitPostOrder_basic() throws Exception {
        final List<Node> visitedNodes = new java.util.ArrayList<>();
        NodeUtil.Visitor visitor = new NodeUtil.Visitor() {
            @Override
            public void visit(Node node) {
                visitedNodes.add(node);
            }
        };
        Node child1 = Node.newString("c1");
        Node child2 = Node.newString("c2");
        Node parent = new Node(Token.BLOCK, child1, child2);

        NodeUtil.visitPostOrder(parent, visitor, Predicates.alwaysTrue());

        assertEquals(3, visitedNodes.size());
        assertSame(child1, visitedNodes.get(0));
        assertSame(child2, visitedNodes.get(1));
        assertSame(parent, visitedNodes.get(2));
    }

    @Test
    public void testHasFinally_true() throws Exception {
        Node finallyBlock = new Node(Token.BLOCK);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), finallyBlock); // 3 children
        assertTrue(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testHasFinally_false() throws Exception {
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK)); // 2 children
        assertFalse(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testGetCatchBlock_basic() throws Exception {
        Node catchBlock = new Node(Token.BLOCK);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchBlock, new Node(Token.BLOCK));
        assertSame(catchBlock, NodeUtil.getCatchBlock(tryNode));
    }

    @Test
    public void testHasCatchHandler_true() throws Exception {
        Node catchNode = new Node(Token.CATCH);
        Node catchBlock = new Node(Token.BLOCK, catchNode);
        assertTrue(NodeUtil.hasCatchHandler(catchBlock));
    }

    @Test
    public void testHasCatchHandler_false() throws Exception {
        Node block = new Node(Token.BLOCK, Node.newString("statement"));
        assertFalse(NodeUtil.hasCatchHandler(block));
    }

    @Test
    public void testGetFnParameters_basic() throws Exception {
        Node param1 = Node.newString("p1");
        Node param2 = Node.newString("p2");
        Node paramsList = new Node(Token.LP, param1, param2);
        Node name = Node.newString("foo");
        Node body = new Node(Token.BLOCK);
        Node fn = new Node(Token.FUNCTION, name, paramsList, body);
        assertSame(paramsList, NodeUtil.getFnParameters(fn));
    }

    @Test
    public void testIsConstantName_true() throws Exception {
        Node nameNode = Node.newString("MY_CONST");
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(NodeUtil.isConstantName(nameNode));
    }

    @Test
    public void testIsConstantName_false() throws Exception {
        Node nameNode = Node.newString("myVar");
        assertFalse(NodeUtil.isConstantName(nameNode));
    }


    @Test
    public void testGetInfoForNameNode_direct() throws Exception {
        Node nameNode = Node.newString("myVar");
        nameNode.setType(Token.NAME);
        JSDocInfo info = new JSDocInfo();
        nameNode.setJSDocInfo(info);
        assertSame(info, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetInfoForNameNode_parentVar() throws Exception {
        Node nameNode = Node.newString("myVar");
        nameNode.setType(Token.NAME);
        Node varNode = new Node(Token.VAR, nameNode);
        JSDocInfo info = new JSDocInfo();
        varNode.setJSDocInfo(info);
        assertSame(info, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetInfoForNameNode_parentFunction() throws Exception {
        Node nameNode = Node.newString("myFunc");
        nameNode.setType(Token.NAME);
        Node fnNode = new Node(Token.FUNCTION, nameNode);
        JSDocInfo info = new JSDocInfo();
        fnNode.setJSDocInfo(info);
        assertSame(info, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetFunctionInfo_direct() throws Exception {
        Node fn = new Node(Token.FUNCTION);
        JSDocInfo info = new JSDocInfo();
        fn.setJSDocInfo(info);
        assertSame(info, NodeUtil.getFunctionInfo(fn));
    }

    @Test
    public void testGetFunctionInfo_functionExpressionAssign() throws Exception {
        Node fn = new Node(Token.FUNCTION, Node.newString(""));
        Node assign = new Node(Token.ASSIGN, Node.newString("varName"), fn);
        JSDocInfo info = new JSDocInfo();
        assign.setJSDocInfo(info);
        assertSame(info, NodeUtil.getFunctionInfo(fn));
    }

    @Test
    public void testGetFunctionInfo_functionExpressionVarAssign() throws Exception {
        Node fn = new Node(Token.FUNCTION, Node.newString(""));
        Node varName = Node.newString("varName");
        Node varAssign = new Node(Token.VAR, varName);
        varName.addChildToBack(fn);
        JSDocInfo info = new JSDocInfo();
        varAssign.setJSDocInfo(info);
        assertSame(info, NodeUtil.getFunctionInfo(fn));
    }

    @Test
    public void testGetSourceName_nodeProperty() throws Exception {
        Node node = new Node(Token.NAME);
        node.putProp(Node.SOURCENAME_PROP, "source.js");
        assertEquals("source.js", NodeUtil.getSourceName(node));
    }

    @Test
    public void testGetSourceName_ancestorProperty() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        parent.putProp(Node.SOURCENAME_PROP, "source.js");
        Node node = new Node(Token.NAME);
        parent.addChildToBack(node);
        assertEquals("source.js", NodeUtil.getSourceName(node));
    }

    @Test
    public void testGetSourceName_noProperty() throws Exception {
        Node node = new Node(Token.NAME);
        assertNull(NodeUtil.getSourceName(node));
    }

    @Test
    public void testNewCallNode_freeCall() throws Exception {
        Node callTarget = Node.newString("myFunc");
        callTarget.setType(Token.NAME);
        Node[] params = {Node.newString("arg1"), Node.newNumber(123)};
        Node callNode = NodeUtil.newCallNode(callTarget, params);

        assertEquals(Token.CALL, callNode.getType());
        assertTrue(callNode.getBooleanProp(Node.FREE_CALL));
        assertEquals(3, callNode.getChildCount()); // Target + 2 params
        assertSame(callTarget, callNode.getFirstChild());
        assertEquals("arg1", callNode.getChildAtIndex(1).getString());
        assertEquals(123.0, callNode.getChildAtIndex(2).getDouble(), 1e-9);
    }

    @Test
    public void testNewCallNode_notFreeCall() throws Exception {
        Node obj = Node.newString("obj");
        Node method = Node.newString("method");
        Node getProp = new Node(Token.GETPROP, obj, method);
        Node[] params = {Node.newString("arg1")};
        Node callNode = NodeUtil.newCallNode(getProp, params);

        assertEquals(Token.CALL, callNode.getType());
        assertFalse(callNode.getBooleanProp(Node.FREE_CALL));
        assertEquals(2, callNode.getChildCount()); // Target + 1 param
        assertSame(getProp, callNode.getFirstChild());
        assertEquals("arg1", callNode.getChildAtIndex(1).getString());
    }

    @Test
    public void testEvaluatesToLocalValue_immutable() throws Exception {
        Node n = Node.newString("immutable");
        assertTrue(NodeUtil.evaluatesToLocalValue(n));
    }

    @Test
    public void testEvaluatesToLocalValue_localName() throws Exception {
        Node n = Node.newString("localVar");
        n.setType(Token.NAME);
        Predicate<Node> locals = Predicates.equalTo(n);
        assertTrue(NodeUtil.evaluatesToLocalValue(n, locals));
    }

    @Test
    public void testEvaluatesToLocalValue_nonLocalName() throws Exception {
        Node n = Node.newString("globalVar");
        n.setType(Token.NAME);
        Predicate<Node> locals = Predicates.alwaysFalse();
        assertFalse(NodeUtil.evaluatesToLocalValue(n, locals));
    }

    @Test
    public void testEvaluatesToLocalValue_assignmentToLocal() throws Exception {
        Node lhs = Node.newString("localVar"); lhs.setType(Token.NAME);
        Node rhs = Node.newString("value");
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        Predicate<Node> locals = Predicates.equalTo(lhs);
        assertTrue(NodeUtil.evaluatesToLocalValue(assign, locals));
    }

    @Test
    public void testEvaluatesToLocalValue_assignmentToNonLocal() throws Exception {
        Node lhs = Node.newString("globalVar"); lhs.setType(Token.NAME);
        Node rhs = Node.newString("value");
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        Predicate<Node> locals = Predicates.alwaysFalse();
        assertFalse(NodeUtil.evaluatesToLocalValue(assign, locals));
    }

    @Test
    public void testEvaluatesToLocalValue_callWithLocalResult() throws Exception {
        Node call = new Node(Token.CALL);
        call.putBooleanProp(Node.SIDE_EFFECT_FLAGS, true); // FLAG_LOCAL_RESULTS
        Predicate<Node> locals = Predicates.alwaysFalse();
        assertTrue(NodeUtil.evaluatesToLocalValue(call, locals));
    }

    @Test
    public void testEvaluatesToLocalValue_callToString() throws Exception {
        Node method = Node.newString("toString");
        Node prop = Node.newString("toString");
        Node obj = Node.newString("obj");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp);
        Predicate<Node> locals = Predicates.alwaysFalse();
        assertTrue(NodeUtil.evaluatesToLocalValue(call, locals));
    }

    @Test
    public void testEvaluatesToLocalValue_newWithLocalResult() throws Exception {
        Node newNode = new Node(Token.NEW);
        newNode.putBooleanProp(Node.SIDE_EFFECT_FLAGS, true); // isOnlyModifiesThisCall
        Predicate<Node> locals = Predicates.alwaysFalse();
        assertTrue(NodeUtil.evaluatesToLocalValue(newNode, locals));
    }

    @Test
    public void testEvaluatesToLocalValue_objectLiteral() throws Exception {
        Node objectLit = new Node(Token.OBJECTLIT);
        Predicate<Node> locals = Predicates.alwaysFalse();
        assertTrue(NodeUtil.evaluatesToLocalValue(objectLit, locals));
    }

    @Test
    public void testEvaluatesToLocalValue_functionExpression() throws Exception {
        Node fnExpr = new Node(Token.FUNCTION, Node.newString(""));
        Predicate<Node> locals = Predicates.alwaysFalse();
        assertTrue(NodeUtil.evaluatesToLocalValue(fnExpr, locals));
    }

    @Test
    public void testGetArgumentForFunction_first() throws Exception {
        Node param1 = Node.newString("p1");
        Node paramList = new Node(Token.LP, param1);
        Node fn = new Node(Token.FUNCTION, Node.newString("f"), paramList);
        assertSame(param1, NodeUtil.getArgumentForFunction(fn, 0));
    }

    @Test
    public void testGetArgumentForFunction_second() throws Exception {
        Node param1 = Node.newString("p1");
        Node param2 = Node.newString("p2");
        Node paramList = new Node(Token.LP, param1, param2);
        Node fn = new Node(Token.FUNCTION, Node.newString("f"), paramList);
        assertSame(param2, NodeUtil.getArgumentForFunction(fn, 1));
    }

    @Test
    public void testGetArgumentForFunction_outOfBounds() throws Exception {
        Node param1 = Node.newString("p1");
        Node paramList = new Node(Token.LP, param1);
        Node fn = new Node(Token.FUNCTION, Node.newString("f"), paramList);
        assertNull(NodeUtil.getArgumentForFunction(fn, 1));
    }

    @Test
    public void testGetArgumentForCallOrNew_first() throws Exception {
        Node arg1 = Node.newString("a1");
        // For CALL and NEW, the arguments are directly after the function/constructor node.
        // If there's only one argument, it's the first child of the CALL node.
        Node call = new Node(Token.CALL, Node.newString("func"), arg1);
        assertSame(arg1, NodeUtil.getArgumentForCallOrNew(call, 0));
    }

    @Test
    public void testGetArgumentForCallOrNew_second() throws Exception {
        Node arg1 = Node.newString("a1");
        Node arg2 = Node.newString("a2");
        Node call = new Node(Token.CALL, Node.newString("func"), arg1, arg2);
        assertSame(arg2, NodeUtil.getArgumentForCallOrNew(call, 1));
    }

    @Test
    public void testGetArgumentForCallOrNew_outOfBounds() throws Exception {
        Node arg1 = Node.newString("a1");
        Node call = new Node(Token.CALL, Node.newString("func"), arg1);
        assertNull(NodeUtil.getArgumentForCallOrNew(call, 1));
    }




}


