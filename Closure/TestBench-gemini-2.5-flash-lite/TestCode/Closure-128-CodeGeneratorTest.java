package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

public class CodeGeneratorTest {

    // Mock CodeConsumer to capture output





    // Helper to create a simple node
    private Node createSimpleNode(int type) {
        return new Node(type);
    }

    // Helper to create a node with a string value
    private Node createStringNode(String value) {
        return Node.newString(value);
    }

    // Helper to create a node with a number value
    private Node createNumberNode(double value) {
        return Node.newNumber(value);
    }

    // Helper to create a node for a binary operator
    private Node createBinaryOpNode(int type, Node left, Node right) {
        Node node = new Node(type, left, right);
        return node;
    }

    // Helper to create a node for a unary operator
    private Node createUnaryOpNode(int type, Node child) {
        Node node = new Node(type, child);
        return node;
    }

    // Helper to create a VAR node
    private Node createVarNode(String name) {
        Node var = new Node(Token.VAR);
        var.addChildToBack(Node.newString(name));
        return var;
    }

    // Helper to create a simple assignment node
    private Node createAssignmentNode(Node left, Node right) {
        return createBinaryOpNode(Token.ASSIGN, left, right);
    }

    // Helper to create a simple name node
    private Node createNameNode(String name) {
        return Node.newString(Token.NAME, name);
    }

    // Helper to create a simple NUMBER node
    private Node createNumberTypeNode(double value) {
        return Node.newNumber(value);
    }

    // Helper to create a simple STRING node
    private Node createStringTypeNode(String value) {
        return Node.newString(Token.STRING, value);
    }

    // Helper to create a simple REGEXP node
    private Node createRegExpNode(String pattern, String flags) {
        Node regexNode = new Node(Token.REGEXP, Node.newString(pattern));
        if (flags != null) {
            regexNode.addChildToBack(Node.newString(flags));
        }
        return regexNode;
    }

    // Helper to create a simple FUNCTION node
    private Node createFunctionNode(String name, Node params, Node body) {
        Node fn = new Node(Token.FUNCTION, Node.newString(name), params, body);
        return fn;
    }

    // Helper to create a simple OBJECTLIT node
    private Node createObjectLitNode(Node... properties) {
        Node obj = new Node(Token.OBJECTLIT);
        for (Node prop : properties) {
            obj.addChildToBack(prop);
        }
        return obj;
    }

    // Helper to create a simple ARRAYLIT node
    private Node createArrayLitNode(Node... elements) {
        Node arr = new Node(Token.ARRAYLIT);
        for (Node elem : elements) {
            arr.addChildToBack(elem);
        }
        return arr;
    }

    // Helper to create a FOR node
    private Node createForNode(Node init, Node cond, Node increment, Node body) {
        Node forNode = new Node(Token.FOR, init, cond, increment, body);
        return forNode;
    }

    // Helper to create a FOR_IN node
    private Node createForInNode(Node iterated, Node body) {
        Node forInNode = new Node(Token.FOR, createNameNode("i"), iterated, body);
        return forInNode;
    }

    // Helper to create a IF node
    private Node createIfNode(Node cond, Node thenBranch, Node elseBranch) {
        Node ifNode = new Node(Token.IF, cond, thenBranch, elseBranch);
        return ifNode;
    }

    // Helper to create a TRY node
    private Node createTryNode(Node tryBlock, Node catchBlock, Node finallyBlock) {
        Node tryNode = new Node(Token.TRY, tryBlock, catchBlock, finallyBlock);
        return tryNode;
    }

    // Helper to create a CATCH node
    private Node createCatchNode(Node exceptionVar, Node block) {
        Node catchNode = new Node(Token.CATCH, exceptionVar, block);
        return catchNode;
    }

    // Helper to create a NAME node
    private Node NAME(String name) {
        return Node.newString(Token.NAME, name);
    }





















































