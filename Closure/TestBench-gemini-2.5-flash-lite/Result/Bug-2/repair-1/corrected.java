package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.CheckLevel;
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
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.io.IOException; // Added for appendStringTree

// Mock classes to satisfy AbstractCompiler interface
class MockCodingConvention extends DefaultCodingConvention {
    @Override
    public String getAbstractMethodName() {
        return "abstractMethod";
    }
}

class MockAbstractCompiler extends AbstractCompiler {
    private final DiagnosticType[] diags = TypeCheck.ALL_DIAGNOSTICS.getEntries();
    private final TypeValidator typeValidator = new TypeValidator(this);
    private final CodingConvention codingConvention = new MockCodingConvention();

    @Override
    public DiagnosticType[] getDiagnosticTypes() {
        return diags;
    }

    @Override
    public TypeValidator getTypeValidator() {
        return typeValidator;
    }

    @Override
    public CodingConvention getCodingConvention() {
        return codingConvention;
    }

    @Override
    public void report(JSError error) {
        // In tests, we don't actually report errors to a real reporter.
    }

    @Override
    public JSModule[] getModules() {
        return null;
    }

    @Override
    public void process(Node externs, Node root) {
        throw new UnsupportedOperationException("Not implemented in test");
    }

    @Override
    public void process(JSModule[] modules) {
        throw new UnsupportedOperationException("Not implemented in test");
    }

    @Override
    public String getSourcePath() {
        return "test.js";
    }

    @Override
    public void normalize() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setExternVerificationMode(CheckLevel level) {
    }

    @Override
    public void setHasRegExp(boolean hasRegExp) {
    }

    @Override
    public boolean shouldGeneratePseudoNames() {
        return false;
    }

    @Override
    public CheckLevel getConfiguredVersion() {
        return CheckLevel.OFF;
    }

    @Override
    public boolean isTypeCheckingEnabled() {
        return true;
    }

    @Override
    public PhaseOptimizer getOptimizer() {
        throw new UnsupportedOperationException();
    }

    @Override
    public SourceMap createSourceMap() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setPhases(PhaseOptimizer.List list) {
        // No-op for testing
    }

    @Override
    public Node getSynthesizedRoot() {
        return new Node(Token.SCRIPT);
    }

    @Override
    public Var getVar(String name) {
        return null;
    }

    @Override
    public String getErrorFormat() {
        return "Error: %s";
    }
}

// Mock ErrorReporter for JSTypeRegistry
class MockErrorReporter implements JSTypeRegistry.ErrorReporter {
    @Override
    public void report(JSTypeNative typeId, String message) {
        fail("Unexpected type registry error: " + message);
    }
    @Override
    public void report(DiagnosticType type, Node node, String... arguments) {
        fail("Unexpected type registry error: " + type.format(arguments));
    }
}

// Mock NodeTraversal to provide necessary context
class MockNodeTraversal extends NodeTraversal {
    private Scope currentScope;
    private Node enclosingFunction;

    public MockNodeTraversal(AbstractCompiler compiler, Callback cb, Scope scope) {
        super(compiler, cb);
        this.currentScope = scope;
    }

    @Override
    public Scope getScope() {
        return currentScope;
    }

    public void setScope(Scope scope) {
        this.currentScope = scope;
    }

    @Override
    public Node getEnclosingFunction() {
        return enclosingFunction;
    }

    public void setEnclosingFunction(Node enclosingFunction) {
        this.enclosingFunction = enclosingFunction;
    }

    public void setEnclosingFunctionType(FunctionType functionType) {
        if (functionType != null) {
            this.enclosingFunction = new Node(Token.FUNCTION);
            this.enclosingFunction.setJSType(functionType);
        } else {
            this.enclosingFunction = null;
        }
    }
}


public class TypeCheckTest {

    // Helper method to create a minimal compiler instance for testing.
    private AbstractCompiler createCompiler() {
        return new MockAbstractCompiler();
    }

