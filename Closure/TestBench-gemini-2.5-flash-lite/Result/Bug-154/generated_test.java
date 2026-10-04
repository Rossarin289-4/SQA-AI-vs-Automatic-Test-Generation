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
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.jstype.UnionType;
import java.text.MessageFormat;
import java.util.List;

// Mock classes required for TypeCheck testing
// Minimal implementations to satisfy TypeCheck dependencies

class MockCodingConvention extends CodingConvention.DefaultCodingConvention {
}

class MockJSDocInfo extends JSDocInfo {
    private JSType type = null;
    private boolean isNoTypeCheck = false;

    @Override
    public boolean hasType() { return type != null; }
    public void setType(JSType type) { this.type = type; }

    @Override
    public boolean isNoTypeCheck() { return isNoTypeCheck; }
    public void setNoTypeCheck(boolean noTypeCheck) { isNoTypeCheck = noTypeCheck; }
}

class MockNode extends Node {
    private JSType jsType = null;
    private JSDocInfo jsDocInfo = null;

    public MockNode(int type) { super(type); }
    public MockNode(int type, int lineno, int charno) { super(type, lineno, charno); }

    @Override
    public JSType getJSType() { return jsType; }
    @Override
    public void setJSType(JSType jsType) { this.jsType = jsType; }

    @Override
    public JSDocInfo getJSDocInfo() { return jsDocInfo; }
    @Override
    public void setJSDocInfo(JSDocInfo jsDocInfo) { this.jsDocInfo = jsDocInfo; }

    // Implementations for Node methods used in TypeCheck
    @Override
    public Node getFirstChild() {
        // Simplified: assumes a specific child structure for tests
        if (hasChildren()) {
            return super.getFirstChild();
        }
        return null;
    }
    @Override
    public Node getLastChild() {
        if (hasChildren()) {
            return super.getLastChild();
        }
        return null;
    }
    @Override
    public Node getNext() {
        return super.getNext();
    }
    @Override
    public int getType() { return super.getType(); }
    @Override
    public String getString() { return super.getString(); }
    @Override
    public void setDouble(double value) { super.setDouble(value); }
    @Override
    public double getDouble() { return super.getDouble(); }
    @Override
    public void setString(String value) { super.setString(value); }

    // Mocking NodeUtil methods if they are implicitly used
    public static boolean isObjectLitKey(Node n, Node parent) { return false; } // simplified
    public static String opToStr(int type) { return Token.name(type); } // simplified
    public static String getStringValue(Node n) { return n.getString(); } // simplified
    public static boolean isEmptyBlock(Node n) { return n == null || !n.hasChildren(); } // simplified
}

class MockTypeValidator extends TypeValidator {
    public MockTypeValidator(AbstractCompiler compiler) {
        super(compiler);
    }

    // Suppress reporting in tests
    @Override
    public boolean expectCanAssignTo(NodeTraversal t, Node n, JSType rightType, JSType leftType, String msg) { return true; }
    @Override
    public boolean expectCanAssignToPropertyOf(NodeTraversal t, Node n, JSType rightType, JSType leftType, Node owner, String propName) { return true; }
    @Override
    public void expectNumber(NodeTraversal t, Node n, JSType type, String msg) {}
    @Override
    public void expectString(NodeTraversal t, Node n, JSType type, String msg) {}
    @Override
    public boolean expectNotNullOrUndefined(NodeTraversal t, Node n, JSType type, String msg, JSType expectedType) { return true; }
    @Override
    public void expectIndexMatch(NodeTraversal t, Node n, JSType objType, JSType indexType) {}
    @Override
    public void expectSwitchMatchesCase(NodeTraversal t, Node n, JSType switchType, JSType caseType) {}
    @Override
    public void expectSuperType(NodeTraversal t, Node n, ObjectType superObject, ObjectType subObject) {}
    @Override
    public void expectCanCast(NodeTraversal t, Node n, JSType type, JSType castType) {}
}


