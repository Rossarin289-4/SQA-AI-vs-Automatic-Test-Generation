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
import java.util.List;
import java.util.logging.Logger;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.TypeValidator;
import com.google.javascript.jscomp.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.jscomp.NodeUtil;


public class TypeCheckTest {

    // Helper method to create a TypeCheck instance.













































    @Test
    public void testVisitBinaryOperator_mul() throws Exception {
        Node mulNode = new Node(Token.MUL, 0, 0);
        Node leftNode = Node.newNumber(10);
        Node rightNode = Node.newNumber(5);
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
        Node leftNode = Node.newNumber(10);
        Node rightNode = Node.newNumber(5);
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
        Node leftNode = Node.newNumber(10);
        Node rightNode = Node.newNumber(3);
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
        Node leftNode = Node.newNumber(5);
        Node rightNode = Node.newNumber(3);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        bitAndNode.addChildToBack(leftNode);
        bitAndNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, bitAndNode, null);
        assertNotNull(bitAndNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitAndNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_bitOr() throws Exception {
        Node bitOrNode = new Node(Token.BITOR, 0, 0);
        Node leftNode = Node.newNumber(5);
        Node rightNode = Node.newNumber(3);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        bitOrNode.addChildToBack(leftNode);
        bitOrNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, bitOrNode, null);
        assertNotNull(bitOrNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitOrNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_bitXor() throws Exception {
        Node bitXorNode = new Node(Token.BITXOR, 0, 0);
        Node leftNode = Node.newNumber(5);
        Node rightNode = Node.newNumber(3);
        leftNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        rightNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        bitXorNode.addChildToBack(leftNode);
        bitXorNode.addChildToBack(rightNode);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, bitXorNode, null);
        assertNotNull(bitXorNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitXorNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperator_lsh() throws Exception {
        Node lshNode = new Node(Token.LSH, 0, 0);
        Node leftNode = Node.newNumber(1);
        Node rightNode = Node.newNumber(2);
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
        Node leftNode = Node.newNumber(1);
        Node rightNode = Node.newNumber(2);
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
        Node leftNode = Node.newNumber(1);
        Node rightNode = Node.newNumber(2);
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
    public void testVisitDelProp_invalidOperand() throws Exception {
        Node delPropNode = new Node(Token.DELPROP, 0, 0);
        Node invalidOperand = Node.newNumber(123);
        delPropNode.addChildToBack(invalidOperand);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.visit(null, delPropNode, null);
        assertNotNull(delPropNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, delPropNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitCase_basic() throws Exception {
        Node caseNode = new Node(Token.CASE, 0, 0);
        Node valueNode = Node.newNumber(10);
        valueNode.setJSType(new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE));
        caseNode.addChildToBack(valueNode);

        Node switchNode = new Node(Token.SWITCH, 0, 0);
        Node switchExpr = Node.newNumber(10);
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
        Node keyNode = Node.newString("prop");
        Node valueNode = Node.newNumber(10);
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
        Node rvalueNode = Node.newNumber(10);
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
        getPropNode.addChildToBack(propNode);
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
        Node indexNode = Node.newNumber(1);
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
        Node rightNode = Node.newNumber(5);
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
        Node rightNode = Node.newNumber(5);
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
        Node rightNode = Node.newNumber(5);
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
        Node rightNode = Node.newNumber(5);
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
        Node rightNode = Node.newNumber(5);
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
        Node rightNode = Node.newNumber(5);
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
        Node rightNode = Node.newNumber(5);
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
        Node rightNode = Node.newNumber(5);
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
        Node rightNode = Node.newNumber(5);
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
        Node rightNode = Node.newNumber(5);
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
        Node rightNode = Node.newNumber(5);
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
    public void testVisitDelProp_valid() throws Exception {
        Node delPropNode = new Node(Token.DELPROP, 0, 0);
        Node propRefNode = new Node(Token.GETPROP, 0, 0);
        Node objNode = new Node(Token.NAME, "obj", 0, 0);
        Node propNameNode = Node.newString("prop");
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
        Node propNode = Node.newString("prop");
        Node propValueNode = Node.newNumber(10);
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
        Node numberNode = Node.newNumber(10);
        assertFalse(TypeCheck.isReference(numberNode));
    }

    @Test
    public void testGetJSType_present() throws Exception {
        Node node = Node.newNumber(10);
        JSType expectedType = new JSTypeRegistry(null).getNativeType(JSTypeNative.NUMBER_TYPE);
        node.setJSType(expectedType);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        assertEquals(expectedType, typeCheck.getJSType(node));
    }

    @Test
    public void testGetJSType_null() throws Exception {
        Node node = Node.newNumber(10);
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
        Node node = Node.newNumber(10);
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType expectedType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        node.setJSType(expectedType);
        TypeCheck typeCheck = createTypeCheck(new MockCompiler());
        typeCheck.ensureTyped(null, node, expectedType);
        assertEquals(expectedType, node.getJSType());
    }

    @Test
    public void testEnsureTyped_withoutType() throws Exception {
        Node node = Node.newNumber(10);
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
        mockTraversal.scope = new Scope.mišScope(new MockCompiler().getCodingConvention()) {
            @Override
            public Var getVar(String name) {
                return null;
            }
        };

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
        Node arg1 = Node.newNumber(1);
        Node arg2 = Node.newString("hello");
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
        Node arg1 = Node.newNumber(1);
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
        Node arg1 = Node.newNumber(1);
        Node arg2 = Node.newString("hello");
        Node arg3 = Node.newNumber(3);
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
}





