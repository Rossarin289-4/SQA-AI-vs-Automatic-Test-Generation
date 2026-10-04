package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.rhino.Node;
import java.util.Map;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor;
import com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor;

public class ClosureReverseAbstractInterpreterTest {

    private JSTypeRegistry registry = new JSTypeRegistry(null);
    private CodingConvention convention = new GoogleCodingConvention();

    private ClosureReverseAbstractInterpreter createInterpreter() {
        return new ClosureReverseAbstractInterpreter(convention, registry);
    }

    private JSType getNativeType(JSTypeNative typeId) {
        return registry.getNativeType(typeId);
    }

    // Helper method to call getObjectType from the JSTypeRegistry
    private ObjectType getObjectTypeFromRegistry(String name) {
        return (ObjectType) registry.getFunctionType(name);
    }

    private FunctionType getFunctionTypeFromRegistry(String name) {
        return (FunctionType) registry.getFunctionType(name);
    }

    private ObjectType createAnonymousObjectType() {
        return registry.createAnonymousObjectType();
    }

    // Helper method to access protected methods of ClosureReverseAbstractInterpreter
    private JSType invokeRestricter(ClosureReverseAbstractInterpreter interpreter, String key, JSType type, boolean outcome) {
        TypeRestriction restriction = new TypeRestriction(type, outcome);
        return interpreter.restricters.get(key).apply(restriction);
    }

    private JSType invokeRestrictToArrayVisitor(ClosureReverseAbstractInterpreter interpreter, JSType type, boolean outcome) {
        Visitor<JSType> visitor = outcome ? interpreter.restrictToArrayVisitor : interpreter.restrictToNotArrayVisitor;
        if (type == null) {
            return null; // Or handle as per visitor's logic if null is a valid input
        }
        if (type instanceof ObjectType) {
            return visitor.caseObjectType((ObjectType) type);
        } else {
            // For other types, we might need to call a different case method or handle it.
            // Assuming for now that visitors are primarily for ObjectType.
            // If a visitor has a caseTopType, it might be used here.
            if (visitor instanceof RestrictByTrueTypeOfResultVisitor) {
                return ((RestrictByTrueTypeOfResultVisitor) visitor).caseTopType(type);
            } else if (visitor instanceof RestrictByFalseTypeOfResultVisitor) {
                // The RestrictByFalseTypeOfResultVisitor might not have a specific caseTopType.
                // We rely on its default behavior or other applicable cases.
                // For simplicity, let's assume it returns type itself if not an ObjectType or null.
                return type; // Default behavior if not an ObjectType
            }
            return type;
        }
    }

    private JSType invokeRestrictToObjectVisitor(ClosureReverseAbstractInterpreter interpreter, JSType type, boolean outcome) {
        Visitor<JSType> visitor = outcome ? interpreter.restrictToObjectVisitor : interpreter.restrictToNotObjectVisitor;
        if (type == null) {
            return null;
        }
        if (type instanceof ObjectType) {
            return visitor.caseObjectType((ObjectType) type);
        } else if (type instanceof FunctionType) {
            return visitor.caseFunctionType((FunctionType) type);
        } else {
            if (visitor instanceof RestrictByTrueTypeOfResultVisitor) {
                return ((RestrictByTrueTypeOfResultVisitor) visitor).caseTopType(type);
            } else if (visitor instanceof RestrictByFalseTypeOfResultVisitor) {
                return type; // Default behavior if not an ObjectType or FunctionType
            }
            return type;
        }
    }


    @Test
    public void testIsDefTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType nullType = getNativeType(JSTypeNative.NULL_TYPE);
        JSType voidType = getNativeType(JSTypeNative.VOID_TYPE);

        JSType restrictedNull = invokeRestricter(interpreter, "isDef", nullType, true);
        assertEquals(nullType, restrictedNull); // null is not undefined