    @Test
    public void testAddNodeWithLabel() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node labelName = new Node(Token.LABEL_NAME, "loop");
        Node statement = new Node(Token.EXPR_RESULT, createNumberNode(1));
        Node labelNode = new Node(Token.LABEL, labelName, statement);
        cg.add(labelNode);
        assertEquals("loop:1;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithExpressionResult() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node exprResult = new Node(Token.EXPR_RESULT, createNumberNode(42));
        cg.add(exprResult);
        assertEquals("42;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithCaseStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node caseValue = createNumberNode(1);
        Node caseBody = new Node(Token.BLOCK, createVarNode("a"));
        Node caseNode = new Node(Token.CASE, caseValue, caseBody);
        cg.add(caseNode);
        assertEquals("case 1:{var a;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithDefaultCase() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node defaultCaseNode = new Node(Token.DEFAULT_CASE, createVarNode("b"));
        cg.add(defaultCaseNode);
        assertEquals("default{var b;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithSwitchStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node switchExpr = createNameNode("value");
        Node case1 = new Node(Token.CASE, createNumberNode(1), new Node(Token.BLOCK, createVarNode("c")));
        Node case2 = new Node(Token.CASE, createNumberNode(2), new Node(Token.BLOCK, createVarNode("d")));
        Node switchNode = new Node(Token.SWITCH, switchExpr);
        switchNode.addChildToBack(case1);
        switchNode.addChildToBack(case2);
        cg.add(switchNode);
        assertEquals("switch(value){case 1:{var c;}case 2:{var d;}}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBlock() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node block = new Node(Token.BLOCK, createVarNode("x"));
        cg.add(block);
        assertEquals("{var x;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithEmptyBlock() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node block = new Node(Token.BLOCK);
        cg.add(block);
        assertEquals("{};", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithEmptyStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node emptyStmt = new Node(Token.EMPTY);
        cg.add(emptyStmt);
        assertEquals(";", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithDebuggerStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node debuggerStmt = new Node(Token.DEBUGGER);
        cg.add(debuggerStmt);
        assertEquals("debugger;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithGETTER_DEF() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = Node.newString("myProp");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK, createVarNode("val"));
        Node funcNode = new Node(Token.FUNCTION, Node.newString(""), params, body);
        Node getterDef = new Node(Token.GETTER_DEF);
        getterDef.addChildToBack(funcNode);
        getterDef.setString("myProp"); // Set the property name on the GETTER_DEF node

        Node objectLit = new Node(Token.OBJECTLIT);
        objectLit.addChildToBack(getterDef);
        cg.add(objectLit);
        assertEquals("{get myProp(){var val;}}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithSETTER_DEF() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = Node.newString("myProp");
        Node param = createNameNode("v");
        Node params = new Node(Token.PARAM_LIST, param);
        Node body = new Node(Token.BLOCK);
        Node funcNode = new Node(Token.FUNCTION, Node.newString(""), params, body);
        Node setterDef = new Node(Token.SETTER_DEF);
        setterDef.addChildToBack(funcNode);
        setterDef.setString("myProp"); // Set the property name on the SETTER_DEF node

        Node objectLit = new Node(Token.OBJECTLIT);
        objectLit.addChildToBack(setterDef);
        cg.add(objectLit);
        assertEquals("{set myProp(v){}}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithCAST() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node castNode = new Node(Token.CAST, createNameNode("foo"));
        cg.add(castNode);
        assertEquals("(foo)", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithSTRIP_V_special_case() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node stringNode = Node.newString("abc");
        stringNode.putBooleanProp(Node.SLASH_V, true);
        cg.add(stringNode);
        assertEquals("\\v", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithTrustedStringSpecialChars() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node stringNode = Node.newString("<script>");
        cg.add(stringNode);
        assertEquals("\"<script>\"", cg.cc.output.toString()); // Default trustedStrings = true
    }

    @Test
    public void testAddNodeWithUnTrustedStringSpecialChars() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.trustedStrings = false;
        CodeGenerator cg = createCodeGenerator(options);
        Node stringNode = Node.newString("<script>");
        cg.add(stringNode);
        assertEquals("\"\\x3cscript\\x3e\"", cg.cc.output.toString()); // trustedStrings = false
    }

    @Test
    public void testAddNodeWithRegExpEscape() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regexp = createRegExpNode("a.b", null);
        cg.add(regexp);
        assertEquals("/a.b/", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithRegExpEscape_special_chars() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.trustedStrings = false; // To trigger more escaping in strEscape
        CodeGenerator cg = createCodeGenerator(options);
        Node regexp = createRegExpNode("a[b]", null); // '[' and ']' are special in regex
        cg.add(regexp);
        assertEquals("/a\\x5Bb\\x5D/", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithRegExpEscape_slash() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regexp = createRegExpNode("/", null);
        cg.add(regexp);
        // '/' should be escaped in a regex literal when it's the delimiter.
        // In this case, it's the default delimiter, so it should be escaped.
        assertEquals("/\\//", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithIdentifierEscape() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        // Test with a non-JS identifier character
        Node identNode = Node.newString(Token.NAME, "my-var");
        cg.addIdentifier(identNode.getString()); // Should use identifierEscape
        assertEquals("my\\x2dvar", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithIdentifierEscape_nonLatin() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node identNode = Node.newString(Token.NAME, "var\u00E9"); // é
        cg.addIdentifier(identNode.getString());
        assertEquals("var\\u00E9", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithIdentifierEscape_valid() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node identNode = Node.newString(Token.NAME, "_validIdentifier");
        cg.addIdentifier(identNode.getString());
        assertEquals("_validIdentifier", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithGetPropOnNumber_parenthesized() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node numberNode = createNumberNode(123);
        Node propName = createStringNode("toString");
        Node getProp = new Node(Token.GETPROP, numberNode, propName);
        cg.add(getProp);
        assertEquals("(123).toString", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithGetElemOnStringLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node stringNode = Node.newString("hello");
        Node indexNode = createNumberNode(1);
        Node getElem = new Node(Token.GETELEM, stringNode, indexNode);
        cg.add(getElem);
        assertEquals("\"hello\"[1]", cg.cc.output.toString());
    }
}





