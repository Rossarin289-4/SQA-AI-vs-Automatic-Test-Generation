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
import com.google.javascript.rhino.ErrorReporter;

public class ChainableReverseAbstractInterpreterTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testAppendMakesAppendedInterpreterReachableAsFirst() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter first =
                new ClosureReverseAbstractInterpreter(convention, registry);
        ChainableReverseAbstractInterpreter last =
                new SemanticReverseAbstractInterpreter(convention, registry);

        assertSame(last, first.append(last));
        assertSame(first, last.getFirst());
    }

    @Test
    public void testOnlyLinkIsItsOwnFirst() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter only =
                new ClosureReverseAbstractInterpreter(convention, registry);

        assertSame(only, only.getFirst());
    }

    @Test
    public void testAppendingLinkedInterpreterReplacesNextLink() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter first =
                new ClosureReverseAbstractInterpreter(convention, registry);
        ChainableReverseAbstractInterpreter second =
                new SemanticReverseAbstractInterpreter(convention, registry);
        first.append(second);

        assertSame(second, first.append(second));
        assertSame(first, second.getFirst());
    }

    @Test
    public void testNullTypeRestrictionForNumber() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);

        assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE),
                interpreter.getRestrictedByTypeOfResult(null, "number", true));
    }

    @Test
    public void testNullTypeRestrictionForUnknownName() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);

        assertSame(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE),
                interpreter.getRestrictedByTypeOfResult(null, "object", true));
    }

    @Test
    public void testNullTypeAndUnequalResultIsNull() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);

        assertNull(interpreter.getRestrictedByTypeOfResult(null, "number", false));
    }

    @Test
    public void testNumberTypeMatchesNumber() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertSame(number, interpreter.getRestrictedByTypeOfResult(number, "number", true));
    }

    @Test
    public void testNumberTypeDoesNotMatchString() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertNull(interpreter.getRestrictedByTypeOfResult(number, "string", true));
    }

    @Test
    public void testNumberTypeSurvivesNotStringRestriction() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertSame(number, interpreter.getRestrictedByTypeOfResult(number, "string", false));
    }

    @Test
    public void testBooleanTypeMatchesBoolean() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType bool = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

        assertSame(bool, interpreter.getRestrictedByTypeOfResult(bool, "boolean", true));
    }

    @Test
    public void testStringTypeMatchesString() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);

        assertSame(string, interpreter.getRestrictedByTypeOfResult(string, "string", true));
    }

    @Test
    public void testVoidTypeMatchesUndefined() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        assertSame(voidType, interpreter.getRestrictedByTypeOfResult(voidType, "undefined", true));
    }

    @Test
    public void testNullTypeMatchesObject() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);

        assertSame(nullType, interpreter.getRestrictedByTypeOfResult(nullType, "object", true));
    }

    @Test
    public void testNoTypeRemainsNoType() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);

        assertSame(noType, interpreter.getRestrictedByTypeOfResult(noType, "number", true));
    }

    @Test
    public void testUnknownTypeIsPinnedToMatchingNativeType() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

        assertSame(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE),
                interpreter.getRestrictedByTypeOfResult(unknown, "boolean", true));
    }

    @Test
    public void testUnknownTypeRemainsUnknownWhenExcludingTypeofResult() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

        assertSame(unknown, interpreter.getRestrictedByTypeOfResult(unknown, "number", false));
    }

    @Test
    public void testAllTypeIsRestrictedToNumber() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);

        assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE),
                interpreter.getRestrictedByTypeOfResult(all, "number", true));
    }

    @Test
    public void testAllTypeIsUnchangedWhenExcludingNumber() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);

        assertSame(all, interpreter.getRestrictedByTypeOfResult(all, "number", false));
    }

    @Test
    public void testNullResultNameIsTreatedAsUnrecognizedName() throws Exception {
        CodingConvention convention = new com.google.javascript.jscomp.GoogleCodingConvention();
        JSTypeRegistry registry = new JSTypeRegistry((ErrorReporter) null);
        ChainableReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(convention, registry);
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertNull(interpreter.getRestrictedByTypeOfResult(number, null, true));
        assertSame(number, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    }
}
