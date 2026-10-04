package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;


public class NodeUtilTest {

    /**
     * Mock CodingConvention implementation for testing.
     * Provides default implementations for methods that are not the focus of the specific test.
     */

    /**
     * Test for isStrWhiteSpaceChar with various characters.
     */
    @Test
    public void testIsStrWhiteSpaceChar() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\r'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\t'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u00A0'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u000C'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2028'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2029'));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\uFEFF'));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B')); // VT
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('0'));
    }

    /**
     * Test for isStrWhiteSpaceChar with Unicode space separators.
     */
    @Test
    public void testIsStrWhiteSpaceChar_UnicodeSpaces() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(Character.SPACE_SEPARATOR));
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar(Character.LINE_SEPARATOR));
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar(Character.PARAGRAPH_SEPARATOR));
    }

    /**
     * Test for getNearestFunctionName with various function declaration forms.
     */

    /**
     * Test for getNearestFunctionName when input is not a function.
     */
    @Test
    public void testGetNearestFunctionName_notFunction() throws Exception {
        Node notAFunction = IR.name("notAFunction");
        assertNull(NodeUtil.getNearestFunctionName(notAFunction));
    }

    /**
     * Test for isLValue with various valid L-value nodes.
     */

    /**
     * Test for isLValue with invalid L-value nodes.
     */

    /**
     * Test for newQualifiedNameNode with a simple name.
     */

    /**
     * Test for newQualifiedNameNode with a qualified name.
     */

    /**
     * Test for isValidQualifiedName with valid names.
     */
    @Test
    public void testIsValidQualifiedName() throws Exception {
        assertTrue(NodeUtil.isValidQualifiedName("a"));
        assertTrue(NodeUtil.isValidQualifiedName("a.b"));
        assertTrue(NodeUtil.isValidQualifiedName("a.b.c"));
        assertTrue(NodeUtil.isValidQualifiedName("a$b.c_d"));
    }

    /**
     * Test for isValidQualifiedName with invalid names.
     */
    @Test
    public void testIsValidQualifiedName_invalid() throws Exception {
        assertFalse(NodeUtil.isValidQualifiedName(".a"));
        assertFalse(NodeUtil.isValidQualifiedName("a."));
        assertFalse(NodeUtil.isValidQualifiedName("a..b"));
        assertFalse(NodeUtil.isValidQualifiedName("a.1b")); // Cannot start with a digit after a dot
        assertFalse(NodeUtil.isValidQualifiedName("a.b."));
        assertFalse(NodeUtil.isValidQualifiedName(""));
    }

    /**
     * Test for getFunctionParameters with a function with no parameters.
     */
    @Test
    public void testGetFunctionParameters_noParams() throws Exception {
        Node fn = IR.function(IR.name("fn"), IR.paramList(), IR.block());
        Node params = NodeUtil.getFunctionParameters(fn);
        assertNotNull(params);
        assertEquals(Token.PARAM_LIST, params.getType());
        assertFalse(params.hasChildren());
    }

    /**
     * Test for getFunctionParameters with a function with one parameter.
     */
    @Test
    public void testGetFunctionParameters_oneParam() throws Exception {
        Node param = IR.name("p1");
        Node fn = IR.function(IR.name("fn"), IR.paramList(param), IR.block());
        Node params = NodeUtil.getFunctionParameters(fn);
        assertNotNull(params);
        assertEquals(Token.PARAM_LIST, params.getType());
        assertTrue(params.hasChildren());
        assertEquals(param, params.getFirstChild());
    }

    /**
     * Test for getFunctionParameters with a function with multiple parameters.
     */
    @Test
    public void testGetFunctionParameters_multipleParams() throws Exception {
        Node param1 = IR.name("p1");
        Node param2 = IR.name("p2");
        Node param3 = IR.name("p3");
        Node fn = IR.function(IR.name("fn"), IR.paramList(param1, param2, param3), IR.block());
        Node params = NodeUtil.getFunctionParameters(fn);
        assertNotNull(params);
        assertEquals(Token.PARAM_LIST, params.getType());
        assertEquals(3, params.getChildCount());
        assertEquals(param1, params.getChildAtIndex(0));
        assertEquals(param2, params.getChildAtIndex(1));
        assertEquals(param3, params.getChildAtIndex(2));
    }

    /**
     * Test for getFunctionJSDocInfo on a function with JSDoc.
     */
    @Test
    public void testGetFunctionJSDocInfo_withJSDoc() throws Exception {
        // Mock JSDocInfo
        JSDocInfo mockJSDocInfo = new JSDocInfo();
        Node fn = IR.function(IR.name("fn"), IR.paramList(), IR.block());
        fn.setJSDocInfo(mockJSDocInfo);
        assertEquals(mockJSDocInfo, NodeUtil.getFunctionJSDocInfo(fn));
    }

    /**
     * Test for getFunctionJSDocInfo on a function without JSDoc.
     */
    @Test
    public void testGetFunctionJSDocInfo_noJSDoc() throws Exception {
        Node fn = IR.function(IR.name("fn"), IR.paramList(), IR.block());
        assertNull(NodeUtil.getFunctionJSDocInfo(fn));
    }

    /**
     * Test for getFunctionJSDocInfo on a function expression assigned to a variable.
     */
    @Test
    public void testGetFunctionJSDocInfo_exprAssignedToVar() throws Exception {
        JSDocInfo mockJSDocInfo = new JSDocInfo();
        Node fnExpr = IR.function(null, IR.paramList(), IR.block());
        Node varName = IR.name("myVar");
        Node var = IR.var(varName, fnExpr);
        var.setJSDocInfo(mockJSDocInfo); // JSDoc on VAR
        assertEquals(mockJSDocInfo, NodeUtil.getFunctionJSDocInfo(fnExpr));
    }

    /**
     * Test for getFunctionJSDocInfo on a function expression assigned to a property.
     */
    @Test
    public void testGetFunctionJSDocInfo_exprAssignedToProp() throws Exception {
        JSDocInfo mockJSDocInfo = new JSDocInfo();
        Node fnExpr = IR.function(null, IR.paramList(), IR.block());
        Node propName = IR.string("myProp");
        Node objName = IR.name("myObj");
        Node assign = IR.assign(IR.getprop(objName, propName), fnExpr);
        assign.setJSDocInfo(mockJSDocInfo); // JSDoc on ASSIGN
        assertEquals(mockJSDocInfo, NodeUtil.getFunctionJSDocInfo(fnExpr));
    }

    /**
     * Test for getSourceName with a node directly having a source file name.
     */

    /**
     * Test for getSourceName with an ancestor having a source file name.
     */

    /**
     * Test for getSourceName when no source file name is set.
     */
    @Test
    public void testGetSourceName_noSource() throws Exception {
        Node node = IR.name("test");
        assertNull(NodeUtil.getSourceName(node));
    }

    /**
     * Test for getSourceFile with a node directly having a source file.
     */

    /**
     * Test for getSourceFile with an ancestor having a source file.
     */

    /**
     * Test for getSourceFile when no source file is set.
     */
    @Test
    public void testGetSourceFile_noSource() throws Exception {
        Node node = IR.name("test");
        assertNull(NodeUtil.getSourceFile(node));
    }

    /**
     * Test for getInputId with a script node.
     */
    @Test
    public void testGetInputId_script() throws Exception {
        Node script = IR.script();
        InputId inputId = new InputId("script.js");
        script.setInputId(inputId);
        assertEquals(inputId, NodeUtil.getInputId(script));
    }

    /**
     * Test for getInputId with a child of a script node.
     */
    @Test
    public void testGetInputId_childOfScript() throws Exception {
        Node script = IR.script();
        InputId inputId = new InputId("script.js");
        script.setInputId(inputId);
        Node block = IR.block();
        script.addChildToBack(block);
        Node name = IR.name("test");
        block.addChildToBack(name);
        assertEquals(inputId, NodeUtil.getInputId(name));
    }

    /**
     * Test for getInputId when no script node is an ancestor.
     */
    @Test
    public void testGetInputId_noScriptAncestor() throws Exception {
        Node function = IR.function(IR.name("fn"), IR.paramList(), IR.block());
        assertNull(NodeUtil.getInputId(function));
    }

    /**
     * Test for isConstantName when the node has the IS_CONSTANT_NAME property.
     */
    @Test
    public void testIsConstantName_true() throws Exception {
        Node nameNode = IR.name("MY_CONSTANT");
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(NodeUtil.isConstantName(nameNode));
    }

    /**
     * Test for isConstantName when the node does not have the IS_CONSTANT_NAME property.
     */
    @Test
    public void testIsConstantName_false() throws Exception {
        Node nameNode = IR.name("myVariable");
        assertFalse(NodeUtil.isConstantName(nameNode));
    }

    /**
     * Test for isConstantByConvention when the convention marks a simple name as constant.
     */

    /**
     * Test for isConstantByConvention when the convention marks an object key as constant.
     */

    /**
     * Test for isConstantByConvention when the convention marks a property name as constant.
     */

    /**
     * Test for getBestJSDocInfo on a node with its own JSDoc.
     */
    @Test
    public void testGetBestJSDocInfo_direct() throws Exception {
        JSDocInfo mockJSDocInfo = new JSDocInfo();
        Node nameNode = IR.name("myVar");
        nameNode.setJSDocInfo(mockJSDocInfo);
        assertEquals(mockJSDocInfo, NodeUtil.getBestJSDocInfo(nameNode));
    }

    /**
     * Test for getBestJSDocInfo on a parent with JSDoc (variable declaration).
     */

    /**
     * Test for getBestJSDocInfo on a parent with JSDoc (assignment).
     */

    /**
     * Test for getBestJSDocInfo on an object literal key.
     */

    /**
     * Test for getBestJSDocInfo on a function node.
     */
    @Test
    public void testGetBestJSDocInfo_functionNode() throws Exception {
        JSDocInfo mockJSDocInfo = new JSDocInfo();
        Node fnNode = IR.function(IR.name("myFunc"), IR.paramList(), IR.block());
        fnNode.setJSDocInfo(mockJSDocInfo);
        assertEquals(mockJSDocInfo, NodeUtil.getBestJSDocInfo(fnNode));
    }

    /**
     * Test for getBestJSDocInfo on a conditional expression (hook).
     */

    /**
     * Test for getBestJSDocInfo on an OR expression.
     */

    /**
     * Test for getBestJSDocInfo when no JSDoc is found.
     */
    @Test
    public void testGetBestJSDocInfo_noJSDoc() throws Exception {
        Node nameNode = IR.name("myVar");
        assertNull(NodeUtil.getBestJSDocInfo(nameNode));
    }

    /**
     * Test for getBestLValue on a simple name.
     */
    @Test
    public void testGetBestLValue_simpleName() throws Exception {
        Node nameNode = IR.name("myVar");
        assertEquals(nameNode, NodeUtil.getBestLValue(nameNode));
    }

    /**
     * Test for getBestLValue on a property access.
     */
    @Test
    public void testGetBestLValue_propertyAccess() throws Exception {
        Node propAccess = IR.getprop(IR.name("obj"), IR.string("prop"));
        assertEquals(propAccess, NodeUtil.getBestLValue(propAccess));
    }

    /**
     * Test for getBestLValue on an element access.
     */
    @Test
    public void testGetBestLValue_elementAccess() throws Exception {
        Node getElem = IR.getelem(IR.name("arr"), IR.number(0));
        assertEquals(getElem, NodeUtil.getBestLValue(getElem));
    }

    /**
     * Test for getBestLValue on an object literal key.
     */
    @Test
    public void testGetBestLValue_objectLitKey() throws Exception {
        Node keyNode = IR.stringKey("myKey");
        assertEquals(keyNode, NodeUtil.getBestLValue(keyNode));
    }

    /**
     * Test for getBestLValue on a function name in a declaration.
     */

    /**
     * Test for getBestLValue on a value in a conditional expression (hook).
     */

    /**
     * Test for getBestLValue on a value in an OR expression.
     */

    /**
     * Test for getBestLValue on a value that is not an L-value.
     */
    @Test
    public void testGetBestLValue_notLValue() throws Exception {
        Node numberNode = IR.number(123);
        assertNull(NodeUtil.getBestLValue(numberNode));

        Node stringNode = IR.string("hello");
        assertNull(NodeUtil.getBestLValue(stringNode));

        Node functionExpression = IR.function(null, IR.paramList(), IR.block());
        assertNull(NodeUtil.getBestLValue(functionExpression));
    }

    /**
     * Test for getRValueOfLValue when the L-value is a simple name in a VAR declaration.
     */

    /**
     * Test for getRValueOfLValue when the L-value is a simple name in an ASSIGN statement.
     */

    /**
     * Test for getRValueOfLValue when the L-value is a function expression.
     */
    @Test
    public void testGetRValueOfLValue_functionExpression() throws Exception {
        Node fnNode = IR.function(IR.name("myFunc"), IR.paramList(), IR.block());
        assertEquals(fnNode, NodeUtil.getRValueOfLValue(fnNode));
    }

    /**
     * Test for getRValueOfLValue when the L-value is not part of an assignment or var.
     */
    @Test
    public void testGetRValueOfLValue_notAssignmentOrVar() throws Exception {
        Node nameNode = IR.name("myVar"); // Not part of an assignment or var declaration in this context
        assertNull(NodeUtil.getRValueOfLValue(nameNode));
    }

    /**
     * Test for getBestLValueOwner on a simple name.
     */
    @Test
    public void testGetBestLValueOwner_simpleName() throws Exception {
        Node nameNode = IR.name("myVar");
        assertNull(NodeUtil.getBestLValueOwner(nameNode));
    }

    /**
     * Test for getBestLValueOwner on a property access.
     */

    /**
     * Test for getBestLValueOwner on an element access.
     */

    /**
     * Test for getBestLValueOwner on an object literal key.
     */

    /**
     * Test for getBestLValueOwner on a function name in a declaration.
     */

    /**
     * Test for getBestLValueOwner on a null input.
     */
    @Test
    public void testGetBestLValueOwner_null() throws Exception {
        assertNull(NodeUtil.getBestLValueOwner(null));
    }

    /**
     * Test for getBestLValueName on a simple name.
     */
    @Test
    public void testGetBestLValueName_simpleName() throws Exception {
        Node nameNode = IR.name("myVar");
        assertEquals("myVar", NodeUtil.getBestLValueName(nameNode));
    }

    /**
     * Test for getBestLValueName on a qualified name (property access).
     */
    @Test
    public void testGetBestLValueName_qualifiedName() throws Exception {
        Node propAccess = IR.getprop(IR.name("obj"), IR.string("prop"));
        assertEquals("obj.prop", NodeUtil.getBestLValueName(propAccess));
    }

    /**
     * Test for getBestLValueName on an element access.
     */
    @Test
    public void testGetBestLValueName_elementAccess() throws Exception {
        Node elemAccess = IR.getelem(IR.name("arr"), IR.number(0));
        // Element access doesn't have a simple qualified name representation.
        assertNull(NodeUtil.getBestLValueName(elemAccess));
    }

    /**
     * Test for getBestLValueName on an object literal key.
     */

    /**
     * Test for getBestLValueName on a function name in a declaration.
     */

    /**
     * Test for getBestLValueName on a null input.
     */
    @Test
    public void testGetBestLValueName_null() throws Exception {
        assertNull(NodeUtil.getBestLValueName(null));
    }

    /**
     * Test for isExpressionResultUsed when the expression is a direct child of BLOCK.
     */

    /**
     * Test for isExpressionResultUsed when the expression is a direct child of EXPR_RESULT.
     */

    /**
     * Test for isExpressionResultUsed when the expression is the condition of an IF.
     */

    /**
     * Test for isExpressionResultUsed when the expression is part of an AND.
     */

    /**
     * Test for isExpressionResultUsed when the expression is part of an OR.
     */

    /**
     * Test for isExpressionResultUsed when the expression is the first part of a COMMA.
     */

    /**
     * Test for isExpressionResultUsed when the expression is the second part of a COMMA.
     */

    /**
     * Test for isExpressionResultUsed in a FOR loop condition.
     */

    /**
     * Test for isExpressionResultUsed in a FOR loop initialization.
     */

    /**
     * Test for isExpressionResultUsed in a FOR loop increment.
     */

    /**
     * Test for isExecutedExactlyOnce with a simple expression in a script.
     */

    /**
     * Test for isExecutedExactlyOnce with an expression in an IF condition.
     */

    /**
     * Test for isExecutedExactlyOnce with an expression in an IF's else block.
     */

    /**
     * Test for isExecutedExactlyOnce with an expression in a WHILE condition.
     */

    /**
     * Test for isExecutedExactlyOnce with an expression in a FOR condition.
     */

    /**
     * Test for isExecutedExactlyOnce with an expression in a FOR-IN loop.
     */

    /**
     * Test for isExecutedExactlyOnce with an expression in a TRY block.
     */

    /**
     * Test for isExecutedExactlyOnce with an expression in a CATCH block.
     */

    /**
     * Test for isExecutedExactlyOnce with an expression in a FINALLY block.
     */

    /**
     * Test for isExecutedExactlyOnce with an expression in a CASE statement.
     */

    /**
     * Test for booleanNode with true.
     */
    @Test
    public void testBooleanNode_true() throws Exception {
        Node node = NodeUtil.booleanNode(true);
        assertEquals(Token.TRUE, node.getType());
        assertTrue(node.isTrue());
    }

    /**
     * Test for booleanNode with false.
     */
    @Test
    public void testBooleanNode_false() throws Exception {
        Node node = NodeUtil.booleanNode(false);
        assertEquals(Token.FALSE, node.getType());
        assertTrue(node.isFalse());
    }

    /**
     * Test for numberNode with a regular number.
     */

    /**
     * Test for numberNode with NaN.
     */

    /**
     * Test for numberNode with positive infinity.
     */

    /**
     * Test for numberNode with negative infinity.
     */

    /**
     * Test for numberNode with zero double value.
     */

    /**
     * Test for numberNode with negative zero double value.
     */
}