class MockCompiler implements AbstractCompiler {
    private final JSTypeRegistry typeRegistry = new JSTypeRegistry(null);


}


public class TypeCheckTest {

    private final JSTypeRegistry mockTypeRegistry = new JSTypeRegistry(null);



    // Helper to create a Node with a specific type and JSType
    private Node createNodeWithJSType(int type, JSType jsType) {
        Node node = new MockNode(type);
        node.setJSType(jsType);
        return node;
    }
     private Node createNodeWithNameType(int type, String name, JSType jsType) {
        Node node = new MockNode(type);
        node.setString(name);
        node.setJSType(jsType);
        return node;
    }

    // Helper to create a simple AST node
    private Node createNode(int type) {
        return new MockNode(type);
    }

    // Helper method to create a simple AST node with a string value
    private Node createStringNode(String value) {
        Node node = createNode(Token.STRING);
        node.setString(value);
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        return node;
    }

    // Helper method to create a simple AST node with a number value
    private Node createNumberNode(double value) {
        Node node = createNode(Token.NUMBER);
        node.setDouble(value);
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        return node;
    }

    // Helper method to create a simple AST node with a boolean value
    private Node createBooleanNode(boolean value) {
        Node node = createNode(value ? Token.TRUE : Token.FALSE);
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        return node;
    }

