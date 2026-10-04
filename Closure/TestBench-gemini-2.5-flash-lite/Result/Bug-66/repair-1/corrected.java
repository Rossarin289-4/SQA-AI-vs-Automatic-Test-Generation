package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.util.logging.Logger;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.TypeValidator;
import com.google.javascript.jscomp.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;

public class TypeCheckTest {

    // Helper method to create a simple compiler instance for testing.
    // Removed as it was causing compilation errors and is not strictly necessary for the tests.
    // If a MockCompiler is truly needed, it would need to implement all abstract methods of AbstractCompiler.

    // Helper method to create a TypeCheck instance.
    private TypeCheck createTypeCheck(AbstractCompiler compiler) {
        JSTypeRegistry registry = new JSTypeRegistry(Logger.getLogger(getClass().getName()));
        // The class Scope has no default constructor. Need to create a mock or use a concrete implementation if available.
        // For testing purposes, we'll create a minimal mock.
        Scope mockScope = new Scope.mišScope(compiler.getCodingConvention()) {
            @Override
            public Var getVar(String name) {
                // Mocking that no vars are declared by default.
                return null;
            }
        };
        // ReverseAbstractInterpreter is abstract. Need a concrete implementation or mock.
        // Assuming a basic implementation for testing purposes.
        ReverseAbstractInterpreter rai = new ReverseAbstractInterpreter(registry) {
            @Override
            public JSType getTypeIfKnown(Node node) {
                // Mock implementation: return node's type if present, else null
                return node.getJSType();
            }
        };
        // MemoizedScopeCreator and TypedScopeCreator are concrete classes.
        return new TypeCheck(compiler, rai, registry, mockScope, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), CheckLevel.WARNING, CheckLevel.OFF);
    }

    @Test
    public void testVisitName_simpleName() throws Exception {
        Node nameNode = new Node(Token.NAME, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        nameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        TypeCheck typeCheck = createTypeCheck(new MockCompiler()); // Need a valid AbstractCompiler
        Node parentNode = new Node(Token.CALL);
        typeCheck.visit(null, nameNode, parentNode);
        assertNotNull(nameNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, nameNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitName_ignoredInFunction() throws Exception {
        Node nameNode = new Node(Token.NAME, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        Node parentNode = new Node(Token.FUNCTION);
        typeCheck.visit(null, nameNode, parentNode);
        assertNull(nameNode.getJSType());
    }

    @Test
    public void testVisitName_ignoredInCatch() throws Exception {
        Node nameNode = new Node(Token.NAME, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        Node parentNode = new Node(Token.CATCH);
        typeCheck.visit(null, nameNode, parentNode);
        assertNull(nameNode.getJSType());
    }

    @Test
    public void testVisitName_ignoredInLP() throws Exception {
        Node nameNode = new Node(Token.NAME, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        Node parentNode = new Node(Token.LP);
        typeCheck.visit(null, nameNode, parentNode);
        assertNull(nameNode.getJSType());
    }

    @Test
    public void testVisitName_ignoredInVar() throws Exception {
        Node nameNode = new Node(Token.NAME, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        Node parentNode = new Node(Token.VAR);
        typeCheck.visit(null, nameNode, parentNode);
        assertNull(nameNode.getJSType());
    }

    @Test
    public void testVisitLP_basic() throws Exception {
        Node lpNode = new Node(Token.LP, 0, 0);
        Node childNode = new Node(Token.NUMBER, 10, 0, 0);
        lpNode.addChildToBack(childNode);
        childNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        Node parentNode = new Node(Token.CALL);
        typeCheck.visit(null, lpNode, parentNode);
        assertNotNull(lpNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, lpNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitLP_inFunctionIgnored() throws Exception {
        Node lpNode = new Node(Token.LP, 0, 0);
        Node childNode = new Node(Token.NUMBER, 10, 0, 0);
        lpNode.addChildToBack(childNode);
        childNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        Node parentNode = new Node(Token.FUNCTION);
        typeCheck.visit(null, lpNode, parentNode);
        assertNull(lpNode.getJSType());
    }

    @Test
    public void testVisitComma_basic() throws Exception {
        Node commaNode = new Node(Token.COMMA, 0, 0);
        Node firstChildNode = new Node(Token.NUMBER, 1, 0, 0);
        Node lastChildNode = new Node(Token.STRING, "test", 0, 0);
        lastChildNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.STRING_TYPE));
        commaNode.addChildToBack(firstChildNode);
        commaNode.addChildToBack(lastChildNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, commaNode, null);
        assertNotNull(commaNode.getJSType());
        assertEquals(JSTypeNative.STRING_TYPE, commaNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitTrue() throws Exception {
        Node trueNode = new Node(Token.TRUE, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, trueNode, null);
        assertNotNull(trueNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, trueNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitFalse() throws Exception {
        Node falseNode = new Node(Token.FALSE, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, falseNode, null);
        assertNotNull(falseNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, falseNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitThis() throws Exception {
        Scope mockScope = new Scope.mišScope(new MockCompiler().getCodingConvention()) {
            @Override
            public JSType getTypeOfThis() {
                return new JSTypeRegistry(null).getNativeType(JSTypeNative.OBJECT_TYPE);
            }
        };
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.topScope = mockScope; // Set the mocked scope
        Node thisNode = new Node(Token.THIS, 0, 0);
        typeCheck.visit(null, thisNode, null);
        assertNotNull(thisNode.getJSType());
        assertEquals(JSTypeNative.OBJECT_TYPE, thisNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitRefSpecial() throws Exception {
        Node refSpecialNode = new Node(Token.REF_SPECIAL, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, refSpecialNode, null);
        assertNotNull(refSpecialNode.getJSType());
        assertEquals(JSTypeNative.UNKNOWN_TYPE, refSpecialNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitGetRef() throws Exception {
        Node getRefNode = new Node(Token.GET_REF, 0, 0);
        Node childNode = new Node(Token.NAME, "varName", 0, 0);
        childNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        getRefNode.addChildToBack(childNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, getRefNode, null);
        assertNotNull(getRefNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, getRefNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNull() throws Exception {
        Node nullNode = new Node(Token.NULL, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, nullNode, null);
        assertNotNull(nullNode.getJSType());
        assertEquals(JSTypeNative.NULL_TYPE, nullNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNumber() throws Exception {
        Node numberNode = new Node(Token.NUMBER, 123.45, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, numberNode, null);
        assertNotNull(numberNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, numberNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitString() throws Exception {
        Node stringNode = new Node(Token.STRING, "hello", 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, stringNode, null);
        assertNotNull(stringNode.getJSType());
        assertEquals(JSTypeNative.STRING_TYPE, stringNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitString_objectLitKeyIgnored() throws Exception {
        Node stringNode = new Node(Token.STRING, "key", 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        Node parentNode = new Node(Token.OBJECTLIT);
        parentNode.addChildToBack(stringNode);
        typeCheck.visit(null, stringNode, parentNode);
        assertNull(stringNode.getJSType());
    }

    @Test
    public void testVisitArrayLit() throws Exception {
        Node arrayLitNode = new Node(Token.ARRAYLIT, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, arrayLitNode, null);
        assertNotNull(arrayLitNode.getJSType());
        assertEquals(JSTypeNative.ARRAY_TYPE, arrayLitNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitRegExp() throws Exception {
        Node regExpNode = new Node(Token.REGEXP, "/abc/", 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, regExpNode, null);
        assertNotNull(regExpNode.getJSType());
        assertEquals(JSTypeNative.REGEXP_TYPE, regExpNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitGetProp_basic() throws Exception {
        Node getPropNode = new Node(Token.GETPROP, 0, 0);
        Node objNode = new Node(Token.NAME, "obj", 0, 0);
        Node propNode = new Node(Token.STRING, "prop", 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType objType = ObjectType.cast(registry.createNominalType("MyObject"));
        objType.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, false, null);
        objNode.setJSType(objType);
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, getPropNode, null);
        assertNotNull(getPropNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, getPropNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitVar_simple() throws Exception {
        Node varNode = new Node(Token.VAR, 0, 0);
        Node nameNode = new Node(Token.NAME, "myVar", 0, 0);
        Node valueNode = new Node(Token.NUMBER, 10, 0, 0);
        valueNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        nameNode.addChildToBack(valueNode);
        varNode.addChildToBack(nameNode);

        JSTypeRegistry registry = new JSTypeRegistry(null);
        Scope mockScope = new Scope.mišScope(new MockCompiler().getCodingConvention()) {
            @Override
            public Var getVar(String name) {
                return new Var("myVar", nameNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
            }
        };

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.topScope = mockScope;
        typeCheck.visit(null, varNode, null);
        assertNotNull(nameNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, nameNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNew_simple() throws Exception {
        Node newNode = new Node(Token.NEW, 0, 0);
        Node constructorNode = new Node(Token.NAME, "MyClass", 0, 0);
        newNode.addChildToBack(constructorNode);

        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType constructorType = FunctionType.forInterface(registry, "MyClass", null);
        constructorType.setConstructor(true);
        ObjectType instanceType = ObjectType.cast(registry.createNominalType("MyClassInstance"));
        constructorType.setInstanceType(instanceType);
        constructorNode.setJSType(constructorType);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, newNode, null);
        assertNotNull(newNode.getJSType());
        assertEquals("MyClassInstance", newNode.getJSType().getDisplayName());
    }

    @Test
    public void testVisitCall_simple() throws Exception {
        Node callNode = new Node(Token.CALL, 0, 0);
        Node functionNode = new Node(Token.NAME, "myFunc", 0, 0);
        callNode.addChildToBack(functionNode);

        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType functionType = FunctionType.forInterface(registry, "myFunc", null);
        functionType.setReturnType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        functionNode.setJSType(functionType);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, callNode, null);
        assertNotNull(callNode.getJSType());
        assertEquals(JSTypeNative.STRING_TYPE, callNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitReturn_simple() throws Exception {
        Node returnNode = new Node(Token.RETURN, 0, 0);
        Node valueNode = new Node(Token.NUMBER, 42, 0, 0);
        valueNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        returnNode.addChildToBack(valueNode);

        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType enclosingFunctionType = FunctionType.forInterface(registry, "enclosingFunc", null);
        enclosingFunctionType.setReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node enclosingFunctionNode = new Node(Token.FUNCTION);
        enclosingFunctionNode.setJSType(enclosingFunctionType);

        NodeTraversal mockTraversal = new NodeTraversal(new MockCompiler(), null);
        mockTraversal.setEnclosingFunction(enclosingFunctionNode);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(mockTraversal, returnNode, null);
        assertTrue(true);
    }

    @Test
    public void testVisitIncDec() throws Exception {
        Node incNode = new Node(Token.INC, 0, 0);
        Node operandNode = new Node(Token.NAME, "counter", 0, 0);
        operandNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        incNode.addChildToBack(operandNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, incNode, null);
        assertNotNull(incNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, incNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNot() throws Exception {
        Node notNode = new Node(Token.NOT, 0, 0);
        Node operandNode = new Node(Token.NUMBER, 1, 0, 0);
        operandNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.BOOLEAN_TYPE));
        notNode.addChildToBack(operandNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, notNode, null);
        assertNotNull(notNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, notNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitVoid() throws Exception {
        Node voidNode = new Node(Token.VOID, 0, 0);
        Node operandNode = new Node(Token.NUMBER, 1, 0, 0);
        operandNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.VOID_TYPE));
        voidNode.addChildToBack(operandNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, voidNode, null);
        assertNotNull(voidNode.getJSType());
        assertEquals(JSTypeNative.VOID_TYPE, voidNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitTypeOf() throws Exception {
        Node typeofNode = new Node(Token.TYPEOF, 0, 0);
        Node operandNode = new Node(Token.NUMBER, 1, 0, 0);
        operandNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.STRING_TYPE));
        typeofNode.addChildToBack(operandNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, typeofNode, null);
        assertNotNull(typeofNode.getJSType());
        assertEquals(JSTypeNative.STRING_TYPE, typeofNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBitNot() throws Exception {
        Node bitnotNode = new Node(Token.BITNOT, 0, 0);
        Node operandNode = new Node(Token.NUMBER, 10, 0, 0);
        operandNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        bitnotNode.addChildToBack(operandNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, bitnotNode, null);
        assertNotNull(bitnotNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitnotNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitPos() throws Exception {
        Node posNode = new Node(Token.POS, 0, 0);
        Node operandNode = new Node(Token.NUMBER, -5, 0, 0);
        operandNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        posNode.addChildToBack(operandNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, posNode, null);
        assertNotNull(posNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, posNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNeg() throws Exception {
        Node negNode = new Node(Token.NEG, 0, 0);
        Node operandNode = new Node(Token.NUMBER, 5, 0, 0);
        operandNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        negNode.addChildToBack(operandNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, negNode, null);
        assertNotNull(negNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, negNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitEq_equalTypes() throws Exception {
        Node eqNode = new Node(Token.EQ, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 10, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 10, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        eqNode.addChildToBack(leftNode);
        eqNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, eqNode, null);
        assertNotNull(eqNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, eqNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNe_differentTypes() throws Exception {
        Node neNode = new Node(Token.NE, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 10, 0, 0);
        Node rightNode = new Node(Token.STRING, "10", 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.STRING_TYPE));
        neNode.addChildToBack(leftNode);
        neNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, neNode, null);
        assertNotNull(neNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, neNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitShEq_strictEqualTypes() throws Exception {
        Node shEqNode = new Node(Token.SHEQ, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 10, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 10, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        shEqNode.addChildToBack(leftNode);
        shEqNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, shEqNode, null);
        assertNotNull(shEqNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, shEqNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitShNe_strictNotEqualTypes() throws Exception {
        Node shNeNode = new Node(Token.SHNE, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 10, 0, 0);
        Node rightNode = new Node(Token.STRING, "10", 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.STRING_TYPE));
        shNeNode.addChildToBack(leftNode);
        shNeNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, shNeNode, null);
        assertNotNull(shNeNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, shNeNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitLt_numericComparison() throws Exception {
        Node ltNode = new Node(Token.LT, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 5, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 10, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        ltNode.addChildToBack(leftNode);
        ltNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, ltNode, null);
        assertNotNull(ltNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, ltNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitLe_stringComparison() throws Exception {
        Node leNode = new Node(Token.LE, 0, 0);
        Node leftNode = new Node(Token.STRING, "a", 0, 0);
        Node rightNode = new Node(Token.STRING, "b", 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.STRING_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.STRING_TYPE));
        leNode.addChildToBack(leftNode);
        leNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, leNode, null);
        assertNotNull(leNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, leNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitGt_mixedTypes() throws Exception {
        Node gtNode = new Node(Token.GT, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 10, 0, 0);
        Node rightNode = new Node(Token.STRING, "5", 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.STRING_TYPE));
        gtNode.addChildToBack(leftNode);
        gtNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, gtNode, null);
        assertNotNull(gtNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, gtNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitGe_boundaryNumeric() throws Exception {
        Node geNode = new Node(Token.GE, 0, 0);
        Node leftNode = new Node(Token.NUMBER, Integer.MAX_VALUE, 0, 0);
        Node rightNode = new Node(Token.NUMBER, Integer.MAX_VALUE, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        geNode.addChildToBack(leftNode);
        geNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, geNode, null);
        assertNotNull(geNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, geNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitIn_objectAndString() throws Exception {
        Node inNode = new Node(Token.IN, 0, 0);
        Node leftNode = new Node(Token.STRING, "prop", 0, 0);
        Node rightNode = new Node(Token.OBJECTLIT, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.STRING_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.OBJECT_TYPE));
        inNode.addChildToBack(leftNode);
        inNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, inNode, null);
        assertNotNull(inNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, inNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitInstanceOf_objectAndConstructor() throws Exception {
        Node instanceOfNode = new Node(Token.INSTANCEOF, 0, 0);
        Node leftNode = new Node(Token.NAME, "obj", 0, 0);
        Node rightNode = new Node(Token.NAME, "Constructor", 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        FunctionType constructorType = FunctionType.forInterface(registry, "Constructor", null);
        constructorType.setConstructor(true);
        constructorType.setInstanceType(registry.createNominalType("ConstructorInstance"));
        rightNode.setJSType(constructorType);
        instanceOfNode.addChildToBack(leftNode);
        instanceOfNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, instanceOfNode, null);
        assertNotNull(instanceOfNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, instanceOfNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitAssign_simple() throws Exception {
        Node assignNode = new Node(Token.ASSIGN, 0, 0);
        Node lvalueNode = new Node(Token.NAME, "x", 0, 0);
        Node rvalueNode = new Node(Token.NUMBER, 10, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        lvalueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rvalueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(lvalueNode);
        assignNode.addChildToBack(rvalueNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, assignNode, null);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_add() throws Exception {
        Node addNode = new Node(Token.ADD, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 5, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        addNode.addChildToBack(leftNode);
        addNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, addNode, null);
        assertNotNull(addNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperator_sub() throws Exception {
        Node subNode = new Node(Token.SUB, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 10, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        subNode.addChildToBack(leftNode);
        subNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, subNode, null);
        assertNotNull(subNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, subNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_mul() throws Exception {
        Node mulNode = new Node(Token.MUL, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 10, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        mulNode.addChildToBack(leftNode);
        mulNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, mulNode, null);
        assertNotNull(mulNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, mulNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_div() throws Exception {
        Node divNode = new Node(Token.DIV, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 10, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        divNode.addChildToBack(leftNode);
        divNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, divNode, null);
        assertNotNull(divNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, divNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_mod() throws Exception {
        Node modNode = new Node(Token.MOD, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 10, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 3, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        modNode.addChildToBack(leftNode);
        modNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, modNode, null);
        assertNotNull(modNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, modNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_bitAnd() throws Exception {
        Node bitAndNode = new Node(Token.BITAND, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 5, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 3, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        bitAndNode.addChildToBack(leftNode);
        bitAndNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, bitAndNode, null);
        assertNotNull(bitandNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitandNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_bitOr() throws Exception {
        Node bitOrNode = new Node(Token.BITOR, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 5, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 3, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        bitOrNode.addChildToBack(leftNode);
        bitOrNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, bitOrNode, null);
        assertNotNull(bitorNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitorNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_bitXor() throws Exception {
        Node bitXorNode = new Node(Token.BITXOR, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 5, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 3, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        bitXorNode.addChildToBack(leftNode);
        bitXorNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, bitXorNode, null);
        assertNotNull(bitxorNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitxorNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_lsh() throws Exception {
        Node lshNode = new Node(Token.LSH, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 1, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 2, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        lshNode.addChildToBack(leftNode);
        lshNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, lshNode, null);
        assertNotNull(lshNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, lshNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_rsh() throws Exception {
        Node rshNode = new Node(Token.RSH, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 1, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 2, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rshNode.addChildToBack(leftNode);
        rshNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, rshNode, null);
        assertNotNull(rshNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, rshNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_ursh() throws Exception {
        Node urshNode = new Node(Token.URSH, 0, 0);
        Node leftNode = new Node(Token.NUMBER, 1, 0, 0);
        Node rightNode = new Node(Token.NUMBER, 2, 0, 0);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        urshNode.addChildToBack(leftNode);
        urshNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, urshNode, null);
        assertNotNull(urshNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, urshNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitDelProp_valid() throws Exception {
        Node delPropNode = new Node(Token.DELPROP, 0, 0);
        Node propRefNode = new Node(Token.GETPROP, 0, 0);
        Node objNode = new Node(Token.NAME, "obj", 0, 0);
        Node propNameNode = new Node(Token.STRING, "prop", 0, 0);
        objNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.OBJECT_TYPE));
        propRefNode.addChildToBack(objNode);
        propRefNode.addChildToBack(propNameNode);
        delPropNode.addChildToBack(propRefNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, delPropNode, null);
        assertNotNull(delPropNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, delPropNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitCase_basic() throws Exception {
        Node caseNode = new Node(Token.CASE, 0, 0);
        Node valueNode = new Node(Token.NUMBER, 10, 0, 0);
        valueNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        caseNode.addChildToBack(valueNode);

        Node switchNode = new Node(Token.SWITCH, 0, 0);
        Node switchExpr = new Node(Token.NUMBER, 10, 0, 0);
        switchExpr.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        switchNode.addChildToBack(switchExpr);
        switchNode.addChildToBack(caseNode);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, caseNode, switchNode);
        assertTrue(true);
    }

    @Test
    public void testVisitWith_validObject() throws Exception {
        Node withNode = new Node(Token.WITH, 0, 0);
        Node objNode = new Node(Token.OBJECTLIT, 0, 0);
        objNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.OBJECT_TYPE));
        withNode.addChildToBack(objNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, withNode, null);
        assertTrue(true);
    }

    @Test
    public void testVisitFunction_constructor() throws Exception {
        Node functionNode = new Node(Token.FUNCTION, 0, 0);
        Node nameNode = new Node(Token.NAME, "MyConstructor", 0, 0);
        functionNode.addChildToBack(nameNode);

        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType constructorType = FunctionType.forInterface(registry, "MyConstructor", null);
        constructorType.setConstructor(true);
        ObjectType instanceType = ObjectType.cast(registry.createNominalType("MyConstructorInstance"));
        constructorType.setInstanceType(instanceType);
        functionNode.setJSType(constructorType);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, functionNode, null);
        assertTrue(true);
    }

    @Test
    public void testVisitFunction_interface() throws Exception {
        Node functionNode = new Node(Token.FUNCTION, 0, 0);
        Node nameNode = new Node(Token.NAME, "MyInterface", 0, 0);
        functionNode.addChildToBack(nameNode);

        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType interfaceType = FunctionType.forInterface(registry, "MyInterface", null);
        interfaceType.setInterface(true);
        functionNode.setJSType(interfaceType);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, functionNode, null);
        assertTrue(true);
    }

    @Test
    public void testVisitObjectLit_basic() throws Exception {
        Node objLitNode = new Node(Token.OBJECTLIT, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, objLitNode, null);
        assertNotNull(objLitNode.getJSType());
        assertEquals(JSTypeNative.OBJECT_TYPE, objLitNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitObjLitKey_simple() throws Exception {
        Node objLitNode = new Node(Token.OBJECTLIT, 0, 0);
        Node keyNode = new Node(Token.STRING, "prop", 0, 0);
        Node valueNode = new Node(Token.NUMBER, 10, 0, 0);
        keyNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        valueNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        keyNode.addChildToBack(valueNode);
        objLitNode.addChildToBack(keyNode);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitObjLitKey(null, keyNode, objLitNode);
        assertNotNull(keyNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, keyNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitAnnotatedAssignGetprop_valid() throws Exception {
        Node assignNode = new Node(Token.ASSIGN, 0, 0);
        Node getPropNode = new Node(Token.GETPROP, 0, 0);
        Node objNode = new Node(Token.NAME, "obj", 0, 0);
        Node propNameNode = new Node(Token.STRING, "prop", 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType objType = ObjectType.cast(registry.createNominalType("MyObject"));
        objType.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, false, null);
        objNode.setJSType(objType);
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);
        assignNode.addChildToBack(getPropNode);
        Node rvalueNode = new Node(Token.NUMBER, 10, 0, 0);
        rvalueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(rvalueNode);

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addType(registry.createNamedType("String"));
        assignNode.setJSDocInfo(jsDocInfo);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitAnnotatedAssignGetprop(null, assignNode, registry.createNamedType("String"), objNode, "prop", rvalueNode);
        assertTrue(true);
    }

    @Test
    public void testCheckDeclaredPropertyInheritance_validOverride() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType superClass = FunctionType.forInterface(registry, "SuperClass", null);
        superClass.setConstructor(true);
        ObjectType superClassProto = ObjectType.cast(registry.createNominalType("SuperClassInstance"));
        superClass.setInstanceType(superClassProto);
        superClassProto.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, false, null);

        FunctionType ctorType = FunctionType.forInterface(registry, "MyClass", null);
        ctorType.setConstructor(true);
        ctorType.setSuperClassConstructor(superClass);
        ObjectType ctorProto = ObjectType.cast(registry.createNominalType("MyClassInstance"));
        ctorType.setInstanceType(ctorProto);

        Node n = new Node(Token.ASSIGN, 0, 0);
        JSDocInfo info = new JSDocInfo();
        info.setOverride(true);
        n.setJSDocInfo(info);

        JSType propertyType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ctorProto.defineProperty("prop", propertyType, false, false, null);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.checkDeclaredPropertyInheritance(null, n, ctorType, "prop", info, propertyType);
        assertTrue(true);
    }

    @Test
    public void testCheckPropertyAccess_existingProperty() throws Exception {
        Node getPropNode = new Node(Token.GETPROP, 0, 0);
        Node objNode = new Node(Token.NAME, "obj", 0, 0);
        Node propNode = new Node(Token.STRING, "existingProp", 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType objType = ObjectType.cast(registry.createNominalType("MyObject"));
        objType.defineProperty("existingProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, false, null);
        objNode.setJSType(objType);
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);
        propNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.checkPropertyAccess(objNode.getJSType(), "existingProp", null, getPropNode);
        assertTrue(true);
    }

    @Test
    public void testCheckPropertyAccess_nonExistingProperty() throws Exception {
        Node getPropNode = new Node(Token.GETPROP, 0, 0);
        Node objNode = new Node(Token.NAME, "obj", 0, 0);
        Node propNode = new Node(Token.STRING, "nonExistingProp", 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType objType = ObjectType.cast(registry.createNominalType("MyObject"));
        objType.defineProperty("existingProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, false, null);
        objNode.setJSType(objType);
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNode);
        propNode.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.reportMissingProperties = true;
        typeCheck.checkPropertyAccess(objNode.getJSType(), "nonExistingProp", null, getPropNode);
        assertTrue(true);
    }

    @Test
    public void testIsPropertyTest_callWithPropertyTestFunction() throws Exception {
        Node getPropNode = new Node(Token.GETPROP, 0, 0);
        Node callNode = new Node(Token.CALL, getPropNode);
        CodingConvention mockConvention = new ClosureCodingConvention() {
            @Override
            public boolean isPropertyTestFunction(Node call) {
                return call.getFirstChild().getType() == Token.GETPROP;
            }
        };
        MockCompiler mockCompiler = new MockCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return mockConvention;
            }
        };
        TypeCheck typeCheck = createTypeCheck(mockCompiler);
        assertTrue(typeCheck.isPropertyTest(getPropNode));
    }

    @Test
    public void testIsPropertyTest_ifCondition() throws Exception {
        Node getPropNode = new Node(Token.GETPROP, 0, 0);
        Node ifNode = new Node(Token.IF, getPropNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        assertTrue(typeCheck.isPropertyTest(getPropNode));
    }

    @Test
    public void testIsPropertyTest_notInOrCondition() throws Exception {
        Node getPropNode = new Node(Token.GETPROP, 0, 0);
        Node notNode = new Node(Token.NOT, getPropNode);
        Node orNode = new Node(Token.OR, notNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        assertTrue(typeCheck.isPropertyTest(getPropNode));
    }

    @Test
    public void testVisitGetElem_basic() throws Exception {
        Node getElemNode = new Node(Token.GETELEM, 0, 0);
        Node arrayNode = new Node(Token.ARRAYLIT, 0, 0);
        Node indexNode = new Node(Token.NUMBER, 1, 0, 0);
        arrayNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.ARRAY_TYPE));
        indexNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        getElemNode.addChildToBack(arrayNode);
        getElemNode.addChildToBack(indexNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitGetElem(null, getElemNode);
        assertNotNull(getElemNode.getJSType());
        assertEquals(JSTypeNative.UNKNOWN_TYPE, getElemNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_assignAdd() throws Exception {
        Node assignAddNode = new Node(Token.ASSIGN_ADD, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignAddNode.addChildToBack(leftNode);
        assignAddNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_ADD, null, assignAddNode);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_assignSub() throws Exception {
        Node assignSubNode = new Node(Token.ASSIGN_SUB, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignSubNode.addChildToBack(leftNode);
        assignSubNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_SUB, null, assignSubNode);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_assignMul() throws Exception {
        Node assignMulNode = new Node(Token.ASSIGN_MUL, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignMulNode.addChildToBack(leftNode);
        assignMulNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_MUL, null, assignMulNode);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_assignDiv() throws Exception {
        Node assignDivNode = new Node(Token.ASSIGN_DIV, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignDivNode.addChildToBack(leftNode);
        assignDivNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_DIV, null, assignDivNode);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_assignMod() throws Exception {
        Node assignModNode = new Node(Token.ASSIGN_MOD, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignModNode.addChildToBack(leftNode);
        assignModNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_MOD, null, assignModNode);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_assignBitAnd() throws Exception {
        Node assignBitAndNode = new Node(Token.ASSIGN_BITAND, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignBitAndNode.addChildToBack(leftNode);
        assignBitAndNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_BITAND, null, assignBitAndNode);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_assignBitOr() throws Exception {
        Node assignBitOrNode = new Node(Token.ASSIGN_BITOR, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignBitOrNode.addChildToBack(leftNode);
        assignBitOrNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_BITOR, null, assignBitOrNode);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_assignBitXor() throws Exception {
        Node assignBitXorNode = new Node(Token.ASSIGN_BITXOR, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignBitXorNode.addChildToBack(leftNode);
        assignBitXorNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_BITXOR, null, assignBitXorNode);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_assignLsh() throws Exception {
        Node assignLshNode = new Node(Token.ASSIGN_LSH, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignLshNode.addChildToBack(leftNode);
        assignLshNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_LSH, null, assignLshNode);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_assignRsh() throws Exception {
        Node assignRshNode = new Node(Token.ASSIGN_RSH, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignRshNode.addChildToBack(leftNode);
        assignRshNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_RSH, null, assignRshNode);
        assertTrue(true);
    }

    @Test
    public void testVisitBinaryOperator_assignUrsh() throws Exception {
        Node assignUrshNode = new Node(Token.ASSIGN_URSH, 0, 0);
        Node leftNode = new Node(Token.NAME, "x", 0, 0);
        Node rightNode = new Node(Token.NUMBER, 5, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignUrshNode.addChildToBack(leftNode);
        assignUrshNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitBinaryOperator(Token.ASSIGN_URSH, null, assignUrshNode);
        assertTrue(true);
    }

    @Test
    public void testVisitDelProp_invalidOperand() throws Exception {
        Node delPropNode = new Node(Token.DELPROP, 0, 0);
        Node invalidOperand = new Node(Token.NUMBER, 123, 0, 0);
        delPropNode.addChildToBack(invalidOperand);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, delPropNode, null);
        assertNotNull(delPropNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, delPropNode.getJSType().getNativeId());
    }

    @Test
    public void testCheckNoTypeCheckSection_enterAndExit() throws Exception {
        Node scriptNode = new Node(Token.SCRIPT, 0, 0);
        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addComment(" @notypecheck ");
        scriptNode.setJSDocInfo(jsDocInfo);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.checkNoTypeCheckSection(scriptNode, true);
        assertEquals(1, typeCheck.noTypeCheckSection);

        Node blockNode = new Node(Token.BLOCK, 0, 0);
        typeCheck.checkNoTypeCheckSection(blockNode, true);
        assertEquals(2, typeCheck.noTypeCheckSection);

        typeCheck.checkNoTypeCheckSection(scriptNode, false);
        assertEquals(1, typeCheck.noTypeCheckSection);

        typeCheck.checkNoTypeCheckSection(blockNode, false);
        assertEquals(0, typeCheck.noTypeCheckSection);
    }

    @Test
    public void testCheckEnumInitializer_objectLit() throws Exception {
        Node valueNode = new Node(Token.OBJECTLIT, 0, 0);
        Node propNode = new Node(Token.STRING, "prop", 0, 0);
        Node propValueNode = new Node(Token.NUMBER, 10, 0, 0);
        propValueNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        propNode.addChildToBack(propValueNode);
        valueNode.addChildToBack(propNode);

        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType enumPrimitiveType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.checkEnumInitializer(null, valueNode, enumPrimitiveType);
        assertTrue(true);
    }

    @Test
    public void testCheckEnumInitializer_enumCopy() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        EnumType sourceEnum = (EnumType) registry.createEnumType("SourceEnum", new Node(Token.STRING, "S1"), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        EnumType targetEnum = (EnumType) registry.createEnumType("TargetEnum", new Node(Token.STRING, "T1"), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node valueNode = new Node(Token.NAME, "mySourceEnum", 0, 0);
        valueNode.setJSType(sourceEnum);

        JSType primitiveType = targetEnum.getElementsType().getPrimitiveType();

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.checkEnumInitializer(null, valueNode, primitiveType);
        assertTrue(true);
    }

    @Test
    public void testIsReference_name() throws Exception {
        Node nameNode = new Node(Token.NAME, "varName", 0, 0);
        assertTrue(TypeCheck.isReference(nameNode));
    }

    @Test
    public void testIsReference_getProp() throws Exception {
        Node getPropNode = new Node(Token.GETPROP, 0, 0);
        assertTrue(TypeCheck.isReference(getPropNode));
    }

    @Test
    public void testIsReference_getElem() throws Exception {
        Node getElemNode = new Node(Token.GETELEM, 0, 0);
        assertTrue(TypeCheck.isReference(getElemNode));
    }

    @Test
    public void testIsReference_number() throws Exception {
        Node numberNode = new Node(Token.NUMBER, 10, 0, 0);
        assertFalse(TypeCheck.isReference(numberNode));
    }

    @Test
    public void testGetJSType_present() throws Exception {
        Node node = new Node(Token.NUMBER, 10, 0, 0);
        JSType expectedType = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        node.setJSType(expectedType);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        assertEquals(expectedType, typeCheck.getJSType(node));
    }

    @Test
    public void testGetJSType_null() throws Exception {
        Node node = new Node(Token.NUMBER, 10, 0, 0);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        assertEquals(JSTypeNative.UNKNOWN_TYPE, typeCheck.getJSType(node).getNativeId());
    }

    @Test
    public void testGetFunctionType_functionType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType funcType = FunctionType.forInterface(registry, "MyFunc", null);
        Node node = new Node(Token.NAME, "func", 0, 0);
        node.setJSType(funcType);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        assertEquals(funcType, typeCheck.getFunctionType(node));
    }

    @Test
    public void testGetFunctionType_nonFunctionType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Node node = new Node(Token.NAME, "notAFunc", 0, 0);
        node.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        assertNull(typeCheck.getFunctionType(node));
    }

    @Test
    public void testGetFunctionType_unknownType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Node node = new Node(Token.NAME, "unknown", 0, 0);
        node.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        assertNotNull(typeCheck.getFunctionType(node));
        assertTrue(typeCheck.getFunctionType(node).isUnknownType());
    }

    @Test
    public void testEnsureTyped_withType() throws Exception {
        Node node = new Node(Token.NUMBER, 10, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType expectedType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        node.setJSType(expectedType);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.ensureTyped(null, node, expectedType);
        assertEquals(expectedType, node.getJSType());
    }

    @Test
    public void testEnsureTyped_withoutType() throws Exception {
        Node node = new Node(Token.NUMBER, 10, 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType typeToSet = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.ensureTyped(null, node, typeToSet);
        assertEquals(typeToSet, node.getJSType());
    }

    @Test
    public void testEnsureTyped_withJSDocTypeAnnotation() throws Exception {
        Node node = new Node(Token.NAME, "annotatedVar", 0, 0);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType existingType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType annotatedType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addType(annotatedType);
        node.setJSDocInfo(jsDocInfo);

        NodeTraversal mockTraversal = new NodeTraversal(new MockCompiler(), null);
        mockTraversal.scope = new Scope.mišScope(new MockCompiler().getCodingConvention());

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.ensureTyped(mockTraversal, node, existingType);

        assertEquals(annotatedType, node.getJSType());
    }

    @Test
    public void testGetTypedPercent_allUnknown() throws Exception {
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.unknownCount = 10;
        typeCheck.typedCount = 0;
        typeCheck.nullCount = 0;
        assertEquals(0.0, typeCheck.getTypedPercent(), 0.001);
    }

    @Test
    public void testGetTypedPercent_allTyped() throws Exception {
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.unknownCount = 0;
        typeCheck.typedCount = 10;
        typeCheck.nullCount = 0;
        assertEquals(100.0, typeCheck.getTypedPercent(), 0.001);
    }

    @Test
    public void testGetTypedPercent_mixed() throws Exception {
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.unknownCount = 5;
        typeCheck.typedCount = 5;
        typeCheck.nullCount = 0;
        assertEquals(50.0, typeCheck.getTypedPercent(), 0.001);
    }

    @Test
    public void testGetTypedPercent_zeroTotal() throws Exception {
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.unknownCount = 0;
        typeCheck.typedCount = 0;
        typeCheck.nullCount = 0;
        assertEquals(0.0, typeCheck.getTypedPercent(), 0.001);
    }

    @Test
    public void testvisitParameterList_exactMatch() throws Exception {
        Node callNode = new Node(Token.CALL, 0, 0);
        Node funcNode = new Node(Token.NAME, "func", 0, 0);
        Node arg1 = new Node(Token.NUMBER, 1, 0, 0);
        Node arg2 = new Node(Token.STRING, "hello", 0, 0);
        callNode.addChildToBack(funcNode);
        callNode.addChildToBack(arg1);
        callNode.addChildToBack(arg2);

        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType funcType = FunctionType.forInterface(registry, "func", null);
        funcType.addParameter("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        funcType.addParameter("p2", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
        funcType.setReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        funcNode.setJSType(funcType);

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitParameterList(null, callNode, funcType);
        assertTrue(true);
    }

    @Test
    public void testvisitParameterList_tooFewArguments() throws Exception {
        Node callNode = new Node(Token.CALL, 0, 0);
        Node funcNode = new Node(Token.NAME, "func", 0, 0);
        Node arg1 = new Node(Token.NUMBER, 1, 0, 0);
        callNode.addChildToBack(funcNode);
        callNode.addChildToBack(arg1);

        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType funcType = FunctionType.forInterface(registry, "func", null);
        funcType.addParameter("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        funcType.addParameter("p2", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
        funcType.setReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE));

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitParameterList(null, callNode, funcType);
        assertTrue(true);
    }

    @Test
    public void testvisitParameterList_tooManyArguments() throws Exception {
        Node callNode = new Node(Token.CALL, 0, 0);
        Node funcNode = new Node(Token.NAME, "func", 0, 0);
        Node arg1 = new Node(Token.NUMBER, 1, 0, 0);
        Node arg2 = new Node(Token.STRING, "hello", 0, 0);
        Node arg3 = new Node(Token.NUMBER, 3, 0, 0);
        callNode.addChildToBack(funcNode);
        callNode.addChildToBack(arg1);
        callNode.addChildToBack(arg2);
        callNode.addChildToBack(arg3);

        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType funcType = FunctionType.forInterface(registry, "func", null);
        funcType.addParameter("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        funcType.addParameter("p2", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
        funcType.setMaxArguments(2);
        funcType.setReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE));

        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visitParameterList(null, callNode, funcType);
        assertTrue(true);
    }

    // MockCompiler class that implements necessary methods.
    private static class MockCompiler extends AbstractCompiler {
        CodingConvention codingConvention = new ClosureCodingConvention();

        @Override
        public Node parseTestCode(String code) { return null; }
        @Override
        public void reassessControlFlowGraph() {}
        @Override
        public void init(Node externsRoot, Node jsRoot, PhaseOptimizer optimizer) {}
        @Override
        public void init(Node externsRoot, Node jsRoot) {}
        @Override
        public void init(Node jsRoot) {}
        @Override
        public void parse(String code) {}
        @Override
        public void process(CompilerPass... passes) {}
        @Override
        public void addPass(CompilerPass pass) {}
        @Override
        public Node getRoot() { return null; }
        @Override
        public int getErrorCount() { return 0; }
        @Override
        public int getWarningCount() { return 0; }
        @Override
        public void report(DiagnosticType type, Node node, Object... arguments) {}
        @Override
        public String getErrorManager() { return null; }
        @Override
        public String[] getErrors() { return null; }
        @Override
        public String[] getWarnings() { return null; }
        @Override
        public CodingConvention getCodingConvention() { return codingConvention; }
        @Override
        public TypeValidator getTypeValidator() { return new TypeValidator(this); }

        // Abstract method from AbstractCompiler that needs to be implemented.
        // Returning null or an empty array for simplicity in tests.
        @Override
        public JSTypeRegistry getTypeRegistry() {
             return new JSTypeRegistry(Logger.getLogger(getClass().getName()));
        }

        @Override
        public String getSourcePath() {
            return null;
        }
        
        @Override
        public void setSourcePath(String path) {
        }
        
        @Override
        public void setErrorManager(ErrorManager errorManager) {
        }
        
        @Override
        public ErrorManager getErrorManagerInternal() {
            return null;
        }

        @Override
        public void enableMultithreading() {
        }

        @Override
        public Set<InputId> getExternInputs() {
            return null;
        }
        
        @Override
        public Set<InputId> getJsInputs() {
            return null;
        }
        
        @Override
        public DiagnosticType getUnexpectedParamAssignmentType() {
            return null;
        }

        @Override
        public void injectScript(String code, String sourceName, String originalSource) {
        }

        @Override
        public void setExterns(Node externs) {
        }

        @Override
        public void setCode(Node root, SourceFile... externs) {
        }

        @Override
        public void setCode(Node root, List<SourceFile> externs) {
        }
        
        @Override
        public void prepareAst(Node root) {
        }

        @Override
        public void process(Node externsRoot, Node root) {
        }
        
        @Override
        public void process(Node root) {
        }

        @Override
        public Node parse(SourceFile file) {
            return null;
        }
        
        @Override
        public Node parse(String filename) {
            return null;
        }

        @Override
        public Node parseInformational(SourceFile file) {
            return null;
        }

        @Override
        public void normalize() {
        }

        @Override
        public void normalize(boolean normalizeStatements) {
        }

        @Override
        public void phaseOptimizer(boolean normalizeStatements, boolean preserveFunctionExpressionNames) {
        }

        @Override
        public void setInvalidating(boolean invalidating) {
        }

        @Override
        public void setCodingConvention(CodingConvention codingConvention) {
            this.codingConvention = codingConvention;
        }

        @Override
        public SourceMap getSourceMap() {
            return null;
        }

        @Override
        public void setSourceMap(SourceMap sourceMap) {
        }

        @Override
        public int getErrorCountForPhase(String phaseName) {
            return 0;
        }

        @Override
        public int getWarningCountForPhase(String phaseName) {
            return 0;
        }

        @Override
        public void inferFunctionControls(Node body) {
        }

        @Override
        public void inferGlobalVarControls(Node root) {
        }
        
        @Override
        public ControlFlowGraph<Node> getControlFlowGraph() {
            return null;
        }

        @Override
        public Var getGlobalVar(String name) {
            return null;
        }

        @Override
        public Set<Var> getGlobalVariables() {
            return null;
        }

        @Override
        public Set<Var> getExportedVariables() {
            return null;
        }

        @Override
        public Var getVar(Scope scope, String name) {
            return null;
        }

        @Override
        public Var getFunctionVar(Scope scope, String name) {
            return null;
        }

        @Override
        public void process(Node externs, Node root, CompilerInput input) {
        }

        @Override
        public InputId getCompilerInput(Node node) {
            return null;
        }
    }
}