        JSType restrictedVoid = invokeRestricter(interpreter, "isDef", voidType, true);
        assertEquals(voidType, restrictedVoid); // void is not undefined

        JSType restrictedUnknown = invokeRestricter(interpreter, "isDef", unknownType, true);
        assertTrue(restrictedUnknown.isUnknownType()); // unknown remains unknown
    }

    @Test
    public void testIsDefFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType nullType = getNativeType(JSTypeNative.NULL_TYPE);
        JSType voidType = getNativeType(JSTypeNative.VOID_TYPE);

        JSType restrictedNull = invokeRestricter(interpreter, "isDef", nullType, false);
        assertNull(restrictedNull); // null is removed

        JSType restrictedVoid = invokeRestricter(interpreter, "isDef", voidType, false);
        assertEquals(voidType, restrictedVoid); // void is not null

        JSType restrictedUnknown = invokeRestricter(interpreter, "isDef", unknownType, false);
        assertTrue(restrictedUnknown.isUnknownType()); // unknown remains unknown
    }

    @Test
    public void testIsDefAndNotNullTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType nullType = getNativeType(JSTypeNative.NULL_TYPE);
        JSType voidType = getNativeType(JSTypeNative.VOID_TYPE);

        JSType restrictedNull = invokeRestricter(interpreter, "isDefAndNotNull", nullType, true);
        assertNull(restrictedNull); // null is removed

        JSType restrictedVoid = invokeRestricter(interpreter, "isDefAndNotNull", voidType, true);
        assertNull(restrictedVoid); // void is removed

        JSType restrictedUnknown = invokeRestricter(interpreter, "isDefAndNotNull", unknownType, true);
        assertTrue(restrictedUnknown.isUnknownType()); // unknown remains unknown
    }

    @Test
    public void testIsStringTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedString = invokeRestricter(interpreter, "isString", stringType, true);
        assertEquals(stringType, restrictedString);

        JSType restrictedNumber = invokeRestricter(interpreter, "isString", numberType, true);
        assertNull(restrictedNumber);

        JSType restrictedUnknown = invokeRestricter(interpreter, "isString", unknownType, true);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsStringFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType stringType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedString = invokeRestricter(interpreter, "isString", stringType, false);
        assertNull(restrictedString);

        JSType restrictedNumber = invokeRestricter(interpreter, "isString", numberType, false);
        assertEquals(stringType, restrictedNumber);

        JSType restrictedUnknown = invokeRestricter(interpreter, "isString", unknownType, false);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsBooleanTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType booleanType = getNativeType(JSTypeNative.BOOLEAN_TYPE);
        JSType numberType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedBoolean = invokeRestricter(interpreter, "isBoolean", booleanType, true);
        assertEquals(booleanType, restrictedBoolean);

        JSType restrictedNumber = invokeRestricter(interpreter, "isBoolean", numberType, true);
        assertNull(restrictedNumber);

        JSType restrictedUnknown = invokeRestricter(interpreter, "isBoolean", unknownType, true);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsBooleanFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType booleanType = getNativeType(JSTypeNative.BOOLEAN_TYPE);
        JSType numberType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedBoolean = invokeRestricter(interpreter, "isBoolean", booleanType, false);
        assertNull(restrictedBoolean);

        JSType restrictedNumber = invokeRestricter(interpreter, "isBoolean", numberType, false);
        assertEquals(booleanType, restrictedNumber);

        JSType restrictedUnknown = invokeRestricter(interpreter, "isBoolean", unknownType, false);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsNumberTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType numberType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedNumber = invokeRestricter(interpreter, "isNumber", numberType, true);
        assertEquals(numberType, restrictedNumber);

        JSType restrictedString = invokeRestricter(interpreter, "isNumber", stringType, true);
        assertNull(restrictedString);

        JSType restrictedUnknown = invokeRestricter(interpreter, "isNumber", unknownType, true);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsNumberFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType numberType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedNumber = invokeRestricter(interpreter, "isNumber", numberType, false);
        assertNull(restrictedNumber);

        JSType restrictedString = invokeRestricter(interpreter, "isNumber", stringType, false);
        assertEquals(numberType, restrictedString);

        JSType restrictedUnknown = invokeRestricter(interpreter, "isNumber", unknownType, false);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsFunctionTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        FunctionType functionType = getFunctionTypeFromRegistry("function");
        ObjectType objectType = getObjectTypeFromRegistry("Object");
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedFunction = invokeRestricter(interpreter, "isFunction", functionType, true);
        assertEquals(functionType, restrictedFunction);

        JSType restrictedObject = invokeRestricter(interpreter, "isFunction", objectType, true);
        assertNull(restrictedObject);

        JSType restrictedUnknown = invokeRestricter(interpreter, "isFunction", unknownType, true);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsFunctionFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        FunctionType functionType = getFunctionTypeFromRegistry("function");
        ObjectType objectType = getObjectTypeFromRegistry("Object");
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedFunction = invokeRestricter(interpreter, "isFunction", functionType, false);
        assertNull(restrictedFunction);

        JSType restrictedObject = invokeRestricter(interpreter, "isFunction", objectType, false);
        assertEquals(functionType, restrictedObject);

        JSType restrictedUnknown = invokeRestricter(interpreter, "isFunction", unknownType, false);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsArrayTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType arrayType = getNativeType(JSTypeNative.ARRAY_TYPE);
        ObjectType objectType = getObjectTypeFromRegistry("Object");
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedArray = invokeRestrictToArrayVisitor(interpreter, arrayType, true);
        assertEquals(arrayType, restrictedArray);

        JSType restrictedObject = invokeRestrictToArrayVisitor(interpreter, objectType, true);
        assertNull(restrictedObject);

        JSType restrictedUnknown = invokeRestrictToArrayVisitor(interpreter, unknownType, true);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsArrayFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType arrayType = getNativeType(JSTypeNative.ARRAY_TYPE);
        ObjectType objectType = getObjectTypeFromRegistry("Object");
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedArray = invokeRestrictToArrayVisitor(interpreter, arrayType, false);
        assertNull(restrictedArray);

        JSType restrictedObject = invokeRestrictToArrayVisitor(interpreter, objectType, false);
        assertEquals(objectType, restrictedObject);

        JSType restrictedUnknown = invokeRestrictToArrayVisitor(interpreter, unknownType, false);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsObjectTrue() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        ObjectType objectType = getObjectTypeFromRegistry("Object");
        FunctionType functionType = getFunctionTypeFromRegistry("function");
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedObject = invokeRestrictToObjectVisitor(interpreter, objectType, true);
        assertEquals(objectType, restrictedObject);

        JSType restrictedFunction = invokeRestrictToObjectVisitor(interpreter, functionType, true);
        assertEquals(functionType, restrictedFunction);

        JSType restrictedUnknown = invokeRestrictToObjectVisitor(interpreter, unknownType, true);
        assertTrue(restrictedUnknown.isNoObjectType());
    }

    @Test
    public void testIsObjectFalse() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        ObjectType objectType = getObjectTypeFromRegistry("Object");
        FunctionType functionType = getFunctionTypeFromRegistry("function");
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedObject = invokeRestrictToObjectVisitor(interpreter, objectType, false);
        assertNull(restrictedObject);

        JSType restrictedFunction = invokeRestrictToObjectVisitor(interpreter, functionType, false);
        assertNull(restrictedFunction);

        JSType restrictedUnknown = invokeRestrictToObjectVisitor(interpreter, unknownType, false);
        assertTrue(restrictedUnknown.isUnknownType()); // Should not be restricted
    }

    @Test
    public void testIsNullable() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nullType = getNativeType(JSTypeNative.NULL_TYPE);
        JSType numberType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedNull = invokeRestricter(interpreter, "isNull", nullType, true);
        assertEquals(nullType, restrictedNull);

        JSType restrictedNumber = invokeRestricter(interpreter, "isNull", numberType, true);
        assertNull(restrictedNumber);

        JSType restrictedUnknown = invokeRestricter(interpreter, "isNull", unknownType, true);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testIsNotNullable() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nullType = getNativeType(JSTypeNative.NULL_TYPE);
        JSType numberType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);

        JSType restrictedNull = invokeRestricter(interpreter, "isNull", nullType, false);
        assertEquals(unknownType, restrictedNull); // null is removed, unknown remains

        JSType restrictedNumber = invokeRestricter(interpreter, "isNull", numberType, false);
        assertEquals(numberType, restrictedNumber); // number is not null

        JSType restrictedUnknown = invokeRestricter(interpreter, "isNull", unknownType, false);
        assertTrue(restrictedUnknown.isUnknownType()); // unknown remains unknown
    }


    @Test
    public void testIsObjectWithNullType() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nullType = getNativeType(JSTypeNative.NULL_TYPE);

        // When goog.isObject returns true, and the input is null, it should remain null.
        JSType restrictedNullForObjectTrue = invokeRestricter(interpreter, "isObject", nullType, true);
        assertEquals(nullType, restrictedNullForObjectTrue);

        // When goog.isObject returns false, and the input is null, it should become null.
        JSType restrictedNullForObjectFalse = invokeRestricter(interpreter, "isObject", nullType, false);
        assertNull(restrictedNullForObjectFalse);
    }

    @Test
    public void testIsArrayWithNullType() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType nullType = getNativeType(JSTypeNative.NULL_TYPE);

        // When goog.isArray returns true, and the input is null, it should remain null.
        JSType restrictedNullForArrayTrue = invokeRestricter(interpreter, "isArray", nullType, true);
        assertEquals(nullType, restrictedNullForArrayTrue);

        // When goog.isArray returns false, and the input is null, it should become null.
        JSType restrictedNullForArrayFalse = invokeRestricter(interpreter, "isArray", nullType, false);
        assertNull(restrictedNullForArrayFalse);
    }

    @Test
    public void testComplexTypeRestrictions() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        JSType unknown = getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType nullableNumber = registry.createNullableType(getNativeType(JSTypeNative.NUMBER_TYPE));
        JSType nullableString = registry.createNullableType(getNativeType(JSTypeNative.STRING_TYPE));

        // Test isDefAndNotNull with nullable types
        JSType restrictedNullableNumber = invokeRestricter(interpreter, "isDefAndNotNull", nullableNumber, true);
        assertEquals(getNativeType(JSTypeNative.NUMBER_TYPE), restrictedNullableNumber);

        JSType restrictedNullableString = invokeRestricter(interpreter, "isDefAndNotNull", nullableString, true);
        assertEquals(getNativeType(JSTypeNative.STRING_TYPE), restrictedNullableString);

        JSType restrictedUnknown = invokeRestricter(interpreter, "isDefAndNotNull", unknown, true);
        assertTrue(restrictedUnknown.isUnknownType());
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsDef() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        callee.addChildToBack(new Node(Token.NAME, "goog"));
        callee.addChildToBack(new Node(Token.STRING, "isDef"));
        condition.addChildToBack(callee);
        condition.addChildToBack(new Node(Token.NAME, "x"));

        Scope enclosingScope = new Scope(new Node(Token.BLOCK), convention);
        FlowScope blindScope = LinkedFlowScope.createEntryLattice(enclosingScope);
        ObjectType unknownObjectType = (ObjectType) getNativeType(JSTypeNative.UNKNOWN_TYPE);
        enclosingScope.declare("x", unknownObjectType, false);


        // goog.isDef(x) is true
        FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        JSType xTypeTrue = trueScope.getSlot("x").getType();
        assertNotNull(xTypeTrue);
        assertFalse(xTypeTrue.isNullable()); // Should not be null or undefined

        // goog.isDef(x) is false
        FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        JSType xTypeFalse = falseScope.getSlot("x").getType();
        assertNotNull(xTypeFalse);
        assertTrue(xTypeFalse.isNullable()); // Can be null or undefined
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsNull() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        callee.addChildToBack(new Node(Token.NAME, "goog"));
        callee.addChildToBack(new Node(Token.STRING, "isNull"));
        condition.addChildToBack(callee);
        condition.addChildToBack(new Node(Token.NAME, "x"));

        Scope enclosingScope = new Scope(new Node(Token.BLOCK), convention);
        FlowScope blindScope = LinkedFlowScope.createEntryLattice(enclosingScope);
        ObjectType unknownObjectType = (ObjectType) getNativeType(JSTypeNative.UNKNOWN_TYPE);
        enclosingScope.declare("x", unknownObjectType, false);

        // goog.isNull(x) is true
        FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        JSType xTypeTrue = trueScope.getSlot("x").getType();
        assertNotNull(xTypeTrue);
        assertTrue(xTypeTrue.isNullType()); // Should be null

        // goog.isNull(x) is false
        FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        JSType xTypeFalse = falseScope.getSlot("x").getType();
        assertNotNull(xTypeFalse);
        assertFalse(xTypeFalse.isNullable()); // Should not be null
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsObject() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        callee.addChildToBack(new Node(Token.NAME, "goog"));
        callee.addChildToBack(new Node(Token.STRING, "isObject"));
        condition.addChildToBack(callee);
        condition.addChildToBack(new Node(Token.NAME, "x"));

        Scope enclosingScope = new Scope(new Node(Token.BLOCK), convention);
        FlowScope blindScope = LinkedFlowScope.createEntryLattice(enclosingScope);
        ObjectType unknownObjectType = (ObjectType) getNativeType(JSTypeNative.UNKNOWN_TYPE);
        enclosingScope.declare("x", unknownObjectType, false);

        // goog.isObject(x) is true
        FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        JSType xTypeTrue = trueScope.getSlot("x").getType();
        assertNotNull(xTypeTrue);
        assertTrue(xTypeTrue.isObject()); // Should be an object (or function)
        assertFalse(xTypeTrue.isNullType()); // Should not be null

        // goog.isObject(x) is false
        FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        JSType xTypeFalse = falseScope.getSlot("x").getType();
        assertNotNull(xTypeFalse);
        assertFalse(xTypeFalse.isObject()); // Should not be an object or function
        assertTrue(xTypeFalse.isNullable() || xTypeFalse.isVoidType()); // Can be null or undefined
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsArray() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        callee.addChildToBack(new Node(Token.NAME, "goog"));
        callee.addChildToBack(new Node(Token.STRING, "isArray"));
        condition.addChildToBack(callee);
        condition.addChildToBack(new Node(Token.NAME, "x"));

        Scope enclosingScope = new Scope(new Node(Token.BLOCK), convention);
        FlowScope blindScope = LinkedFlowScope.createEntryLattice(enclosingScope);
        ObjectType unknownObjectType = (ObjectType) getNativeType(JSTypeNative.UNKNOWN_TYPE);
        enclosingScope.declare("x", unknownObjectType, false);

        // goog.isArray(x) is true
        FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        JSType xTypeTrue = trueScope.getSlot("x").getType();
        assertNotNull(xTypeTrue);
        assertTrue(xTypeTrue.isArrayType()); // Should be an array

        // goog.isArray(x) is false
        FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        JSType xTypeFalse = falseScope.getSlot("x").getType();
        assertNotNull(xTypeFalse);
        assertFalse(xTypeFalse.isArrayType()); // Should not be an array
    }

    // Inner class to simulate the TypeRestriction
    private static class TypeRestriction {
        private final JSType type;
        private final boolean outcome;

        private TypeRestriction(JSType type, boolean outcome) {
            this.type = type;
            this.outcome = outcome;
        }
    }
}
