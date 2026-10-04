package com.google.javascript.jscomp.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.Visitor;

public class ChainableReverseAbstractInterpreterTest {
    @Test
    public void testAppendAndGetFirstFromLastLink() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter first =
                new ClosureReverseAbstractInterpreter(null, registry);
        ChainableReverseAbstractInterpreter last =
                new ClosureReverseAbstractInterpreter(null, registry);
        assertSame(last, first.append(last));
        assertSame(first, last.getFirst());
        assertSame(first, first.getFirst());
    }

    @Test
    public void testGetFirstOnUnchainedInterpreter() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        assertSame(interpreter, interpreter.getFirst());
    }

    @Test
    public void testAppendSecondLinkMaintainsOriginalFirst() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter first =
                new ClosureReverseAbstractInterpreter(null, registry);
        ChainableReverseAbstractInterpreter second =
                new ClosureReverseAbstractInterpreter(null, registry);
        ChainableReverseAbstractInterpreter third =
                new ClosureReverseAbstractInterpreter(null, registry);
        first.append(second);
        assertSame(third, second.append(third));
        assertSame(first, third.getFirst());
    }

    @Test
    public void testUnknownTypeUnrecognizedTypeofIsCheckedUnknown() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType result =
                interpreter.getRestrictedByTypeOfResult(null, "other", true);
        assertSame(registry.getNativeType(JSTypeNative.CHECKED_UNKNOWN_TYPE), result);
    }

    @Test
    public void testNullTypeInputMatchingNumberResolvesToNumber() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType result =
                interpreter.getRestrictedByTypeOfResult(null, "number", true);
        assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
    }

    @Test
    public void testNullTypeInputWithUnequalResultIsNull() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        assertNull(interpreter.getRestrictedByTypeOfResult(null, "number", false));
    }

    @Test
    public void testNumberTypeMatchesNumber() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertSame(number, interpreter.getRestrictedByTypeOfResult(number, "number", true));
    }

    @Test
    public void testNumberTypeDoesNotMatchString() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNull(interpreter.getRestrictedByTypeOfResult(number, "string", true));
    }

    @Test
    public void testNumberTypeSurvivesNotStringResult() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertSame(number, interpreter.getRestrictedByTypeOfResult(number, "string", false));
    }

    @Test
    public void testNullTypeMatchesObjectResult() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        assertSame(nullType, interpreter.getRestrictedByTypeOfResult(nullType, "object", true));
    }

    @Test
    public void testNullTypeDoesNotMatchFunctionResult() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        assertNull(interpreter.getRestrictedByTypeOfResult(nullType, "function", true));
    }

    @Test
    public void testVoidTypeMatchesUndefinedResult() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        assertSame(voidType, interpreter.getRestrictedByTypeOfResult(voidType, "undefined", true));
    }

    @Test
    public void testVoidTypeDoesNotMatchObjectResult() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        assertNull(interpreter.getRestrictedByTypeOfResult(voidType, "object", true));
    }

    @Test
    public void testBooleanTypeMatchesBooleanResult() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType bool = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        assertSame(bool, interpreter.getRestrictedByTypeOfResult(bool, "boolean", true));
    }

    @Test
    public void testStringTypeMatchesStringResult() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertSame(string, interpreter.getRestrictedByTypeOfResult(string, "string", true));
    }

    @Test
    public void testAllTypeWithMatchingBooleanNarrowsToBoolean() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        assertSame(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE),
                interpreter.getRestrictedByTypeOfResult(all, "boolean", true));
    }

    @Test
    public void testAllTypeWithUnknownMatchRemainsAll() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        assertSame(all, interpreter.getRestrictedByTypeOfResult(all, "object", true));
    }

    @Test
    public void testUnknownTypeWithMatchingStringNarrowsToString() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertSame(registry.getNativeType(JSTypeNative.STRING_TYPE),
                interpreter.getRestrictedByTypeOfResult(unknown, "string", true));
    }

    @Test
    public void testUnknownTypeNotMatchingStringBecomesCheckedUnknown() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertSame(registry.getNativeType(JSTypeNative.CHECKED_UNKNOWN_TYPE),
                interpreter.getRestrictedByTypeOfResult(unknown, "string", false));
    }

    @Test
    public void testNoTypeSurvivesTypeofRestriction() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        assertSame(noType, interpreter.getRestrictedByTypeOfResult(noType, "string", true));
    }

    @Test
    public void testRestrictWithoutUndefinedForPrimitive() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertSame(number, interpreter.getRestrictedWithoutUndefined(number));
    }

    @Test
    public void testRestrictWithoutNullForPrimitive() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertSame(string, interpreter.getRestrictedWithoutNull(string));
    }

    @Test
    public void testRestrictNullInputWithoutUndefined() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        assertNull(interpreter.getRestrictedWithoutUndefined(null));
    }

    @Test
    public void testRestrictNullInputWithoutNull() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        assertNull(interpreter.getRestrictedWithoutNull(null));
    }

    @Test
    public void testAllTypeDropsUndefined() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType restricted = interpreter.getRestrictedWithoutUndefined(all);
        assertNotNull(restricted);
        assertFalse(restricted.isAllType());
        assertFalse(restricted.isUnknownType());
    }

    @Test
    public void testAllTypeDropsNull() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType restricted = interpreter.getRestrictedWithoutNull(all);
        assertNotNull(restricted);
        assertFalse(restricted.isAllType());
        assertFalse(restricted.isUnknownType());
    }

    @Test
    public void testVoidTypeIsRemovedByUndefinedRestriction() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        assertNull(interpreter.getRestrictedWithoutUndefined(voidType));
    }

    @Test
    public void testNullTypeIsRemovedByNullRestriction() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        assertNull(interpreter.getRestrictedWithoutNull(nullType));
    }

    @Test
    public void testNoObjectTypeRestrictionPreservesNoObjectType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType noObject = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
        assertSame(noObject, interpreter.getRestrictedWithoutUndefined(noObject));
        assertSame(noObject, interpreter.getRestrictedWithoutNull(noObject));
    }

    @Test
    public void testBooleanTypeBranchesReturnNativeBoolean() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType bool = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        assertSame(bool, interpreter.getRestrictedWithoutUndefined(bool));
        assertSame(bool, interpreter.getRestrictedWithoutNull(bool));
    }

    @Test
    public void testUnionRestrictionRemovesUndefinedAndNullAlternatives() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, registry);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        JSType union = registry.createUnionType(number, voidType);
        assertSame(number, interpreter.getRestrictedWithoutUndefined(union));
        assertSame(union, interpreter.getRestrictedWithoutNull(union));
    }
}
