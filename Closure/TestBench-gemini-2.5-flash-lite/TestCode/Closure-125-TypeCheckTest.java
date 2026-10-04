package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.rhino.jstype.UnionType;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.io.Serializable;

public class TypeCheckTest {

    // --- Mock Objects ---




    

    

    
    
    


    // Helper to create TypeCheck instance with mocks

    // --- Test Cases ---











    @Test public void testVisitBinaryOperatorDivide() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node divNode = new MockNode(Token.DIV);
        Node leftNode = new MockNode(Token.NUMBER, 20.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        divNode.addChildToBack(leftNode);
        divNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, divNode, new MockNode(Token.BLOCK));

        assertNotNull(divNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), divNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorModulus() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node modNode = new MockNode(Token.MOD);
        Node leftNode = new MockNode(Token.NUMBER, 7.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 3.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        modNode.addChildToBack(leftNode);
        modNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, modNode, new MockNode(Token.BLOCK));

        assertNotNull(modNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), modNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorBitwiseAnd() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node bitAndNode = new MockNode(Token.BITAND);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 3.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitAndNode.addChildToBack(leftNode);
        bitAndNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, bitAndNode, new MockNode(Token.BLOCK));

        assertNotNull(bitAndNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitAndNode.getJSType());
    }
    
    @Test public void testVisitBinaryOperatorBitwiseOr() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node bitOrNode = new MockNode(Token.BITOR);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 3.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitOrNode.addChildToBack(leftNode);
        bitOrNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, bitOrNode, new MockNode(Token.BLOCK));

        assertNotNull(bitOrNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitOrNode.getJSType());
    }
    
    @Test public void testVisitBinaryOperatorBitwiseXor() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node bitXorNode = new MockNode(Token.BITXOR);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 3.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitXorNode.addChildToBack(leftNode);
        bitXorNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, bitXorNode, new MockNode(Token.BLOCK));

        assertNotNull(bitXorNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitXorNode.getJSType());
    }
    
    @Test public void testVisitBinaryOperatorLeftShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node lshNode = new MockNode(Token.LSH);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 2.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        lshNode.addChildToBack(leftNode);
        lshNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, lshNode, new MockNode(Token.BLOCK));

        assertNotNull(lshNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), lshNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorRightShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node rshNode = new MockNode(Token.RSH);
        Node leftNode = new MockNode(Token.NUMBER, 5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 1.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rshNode.addChildToBack(leftNode);
        rshNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, rshNode, new MockNode(Token.BLOCK));

        assertNotNull(rshNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), rshNode.getJSType());
    }

    @Test public void testVisitBinaryOperatorUnsignedRightShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node urshNode = new MockNode(Token.URSH);
        Node leftNode = new MockNode(Token.NUMBER, -5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 1.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        urshNode.addChildToBack(leftNode);
        urshNode.addChildToBack(rightNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, urshNode, new MockNode(Token.BLOCK));

        assertNotNull(urshNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), urshNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorAdd() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_ADD);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }

    @Test public void testVisitAssignOperatorSubtract() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_SUB);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }

    @Test public void testVisitAssignOperatorMultiply() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_MUL);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorDivide() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_DIV);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorModulus() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_MOD);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorBitwiseAnd() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_BITAND);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorLeftShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_LSH);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 2.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignOperatorRightShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_RSH);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 1.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }

    @Test public void testVisitAssignOperatorUnsignedRightShift() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN_URSH);
        Node leftNode = new MockNode(Token.NAME, "x");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 1.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("x", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("x", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitGetProp() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node getPropNode = new MockNode(Token.GETPROP);
        Node objNode = new MockNode(Token.OBJECTLIT);
        objNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node propNameNode = new MockNode(Token.STRING_KEY, "myProperty");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);
        
        ((MockObjectType)objNode.getJSType()).defineProperty("myProperty", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, propNameNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, getPropNode, new MockNode(Token.BLOCK));

        assertNotNull(getPropNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), getPropNode.getJSType());
    }

    @Test public void testVisitGetElem() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node getElemNode = new MockNode(Token.GETELEM);
        Node arrayNode = new MockNode(Token.ARRAYLIT);
        arrayNode.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));
        Node indexNode = new MockNode(Token.NUMBER, 0.0);
        indexNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        getElemNode.addChildToBack(arrayNode);
        getElemNode.addChildToBack(indexNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, getElemNode, new MockNode(Token.BLOCK));

        assertNotNull(getElemNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), getElemNode.getJSType());
    }

    @Test public void testVisitCast() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node castNode = new MockNode(Token.CAST);
        Node exprNode = new MockNode(Token.STRING, "hello");
        exprNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        castNode.addChildToBack(exprNode);
        castNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE)); 

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, castNode, new MockNode(Token.BLOCK));

        assertNotNull(exprNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), exprNode.getJSType());
        assertNotNull(castNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), castNode.getJSType());
    }

    @Test public void testVisitThis() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        
        JSType thisType = registry.getType("MyClass");
        Node scriptNode = new MockNode(Token.SCRIPT);
        Scope rootScope = new MockScope(scriptNode, thisType); 
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node thisNode = new MockNode(Token.THIS);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, thisNode, new MockNode(Token.BLOCK));

        assertNotNull(thisNode.getJSType());
        assertEquals(thisType, thisNode.getJSType());
    }

    @Test public void testVisitNumberLiteral() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node numberNode = new MockNode(Token.NUMBER, 123.45);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, numberNode, new MockNode(Token.BLOCK));

        assertNotNull(numberNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numberNode.getJSType());
    }

    @Test public void testVisitStringLiteral() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node stringNode = new MockNode(Token.STRING, "test");

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, stringNode, new MockNode(Token.BLOCK));

        assertNotNull(stringNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), stringNode.getJSType());
    }

    @Test public void testVisitBooleanLiteralTrue() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node trueNode = new MockNode(Token.TRUE);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, trueNode, new MockNode(Token.BLOCK));

        assertNotNull(trueNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), trueNode.getJSType());
    }

    @Test public void testVisitBooleanLiteralFalse() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node falseNode = new MockNode(Token.FALSE);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, falseNode, new MockNode(Token.BLOCK));

        assertNotNull(falseNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), falseNode.getJSType());
    }

    @Test public void testVisitNullLiteral() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node nullNode = new MockNode(Token.NULL);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, nullNode, new MockNode(Token.BLOCK));

        assertNotNull(nullNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), nullNode.getJSType());
    }

    @Test public void testVisitRegExpLiteral() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node regexpNode = new MockNode(Token.REGEXP);
        regexpNode.setJSType(registry.getNativeType(JSTypeNative.REGEXP_TYPE));

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, regexpNode, new MockNode(Token.BLOCK));

        assertNotNull(regexpNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.REGEXP_TYPE), regexpNode.getJSType());
    }

    @Test public void testVisitArrayLiteral() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node arrayNode = new MockNode(Token.ARRAYLIT);
        arrayNode.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, arrayNode, new MockNode(Token.BLOCK));

        assertNotNull(arrayNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrayNode.getJSType());
    }

    @Test public void testVisitCommaOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node commaNode = new MockNode(Token.COMMA);
        Node expr1 = new MockNode(Token.NUMBER, 1.0);
        expr1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node expr2 = new MockNode(Token.STRING, "two");
        expr2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        commaNode.addChildToBack(expr1);
        commaNode.addChildToBack(expr2);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, commaNode, new MockNode(Token.BLOCK));

        assertNotNull(commaNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), commaNode.getJSType());
    }
    
    @Test public void testVisitNotOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node notNode = new MockNode(Token.NOT);
        Node operandNode = new MockNode(Token.TRUE);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        notNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, notNode, new MockNode(Token.BLOCK));

        assertNotNull(notNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), notNode.getJSType());
    }
    
    @Test public void testVisitBitNotOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node bitNotNode = new MockNode(Token.BITNOT);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitNotNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, bitNotNode, new MockNode(Token.BLOCK));

        assertNotNull(bitNotNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitNotNode.getJSType());
    }

    @Test public void testVisitPosOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node posNode = new MockNode(Token.POS);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        posNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, posNode, new MockNode(Token.BLOCK));

        assertNotNull(posNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), posNode.getJSType());
    }
    
    @Test public void testVisitNegOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node negNode = new MockNode(Token.NEG);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        negNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, negNode, new MockNode(Token.BLOCK));

        assertNotNull(negNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), negNode.getJSType());
    }

    @Test public void testVisitVoidOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node voidNode = new MockNode(Token.VOID);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        voidNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, voidNode, new MockNode(Token.BLOCK));

        assertNotNull(voidNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), voidNode.getJSType());
    }

    @Test public void testVisitTypeOfOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node typeOfNode = new MockNode(Token.TYPEOF);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        typeOfNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, typeOfNode, new MockNode(Token.BLOCK));

        assertNotNull(typeOfNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeOfNode.getJSType());
    }

    @Test public void testVisitIncOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node incNode = new MockNode(Token.INC);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        incNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, incNode, new MockNode(Token.BLOCK));

        assertNotNull(incNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), incNode.getJSType());
    }

    @Test public void testVisitDecOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node decNode = new MockNode(Token.DEC);
        Node operandNode = new MockNode(Token.NUMBER, 5.0);
        operandNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        decNode.addChildToBack(operandNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, decNode, new MockNode(Token.BLOCK));

        assertNotNull(decNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), decNode.getJSType());
    }

    @Test public void testVisitDelPropOperator() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node delPropNode = new MockNode(Token.DELPROP);
        Node objNode = new MockNode(Token.OBJECTLIT);
        objNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node propNameNode = new MockNode(Token.STRING_KEY, "prop");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        delPropNode.addChildToBack(objNode);
        delPropNode.addChildToBack(propNameNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, delPropNode, new MockNode(Token.BLOCK));

        assertNotNull(delPropNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), delPropNode.getJSType());
    }
    
    @Test public void testProcessForTesting() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Node externsRoot = new MockNode(Token.SCRIPT);
        Node jsRoot = new MockNode(Token.SCRIPT);
        TypeCheck typeCheck = new TypeCheck(compiler, new MockReverseAbstractInterpreter(registry), registry);

        Scope resultScope = typeCheck.processForTesting(externsRoot, jsRoot);

        assertNotNull(resultScope);
        assertTrue(resultScope instanceof MockScope);
    }

    @Test public void testCheckExterns() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);
        
        Node externsNode = new MockNode(Token.SCRIPT);
        externsNode.setFromExterns(true);

        typeCheck.check(externsNode, true);
        assertTrue(true); 
    }

    @Test public void testCheckSourceCode() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);
        
        Node jsCodeNode = new MockNode(Token.SCRIPT);

        typeCheck.check(jsCodeNode, false);
        assertTrue(true);
    }
    
    @Test public void testShouldTraverseFunctionMaskingVariable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node functionNode = new MockNode(Token.FUNCTION);
        Node functionNameNode = new MockNode(Token.NAME, "myVar");
        functionNode.addChildToBack(functionNameNode);
        
        Node varNameNode = new MockNode(Token.NAME, "myVar");
        varNameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Var existingVar = new Var("myVar", varNameNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("myVar", existingVar);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        Node parent = new MockNode(Token.BLOCK);
        parent.addChildToBack(functionNode);

        boolean shouldTraverse = typeCheck.shouldTraverse(traversal, functionNode, parent);

        assertTrue(shouldTraverse);
    }

    @Test public void testVisitAssignPrototype() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node getPropNode = new MockNode(Token.GETPROP);
        Node constructorNode = new MockNode(Token.NAME, "MyClass");
        MockFunctionType constructorType = new MockFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE, registry);
        constructorType.isConstructor = true;
        constructorNode.setJSType(constructorType);

        Node prototypeNode = new MockNode(Token.STRING_KEY, "prototype");
        prototypeNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        getPropNode.addChildToBack(constructorNode);
        getPropNode.addChildToBack(prototypeNode);
        getPropNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));

        Node valueNode = new MockNode(Token.OBJECTLIT);
        valueNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(valueNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), assignNode.getJSType());
    }

    @Test public void testVisitTypeofString() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node eqNode = new MockNode(Token.EQ);
        Node typeofNode = new MockNode(Token.TYPEOF);
        Node exprNode = new MockNode(Token.STRING, "hello");
        exprNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        typeofNode.addChildToBack(exprNode);
        typeofNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node stringLiteralNode = new MockNode(Token.STRING, "string");
        stringLiteralNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        eqNode.addChildToBack(typeofNode);
        eqNode.addChildToBack(stringLiteralNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, eqNode, new MockNode(Token.BLOCK));

        assertNotNull(eqNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), eqNode.getJSType());
    }

    @Test public void testVisitEnumAlias() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node nameNodeLeft = new MockNode(Token.NAME, "enumVar1");
        nameNodeLeft.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));

        Node nameNodeRight = new MockNode(Token.NAME, "enumVar2");
        MockJSType enumType1 = new MockJSType(JSTypeNative.OBJECT_TYPE);
        enumType1.isEnum = true;
        nameNodeRight.setJSType(enumType1);

        assignNode.addChildToBack(nameNodeLeft);
        assignNode.addChildToBack(nameNodeRight);

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addEnumParameterType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        ((MockNode)nameNodeLeft).setJSDocInfo(jsDocInfo);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), assignNode.getJSType());
    }

    @Test public void testVisitParamListOfFunctionType() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node functionNode = new MockNode(Token.FUNCTION);
        Node paramList = new MockNode(Token.PARAM_LIST);
        Node param1 = new MockNode(Token.NAME, "arg1");
        param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node param2 = new MockNode(Token.NAME, "arg2");
        param2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        paramList.addChildToBack(param1);
        paramList.addChildToBack(param2);
        functionNode.addChildToBack(paramList);

        MockFunctionType funcType = new MockFunctionType(JSTypeNative.FUNCTION_TYPE, registry);
        funcType.params = new JSType[]{registry.getNativeType(JSTypeNative.NUMBER_TYPE), registry.getNativeType(JSTypeNative.STRING_TYPE)};
        functionNode.setJSType(funcType);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, functionNode, new MockNode(Token.BLOCK));

        assertNotNull(functionNode.getJSType());
    }
    
    @Test public void testVisitCallWithNoArguments() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node callNode = new MockNode(Token.CALL);
        Node functionNameNode = new MockNode(Token.NAME, "noArgsFunc");
        MockFunctionType funcType = new MockFunctionType(JSTypeNative.FUNCTION_TYPE, registry);
        funcType.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        functionNameNode.setJSType(funcType);
        callNode.addChildToBack(functionNameNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, callNode, new MockNode(Token.EXPR_RESULT));

        assertNotNull(callNode.getJSType());
        assertEquals(funcType.getReturnType(), callNode.getJSType());
    }

    @Test public void testVisitAssignToStructProperty() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node getPropNode = new MockNode(Token.GETPROP);
        Node structNode = new MockNode(Token.OBJECTLIT);
        MockObjectType structType = new MockObjectType(null, registry);
        structType.setStruct(true);
        structNode.setJSType(structType);
        
        Node propNameNode = new MockNode(Token.STRING_KEY, "myStructProp");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        getPropNode.addChildToBack(structNode);
        getPropNode.addChildToBack(propNameNode);
        
        structType.defineProperty("myStructProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, propNameNode);

        Node valueNode = new MockNode(Token.NUMBER, 123.0);
        valueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(valueNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testVisitAssignToNewPropertyOnStruct() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node getPropNode = new MockNode(Token.GETPROP);
        Node structNode = new MockNode(Token.OBJECTLIT);
        MockObjectType structType = new MockObjectType(null, registry);
        structType.setStruct(true);
        structNode.setJSType(structType);
        
        Node propNameNode = new MockNode(Token.STRING_KEY, "newStructProp");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        getPropNode.addChildToBack(structNode);
        getPropNode.addChildToBack(propNameNode);
        
        Node valueNode = new MockNode(Token.NUMBER, 123.0);
        valueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(valueNode);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
    
    @Test public void testProcessMethod() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node externsRoot = new MockNode(Token.SCRIPT);
        Node jsRoot = new MockNode(Token.SCRIPT);
        Node parentNode = new MockNode(Token.BLOCK);
        parentNode.addChildToBack(jsRoot);

        typeCheck.process(externsRoot, jsRoot);
        assertTrue(true);
    }

    @Test public void testShouldTraverseNonFunctionNode() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node node = new MockNode(Token.STRING, "some string");
        Node parent = new MockNode(Token.BLOCK);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);

        boolean result = typeCheck.shouldTraverse(traversal, node, parent);

        assertTrue(result);
    }

    @Test public void testVisitAssignQualifiedName() throws Exception {
        MockCompiler compiler = new MockCompiler();
        JSTypeRegistry registry = new MockJSTypeRegistry();
        MemoizedScopeCreator scopeCreator = new MockMemoizedScopeCreator(new MockTypedScopeCreator(compiler));
        Scope rootScope = new MockScope(new MockNode(Token.SCRIPT), null);
        TypeCheck typeCheck = createTypeCheck(compiler, registry, rootScope, scopeCreator);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node leftNode = new MockNode(Token.NAME, "myVar");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = new MockNode(Token.NUMBER, 42.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);

        Var var = new Var("myVar", leftNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        ((MockScope) rootScope).vars.put("myVar", var);

        NodeTraversal traversal = new MockNodeTraversal(compiler, rootScope);
        typeCheck.visit(traversal, assignNode, new MockNode(Token.BLOCK));

        assertNotNull(assignNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }
}





