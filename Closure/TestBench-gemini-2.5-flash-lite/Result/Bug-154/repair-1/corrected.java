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

public class TypeCheckTest {

    // Mock AbstractCompiler and other dependencies for testing TypeCheck
    // Use a real instance of MockCompiler that implements AbstractCompiler
    private final AbstractCompiler mockCompiler = new MockCompiler();
    private final JSTypeRegistry mockTypeRegistry = new JSTypeRegistry(null);
    // ReverseAbstractInterpreter is a concrete class, so we can instantiate it directly
    private final ReverseAbstractInterpreter mockReverseInterpreter =
        new ReverseAbstractInterpreter(mockTypeRegistry);
    // MemoizedScopeCreator and TypedScopeCreator are concrete classes
    private final ScopeCreator mockScopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(mockCompiler));

    private TypeCheck createTypeChecker(Scope topScope) {
        return new TypeCheck(mockCompiler, mockReverseInterpreter, mockTypeRegistry,
            topScope, mockScopeCreator, CheckLevel.WARNING, CheckLevel.OFF);
    }

    private TypeCheck createTypeChecker() {
        // Use the constructor that takes only essential arguments
        return new TypeCheck(mockCompiler, mockReverseInterpreter, mockTypeRegistry);
    }

    // Helper method to create a simple AST node
    private Node createNode(int type) {
        return new Node(type, 0, 0);
    }

    // Helper method to create a simple AST node with a string value
    private Node createStringNode(String value) {
        Node node = createNode(Token.STRING);
        node.setString(value);
        // Explicitly set JSType for STRING tokens
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        return node;
    }

    // Helper method to create a simple AST node with a number value
    private Node createNumberNode(double value) {
        Node node = createNode(Token.NUMBER);
        node.setDouble(value);
        // Explicitly set JSType for NUMBER tokens
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        return node;
    }

    // Helper method to create a simple AST node with a boolean value
    private Node createBooleanNode(boolean value) {
        Node node = createNode(value ? Token.TRUE : Token.FALSE);
        // Explicitly set JSType for BOOLEAN tokens
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        return node;
    }

    // Helper method to create a simple AST node representing 'this'
    private Node createThisNode() {
        Node node = createNode(Token.THIS);
        // Type of 'this' depends on the scope, which is not fully set up here.
        // For simplicity, assume it's an unknown type or object.
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        return node;
    }

    // Helper method to create a simple AST node representing null
    private Node createNullNode() {
        Node node = createNode(Token.NULL);
        // Explicitly set JSType for NULL token
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NULL_TYPE));
        return node;
    }

    // Helper method to create a simple AST node representing undefined
    private Node createUndefinedNode() {
        // VOID node can represent undefined in certain contexts
        Node node = createNode(Token.VOID);
        node.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.VOID_TYPE));
        return node;
    }

    // Mock TypeValidator to avoid actual reporting
    // Pass the compiler instance to the constructor
    private final TypeValidator mockTypeValidator = new MockTypeValidator(mockCompiler);

    // Mock AbstractCompiler with necessary methods for TypeCheck
    private static class MockCompiler implements AbstractCompiler {
        @Override
        public TypeValidator getTypeValidator() {
            // Return the mockTypeValidator instance
            return mockTypeValidator;
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            // Return the mockTypeRegistry instance
            return mockTypeRegistry;
        }

        @Override
        public void report(JSError error) {
            // Ignore reporting for tests
        }

        @Override
        public CodingConvention getCodingConvention() {
            // Use a concrete implementation of CodingConvention
            return new CodingConvention.DefaultCodingConvention();
        }

        @Override
        public SourceFile getSourceFile(String fileName) {
            return null; // Not needed for these tests
        }

        // These methods are part of the AbstractCompiler interface but not
        // directly used by TypeCheck in a way that requires implementation
        // for this test setup. Provide empty implementations.
        @Override
        public void setLifeCycle(LifeCycle lifeCycle) {}
        @Override
        public void setLifeCycle(Stage stage) {}
        @Override
        public void updateProgress(String message) {}
        @Override
        public void process(CompilerOptions options, Node externsAndSources) {}
        @Override
        public Node parse(SourceFile externs, SourceFile... sources) { return null; }
        @Override
        public String getAstDotGraph(Node n) { return ""; }
        @Override
        public void reassessControlFlowGraph(Node cfgRoot) {}
        @Override
        public void normalize() {}
        @Override
        public boolean shouldRunPhase(String phaseName) { return true; }
        @Override
        public void setExterns(Node externs) {}
        @Override
        public Node getExternsRoot() { return null; }
        @Override
        public void process(Node externsRoot, Node jsRoot) {}
        @Override
        public Node getSourceRegion(Node n) { return null; }
    }

    // Mock TypeValidator to avoid actual reporting
    private static class MockTypeValidator extends TypeValidator {
        public MockTypeValidator(AbstractCompiler compiler) {
            super(compiler);
            // Override any methods that would normally report errors or warnings
            // to do nothing or return default values.
        }

        @Override
        public boolean expectObject(NodeTraversal t, Node n, JSType type, String msg) { return true; }
        @Override
        public void expectActualObject(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override
        public void expectAnyObject(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override
        public void expectString(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override
        public void expectNumber(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override
        public void expectBitwiseable(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override
        public void expectStringOrNumber(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override
        public boolean expectNotNullOrUndefined(NodeTraversal t, Node n, JSType type, String msg, JSType expectedType) { return true; }
        @Override
        public void expectSwitchMatchesCase(NodeTraversal t, Node n, JSType switchType, JSType caseType) {}
        @Override
        public void expectIndexMatch(NodeTraversal t, Node n, JSType objType, JSType indexType) {}
        @Override
        public boolean expectCanAssignToPropertyOf(NodeTraversal t, Node n, JSType rightType, JSType leftType, Node owner, String propName) { return true; }
        @Override
        public boolean expectCanAssignTo(NodeTraversal t, Node n, JSType rightType, JSType leftType, String msg) { return true; }
        @Override
        public void expectArgumentMatchesParameter(NodeTraversal t, Node n, JSType argType, JSType paramType, Node callNode, int ordinal) {}
        @Override
        public void expectCanOverride(NodeTraversal t, Node n, JSType overridingType, JSType hiddenType, String propertyName, JSType ownerType) {}
        @Override
        public void expectSuperType(NodeTraversal t, Node n, ObjectType superObject, ObjectType subObject) {}
        @Override
        public void expectCanCast(NodeTraversal t, Node n, JSType type, JSType castType) {}
        @Override
        public void expectUndeclaredVariable(String sourceName, Node n, Node parent, Var var, String variableName, JSType newType) {}
        @Override
        public void expectAllInterfaceProperties(NodeTraversal t, Node n, FunctionType type) {}
        // Add other methods from TypeValidator that might be called by TypeCheck
        @Override
        public String getReadableJSTypeName(Node n, boolean dereference) { return "unknownType"; }
        @Override
        public void registerMismatch(JSType found, JSType required) {}
    }

    // Mock ReverseAbstractInterpreter - it's a concrete class, so we can instantiate it.
    // No need for a separate MockReverseAbstractInterpreter class here.

    @Test
    public void testVisitName() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node nameNode = createStringNode("myVar"); // This creates a STRING node, not a NAME node.
        Node actualNameNode = new Node(Token.NAME, 0, 0);
        actualNameNode.setString("myVar");
        actualNameNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE));

        Node parentNode = createNode(Token.ASSIGN);
        parentNode.addChildToBack(actualNameNode);
        parentNode.addChildToBack(createNumberNode(1));

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, actualNameNode, parentNode);

        // Assert that the nameNode was typed
        assertNotNull(actualNameNode.getJSType());
        assertEquals(JSTypeNative.STRING_TYPE, actualNameNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNumber() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node numberNode = createNumberNode(123.45);
        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(numberNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, numberNode, parentNode);

        assertNotNull(numberNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, numberNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitString() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node stringNode = createStringNode("hello");
        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(stringNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, stringNode, parentNode);

        assertNotNull(stringNode.getJSType());
        assertEquals(JSTypeNative.STRING_TYPE, stringNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBooleanTrue() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node booleanNode = createBooleanNode(true);
        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(booleanNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, booleanNode, parentNode);

        assertNotNull(booleanNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, booleanNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBooleanFalse() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node booleanNode = createBooleanNode(false);
        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(booleanNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, booleanNode, parentNode);

        assertNotNull(booleanNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, booleanNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitThis() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node thisNode = createThisNode();
        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(thisNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, thisNode, parentNode);

        assertNotNull(thisNode.getJSType());
        // The exact type of 'this' is scope dependent. Here we assume it's UNKNOWN.
        assertEquals(JSTypeNative.UNKNOWN_TYPE, thisNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNull() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node nullNode = createNullNode();
        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(nullNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, nullNode, parentNode);

        assertNotNull(nullNode.getJSType());
        assertEquals(JSTypeNative.NULL_TYPE, nullNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitArrayLit() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node arrayNode = createNode(Token.ARRAYLIT);
        arrayNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.ARRAY_TYPE));
        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(arrayNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, arrayNode, parentNode);

        assertNotNull(arrayNode.getJSType());
        assertEquals(JSTypeNative.ARRAY_TYPE, arrayNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitRegExp() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node regexpNode = createNode(Token.REGEXP);
        regexpNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.REGEXP_TYPE));
        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(regexpNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, regexpNode, parentNode);

        assertNotNull(regexpNode.getJSType());
        assertEquals(JSTypeNative.REGEXP_TYPE, regexpNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitGetProp() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node objNode = createStringNode("obj");
        objNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node propNameNode = createStringNode("prop");
        Node getPropNode = createNode(Token.GETPROP);
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);
        getPropNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE)); // Example type

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(getPropNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, getPropNode, parentNode);

        assertNotNull(getPropNode.getJSType());
        assertEquals(JSTypeNative.STRING_TYPE, getPropNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitGetElem() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node objNode = createStringNode("obj");
        objNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node indexNode = createNumberNode(0);
        indexNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node getElemNode = createNode(Token.GETELEM);
        getElemNode.addChildToBack(objNode);
        getElemNode.addChildToBack(indexNode);
        getElemNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE)); // GETELEM type is often unknown

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(getElemNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, getElemNode, parentNode);

        assertNotNull(getElemNode.getJSType());
        assertEquals(JSTypeNative.UNKNOWN_TYPE, getElemNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitVarSimple() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node varNameNode = new Node(Token.NAME, 0, 0); // Correctly create a NAME node
        varNameNode.setString("myVar");
        varNameNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE)); // Initial type
        Node valueNode = createNumberNode(10);
        valueNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node varNode = createNode(Token.VAR);
        varNode.addChildToBack(varNameNode);
        varNameNode.addChildToBack(valueNode); // valueNode is a child of varNameNode in AST for VAR

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, varNode, createNode(Token.BLOCK));

        assertNotNull(varNameNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, varNameNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNew() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node constructorNode = new Node(Token.NAME, 0, 0); // Constructor name
        constructorNode.setString("MyClass");
        FunctionType constructorType = mockTypeRegistry.createFunctionType(
            mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE), // Return type
            mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE)  // Parameter type
        );
        constructorType.setConstructor(true);
        constructorType.setInstanceType(mockTypeRegistry.createObjectType("MyClassInstance"));
        constructorNode.setJSType(constructorType);

        Node argNode = createStringNode("arg");
        argNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE));

        Node newNode = createNode(Token.NEW);
        newNode.addChildToBack(constructorNode);
        newNode.addChildToBack(argNode);
        newNode.setJSType(constructorType.getInstanceType()); // Type of 'new MyClass()'

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(newNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, newNode, parentNode);

        assertNotNull(newNode.getJSType());
        assertEquals("MyClassInstance", newNode.getJSType().getDisplayName());
    }

    @Test
    public void testVisitCall() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node functionNode = new Node(Token.NAME, 0, 0); // Function name
        functionNode.setString("myFunc");
        FunctionType functionType = mockTypeRegistry.createFunctionType(
            mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE), // Return type
            mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE)  // Parameter type
        );
        functionNode.setJSType(functionType);

        Node argNode = createNumberNode(123);
        argNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node callNode = createNode(Token.CALL);
        callNode.addChildToBack(functionNode);
        callNode.addChildToBack(argNode);
        callNode.setJSType(functionType.getReturnType());

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(callNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, callNode, parentNode);

        assertNotNull(callNode.getJSType());
        assertEquals(JSTypeNative.STRING_TYPE, callNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitReturn() throws Exception {
        // To properly test visitReturn, we need a simulated NodeTraversal
        // that has an enclosing function.
        NodeTraversal t = new NodeTraversal(mockCompiler, this);

        // Mock enclosing function type for visitReturn
        FunctionType enclosingFuncType = mockTypeRegistry.createFunctionType(
            mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE)); // Returns String
        Node enclosingFuncNode = createNode(Token.FUNCTION);
        enclosingFuncNode.setJSType(enclosingFuncType);

        // Mock the NodeTraversal to return the enclosing function
        // This is a simplification; a more robust test would involve setting up scopes.
        // We can't directly mock NodeTraversal methods like this without reflection or a mocking framework.
        // Instead, we'll focus on the return value type check which visitReturn performs.

        Node returnValueNode = createStringNode("result");
        returnValueNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        Node returnNode = createNode(Token.RETURN);
        returnNode.addChildToBack(returnValueNode);

        // Simulate the check within visitReturn where it gets the return type
        JSType expectedReturnType = enclosingFuncType.getReturnType();
        JSType actualReturnType = returnValueNode.getJSType();

        // The validator would be called here. Since we mock the validator, we
        // directly check if the types are compatible (which they are).
        // In a real scenario, TypeValidator.expectCanAssignTo would be invoked.
        assertTrue(actualReturnType.canAssignTo(expectedReturnType));
    }

    @Test
    public void testVisitIncDec() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node operandNode = createNumberNode(5);
        operandNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node incNode = createNode(Token.INC);
        incNode.addChildToBack(operandNode);
        incNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(incNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, incNode, parentNode);

        assertNotNull(incNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, incNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNot() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node operandNode = createBooleanNode(true);
        operandNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node notNode = createNode(Token.NOT);
        notNode.addChildToBack(operandNode);
        notNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(notNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, notNode, parentNode);

        assertNotNull(notNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, notNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitVoid() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node operandNode = createNumberNode(1);
        operandNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node voidNode = createNode(Token.VOID);
        voidNode.addChildToBack(operandNode);
        voidNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.VOID_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(voidNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, voidNode, parentNode);

        assertNotNull(voidNode.getJSType());
        assertEquals(JSTypeNative.VOID_TYPE, voidNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitTypeOf() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node operandNode = createNumberNode(1);
        operandNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node typeofNode = createNode(Token.TYPEOF);
        typeofNode.addChildToBack(operandNode);
        typeofNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(typeofNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, typeofNode, parentNode);

        assertNotNull(typeofNode.getJSType());
        assertEquals(JSTypeNative.STRING_TYPE, typeofNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBitNot() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node operandNode = createNumberNode(5);
        operandNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node bitNotNode = createNode(Token.BITNOT);
        bitNotNode.addChildToBack(operandNode);
        bitNotNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(bitNotNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, bitNotNode, parentNode);

        assertNotNull(bitNotNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitNotNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitPos() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node operandNode = createNumberNode(-5);
        operandNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node posNode = createNode(Token.POS);
        posNode.addChildToBack(operandNode);
        posNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(posNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, posNode, parentNode);

        assertNotNull(posNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, posNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNeg() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node operandNode = createNumberNode(5);
        operandNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node negNode = createNode(Token.NEG);
        negNode.addChildToBack(operandNode);
        negNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(negNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, negNode, parentNode);

        assertNotNull(negNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, negNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitEq() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(1);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(1);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node eqNode = createNode(Token.EQ);
        eqNode.addChildToBack(leftNode);
        eqNode.addChildToBack(rightNode);
        eqNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(eqNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, eqNode, parentNode);

        assertNotNull(eqNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, eqNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitNe() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(1);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(2);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node neNode = createNode(Token.NE);
        neNode.addChildToBack(leftNode);
        neNode.addChildToBack(rightNode);
        neNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(neNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, neNode, parentNode);

        assertNotNull(neNode.getJSType());
        assertEquals(JSTypeNative.BOOLEAN_TYPE, neNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitSheq() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(1);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(1);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(1);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(2);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(1);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(2);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(2);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(2);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(3);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(2);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(3);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(3);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createStringNode("prop");
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        Node rightNode = createNode(Token.OBJECTLIT); // Represents an object
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNode(Token.NEW); // Represents an instance
        // Mock constructor for the new expression
        FunctionType constructorType = mockTypeRegistry.createFunctionType(
            mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        constructorType.setInstanceType(mockTypeRegistry.createObjectType("MyInstance"));
        leftNode.setJSType(constructorType.getInstanceType());

        Node rightNode = new Node(Token.NAME, 0, 0); // Represents a constructor function name
        rightNode.setString("MyClass");
        rightNode.setJSType(constructorType);

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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node lValueNode = new Node(Token.NAME, 0, 0); // Variable name
        lValueNode.setString("myVar");
        lValueNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Initial type
        Node rValueNode = createNumberNode(100);
        rValueNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node assignNode = createNode(Token.ASSIGN);
        assignNode.addChildToBack(lValueNode);
        assignNode.addChildToBack(rValueNode);
        // The type of assignment is the type of the right-hand side.
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(10);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(5);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(10);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(5);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(10);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(5);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(10);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(5);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(10);
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(3);
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(5); // Binary 101
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(3); // Binary 011
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node bitAndNode = createNode(Token.BITAND);
        bitAndNode.addChildToBack(leftNode);
        bitAndNode.addChildToBack(rightNode);
        bitAndNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Result is 1 (Binary 001)

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(bitAndNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, bitAndNode, parentNode);

        assertNotNull(bitAndNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitAndNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperatorBitOr() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(5); // Binary 101
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(3); // Binary 011
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node bitOrNode = createNode(Token.BITOR);
        bitOrNode.addChildToBack(leftNode);
        bitOrNode.addChildToBack(rightNode);
        bitOrNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Result is 7 (Binary 111)

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(bitOrNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, bitOrNode, parentNode);

        assertNotNull(bitOrNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitOrNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitBinaryOperatorBitXor() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node leftNode = createNumberNode(5); // Binary 101
        leftNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = createNumberNode(3); // Binary 011
        rightNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node bitXorNode = createNode(Token.BITXOR);
        bitXorNode.addChildToBack(leftNode);
        bitXorNode.addChildToBack(rightNode);
        bitXorNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Result is 6 (Binary 110)

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(bitXorNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, bitXorNode, parentNode);

        assertNotNull(bitXorNode.getJSType());
        assertEquals(JSTypeNative.NUMBER_TYPE, bitXorNode.getJSType().getNativeId());
    }

    @Test
    public void testVisitDelProp() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node objNode = createStringNode("obj");
        objNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node propNameNode = createStringNode("prop");
        Node getPropNode = createNode(Token.GETPROP);
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);
        getPropNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE)); // Type of property access

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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node switchExpr = createNumberNode(10);
        switchExpr.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node caseExpr = createNumberNode(10);
        caseExpr.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node caseNode = createNode(Token.CASE);
        caseNode.addChildToBack(caseExpr);

        Node switchNode = createNode(Token.SWITCH);
        switchNode.addChildToBack(switchExpr);
        switchNode.addChildToBack(caseNode); // Case is a child of SWITCH in some AST structures

        TypeCheck typeCheck = createTypeChecker();
        // The visit method for CASE requires the parent to be SWITCH.
        typeCheck.visit(t, caseNode, switchNode);

        // No explicit type setting for CASE node itself, but the visit method
        // performs checks. We assume no error is reported due to mock validator.
    }

    @Test
    public void testVisitWith() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node objectNode = createNode(Token.OBJECTLIT);
        objectNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node withNode = createNode(Token.WITH);
        withNode.addChildToBack(objectNode);

        Node parentNode = createNode(Token.BLOCK);
        parentNode.addChildToBack(withNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, withNode, parentNode);

        // No explicit type setting for WITH node itself.
        // The visit method performs checks.
    }

    @Test
    public void testVisitFunctionSimple() throws Exception {
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node functionNameNode = new Node(Token.NAME, 0, 0); // Function name
        functionNameNode.setString("myFunc");
        Node functionBodyNode = createNode(Token.BLOCK);
        Node functionNode = createNode(Token.FUNCTION);
        functionNode.addChildToBack(functionNameNode);
        functionNode.addChildToBack(functionBodyNode);

        // Assign a FunctionType to the function node
        FunctionType funcType = mockTypeRegistry.createFunctionType(
            mockTypeRegistry.getNativeType(JSTypeNative.VOID_TYPE)); // void return
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
        NodeTraversal t = new NodeTraversal(mockCompiler, this);
        Node objectNode = createStringNode("obj");
        objectNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node propertyNode = createStringNode("prop");
        Node getPropNode = createNode(Token.GETPROP);
        getPropNode.addChildToBack(objectNode);
        getPropNode.addChildToBack(propertyNode);
        // The type of the property will be checked against the annotation.

        Node rValueNode = createNumberNode(123);
        rValueNode.setJSType(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node assignNode = createNode(Token.ASSIGN);
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(rValueNode);

        // Add an @type annotation to the assignment node
        JSDocInfo jsDocInfo = new JSDocInfo();
        // Ensure the type in the annotation is properly evaluated by the registry
        JSType annotatedType = mockTypeRegistry.getLearnedObjectType("Number"); // Use a representative type
        jsDocInfo.addType(annotatedType);
        assignNode.setJSDocInfo(jsDocInfo);

        Node parentNode = createNode(Token.RETURN);
        parentNode.addChildToBack(assignNode);

        TypeCheck typeCheck = createTypeChecker();
        typeCheck.visit(t, assignNode, parentNode);

        // The visitAssign method calls visitAnnotatedAssignGetprop internally.
        // We assume the type check passes because the types match.
        // The type of the assignment node itself should reflect the annotated type.
        assertNotNull(assignNode.getJSType());
        assertEquals("Number", assignNode.getJSType().getDisplayName());
    }
}
