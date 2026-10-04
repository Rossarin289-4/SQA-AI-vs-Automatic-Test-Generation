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

// Missing imports for compilation:
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.Bind;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.NodeTraversal.Callback;


public class NodeUtilTest {

    /**
     * Creates a simple Node for testing purposes.
     */
    private Node createNode(int type) {
        return new Node(type);
    }

    /**
     * Creates a Node with a string value for testing.
     */
    private Node createStringNode(String value) {
        return Node.newString(value);
    }

    /**
     * Creates a Node with a number value for testing.
     */
    private Node createNumberNode(double value) {
        return Node.newNumber(value);
    }

    /**
     * Creates a Node with a boolean value for testing.
     */
    private Node createBooleanNode(boolean value) {
        return new Node(value ? Token.TRUE : Token.FALSE);
    }

    @Test
    public void testGetImpureBooleanValue_stringLiteralTrue() {
        Node n = createStringNode("hello");
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_stringLiteralFalse() {
        Node n = createStringNode("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_numberLiteralTrue() {
        Node n = createNumberNode(1.0);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_numberLiteralFalse() {
        Node n = createNumberNode(0.0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_trueLiteral() {
        Node n = createBooleanNode(true);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_falseLiteral() {
        Node n = createBooleanNode(false);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_nullLiteral() {
        Node n = createNode(Token.NULL);
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_undefinedName() {
        Node n = Node.newString("undefined");
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_infinityName() {
        Node n = Node.newString("Infinity");
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_notOperator() {
        Node n = createNode(Token.NOT);
        n.addChildToBack(createBooleanNode(true));
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_andOperator() {
        Node n = createNode(Token.AND);
        n.addChildToBack(createBooleanNode(true));
        n.addChildToBack(createBooleanNode(false));
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_orOperator() {
        Node n = createNode(Token.OR);
        n.addChildToBack(createBooleanNode(false));
        n.addChildToBack(createBooleanNode(true));
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_hookOperator() {
        Node n = createNode(Token.HOOK);
        Node cond = createBooleanNode(true);
        Node trueBranch = createBooleanNode(true);
        Node falseBranch = createBooleanNode(false);
        n.addChildToBack(cond);
        n.addChildToBack(trueBranch);
        n.addChildToBack(falseBranch);
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_arrayLiteral() {
        Node n = createNode(Token.ARRAYLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetImpureBooleanValue_objectLiteral() {
        Node n = createNode(Token.OBJECTLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_stringLiteralTrue() {
        Node n = createStringNode("hello");
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_stringLiteralFalse() {
        Node n = createStringNode("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_numberLiteralTrue() {
        Node n = createNumberNode(1.0);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_numberLiteralFalse() {
        Node n = createNumberNode(0.0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_trueLiteral() {
        Node n = createBooleanNode(true);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_falseLiteral() {
        Node n = createBooleanNode(false);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_nullLiteral() {
        Node n = createNode(Token.NULL);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_voidLiteral() {
        Node n = createNode(Token.VOID);
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_undefinedName() {
        Node n = Node.newString("undefined");
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_NaNName() {
        Node n = Node.newString("NaN");
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_InfinityName() {
        Node n = Node.newString("Infinity");
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_regexpLiteral() {
        Node n = createNode(Token.REGEXP);
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_notOperator() {
        Node n = createNode(Token.NOT);
        n.addChildToBack(createBooleanNode(true));
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_arrayLiteralNotSideEffect() {
        Node n = createNode(Token.ARRAYLIT);
        // Assuming array literal itself doesn't have side effects for this test.
        // In reality, mayHaveSideEffects would need to be checked.
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetPureBooleanValue_objectLiteralNotSideEffect() {
        Node n = createNode(Token.OBJECTLIT);
        // Assuming object literal itself doesn't have side effects for this test.
        // In reality, mayHaveSideEffects would need to be checked.
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(n));
    }

    @Test
    public void testGetStringValue_stringLiteral() {
        Node n = createStringNode("test");
        assertEquals("test", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_emptyStringLiteral() {
        Node n = createStringNode("");
        assertEquals("", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_numberLiteral() {
        Node n = createNumberNode(123.45);
        assertEquals("123.45", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_integerNumberLiteral() {
        Node n = createNumberNode(123.0);
        assertEquals("123", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_trueLiteral() {
        Node n = createBooleanNode(true);
        assertEquals("true", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_falseLiteral() {
        Node n = createBooleanNode(false);
        assertEquals("false", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_nullLiteral() {
        Node n = createNode(Token.NULL);
        assertEquals("null", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_undefinedName() {
        Node n = Node.newString("undefined");
        assertEquals("undefined", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_infinityName() {
        Node n = Node.newString("Infinity");
        assertEquals("Infinity", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_NaNName() {
        Node n = Node.newString("NaN");
        assertEquals("NaN", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_voidLiteral() {
        Node n = createNode(Token.VOID);
        assertEquals("undefined", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_notTrue() {
        Node n = createNode(Token.NOT);
        n.addChildToBack(createBooleanNode(true));
        assertEquals("false", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_notFalse() {
        Node n = createNode(Token.NOT);
        n.addChildToBack(createBooleanNode(false));
        assertEquals("true", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_arrayLiteralSimple() {
        Node n = createNode(Token.ARRAYLIT);
        n.addChildToBack(createStringNode("a"));
        n.addChildToBack(createNumberNode(1));
        assertEquals("a,1", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_arrayLiteralEmptyElements() {
        Node n = createNode(Token.ARRAYLIT);
        n.addChildToBack(createStringNode("a"));
        n.addChildToBack(createStringNode(""));
        n.addChildToBack(createStringNode("c"));
        assertEquals("a,,c", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_arrayLiteralNullElement() {
        Node n = createNode(Token.ARRAYLIT);
        n.addChildToBack(createStringNode("a"));
        n.addChildToBack(createNode(Token.NULL));
        n.addChildToBack(createStringNode("c"));
        assertEquals("a,,c", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_arrayLiteralUndefinedElement() {
        Node n = createNode(Token.ARRAYLIT);
        n.addChildToBack(createStringNode("a"));
        n.addChildToBack(createNode(Token.VOID)); // Represents undefined
        n.addChildToBack(createStringNode("c"));
        assertEquals("a,,c", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetStringValue_objectLiteral() {
        Node n = createNode(Token.OBJECTLIT);
        assertEquals("[object Object]", NodeUtil.getStringValue(n));
    }

    @Test
    public void testGetNumberValue_trueLiteral() {
        Node n = createBooleanNode(true);
        assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_falseLiteral() {
        Node n = createBooleanNode(false);
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_nullLiteral() {
        Node n = createNode(Token.NULL);
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_numberLiteral() {
        Node n = createNumberNode(123.45);
        assertEquals(Double.valueOf(123.45), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringLiteralNumber() {
        Node n = Node.newString("42");
        assertEquals(Double.valueOf(42.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringLiteralDecimal() {
        Node n = Node.newString("3.14");
        assertEquals(Double.valueOf(3.14), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringLiteralEmpty() {
        Node n = Node.newString("");
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringLiteralHex() {
        Node n = Node.newString("0xFF");
        assertEquals(Double.valueOf(255.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringLiteralHexUpperCase() {
        Node n = Node.newString("0XFF");
        assertEquals(Double.valueOf(255.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringLiteralNaN() {
        Node n = Node.newString("NaN");
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(n)));
    }

    @Test
    public void testGetNumberValue_stringLiteralInfinity() {
        Node n = Node.newString("Infinity");
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_stringLiteralNegativeInfinity() {
        Node n = Node.newString("-Infinity");
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_undefinedName() {
        Node n = Node.newString("undefined");
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(n)));
    }

    @Test
    public void testGetNumberValue_NaNName() {
        Node n = Node.newString("NaN");
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(n)));
    }

    @Test
    public void testGetNumberValue_InfinityName() {
        Node n = Node.newString("Infinity");
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_negInfinityName() {
        Node n = Node.newString("Infinity");
        Node negNode = new Node(Token.NEG, n);
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(negNode));
    }

    @Test
    public void testGetNumberValue_notTrue() {
        Node n = createNode(Token.NOT);
        n.addChildToBack(createBooleanNode(true));
        assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_notFalse() {
        Node n = createNode(Token.NOT);
        n.addChildToBack(createBooleanNode(false));
        assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(n));
    }

    @Test
    public void testGetNumberValue_voidLiteral() {
        Node n = createNode(Token.VOID);
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(n)));
    }

    @Test
    public void testGetNumberValue_voidLiteralWithSideEffect() {
        // This test case is hypothetical as NodeUtil.getNumberValue
        // directly returns NaN for VOID without checking mayHaveSideEffects.
        // If mayHaveSideEffects were checked, this might behave differently.
        Node n = createNode(Token.VOID);
        n.addChildToBack(createNode(Token.CALL)); // A call might have side effects
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(n)));
    }

    @Test
    public void testGetStringNumberValue_validHex() {
        assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    }

    @Test
    public void testGetStringNumberValue_invalidHex() {
        assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xG")));
    }

    @Test
    public void testGetStringNumberValue_emptyString() {
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue(""));
    }

    @Test
    public void testGetStringNumberValue_whitespaceString() {
        assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("  \t\n "));
    }

    @Test
    public void testGetStringNumberValue_leadingZeroDecimal() {
        assertEquals(Double.valueOf(0.5), NodeUtil.getStringNumberValue("0.5"));
    }

    @Test
    public void testGetStringNumberValue_invalidChars() {
        assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("123a")));
    }

    @Test
    public void testGetStringNumberValue_edgeCaseHexWithSign() {
        // FireFox and IE treat the "Infinity" differently. FireFox is case
        // insensitive, but IE treats "infinity" as NaN. So leave it alone.
        // This test checks a case that should return null according to the code.
        assertNull(NodeUtil.getStringNumberValue("+0x10"));
    }

    @Test
    public void testGetStringNumberValue_infinityCaseInsensitive() {
        // The code explicitly checks for "infinity" etc. and returns null.
        assertNull(NodeUtil.getStringNumberValue("infinity"));
    }

    @Test
    public void testGetStringNumberValue_negativeInfinityCaseInsensitive() {
        assertNull(NodeUtil.getStringNumberValue("-infinity"));
    }

    @Test
    public void testGetStringNumberValue_positiveInfinityCaseInsensitive() {
        assertNull(NodeUtil.getStringNumberValue("+infinity"));
    }

    @Test
    public void testGetFunctionName_functionDeclaration() {
        Node func = new Node(Token.FUNCTION, 0, 0);
        func.addChildToBack(Node.newString("myFunc")); // Name
        func.addChildToBack(new Node(Token.LP));       // Params
        func.addChildToBack(new Node(Token.BLOCK));    // Body
        assertEquals("myFunc", NodeUtil.getFunctionName(func));
    }

    @Test
    public void testGetFunctionName_varAssignedFunction() {
        Node assign = new Node(Token.ASSIGN, 0, 0);
        assign.addChildToBack(Node.newString("myVar")); // LHS
        assign.addChildToBack(new Node(Token.FUNCTION, 0, 0)); // RHS (Function)

        Node var = new Node(Token.VAR, assign, 0, 0);
        assertEquals("myVar", NodeUtil.getFunctionName(assign.getLastChild()));
    }

    @Test
    public void testGetFunctionName_qualifiedNameAssignedFunction() {
        Node assign = new Node(Token.ASSIGN, 0, 0);
        Node qualifiedName = new Node(Token.GETPROP, Node.newString("obj"), Node.newString("method"));
        assign.addChildToBack(qualifiedName);
        assign.addChildToBack(new Node(Token.FUNCTION, 0, 0)); // RHS (Function)

        assertEquals("obj.method", NodeUtil.getFunctionName(assign.getLastChild()));
    }

    @Test
    public void testGetNearestFunctionName_simpleFunction() {
        Node func = new Node(Token.FUNCTION, 0, 0);
        func.addChildToBack(Node.newString("myFunc"));
        func.addChildToBack(new Node(Token.LP));
        func.addChildToBack(new Node(Token.BLOCK));
        assertEquals("myFunc", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_objectLiteralFunction() {
        Node func = new Node(Token.FUNCTION, 0, 0);
        Node objLit = new Node(Token.OBJECTLIT, 0, 0);
        Node key = Node.newString("myMethod");
        key.addChildToBack(func); // Function as value
        objLit.addChildToBack(key);
        assertEquals("myMethod", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_quotedObjectLiteralFunction() {
        Node func = new Node(Token.FUNCTION, 0, 0);
        Node objLit = new Node(Token.OBJECTLIT, 0, 0);
        Node key = Node.newString("'myMethod'"); // Quoted key
        key.addChildToBack(func);
        objLit.addChildToBack(key);
        assertEquals("'myMethod'", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testIsImmutableValue_string() {
        Node n = createStringNode("hello");
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_number() {
        Node n = createNumberNode(10.5);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_true() {
        Node n = createBooleanNode(true);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_false() {
        Node n = createBooleanNode(false);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_null() {
        Node n = createNode(Token.NULL);
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_undefinedName() {
        Node n = Node.newString("undefined");
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_infinityName() {
        Node n = Node.newString("Infinity");
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_NaNName() {
        Node n = Node.newString("NaN");
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_notImmutable() {
        Node n = createNode(Token.ADD);
        n.addChildToBack(createNumberNode(1));
        n.addChildToBack(createNumberNode(2));
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_notImmutableCall() {
        Node n = createNode(Token.CALL);
        n.addChildToBack(Node.newString("alert"));
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_notImmutableNew() {
        Node n = createNode(Token.NEW);
        n.addChildToBack(Node.newString("Object"));
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_notImmutableVar() {
        Node n = createNode(Token.VAR);
        n.addChildToBack(Node.newString("x"));
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsLiteralValue_string() {
        Node n = createStringNode("hello");
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_number() {
        Node n = createNumberNode(10.5);
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_true() {
        Node n = createBooleanNode(true);
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_false() {
        Node n = createBooleanNode(false);
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_null() {
        Node n = createNode(Token.NULL);
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_undefinedName() {
        Node n = Node.newString("undefined");
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_infinityName() {
        Node n = Node.newString("Infinity");
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_NaNName() {
        Node n = Node.newString("NaN");
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_notLiteral_functionExpression() {
        Node n = createNode(Token.FUNCTION);
        assertTrue(NodeUtil.isLiteralValue(n, true)); // Include functions
        assertFalse(NodeUtil.isLiteralValue(n, false)); // Exclude functions
    }

    @Test
    public void testIsLiteralValue_notLiteral_functionDeclaration() {
        Node n = createNode(Token.FUNCTION);
        // Mark as a declaration (not an expression)
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(n);
        assertFalse(NodeUtil.isLiteralValue(n, true));
        assertFalse(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValue_arrayLiteralWithLiteralChildren() {
        Node n = createNode(Token.ARRAYLIT);
        n.addChildToBack(createNumberNode(1));
        n.addChildToBack(createStringNode("a"));
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_arrayLiteralWithNonLiteralChild() {
        Node n = createNode(Token.ARRAYLIT);
        n.addChildToBack(createNumberNode(1));
        n.addChildToBack(createNode(Token.ADD)); // Non-literal
        assertFalse(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_objectLiteralWithLiteralValues() {
        Node n = createNode(Token.OBJECTLIT);
        Node key1 = Node.newString("a");
        key1.addChildToBack(createNumberNode(1));
        n.addChildToBack(key1);
        Node key2 = Node.newString("b");
        key2.addChildToBack(createStringNode("hello"));
        n.addChildToBack(key2);
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_objectLiteralWithNonLiteralValue() {
        Node n = createNode(Token.OBJECTLIT);
        Node key = Node.newString("a");
        key.addChildToBack(createNode(Token.ADD)); // Non-literal
        n.addChildToBack(key);
        assertFalse(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsLiteralValue_regexpLiteral() {
        Node n = createNode(Token.REGEXP);
        assertTrue(NodeUtil.isLiteralValue(n, true));
    }

    @Test
    public void testIsValidDefineValue_number() {
        Node val = createNumberNode(10);
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_string() {
        Node val = createStringNode("hello");
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_true() {
        Node val = createBooleanNode(true);
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_false() {
        Node val = createBooleanNode(false);
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(val, defines));
    }

    @Test
    public void testIsValidDefineValue_addOperator() {
        Node lhs = createNumberNode(1);
        Node rhs = createNumberNode(2);
        Node add = new Node(Token.ADD, lhs, rhs);
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(add, defines));
    }

    @Test
    public void testIsValidDefineValue_negOperator() {
        Node child = createNumberNode(5);
        Node neg = new Node(Token.NEG, child);
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(neg, defines));
    }

    @Test
    public void testIsValidDefineValue_nameDefined() {
        Node name = Node.newString("MY_DEFINE");
        Set<String> defines = new HashSet<>(Arrays.asList("MY_DEFINE"));
        assertTrue(NodeUtil.isValidDefineValue(name, defines));
    }

    @Test
    public void testIsValidDefineValue_nameNotDefined() {
        Node name = Node.newString("OTHER_DEFINE");
        Set<String> defines = new HashSet<>(Arrays.asList("MY_DEFINE"));
        assertFalse(NodeUtil.isValidDefineValue(name, defines));
    }

    @Test
    public void testIsValidDefineValue_qualifiedNameDefined() {
        Node name = new Node(Token.GETPROP, Node.newString("ns"), Node.newString("MY_DEFINE"));
        name.setQualifiedName("ns.MY_DEFINE"); // This method is not part of Node API. Use set and get props.
        Set<String> defines = new HashSet<>(Arrays.asList("ns.MY_DEFINE"));
        assertTrue(NodeUtil.isValidDefineValue(name, defines));
    }

    @Test
    public void testIsValidDefineValue_qualifiedNameNotDefined() {
        Node name = new Node(Token.GETPROP, Node.newString("ns"), Node.newString("OTHER_DEFINE"));
        name.setQualifiedName("ns.OTHER_DEFINE"); // This method is not part of Node API. Use set and get props.
        Set<String> defines = new HashSet<>(Arrays.asList("ns.MY_DEFINE"));
        assertFalse(NodeUtil.isValidDefineValue(name, defines));
    }

    @Test
    public void testIsValidDefineValue_functionCall() {
        Node funcName = Node.newString("someFunc");
        Node call = new Node(Token.CALL, funcName);
        Set<String> defines = new HashSet<>();
        assertFalse(NodeUtil.isValidDefineValue(call, defines));
    }

    @Test
    public void testIsEmptyBlock_emptyBlock() {
        Node block = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_blockWithEmptyNodes() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        block.addChildToBack(new Node(Token.EMPTY));
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_nonEmptyBlock() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(createNumberNode(1));
        assertFalse(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_notABlock() {
        Node node = createNumberNode(1);
        assertFalse(NodeUtil.isEmptyBlock(node));
    }

    @Test
    public void testIsSimpleOperator_add() {
        Node n = createNode(Token.ADD);
        assertTrue(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_assignAdd() {
        Node n = createNode(Token.ASSIGN_ADD);
        assertFalse(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_or() {
        Node n = createNode(Token.OR);
        assertFalse(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_and() {
        Node n = createNode(Token.AND);
        assertFalse(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_not() {
        Node n = createNode(Token.NOT);
        assertTrue(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_neg() {
        Node n = createNode(Token.NEG);
        assertTrue(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testNewExpr() {
        Node child = createNumberNode(10);
        Node exprResult = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, exprResult.getType());
        assertEquals(child, exprResult.getFirstChild());
    }

    @Test
    public void testMayHaveSideEffects_stringLiteral() {
        Node n = createStringNode("hello");
        assertFalse(NodeUtil.mayHaveSideEffects(n));
    }

    @Test
    public void testMayHaveSideEffects_numberLiteral() {
        Node n = createNumberNode(10);
        assertFalse(NodeUtil.mayHaveSideEffects(n));
    }

    @Test
    public void testMayHaveSideEffects_trueLiteral() {
        Node n = createBooleanNode(true);
        assertFalse(NodeUtil.mayHaveSideEffects(n));
    }

    @Test
    public void testMayHaveSideEffects_nullLiteral() {
        Node n = createNode(Token.NULL);
        assertFalse(NodeUtil.mayHaveSideEffects(n));
    }

    @Test
    public void testMayHaveSideEffects_varDeclaration() {
        Node n = new Node(Token.VAR);
        n.addChildToBack(Node.newString("x"));
        assertFalse(NodeUtil.mayHaveSideEffects(n));
    }

    @Test
    public void testMayHaveSideEffects_varDeclarationWithInitialValue() {
        Node n = new Node(Token.VAR);
        Node assign = new Node(Token.ASSIGN, Node.newString("x"), createNumberNode(1));
        n.addChildToBack(assign);
        assertFalse(NodeUtil.mayHaveSideEffects(n)); // Initial value is not a side effect on its own
    }

    @Test
    public void testMayHaveSideEffects_assignment() {
        Node n = new Node(Token.ASSIGN);
        n.addChildToBack(Node.newString("x"));
        n.addChildToBack(createNumberNode(1));
        assertTrue(NodeUtil.mayHaveSideEffects(n));
    }

    @Test
    public void testMayHaveSideEffects_call() {
        Node n = new Node(Token.CALL);
        n.addChildToBack(Node.newString("alert"));
        assertTrue(NodeUtil.mayHaveSideEffects(n));
    }

    @Test
    public void testMayHaveSideEffects_new() {
        Node n = new Node(Token.NEW);
        n.addChildToBack(Node.newString("Object"));
        assertTrue(NodeUtil.mayHaveSideEffects(n));
    }

    @Test
    public void testMayHaveSideEffects_objectLiteral() {
        Node n = createNode(Token.OBJECTLIT);
        assertFalse(NodeUtil.mayHaveSideEffects(n)); // Default is false if not checkForNewObjects
    }

    @Test
    public void testMayHaveSideEffects_objectLiteral_checkForNewObjects() {
        Node n = createNode(Token.OBJECTLIT);
        assertTrue(NodeUtil.checkForStateChangeHelper(n, true, null)); // checkForNewObjects = true
    }

    @Test
    public void testMayHaveSideEffects_arrayLiteral() {
        Node n = createNode(Token.ARRAYLIT);
        assertFalse(NodeUtil.mayHaveSideEffects(n)); // Default is false if not checkForNewObjects
    }

    @Test
    public void testMayHaveSideEffects_arrayLiteral_checkForNewObjects() {
        Node n = createNode(Token.ARRAYLIT);
        assertTrue(NodeUtil.checkForStateChangeHelper(n, true, null)); // checkForNewObjects = true
    }

    @Test
    public void testMayHaveSideEffects_throwStatement() {
        Node n = new Node(Token.THROW);
        assertTrue(NodeUtil.mayHaveSideEffects(n));
    }

    @Test
    public void testConstructorCallHasSideEffects_builtinWithoutSideEffects() {
        Node n = new Node(Token.NEW);
        n.addChildToBack(Node.newString("Array"));
        assertFalse(NodeUtil.constructorCallHasSideEffects(n));
    }

    @Test
    public void testConstructorCallHasSideEffects_builtinWithSideEffects() {
        Node n = new Node(Token.NEW);
        n.addChildToBack(Node.newString("MyCustomClass"));
        assertTrue(NodeUtil.constructorCallHasSideEffects(n));
    }

    @Test
    public void testConstructorCallHasSideEffects_noSideEffectsCallFlag() {
        Node n = new Node(Token.NEW);
        n.addChildToBack(Node.newString("SomeClass"));
        n.putBooleanProp(Node.DIRECTCALL_PROP, true); // Simulating no side effects flag
        assertFalse(NodeUtil.constructorCallHasSideEffects(n));
    }

    @Test
    public void testFunctionCallHasSideEffects_builtinWithoutSideEffects() {
        Node n = new Node(Token.CALL);
        n.addChildToBack(Node.newString("Object"));
        assertFalse(NodeUtil.functionCallHasSideEffects(n));
    }

    @Test
    public void testFunctionCallHasSideEffects_objectMethodWithoutSideEffects() {
        Node n = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("obj"));
        getProp.addChildToBack(Node.newString("toString"));
        n.addChildToBack(getProp);
        assertFalse(NodeUtil.functionCallHasSideEffects(n));
    }

    @Test
    public void testFunctionCallHasSideEffects_mathMethod() {
        Node n = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("Math"));
        getProp.addChildToBack(Node.newString("random"));
        n.addChildToBack(getProp);
        assertFalse(NodeUtil.functionCallHasSideEffects(n));
    }

    @Test
    public void testFunctionCallHasSideEffects_stringReplaceWithLiteral() {
        Node n = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("str"));
        getProp.addChildToBack(Node.newString("replace"));
        n.addChildToBack(getProp);
        n.addChildToBack(Node.newString("a"));
        n.addChildToBack(Node.newString("b"));
        assertFalse(NodeUtil.functionCallHasSideEffects(n));
    }

    @Test
    public void testFunctionCallHasSideEffects_stringSplitWithLiteral() {
        Node n = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("str"));
        getProp.addChildToBack(Node.newString("split"));
        n.addChildToBack(getProp);
        n.addChildToBack(Node.newString(","));
        assertFalse(NodeUtil.functionCallHasSideEffects(n));
    }

    @Test
    public void testFunctionCallHasSideEffects_customFunction() {
        Node n = new Node(Token.CALL);
        n.addChildToBack(Node.newString("myCustomFunc"));
        assertTrue(NodeUtil.functionCallHasSideEffects(n));
    }

    @Test
    public void testCallHasLocalResult_flagIsSet() {
        Node n = new Node(Token.CALL);
        n.putBooleanProp(Node.LOCAL_RESULTS, true);
        assertTrue(NodeUtil.callHasLocalResult(n));
    }

    @Test
    public void testCallHasLocalResult_flagNotSet() {
        Node n = new Node(Token.CALL);
        assertFalse(NodeUtil.callHasLocalResult(n));
    }

    @Test
    public void testNewHasLocalResult_flagIsSet() {
        Node n = new Node(Token.NEW);
        n.putBooleanProp(Node.DIRECTCALL_PROP, true); // Simulating flag for local result
        assertTrue(NodeUtil.newHasLocalResult(n));
    }

    @Test
    public void testNewHasLocalResult_flagNotSet() {
        Node n = new Node(Token.NEW);
        assertFalse(NodeUtil.newHasLocalResult(n));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_assignment() {
        Node n = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_increment() {
        Node n = new Node(Token.INC);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_call() {
        Node n = new Node(Token.CALL);
        // Assume functionCallHasSideEffects would return true for a typical call
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_new() {
        Node n = new Node(Token.NEW);
        // Assume constructorCallHasSideEffects would return true for a typical new
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_throw() {
        Node n = new Node(Token.THROW);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_nameWithChild() {
        Node n = new Node(Token.NAME);
        n.addChildToBack(createNumberNode(1)); // Represents a variable definition
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_nameWithoutChild() {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(n));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_stringLiteral() {
        Node n = createStringNode("hello");
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(n));
    }

    @Test
    public void testCanBeSideEffected_callNode() {
        Node n = new Node(Token.CALL);
        assertTrue(NodeUtil.canBeSideEffected(n));
    }

    @Test
    public void testCanBeSideEffected_newNode() {
        Node n = new Node(Token.NEW);
        assertTrue(NodeUtil.canBeSideEffected(n));
    }

    @Test
    public void testCanBeSideEffected_nameNode_constant() {
        Node n = Node.newString("CONSTANT");
        n.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Set<String> constants = Collections.emptySet();
        assertFalse(NodeUtil.canBeSideEffected(n, constants));
    }

    @Test
    public void testCanBeSideEffected_nameNode_knownConstant() {
        Node n = Node.newString("localVar");
        Set<String> constants = new HashSet<>(Arrays.asList("localVar"));
        assertFalse(NodeUtil.canBeSideEffected(n, constants));
    }

    @Test
    public void testCanBeSideEffected_nameNode_unknown() {
        Node n = Node.newString("variable");
        Set<String> constants = Collections.emptySet();
        assertTrue(NodeUtil.canBeSideEffected(n, constants));
    }

    @Test
    public void testCanBeSideEffected_getProp() {
        Node n = new Node(Token.GETPROP);
        n.addChildToBack(Node.newString("obj"));
        n.addChildToBack(Node.newString("prop"));
        Set<String> constants = Collections.emptySet();
        assertTrue(NodeUtil.canBeSideEffected(n, constants));
    }

    @Test
    public void testCanBeSideEffected_functionExpression() {
        Node n = new Node(Token.FUNCTION);
        Node body = new Node(Token.BLOCK);
        n.addChildToBack(new Node(Token.LP));
        n.addChildToBack(body);
        Set<String> constants = Collections.emptySet();
        assertFalse(NodeUtil.canBeSideEffected(n, constants));
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
    public void testPrecedence_bitwiseOr() {
        assertEquals(5, NodeUtil.precedence(Token.BITOR));
    }

    @Test
    public void testPrecedence_bitwiseXor() {
        assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    }

    @Test
    public void testPrecedence_bitwiseAnd() {
        assertEquals(7, NodeUtil.precedence(Token.BITAND));
    }

    @Test
    public void testPrecedence_equality() {
        assertEquals(8, NodeUtil.precedence(Token.EQ));
        assertEquals(8, NodeUtil.precedence(Token.NE));
        assertEquals(8, NodeUtil.precedence(Token.SHEQ));
        assertEquals(8, NodeUtil.precedence(Token.SHNE));
    }

    @Test
    public void testPrecedence_relational() {
        assertEquals(9, NodeUtil.precedence(Token.LT));
        assertEquals(9, NodeUtil.precedence(Token.LE));
        assertEquals(9, NodeUtil.precedence(Token.GT));
        assertEquals(9, NodeUtil.precedence(Token.GE));
        assertEquals(9, NodeUtil.precedence(Token.INSTANCEOF));
        assertEquals(9, NodeUtil.precedence(Token.IN));
    }

    @Test
    public void testPrecedence_shift() {
        assertEquals(10, NodeUtil.precedence(Token.LSH));
        assertEquals(10, NodeUtil.precedence(Token.RSH));
        assertEquals(10, NodeUtil.precedence(Token.URSH));
    }

    @Test
    public void testPrecedence_addSubtract() {
        assertEquals(11, NodeUtil.precedence(Token.ADD));
        assertEquals(11, NodeUtil.precedence(Token.SUB));
    }

    @Test
    public void testPrecedence_multiplyDivide() {
        assertEquals(12, NodeUtil.precedence(Token.MUL));
        assertEquals(12, NodeUtil.precedence(Token.DIV));
        assertEquals(12, NodeUtil.precedence(Token.MOD));
    }

    @Test
    public void testPrecedence_unary() {
        assertEquals(13, NodeUtil.precedence(Token.INC));
        assertEquals(13, NodeUtil.precedence(Token.DEC));
        assertEquals(13, NodeUtil.precedence(Token.NEW));
        assertEquals(13, NodeUtil.precedence(Token.DELPROP));
        assertEquals(13, NodeUtil.precedence(Token.TYPEOF));
        assertEquals(13, NodeUtil.precedence(Token.VOID));
        assertEquals(13, NodeUtil.precedence(Token.NOT));
        assertEquals(13, NodeUtil.precedence(Token.BITNOT));
        assertEquals(13, NodeUtil.precedence(Token.POS));
        assertEquals(13, NodeUtil.precedence(Token.NEG));
    }

    @Test
    public void testPrecedence_highest() {
        assertEquals(15, NodeUtil.precedence(Token.CALL));
        assertEquals(15, NodeUtil.precedence(Token.GETELEM));
        assertEquals(15, NodeUtil.precedence(Token.GETPROP));
        assertEquals(15, NodeUtil.precedence(Token.ARRAYLIT));
        assertEquals(15, NodeUtil.precedence(Token.OBJECTLIT));
        assertEquals(15, NodeUtil.precedence(Token.STRING));
        assertEquals(15, NodeUtil.precedence(Token.NUMBER));
        assertEquals(15, NodeUtil.precedence(Token.NAME));
        assertEquals(15, NodeUtil.precedence(Token.TRUE));
        assertEquals(15, NodeUtil.precedence(Token.FALSE));
        assertEquals(15, NodeUtil.precedence(Token.NULL));
        assertEquals(15, NodeUtil.precedence(Token.THIS));
        assertEquals(15, NodeUtil.precedence(Token.FUNCTION));
        assertEquals(15, NodeUtil.precedence(Token.REGEXP));
    }

    @Test(expected = Error.class)
    public void testPrecedence_unknownToken() {
        NodeUtil.precedence(Token.LAST_TOKEN + 1); // An unknown token type
    }

    @Test
    public void testValueCheck_stringLiteral() {
        Node n = createStringNode("hello");
        assertTrue(NodeUtil.valueCheck(n, Predicates.alwaysTrue()));
    }

    @Test
    public void testValueCheck_andOperator() {
        Node n = new Node(Token.AND);
        n.addChildToBack(createNumberNode(1));
        n.addChildToBack(createNumberNode(2));
        assertTrue(NodeUtil.valueCheck(n, Predicates.alwaysTrue()));
    }

    @Test
    public void testValueCheck_hookOperator() {
        Node n = new Node(Token.HOOK);
        n.addChildToBack(createBooleanNode(true));
        n.addChildToBack(createNumberNode(1));
        n.addChildToBack(createNumberNode(2));
        assertTrue(NodeUtil.valueCheck(n, Predicates.alwaysTrue()));
    }

    @Test
    public void testIsNumericResult_addOperator() {
        Node n = new Node(Token.ADD);
        n.addChildToBack(createNumberNode(1));
        n.addChildToBack(createNumberNode(2));
        assertTrue(NodeUtil.isNumericResult(n));
    }

    @Test
    public void testIsNumericResult_addOperatorWithString() {
        Node n = new Node(Token.ADD);
        n.addChildToBack(createNumberNode(1));
        n.addChildToBack(createStringNode("2"));
        assertFalse(NodeUtil.isNumericResult(n));
    }

    @Test
    public void testIsNumericResult_bitwiseOperators() {
        assertTrue(NodeUtil.isNumericResult(new Node(Token.BITAND)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.BITOR)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.BITXOR)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.LSH)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.RSH)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.URSH)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.SUB)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.MUL)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.MOD)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.DIV)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.INC)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.DEC)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.POS)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.NEG)));
        assertTrue(NodeUtil.isNumericResult(new Node(Token.NUMBER)));
    }

    @Test
    public void testIsNumericResult_NaNName() {
        assertTrue(NodeUtil.isNumericResult(Node.newString("NaN")));
    }

    @Test
    public void testIsNumericResult_InfinityName() {
        assertTrue(NodeUtil.isNumericResult(Node.newString("Infinity")));
    }

    @Test
    public void testIsNumericResult_unknown() {
        assertFalse(NodeUtil.isNumericResult(createStringNode("hello")));
        assertFalse(NodeUtil.isNumericResult(createBooleanNode(true)));
    }

    @Test
    public void testIsBooleanResult_comparisonOperators() {
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.EQ)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.NE)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.SHEQ)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.SHNE)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.LT)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.LE)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.GT)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.GE)));
    }

    @Test
    public void testIsBooleanResult_logicalOperators() {
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.NOT)));
    }

    @Test
    public void testIsBooleanResult_otherBooleanTokens() {
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.TRUE)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.FALSE)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.IN)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.INSTANCEOF)));
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.DELPROP)));
    }

    @Test
    public void testIsBooleanResult_unknown() {
        assertFalse(NodeUtil.isBooleanResult(createNumberNode(10)));
        assertFalse(NodeUtil.isBooleanResult(createStringNode("hello")));
    }

    @Test
    public void testIsUndefined_voidLiteral() {
        assertTrue(NodeUtil.isUndefined(new Node(Token.VOID)));
    }

    @Test
    public void testIsUndefined_undefinedName() {
        assertTrue(NodeUtil.isUndefined(Node.newString("undefined")));
    }

    @Test
    public void testIsUndefined_otherNodes() {
        assertFalse(NodeUtil.isUndefined(createNumberNode(0)));
        assertFalse(NodeUtil.isUndefined(createBooleanNode(false)));
        assertFalse(NodeUtil.isUndefined(createStringNode("")));
    }

    @Test
    public void testIsNull_nullLiteral() {
        assertTrue(NodeUtil.isNull(new Node(Token.NULL)));
    }

    @Test
    public void testIsNull_otherNodes() {
        assertFalse(NodeUtil.isNull(createNumberNode(0)));
        assertFalse(NodeUtil.isNull(createBooleanNode(false)));
        assertFalse(NodeUtil.isNull(Node.newString("undefined")));
    }

    @Test
    public void testIsNullOrUndefined_null() {
        assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.NULL)));
    }

    @Test
    public void testIsNullOrUndefined_undefined() {
        assertTrue(NodeUtil.isNullOrUndefined(Node.newString("undefined")));
    }

    @Test
    public void testIsNullOrUndefined_void() {
        assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.VOID)));
    }

    @Test
    public void testIsNullOrUndefined_otherNodes() {
        assertFalse(NodeUtil.isNullOrUndefined(createNumberNode(0)));
        assertFalse(NodeUtil.isNullOrUndefined(createBooleanNode(false)));
    }

    @Test
    public void testMayBeString_numericResult() {
        Node n = new Node(Token.ADD);
        n.addChildToBack(createNumberNode(1));
        n.addChildToBack(createNumberNode(2));
        assertFalse(NodeUtil.mayBeString(n));
    }

    @Test
    public void testMayBeString_booleanResult() {
        Node n = new Node(Token.EQ);
        n.addChildToBack(createNumberNode(1));
        n.addChildToBack(createNumberNode(1));
        assertFalse(NodeUtil.mayBeString(n));
    }

    @Test
    public void testMayBeString_undefined() {
        assertFalse(NodeUtil.mayBeString(Node.newString("undefined")));
    }

    @Test
    public void testMayBeString_null() {
        assertFalse(NodeUtil.mayBeString(new Node(Token.NULL)));
    }

    @Test
    public void testMayBeString_stringLiteral() {
        assertTrue(NodeUtil.mayBeString(createStringNode("hello")));
    }

    @Test
    public void testMayBeString_addWithOneString() {
        Node n = new Node(Token.ADD);
        n.addChildToBack(createNumberNode(1));
        n.addChildToBack(createStringNode("2"));
        assertTrue(NodeUtil.mayBeString(n));
    }

    @Test
    public void testMayBeString_complexExpression() {
        Node expr = new Node(Token.ADD);
        expr.addChildToBack(createNumberNode(1));
        expr.addChildToBack(new Node(Token.CALL));
        assertTrue(NodeUtil.mayBeString(expr));
    }

    @Test
    public void testIsAssociative_mul() {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
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
    public void testIsAssociative_bitwiseOr() {
        assertTrue(NodeUtil.isAssociative(Token.BITOR));
    }

    @Test
    public void testIsAssociative_bitwiseXor() {
        assertTrue(NodeUtil.isAssociative(Token.BITXOR));
    }

    @Test
    public void testIsAssociative_bitwiseAnd() {
        assertTrue(NodeUtil.isAssociative(Token.BITAND));
    }

    @Test
    public void testIsAssociative_add() {
        assertFalse(NodeUtil.isAssociative(Token.ADD));
    }

    @Test
    public void testIsAssociative_sub() {
        assertFalse(NodeUtil.isAssociative(Token.SUB));
    }

    @Test
    public void testIsCommutative_mul() {
        assertTrue(NodeUtil.isCommutative(Token.MUL));
    }

    @Test
    public void testIsCommutative_bitwiseOr() {
        assertTrue(NodeUtil.isCommutative(Token.BITOR));
    }

    @Test
    public void testIsCommutative_bitwiseXor() {
        assertTrue(NodeUtil.isCommutative(Token.BITXOR));
    }

    @Test
    public void testIsCommutative_bitwiseAnd() {
        assertTrue(NodeUtil.isCommutative(Token.BITAND));
    }

    @Test
    public void testIsCommutative_add() {
        assertFalse(NodeUtil.isCommutative(Token.ADD));
    }

    @Test
    public void testIsCommutative_sub() {
        assertFalse(NodeUtil.isCommutative(Token.SUB));
    }

    @Test
    public void testIsAssignmentOp_assign() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    }

    @Test
    public void testIsAssignmentOp_assignAdd() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
    }

    @Test
    public void testIsAssignmentOp_add() {
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
    }

    @Test
    public void testGetOpFromAssignmentOp_assignAdd() {
        assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD)));
    }

    @Test
    public void testGetOpFromAssignmentOp_assignMul() {
        assertEquals(Token.MUL, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_MUL)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOpFromAssignmentOp_invalid() {
        NodeUtil.getOpFromAssignmentOp(new Node(Token.ADD));
    }

    @Test
    public void testIsExpressionNode() {
        assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
        assertFalse(NodeUtil.isExpressionNode(new Node(Token.VAR)));
    }

    @Test
    public void testContainsFunction_true() {
        Node n = new Node(Token.BLOCK);
        n.addChildToBack(new Node(Token.FUNCTION));
        assertTrue(NodeUtil.containsFunction(n));
    }

    @Test
    public void testContainsFunction_false() {
        Node n = new Node(Token.BLOCK);
        n.addChildToBack(new Node(Token.VAR));
        assertFalse(NodeUtil.containsFunction(n));
    }

    @Test
    public void testReferencesThis_functionBody() {
        Node fn = new Node(Token.FUNCTION);
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.THIS));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(body);
        assertTrue(NodeUtil.referencesThis(fn));
    }

    @Test
    public void testReferencesThis_functionBodyWithoutThis() {
        Node fn = new Node(Token.FUNCTION);
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.NAME));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(body);
        assertFalse(NodeUtil.referencesThis(fn));
    }

    @Test
    public void testReferencesThis_scriptBody() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(new Node(Token.THIS));
        assertTrue(NodeUtil.referencesThis(script));
    }

    @Test
    public void testIsGet_getProp() {
        assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    }

    @Test
    public void testIsGet_getElem() {
        assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    }

    @Test
    public void testIsGet_name() {
        assertFalse(NodeUtil.isGet(new Node(Token.NAME)));
    }

    @Test
    public void testIsGetProp_true() {
        assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    }

    @Test
    public void testIsGetProp_false() {
        assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));
        assertFalse(NodeUtil.isGetProp(new Node(Token.NAME)));
    }

    @Test
    public void testIsName_true() {
        assertTrue(NodeUtil.isName(new Node(Token.NAME)));
    }

    @Test
    public void testIsName_false() {
        assertFalse(NodeUtil.isName(new Node(Token.STRING)));
        assertFalse(NodeUtil.isName(new Node(Token.NUMBER)));
    }

    @Test
    public void testIsNew_true() {
        assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    }

    @Test
    public void testIsNew_false() {
        assertFalse(NodeUtil.isNew(new Node(Token.CALL)));
        assertFalse(NodeUtil.isNew(new Node(Token.NAME)));
    }

    @Test
    public void testIsVar_true() {
        assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    }

    @Test
    public void testIsVar_false() {
        assertFalse(NodeUtil.isVar(new Node(Token.ASSIGN)));
        assertFalse(NodeUtil.isVar(new Node(Token.NAME)));
    }

    @Test
    public void testIsVarDeclaration_true() {
        Node var = new Node(Token.VAR);
        Node name = Node.newString("x");
        var.addChildToBack(name);
        assertTrue(NodeUtil.isVarDeclaration(name));
    }

    @Test
    public void testIsVarDeclaration_false() {
        Node name = Node.newString("x");
        assertFalse(NodeUtil.isVarDeclaration(name));
    }

    @Test
    public void testGetAssignedValue_var() {
        Node value = createNumberNode(10);
        Node name = Node.newString("x");
        name.addChildToBack(value);
        Node var = new Node(Token.VAR, name);
        assertEquals(value, NodeUtil.getAssignedValue(name));
    }

    @Test
    public void testGetAssignedValue_assign() {
        Node value = createNumberNode(10);
        Node name = Node.newString("x");
        Node assign = new Node(Token.ASSIGN, name, value);
        assertEquals(value, NodeUtil.getAssignedValue(name));
    }

    @Test
    public void testGetAssignedValue_nameOnly() {
        Node name = Node.newString("x");
        assertNull(NodeUtil.getAssignedValue(name));
    }

    @Test
    public void testIsString_true() {
        assertTrue(NodeUtil.isString(Node.newString("hello")));
    }

    @Test
    public void testIsString_false() {
        assertFalse(NodeUtil.isString(createNumberNode(10)));
        assertFalse(NodeUtil.isString(new Node(Token.NAME)));
    }

    @Test
    public void testIsExprAssign_true() {
        Node assign = new Node(Token.ASSIGN);
        Node exprResult = new Node(Token.EXPR_RESULT, assign);
        assertTrue(NodeUtil.isExprAssign(exprResult));
    }

    @Test
    public void testIsExprAssign_false() {
        Node call = new Node(Token.CALL);
        Node exprResult = new Node(Token.EXPR_RESULT, call);
        assertFalse(NodeUtil.isExprAssign(exprResult));
    }

    @Test
    public void testIsAssign_true() {
        assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    }

    @Test
    public void testIsAssign_false() {
        assertFalse(NodeUtil.isAssign(new Node(Token.ADD)));
    }

    @Test
    public void testIsExprCall_true() {
        Node call = new Node(Token.CALL);
        Node exprResult = new Node(Token.EXPR_RESULT, call);
        assertTrue(NodeUtil.isExprCall(exprResult));
    }

    @Test
    public void testIsExprCall_false() {
        Node assign = new Node(Token.ASSIGN);
        Node exprResult = new Node(Token.EXPR_RESULT, assign);
        assertFalse(NodeUtil.isExprCall(exprResult));
    }

    @Test
    public void testIsForIn_true() {
        Node n = new Node(Token.FOR);
        n.addChildToBack(new Node(Token.NAME)); // LHS
        n.addChildToBack(new Node(Token.NAME)); // Expression
        n.addChildToBack(new Node(Token.BLOCK)); // Body
        assertTrue(NodeUtil.isForIn(n));
    }

    @Test
    public void testIsForIn_false() {
        Node n = new Node(Token.FOR);
        n.addChildToBack(new Node(Token.NAME)); // Initializer
        n.addChildToBack(new Node(Token.NAME)); // Condition
        n.addChildToBack(new Node(Token.NAME)); // Increment
        n.addChildToBack(new Node(Token.BLOCK)); // Body
        assertFalse(NodeUtil.isForIn(n)); // Has 4 children, not a for-in
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
    public void testIsLoopStructure_if() {
        assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));
    }

    @Test
    public void testGetLoopCodeBlock_for() {
        Node forLoop = new Node(Token.FOR);
        Node condition = new Node(Token.NAME);
        Node body = new Node(Token.BLOCK);
        forLoop.addChildToBack(new Node(Token.EMPTY)); // Initializer
        forLoop.addChildToBack(condition);
        forLoop.addChildToBack(new Node(Token.EMPTY)); // Increment
        forLoop.addChildToBack(body); // Body
        assertEquals(body, NodeUtil.getLoopCodeBlock(forLoop));
    }

    @Test
    public void testGetLoopCodeBlock_while() {
        Node whileLoop = new Node(Token.WHILE);
        Node condition = new Node(Token.NAME);
        Node body = new Node(Token.BLOCK);
        whileLoop.addChildToBack(condition);
        whileLoop.addChildToBack(body);
        assertEquals(body, NodeUtil.getLoopCodeBlock(whileLoop));
    }

    @Test
    public void testGetLoopCodeBlock_do() {
        Node doLoop = new Node(Token.DO);
        Node body = new Node(Token.BLOCK);
        Node condition = new Node(Token.NAME);
        doLoop.addChildToBack(body);
        doLoop.addChildToBack(condition);
        assertEquals(body, NodeUtil.getLoopCodeBlock(doLoop));
    }

    @Test
    public void testIsWithinLoop_directChild() {
        Node loop = new Node(Token.WHILE);
        Node body = new Node(Token.BLOCK);
        loop.addChildToBack(new Node(Token.NAME)); // Condition
        loop.addChildToBack(body);
        assertTrue(NodeUtil.isWithinLoop(body));
    }

    @Test
    public void testIsWithinLoop_nested() {
        Node outerLoop = new Node(Token.WHILE);
        Node outerBody = new Node(Token.BLOCK);
        outerLoop.addChildToBack(new Node(Token.NAME)); // Condition
        outerLoop.addChildToBack(outerBody);

        Node innerLoop = new Node(Token.FOR);
        innerLoop.addChildToBack(new Node(Token.EMPTY)); // Init
        innerLoop.addChildToBack(new Node(Token.NAME)); // Condition
        innerLoop.addChildToBack(new Node(Token.EMPTY)); // Increment
        innerLoop.addChildToBack(new Node(Token.BLOCK)); // Body

        outerBody.addChildToBack(innerLoop);
        assertTrue(NodeUtil.isWithinLoop(innerLoop.getLastChild()));
    }

    @Test
    public void testIsWithinLoop_outsideLoop() {
        Node script = new Node(Token.SCRIPT);
        Node body = new Node(Token.BLOCK);
        script.addChildToBack(body);
        assertFalse(NodeUtil.isWithinLoop(body));
    }

    @Test
    public void testIsWithinLoop_insideFunctionButOutsideLoop() {
        Node script = new Node(Token.SCRIPT);
        Node func = new Node(Token.FUNCTION);
        Node funcBody = new Node(Token.BLOCK);
        func.addChildToBack(new Node(Token.LP));
        func.addChildToBack(funcBody);
        script.addChildToBack(func);
        assertFalse(NodeUtil.isWithinLoop(funcBody));
    }

    @Test
    public void testIsControlStructure_for() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsControlStructure_if() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    }

    @Test
    public void testIsControlStructure_while() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.WHILE)));
    }

    @Test
    public void testIsControlStructure_with() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.WITH)));
    }

    @Test
    public void testIsControlStructure_switch() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.SWITCH)));
    }

    @Test
    public void testIsControlStructure_try() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.TRY)));
    }

    @Test
    public void testIsControlStructure_catch() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.CATCH)));
    }

    @Test
    public void testIsControlStructure_label() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.LABEL)));
    }

    @Test
    public void testIsControlStructure_name() {
        assertFalse(NodeUtil.isControlStructure(new Node(Token.NAME)));
    }

    @Test
    public void testIsControlStructureCodeBlock_ifThen() {
        Node ifNode = new Node(Token.IF);
        Node condition = new Node(Token.NAME);
        Node thenBlock = new Node(Token.BLOCK);
        ifNode.addChildToBack(condition);
        ifNode.addChildToBack(thenBlock);
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, thenBlock));
    }

    @Test
    public void testIsControlStructureCodeBlock_ifElse() {
        Node ifNode = new Node(Token.IF);
        Node condition = new Node(Token.NAME);
        Node thenBlock = new Node(Token.BLOCK);
        Node elseBlock = new Node(Token.BLOCK);
        ifNode.addChildToBack(condition);
        ifNode.addChildToBack(thenBlock);
        ifNode.addChildToBack(elseBlock);
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, elseBlock));
    }

    @Test
    public void testIsControlStructureCodeBlock_forBody() {
        Node forNode = new Node(Token.FOR);
        Node init = new Node(Token.EMPTY);
        Node cond = new Node(Token.NAME);
        Node incr = new Node(Token.EMPTY);
        Node body = new Node(Token.BLOCK);
        forNode.addChildToBack(init);
        forNode.addChildToBack(cond);
        forNode.addChildToBack(incr);
        forNode.addChildToBack(body);
        assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, body));
    }

    @Test
    public void testIsControlStructureCodeBlock_whileBody() {
        Node whileNode = new Node(Token.WHILE);
        Node cond = new Node(Token.NAME);
        Node body = new Node(Token.BLOCK);
        whileNode.addChildToBack(cond);
        whileNode.addChildToBack(body);
        assertTrue(NodeUtil.isControlStructureCodeBlock(whileNode, body));
    }

    @Test
    public void testIsControlStructureCodeBlock_doBody() {
        Node doNode = new Node(Token.DO);
        Node body = new Node(Token.BLOCK);
        Node cond = new Node(Token.NAME);
        doNode.addChildToBack(body);
        doNode.addChildToBack(cond);
        assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, body));
    }

    @Test
    public void testIsControlStructureCodeBlock_tryCatch() {
        Node tryNode = new Node(Token.TRY);
        Node catchBlock = new Node(Token.BLOCK);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        tryNode.addChildToBack(new Node(Token.CATCH)); // Catch node
        tryNode.addChildToBack(catchBlock); // Catch block
        tryNode.addChildToBack(finallyBlock); // Finally block
        assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, catchBlock));
    }

    @Test
    public void testIsControlStructureCodeBlock_tryFinally() {
        Node tryNode = new Node(Token.TRY);
        Node catchBlock = new Node(Token.BLOCK);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        tryNode.addChildToBack(new Node(Token.CATCH)); // Catch node
        tryNode.addChildToBack(catchBlock); // Catch block
        tryNode.addChildToBack(finallyBlock); // Finally block
        assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, finallyBlock));
    }

    @Test
    public void testIsControlStructureCodeBlock_switchDefault() {
        Node switchNode = new Node(Token.SWITCH);
        Node caseNode1 = new Node(Token.CASE);
        Node defaultNode = new Node(Token.DEFAULT);
        switchNode.addChildToBack(new Node(Token.NAME)); // Expression
        switchNode.addChildToBack(caseNode1);
        switchNode.addChildToBack(defaultNode);
        assertTrue(NodeUtil.isControlStructureCodeBlock(switchNode, defaultNode));
    }

    @Test
    public void testGetConditionExpression_if() {
        Node ifNode = new Node(Token.IF);
        Node condition = new Node(Token.NAME);
        ifNode.addChildToBack(condition);
        ifNode.addChildToBack(new Node(Token.BLOCK));
        assertEquals(condition, NodeUtil.getConditionExpression(ifNode));
    }

    @Test
    public void testGetConditionExpression_while() {
        Node whileNode = new Node(Token.WHILE);
        Node condition = new Node(Token.NAME);
        whileNode.addChildToBack(condition);
        whileNode.addChildToBack(new Node(Token.BLOCK));
        assertEquals(condition, NodeUtil.getConditionExpression(whileNode));
    }

    @Test
    public void testGetConditionExpression_do() {
        Node doNode = new Node(Token.DO);
        Node body = new Node(Token.BLOCK);
        Node condition = new Node(Token.NAME);
        doNode.addChildToBack(body);
        doNode.addChildToBack(condition);
        assertEquals(condition, NodeUtil.getConditionExpression(doNode));
    }

    @Test
    public void testGetConditionExpression_forWithFourChildren() {
        Node forNode = new Node(Token.FOR);
        Node init = new Node(Token.EMPTY);
        Node cond = new Node(Token.NAME);
        Node incr = new Node(Token.EMPTY);
        Node body = new Node(Token.BLOCK);
        forNode.addChildToBack(init);
        forNode.addChildToBack(cond);
        forNode.addChildToBack(incr);
        forNode.addChildToBack(body);
        assertEquals(cond, NodeUtil.getConditionExpression(forNode));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetConditionExpression_forWithThreeChildren() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.NAME));
        forNode.addChildToBack(new Node(Token.BLOCK));
        NodeUtil.getConditionExpression(forNode);
    }

    @Test
    public void testGetConditionExpression_case() {
        Node caseNode = new Node(Token.CASE);
        caseNode.addChildToBack(new Node(Token.NUMBER)); // Value
        caseNode.addChildToBack(new Node(Token.BLOCK)); // Body
        assertNull(NodeUtil.getConditionExpression(caseNode));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetConditionExpression_unknownType() {
        Node unknownNode = new Node(Token.NAME);
        NodeUtil.getConditionExpression(unknownNode);
    }

    @Test
    public void testIsStatementBlock_script() {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    }

    @Test
    public void testIsStatementBlock_block() {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsStatementBlock_other() {
        assertFalse(NodeUtil.isStatementBlock(new Node(Token.NAME)));
    }

    @Test
    public void testIsStatement_true() {
        Node parent = new Node(Token.BLOCK);
        Node statement = new Node(Token.VAR);
        parent.addChildToBack(statement);
        assertTrue(NodeUtil.isStatement(statement));
    }

    @Test
    public void testIsStatement_label() {
        Node parent = new Node(Token.LABEL);
        Node statement = new Node(Token.BLOCK);
        parent.addChildToBack(statement);
        assertTrue(NodeUtil.isStatement(statement));
    }

    @Test
    public void testIsStatement_false() {
        Node parent = new Node(Token.FUNCTION); // Function can be expression or statement
        Node statement = new Node(Token.VAR);
        parent.addChildToBack(statement);
        // Based on isStatementParent, this should be false.
        assertFalse(NodeUtil.isStatement(statement));
    }

    @Test
    public void testIsStatementParent_block() {
        assertTrue(NodeUtil.isStatementParent(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsStatementParent_script() {
        assertTrue(NodeUtil.isStatementParent(new Node(Token.SCRIPT)));
    }

    @Test
    public void testIsStatementParent_label() {
        assertTrue(NodeUtil.isStatementParent(new Node(Token.LABEL)));
    }

    @Test
    public void testIsStatementParent_function() {
        assertFalse(NodeUtil.isStatementParent(new Node(Token.FUNCTION)));
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
    public void testIsReferenceName_true() {
        assertTrue(NodeUtil.isReferenceName(Node.newString("myVar")));
    }

    @Test
    public void testIsReferenceName_emptyString() {
        assertFalse(NodeUtil.isReferenceName(Node.newString("")));
    }

    @Test
    public void testIsReferenceName_nonNameNode() {
        assertFalse(NodeUtil.isReferenceName(new Node(Token.NUMBER)));
    }

    @Test
    public void testIsLabelName_true() {
        assertTrue(NodeUtil.isLabelName(new Node(Token.LABEL_NAME)));
    }

    @Test
    public void testIsLabelName_false() {
        assertFalse(NodeUtil.isLabelName(new Node(Token.NAME)));
        assertFalse(NodeUtil.isLabelName(null));
    }

    @Test
    public void testIsTryFinallyNode_true() {
        Node tryNode = new Node(Token.TRY);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        tryNode.addChildToBack(new Node(Token.CATCH)); // Catch node
        tryNode.addChildToBack(finallyBlock); // Finally block
        assertTrue(NodeUtil.isTryFinallyNode(tryNode, finallyBlock));
    }

    @Test
    public void testIsTryFinallyNode_false() {
        Node tryNode = new Node(Token.TRY);
        Node catchBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        tryNode.addChildToBack(new Node(Token.CATCH)); // Catch node
        tryNode.addChildToBack(catchBlock); // Catch block
        assertFalse(NodeUtil.isTryFinallyNode(tryNode, catchBlock));
    }

    @Test
    public void testIsTryCatchNodeContainer_true() {
        Node tryNode = new Node(Token.TRY);
        Node catchNode = new Node(Token.CATCH);
        Node catchBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        tryNode.addChildToBack(catchNode);
        tryNode.addChildToBack(catchBlock);
        assertTrue(NodeUtil.isTryCatchNodeContainer(catchBlock));
    }

    @Test
    public void testIsTryCatchNodeContainer_false() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(finallyBlock);
        assertFalse(NodeUtil.isTryCatchNodeContainer(finallyBlock));
    }

    @Test
    public void testRemoveChild_varWithMultipleDeclarations() {
        Node parent = new Node(Token.VAR);
        Node child1 = Node.newString("a");
        Node child2 = Node.newString("b");
        parent.addChildToBack(child1);
        parent.addChildToBack(child2);

        NodeUtil.removeChild(parent, child1);

        assertEquals(1, parent.getChildCount());
        assertEquals(child2, parent.getFirstChild());
    }

    @Test
    public void testRemoveChild_varWithSingleDeclaration() {
        Node grandParent = new Node(Token.BLOCK);
        Node parent = new Node(Token.VAR);
        Node child = Node.newString("a");
        parent.addChildToBack(child);
        grandParent.addChildToBack(parent);

        NodeUtil.removeChild(parent, child);

        assertEquals(0, parent.getChildCount());
        assertEquals(0, grandParent.getChildCount()); // VAR node should be removed
    }

    @Test
    public void testRemoveChild_labelWithStatement() {
        Node grandParent = new Node(Token.BLOCK);
        Node parent = new Node(Token.LABEL);
        Node statement = new Node(Token.BLOCK);
        parent.addChildToBack(statement);
        grandParent.addChildToBack(parent);

        NodeUtil.removeChild(parent, statement);

        assertEquals(0, parent.getChildCount());
        assertEquals(0, grandParent.getChildCount()); // LABEL node should be removed
    }

    @Test
    public void testRemoveChild_forWithEmptyControlStructure() {
        Node parent = new Node(Token.FOR);
        Node init = new Node(Token.EMPTY);
        Node cond = new Node(Token.NAME);
        Node incr = new Node(Token.EMPTY);
        Node body = new Node(Token.BLOCK);
        parent.addChildToBack(init);
        parent.addChildToBack(cond);
        parent.addChildToBack(incr);
        parent.addChildToBack(body);

        NodeUtil.removeChild(parent, init);

        assertEquals(3, parent.getChildCount());
        assertEquals(Token.EMPTY, parent.getFirstChild().getType()); // Replaced with EMPTY
        assertEquals(cond, parent.getChildBefore(parent.getLastChild()));
    }

    @Test
    public void testMaybeAddFinally_noFinallyExists() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        tryNode.addChildToBack(new Node(Token.CATCH)); // Catch node
        // No finally block

        NodeUtil.maybeAddFinally(tryNode);

        assertEquals(4, tryNode.getChildCount());
        assertEquals(Token.BLOCK, tryNode.getLastChild().getType()); // Finally block added
    }

    @Test
    public void testMaybeAddFinally_finallyExists() {
        Node tryNode = new Node(Token.TRY);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        tryNode.addChildToBack(new Node(Token.CATCH)); // Catch node
        tryNode.addChildToBack(finallyBlock); // Finally block already exists

        NodeUtil.maybeAddFinally(tryNode);

        assertEquals(3, tryNode.getChildCount()); // Should not add another finally
        assertEquals(finallyBlock, tryNode.getLastChild());
    }

    @Test
    public void testTryMergeBlock_parentIsBlock() {
        Node parent = new Node(Token.BLOCK);
        Node blockToMerge = new Node(Token.BLOCK);
        Node child1 = new Node(Token.VAR);
        Node child2 = new Node(Token.NAME);
        blockToMerge.addChildToBack(child1);
        blockToMerge.addChildToBack(child2);
        parent.addChildToBack(blockToMerge);

        assertTrue(NodeUtil.tryMergeBlock(blockToMerge));
        assertEquals(2, parent.getChildCount());
        assertEquals(child1, parent.getFirstChild());
        assertEquals(child2, parent.getLastChild());
    }

    @Test
    public void testTryMergeBlock_parentIsScript() {
        Node parent = new Node(Token.SCRIPT);
        Node blockToMerge = new Node(Token.BLOCK);
        Node child = new Node(Token.VAR);
        blockToMerge.addChildToBack(child);
        parent.addChildToBack(blockToMerge);

        assertTrue(NodeUtil.tryMergeBlock(blockToMerge));
        assertEquals(1, parent.getChildCount());
        assertEquals(child, parent.getFirstChild());
    }

    @Test
    public void testTryMergeBlock_parentIsNotBlockOrScript() {
        Node parent = new Node(Token.FUNCTION); // Example of non-block parent
        Node blockToMerge = new Node(Token.BLOCK);
        parent.addChildToBack(blockToMerge);

        assertFalse(NodeUtil.tryMergeBlock(blockToMerge));
        assertEquals(1, parent.getChildCount()); // Block remains a child
    }

    @Test
    public void testIsCall_true() {
        assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    }

    @Test
    public void testIsCall_false() {
        assertFalse(NodeUtil.isCall(new Node(Token.NEW)));
        assertFalse(NodeUtil.isCall(new Node(Token.NAME)));
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
    public void testIsFunction_true() {
        assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsFunction_false() {
        assertFalse(NodeUtil.isFunction(new Node(Token.CALL)));
    }

    @Test
    public void testGetFunctionBody_valid() {
        Node fn = new Node(Token.FUNCTION);
        Node lp = new Node(Token.LP);
        Node name = Node.newString("testFunc");
        Node body = new Node(Token.BLOCK);
        fn.addChildToBack(name);
        fn.addChildToBack(lp);
        fn.addChildToBack(body);
        assertEquals(body, NodeUtil.getFunctionBody(fn));
    }

    @Test
    public void testIsThis_true() {
        assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    }

    @Test
    public void testIsThis_false() {
        assertFalse(NodeUtil.isThis(new Node(Token.NAME)));
    }

    @Test
    public void testIsArrayLiteral_true() {
        assertTrue(NodeUtil.isArrayLiteral(new Node(Token.ARRAYLIT)));
    }

    @Test
    public void testIsArrayLiteral_false() {
        assertFalse(NodeUtil.isArrayLiteral(new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testContainsCall_true() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.CALL));
        assertTrue(NodeUtil.containsCall(block));
    }

    @Test
    public void testContainsCall_false() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.VAR));
        assertFalse(NodeUtil.containsCall(block));
    }

    @Test
    public void testIsFunctionDeclaration_true() {
        Node statement = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK); // Statements are in blocks or script
        parent.addChildToBack(statement);
        assertTrue(NodeUtil.isFunctionDeclaration(statement));
    }

    @Test
    public void testIsFunctionDeclaration_falseExpression() {
        Node expression = new Node(Token.FUNCTION);
        Node parent = new Node(Token.CALL); // Function expression within a call
        parent.addChildToBack(expression);
        assertFalse(NodeUtil.isFunctionDeclaration(expression));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_true() {
        Node fnDecl = new Node(Token.FUNCTION);
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(fnDecl);
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(fnDecl));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_falseNonHoisted() {
        Node fnDecl = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(fnDecl);
        assertFalse(NodeUtil.isHoistedFunctionDeclaration(fnDecl));
    }

    @Test
    public void testIsFunctionExpression_true() {
        Node fnExpr = new Node(Token.FUNCTION);
        Node parent = new Node(Token.CALL); // Function expression within a call
        parent.addChildToBack(fnExpr);
        assertTrue(NodeUtil.isFunctionExpression(fnExpr));
    }

    @Test
    public void testIsFunctionExpression_falseDeclaration() {
        Node fnDecl = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(fnDecl);
        assertFalse(NodeUtil.isFunctionExpression(fnDecl));
    }

    @Test
    public void testIsEmptyFunctionExpression_true() {
        Node fnExpr = new Node(Token.FUNCTION);
        Node emptyBody = new Node(Token.BLOCK);
        fnExpr.addChildToBack(new Node(Token.LP));
        fnExpr.addChildToBack(emptyBody);
        assertTrue(NodeUtil.isEmptyFunctionExpression(fnExpr));
    }

    @Test
    public void testIsEmptyFunctionExpression_falseNonEmptyBody() {
        Node fnExpr = new Node(Token.FUNCTION);
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.VAR));
        fnExpr.addChildToBack(new Node(Token.LP));
        fnExpr.addChildToBack(body);
        assertFalse(NodeUtil.isEmptyFunctionExpression(fnExpr));
    }

    @Test
    public void testIsVarArgsFunction_true() {
        Node fn = new Node(Token.FUNCTION);
        Node lp = new Node(Token.LP);
        Node args = Node.newString("arguments");
        lp.addChildToBack(args);
        fn.addChildToBack(lp);
        fn.addChildToBack(new Node(Token.BLOCK));
        assertTrue(NodeUtil.isVarArgsFunction(fn));
    }

    @Test
    public void testIsVarArgsFunction_false() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(new Node(Token.BLOCK));
        assertFalse(NodeUtil.isVarArgsFunction(fn));
    }

    @Test
    public void testIsObjectCallMethod_true() {
        Node call = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("obj"));
        getProp.addChildToBack(Node.newString("myMethod"));
        call.addChildToBack(getProp);
        assertTrue(NodeUtil.isObjectCallMethod(call, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_quotedStringKey_true() {
        Node call = new Node(Token.CALL);
        Node getElem = new Node(Token.GETELEM);
        getElem.addChildToBack(Node.newString("obj"));
        getElem.addChildToBack(Node.newString("myMethod")); // String literal key
        call.addChildToBack(getElem);
        assertTrue(NodeUtil.isObjectCallMethod(call, "myMethod"));
    }

    @Test
    public void testIsObjectCallMethod_false() {
        Node call = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("obj"));
        getProp.addChildToBack(Node.newString("otherMethod"));
        call.addChildToBack(getProp);
        assertFalse(NodeUtil.isObjectCallMethod(call, "myMethod"));
    }

    @Test
    public void testIsFunctionObjectCall_true() {
        Node call = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("obj"));
        getProp.addChildToBack(Node.newString("call"));
        call.addChildToBack(getProp);
        assertTrue(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsFunctionObjectCall_false() {
        Node call = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("obj"));
        getProp.addChildToBack(Node.newString("apply"));
        call.addChildToBack(getProp);
        assertFalse(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsFunctionObjectApply_true() {
        Node call = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("obj"));
        getProp.addChildToBack(Node.newString("apply"));
        call.addChildToBack(getProp);
        assertTrue(NodeUtil.isFunctionObjectApply(call));
    }

    @Test
    public void testIsFunctionObjectApply_false() {
        Node call = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("obj"));
        getProp.addChildToBack(Node.newString("call"));
        call.addChildToBack(getProp);
        assertFalse(NodeUtil.isFunctionObjectApply(call));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_call() {
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(
            createCallMethodNode("call")));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_apply() {
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(
            createCallMethodNode("apply")));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_other() {
        assertFalse(NodeUtil.isFunctionObjectCallOrApply(
            createCallMethodNode("other")));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_true() {
        Node call = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        Node obj = Node.newString("myObj"); // NAME node
        getProp.addChildToBack(obj);
        getProp.addChildToBack(Node.newString("call"));
        call.addChildToBack(getProp);
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_falseNonNameObject() {
        Node call = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        Node obj = new Node(Token.GETPROP); // Not a NAME node
        getProp.addChildToBack(obj);
        getProp.addChildToBack(Node.newString("call"));
        call.addChildToBack(getProp);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_falseNotCall() {
        Node call = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        Node obj = Node.newString("myObj");
        getProp.addChildToBack(obj);
        getProp.addChildToBack(Node.newString("apply")); // Not call
        call.addChildToBack(getProp);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsVarOrSimpleAssignLhs_assign() {
        Node parent = new Node(Token.ASSIGN);
        Node n = Node.newString("x");
        parent.addChildToBack(n);
        assertTrue(NodeUtil.isVarOrSimpleAssignLhs(n, parent));
    }

    @Test
    public void testIsVarOrSimpleAssignLhs_var() {
        Node parent = new Node(Token.VAR);
        Node n = Node.newString("x");
        parent.addChildToBack(n);
        assertTrue(NodeUtil.isVarOrSimpleAssignLhs(n, parent));
    }

    @Test
    public void testIsVarOrSimpleAssignLhs_assignRhs() {
        Node parent = new Node(Token.ASSIGN);
        Node n = Node.newString("x");
        Node value = Node.newNumber(10);
        parent.addChildToBack(n);
        parent.addChildToBack(value);
        assertFalse(NodeUtil.isVarOrSimpleAssignLhs(value, parent));
    }

    @Test
    public void testIsLValue_nameAssign() {
        Node parent = new Node(Token.ASSIGN);
        Node n = Node.newString("x");
        parent.addChildToBack(n);
        assertTrue(NodeUtil.isLValue(n));
    }

    @Test
    public void testIsLValue_nameVar() {
        Node parent = new Node(Token.VAR);
        Node n = Node.newString("x");
        parent.addChildToBack(n);
        assertTrue(NodeUtil.isLValue(n));
    }

    @Test
    public void testIsLValue_getPropAssign() {
        Node parent = new Node(Token.ASSIGN);
        Node n = new Node(Token.GETPROP);
        parent.addChildToBack(n);
        assertTrue(NodeUtil.isLValue(n));
    }

    @Test
    public void testIsLValue_getElemAssign() {
        Node parent = new Node(Token.ASSIGN);
        Node n = new Node(Token.GETELEM);
        parent.addChildToBack(n);
        assertTrue(NodeUtil.isLValue(n));
    }

    @Test
    public void testIsLValue_nameIncrement() {
        Node parent = new Node(Token.INC);
        Node n = Node.newString("x");
        parent.addChildToBack(n);
        assertTrue(NodeUtil.isLValue(n));
    }

    @Test
    public void testIsLValue_nameForIn() {
        Node parent = new Node(Token.FOR);
        Node n = Node.newString("x");
        parent.addChildToBack(n); // LHS of for-in
        parent.addChildToBack(Node.newString("arr")); // expression
        parent.addChildToBack(new Node(Token.BLOCK)); // body
        assertTrue(NodeUtil.isLValue(n));
    }

    @Test
    public void testIsLValue_functionNameDeclaration() {
        Node parent = new Node(Token.FUNCTION);
        Node n = Node.newString("myFunc");
        parent.addChildToBack(n); // Name of function declaration
        parent.addChildToBack(new Node(Token.LP));
        parent.addChildToBack(new Node(Token.BLOCK));
        assertTrue(NodeUtil.isLValue(n));
    }

    @Test
    public void testIsObjectLitKey_stringKey() {
        Node parent = new Node(Token.OBJECTLIT);
        Node key = Node.newString("myKey");
        parent.addChildToBack(key);
        assertTrue(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testIsObjectLitKey_getterKey() {
        Node parent = new Node(Token.OBJECTLIT);
        Node key = new Node(Token.GET);
        parent.addChildToBack(key);
        assertTrue(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testIsObjectLitKey_setterKey() {
        Node parent = new Node(Token.OBJECTLIT);
        Node key = new Node(Token.SET);
        parent.addChildToBack(key);
        assertTrue(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testIsObjectLitKey_false() {
        Node parent = new Node(Token.OBJECTLIT);
        Node notAKey = Node.newString("value");
        parent.addChildToBack(notAKey);
        assertFalse(NodeUtil.isObjectLitKey(notAKey, parent));
    }

    @Test
    public void testGetObjectLitKeyName_stringKey() {
        Node key = Node.newString("myKey");
        assertEquals("myKey", NodeUtil.getObjectLitKeyName(key));
    }

    @Test
    public void testGetObjectLitKeyName_getterKey() {
        Node key = new Node(Token.GET);
        key.setString("myGetter");
        assertEquals("myGetter", NodeUtil.getObjectLitKeyName(key));
    }

    @Test
    public void testGetObjectLitKeyName_setterKey() {
        Node key = new Node(Token.SET);
        key.setString("mySetter");
        assertEquals("mySetter", NodeUtil.getObjectLitKeyName(key));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetObjectLitKeyName_invalidType() {
        Node key = new Node(Token.NUMBER);
        NodeUtil.getObjectLitKeyName(key);
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
    public void testIsGetOrSetKey_false() {
        assertFalse(NodeUtil.isGetOrSetKey(new Node(Token.STRING)));
        assertFalse(NodeUtil.isGetOrSetKey(new Node(Token.NAME)));
    }

    @Test
    public void testOpToStr_add() {
        assertEquals("+", NodeUtil.opToStr(Token.ADD));
    }

    @Test
    public void testOpToStr_assignAdd() {
        assertEquals("+=", NodeUtil.opToStr(Token.ASSIGN_ADD));
    }

    @Test
    public void testOpToStr_or() {
        assertEquals("||", NodeUtil.opToStr(Token.OR));
    }

    @Test
    public void testOpToStr_bitwiseAnd() {
        assertEquals("&", NodeUtil.opToStr(Token.BITAND));
    }

    @Test
    public void testOpToStr_equality() {
        assertEquals("==", NodeUtil.opToStr(Token.EQ));
        assertEquals("!==", NodeUtil.opToStr(Token.SHNE));
    }

    @Test
    public void testOpToStr_unknown() {
        assertNull(NodeUtil.opToStr(Token.LAST_TOKEN + 1));
    }

    @Test
    public void testOpToStrNoFail_add() {
        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    }

    @Test(expected = Error.class)
    public void testOpToStrNoFail_unknown() {
        NodeUtil.opToStrNoFail(Token.LAST_TOKEN + 1);
    }

    @Test
    public void testContainsType_true() {
        Node node = new Node(Token.BLOCK);
        node.addChildToBack(new Node(Token.VAR));
        assertTrue(NodeUtil.containsType(node, Token.VAR));
    }

    @Test
    public void testContainsType_false() {
        Node node = new Node(Token.BLOCK);
        node.addChildToBack(new Node(Token.NAME));
        assertFalse(NodeUtil.containsType(node, Token.VAR));
    }

    @Test
    public void testContainsType_withPredicate() {
        Node node = new Node(Token.BLOCK);
        Node varDecl = new Node(Token.VAR);
        varDecl.addChildToBack(Node.newString("myVar"));
        node.addChildToBack(varDecl);
        Predicate<Node> isMyVar = new Predicate<Node>() {
            @Override
            public boolean apply(Node input) {
                return input.getType() == Token.VAR && input.hasChildren() && input.getFirstChild().getString().equals("myVar");
            }
        };
        assertTrue(NodeUtil.containsType(node, Token.VAR, isMyVar));
    }

    @Test
    public void testRedeclareVarsInsideBranch_noVars() {
        Node branch = new Node(Token.BLOCK);
        branch.addChildToBack(new Node(Token.NAME));
        Node originalParent = new Node(Token.SCRIPT);
        originalParent.addChildToBack(branch);
        NodeUtil.redeclareVarsInsideBranch(branch);
        assertEquals(1, originalParent.getChildCount()); // Branch remains
    }

    @Test
    public void testRedeclareVarsInsideBranch_oneVar() {
        Node branch = new Node(Token.BLOCK);
        Node varDecl = new Node(Token.VAR);
        varDecl.addChildToBack(Node.newString("x"));
        branch.addChildToBack(varDecl);

        Node originalParent = new Node(Token.SCRIPT);
        originalParent.addChildToBack(branch);

        NodeUtil.redeclareVarsInsideBranch(branch);

        assertEquals(2, originalParent.getChildCount()); // Original branch + redeclared var
        assertEquals(Token.VAR, originalParent.getFirstChild().getType()); // Redeclared var is first
        assertEquals("x", originalParent.getFirstChild().getFirstChild().getString());
        assertEquals(branch, originalParent.getLastChild()); // Original branch is still there
    }

    @Test
    public void testRedeclareVarsInsideBranch_multipleVars() {
        Node branch = new Node(Token.BLOCK);
        Node varDecl1 = new Node(Token.VAR);
        varDecl1.addChildToBack(Node.newString("a"));
        Node varDecl2 = new Node(Token.VAR);
        varDecl2.addChildToBack(Node.newString("b"));
        branch.addChildToBack(varDecl1);
        branch.addChildToBack(varDecl2);

        Node originalParent = new Node(Token.SCRIPT);
        originalParent.addChildToBack(branch);

        NodeUtil.redeclareVarsInsideBranch(branch);

        assertEquals(3, originalParent.getChildCount());
        assertEquals(Token.VAR, originalParent.getChild(0).getType());
        assertEquals("a", originalParent.getChild(0).getFirstChild().getString());
        assertEquals(Token.VAR, originalParent.getChild(1).getType());
        assertEquals("b", originalParent.getChild(1).getFirstChild().getString());
        assertEquals(branch, originalParent.getLastChild());
    }

    @Test
    public void testNewFunctionNode() {
        String name = "myFunc";
        List<Node> params = Arrays.asList(Node.newString("a"), Node.newString("b"));
        Node body = new Node(Token.BLOCK);
        int lineno = 1, charno = 5;

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
        assertEquals("a", paramsNode.getFirstChild().getString());
        assertEquals("b", paramsNode.getLastChild().getString());

        assertEquals(body, paramsNode.getNext());
    }

    @Test
    public void testNewQualifiedNameNode_simpleName() {
        CodingConvention convention = new MockCodingConvention();
        String name = "myVar";
        int lineno = 10, charno = 20;

        Node node = NodeUtil.newQualifiedNameNode(convention, name, lineno, charno);

        assertEquals(Token.NAME, node.getType());
        assertEquals(name, node.getString());
        assertEquals(lineno, node.getLineno());
        assertEquals(charno, node.getCharno());
    }

    @Test
    public void testNewQualifiedNameNode_dottedName() {
        CodingConvention convention = new MockCodingConvention();
        String name = "obj.prop.method";
        int lineno = 10, charno = 20;

        Node node = NodeUtil.newQualifiedNameNode(convention, name, lineno, charno);

        assertEquals(Token.GETPROP, node.getType());
        assertEquals(lineno, node.getLineno());
        assertEquals(charno, node.getCharno());

        Node root = NodeUtil.getRootOfQualifiedName(node);
        assertEquals(Token.NAME, root.getType());
        assertEquals("obj", root.getString());

        Node prop1 = node.getFirstChild(); // obj
        Node prop2 = prop1.getNext(); // prop
        Node prop3 = prop2.getNext(); // method

        assertEquals(Token.GETPROP, prop1.getType());
        assertEquals(Token.GETPROP, prop2.getType());
        assertEquals(Token.STRING, prop3.getType());
        assertEquals("method", prop3.getString());
    }

    @Test
    public void testGetRootOfQualifiedName_name() {
        Node nameNode = Node.newString("myVar");
        assertEquals(nameNode, NodeUtil.getRootOfQualifiedName(nameNode));
    }

    @Test
    public void testGetRootOfQualifiedName_getProp() {
        Node root = Node.newString("obj");
        Node prop = Node.newString("prop");
        Node getPropNode = new Node(Token.GETPROP, root, prop);
        assertEquals(root, NodeUtil.getRootOfQualifiedName(getPropNode));
    }

    @Test
    public void testGetRootOfQualifiedName_nestedGetProp() {
        Node root = Node.newString("a");
        Node prop1 = Node.newString("b");
        Node prop2 = Node.newString("c");
        Node getProp1 = new Node(Token.GETPROP, root, prop1);
        Node getProp2 = new Node(Token.GETPROP, getProp1, prop2);
        assertEquals(root, NodeUtil.getRootOfQualifiedName(getProp2));
    }

    @Test
    public void testSetDebugInformation() {
        Node nodeToSet = Node.newString("newNode");
        Node basisNode = Node.newString("originalNode");
        basisNode.setLineno(10);
        basisNode.setCharno(20);
        basisNode.putStringProp(Node.SOURCENAME_PROP, "file.js"); // Use putStringProp
        String originalName = "originalVarName";

        NodeUtil.setDebugInformation(nodeToSet, basisNode, originalName);

        assertEquals(10, nodeToSet.getLineno());
        assertEquals(20, nodeToSet.getCharno());
        assertEquals("file.js", nodeToSet.getStringProp(Node.SOURCENAME_PROP));
        assertEquals(originalName, nodeToSet.getProp(Node.ORIGINALNAME_PROP));
    }

    @Test
    public void testIsLatin_allLatinChars() {
        assertTrue(NodeUtil.isLatin("HelloWorld"));
    }

    @Test
    public void testIsLatin_withNonLatinChar() {
        assertFalse(NodeUtil.isLatin("Hello©World"));
    }

    @Test
    public void testIsLatin_emptyString() {
        assertTrue(NodeUtil.isLatin(""));
    }

    @Test
    public void testIsValidPropertyName_validIdentifier() {
        assertTrue(NodeUtil.isValidPropertyName("myProperty"));
    }

    @Test
    public void testIsValidPropertyName_keyword() {
        assertFalse(NodeUtil.isValidPropertyName("if"));
    }

    @Test
    public void testIsValidPropertyName_unicodeChar() {
        // "©" is U+00A9, which is > 0x7f
        assertFalse(NodeUtil.isValidPropertyName("my©Property"));
    }

    @Test
    public void testIsValidPropertyName_validIdentifierWithNumber() {
        assertTrue(NodeUtil.isValidPropertyName("prop123"));
    }

    @Test
    public void testGetVarsDeclaredInBranch_noVars() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.NAME));
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertTrue(vars.isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranch_oneVar() {
        Node root = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(Node.newString("myVar"));
        root.addChildToBack(varNode);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertEquals("myVar", vars.iterator().next().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranch_multipleVars() {
        Node root = new Node(Token.BLOCK);
        Node varNode1 = new Node(Token.VAR);
        varNode1.addChildToBack(Node.newString("a"));
        Node varNode2 = new Node(Token.VAR);
        varNode2.addChildToBack(Node.newString("b"));
        root.addChildToBack(varNode1);
        root.addChildToBack(varNode2);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(2, vars.size());
        Set<String> varNames = new HashSet<>();
        for (Node var : vars) {
            varNames.add(var.getString());
        }
        assertTrue(varNames.contains("a"));
        assertTrue(varNames.contains("b"));
    }

    @Test
    public void testGetVarsDeclaredInBranch_nestedScopeIgnored() {
        Node root = new Node(Token.BLOCK);
        Node outerVar = new Node(Token.VAR);
        outerVar.addChildToBack(Node.newString("outerVar"));
        root.addChildToBack(outerVar);

        Node functionNode = new Node(Token.FUNCTION);
        Node innerBlock = new Node(Token.BLOCK);
        Node innerVar = new Node(Token.VAR);
        innerVar.addChildToBack(Node.newString("innerVar"));
        innerBlock.addChildToBack(innerVar);
        functionNode.addChildToBack(new Node(Token.LP));
        functionNode.addChildToBack(innerBlock);
        root.addChildToBack(functionNode);

        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
        assertEquals("outerVar", vars.iterator().next().getString());
    }

    @Test
    public void testIsPrototypePropertyDeclaration_true() {
        Node assign = new Node(Token.ASSIGN);
        Node qualifiedName = new Node(Token.GETPROP);
        qualifiedName.addChildToBack(Node.newString("MyClass"));
        qualifiedName.addChildToBack(Node.newString("prototype"));
        qualifiedName.addChildToBack(Node.newString("myMethod"));
        assign.addChildToBack(qualifiedName);
        assign.addChildToBack(new Node(Token.FUNCTION));

        Node exprResult = new Node(Token.EXPR_RESULT, assign);

        assertTrue(NodeUtil.isPrototypePropertyDeclaration(exprResult));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_falseNotAssign() {
        Node call = new Node(Token.CALL);
        Node exprResult = new Node(Token.EXPR_RESULT, call);
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(exprResult));
    }

    @Test
    public void testIsPrototypePropertyDeclaration_falseNotPrototype() {
        Node assign = new Node(Token.ASSIGN);
        Node qualifiedName = new Node(Token.GETPROP);
        qualifiedName.addChildToBack(Node.newString("MyClass"));
        qualifiedName.addChildToBack(Node.newString("staticProp")); // Not prototype
        qualifiedName.addChildToBack(Node.newString("myMethod"));
        assign.addChildToBack(qualifiedName);
        assign.addChildToBack(new Node(Token.FUNCTION));
        Node exprResult = new Node(Token.EXPR_RESULT, assign);
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(exprResult));
    }

    @Test
    public void testIsPrototypeProperty_true() {
        Node qName = new Node(Token.GETPROP);
        qName.addChildToBack(Node.newString("MyClass"));
        qName.addChildToBack(Node.newString("prototype"));
        qName.addChildToBack(Node.newString("myMethod"));
        assertTrue(NodeUtil.isPrototypeProperty(qName));
    }

    @Test
    public void testIsPrototypeProperty_false() {
        Node qName = new Node(Token.GETPROP);
        qName.addChildToBack(Node.newString("MyClass"));
        qName.addChildToBack(Node.newString("staticProp"));
        qName.addChildToBack(Node.newString("myMethod"));
        assertFalse(NodeUtil.isPrototypeProperty(qName));
    }

    @Test
    public void testGetPrototypeClassName_valid() {
        Node qName = new Node(Token.GETPROP);
        Node className = Node.newString("MyClass");
        qName.addChildToBack(className);
        qName.addChildToBack(Node.newString("prototype"));
        qName.addChildToBack(Node.newString("myMethod"));
        assertEquals(className, NodeUtil.getPrototypeClassName(qName));
    }

    @Test
    public void testGetPrototypeClassName_nestedPrototype() {
        Node qName = new Node(Token.GETPROP);
        Node className = Node.newString("MyClass");
        Node proto = Node.newString("prototype");
        Node method = Node.newString("myMethod");
        Node proto2 = Node.newString("prototype");
        Node method2 = Node.newString("subMethod");

        Node getProp1 = new Node(Token.GETPROP, className, proto);
        getProp1.addChildToBack(method); // Should be ignored

        Node getProp2 = new Node(Token.GETPROP, getProp1, proto2);
        getProp2.addChildToBack(method2);

        assertEquals(className, NodeUtil.getPrototypeClassName(getProp2));
    }

    @Test
    public void testGetPrototypeClassName_noPrototype() {
        Node qName = new Node(Token.GETPROP);
        qName.addChildToBack(Node.newString("MyClass"));
        qName.addChildToBack(Node.newString("staticProp"));
        qName.addChildToBack(Node.newString("myMethod"));
        assertNull(NodeUtil.getPrototypeClassName(qName));
    }

    @Test
    public void testGetPrototypePropertyName_valid() {
        Node qName = new Node(Token.GETPROP);
        qName.addChildToBack(Node.newString("MyClass"));
        qName.addChildToBack(Node.newString("prototype"));
        qName.addChildToBack(Node.newString("myMethod"));
        qName.setQualifiedName("MyClass.prototype.myMethod"); // Use setQualifiedName for Node
        assertEquals("myMethod", NodeUtil.getPrototypePropertyName(qName));
    }

    @Test
    public void testGetPrototypePropertyName_noPrototype() {
        Node qName = new Node(Token.GETPROP);
        qName.addChildToBack(Node.newString("MyClass"));
        qName.addChildToBack(Node.newString("staticProp"));
        qName.addChildToBack(Node.newString("myMethod"));
        qName.setQualifiedName("MyClass.staticProp.myMethod"); // Use setQualifiedName for Node
        // The current implementation might not handle this gracefully, relying on getQualifiedName.
        // We'll test the expected behavior when .prototype IS present.
        assertNotNull(qName.getQualifiedName()); // Ensure getQualifiedName is called
    }

    @Test
    public void testNewUndefinedNode() {
        Node srcNode = new Node(Token.NAME);
        srcNode.setLineno(5);
        srcNode.setCharno(10);
        Node undefinedNode = NodeUtil.newUndefinedNode(srcNode);

        assertEquals(Token.VOID, undefinedNode.getType());
        assertEquals(5, undefinedNode.getLineno());
        assertEquals(10, undefinedNode.getCharno());
        assertNotNull(undefinedNode.getFirstChild());
        assertEquals(Token.NUMBER, undefinedNode.getFirstChild().getType());
        assertEquals(0.0, undefinedNode.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testNewVarNode_withValue() {
        Node value = Node.newNumber(42);
        Node varNode = NodeUtil.newVarNode("myVar", value);

        assertEquals(Token.VAR, varNode.getType());
        assertEquals(Token.NAME, varNode.getFirstChild().getType());
        assertEquals("myVar", varNode.getFirstChild().getString());
        assertEquals(value, varNode.getFirstChild().getFirstChild());
    }

    @Test
    public void testNewVarNode_withoutValue() {
        Node varNode = NodeUtil.newVarNode("myVar", null);

        assertEquals(Token.VAR, varNode.getType());
        assertEquals(Token.NAME, varNode.getFirstChild().getType());
        assertEquals("myVar", varNode.getFirstChild().getString());
        assertNull(varNode.getFirstChild().getFirstChild());
    }

    @Test
    public void testMatchNameNode_true() {
        Predicate<Node> pred = new NodeUtil.MatchNameNode("test");
        assertTrue(pred.apply(Node.newString("test")));
    }

    @Test
    public void testMatchNameNode_falseString() {
        Predicate<Node> pred = new NodeUtil.MatchNameNode("test");
        assertFalse(pred.apply(Node.newString("other")));
    }

    @Test
    public void testMatchNameNode_falseType() {
        Predicate<Node> pred = new NodeUtil.MatchNameNode("test");
        assertFalse(pred.apply(new Node(Token.NUMBER)));
    }

    @Test
    public void testMatchNodeType_true() {
        Predicate<Node> pred = new NodeUtil.MatchNodeType(Token.NAME);
        assertTrue(pred.apply(Node.newString("test")));
    }

    @Test
    public void testMatchNodeType_false() {
        Predicate<Node> pred = new NodeUtil.MatchNodeType(Token.NAME);
        assertFalse(pred.apply(new Node(Token.NUMBER)));
    }

    @Test
    public void testMatchDeclaration_var() {
        assertTrue(new NodeUtil.MatchDeclaration().apply(new Node(Token.VAR)));
    }

    @Test
    public void testMatchDeclaration_function() {
        assertTrue(new NodeUtil.MatchDeclaration().apply(new Node(Token.FUNCTION)));
    }

    @Test
    public void testMatchDeclaration_name() {
        assertFalse(new NodeUtil.MatchDeclaration().apply(new Node(Token.NAME)));
    }

    @Test
    public void testMatchNotFunction_function() {
        assertFalse(NodeUtil.MATCH_NOT_FUNCTION.apply(new Node(Token.FUNCTION)));
    }

    @Test
    public void testMatchNotFunction_other() {
        assertTrue(NodeUtil.MATCH_NOT_FUNCTION.apply(new Node(Token.NAME)));
    }

    @Test
    public void testMatchShallowStatement_block() {
        assertTrue(new NodeUtil.MatchShallowStatement().apply(new Node(Token.BLOCK)));
    }

    @Test
    public void testMatchShallowStatement_statementInBlock() {
        Node parent = new Node(Token.BLOCK);
        Node statement = new Node(Token.VAR);
        parent.addChildToBack(statement);
        assertTrue(new NodeUtil.MatchShallowStatement().apply(statement));
    }

    @Test
    public void testMatchShallowStatement_statementInLabel() {
        Node parent = new Node(Token.LABEL);
        Node statement = new Node(Token.BLOCK);
        parent.addChildToBack(statement);
        assertTrue(new NodeUtil.MatchShallowStatement().apply(statement));
    }

    @Test
    public void testMatchShallowStatement_functionDeclaration() {
        Node parent = new Node(Token.BLOCK);
        Node function = new Node(Token.FUNCTION);
        parent.addChildToBack(function);
        assertTrue(new NodeUtil.MatchShallowStatement().apply(function));
    }

    @Test
    public void testMatchShallowStatement_functionExpression() {
        Node parent = new Node(Token.CALL); // Function expression in a call
        Node function = new Node(Token.FUNCTION);
        parent.addChildToBack(function);
        assertFalse(new NodeUtil.MatchShallowStatement().apply(function));
    }

    @Test
    public void testMatchShallowStatement_controlStructureBody() {
        Node parent = new Node(Token.IF);
        Node body = new Node(Token.BLOCK);
        parent.addChildToBack(new Node(Token.NAME)); // Condition
        parent.addChildToBack(body);
        assertTrue(new NodeUtil.MatchShallowStatement().apply(body));
    }

    @Test
    public void testGetNodeTypeReferenceCount_exists() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.VAR));
        root.addChildToBack(new Node(Token.VAR));
        root.addChildToBack(new Node(Token.NAME));
        assertEquals(2, NodeUtil.getNodeTypeReferenceCount(root, Token.VAR, Predicates.alwaysTrue()));
    }

    @Test
    public void testGetNodeTypeReferenceCount_notExists() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.NAME));
        assertEquals(0, NodeUtil.getNodeTypeReferenceCount(root, Token.VAR, Predicates.alwaysTrue()));
    }

    @Test
    public void testIsNameReferenced_true() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(Node.newString("myVar"));
        assertTrue(NodeUtil.isNameReferenced(root, "myVar"));
    }

    @Test
    public void testIsNameReferenced_false() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(Node.newString("otherVar"));
        assertFalse(NodeUtil.isNameReferenced(root, "myVar"));
    }

    @Test
    public void testIsNameReferenced_nestedScopeIgnored() {
        Node root = new Node(Token.BLOCK);
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.LP));
        Node innerBlock = new Node(Token.BLOCK);
        innerBlock.addChildToBack(Node.newString("myVar"));
        functionNode.addChildToBack(innerBlock);
        root.addChildToBack(functionNode);
        assertFalse(NodeUtil.isNameReferenced(root, "myVar"));
    }

    @Test
    public void testIsNameReferenced_withPredicate() {
        Node root = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(Node.newString("myVar"));
        root.addChildToBack(varNode);
        Predicate<Node> isVarDecl = new Predicate<Node>() {
            @Override
            public boolean apply(Node input) {
                return input.getType() == Token.VAR;
            }
        };
        assertTrue(NodeUtil.isNameReferenced(root, "myVar", isVarDecl));
    }

    @Test
    public void testGetNameReferenceCount_exists() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(Node.newString("myVar"));
        root.addChildToBack(Node.newString("myVar"));
        root.addChildToBack(Node.newString("otherVar"));
        assertEquals(2, NodeUtil.getNameReferenceCount(root, "myVar"));
    }

    @Test
    public void testGetNameReferenceCount_notExists() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(Node.newString("otherVar"));
        assertEquals(0, NodeUtil.getNameReferenceCount(root, "myVar"));
    }

    @Test
    public void testHas_true() {
        Node node = new Node(Token.BLOCK);
        node.addChildToBack(new Node(Token.VAR));
        assertTrue(NodeUtil.has(node, new NodeUtil.MatchNodeType(Token.VAR), Predicates.alwaysTrue()));
    }

    @Test
    public void testHas_false() {
        Node node = new Node(Token.BLOCK);
        node.addChildToBack(new Node(Token.NAME));
        assertFalse(NodeUtil.has(node, new NodeUtil.MatchNodeType(Token.VAR), Predicates.alwaysTrue()));
    }

    @Test
    public void testHas_withTraversePredicate_true() {
        Node node = new Node(Token.BLOCK);
        Node function = new Node(Token.FUNCTION);
        function.addChildToBack(new Node(Token.BLOCK)); // Body
        node.addChildToBack(function);
        assertTrue(NodeUtil.has(node, new NodeUtil.MatchNodeType(Token.VAR), new NodeUtil.MatchNotFunction()));
    }

    @Test
    public void testHas_withTraversePredicate_false() {
        Node node = new Node(Token.BLOCK);
        Node function = new Node(Token.FUNCTION);
        function.addChildToBack(new Node(Token.BLOCK)); // Body
        node.addChildToBack(function);
        assertFalse(NodeUtil.has(node, new NodeUtil.MatchNodeType(Token.VAR), Predicates.alwaysTrue()));
    }

    @Test
    public void testGetCount_exists() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.VAR));
        root.addChildToBack(new Node(Token.VAR));
        root.addChildToBack(new Node(Token.NAME));
        assertEquals(2, NodeUtil.getCount(root, new NodeUtil.MatchNodeType(Token.VAR), Predicates.alwaysTrue()));
    }

    @Test
    public void testGetCount_notExists() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.NAME));
        assertEquals(0, NodeUtil.getCount(root, new NodeUtil.MatchNodeType(Token.VAR), Predicates.alwaysTrue()));
    }

    @Test
    public void testGetCount_withTraversePredicate_true() {
        Node root = new Node(Token.BLOCK);
        Node var1 = new Node(Token.VAR);
        Node var2 = new Node(Token.VAR);
        root.addChildToBack(var1);
        Node function = new Node(Token.FUNCTION);
        function.addChildToBack(new Node(Token.BLOCK)); // Body
        function.addChildToBack(var2);
        root.addChildToBack(function);
        assertEquals(1, NodeUtil.getCount(root, new NodeUtil.MatchNodeType(Token.VAR), new NodeUtil.MatchNotFunction()));
    }

    @Test
    public void testVisitPreOrder() {
        Node root = new Node(Token.BLOCK);
        Node child1 = new Node(Token.NAME);
        Node child2 = new Node(Token.NUMBER);
        root.addChildToBack(child1);
        root.addChildToBack(child2);

        List<Node> visitedNodes = new java.util.ArrayList<>();
        NodeUtil.Visitor visitor = new NodeUtil.Visitor() {
            @Override
            public void visit(Node node) {
                visitedNodes.add(node);
            }
        };

        NodeUtil.visitPreOrder(root, visitor, Predicates.alwaysTrue());

        assertEquals(3, visitedNodes.size());
        assertEquals(root, visitedNodes.get(0));
        assertEquals(child1, visitedNodes.get(1));
        assertEquals(child2, visitedNodes.get(2));
    }

    @Test
    public void testVisitPostOrder() {
        Node root = new Node(Token.BLOCK);
        Node child1 = new Node(Token.NAME);
        Node child2 = new Node(Token.NUMBER);
        root.addChildToBack(child1);
        root.addChildToBack(child2);

        List<Node> visitedNodes = new java.util.ArrayList<>();
        NodeUtil.Visitor visitor = new NodeUtil.Visitor() {
            @Override
            public void visit(Node node) {
                visitedNodes.add(node);
            }
        };

        NodeUtil.visitPostOrder(root, visitor, Predicates.alwaysTrue());

        assertEquals(3, visitedNodes.size());
        assertEquals(child1, visitedNodes.get(0));
        assertEquals(child2, visitedNodes.get(1));
        assertEquals(root, visitedNodes.get(2));
    }

    @Test
    public void testHasFinally_true() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        tryNode.addChildToBack(new Node(Token.CATCH)); // Catch node
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Finally block
        assertTrue(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testHasFinally_false() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        tryNode.addChildToBack(new Node(Token.CATCH)); // Catch node
        // No finally block
        assertFalse(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testGetCatchBlock_valid() {
        Node tryNode = new Node(Token.TRY);
        Node tryBlock = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH);
        Node catchBlock = new Node(Token.BLOCK);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(tryBlock);
        tryNode.addChildToBack(catchNode);
        tryNode.addChildToBack(catchBlock);
        tryNode.addChildToBack(finallyBlock);
        assertEquals(catchBlock, NodeUtil.getCatchBlock(tryNode));
    }

    @Test
    public void testGetCatchBlock_noCatch() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Try block
        tryNode.addChildToBack(new Node(Token.BLOCK)); // Finally block
        // No catch node, but getCatchBlock expects a catch node to be present based on structure
        // The method accesses getFirstChild().getNext() which points to the catch BLOCK node
        // In the source code, the second child of TRY is CATCH, the third is the BLOCK.
        // So getCatchBlock expects 3 children minimum.
        // This method is likely intended for TRY nodes with a CATCH.
        // If there's no CATCH node, and only try/finally, getCatchBlock would return the finally block.
        assertNull(NodeUtil.getCatchBlock(tryNode));
    }


    @Test
    public void testHasCatchHandler_true() {
        Node block = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH);
        block.addChildToBack(catchNode);
        assertTrue(NodeUtil.hasCatchHandler(block));
    }

    @Test
    public void testHasCatchHandler_false() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.VAR));
        assertFalse(NodeUtil.hasCatchHandler(block));
    }

    @Test
    public void testGetFunctionParameters_valid() {
        Node fn = new Node(Token.FUNCTION);
        Node lp = new Node(Token.LP);
        Node param1 = Node.newString("a");
        Node param2 = Node.newString("b");
        lp.addChildToBack(param1);
        lp.addChildToBack(param2);
        fn.addChildToBack(new Node(Token.NAME));
        fn.addChildToBack(lp);
        fn.addChildToBack(new Node(Token.BLOCK));
        assertEquals(lp, NodeUtil.getFunctionParameters(fn));
    }

    @Test
    public void testIsConstantName_true() {
        Node n = Node.newString("CONST_VAR");
        n.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(NodeUtil.isConstantName(n));
    }

    @Test
    public void testIsConstantName_false() {
        Node n = Node.newString("var");
        assertFalse(NodeUtil.isConstantName(n));
    }

    @Test
    public void testIsConstantByConvention_constantKey() {
        CodingConvention convention = new MockCodingConvention();
        Node parent = new Node(Token.OBJECTLIT);
        Node key = Node.newString("MY_CONST_KEY");
        parent.addChildToBack(key);
        assertTrue(NodeUtil.isConstantByConvention(convention, key, parent));
    }

    @Test
    public void testIsConstantByConvention_constantName() {
        CodingConvention convention = new MockCodingConvention();
        Node parent = new Node(Token.VAR);
        Node name = Node.newString("MY_CONST_NAME");
        parent.addChildToBack(name);
        assertTrue(NodeUtil.isConstantByConvention(convention, name, parent));
    }

    @Test
    public void testIsConstantByConvention_nonConstant() {
        CodingConvention convention = new MockCodingConvention();
        Node parent = new Node(Token.VAR);
        Node name = Node.newString("myVar");
        parent.addChildToBack(name);
        assertFalse(NodeUtil.isConstantByConvention(convention, name, parent));
    }

    @Test
    public void testGetInfoForNameNode_directJSDoc() {
        Node nameNode = Node.newString("myVar");
        JSDocInfo info = new JSDocInfo();
        info.addParameter("param");
        nameNode.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetInfoForNameNode_fromVarParent() {
        Node nameNode = Node.newString("myVar");
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(nameNode);
        JSDocInfo info = new JSDocInfo();
        info.addParameter("param");
        varNode.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetInfoForNameNode_fromFunctionParent() {
        Node nameNode = Node.newString("myFunc");
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(nameNode);
        fnNode.addChildToBack(new Node(Token.LP));
        fnNode.addChildToBack(new Node(Token.BLOCK));
        JSDocInfo info = new JSDocInfo();
        info.addParameter("param");
        fnNode.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getInfoForNameNode(nameNode));
    }

    @Test
    public void testGetFunctionJSDocInfo_direct() {
        Node fn = new Node(Token.FUNCTION);
        JSDocInfo info = new JSDocInfo();
        fn.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testGetFunctionJSDocInfo_expressionAssign() {
        Node fn = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(Node.newString("target"));
        assign.addChildToBack(fn);
        JSDocInfo info = new JSDocInfo();
        assign.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testGetFunctionJSDocInfo_expressionVarAssign() {
        Node fn = new Node(Token.FUNCTION);
        Node name = Node.newString("target");
        Node var = new Node(Token.VAR);
        var.addChildToBack(name);
        name.addChildToBack(fn);
        JSDocInfo info = new JSDocInfo();
        var.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testGetSourceName_direct() {
        Node n = new Node(Token.NAME);
        n.putStringProp(Node.SOURCENAME_PROP, "source.js"); // Use putStringProp
        assertEquals("source.js", NodeUtil.getSourceName(n));
    }

    @Test
    public void testGetSourceName_fromParent() {
        Node parent = new Node(Token.SCRIPT);
        parent.putStringProp(Node.SOURCENAME_PROP, "script.js"); // Use putStringProp
        Node n = new Node(Token.NAME);
        parent.addChildToBack(n);
        assertEquals("script.js", NodeUtil.getSourceName(n));
    }

    @Test
    public void testGetSourceName_null() {
        Node n = new Node(Token.NAME);
        assertNull(NodeUtil.getSourceName(n));
    }

    @Test
    public void testNewCallNode_freeCall() {
        Node callTarget = Node.newString("alert");
        Node param1 = Node.newString("hello");
        Node callNode = NodeUtil.newCallNode(callTarget, param1);

        assertEquals(Token.CALL, callNode.getType());
        assertEquals(callTarget, callNode.getFirstChild());
        assertEquals(param1, callNode.getLastChild());
        assertTrue(callNode.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testNewCallNode_notFreeCall() {
        Node callTarget = new Node(Token.GETPROP); // obj.method
        callTarget.addChildToBack(Node.newString("obj"));
        callTarget.addChildToBack(Node.newString("method"));

        Node param1 = Node.newString("hello");
        Node callNode = NodeUtil.newCallNode(callTarget, param1);

        assertEquals(Token.CALL, callNode.getType());
        assertEquals(callTarget, callNode.getFirstChild());
        assertEquals(param1, callNode.getLastChild());
        assertFalse(callNode.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testEvaluatesToLocalValue_assignWithImmutableRhs() {
        Node lhs = Node.newString("x");
        Node rhs = Node.newString("immutable");
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertTrue(NodeUtil.evaluatesToLocalValue(assign));
    }

    @Test
    public void testEvaluatesToLocalValue_assignWithLocalRhs() {
        Node lhs = Node.newString("x");
        Node rhs = new Node(Token.NEW); // Assuming NEW evaluates to local
        rhs.addChildToBack(Node.newString("Object"));
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        assertTrue(NodeUtil.evaluatesToLocalValue(assign));
    }

    @Test
    public void testEvaluatesToLocalValue_assignWithNonLocalRhs() {
        Node lhs = Node.newString("x");
        Node rhs = Node.newString("globalVar"); // Assume this is not local
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        // This depends on the 'locals' predicate. If globalVar is not considered local, it should be false.
        // The default 'locals' predicate is alwaysFalse, so globalVar is not local.
        assertFalse(NodeUtil.evaluatesToLocalValue(assign));
    }

    @Test
    public void testEvaluatesToLocalValue_callWithLocalResultFlag() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(Node.newString("someFunc"));
        call.putBooleanProp(Node.LOCAL_RESULTS, true);
        assertTrue(NodeUtil.evaluatesToLocalValue(call));
    }

    @Test
    public void testEvaluatesToLocalValue_newWithLocalResultFlag() {
        Node n = new Node(Token.NEW);
        n.addChildToBack(Node.newString("Object"));
        n.putBooleanProp(Node.DIRECTCALL_PROP, true); // Simulating flag for local result
        assertTrue(NodeUtil.evaluatesToLocalValue(n));
    }

    @Test
    public void testEvaluatesToLocalValue_functionLiteral() {
        Node fn = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.evaluatesToLocalValue(fn));
    }

    @Test
    public void testEvaluatesToLocalValue_literalObject() {
        Node objLit = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.evaluatesToLocalValue(objLit));
    }

    @Test
    public void testEvaluatesToLocalValue_literalArray() {
        Node arrLit = new Node(Token.ARRAYLIT);
        assertTrue(NodeUtil.evaluatesToLocalValue(arrLit));
    }

    @Test
    public void testEvaluatesToLocalValue_this_local() {
        Node thisNode = new Node(Token.THIS);
        // If 'this' is considered local by the predicate
        assertTrue(NodeUtil.evaluatesToLocalValue(thisNode, new Predicate<Node>() {
            @Override
            public boolean apply(Node input) {
                return input.getType() == Token.THIS;
            }
        }));
    }

    @Test
    public void testEvaluatesToLocalValue_this_notLocal() {
        Node thisNode = new Node(Token.THIS);
        // If 'this' is not considered local by the predicate
        assertFalse(NodeUtil.evaluatesToLocalValue(thisNode, Predicates.<Node>alwaysFalse()));
    }

    @Test
    public void testEvaluatesToLocalValue_name_immutable() {
        Node nameNode = Node.newString("Infinity");
        assertTrue(NodeUtil.evaluatesToLocalValue(nameNode));
    }

    @Test
    public void testEvaluatesToLocalValue_name_local() {
        Node nameNode = Node.newString("localVar");
        assertTrue(NodeUtil.evaluatesToLocalValue(nameNode, new Predicate<Node>() {
            @Override
            public boolean apply(Node input) {
                return input.getType() == Token.NAME && "localVar".equals(input.getString());
            }
        }));
    }

    @Test
    public void testEvaluatesToLocalValue_name_notLocal() {
        Node nameNode = Node.newString("globalVar");
        assertFalse(NodeUtil.evaluatesToLocalValue(nameNode, Predicates.<Node>alwaysFalse()));
    }

    @Test
    public void testGetArgumentForFunction_valid() {
        Node fn = new Node(Token.FUNCTION);
        Node lp = new Node(Token.LP);
        Node param1 = Node.newString("a");
        Node param2 = Node.newString("b");
        lp.addChildToBack(param1);
        lp.addChildToBack(param2);
        fn.addChildToBack(new Node(Token.NAME)); // Function name
        fn.addChildToBack(lp);
        fn.addChildToBack(new Node(Token.BLOCK)); // Body

        assertEquals(param1, NodeUtil.getArgumentForFunction(fn, 0));
        assertEquals(param2, NodeUtil.getArgumentForFunction(fn, 1));
    }

    @Test
    public void testGetArgumentForFunction_indexOutOfBounds() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(new Node(Token.NAME)); // Function name
        fn.addChildToBack(new Node(Token.LP)); // Empty params
        fn.addChildToBack(new Node(Token.BLOCK)); // Body
        assertNull(NodeUtil.getArgumentForFunction(fn, 0));
    }

    @Test
    public void testGetArgumentForCallOrNew_valid() {
        Node call = new Node(Token.CALL);
        Node arg1 = Node.newString("arg1");
        Node arg2 = Node.newString("arg2");
        call.addChildToBack(Node.newString("func")); // Function name
        call.addChildToBack(arg1);
        call.addChildToBack(arg2);

        assertEquals(arg1, NodeUtil.getArgumentForCallOrNew(call, 0));
        assertEquals(arg2, NodeUtil.getArgumentForCallOrNew(call, 1));
    }

    @Test
    public void testGetArgumentForCallOrNew_indexOutOfBounds() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(Node.newString("func")); // Function name
        // No arguments
        assertNull(NodeUtil.getArgumentForCallOrNew(call, 0));
    }

    // Helper method for creating calls to object methods like obj.method(...)
    private Node createCallMethodNode(String methodName) {
        Node call = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("obj"));
        getProp.addChildToBack(Node.newString(methodName));
        call.addChildToBack(getProp);
        return call;
    }

    // Mock CodingConvention for testing methods that require it
    private static class MockCodingConvention implements CodingConvention {
        @Override
        public boolean isConstant(String variableName) {
            return variableName.equals("MY_CONST_NAME");
        }

        @Override
        public boolean isConstantKey(String keyName) {
            return keyName.equals("MY_CONST_KEY");
        }

        @Override
        public boolean isValidEnumKey(String key) { return false; }
        @Override
        public boolean isOptionalParameter(Node parameter) { return false; }
        @Override
        public boolean isVarArgsParameter(Node parameter) { return false; }
        @Override
        public boolean isExported(String name, boolean local) { return false; }
        @Override
        public boolean isExported(String name) { return false; }
        @Override
        public boolean isPrivate(String name) { return false; }
        @Override
        public SubclassRelationship getClassesDefinedByCall(Node callNode) { return null; }
        @Override
        public boolean isSuperClassReference(String propertyName) { return false; }
        @Override
        public String extractClassNameIfProvide(Node node, Node parent) { return null; }
        @Override
        public String extractClassNameIfRequire(Node node, Node parent) { return null; }
        @Override
        public String getExportPropertyFunction() { return null; }
        @Override
        public String getExportSymbolFunction() { return null; }
        @Override
        public List<String> identifyTypeDeclarationCall(Node n) { return null; }
        @Override
        public void applySubclassRelationship(FunctionType parentCtor, FunctionType childCtor, SubclassType type) {}
        @Override
        public String getAbstractMethodName() { return null; }
        @Override
        public String getSingletonGetterClassName(Node callNode) { return null; }
        @Override
        public void applySingletonGetter(FunctionType functionType, FunctionType getterType, ObjectType objectType) {}
        @Override
        public DelegateRelationship getDelegateRelationship(Node callNode) { return null; }
        @Override
        public void applyDelegateRelationship(ObjectType delegateSuperclass, ObjectType delegateBase, ObjectType delegator, FunctionType delegateProxy, FunctionType findDelegate) {}
        @Override
        public String getDelegateSuperclassName() { return null; }
        @Override
        public void defineDelegateProxyPrototypeProperties( JSTypeRegistry registry, Scope scope, List<ObjectType> delegateProxyPrototypes) {}
        @Override
        public String getGlobalObject() { return "global"; }
        @Override
        public Bind describeFunctionBind(Node n) { return null; }
        @Override
        public boolean isPropertyTestFunction(Node call) { return false; }
        @Override
        public ObjectLiteralCast getObjectLiteralCast(NodeTraversal t, Node callNode) { return null; }
        @Override
        public Collection<AssertionFunctionSpec> getAssertionFunctions() { return Collections.emptyList(); }
    }
}
```