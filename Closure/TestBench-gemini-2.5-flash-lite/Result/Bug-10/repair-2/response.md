```java
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
import com.google.javascript.rhino.StaticScope;


public class NodeUtilTest {

    /**
     * Mock CodingConvention implementation for testing.
     * Provides default implementations for methods that are not the focus of the specific test.
     */
    private static class MockCodingConvention implements CodingConvention {
        @Override public boolean isConstant(String variableName) { return false; }
        @Override public boolean isConstantKey(String keyName) { return false; }
        @Override public boolean isOptionalParameter(Node parameter) { return false; }
        @Override public boolean isVarArgsParameter(Node parameter) { return false; }
        @Override public boolean isExported(String name, boolean local) { return false; }
        @Override public boolean isExported(String name) { return false; }
        @Override public boolean isPrivate(String name) { return false; }
        @Override public SubclassRelationship getClassesDefinedByCall(Node callNode) { return null; }
        @Override public boolean isSuperClassReference(String propertyName) { return false; }
        @Override public String extractClassNameIfProvide(Node node, Node parent) { return null; }
        @Override public String extractClassNameIfRequire(Node node, Node parent) { return null; }
        @Override public String getExportPropertyFunction() { return null; }
        @Override public String getExportSymbolFunction() { return null; }
        @Override public List<String> identifyTypeDeclarationCall(Node n) { return null; }
        @Override public void applySubclassRelationship(FunctionType parentCtor, FunctionType childCtor, SubclassType type) { }
        @Override public String getAbstractMethodName() { return null; }
        @Override public String getSingletonGetterClassName(Node callNode) { return null; }
        @Override public void applySingletonGetter(FunctionType functionType, FunctionType getterType, ObjectType objectType) { }
        @Override public boolean isInlinableFunction(Node n) { return false; }
        @Override public DelegateRelationship getDelegateRelationship(Node callNode) { return null; }
        @Override public void applyDelegateRelationship(ObjectType delegateSuperclass, ObjectType delegateBase, ObjectType delegator, FunctionType delegateProxy, FunctionType findDelegate) { }
        @Override public String getDelegateSuperclassName() { return null; }
        @Override public void checkForCallingConventionDefiningCalls(Node n, Map<String, String> delegateCallingConventions) { }
        @Override public void defineDelegateProxyPrototypeProperties(JSTypeRegistry registry, StaticScope<JSType> scope, List<ObjectType> delegateProxyPrototypes, Map<String, String> delegateCallingConventions) { }
        @Override public String getGlobalObject() { return "window"; }
        @Override public Bind describeFunctionBind(Node n) { return null; }
        @Override public Bind describeFunctionBind(Node n, boolean useTypeInfo) { return null; }

        // Methods added for compilation
        @Override
        public List<Node> getAssertionFunctions() {
            return Collections.emptyList();
        }
    }

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
    @Test
    public void testGetNearestFunctionName() throws Exception {
        // function name() {}
        Node fn1 = IR.function(IR.name("myFunc"), IR.paramList(), IR.block());
        assertEquals("myFunc", NodeUtil.getNearestFunctionName(fn1));

        // var name = function() {}
        Node fn2 = IR.function(null, IR.paramList(), IR.block());
        Node var1 = IR.var(IR.name("myVar"), fn2);
        assertEquals("myVar", NodeUtil.getNearestFunctionName(fn2));

        // qualified.name = function() {}
        Node fn3 = IR.function(null, IR.paramList(), IR.block());
        Node qualifiedName = IR.getprop(IR.name("obj"), IR.string("prop"));
        Node assign1 = IR.assign(qualifiedName, fn3);
        assertEquals("obj.prop", NodeUtil.getNearestFunctionName(fn3));

        // var name2 = function name1() {}
        Node fn4 = IR.function(IR.name("innerFunc"), IR.paramList(), IR.block());
        Node var2 = IR.var(IR.name("outerVar"), fn4);
        assertEquals("outerVar", NodeUtil.getNearestFunctionName(fn4));

        // qualified.name2 = function name1() {}
        Node fn5 = IR.function(IR.name("innerFunc"), IR.paramList(), IR.block());
        Node qualifiedName2 = IR.getprop(IR.name("obj2"), IR.string("prop2"));
        Node assign2 = IR.assign(qualifiedName2, fn5);
        assertEquals("obj2.prop2", NodeUtil.getNearestFunctionName(fn5));

        // {'name': function() {}}
        Node fn6 = IR.function(null, IR.paramList(), IR.block());
        Node stringKey1 = IR.stringKey("keyName");
        Node objLit1 = IR.objectlit(IR.propdef(stringKey1, fn6));
        assertEquals("keyName", NodeUtil.getNearestFunctionName(fn6));

        // {get name() {}}
        Node getterFn = IR.function(null, IR.paramList(), IR.block());
        Node getterDefSimulated = new Node(Token.GETTER_DEF, IR.stringKey("getterName"), getterFn);
        getterDefSimulated.setParent(IR.objectlit(getterDefSimulated)); // To simulate parent context for getNearestFunctionName
        assertEquals("getterName", NodeUtil.getNearestFunctionName(getterFn));

        // {set name(a){}}
        Node setterFn = IR.function(null, IR.paramList(IR.name("a")), IR.block());
        Node setterDefSimulated = new Node(Token.SETTER_DEF, IR.stringKey("setterName"), setterFn);
        setterDefSimulated.setParent(IR.objectlit(setterDefSimulated)); // To simulate parent context for getNearestFunctionName
        assertEquals("setterName", NodeUtil.getNearestFunctionName(setterFn));

        // Anonymous function
        Node anonymousFn = IR.function(null, IR.paramList(), IR.block());
        assertNull(NodeUtil.getNearestFunctionName(anonymousFn));
    }

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
    @Test
    public void testIsLValue() throws Exception {
        // NAME
        assertTrue(NodeUtil.isLValue(IR.name("a")));
        // A name in a var declaration should be an L-value.
        Node varName = IR.name("a");
        Node varDecl = IR.var(varName);
        varName.setParent(varDecl); // Manually set parent for isLValue to check
        assertTrue(NodeUtil.isLValue(varName));

        // GETPROP
        Node getProp = IR.getprop(IR.name("obj"), IR.string("prop"));
        assertTrue(NodeUtil.isLValue(getProp));

        // GETELEM
        Node getElem = IR.getelem(IR.name("arr"), IR.number(0));
        assertTrue(NodeUtil.isLValue(getElem));

        // Function parameters
        Node paramList = IR.paramList(IR.name("param"));
        paramList.getFirstChild().setParent(paramList); // Manually set parent
        assertTrue(NodeUtil.isLValue(paramList.getFirstChild()));
    }

    /**
     * Test for isLValue with invalid L-value nodes.
     */
    @Test
    public void testIsLValue_invalid() throws Exception {
        // NUMBER
        assertFalse(NodeUtil.isLValue(IR.number(1)));

        // STRING
        assertFalse(NodeUtil.isLValue(IR.string("a")));

        // OBJECTLIT
        assertFalse(NodeUtil.isLValue(IR.objectlit()));

        // Function expression without a name
        Node fnExpr = IR.function(null, IR.paramList(), IR.block());
        assertFalse(NodeUtil.isLValue(fnExpr));

        // Function declaration
        Node fnName = IR.name("fn");
        Node fnDecl = IR.function(fnName, IR.paramList(), IR.block());
        fnName.setParent(fnDecl); // Manually set parent for isLValue to check
        // Function name in declaration is L-value
        assertTrue(NodeUtil.isLValue(fnName));
        // Function node itself is not an L-value
        assertFalse(NodeUtil.isLValue(fnDecl));
    }

    /**
     * Test for newQualifiedNameNode with a simple name.
     */
    @Test
    public void testNewQualifiedNameNode_simple() throws Exception {
        MockCodingConvention mockConvention = new MockCodingConvention();
        Node nameNode = NodeUtil.newQualifiedNameNode(mockConvention, "myVar");
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("myVar", nameNode.getString());
    }

    /**
     * Test for newQualifiedNameNode with a qualified name.
     */
    @Test
    public void testNewQualifiedNameNode_qualified() throws Exception {
        MockCodingConvention mockConvention = new MockCodingConvention();
        Node nameNode = NodeUtil.newQualifiedNameNode(mockConvention, "obj.prop.method");
        assertEquals(Token.GETPROP, nameNode.getType());
        assertEquals("obj.prop.method", nameNode.getQualifiedName());
    }

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
    @Test
    public void testGetSourceName_direct() throws Exception {
        Node node = IR.name("test");
        node.setSourceFileName("test.js");
        assertEquals("test.js", NodeUtil.getSourceName(node));
    }

    /**
     * Test for getSourceName with an ancestor having a source file name.
     */
    @Test
    public void testGetSourceName_ancestor() throws Exception {
        Node script = IR.script();
        script.setSourceFileName("script.js");
        Node block = IR.block();
        script.addChildToBack(block);
        Node name = IR.name("test");
        block.addChildToBack(name);
        assertEquals("script.js", NodeUtil.getSourceName(name));
    }

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
    @Test
    public void testGetSourceFile_direct() throws Exception {
        Node node = IR.name("test");
        StaticSourceFile mockSourceFile = new StaticSourceFile() {
            @Override public String getName() { return "test.js"; }
            @Override public InputId getInputId() { return null; }
            @Override public String getCode() { return null; }
            @Override public CharSequence getCode() { return null; }
            @Override public long getLastModified() { return 0; }
            @Override public boolean isOriginalCompilationUnit() { return false; }
        };
        node.setStaticSourceFile(mockSourceFile);
        assertEquals(mockSourceFile, NodeUtil.getSourceFile(node));
    }

    /**
     * Test for getSourceFile with an ancestor having a source file.
     */
    @Test
    public void testGetSourceFile_ancestor() throws Exception {
        Node script = IR.script();
        StaticSourceFile mockSourceFile = new StaticSourceFile() {
            @Override public String getName() { return "script.js"; }
            @Override public InputId getInputId() { return null; }
            @Override public String getCode() { return null; }
            @Override public CharSequence getCode() { return null; }
            @Override public long getLastModified() { return 0; }
            @Override public boolean isOriginalCompilationUnit() { return false; }
        };
        script.setStaticSourceFile(mockSourceFile);
        Node block = IR.block();
        script.addChildToBack(block);
        Node name = IR.name("test");
        block.addChildToBack(name);
        assertEquals(mockSourceFile, NodeUtil.getSourceFile(name));
    }

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
    @Test
    public void testIsConstantByConvention_simpleName() throws Exception {
        MockCodingConvention mockConvention = new MockCodingConvention() {
            @Override public boolean isConstant(String variableName) { return "CONST_VAR".equals(variableName); }
        };
        Node nameNode = IR.name("CONST_VAR");
        Node parent = IR.var(nameNode); // Parent is VAR
        nameNode.setParent(parent); // Manually set parent for isConstantByConvention to check
        assertTrue(NodeUtil.isConstantByConvention(mockConvention, nameNode, parent));
    }

    /**
     * Test for isConstantByConvention when the convention marks an object key as constant.
     */
    @Test
    public void testIsConstantByConvention_objectKey() throws Exception {
        MockCodingConvention mockConvention = new MockCodingConvention() {
            @Override public boolean isConstantKey(String keyName) { return "CONST_KEY".equals(keyName); }
        };
        Node keyNode = IR.stringKey("CONST_KEY");
        Node valueNode = IR.number(10);
        Node propDef = IR.propdef(keyNode, valueNode);
        Node parent = IR.objectlit(propDef); // Parent is OBJECTLIT
        keyNode.setParent(propDef); // Manually set parent for isConstantByConvention to check
        propDef.setParent(parent);
        assertTrue(NodeUtil.isConstantByConvention(mockConvention, keyNode, parent));
    }

    /**
     * Test for isConstantByConvention when the convention marks a property name as constant.
     */
    @Test
    public void testIsConstantByConvention_propertyName() throws Exception {
        MockCodingConvention mockConvention = new MockCodingConvention() {
            @Override public boolean isConstantKey(String keyName) { return "CONST_PROP".equals(keyName); }
        };
        Node propName = IR.string("CONST_PROP");
        Node baseName = IR.name("obj");
        Node getProp = IR.getprop(baseName, propName);
        propName.setParent(getProp); // Manually set parent for isConstantByConvention to check
        assertTrue(NodeUtil.isConstantByConvention(mockConvention, propName, getProp));
    }

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
    @Test
    public void testGetBestJSDocInfo_varParent() throws Exception {
        JSDocInfo mockJSDocInfo = new JSDocInfo();
        Node nameNode = IR.name("myVar");
        Node varNode = IR.var(nameNode);
        varNode.setJSDocInfo(mockJSDocInfo);
        nameNode.setParent(varNode); // Manually set parent
        assertEquals(mockJSDocInfo, NodeUtil.getBestJSDocInfo(nameNode));
    }

    /**
     * Test for getBestJSDocInfo on a parent with JSDoc (assignment).
     */
    @Test
    public void testGetBestJSDocInfo_assignParent() throws Exception {
        JSDocInfo mockJSDocInfo = new JSDocInfo();
        Node rValueNode = IR.number(10);
        Node assignNode = IR.assign(IR.name("myVar"), rValueNode);
        assignNode.setJSDocInfo(mockJSDocInfo);
        rValueNode.setParent(assignNode); // Manually set parent
        assertEquals(mockJSDocInfo, NodeUtil.getBestJSDocInfo(rValueNode));
    }

    /**
     * Test for getBestJSDocInfo on an object literal key.
     */
    @Test
    public void testGetBestJSDocInfo_objectLitKey() throws Exception {
        JSDocInfo mockJSDocInfo = new JSDocInfo();
        Node keyNode = IR.stringKey("myKey");
        Node valueNode = IR.number(10);
        Node propDef = IR.propdef(keyNode, valueNode);
        Node objLit = IR.objectlit(propDef);
        objLit.setJSDocInfo(mockJSDocInfo); // JSDoc on the object literal itself
        keyNode.setParent(propDef); // Manually set parent for traversal
        propDef.setParent(objLit);
        assertEquals(mockJSDocInfo, NodeUtil.getBestJSDocInfo(keyNode));
    }

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
    @Test
    public void testGetBestJSDocInfo_hook() throws Exception {
        JSDocInfo mockJSDocInfo = new JSDocInfo();
        Node condition = IR.trueNode();
        Node trueBranch = IR.number(1);
        Node falseBranch = IR.number(2);
        Node hook = IR.hook(condition, trueBranch, falseBranch);
        hook.setJSDocInfo(mockJSDocInfo);
        condition.setParent(hook); // Manually set parents for traversal
        trueBranch.setParent(hook);
        falseBranch.setParent(hook);
        assertEquals(mockJSDocInfo, NodeUtil.getBestJSDocInfo(trueBranch));
        assertEquals(mockJSDocInfo, NodeUtil.getBestJSDocInfo(falseBranch));
    }

    /**
     * Test for getBestJSDocInfo on an OR expression.
     */
    @Test
    public void testGetBestJSDocInfo_or() throws Exception {
        JSDocInfo mockJSDocInfo = new JSDocInfo();
        Node left = IR.trueNode();
        Node right = IR.falseNode();
        Node orNode = IR.or(left, right);
        orNode.setJSDocInfo(mockJSDocInfo);
        left.setParent(orNode); // Manually set parents for traversal
        right.setParent(orNode);
        assertEquals(mockJSDocInfo, NodeUtil.getBestJSDocInfo(left));
        assertEquals(mockJSDocInfo, NodeUtil.getBestJSDocInfo(right));
    }

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
    @Test
    public void testGetBestLValue_functionDeclarationName() throws Exception {
        Node fnName = IR.name("myFunc");
        Node fnNode = IR.function(fnName, IR.paramList(), IR.block());
        fnName.setParent(fnNode); // Manually set parent
        assertEquals(fnName, NodeUtil.getBestLValue(fnName));
    }

    /**
     * Test for getBestLValue on a value in a conditional expression (hook).
     */
    @Test
    public void testGetBestLValue_hook() throws Exception {
        Node condition = IR.trueNode();
        Node trueBranch = IR.name("a");
        Node falseBranch = IR.name("b");
        Node hook = IR.hook(condition, trueBranch, falseBranch);
        condition.setParent(hook);
        trueBranch.setParent(hook);
        falseBranch.setParent(hook);
        // The trueBranch is an L-value.
        assertEquals(trueBranch, NodeUtil.getBestLValue(trueBranch));
        // The falseBranch is an L-value.
        assertEquals(falseBranch, NodeUtil.getBestLValue(falseBranch));
    }

    /**
     * Test for getBestLValue on a value in an OR expression.
     */
    @Test
    public void testGetBestLValue_orExpression() throws Exception {
        Node left = IR.name("a");
        Node right = IR.name("b");
        Node orNode = IR.or(left, right);
        left.setParent(orNode);
        right.setParent(orNode);
        assertEquals(left, NodeUtil.getBestLValue(left));
        assertEquals(right, NodeUtil.getBestLValue(right));
    }

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
    @Test
    public void testGetRValueOfLValue_varDeclaration() throws Exception {
        Node valueNode = IR.number(42);
        Node nameNode = IR.name("myVar");
        Node varNode = IR.var(nameNode, valueNode);
        nameNode.setParent(varNode);
        assertEquals(valueNode, NodeUtil.getRValueOfLValue(nameNode));
    }

    /**
     * Test for getRValueOfLValue when the L-value is a simple name in an ASSIGN statement.
     */
    @Test
    public void testGetRValueOfLValue_assignment() throws Exception {
        Node targetNode = IR.name("myVar");
        Node valueNode = IR.number(42);
        Node assignNode = IR.assign(targetNode, valueNode);
        targetNode.setParent(assignNode);
        assertEquals(valueNode, NodeUtil.getRValueOfLValue(targetNode));
    }

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
    @Test
    public void testGetBestLValueOwner_propertyAccess() throws Exception {
        Node baseNode = IR.name("obj");
        Node propAccess = IR.getprop(baseNode, IR.string("prop"));
        baseNode.setParent(propAccess); // Manually set parent
        assertEquals(baseNode, NodeUtil.getBestLValueOwner(propAccess));
    }

    /**
     * Test for getBestLValueOwner on an element access.
     */
    @Test
    public void testGetBestLValueOwner_elementAccess() throws Exception {
        Node baseNode = IR.name("arr");
        Node elemAccess = IR.getelem(baseNode, IR.number(0));
        baseNode.setParent(elemAccess); // Manually set parent
        assertEquals(baseNode, NodeUtil.getBestLValueOwner(elemAccess));
    }

    /**
     * Test for getBestLValueOwner on an object literal key.
     */
    @Test
    public void testGetBestLValueOwner_objectLitKey() throws Exception {
        Node keyNode = IR.stringKey("myKey");
        Node objLit = IR.objectlit(IR.propdef(keyNode, IR.number(1)));
        Node propDefNode = objLit.getFirstChild(); // Get the propdef node
        keyNode.setParent(propDefNode); // Manually set parent
        propDefNode.setParent(objLit); // Manually set parent
        assertEquals(objLit, NodeUtil.getBestLValueOwner(keyNode));
    }

    /**
     * Test for getBestLValueOwner on a function name in a declaration.
     */
    @Test
    public void testGetBestLValueOwner_functionDeclarationName() throws Exception {
        Node fnName = IR.name("myFunc");
        Node fnNode = IR.function(fnName, IR.paramList(), IR.block());
        fnName.setParent(fnNode); // Manually set parent
        // The owner of a function name in a declaration is the function itself.
        assertEquals(fnNode, NodeUtil.getBestLValueOwner(fnName));
    }

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
    @Test
    public void testGetBestLValueName_objectLitKey() throws Exception {
        Node keyNode = IR.stringKey("myKey");
        Node ownerName = IR.name("myObj");
        Node objLit = IR.objectlit(IR.propdef(keyNode, IR.number(1)));
        Node propDefNode = objLit.getFirstChild();

        // Manually set parent relationships to simulate a proper AST structure
        keyNode.setParent(propDefNode);
        propDefNode.setParent(objLit);
        ownerName.setParent(null); // ownerName is not directly parented by objLit in this setup, need to link it for getBestLValueOwner

        // To make getBestLValueOwner work correctly for object lit keys, we need to establish the chain.
        // Let's simulate a scenario where 'myObj' is the ultimate owner.
        // This part is tricky as getBestLValueOwner for an object literal key returns the literal itself.
        // Then getBestLValueOwner on that literal returns its owner.
        // The implementation of getBestLValueName relies on this chain.

        // Mocking the chain for testing getBestLValueName correctly.
        Node rootOwner = IR.name("myObj");
        rootOwner.addChildToBack(objLit); // Simplified linkage for testing
        objLit.setParent(rootOwner);

        assertEquals("myObj.myKey", NodeUtil.getBestLValueName(keyNode));
    }

    /**
     * Test for getBestLValueName on a function name in a declaration.
     */
    @Test
    public void testGetBestLValueName_functionDeclarationName() throws Exception {
        Node fnName = IR.name("myFunc");
        Node fnNode = IR.function(fnName, IR.paramList(), IR.block());
        fnName.setParent(fnNode); // Manually set parent
        assertEquals("myFunc", NodeUtil.getBestLValueName(fnName));
    }

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
    @Test
    public void testIsExpressionResultUsed_blockChild() throws Exception {
        Node expr = IR.number(123);
        Node block = IR.block(expr);
        expr.setParent(block); // Manually set parent
        assertFalse(NodeUtil.isExpressionResultUsed(expr));
    }

    /**
     * Test for isExpressionResultUsed when the expression is a direct child of EXPR_RESULT.
     */
    @Test
    public void testIsExpressionResultUsed_exprResultChild() throws Exception {
        Node expr = IR.number(123);
        Node exprResult = IR.exprResult(expr);
        expr.setParent(exprResult); // Manually set parent
        assertFalse(NodeUtil.isExpressionResultUsed(expr));
    }

    /**
     * Test for isExpressionResultUsed when the expression is the condition of an IF.
     */
    @Test
    public void testIsExpressionResultUsed_ifCondition() throws Exception {
        Node expr = IR.number(123);
        Node ifNode = IR.ifNode(expr, IR.block());
        expr.setParent(ifNode); // Manually set parent
        assertTrue(NodeUtil.isExpressionResultUsed(expr));
    }

    /**
     * Test for isExpressionResultUsed when the expression is part of an AND.
     */
    @Test
    public void testIsExpressionResultUsed_andExpression() throws Exception {
        Node left = IR.number(1);
        Node right = IR.number(2);
        Node andNode = IR.and(left, right);
        left.setParent(andNode);
        right.setParent(andNode);
        // Left side of AND is used.
        assertTrue(NodeUtil.isExpressionResultUsed(left));
        // Right side of AND is used.
        assertTrue(NodeUtil.isExpressionResultUsed(right));
    }

    /**
     * Test for isExpressionResultUsed when the expression is part of an OR.
     */
    @Test
    public void testIsExpressionResultUsed_orExpression() throws Exception {
        Node left = IR.number(1);
        Node right = IR.number(2);
        Node orNode = IR.or(left, right);
        left.setParent(orNode);
        right.setParent(orNode);
        // Left side of OR is used.
        assertTrue(NodeUtil.isExpressionResultUsed(left));
        // Right side of OR is used.
        assertTrue(NodeUtil.isExpressionResultUsed(right));
    }

    /**
     * Test for isExpressionResultUsed when the expression is the first part of a COMMA.
     */
    @Test
    public void testIsExpressionResultUsed_commaFirstPart() throws Exception {
        Node first = IR.number(1);
        Node second = IR.number(2);
        Node commaNode = IR.comma(first, second);
        first.setParent(commaNode);
        second.setParent(commaNode);
        // The first part of a comma is not considered "used" unless it's part of a call or similar.
        assertFalse(NodeUtil.isExpressionResultUsed(first));
    }

    /**
     * Test for isExpressionResultUsed when the expression is the second part of a COMMA.
     */
    @Test
    public void testIsExpressionResultUsed_commaSecondPart() throws Exception {
        Node first = IR.number(1);
        Node second = IR.number(2);
        Node commaNode = IR.comma(first, second);
        first.setParent(commaNode);
        second.setParent(commaNode);
        // The second part of a comma is considered "used".
        assertTrue(NodeUtil.isExpressionResultUsed(second));
    }

    /**
     * Test for isExpressionResultUsed in a FOR loop condition.
     */
    @Test
    public void testIsExpressionResultUsed_forLoopCondition() throws Exception {
        Node init = IR.var(IR.name("i"), IR.number(0));
        Node cond = IR.number(1); // The condition expression
        Node incr = IR.inc(IR.name("i"));
        Node body = IR.block();
        Node forNode = IR.forNode(init, cond, incr, body);
        init.setParent(forNode);
        cond.setParent(forNode);
        incr.setParent(forNode);
        body.setParent(forNode);
        assertTrue(NodeUtil.isExpressionResultUsed(cond));
    }

    /**
     * Test for isExpressionResultUsed in a FOR loop initialization.
     */
    @Test
    public void testIsExpressionResultUsed_forLoopInit() throws Exception {
        Node init = IR.var(IR.name("i"), IR.number(0)); // The initialization expression
        Node cond = IR.trueNode();
        Node incr = IR.inc(IR.name("i"));
        Node body = IR.block();
        Node forNode = IR.forNode(init, cond, incr, body);
        init.setParent(forNode);
        cond.setParent(forNode);
        incr.setParent(forNode);
        body.setParent(forNode);
        // Initialization expressions are generally not considered "used".
        assertFalse(NodeUtil.isExpressionResultUsed(init));
    }

    /**
     * Test for isExpressionResultUsed in a FOR loop increment.
     */
    @Test
    public void testIsExpressionResultUsed_forLoopIncrement() throws Exception {
        Node init = IR.var(IR.name("i"), IR.number(0));
        Node cond = IR.trueNode();
        Node incr = IR.inc(IR.name("i")); // The increment expression
        Node body = IR.block();
        Node forNode = IR.forNode(init, cond, incr, body);
        init.setParent(forNode);
        cond.setParent(forNode);
        incr.setParent(forNode);
        body.setParent(forNode);
        // Increment expressions are generally not considered "used".
        assertFalse(NodeUtil.isExpressionResultUsed(incr));
    }

    /**
     * Test for isExecutedExactlyOnce with a simple expression in a script.
     */
    @Test
    public void testIsExecutedExactlyOnce_script() throws Exception {
        Node expr = IR.number(123);
        Node script = IR.script(IR.exprResult(expr));
        expr.setParent(script.getFirstChild()); // Manually set parent
        assertTrue(NodeUtil.isExecutedExactlyOnce(expr));
    }

    /**
     * Test for isExecutedExactlyOnce with an expression in an IF condition.
     */
    @Test
    public void testIsExecutedExactlyOnce_ifCondition() throws Exception {
        Node expr = IR.number(123);
        Node ifNode = IR.ifNode(expr, IR.block());
        expr.setParent(ifNode); // Manually set parent
        assertTrue(NodeUtil.isExecutedExactlyOnce(expr));
    }

    /**
     * Test for isExecutedExactlyOnce with an expression in an IF's else block.
     */
    @Test
    public void testIsExecutedExactlyOnce_ifElseBlock() throws Exception {
        Node elseBlock = IR.block();
        Node ifNode = IR.ifNode(IR.trueNode(), IR.block(), elseBlock);
        elseBlock.setParent(ifNode); // Manually set parent
        // The else block is conditionally executed.
        assertFalse(NodeUtil.isExecutedExactlyOnce(elseBlock));
    }

    /**
     * Test for isExecutedExactlyOnce with an expression in a WHILE condition.
     */
    @Test
    public void testIsExecutedExactlyOnce_whileCondition() throws Exception {
        Node cond = IR.number(1);
        Node whileNode = IR.loop(cond, IR.block()); // IR.loop creates WHILE
        cond.setParent(whileNode); // Manually set parent
        // While conditions are not executed exactly once.
        assertFalse(NodeUtil.isExecutedExactlyOnce(cond));
    }

    /**
     * Test for isExecutedExactlyOnce with an expression in a FOR condition.
     */
    @Test
    public void testIsExecutedExactlyOnce_forCondition() throws Exception {
        Node cond = IR.number(1);
        Node forNode = IR.forNode(IR.var(IR.name("i"), IR.number(0)), cond, IR.inc(IR.name("i")), IR.block());
        cond.setParent(forNode); // Manually set parent
        // For conditions are not executed exactly once.
        assertFalse(NodeUtil.isExecutedExactlyOnce(cond));
    }

    /**
     * Test for isExecutedExactlyOnce with an expression in a FOR-IN loop.
     */
    @Test
    public void testIsExecutedExactlyOnce_forIn() throws Exception {
        Node target = IR.name("key");
        Node iterator = IR.string("obj");
        Node body = IR.block();
        Node forInNode = IR.forIn(target, iterator, body);
        iterator.setParent(forInNode); // Manually set parent
        // For-in iterators are not executed exactly once.
        assertFalse(NodeUtil.isExecutedExactlyOnce(iterator));
    }

    /**
     * Test for isExecutedExactlyOnce with an expression in a TRY block.
     */
    @Test
    public void testIsExecutedExactlyOnce_tryBlock() throws Exception {
        Node tryBlock = IR.block();
        Node tryNode = IR.tryFinally(tryBlock, IR.block()); // No catch
        tryBlock.setParent(tryNode); // Manually set parent
        // Try block is conditionally executed.
        assertFalse(NodeUtil.isExecutedExactlyOnce(tryBlock));
    }

    /**
     * Test for isExecutedExactlyOnce with an expression in a CATCH block.
     */
    @Test
    public void testIsExecutedExactlyOnce_catchBlock() throws Exception {
        Node catchBlock = IR.block();
        Node catchNode = IR.catchNode(IR.name("e"), catchBlock);
        Node tryNode = IR.tryCatch(IR.block(), catchNode);
        catchBlock.setParent(catchNode); // Manually set parent
        // Catch block is conditionally executed.
        assertFalse(NodeUtil.isExecutedExactlyOnce(catchBlock));
    }

    /**
     * Test for isExecutedExactlyOnce with an expression in a FINALLY block.
     */
    @Test
    public void testIsExecutedExactlyOnce_finallyBlock() throws Exception {
        Node finallyBlock = IR.block();
        Node tryNode = IR.tryFinally(IR.block(), finallyBlock);
        finallyBlock.setParent(tryNode); // Manually set parent
        // Finally block is conditionally executed.
        assertFalse(NodeUtil.isExecutedExactlyOnce(finallyBlock));
    }

    /**
     * Test for isExecutedExactlyOnce with an expression in a CASE statement.
     */
    @Test
    public void testIsExecutedExactlyOnce_caseStatement() throws Exception {
        Node caseExpr = IR.number(1);
        Node caseNode = IR.caseNode(caseExpr, IR.block());
        caseExpr.setParent(caseNode); // Manually set parent
        // Case expressions are not executed exactly once.
        assertFalse(NodeUtil.isExecutedExactlyOnce(caseExpr));
    }

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
    @Test
    public void testNumberNode_regular() throws Exception {
        Node srcref = IR.name("source");
        Node node = NodeUtil.numberNode(123.45, srcref);
        assertEquals(Token.NUMBER, node.getType());
        assertEquals(123.45, node.getDouble(), 0.0001);
        // Check if the node has a source reference.
        assertTrue(node.hasChildren() || node.getProp(Node.SOURCEREF_PROP) != null);
    }

    /**
     * Test for numberNode with NaN.
     */
    @Test
    public void testNumberNode_nan() throws Exception {
        Node srcref = IR.name("source");
        Node node = NodeUtil.numberNode(Double.NaN, srcref);
        assertEquals(Token.NAME, node.getType());
        assertEquals("NaN", node.getString());
        assertTrue(Double.isNaN(node.getDouble()));
        assertTrue(node.hasChildren() || node.getProp(Node.SOURCEREF_PROP) != null);
    }

    /**
     * Test for numberNode with positive infinity.
     */
    @Test
    public void testNumberNode_positiveInfinity() throws Exception {
        Node srcref = IR.name("source");
        Node node = NodeUtil.numberNode(Double.POSITIVE_INFINITY, srcref);
        assertEquals(Token.NAME, node.getType());
        assertEquals("Infinity", node.getString());
        assertEquals(Double.POSITIVE_INFINITY, node.getDouble(), 0.0);
        assertTrue(node.hasChildren() || node.getProp(Node.SOURCEREF_PROP) != null);
    }

    /**
     * Test for numberNode with negative infinity.
     */
    @Test
    public void testNumberNode_negativeInfinity() throws Exception {
        Node srcref = IR.name("source");
        Node node = NodeUtil.numberNode(Double.NEGATIVE_INFINITY, srcref);
        assertEquals(Token.NEG, node.getType());
        assertEquals(Token.NAME, node.getFirstChild().getType());
        assertEquals("Infinity", node.getFirstChild().getString());
        assertEquals(Double.NEGATIVE_INFINITY, node.getDouble(), 0.0);
        assertTrue(node.hasChildren() || node.getProp(Node.SOURCEREF_PROP) != null);
    }

    /**
     * Test for numberNode with zero double value.
     */
    @Test
    public void testNumberNode_zeroDouble() throws Exception {
        Node srcref = IR.name("source");
        Node node = NodeUtil.numberNode(0.0, srcref);
        assertEquals(Token.NUMBER, node.getType());
        assertEquals(0.0, node.getDouble(), 0.0);
        assertTrue(node.hasChildren() || node.getProp(Node.SOURCEREF_PROP) != null);
    }

    /**
     * Test for numberNode with negative zero double value.
     */
    @Test
    public void testNumberNode_negativeZeroDouble() throws Exception {
        Node srcref = IR.name("source");
        Node node = NodeUtil.numberNode(-0.0, srcref);
        assertEquals(Token.NUMBER, node.getType());
        assertEquals(-0.0, node.getDouble(), 0.0);
        assertTrue(node.hasChildren() || node.getProp(Node.SOURCEREF_PROP) != null);
    }
}
```