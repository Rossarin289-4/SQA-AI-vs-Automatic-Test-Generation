```java
package com.google.javascript.jscomp.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.JSType;
import com.google.common.base.Function;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.io.Serializable;
import java.util.Comparator;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.SimpleReference;
import com.google.javascript.jscomp.PreprocessorSymbolTable;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.GlobalNamespace;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.Property;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.rhino.StaticScope;

import java.util.Set;
import java.util.List;
import java.util.LinkedHashMap;

public class SemanticReverseAbstractInterpreterTest {

    // Mock objects for dependencies
    private final CodingConvention mockConvention = null;
    private final JSTypeRegistry mockTypeRegistry = new JSTypeRegistry(null);
    private final ErrorReporter mockErrorReporter = null;
    private final Node mockNode = new Node(Token.NAME);
    private final FlowScope mockBlindScope = new MockFlowScope();
    private final StaticScope<JSType> mockStaticScope = new MockFlowScope();


    // Helper to create a SemanticReverseAbstractInterpreter instance
    private SemanticReverseAbstractInterpreter createInterpreter() {
        return new SemanticReverseAbstractInterpreter(mockConvention, mockTypeRegistry);
    }

    // Mock FlowScope implementation for testing
    private static class MockFlowScope implements FlowScope, StaticScope<JSType> {
        @Override
        public FlowScope createChildFlowScope() { return this; }
        @Override
        public void inferSlotType(String symbol, JSType type) {}
        @Override
        public void inferQualifiedSlot(Node node, String symbol, JSType bottomType, JSType inferredType) {}
        @Override
        public FlowScope optimize() { return this; }
        @Override
        public StaticSlot<JSType> findUniqueRefinedSlot(FlowScope blindScope) { return null; }
        @Override
        public void completeScope(StaticScope<JSType> scope) {}
        @Override
        public JSType getType(String name) { return null; }
        @Override
        public JSType getGlobalType(String name) { return null; }
        @Override
        public JSType getResolvedType(String name) { return null; }
        @Override
        public StaticSlot<JSType> getSlot(String name) { return null; }
        @Override
        public StaticSlot<JSType> getNamespace(String name) { return null; }
        @Override
        public StaticSlot<JSType> findSlot(String name) { return null; }
        @Override
        public StaticSlot<JSType> findObservableSlot(String name) { return null; }
        @Override
        public FunctionType getConstructor(String name) { return null; }
        @Override
        public ObjectType getObjectPrototype() { return null; }
        @Override
        public JSType getFunctionPrototype() { return null; }
        @Override
        public boolean isGlobal() { return false;}
        @Override
        public JSType resolve(ErrorReporter t, StaticScope<JSType> scope) { return null; }
        @Override
        public JSType getTypeIfRefinable(Node node, FlowScope scope) { return null; }
        @Override
        public void declareNameInScope(FlowScope scope, Node node, JSType type) {}
        @Override
        public JSType getTypeOfThis() { return null; }
        @Override
        public ObjectType getParentScope() { return null; }
        @Override
        public Node getRootNode() { return null; }
        @Override
        public Property getSlot(String name) { return null; }
        @Override
        public ObjectType getImplicitPrototype() { return null; }
        @Override
        public boolean detectImplicitPrototypeCycle() { return false; }
        @Override
        public String getReferenceName() { return null; }
        @Override
        public String getNormalizedReferenceName() { return null; }
        @Override
        public boolean hasReferenceName() { return false; }
        @Override
        public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
        @Override
        public FunctionType getConstructor() { return null; }
        @Override
        public boolean defineDeclaredProperty(String propertyName, JSType type, Node propertyNode) { return false; }
        @Override
        public boolean defineSynthesizedProperty(String propertyName, JSType type, Node propertyNode) { return false; }
        @Override
        public boolean defineInferredProperty(String propertyName, JSType type, Node propertyNode) { return false; }
        @Override
        public boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) { return false; }
        @Override
        public boolean removeProperty(String propertyName) { return false; }
        @Override
        public Node getPropertyNode(String propertyName) { return null; }
        @Override
        public JSDocInfo getOwnPropertyJSDocInfo(String propertyName) { return null; }
        @Override
        public void setPropertyJSDocInfo(String propertyName, JSDocInfo info) {}
        @Override
        public JSType findPropertyType(String propertyName) { return null; }
        @Override
        public JSType getPropertyType(String propertyName) { return null; }
        @Override
        public boolean hasProperty(String propertyName) { return false; }
        @Override
        public boolean hasOwnProperty(String propertyName) { return false; }
        @Override
        public Set<String> getOwnPropertyNames() { return null; }
        @Override
        public boolean isPropertyTypeInferred(String propertyName) { return false; }
        @Override
        public boolean isPropertyTypeDeclared(String propertyName) { return false; }
        @Override
        public boolean hasOwnDeclaredProperty(String name) { return false; }
        @Override
        public int getPropertiesCount() { return 0; }
        @Override
        public Set<String> getPropertyNames() { return null; }
        @Override
        public void collectPropertyNames(Set<String> props) {}
        @Override
        public <T> T visit(Visitor<T> visitor) { return null; }
        @Override
        public final boolean isImplicitPrototype(ObjectType prototype) { return false; }
        @Override
        public JSType getParameterType() { return null; }
        @Override
        public JSType getIndexType() { return null; }
        @Override
        public JSDocInfo getJSDocInfo() { return null; }
        @Override
        public void setJSDocInfo(JSDocInfo info) {}
        @Override
        public StaticSlot<JSType> getOwnSlot(String name) { return null; }
    }

    @Test
    public void testCaseTypeOf_stringEquals() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node operandNode = Node.newString("hello");
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        Node stringNode = Node.newString("string");
        FlowScope resultScope = interpreter.caseTypeOf(operandNode, stringType, "string", true, mockBlindScope);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseTypeOf_numberNotEquals() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node operandNode = Node.newNumber(123);
        JSType numberType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        Node stringNode = Node.newString("number");
        FlowScope resultScope = interpreter.caseTypeOf(operandNode, numberType, "number", false, mockBlindScope);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseTypeOf_booleanEquals() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node operandNode = Node.newBoolean(false);
        JSType booleanType = mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_OBJECT);
        Node stringNode = Node.newString("boolean");
        FlowScope resultScope = interpreter.caseTypeOf(operandNode, booleanType, "boolean", true, mockBlindScope);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseTypeOf_undefinedNotEquals() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node operandNode = new Node(Token.NAME);
        operandNode.setType(Token.NAME);
        JSType undefinedType = mockTypeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
        Node stringNode = Node.newString("undefined");
        FlowScope resultScope = interpreter.caseTypeOf(operandNode, undefinedType, "undefined", false, mockBlindScope);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseEquality_eq_numbers() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(10);
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.EQ;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseEquality_ne_numbers() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(20);
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.NE;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseEquality_sheq_strings() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newString("hello");
        Node right = Node.newString("hello");
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.SHEQ;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseEquality_shne_strings() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newString("hello");
        Node right = Node.newString("world");
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.SHNE;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseAndOrNotShortCircuiting_and_true() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newTrue();
        Node right = Node.newString("dummy");
        FlowScope resultScope = interpreter.caseAndOrNotShortCircuiting(left, right, mockBlindScope, true);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseAndOrNotShortCircuiting_or_false() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newFalse();
        Node right = Node.newString("dummy");
        FlowScope resultScope = interpreter.caseAndOrNotShortCircuiting(left, right, mockBlindScope, false);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseAndOrMaybeShortCircuiting_and_true() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newTrue();
        Node right = Node.newString("dummy");
        FlowScope resultScope = interpreter.caseAndOrMaybeShortCircuiting(left, right, mockBlindScope, true);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseAndOrMaybeShortCircuiting_or_false() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newFalse();
        Node right = Node.newString("dummy");
        FlowScope resultScope = interpreter.caseAndOrMaybeShortCircuiting(left, right, mockBlindScope, false);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testMaybeRestrictName_restricted() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node node = new Node(Token.NAME);
        JSType originalType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType restrictedType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        FlowScope resultScope = interpreter.maybeRestrictName(mockBlindScope, node, originalType, restrictedType);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testMaybeRestrictName_notRestricted() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node node = new Node(Token.NAME);
        JSType originalType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        FlowScope resultScope = interpreter.maybeRestrictName(mockBlindScope, node, originalType, originalType);
        assertSame(mockBlindScope, resultScope);
    }

    @Test
    public void testMaybeRestrictTwoNames_bothRestricted() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = new Node(Token.NAME, "left");
        Node right = new Node(Token.NAME, "right");
        JSType originalLeft = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType restrictedLeft = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        JSType originalRight = mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_OBJECT);
        JSType restrictedRight = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        FlowScope resultScope = interpreter.maybeRestrictTwoNames(mockBlindScope,
                left, originalLeft, restrictedLeft,
                right, originalRight, restrictedRight);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testMaybeRestrictTwoNames_oneRestricted() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = new Node(Token.NAME, "left");
        Node right = new Node(Token.NAME, "right");
        JSType originalLeft = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType restrictedLeft = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        JSType originalRight = mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_OBJECT);
        FlowScope resultScope = interpreter.maybeRestrictTwoNames(mockBlindScope,
                left, originalLeft, restrictedLeft,
                right, originalRight, originalRight);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testMaybeRestrictTwoNames_noneRestricted() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = new Node(Token.NAME, "left");
        Node right = new Node(Token.NAME, "right");
        JSType originalLeft = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType originalRight = mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_OBJECT);
        FlowScope resultScope = interpreter.maybeRestrictTwoNames(mockBlindScope,
                left, originalLeft, originalLeft,
                right, originalRight, originalRight);
        assertSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseNameOrGetProp_outcomeTrue() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node nameNode = new Node(Token.NAME, "myVar");
        JSType type = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        // Mock the internal call to getRestrictedTypeGivenToBooleanOutcome
        // In a real scenario, this would be more complex, involving type resolution.
        // For simplicity, we assume the outcome is a refined scope.
        FlowScope resultScope = interpreter.caseNameOrGetProp(nameNode, mockBlindScope, true);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseInstanceOf_true() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = new Node(Token.NAME, "obj");
        FunctionType constructorType = mockTypeRegistry.createFunctionType("MyConstructor");
        Node right = constructorType.getPrototype();
        if (right == null) {
             right = new Node(Token.NAME, "MyConstructor");
             right.setJSType(constructorType);
        }
        Node condition = new Node(Token.INSTANCEOF, left, right);
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

     @Test
    public void testCaseIn_propertyExists() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node objectNode = new Node(Token.NAME, "obj");
        String propertyName = "toString";

        ObjectType objType = ObjectType.cast(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        objType.defineProperty("toString", mockTypeRegistry.getNativeType(JSTypeNative.FUNCTION_OBJECT), false, null);
        objectNode.setJSType(objType);

        FlowScope resultScope = interpreter.caseIn(objectNode, propertyName, mockBlindScope);
        assertSame(mockBlindScope, resultScope);
    }

    @Test
    public void testCaseIn_propertyDoesNotExistAndQualifiedName() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node objectNode = new Node(Token.NAME, "myObj");
        String propertyName = "nonExistentProp";

        ObjectType objType = ObjectType.cast(mockTypeRegistry.createObjectType("MyCustomObject"));
        objectNode.setJSType(objType);
        objectNode.setQualifiedName("myObj");

        FlowScope resultScope = interpreter.caseIn(objectNode, propertyName, mockBlindScope);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_typeofStringEq() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node operand = Node.newString("test");
        Node condition = new Node(Token.EQ, new Node(Token.TYPEOF, operand), Node.newString("string"));
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_typeofNumberNe() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node operand = Node.newNumber(123);
        Node condition = new Node(Token.NE, new Node(Token.TYPEOF, operand), Node.newString("number"));
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_andTrue() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newTrue();
        Node right = Node.newFalse();
        Node condition = new Node(Token.AND, left, right);
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_orFalse() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newTrue();
        Node right = Node.newFalse();
        Node condition = new Node(Token.OR, left, right);
        boolean outcome = false;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_nameTrue() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node nameNode = new Node(Token.NAME, "myVar");
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        nameNode.setJSType(stringType);
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(nameNode, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_assign() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node lhs = new Node(Token.NAME, "x");
        Node rhs = Node.newNumber(10);
        Node condition = new Node(Token.ASSIGN, lhs, rhs);
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_not() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node operand = Node.newFalse();
        Node condition = new Node(Token.NOT, operand);
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_greaterThan() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(5);
        Node condition = new Node(Token.GT, left, right);
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_lessThanOrEqual() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(10);
        Node condition = new Node(Token.LE, left, right);
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_instanceof() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = new Node(Token.NAME, "obj");
        FunctionType constructorType = mockTypeRegistry.createFunctionType("MyConstructor");
        Node right = constructorType.getPrototype();
         if (right == null) {
             right = new Node(Token.NAME, "MyConstructor");
             right.setJSType(constructorType);
         }
        Node condition = new Node(Token.INSTANCEOF, left, right);
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_caseTrue() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node switchCondition = new Node(Token.NAME, "val");
        Node caseValue = Node.newString("expected");
        Node caseNode = new Node(Token.CASE, caseValue);
        Node switchNode = new Node(Token.SWITCH, switchCondition);
        switchNode.addChildToBack(caseNode);
        caseNode.setParent(switchNode);
        boolean outcome = true;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_caseFalse() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node switchCondition = new Node(Token.NAME, "val");
        Node caseValue = Node.newString("expected");
        Node caseNode = new Node(Token.CASE, caseValue);
        Node switchNode = new Node(Token.SWITCH, switchCondition);
        switchNode.addChildToBack(caseNode);
        caseNode.setParent(switchNode);
        boolean outcome = false;
        FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, mockBlindScope, outcome);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testcaseEquality_nullEqNull() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = new Node(Token.NULL);
        Node right = new Node(Token.NULL);
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.EQ;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testcaseEquality_undefinedNeNull() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = new Node(Token.NAME);
        left.setType(Token.NAME);
        Node right = new Node(Token.NULL);
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.NE;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testcaseEquality_numberEqNumber() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newNumber(42.0);
        Node right = Node.newNumber(42.0);
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.EQ;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testcaseEquality_stringEqString() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newString("abc");
        Node right = Node.newString("abc");
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.EQ;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testcaseEquality_objectEqObject() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = new Node(Token.OBJECTLIT);
        Node right = new Node(Token.OBJECTLIT);
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.EQ;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testcaseEquality_booleanEqBoolean() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newTrue();
        Node right = Node.newTrue();
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.EQ;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testcaseEquality_numberNeString() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        Node left = Node.newNumber(10);
        Node right = Node.newString("10");
        Function<TypePair, TypePair> merging = SemanticReverseAbstractInterpreter.NE;
        FlowScope resultScope = interpreter.caseEquality(left, right, mockBlindScope, merging);
        assertNotSame(mockBlindScope, resultScope);
    }

    @Test
    public void testApplyEQ() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        TypePair input = new TypePair(stringType, stringType);
        TypePair result = interpreter.EQ.apply(input);
        assertNotNull(result);
        assertEquals(stringType, result.typeA);
        assertEquals(stringType, result.typeB);
    }

    @Test
    public void testApplyNE() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType numberType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        TypePair input = new TypePair(numberType, stringType);
        TypePair result = interpreter.NE.apply(input);
        assertNotNull(result);
        assertNotNull(result.typeA);
        assertNotNull(result.typeB);
    }

    @Test
    public void testApplySHEQ() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType objectType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        TypePair input = new TypePair(objectType, objectType);
        TypePair result = interpreter.SHEQ.apply(input);
        assertNotNull(result);
        assertEquals(objectType, result.typeA);
        assertEquals(objectType, result.typeB);
    }

    @Test
    public void testApplySHNE() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nullType = mockTypeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType undefinedType = mockTypeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
        TypePair input = new TypePair(nullType, undefinedType);
        TypePair result = interpreter.SHNE.apply(input);
        assertNotNull(result);
        assertNull(result.typeA);
        assertNull(result.typeB);
    }

    @Test
    public void testCaseUnknownType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType unknownType = mockTypeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        class MockRestrictByTrueTypeOfResultVisitor extends SemanticReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor {
            MockRestrictByTrueTypeOfResultVisitor(ObjectType target) { super(target); }
            @Override public JSType caseUnknownType() { return getNativeType(JSTypeNative.UNKNOWN_TYPE); }
        }
        class MockRestrictByFalseTypeOfResultVisitor extends SemanticReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor {
            MockRestrictByFalseTypeOfResultVisitor(ObjectType target) { super(target); }
            @Override public JSType caseUnknownType() { return getNativeType(JSTypeNative.UNKNOWN_TYPE); }
        }
        assertEquals(unknownType, unknownType.visit(new MockRestrictByTrueTypeOfResultVisitor(null)));
        assertEquals(unknownType, unknownType.visit(new MockRestrictByFalseTypeOfResultVisitor(null)));
    }

    @Test
    public void testCaseObjectType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        ObjectType objectType = ObjectType.cast(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        class MockRestrictByTrueTypeOfResultVisitor extends SemanticReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor {
            MockRestrictByTrueTypeOfResultVisitor(ObjectType target) { super(target); }
            @Override public JSType caseObjectType(ObjectType type) { return type; }
        }
        class MockRestrictByFalseTypeOfResultVisitor extends SemanticReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor {
            MockRestrictByFalseTypeOfResultVisitor(ObjectType target) { super(target); }
            @Override public JSType caseObjectType(ObjectType type) { return type; }
        }
        assertEquals(objectType, objectType.visit(new MockRestrictByTrueTypeOfResultVisitor(null)));
        assertEquals(objectType, objectType.visit(new MockRestrictByFalseTypeOfResultVisitor(null)));
    }

    @Test
    public void testCaseUnionType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType numberType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        UnionType unionType = UnionType.newBuilder(mockTypeRegistry).addAlternate(stringType).addAlternate(numberType).build();
        class MockRestrictByTrueTypeOfResultVisitor extends SemanticReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor {
            MockRestrictByTrueTypeOfResultVisitor(ObjectType target) { super(target); }
            @Override public JSType caseUnionType(UnionType type) { return type; }
        }
        class MockRestrictByFalseTypeOfResultVisitor extends SemanticReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor {
            MockRestrictByFalseTypeOfResultVisitor(ObjectType target) { super(target); }
            @Override public JSType caseUnionType(UnionType type) { return type; }
        }
        assertEquals(unionType, unionType.visit(new MockRestrictByTrueTypeOfResultVisitor(null)));
        assertEquals(unionType, unionType.visit(new MockRestrictByFalseTypeOfResultVisitor(null)));
    }

    @Test
    public void testCaseFunctionType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        FunctionType functionType = mockTypeRegistry.createFunctionType("MyFunc");
        class MockRestrictByTrueTypeOfResultVisitor extends SemanticReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor {
            MockRestrictByTrueTypeOfResultVisitor(ObjectType target) { super(target); }
            @Override public JSType caseFunctionType(FunctionType type) { return type; }
        }
        class MockRestrictByFalseTypeOfResultVisitor extends SemanticReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor {
            MockRestrictByFalseTypeOfResultVisitor(ObjectType target) { super(target); }
            @Override public JSType caseFunctionType(FunctionType type) { return type; }
        }
        assertEquals(functionType, functionType.visit(new MockRestrictByTrueTypeOfResultVisitor(null)));
        assertEquals(functionType, functionType.visit(new MockRestrictByFalseTypeOfResultVisitor(null)));
    }

    @Test
    public void testCompareJSTypes() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType numberType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        Comparator<JSType> comparator = JSType.ALPHA;
        int comparison = comparator.compare(stringType, numberType);
        assertTrue(comparison > 0 || comparison < 0);
    }

    @Test
    public void testGetJSDocInfo() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertNull(interpreter.getJSDocInfo());
    }

    @Test
    public void testGetDisplayName() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertNull(interpreter.getDisplayName());
    }

    @Test
    public void testHasDisplayName() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.hasDisplayName());
    }

    @Test
    public void testIsNoType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isNoType());
    }

    @Test
    public void testIsNoResolvedType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isNoResolvedType());
    }

    @Test
    public void testIsNoObjectType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isNoObjectType());
    }

    @Test
    public void testIsEmptyType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isEmptyType());
    }

    @Test
    public void testIsString() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isString());
    }

    @Test
    public void testIsNumber() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isNumber());
    }

    @Test
    public void testIsObject() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isObject());
    }

    @Test
    public void testIsConstructor() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isConstructor());
    }

    @Test
    public void testIsInstanceType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isInstanceType());
    }

    @Test
    public void testIsInterface() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isInterface());
    }

    @Test
    public void testIsOrdinaryFunction() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isOrdinaryFunction());
    }

    @Test
    public void testIsEquivalentTo() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        assertTrue(interpreter.isEquivalentTo(stringType));
    }

    @Test
    public void testIsEquivalentStatic() throws Exception {
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        assertTrue(JSType.isEquivalent(stringType, stringType));
        assertFalse(JSType.isEquivalent(stringType, mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT)));
        assertFalse(JSType.isEquivalent(null, stringType));
        assertTrue(JSType.isEquivalent(null, null));
    }

    @Test
    public void testMatchesNumberContext() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.matchesNumberContext());
    }

    @Test
    public void testGetRestrictedWithoutNull() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nullType = mockTypeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        UnionType unionType = UnionType.newBuilder(mockTypeRegistry).addAlternate(nullType).addAlternate(stringType).build();

        JSType result = unionType.restrictByNotNullOrUndefined();
        assertNotNull(result);
        assertFalse(result.isUnionType());
        assertEquals(stringType, result);
    }

    @Test
    public void testGetRestrictedWithoutUndefined() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType undefinedType = mockTypeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        UnionType unionType = UnionType.newBuilder(mockTypeRegistry).addAlternate(undefinedType).addAlternate(stringType).build();

        JSType result = unionType.restrictByNotNullOrUndefined();
        assertNotNull(result);
        assertFalse(result.isUnionType());
        assertEquals(stringType, result);
    }

    @Test
    public void testGetTypePair() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType numberType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);

        TypePair equalityResult = stringType.getTypesUnderEquality(numberType);
        assertNotNull(equalityResult);
        assertNull(equalityResult.typeA);
        assertNull(equalityResult.typeB);

        TypePair inequalityResult = stringType.getTypesUnderInequality(numberType);
        assertNotNull(inequalityResult);
        assertEquals(stringType, inequalityResult.typeA);
        assertEquals(numberType, inequalityResult.typeB);

        TypePair shallowEqualityResult = stringType.getTypesUnderShallowEquality(stringType);
        assertNotNull(shallowEqualityResult);
        assertEquals(stringType, shallowEqualityResult.typeA);
        assertEquals(stringType, shallowEqualityResult.typeB);

        TypePair shallowInequalityResult = stringType.getTypesUnderShallowInequality(numberType);
        assertNotNull(shallowInequalityResult);
        assertEquals(stringType, shallowInequalityResult.typeA);
        assertEquals(numberType, shallowInequalityResult.typeB);
    }

    @Test
    public void testIsSubtype() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType objectType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType unknownType = mockTypeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

        assertTrue(stringType.isSubtype(stringType));
        assertTrue(stringType.isSubtype(objectType));
        assertTrue(stringType.isSubtype(unknownType));
        assertFalse(objectType.isSubtype(stringType));
    }

    @Test
    public void testGetLeastSupertype() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType numberType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        JSType objectType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);

        JSType unionOfStringsAndNumbers = stringType.getLeastSupertype(numberType);
        assertTrue(unionOfStringsAndNumbers.isUnionType());

        JSType superTypeOfStringsAndObjects = stringType.getLeastSupertype(objectType);
        assertEquals(objectType, superTypeOfStringsAndObjects);
    }

    @Test
    public void testGetGreatestSubtype() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType numberType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        JSType objectType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);

        JSType subTypeOfStringsAndNumbers = stringType.getGreatestSubtype(numberType);
        assertTrue(subTypeOfStringsAndNumbers.isNoType() || subTypeOfStringsAndNumbers.isNoObjectType());

        JSType subTypeOfStringsAndString = stringType.getGreatestSubtype(stringType);
        assertEquals(stringType, subTypeOfStringsAndString);
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType nullType = mockTypeRegistry.getNativeType(JSTypeNative.NULL_TYPE);

        JSType restrictedTrue = stringType.getRestrictedTypeGivenToBooleanOutcome(true);
        assertNotNull(restrictedTrue);
        assertEquals(stringType, restrictedTrue);

        JSType restrictedFalse = stringType.getRestrictedTypeGivenToBooleanOutcome(false);
        assertNotNull(restrictedFalse);
        assertNotEquals(stringType, restrictedFalse);
    }

    @Test
    public void testGetPossibleToBooleanOutcomes() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType nullType = mockTypeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType booleanType = mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_OBJECT);

        assertTrue(stringType.getPossibleToBooleanOutcomes().contains(true));
        assertTrue(stringType.getPossibleToBooleanOutcomes().contains(false));

        assertFalse(nullType.getPossibleToBooleanOutcomes().contains(true));
        assertTrue(nullType.getPossibleToBooleanOutcomes().contains(false));

        assertTrue(booleanType.getPossibleToBooleanOutcomes().contains(true));
        assertTrue(booleanType.getPossibleToBooleanOutcomes().contains(false));
    }

    @Test
    public void testCanAssignTo() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType objectType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);

        assertTrue(stringType.canAssignTo(objectType));
        assertFalse(objectType.canAssignTo(stringType));
        assertTrue(stringType.canAssignTo(stringType));
    }

    @Test
    public void testAutoboxesToAndDereference() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringValueType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_VALUE_TYPE);
        JSType stringObjectType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);

        JSType autoboxed = stringValueType.autoboxesTo();
        assertNotNull(autoboxed);
        assertEquals(stringObjectType, autoboxed);

        ObjectType dereferenced = stringValueType.dereference();
        assertNotNull(dereferenced);
        assertEquals(stringObjectType, dereferenced);
    }

    @Test
    public void testFindPropertyType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        ObjectType objectType = ObjectType.cast(mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        objectType.defineProperty("testProp", mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT), false, null);

        JSType propType = objectType.findPropertyType("testProp");
        assertNotNull(propType);
        assertEquals(mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT), propType);

        assertNull(objectType.findPropertyType("nonExistentProp"));
    }

    @Test
    public void testCanBeCalled() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        FunctionType functionType = mockTypeRegistry.createFunctionType("MyFunc");
        assertTrue(functionType.canBeCalled());

        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        assertFalse(stringType.canBeCalled());
    }

    @Test
    public void testIsNullable() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nullType = mockTypeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);

        assertTrue(nullType.isNullable());
        assertFalse(stringType.isNullable());

        UnionType unionWithNull = UnionType.newBuilder(mockTypeRegistry).addAlternate(nullType).addAlternate(stringType).build();
        assertTrue(unionWithNull.isNullable());
    }

    @Test
    public void testCollapseUnion() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType numberType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        UnionType unionType = UnionType.newBuilder(mockTypeRegistry).addAlternate(stringType).addAlternate(numberType).build();

        JSType collapsed = unionType.collapseUnion();
        assertEquals(unionType, collapsed);

        JSType nonUnion = mockTypeRegistry.getNativeType(JSTypeNative.BOOLEAN_OBJECT);
        assertEquals(nonUnion, nonUnion.collapseUnion());
    }

    @Test
    public void testNullTypeMethods() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nullType = mockTypeRegistry.getNativeType(JSTypeNative.NULL_TYPE);

        assertTrue(nullType.isNullType());
        assertFalse(nullType.isVoidType());
        assertFalse(nullType.isAllType());
        assertFalse(nullType.isUnknownType());
        assertFalse(nullType.isString());
        assertFalse(nullType.isNumber());
        assertFalse(nullType.isObject());
    }

    @Test
    public void testVoidTypeMethods() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType voidType = mockTypeRegistry.getNativeType(JSTypeNative.VOID_TYPE);

        assertTrue(voidType.isVoidType());
        assertFalse(voidType.isNullType());
        assertFalse(voidType.isAllType());
        assertFalse(voidType.isUnknownType());
        assertFalse(voidType.isString());
        assertFalse(voidType.isNumber());
        assertFalse(voidType.isObject());
    }

    @Test
    public void testAllTypeMethods() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        assertFalse(interpreter.isAllType());
    }

    @Test
    public void testUnknownTypeMethods() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType unknownType = mockTypeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertTrue(unknownType.isUnknownType());
        assertFalse(unknownType.isAllType());
    }

    @Test
    public void testIsUnionType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType numberType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        UnionType unionType = UnionType.newBuilder(mockTypeRegistry).addAlternate(stringType).addAlternate(numberType).build();
        assertTrue(unionType.isUnionType());
        assertFalse(stringType.isUnionType());
    }

    @Test
    public void testToMaybeUnionType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT);
        JSType numberType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        UnionType unionType = UnionType.newBuilder(mockTypeRegistry).addAlternate(stringType).addAlternate(numberType).build();
        assertNotNull(unionType.toMaybeUnionType());
        assertNull(stringType.toMaybeUnionType());
    }

    @Test
    public void testIsGlobalThisType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType globalThisType = mockTypeRegistry.getNativeType(JSTypeNative.GLOBAL_THIS);
        assertTrue(globalThisType.isGlobalThisType());
        assertFalse(mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT).isGlobalThisType());
    }

    @Test
    public void testIsFunctionType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        FunctionType functionType = mockTypeRegistry.createFunctionType("MyFunc");
        assertTrue(functionType.isFunctionType());
        assertFalse(mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT).isFunctionType());
    }

    @Test
    public void testToMaybeFunctionType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        FunctionType functionType = mockTypeRegistry.createFunctionType("MyFunc");
        assertNotNull(functionType.toMaybeFunctionType());
        assertNull(mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT).toMaybeFunctionType());
    }

    @Test
    public void testIsEnumElementType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        assertFalse(nativeType.isEnumElementType());
    }

    @Test
    public void testToMaybeEnumElementType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        assertNull(nativeType.toMaybeEnumElementType());
    }

    @Test
    public void testIsEnumType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        assertFalse(nativeType.isEnumType());
    }

    @Test
    public void testToMaybeEnumType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT);
        assertNull(nativeType.toMaybeEnumType());
    }

    @Test
    public void testIsRecordType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        RecordType recordType = mockTypeRegistry.createRecordType(new LinkedHashMap<String, JSType>());
        assertTrue(recordType.isRecordType());
        assertFalse(mockTypeRegistry.getNativeType(JSTypeNative.STRING_OBJECT).isRecordType());
    }

    @Test
    public void testIsParameterizedType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertFalse(nativeType.isParameterizedType());
    }

    @Test
    public void testToMaybeParameterizedType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertNull(nativeType.toMaybeParameterizedType());
    }

    @Test
    public void testIsTemplateType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertFalse(nativeType.isTemplateType());
    }

    @Test
    public void testToMaybeTemplateType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertNull(nativeType.toMaybeTemplateType());
    }

    @Test
    public void testHasAnyTemplate() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertFalse(nativeType.hasAnyTemplate());
    }

    @Test
    public void testIsNominalType() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertFalse(nativeType.isNominalType());
    }

    @Test
    public void testIsNominalConstructor() throws Exception {
        SemanticReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nativeType = mockTypeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertFalse(nativeType.isNominalConstructor());
    }
}
```