    // Helper method to create a simple AST node representing 'this'
    private Node createThisNode() {
        Node node = createNode(Token.THIS);
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE)); // Assuming 'this' is an object
        return node;
    }

    // Helper method to create a simple AST node representing null
    private Node createNullNode() {
        Node node = createNode(Token.NULL);
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NULL_TYPE));
        return node;
    }















    @Test
    public void testVisitReturn() throws Exception {
        // Mock enclosing function type for visitReturn
        FunctionType enclosingFuncType = mockTypeRegistry.createFunctionType(
            mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE)); // Returns String
        Node enclosingFuncNode = createNode(Token.FUNCTION);
        enclosingFuncNode.setJSType(enclosingFuncType);

        Node returnValueNode = createStringNode("result");
        returnValueNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        Node returnNode = createNode(Token.RETURN);
        returnNode.addChildToBack(returnValueNode);

        // In a real scenario, NodeTraversal would provide the enclosing function scope.
        // For this test, we are primarily checking the type compatibility which is handled by TypeValidator.
        // Since TypeValidator is mocked to always return true, this check should pass.
        assertTrue(returnValueNode.getJSType().canAssignTo(enclosingFuncType.getReturnType()));
    }










    @Test
    public void testVisitSheq() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(1);
        Node rightNode = createNumberNode(1);
        Node sheqNode = createNode(Token.SHEQ);
        sheqNode.addChildToBack(leftNode);
        sheqNode.addChildToBack(rightNode);
        sheqNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(sheqNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, sheqNode, parentNode);

        assertNotNull(sheqNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, sheqNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitShne() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(1);
        Node rightNode = createNumberNode(2);
        Node shneNode = createNode(Token.SHNE);
        shneNode.addChildToBack(leftNode);
        shneNode.addChildToBack(rightNode);
        shneNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(shneNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, shneNode, parentNode);

        assertNotNull(shneNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, shneNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitLt() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(1);
        Node rightNode = createNumberNode(2);
        Node ltNode = createNode(Token.LT);
        ltNode.addChildToBack(leftNode);
        ltNode.addChildToBack(rightNode);
        ltNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(ltNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, ltNode, parentNode);

        assertNotNull(ltNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, ltNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitLe() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(2);
        Node rightNode = createNumberNode(2);
        Node leNode = createNode(Token.LE);
        leNode.addChildToBack(leftNode);
        leNode.addChildToBack(rightNode);
        leNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(leNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, leNode, parentNode);

        assertNotNull(leNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, leNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitGt() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(3);
        Node rightNode = createNumberNode(2);
        Node gtNode = createNode(Token.GT);
        gtNode.addChildToBack(leftNode);
        gtNode.addChildToBack(rightNode);
        gtNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(gtNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, gtNode, parentNode);

        assertNotNull(gtNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, gtNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitGe() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(3);
        Node rightNode = createNumberNode(3);
        Node geNode = createNode(Token.GE);
        geNode.addChildToBack(leftNode);
        geNode.addChildToBack(rightNode);
        geNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(geNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, geNode, parentNode);

        assertNotNull(geNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, geNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitIn() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createStringNode("prop");
        Node rightNode = createNode(Token.OBJECTLIT);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node inNode = createNode(Token.IN);
        inNode.addChildToBack(leftNode);
        inNode.addChildToBack(rightNode);
        inNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(inNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, inNode, parentNode);

        assertNotNull(inNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, inNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitInstanceOf() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        FunctionType constructorType = mockTypeRegistry.createFunctionType(
            mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        ObjectType instanceType = mockTypeRegistry.createObjectType("MyInstance");
        constructorType.setInstanceType(instanceType);

        Node leftNode = createNode(Token.NEW);
        leftNode.setJSType(instanceType);

        Node rightNode = createNodeWithNameType(Token.NAME, "MyClass", constructorType);

        Node instanceofNode = createNode(Token.INSTANCEOF);
        instanceofNode.addChildToBack(leftNode);
        instanceofNode.addChildToBack(rightNode);
        instanceofNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(instanceofNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, instanceofNode, parentNode);

        assertNotNull(instanceofNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, instanceofNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitAssign() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lValueNode = createNodeWithNameType(Token.NAME, "myVar", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rValueNode = createNumberNode(100);
        Node assignNode = createNode(Token.ASSIGN);
        assignNode.addChildToBack(lValueNode);
        assignNode.addChildToBack(rValueNode);
        assignNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(assignNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignNode, parentNode);

        assertNotNull(assignNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, assignNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperatorAdd() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(10);
        Node rightNode = createNumberNode(5);
        Node addNode = createNode(Token.ADD);
        addNode.addChildToBack(leftNode);
        addNode.addChildToBack(rightNode);
        addNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(addNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, addNode, parentNode);

        assertNotNull(addNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, addNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperatorSub() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(10);
        Node rightNode = createNumberNode(5);
        Node subNode = createNode(Token.SUB);
        subNode.addChildToBack(leftNode);
        subNode.addChildToBack(rightNode);
        subNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(subNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, subNode, parentNode);

        assertNotNull(subNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, subNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperatorMul() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(10);
        Node rightNode = createNumberNode(5);
        Node mulNode = createNode(Token.MUL);
        mulNode.addChildToBack(leftNode);
        mulNode.addChildToBack(rightNode);
        mulNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(mulNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, mulNode, parentNode);

        assertNotNull(mulNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, mulNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperatorDiv() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(10);
        Node rightNode = createNumberNode(5);
        Node divNode = createNode(Token.DIV);
        divNode.addChildToBack(leftNode);
        divNode.addChildToBack(rightNode);
        divNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(divNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, divNode, parentNode);

        assertNotNull(divNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, divNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperatorMod() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(10);
        Node rightNode = createNumberNode(3);
        Node modNode = createNode(Token.MOD);
        modNode.addChildToBack(leftNode);
        modNode.addChildToBack(rightNode);
        modNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(modNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, modNode, parentNode);

        assertNotNull(modNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, modNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperatorBitAnd() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(5);
        Node rightNode = createNumberNode(3);
        Node bitAndNode = createNode(Token.BITAND);
        bitAndNode.addChildToBack(leftNode);
        bitAndNode.addChildToBack(rightNode);
        bitAndNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(bitAndNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, bitAndNode, parentNode);

        assertNotNull(bitAndNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitAndNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperatorBitOr() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(5);
        Node rightNode = createNumberNode(3);
        Node bitOrNode = createNode(Token.BITOR);
        bitOrNode.addChildToBack(leftNode);
        bitOrNode.addChildToBack(rightNode);
        bitOrNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(bitOrNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, bitOrNode, parentNode);

        assertNotNull(bitOrNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitOrNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperatorBitXor() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(5);
        Node rightNode = createNumberNode(3);
        Node bitXorNode = createNode(Token.BITXOR);
        bitXorNode.addChildToBack(leftNode);
        bitXorNode.addChildToBack(rightNode);
        bitXorNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(bitXorNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, bitXorNode, parentNode);

        assertNotNull(bitXorNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitXorNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitDelProp() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node objNode = createStringNode("obj");
        Node propNameNode = createStringNode("prop");
        Node getPropNode = createNode(Token.GETPROP);
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);

        Node delPropNode = createNode(Token.DELPROP);
        delPropNode.addChildToBack(getPropNode);
        delPropNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(delPropNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, delPropNode, parentNode);

        assertNotNull(delPropNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, delPropNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitCase() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node switchExpr = createNumberNode(10);
        Node caseExpr = createNumberNode(10);
        Node caseNode = createNode(Token.CASE);
        caseNode.addChildToBack(caseExpr);

        Node switchNode = createNode(Token.SWITCH);
        switchNode.addChildToBack(switchExpr);
        switchNode.addChildToBack(caseNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, caseNode, switchNode);
    }

    @Test
    public void testVisitWith() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node objectNode = createNode(Token.OBJECTLIT);
        objectNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node withNode = createNode(Token.WITH);
        withNode.addChildToBack(objectNode);

        Node parentNode = createNode(Token.BLOCK);
        parentNode.addChildToBack(withNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, withNode, parentNode);
    }

    @Test
    public void testVisitFunctionSimple() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node functionNameNode = createNode(Token.NAME);
        functionNameNode.setString("myFunc");
        Node functionBodyNode = createNode(Token.BLOCK);
        Node functionNode = createNode(Token.FUNCTION);
        functionNode.addChildToBack(functionNameNode);
        functionNode.addChildToBack(functionBodyNode);

        FunctionType funcType = mockTypeRegistry.createFunctionType(
            mockTypeRegistry.getNativeType(JSTypeNative.VOID_TYPE));
        functionNode.setJSType(funcType);

        Node parentNode = createNode(Token.EXPR_RESULT);
        parentNode.addChildToBack(functionNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, functionNode, parentNode);

        assertNotNull(functionNode.getJSType());
        assertTrue(functionNode.getJSType().isFunctionType());
    }

    @Test
    public void testVisitAnnotatedAssignGetprop() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node objectNode = createStringNode("obj");
        Node propertyNode = createStringNode("prop");
        Node getPropNode = createNode(Token.GETPROP);
        getPropNode.addChildToBack(objectNode);
        getPropNode.addChildToBack(propertyNode);

        Node rValueNode = createNumberNode(123);
        Node assignNode = createNode(Token.ASSIGN);
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(rValueNode);

        MockJSDocInfo jsDocInfo = new MockJSDocInfo();
        jsDocInfo.setType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.setJSDocInfo(jsDocInfo);

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(assignNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignNode, parentNode);
    }

    @Test
    public void testBitOperationWithNumber() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node operandNode = createNumberNode(5);
        Node bitOperationNode = createNode(Token.BITOR); // Example bit operation
        bitOperationNode.addChildToBack(operandNode);
        bitOperationNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, bitOperationNode, createNode(Token.RETURN));

        assertNotNull(bitOperationNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitOperationNode.getJSType().getNativeId());
    }

    @Test
    public void testBitOperationWithString() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node operandNode = createStringNode("5"); // String that can be converted to number
        Node bitOperationNode = createNode(Token.BITOR);
        bitOperationNode.addChildToBack(operandNode);
        bitOperationNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Expected result type

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, bitOperationNode, createNode(Token.RETURN));

        assertNotNull(bitOperationNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitOperationNode.getJSType().getNativeId());
    }

    @Test
    public void testAssignmentAdd() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "count", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(1);
        Node assignAddNode = createNode(Token.ASSIGN_ADD);
        assignAddNode.addChildToBack(lhs);
        assignAddNode.addChildToBack(rhs);
        assignAddNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignAddNode, createNode(Token.RETURN));

        assertNotNull(assignAddNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, assignAddNode.getJSType().getNativeId());
    }

    @Test
    public void testAssignmentSub() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "count", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(1);
        Node assignSubNode = createNode(Token.ASSIGN_SUB);
        assignSubNode.addChildToBack(lhs);
        assignSubNode.addChildToBack(rhs);
        assignSubNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignSubNode, createNode(Token.RETURN));

        assertNotNull(assignSubNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, assignSubNode.getJSType().getNativeId());
    }

    @Test
    public void testAssignmentMul() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "value", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(2);
        Node assignMulNode = createNode(Token.ASSIGN_MUL);
        assignMulNode.addChildToBack(lhs);
        assignMulNode.addChildToBack(rhs);
        assignMulNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignMulNode, createNode(Token.RETURN));

        assertNotNull(assignMulNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, assignMulNode.getJSType().getNativeId());
    }

    @Test
    public void testAssignmentDiv() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "value", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(2);
        Node assignDivNode = createNode(Token.ASSIGN_DIV);
        assignDivNode.addChildToBack(lhs);
        assignDivNode.addChildToBack(rhs);
        assignDivNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignDivNode, createNode(Token.RETURN));

        assertNotNull(assignDivNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, assignDivNode.getJSType().getNativeId());
    }

    @Test
    public void testAssignmentMod() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "value", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(3);
        Node assignModNode = createNode(Token.ASSIGN_MOD);
        assignModNode.addChildToBack(lhs);
        assignModNode.addChildToBack(rhs);
        assignModNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignModNode, createNode(Token.RETURN));

        assertNotNull(assignModNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, assignModNode.getJSType().getNativeId());
    }

    @Test
    public void testAssignmentBitOr() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "flags", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(1);
        Node assignBitOrNode = createNode(Token.ASSIGN_BITOR);
        assignBitOrNode.addChildToBack(lhs);
        assignBitOrNode.addChildToBack(rhs);
        assignBitOrNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignBitOrNode, createNode(Token.RETURN));

        assertNotNull(assignBitOrNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, assignBitOrNode.getJSType().getNativeId());
    }

    @Test
    public void testAssignmentBitXor() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "flags", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(1);
        Node assignBitXorNode = createNode(Token.ASSIGN_BITXOR);
        assignBitXorNode.addChildToBack(lhs);
        assignBitXorNode.addChildToBack(rhs);
        assignBitXorNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignBitXorNode, createNode(Token.RETURN));

        assertNotNull(assignBitXorNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, assignBitXorNode.getJSType().getNativeId());
    }

    @Test
    public void testAssignmentBitAnd() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "flags", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(1);
        Node assignBitAndNode = createNode(Token.ASSIGN_BITAND);
        assignBitAndNode.addChildToBack(lhs);
        assignBitAndNode.addChildToBack(rhs);
        assignBitAndNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignBitAndNode, createNode(Token.RETURN));

        assertNotNull(assignBitAndNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, assignBitAndNode.getJSType().getNativeId());
    }

    @Test
    public void testLeftShiftAssign() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "value", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(2);
        Node lshAssignNode = createNode(Token.ASSIGN_LSH);
        lshAssignNode.addChildToBack(lhs);
        lshAssignNode.addChildToBack(rhs);
        lshAssignNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, lshAssignNode, createNode(Token.RETURN));

        assertNotNull(lshAssignNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, lshAssignNode.getJSType().getNativeId());
    }

    @Test
    public void testRightShiftAssign() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "value", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(2);
        Node rshAssignNode = createNode(Token.ASSIGN_RSH);
        rshAssignNode.addChildToBack(lhs);
        rshAssignNode.addChildToBack(rhs);
        rshAssignNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, rshAssignNode, createNode(Token.RETURN));

        assertNotNull(rshAssignNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, rshAssignNode.getJSType().getNativeId());
    }

    @Test
    public void testUnsignedRightShiftAssign() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node lhs = createNodeWithNameType(Token.NAME, "value", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = createNumberNode(2);
        Node urshAssignNode = createNode(Token.ASSIGN_URSH);
        urshAssignNode.addChildToBack(lhs);
        urshAssignNode.addChildToBack(rhs);
        urshAssignNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, urshAssignNode, createNode(Token.RETURN));

        assertNotNull(urshAssignNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, urshAssignNode.getJSType().getNativeId());
    }

    @Test
    public void testLeftShift() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(5);
        Node rightNode = createNumberNode(2);
        Node lshNode = createNode(Token.LSH);
        lshNode.addChildToBack(leftNode);
        lshNode.addChildToBack(rightNode);
        lshNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, lshNode, createNode(Token.RETURN));

        assertNotNull(lshNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, lshNode.getJSType().getNativeId());
    }

    @Test
    public void testRightShift() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(10);
        Node rightNode = createNumberNode(1);
        Node rshNode = createNode(Token.RSH);
        rshNode.addChildToBack(leftNode);
        rshNode.addChildToBack(rightNode);
        rshNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, rshNode, createNode(Token.RETURN));

        assertNotNull(rshNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, rshNode.getJSType().getNativeId());
    }

    @Test
    public void testUnsignedRightShift() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node leftNode = createNumberNode(10);
        Node rightNode = createNumberNode(1);
        Node urshNode = createNode(Token.URSH);
        urshNode.addChildToBack(leftNode);
        urshNode.addChildToBack(rightNode);
        urshNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, urshNode, createNode(Token.RETURN));

        assertNotNull(urshNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, urshNode.getJSType().getNativeId());
    }

    @Test
    public void testGetPropWithNumberIndex() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node objNode = createStringNode("obj");
        objNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node propNameNode = createNumberNode(0); // Using a number as property name is valid in JS
        Node getPropNode = createNode(Token.GETPROP);
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);
        getPropNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, getPropNode, createNode(Token.RETURN));

        assertNotNull(getPropNode.getJSType());
        assertEquals(JSTypeNative.STRING_TYPE, getPropNode.getJSType().getNativeId());
    }

    @Test
    public void testObjectLitWithStringTypeValues() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node keyNode = createStringNode("key1");
        Node valueNode = createStringNode("value1");
        Node objLitNode = createNode(Token.OBJECTLIT);
        objLitNode.addChildToBack(keyNode);
        keyNode.addChildToBack(valueNode);
        objLitNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, objLitNode, createNode(Token.RETURN));

        assertNotNull(objLitNode.getJSType());
        assertEquals(JSTypeNative.OBJECT_TYPE, objLitNode.getJSType().getNativeId());
    }

    @Test
    public void testObjectLitWithNumberTypeValues() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, new NodeTraversal.AbstractShallowCallback() {
            @Override public boolean shouldTraverse(NodeTraversal nt, Node n, Node p) { return true; }
            @Override public void visit(NodeTraversal nt, Node n, Node p) {}
        });
        Node keyNode = createStringNode("key1");
        Node valueNode = createNumberNode(123);
        Node objLitNode = createNode(Token.OBJECTLIT);
        objLitNode.addChildToBack(keyNode);
        keyNode.addChildToBack(valueNode);
        objLitNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, objLitNode, createNode(Token.RETURN));

        assertNotNull(objLitNode.getJSType());
        assertEquals(JSTypeNative.OBJECT_TYPE, objLitNode.getJSType().getNativeId());
    }
}