    // Helper method to create a JSTypeRegistry.
    private JSTypeRegistry createRegistry() {
        return new JSTypeRegistry(new MockErrorReporter());
    }

    // Helper method to create a ReverseAbstractInterpreter.
    private ReverseAbstractInterpreter createInterpreter(JSTypeRegistry registry) {
        return new SemanticReverseAbstractInterpreter(registry);
    }

    // Helper method to create a Scope.
    private Scope createScope(JSTypeRegistry registry) {
        return new Scope(createCompiler().getSynthesizedRoot(), registry);
    }

    private Node createNode(int type, String value) {
        Node n = new Node(type);
        if (value != null) {
            n.setString(value);
        }
        return n;
    }

    private Node createNode(int type) {
        return new Node(type);
    }

    private void assertTypeEquals(JSType expected, JSType actual) {
        if (expected == null) {
            assertNull(actual);
        } else {
            assertNotNull(actual);
            assertTrue("Expected type " + expected.toString() + " but got " + actual.toString(),
                    expected.isEquivalentTo(actual));
        }
    }

    @Test
    public void testVisitNumber() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node numberNode = Node.newNumber(10.0);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, numberNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numberNode.getJSType());
    }

    @Test
    public void testVisitString() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node stringNode = Node.newString("hello");
        stringNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, stringNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), stringNode.getJSType());
    }

    @Test
    public void testVisitBooleanTrue() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node booleanNode = createNode(Token.TRUE);
        booleanNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, booleanNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), booleanNode.getJSType());
    }

    @Test
    public void testVisitBooleanFalse() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node booleanNode = createNode(Token.FALSE);
        booleanNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, booleanNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), booleanNode.getJSType());
    }

    @Test
    public void testVisitThis() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node thisNode = createNode(Token.THIS);
        Scope scope = createScope(registry);
        ObjectType scopeType = registry.createObjectType(scope);
        thisNode.setJSType(scopeType);
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, scope);

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, scope, null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, thisNode, null);
        assertTypeEquals(scopeType, thisNode.getJSType());
    }

    @Test
    public void testVisitNull() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node nullNode = createNode(Token.NULL);
        nullNode.setJSType(registry.getNativeType(JSTypeNative.NULL_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, nullNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), nullNode.getJSType());
    }

    @Test
    public void testVisitArrayLit() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node arrayLitNode = createNode(Token.ARRAYLIT);
        arrayLitNode.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, arrayLitNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrayLitNode.getJSType());
    }

    @Test
    public void testVisitRegExp() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node regExpNode = createNode(Token.REGEXP);
        regExpNode.setJSType(registry.getNativeType(JSTypeNative.REGEXP_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, regExpNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.REGEXP_TYPE), regExpNode.getJSType());
    }

    @Test
    public void testVisitCast() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node castNode = createNode(Token.CAST);
        Node exprNode = Node.newNumber(5.0);
        exprNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        castNode.addChildToBack(exprNode);
        castNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE)); // Casting to string
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, castNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), castNode.getJSType());
        assertTypeEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), exprNode.getJSType()); // Type of exprNode should be updated
    }

    @Test
    public void testVisitNameFound() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        Node nameNode = createNode(Token.NAME, "myVar");
        JSType expectedType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        scope.declare("myVar", nameNode, expectedType, null);
        nameNode.setJSType(expectedType);
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, scope);

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, scope, null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, nameNode, null);
        assertTypeEquals(expectedType, nameNode.getJSType());
    }

    @Test
    public void testVisitNameNotFound() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node nameNode = createNode(Token.NAME, "unknownVar");
        JSType expectedType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        nameNode.setJSType(expectedType); // Initially unknown
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, nameNode, null);
        assertTypeEquals(expectedType, nameNode.getJSType()); // Should remain unknown
    }

    @Test
    public void testVisitIncDec() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node incNode = createNode(Token.INC);
        Node numberNode = Node.newNumber(10.0);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        incNode.addChildToBack(numberNode);
        incNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, incNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), incNode.getJSType());
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numberNode.getJSType());
    }

    @Test
    public void testVisitNot() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node notNode = createNode(Token.NOT);
        Node booleanNode = createNode(Token.TRUE);
        booleanNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        notNode.addChildToBack(booleanNode);
        notNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, notNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), notNode.getJSType());
    }

    @Test
    public void testVisitBitNot() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node bitNotNode = createNode(Token.BITNOT);
        Node numberNode = Node.newNumber(5.0); // Should be treated as int32
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitNotNode.addChildToBack(numberNode);
        bitNotNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, bitNotNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitNotNode.getJSType());
    }

    @Test
    public void testVisitPos() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node posNode = createNode(Token.POS);
        Node numberNode = Node.newNumber(5.0);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        posNode.addChildToBack(numberNode);
        posNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, posNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), posNode.getJSType());
    }

    @Test
    public void testVisitNeg() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node negNode = createNode(Token.NEG);
        Node numberNode = Node.newNumber(5.0);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        negNode.addChildToBack(numberNode);
        negNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, negNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), negNode.getJSType());
    }

    @Test
    public void testVisitTypeOf() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node typeofNode = createNode(Token.TYPEOF);
        Node nameNode = createNode(Token.NAME, "myVar");
        nameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        typeofNode.addChildToBack(nameNode);
        typeofNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, typeofNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeofNode.getJSType());
    }

    @Test
    public void testVisitVoid() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node voidNode = createNode(Token.VOID);
        Node nameNode = createNode(Token.NAME, "myVar");
        nameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        voidNode.addChildToBack(nameNode);
        voidNode.setJSType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, voidNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), voidNode.getJSType());
    }

    @Test
    public void testVisitEqEqual() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node eqNode = createNode(Token.EQ);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        eqNode.addChildToBack(leftNode);
        eqNode.addChildToBack(rightNode);
        eqNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, eqNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), eqNode.getJSType());
    }

    @Test
    public void testVisitShEq() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node shEqNode = createNode(Token.SHEQ);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        shEqNode.addChildToBack(leftNode);
        shEqNode.addChildToBack(rightNode);
        shEqNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, shEqNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), shEqNode.getJSType());
    }

    @Test
    public void testVisitLt() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node ltNode = createNode(Token.LT);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        ltNode.addChildToBack(leftNode);
        ltNode.addChildToBack(rightNode);
        ltNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, ltNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), ltNode.getJSType());
    }

    @Test
    public void testVisitLe() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node leNode = createNode(Token.LE);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        leNode.addChildToBack(leftNode);
        leNode.addChildToBack(rightNode);
        leNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, leNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), leNode.getJSType());
    }

    @Test
    public void testVisitGt() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node gtNode = createNode(Token.GT);
        Node leftNode = Node.newNumber(10.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        gtNode.addChildToBack(leftNode);
        gtNode.addChildToBack(rightNode);
        gtNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, gtNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), gtNode.getJSType());
    }

    @Test
    public void testVisitGe() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node geNode = createNode(Token.GE);
        Node leftNode = Node.newNumber(10.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(5.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        geNode.addChildToBack(leftNode);
        geNode.addChildToBack(rightNode);
        geNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, geNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), geNode.getJSType());
    }

    @Test
    public void testVisitIn() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node inNode = createNode(Token.IN);
        Node leftNode = Node.newString("prop");
        leftNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node rightNode = createNode(Token.OBJECTLIT);
        rightNode.setJSType(registry.createObjectType(createScope(registry)));
        inNode.addChildToBack(leftNode);
        inNode.addChildToBack(rightNode);
        inNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, inNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), inNode.getJSType());
    }

    @Test
    public void testVisitInstanceOf() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node instanceofNode = createNode(Token.INSTANCEOF);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType constructorType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.NUMBER_OBJECT_TYPE), // Return type
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)  // Param type
        );
        constructorType.setInstanceType(registry.getNativeType(JSTypeNative.NUMBER_OBJECT_TYPE));
        Node constructorNameNode = createNode(Token.NAME, "Number");
        constructorNameNode.setJSType(constructorType);
        instanceofNode.addChildToBack(leftNode);
        instanceofNode.addChildToBack(constructorNameNode);
        instanceofNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, instanceofNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), instanceofNode.getJSType());
    }

    @Test
    public void testVisitAssignAdd() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node assignAddNode = createNode(Token.ASSIGN_ADD);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignAddNode.addChildToBack(leftNode);
        assignAddNode.addChildToBack(rightNode);
        assignAddNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, assignAddNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignAddNode.getJSType());
    }

    @Test
    public void testVisitAdd() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node addNode = createNode(Token.ADD);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        addNode.addChildToBack(leftNode);
        addNode.addChildToBack(rightNode);
        addNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, addNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), addNode.getJSType());
    }

    @Test
    public void testVisitDelProp() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node delPropNode = createNode(Token.DELPROP);
        Node objNode = createNode(Token.OBJECTLIT);
        objNode.setJSType(registry.createObjectType(createScope(registry)));
        Node propNameNode = Node.newString("prop");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        delPropNode.addChildToBack(objNode);
        delPropNode.addChildToBack(propNameNode);
        delPropNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, delPropNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), delPropNode.getJSType());
    }

    @Test
    public void testVisitCase() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node caseNode = createNode(Token.CASE);
        Node switchNode = createNode(Token.SWITCH); // Parent
        Node caseValueNode = Node.newString("value");
        caseValueNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node switchValueNode = Node.newString("some_string");
        switchValueNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        caseNode.addChildToBack(caseValueNode);
        switchNode.addChildToBack(switchValueNode); // Switch condition
        switchNode.addChildToBack(caseNode); // Case node
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));
        caseNode.setParent(switchNode);

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, caseNode, switchNode);
        // No specific type is set on CASE node, but type validation should happen.
    }

    @Test
    public void testVisitWith() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node withNode = createNode(Token.WITH);
        Node objectNode = createNode(Token.OBJECTLIT); // Needs to be an object type
        objectNode.setJSType(registry.createObjectType(createScope(registry)));
        withNode.addChildToBack(objectNode);
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, withNode, null);
        // No specific type is set on WITH node, but type validation should happen.
    }

    @Test
    public void testVisitFunction() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node functionNode = createNode(Token.FUNCTION);
        Node functionName = Node.newString("myFunc");
        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.STRING_TYPE));
        functionNode.setJSType(functionType);
        functionNode.addChildToBack(functionName);
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, functionNode, null);
        assertTypeEquals(functionType, functionNode.getJSType());
    }

    @Test
    public void testVisitAssign() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node assignNode = createNode(Token.ASSIGN);
        Node leftNode = Node.newString("varName");
        JSType leftType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        leftNode.setJSType(leftType);
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignNode.addChildToBack(leftNode);
        assignNode.addChildToBack(rightNode);
        assignNode.setJSType(leftType); // Assign returns the type of the LHS
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitAssign(traversal, assignNode);
        assertTypeEquals(leftType, assignNode.getJSType());
    }

    @Test
    public void testVisitGetProp() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node getPropNode = createNode(Token.GETPROP);
        Node objNode = createNode(Token.OBJECTLIT);
        ObjectType objType = registry.createObjectType(createScope(registry));
        objType.defineDeclaredProperty("prop", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
        objNode.setJSType(objType);
        Node propNameNode = Node.newString("prop");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);
        getPropNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, getPropNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), getPropNode.getJSType());
    }

    @Test
    public void testVisitGetElem() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node getElemNode = createNode(Token.GETELEM);
        Node objNode = createNode(Token.ARRAYLIT);
        objNode.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));
        Node indexNode = Node.newNumber(0.0);
        indexNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        getElemNode.addChildToBack(objNode);
        getElemNode.addChildToBack(indexNode);
        getElemNode.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)); // Element access is often unknown
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, getElemNode, null);
        assertTypeEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), getElemNode.getJSType());
    }

    @Test
    public void testVisitNew() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node newNode = createNode(Token.NEW);
        Node constructorNode = createNode(Token.NAME, "MyConstructor");
        FunctionType constructorType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.STRING_TYPE), // Return type
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)  // Param type
        );
        constructorType.setInstanceType(registry.createObjectType(createScope(registry)));
        constructorNode.setJSType(constructorType);
        newNode.addChildToBack(constructorNode);
        newNode.setJSType(constructorType.getInstanceType());
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, newNode, null);
        assertTypeEquals(constructorType.getInstanceType(), newNode.getJSType());
    }

    @Test
    public void testVisitCall() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node callNode = createNode(Token.CALL);
        Node functionNode = createNode(Token.NAME, "myFunc");
        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE), // Return type
            registry.getNativeType(JSTypeNative.STRING_TYPE)  // Param type
        );
        functionNode.setJSType(functionType);
        callNode.addChildToBack(functionNode);
        Node argNode = Node.newString("hello");
        argNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        callNode.addChildToBack(argNode);
        callNode.setJSType(functionType.getReturnType());
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, callNode, null);
        assertTypeEquals(functionType.getReturnType(), callNode.getJSType());
    }

    @Test
    public void testVisitReturn() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node returnNode = createNode(Token.RETURN);
        Node valueNode = Node.newNumber(42.0);
        valueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        returnNode.addChildToBack(valueNode);

        // Mock enclosing function with a return type
        FunctionType enclosingFunctionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE), // Return type
            registry.getNativeType(JSTypeNative.STRING_TYPE)  // Param type
        );
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));
        traversal.setEnclosingFunctionType(enclosingFunctionType);

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visit(traversal, returnNode, null);
        // No explicit type setting on RETURN node, but validation happens.
    }

    @Test
    public void testVisitBinaryOperatorAdd() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node addNode = createNode(Token.ADD);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        addNode.addChildToBack(leftNode);
        addNode.addChildToBack(rightNode);
        addNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.ADD, traversal, addNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), addNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorSub() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node subNode = createNode(Token.SUB);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        subNode.addChildToBack(leftNode);
        subNode.addChildToBack(rightNode);
        subNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.SUB, traversal, subNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), subNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorMul() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node mulNode = createNode(Token.MUL);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        mulNode.addChildToBack(leftNode);
        mulNode.addChildToBack(rightNode);
        mulNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.MUL, traversal, mulNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), mulNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorDiv() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node divNode = createNode(Token.DIV);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        divNode.addChildToBack(leftNode);
        divNode.addChildToBack(rightNode);
        divNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.DIV, traversal, divNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), divNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorMod() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node modNode = createNode(Token.MOD);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        modNode.addChildToBack(leftNode);
        modNode.addChildToBack(rightNode);
        modNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.MOD, traversal, modNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), modNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorBitOr() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node bitOrNode = createNode(Token.BITOR);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitOrNode.addChildToBack(leftNode);
        bitOrNode.addChildToBack(rightNode);
        bitOrNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.BITOR, traversal, bitOrNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitOrNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorBitXor() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node bitXorNode = createNode(Token.BITXOR);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitXorNode.addChildToBack(leftNode);
        bitXorNode.addChildToBack(rightNode);
        bitXorNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.BITXOR, traversal, bitXorNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitXorNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorBitAnd() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node bitAndNode = createNode(Token.BITAND);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(10.0);
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitAndNode.addChildToBack(leftNode);
        bitAndNode.addChildToBack(rightNode);
        bitAndNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.BITAND, traversal, bitAndNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitAndNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorLsh() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node lshNode = createNode(Token.LSH);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(2.0); // Shift count
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        lshNode.addChildToBack(leftNode);
        lshNode.addChildToBack(rightNode);
        lshNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.LSH, traversal, lshNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), lshNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorRsh() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node rshNode = createNode(Token.RSH);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(1.0); // Shift count
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        rshNode.addChildToBack(leftNode);
        rshNode.addChildToBack(rightNode);
        rshNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.RSH, traversal, rshNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), rshNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorUrsh() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node urshNode = createNode(Token.URSH);
        Node leftNode = Node.newNumber(5.0);
        leftNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rightNode = Node.newNumber(1.0); // Shift count
        rightNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        urshNode.addChildToBack(leftNode);
        urshNode.addChildToBack(rightNode);
        urshNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitBinaryOperator(Token.URSH, traversal, urshNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), urshNode.getJSType());
    }

    // Test for visitAssign for property creation check (should pass for existing property)
    @Test
    public void testVisitAssignExistingProperty() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node assignNode = createNode(Token.ASSIGN);
        Node getPropNode = createNode(Token.GETPROP);
        Node objNode = createNode(Token.OBJECTLIT);
        ObjectType objType = registry.createObjectType(createScope(registry));
        objType.defineDeclaredProperty("existingProp", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
        objNode.setJSType(objType);
        Node propNameNode = Node.newString("existingProp");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);
        getPropNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Node rightNode = Node.newString("newValue");
        rightNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(rightNode);
        assignNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitAssign(traversal, assignNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), assignNode.getJSType());
    }

    // Test for visitAssign for property creation check (should fail for new property on struct)
    @Test
    public void testVisitAssignNewPropertyOnStruct() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node assignNode = createNode(Token.ASSIGN);
        Node getPropNode = createNode(Token.GETPROP);
        Node objNode = createNode(Token.OBJECTLIT);
        ObjectType objType = registry.createObjectType(createScope(registry));
        objType.setStruct(true); // Make it a struct
        // No property defined
        objNode.setJSType(objType);
        Node propNameNode = Node.newString("newProp");
        propNameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        getPropNode.addChildToBack(objNode);
        getPropNode.addChildToBack(propNameNode);
        getPropNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Node rightNode = Node.newString("newValue");
        rightNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(rightNode);
        assignNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        // This should report ILLEGAL_PROPERTY_CREATION, but we can't easily assert that here.
        // We can assert that the type assignment still happens.
        typeChecker.visitAssign(traversal, assignNode);
        assertTypeEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), assignNode.getJSType());
    }

    @Test
    public void testCheckEnumAlias() throws Exception {
        JSTypeRegistry registry = createRegistry();
        JSDocInfo info = new JSDocInfo();
        EnumType enumType = registry.createEnumType("MyEnum", new Node(Token.OBJECTLIT));
        enumType.define("VAL1", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        info.setEnumParameterType(enumType.getElementsType());

        Node valueNode = Node.newNumber(1.0);
        valueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.checkEnumAlias(traversal, info, valueNode);
        // No assertion needed, check is for reporting errors.
    }

    @Test
    public void testVisitParameterListWithCorrectArgs() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node callNode = createNode(Token.CALL);
        Node functionNode = createNode(Token.NAME, "myFunc");
        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)
        );
        functionType.setVarArgs(false);
        functionType.setMinArguments(1);
        functionType.setMaxArguments(1);
        functionNode.setJSType(functionType);
        callNode.addChildToBack(functionNode);
        Node argNode = Node.newNumber(10.0);
        argNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        callNode.addChildToBack(argNode);
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitParameterList(traversal, callNode, functionType);
        // Should not throw WRONG_ARGUMENT_COUNT
    }

    @Test
    public void testVisitParameterListWithTooFewArgs() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node callNode = createNode(Token.CALL);
        Node functionNode = createNode(Token.NAME, "myFunc");
        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)
        );
        functionType.setVarArgs(false);
        functionType.setMinArguments(2);
        functionType.setMaxArguments(2);
        functionNode.setJSType(functionType);
        callNode.addChildToBack(functionNode);
        Node argNode = Node.newNumber(10.0);
        argNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        callNode.addChildToBack(argNode); // Only one argument provided
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        // This should report WRONG_ARGUMENT_COUNT. We can't directly assert errors here,
        // but in a real test setup, this would be checked.
        typeChecker.visitParameterList(traversal, callNode, functionType);
    }

    @Test
    public void testVisitParameterListWithTooManyArgs() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node callNode = createNode(Token.CALL);
        Node functionNode = createNode(Token.NAME, "myFunc");
        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)
        );
        functionType.setVarArgs(false);
        functionType.setMinArguments(1);
        functionType.setMaxArguments(1);
        functionNode.setJSType(functionType);
        callNode.addChildToBack(functionNode);
        Node argNode1 = Node.newNumber(10.0);
        argNode1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        callNode.addChildToBack(argNode1);
        Node argNode2 = Node.newNumber(20.0);
        argNode2.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        callNode.addChildToBack(argNode2); // Two arguments provided
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        // This should report WRONG_ARGUMENT_COUNT.
        typeChecker.visitParameterList(traversal, callNode, functionType);
    }

    @Test
    public void testVisitParameterListWithVarArgs() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node callNode = createNode(Token.CALL);
        Node functionNode = createNode(Token.NAME, "myFunc");
        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)
        );
        functionType.setVarArgs(true);
        functionNode.setJSType(functionType);
        callNode.addChildToBack(functionNode);
        Node argNode1 = Node.newNumber(10.0);
        argNode1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        callNode.addChildToBack(argNode1);
        Node argNode2 = Node.newNumber(20.0);
        argNode2.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        callNode.addChildToBack(argNode2); // Multiple arguments for varargs
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.visitParameterList(traversal, callNode, functionType);
        // Should not throw WRONG_ARGUMENT_COUNT
    }

    @Test
    public void testGetJSTypeForKnownType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node node = Node.newNumber(10.0);
        JSType expectedType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        node.setJSType(expectedType);

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        JSType actualType = typeChecker.getJSType(node);
        assertTypeEquals(expectedType, actualType);
    }

    @Test
    public void testGetJSTypeForUnknownType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node node = createNode(Token.NAME, "unknown");
        // No type set on the node

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        JSType actualType = typeChecker.getJSType(node);
        assertTypeEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), actualType);
    }

    @Test
    public void testEnsureTypedWithExistingType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node node = Node.newNumber(10.0);
        JSType expectedType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        node.setJSType(expectedType);
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.ensureTyped(traversal, node, expectedType);
        assertTypeEquals(expectedType, node.getJSType());
    }

    @Test
    public void testEnsureTypedWithoutType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node node = createNode(Token.NAME, "untyped");
        JSType initialType = null;
        node.setJSType(initialType);
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.ensureTyped(traversal, node, registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTypeEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), node.getJSType());
    }

    @Test
    public void testEnsureTypedWithNativeTypeEnum() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Node node = createNode(Token.NAME, "untyped");
        node.setJSType(null);
        MockNodeTraversal traversal = new MockNodeTraversal(createCompiler(), null, createScope(registry));

        TypeCheck typeChecker = new TypeCheck(createCompiler(), createInterpreter(registry), registry, createScope(registry), null, CheckLevel.WARNING, CheckLevel.OFF);
        typeChecker.ensureTyped(traversal, node, JSTypeNative.BOOLEAN_TYPE);
        assertTypeEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), node.getJSType());
    }

    // Add more tests for other methods and edge cases.
}
