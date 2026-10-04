package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Token;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.io.Serializable;
import java.util.Comparator;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import java.util.Map;
import java.util.SortedMap;
import com.google.common.base.Joiner;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.IOException; // Added for appendStringTree
import org.junit.Assert; // Added for assertNotEquals

public class ArrowTypeTest {

    // Helper to create a JSTypeRegistry
    private JSTypeRegistry registry = new JSTypeRegistry(null);

    // Helper to create a simple Node for parameters
    private Node createNodeParameter(String name, JSType type) {
        Node param = Node.newString(Token.NAME, name);
        param.setJSType(type);
        return param;
    }

    // Helper to create a simple Node for parameters with optional flag
    private Node createOptionalNodeParameter(String name, JSType type) {
        Node param = Node.newString(Token.NAME, name);
        param.setJSType(type);
        param.setOptionalArg(true);
        return param;
    }

    // Helper to create a simple Node for parameters with var_args flag
    private Node createVarArgsNodeParameter(String name, JSType type) {
        Node param = Node.newString(Token.NAME, name);
        param.setJSType(type);
        param.setVarArgs(true);
        return param;
    }

    // Helper to create a simple Node for parameters list
    private Node createParametersNode(Node... params) {
        Node paramList = new Node(Token.PARAM_LIST);
        for (Node param : params) {
            paramList.addChildToBack(param);
        }
        return paramList;
    }

    @Test
    public void testIsSubtype_differentTypes() throws Exception {
        // ArrowType itself is not a FunctionType, so it should not be a subtype of FunctionType.
        ArrowType arrowType1 = new ArrowType(registry, null, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        FunctionType functionType = new FunctionType(registry, "Foo", null, new ArrowType(registry, null, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)), null, ImmutableList.of(), false, false);
        assertFalse(arrowType1.isSubtype(functionType));
    }

    @Test
    public void testIsSubtype_sameArrowType() throws Exception {
        ArrowType arrowType1 = new ArrowType(registry, null, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        ArrowType arrowType2 = new ArrowType(registry, null, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        assertTrue(arrowType1.isSubtype(arrowType2));
    }

    @Test
    public void testIsSubtype_returnTypeSubtype() throws Exception {
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ArrowType arrowType1 = new ArrowType(registry, null, stringType);
        ArrowType arrowType2 = new ArrowType(registry, null, objectType);
        assertTrue(arrowType1.isSubtype(arrowType2));
    }

    @Test
    public void testIsSubtype_returnTypeNotSubtype() throws Exception {
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ArrowType arrowType1 = new ArrowType(registry, null, objectType);
        ArrowType arrowType2 = new ArrowType(registry, null, stringType);
        assertFalse(arrowType1.isSubtype(arrowType2));
    }

    @Test
    public void testIsSubtype_parameterTypeSubtypeContravariant() throws Exception {
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        Node params1 = createParametersNode(createNodeParameter("p1", objectType));
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));

        assertTrue(arrowType2.isSubtype(arrowType1)); // string is subtype of object, so arrowType2 is subtype of arrowType1
    }

    @Test
    public void testIsSubtype_parameterTypeNotSubtypeContravariant() throws Exception {
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        Node params1 = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(createNodeParameter("p1", objectType));
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));

        assertFalse(arrowType2.isSubtype(arrowType1)); // object is not subtype of string, so arrowType2 is not subtype of arrowType1
    }

    @Test
    public void testIsSubtype_differentNumberOfParameters() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        Node params1 = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(
                createNodeParameter("p1", stringType),
                createNodeParameter("p2", stringType)
        );
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));

        assertFalse(arrowType1.isSubtype(arrowType2));
        assertFalse(arrowType2.isSubtype(arrowType1));
    }

    @Test
    public void testIsSubtype_withVarArgs() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

        Node params1 = createParametersNode(createVarArgsNodeParameter("args", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(createNodeParameter("arg1", stringType), createVarArgsNodeParameter("args", stringType));
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));

        // arrowType2 should be a subtype of arrowType1 because arrowType1 can accept more arguments due to var_args
        assertTrue(arrowType2.isSubtype(arrowType1));

        // arrowType1 is NOT a subtype of arrowType2 because arrowType1 does not require the first argument
        assertFalse(arrowType1.isSubtype(arrowType2));

        // Test with different types in var_args
        Node params3 = createParametersNode(createVarArgsNodeParameter("args", objectType));
        ArrowType arrowType3 = new ArrowType(registry, params3, registry.getNativeType(JSTypeNative.VOID_TYPE));

        assertTrue(arrowType1.isSubtype(arrowType3)); // string var_args is subtype of object var_args
        assertFalse(arrowType3.isSubtype(arrowType1)); // object var_args is not subtype of string var_args
    }

    @Test
    public void testIsSubtype_withOptionalArgs() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

        Node params1 = createParametersNode(createOptionalNodeParameter("opt1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(
                createNodeParameter("req1", stringType),
                createOptionalNodeParameter("opt2", stringType)
        );
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));

        // arrowType1 can accept fewer required arguments, so it is a subtype of arrowType2
        assertTrue(arrowType1.isSubtype(arrowType2));
        // arrowType2 requires more arguments than arrowType1, so it is not a subtype of arrowType1
        assertFalse(arrowType2.isSubtype(arrowType1));

        // Test with mixed optional and required
        Node params3 = createParametersNode(createOptionalNodeParameter("opt1", stringType), createNodeParameter("req2", stringType));
        ArrowType arrowType3 = new ArrowType(registry, params3, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertFalse(arrowType3.isSubtype(arrowType1)); // arrowType3 requires arg req2 which arrowType1 doesn't have

        // Test with optional type being subtype of required type
        Node params4 = createParametersNode(createOptionalNodeParameter("opt1", objectType));
        ArrowType arrowType4 = new ArrowType(registry, params4, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertTrue(arrowType4.isSubtype(arrowType1)); // object optional param is subtype of string optional param
    }

    @Test
    public void testIsSubtype_mixedOptionalAndRequiredAndVarArgs() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

        // Function: f(string, string?, ...string)
        Node params1 = createParametersNode(
                createNodeParameter("s1", stringType),
                createOptionalNodeParameter("s2", stringType),
                createVarArgsNodeParameter("rest", stringType)
        );
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        // Function: g(string, ...string)
        Node params2 = createParametersNode(
                createNodeParameter("s1", stringType),
                createVarArgsNodeParameter("rest", stringType)
        );
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));

        // g is a subtype of f because g can accept what f accepts (optional s2 is covered by varargs rest)
        assertTrue(arrowType2.isSubtype(arrowType1));

        // Function: h(string, string, string?, ...string)
        Node params3 = createParametersNode(
                createNodeParameter("s1", stringType),
                createNodeParameter("s2", stringType),
                createOptionalNodeParameter("s3", stringType),
                createVarArgsNodeParameter("rest", stringType)
        );
        ArrowType arrowType3 = new ArrowType(registry, params3, registry.getNativeType(JSTypeNative.VOID_TYPE));

        // f is not a subtype of h because h requires a third string which f does not guarantee.
        assertFalse(arrowType1.isSubtype(arrowType3));

        // Function: i(string?, string?, ...string)
        Node params4 = createParametersNode(
                createOptionalNodeParameter("s1", stringType),
                createOptionalNodeParameter("s2", stringType),
                createVarArgsNodeParameter("rest", stringType)
        );
        ArrowType arrowType4 = new ArrowType(registry, params4, registry.getNativeType(JSTypeNative.VOID_TYPE));
        // f is not a subtype of i, because f requires s1 which i does not guarantee.
        assertFalse(arrowType1.isSubtype(arrowType4));

        // Test with unknown types
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        Node params5 = createParametersNode(createVarArgsNodeParameter("args", unknownType));
        ArrowType arrowType5 = new ArrowType(registry, params5, registry.getNativeType(JSTypeNative.VOID_TYPE));

        assertTrue(arrowType1.isSubtype(arrowType5)); // Any var_args is subtype of unknown var_args
        assertTrue(arrowType5.isSubtype(arrowType1)); // unknown var_args is subtype of any var_args
    }

    @Test
    public void testIsSubtype_topFunctionType() throws Exception {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        // Create a function type that represents "any function" or top of function lattice.
        // This is typically achieved with unknown parameters and return type.
        Node params = createParametersNode(createVarArgsNodeParameter("args", unknownType));
        ArrowType arrowTypeTop = new ArrowType(registry, params, unknownType);

        ArrowType arrowType = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertTrue(arrowType.isSubtype(arrowTypeTop)); // Any function is subtype of the top function type.
    }

    @Test
    public void testHasEqualParameters_equal() throws Exception {
        Node params1 = createParametersNode(
                createNodeParameter("p1", registry.getNativeType(JSTypeNative.STRING_TYPE)),
                createNodeParameter("p2", registry.getNativeType(JSTypeNative.NUMBER_TYPE))
        );
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(
                createNodeParameter("p1", registry.getNativeType(JSTypeNative.STRING_TYPE)),
                createNodeParameter("p2", registry.getNativeType(JSTypeNative.NUMBER_TYPE))
        );
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));

        assertTrue(arrowType1.hasEqualParameters(arrowType2, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testHasEqualParameters_differentNames() throws Exception {
        Node params1 = createParametersNode(createNodeParameter("p1", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(createNodeParameter("otherName", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));

        // Parameter names do not affect equality for hasEqualParameters
        assertTrue(arrowType1.hasEqualParameters(arrowType2, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testHasEqualParameters_differentTypes() throws Exception {
        Node params1 = createParametersNode(createNodeParameter("p1", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(createNodeParameter("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));

        assertFalse(arrowType1.hasEqualParameters(arrowType2, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testHasEqualParameters_differentNumberOfParams() throws Exception {
        Node params1 = createParametersNode(createNodeParameter("p1", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(
                createNodeParameter("p1", registry.getNativeType(JSTypeNative.STRING_TYPE)),
                createNodeParameter("p2", registry.getNativeType(JSTypeNative.NUMBER_TYPE))
        );
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));

        assertFalse(arrowType1.hasEqualParameters(arrowType2, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testHasEqualParameters_withVarArgs() throws Exception {
        Node params1 = createParametersNode(createVarArgsNodeParameter("args", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(createVarArgsNodeParameter("args", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertTrue(arrowType1.hasEqualParameters(arrowType2, EquivalenceMethod.IDENTITY));

        Node params3 = createParametersNode(createVarArgsNodeParameter("args", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        ArrowType arrowType3 = new ArrowType(registry, params3, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertFalse(arrowType1.hasEqualParameters(arrowType3, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testHasEqualParameters_withOptionalArgs() throws Exception {
        Node params1 = createParametersNode(createOptionalNodeParameter("opt", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(createOptionalNodeParameter("opt", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertTrue(arrowType1.hasEqualParameters(arrowType2, EquivalenceMethod.IDENTITY));

        Node params3 = createParametersNode(createOptionalNodeParameter("opt", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        ArrowType arrowType3 = new ArrowType(registry, params3, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertFalse(arrowType1.hasEqualParameters(arrowType3, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testHasEqualParameters_mixedOptionalAndVarArgs() throws Exception {
        Node params1 = createParametersNode(
                createOptionalNodeParameter("opt", registry.getNativeType(JSTypeNative.STRING_TYPE)),
                createVarArgsNodeParameter("args", registry.getNativeType(JSTypeNative.NUMBER_TYPE))
        );
        ArrowType arrowType1 = new ArrowType(registry, params1, registry.getNativeType(JSTypeNative.VOID_TYPE));

        Node params2 = createParametersNode(
                createOptionalNodeParameter("opt", registry.getNativeType(JSTypeNative.STRING_TYPE)),
                createVarArgsNodeParameter("args", registry.getNativeType(JSTypeNative.NUMBER_TYPE))
        );
        ArrowType arrowType2 = new ArrowType(registry, params2, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertTrue(arrowType1.hasEqualParameters(arrowType2, EquivalenceMethod.IDENTITY));

        Node params3 = createParametersNode(
                createOptionalNodeParameter("opt", registry.getNativeType(JSTypeNative.STRING_TYPE)),
                createVarArgsNodeParameter("args", registry.getNativeType(JSTypeNative.STRING_TYPE)) // Different var_args type
        );
        ArrowType arrowType3 = new ArrowType(registry, params3, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertFalse(arrowType1.hasEqualParameters(arrowType3, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testCheckArrowEquivalenceHelper_equal() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params, stringType);
        ArrowType arrowType2 = new ArrowType(registry, params, stringType);
        assertTrue(arrowType1.checkArrowEquivalenceHelper(arrowType2, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testCheckArrowEquivalenceHelper_differentReturnType() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params, stringType);
        ArrowType arrowType2 = new ArrowType(registry, params, numberType);
        assertFalse(arrowType1.checkArrowEquivalenceHelper(arrowType2, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testCheckArrowEquivalenceHelper_differentParameters() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        Node params1 = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params1, stringType);

        Node params2 = createParametersNode(createNodeParameter("p1", numberType));
        ArrowType arrowType2 = new ArrowType(registry, params2, stringType);
        assertFalse(arrowType1.checkArrowEquivalenceHelper(arrowType2, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testHashCode_consistent() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params, stringType);
        ArrowType arrowType2 = new ArrowType(registry, params, stringType);
        assertEquals(arrowType1.hashCode(), arrowType2.hashCode());
    }



    @Test
    public void testHasUnknownParamsOrReturn_trueWhenUnknownParam() throws Exception {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", unknownType));
        ArrowType arrowType = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTrue(arrowType.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturn_trueWhenUnknownReturn() throws Exception {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType = new ArrowType(registry, params, unknownType);
        assertTrue(arrowType.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturn_falseWhenKnown() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);
        assertFalse(arrowType.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturn_trueWhenNullParam() throws Exception {
        Node params = createParametersNode(createNodeParameter("p1", null)); // Explicitly null type
        ArrowType arrowType = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTrue(arrowType.hasUnknownParamsOrReturn());
    }

     @Test
    public void testHasUnknownParamsOrReturn_trueWhenNullReturn() throws Exception {
        Node params = createParametersNode(createNodeParameter("p1", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType = new ArrowType(registry, params, null); // Explicitly null return type
        assertTrue(arrowType.hasUnknownParamsOrReturn());
    }

    @Test
    public void testToStringHelper_basic() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);
        // Expected format depends on how toStringHelper is implemented for its components.
        // Assuming default toStringHelper for Node and JSType.
        // This might need adjustment based on actual JSType and Node toStrings.
        assertTrue(arrowType.toStringHelper(false).contains("[ArrowType]"));
    }

    @Test
    public void testToStringHelper_withInferredReturnType() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType, true); // returnTypeInferred = true
        assertTrue(arrowType.toStringHelper(false).contains("[ArrowType]"));
    }

    // Dummy JSType implementation to simulate TemplateType for testing hasAnyTemplateInternal
    private static class MockTemplateType extends JSType {
        private final boolean hasTemplate;
        MockTemplateType(JSTypeRegistry registry, boolean hasTemplate) {
            super(registry);
            this.hasTemplate = hasTemplate;
        }
        @Override public boolean hasAnyTemplateInternal() { return hasTemplate; }
        @Override public <T> T visit(Visitor<T> visitor) { return null; } // Not needed for this test
        @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.TRUE; } // Default
        @Override String toStringHelper(boolean forAnnotations) { return "MockTemplateType"; }
        @Override public JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; } // Added to satisfy abstract method
    }

    @Test
    public void testHasAnyTemplateInternal_trueWhenTemplateParam() throws Exception {
        MockTemplateType templateType = new MockTemplateType(registry, true);
        Node params = createParametersNode(createNodeParameter("p1", templateType));
        ArrowType arrowType = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTrue(arrowType.hasAnyTemplateInternal());
    }

    @Test
    public void testHasAnyTemplateInternal_trueWhenTemplateReturn() throws Exception {
        MockTemplateType templateType = new MockTemplateType(registry, true);
        Node params = createParametersNode(createNodeParameter("p1", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType = new ArrowType(registry, params, templateType);
        assertTrue(arrowType.hasAnyTemplateInternal());
    }

     @Test
    public void testHasAnyTemplateInternal_falseWhenNoTemplate() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);
        assertFalse(arrowType.hasAnyTemplateInternal());
    }

    @Test
    public void testResolveInternal_resolvesReturnType() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);

        JSType resolvedType = arrowType.resolveInternal(null, null); // Pass null for ErrorReporter and StaticScope for simplicity

        assertEquals(stringType, arrowType.returnType);
        assertSame(arrowType, resolvedType); // resolveInternal should return 'this'
    }

    @Test
    public void testResolveInternal_resolvesParameterTypes() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE));

        JSType resolvedType = arrowType.resolveInternal(null, null);

        assertEquals(stringType, arrowType.parameters.getFirstChild().getJSType());
        assertSame(arrowType, resolvedType);
    }

    @Test
    public void testResolveInternal_handlesNullParameters() throws Exception {
        ArrowType arrowType = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
        JSType resolvedType = arrowType.resolveInternal(null, null);
        assertNotNull(arrowType.parameters);
        assertNotNull(arrowType.returnType);
        assertSame(arrowType, resolvedType);
    }

    @Test
    public void testResolveInternal_handlesNullReturnType() throws Exception {
        Node params = createParametersNode(createNodeParameter("p1", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        ArrowType arrowType = new ArrowType(registry, params, null); // Explicitly null return type
        JSType resolvedType = arrowType.resolveInternal(null, null);
        assertNotNull(arrowType.returnType);
        assertTrue(arrowType.returnType.isUnknownType());
        assertSame(arrowType, resolvedType);
    }

    @Test
    public void testGetLeastSupertype_sameTypes() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);
        // getLeastSupertype is actually implemented on FunctionType, so we need to wrap ArrowType
        FunctionType ft = new FunctionType(registry, "f", null, arrowType, null, ImmutableList.of(), false, false);
        assertSame(ft, ft.getLeastSupertype(ft));
    }

    @Test
    public void testGetLeastSupertype_differentReturnTypes() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));

        ArrowType arrowType1 = new ArrowType(registry, params, stringType);
        ArrowType arrowType2 = new ArrowType(registry, params, objectType);

        FunctionType ft1 = new FunctionType(registry, "f1", null, arrowType1, null, ImmutableList.of(), false, false);
        FunctionType ft2 = new FunctionType(registry, "f2", null, arrowType2, null, ImmutableList.of(), false, false);

        JSType leastSuper = ft1.getLeastSupertype(ft2);

        assertTrue(leastSuper.isFunctionType());
        // The least supertype of two functions should be a union of their return types.
        assertTrue(leastSuper.toMaybeFunctionType().getReturnType().isUnionType());
        assertEquals(objectType, leastSuper.toMaybeFunctionType().getReturnType().toMaybeUnionType().getAlternates().iterator().next());
    }

    @Test
    public void testGetLeastSupertype_differentParameters() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        Node params1 = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params1, stringType);

        Node params2 = createParametersNode(createNodeParameter("p1", numberType));
        ArrowType arrowType2 = new ArrowType(registry, params2, stringType);

        FunctionType ft1 = new FunctionType(registry, "f1", null, arrowType1, null, ImmutableList.of(), false, false);
        FunctionType ft2 = new FunctionType(registry, "f2", null, arrowType2, null, ImmutableList.of(), false, false);

        FunctionType leastSuperFn = (FunctionType) ft1.getLeastSupertype(ft2);

        assertTrue(leastSuperFn.getReturnType().isEquivalentTo(stringType));
        assertTrue(leastSuperFn.getParametersNode().getFirstChild().getJSType().isUnionType());
        assertTrue(leastSuperFn.getParametersNode().getFirstChild().getJSType().toMaybeUnionType().contains(stringType));
        assertTrue(leastSuperFn.getParametersNode().getFirstChild().getJSType().toMaybeUnionType().contains(numberType));
    }

    @Test
    public void testGetGreatestSubtype_sameTypes() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);
        FunctionType ft = new FunctionType(registry, "f", null, arrowType, null, ImmutableList.of(), false, false);
        assertSame(ft, ft.getGreatestSubtype(ft));
    }

    @Test
    public void testGetGreatestSubtype_differentReturnTypes() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));

        ArrowType arrowType1 = new ArrowType(registry, params, stringType);
        ArrowType arrowType2 = new ArrowType(registry, params, objectType);

        FunctionType ft1 = new FunctionType(registry, "f1", null, arrowType1, null, ImmutableList.of(), false, false);
        FunctionType ft2 = new FunctionType(registry, "f2", null, arrowType2, null, ImmutableList.of(), false, false);

        JSType greatestSub = ft1.getGreatestSubtype(ft2);

        assertTrue(greatestSub.isFunctionType());
        // The greatest subtype of string and object return types should be string.
        assertEquals(stringType, greatestSub.toMaybeFunctionType().getReturnType());
    }

    @Test
    public void testGetGreatestSubtype_differentParameters() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        Node params1 = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params1, stringType);

        Node params2 = createParametersNode(createNodeParameter("p1", numberType));
        ArrowType arrowType2 = new ArrowType(registry, params2, stringType);

        FunctionType ft1 = new FunctionType(registry, "f1", null, arrowType1, null, ImmutableList.of(), false, false);
        FunctionType ft2 = new FunctionType(registry, "f2", null, arrowType2, null, ImmutableList.of(), false, false);
        FunctionType greatestSubFn = (FunctionType) ft1.getGreatestSubtype(ft2);

        assertEquals(stringType, greatestSubFn.getReturnType());
        // The parameters should be a union of string and number.
        assertNotNull(greatestSubFn.getParametersNode());
        JSType paramType = greatestSubFn.getParametersNode().getFirstChild().getJSType();
        assertTrue(paramType.isUnionType());
        assertTrue(paramType.toMaybeUnionType().contains(stringType));
        assertTrue(paramType.toMaybeUnionType().contains(numberType));
    }

    @Test
    public void testTestForEquality_equal() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params, stringType);
        ArrowType arrowType2 = new ArrowType(registry, params, stringType);
        assertEquals(TernaryValue.TRUE, arrowType1.testForEquality(arrowType2));
    }

    @Test
    public void testTestForEquality_differentReturnType() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params, stringType);
        ArrowType arrowType2 = new ArrowType(registry, params, numberType);
        assertEquals(TernaryValue.UNKNOWN, arrowType1.testForEquality(arrowType2));
    }

    @Test
    public void testTestForEquality_differentParameters() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        Node params1 = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType1 = new ArrowType(registry, params1, stringType);

        Node params2 = createParametersNode(createNodeParameter("p1", numberType));
        ArrowType arrowType2 = new ArrowType(registry, params2, stringType);
        assertEquals(TernaryValue.UNKNOWN, arrowType1.testForEquality(arrowType2));
    }

    @Test
    public void testGetPossibleToBooleanOutcomes_alwaysTrue() throws Exception {
        ArrowType arrowType = new ArrowType(registry, null, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)); // Object types result in true for toBoolean
        assertEquals(BooleanLiteralSet.TRUE, arrowType.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testGetPossibleToBooleanOutcomes_dependsOnReturnType() throws Exception {
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        ArrowType arrowType = new ArrowType(registry, null, booleanType); // Boolean type can be true or false
        assertEquals(BooleanLiteralSet.BOTH, arrowType.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testGetPossibleToBooleanOutcomes_dependsOnParamType() throws Exception {
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", booleanType));
        ArrowType arrowType = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE)); // Function types are generally true
        assertEquals(BooleanLiteralSet.TRUE, arrowType.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testGetPossibleToBooleanOutcomes_withUnknownType() throws Exception {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        ArrowType arrowType = new ArrowType(registry, null, unknownType);
        assertEquals(BooleanLiteralSet.BOTH, arrowType.getPossibleToBooleanOutcomes());
    }






    @Test
    public void testArrowTypeConstructor_nullParamsCreatesDefault() throws Exception {
        ArrowType arrowType = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertNotNull(arrowType.parameters);
        // The default parameters when null is passed is an empty PARAM_LIST node.
        assertEquals(0, arrowType.parameters.getChildCount());
    }

    @Test
    public void testArrowTypeConstructor_nullReturnTypeCreatesUnknown() throws Exception {
        ArrowType arrowType = new ArrowType(registry, null, null);
        assertNotNull(arrowType.returnType);
        assertTrue(arrowType.returnType.isUnknownType());
    }

    @Test
    public void testArrowTypeConstructor_nonNullParamsAndReturn() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);
        assertNotNull(arrowType.parameters);
        assertEquals(1, arrowType.parameters.getChildCount());
        assertNotNull(arrowType.returnType);
        assertTrue(arrowType.returnType.isString());
    }

    @Test
    public void testVisit() throws Exception {
        ArrowType arrowType = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
        // The visit method in ArrowType throws UnsupportedOperationException.
        try {
            arrowType.visit(null); // Passing null as we can't provide a real visitor easily.
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testGetLeastSupertype_withUnknownType() throws Exception {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);

        FunctionType ft1 = new FunctionType(registry, "f1", null, arrowType, null, ImmutableList.of(), false, false);
        // Create a FunctionType with unknown parameters and return type to simulate a top-level function type.
        Node unknownParams = createParametersNode(createVarArgsNodeParameter("args", unknownType));
        ArrowType unknownArrowType = new ArrowType(registry, unknownParams, unknownType);
        FunctionType ftTop = new FunctionType(registry, "fTop", null, unknownArrowType, null, ImmutableList.of(), false, false);

        JSType leastSuper = ft1.getLeastSupertype(ftTop);
        // The least supertype of any type and the top type is the top type.
        assertTrue(leastSuper.isFunctionType());
        assertTrue(leastSuper.toMaybeFunctionType().getReturnType().isUnknownType());
        assertTrue(leastSuper.toMaybeFunctionType().getParametersNode().getFirstChild().isVarArgs());
        assertTrue(leastSuper.toMaybeFunctionType().getParametersNode().getFirstChild().getJSType().isUnknownType());
    }

    @Test
    public void testGetGreatestSubtype_withUnknownType() throws Exception {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);

        FunctionType ft1 = new FunctionType(registry, "f1", null, arrowType, null, ImmutableList.of(), false, false);
        // Create a FunctionType with unknown parameters and return type to simulate a top-level function type.
        Node unknownParams = createParametersNode(createVarArgsNodeParameter("args", unknownType));
        ArrowType unknownArrowType = new ArrowType(registry, unknownParams, unknownType);
        FunctionType ftTop = new FunctionType(registry, "fTop", null, unknownArrowType, null, ImmutableList.of(), false, false);

        JSType greatestSub = ft1.getGreatestSubtype(ftTop);
        // The greatest subtype of any type and the top type is the type itself.
        assertTrue(greatestSub.isFunctionType());
        assertEquals(stringType, greatestSub.toMaybeFunctionType().getReturnType());
        assertEquals("p1", greatestSub.toMaybeFunctionType().getParametersNode().getFirstChild().getString());
    }

    @Test
    public void testGetPossibleToBooleanOutcomes_emptyArrowType() throws Exception {
        ArrowType arrowType = new ArrowType(registry, null, null); // null return type becomes UNKNOWN_TYPE
        // When the return type is UNKNOWN_TYPE, it can be either true or false.
        assertEquals(BooleanLiteralSet.BOTH, arrowType.getPossibleToBooleanOutcomes());
    }






    @Test
    public void testArrowTypeConstructor_returnTypeNull() throws Exception {
        ArrowType arrowType = new ArrowType(registry, null, null);
        assertTrue(arrowType.returnType.isUnknownType());
    }

    @Test
    public void testArrowTypeConstructor_paramsNull() throws Exception {
        ArrowType arrowType = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertNotNull(arrowType.parameters);
        // The default parameter list for a null Node is an empty PARAM_LIST.
        assertEquals(0, arrowType.parameters.getChildCount());
    }

    @Test
    public void testHasAnyTemplateInternal_recursiveCheck() throws Exception {
        // Test a scenario where template types might be nested, ensuring no infinite loop.
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);
        arrowType.hasAnyTemplateInternal(); // Should not throw an exception.
        assertFalse(arrowType.hasAnyTemplateInternal()); // No templates in this simple case.
    }

    @Test
    public void testResolveInternal_handlesAlreadyResolvedTypes() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = createParametersNode(createNodeParameter("p1", stringType));
        ArrowType arrowType = new ArrowType(registry, params, stringType);

        // Resolve it once
        arrowType.resolveInternal(null, null);
        // Resolve it again to check if it handles already resolved types correctly
        JSType resolvedTypeAgain = arrowType.resolveInternal(null, null);

        assertEquals(stringType, arrowType.returnType);
        assertSame(arrowType, resolvedTypeAgain);
    }

    @Test
    public void testGetLeastSupertype_unionReturnType() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

        Node params = createParametersNode(createNodeParameter("p1", stringType));

        ArrowType arrowType1 = new ArrowType(registry, params, stringType); // Returns string
        ArrowType arrowType2 = new ArrowType(registry, params, numberType); // Returns number

        FunctionType ft1 = new FunctionType(registry, "f1", null, arrowType1, null, ImmutableList.of(), false, false);
        FunctionType ft2 = new FunctionType(registry, "f2", null, arrowType2, null, ImmutableList.of(), false, false);

        JSType leastSuper = ft1.getLeastSupertype(ft2);
        assertTrue(leastSuper.isFunctionType());
        // Least supertype of string and number return types should be a union.
        assertTrue(leastSuper.toMaybeFunctionType().getReturnType().isUnionType());
        assertTrue(leastSuper.toMaybeFunctionType().getReturnType().toMaybeUnionType().contains(stringType));
        assertTrue(leastSuper.toMaybeFunctionType().getReturnType().toMaybeUnionType().contains(numberType));
    }

    @Test
    public void testGetGreatestSubtype_unionReturnType() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

        Node params = createParametersNode(createNodeParameter("p1", stringType));

        ArrowType arrowType1 = new ArrowType(registry, params, stringType); // Returns string
        ArrowType arrowType2 = new ArrowType(registry, params, objectType); // Returns object

        FunctionType ft1 = new FunctionType(registry, "f1", null, arrowType1, null, ImmutableList.of(), false, false);
        FunctionType ft2 = new FunctionType(registry, "f2", null, arrowType2, null, ImmutableList.of(), false, false);

        JSType greatestSub = ft1.getGreatestSubtype(ft2);
        assertTrue(greatestSub.isFunctionType());
        // Greatest subtype of string and object return types should be string.
        assertEquals(stringType, greatestSub.toMaybeFunctionType().getReturnType());
    }

    @Test
    public void testArrowTypeConstructor_returnTypeInferredTrue() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ArrowType arrowType = new ArrowType(registry, null, stringType, true);
        assertTrue(arrowType.returnTypeInferred);
    }

    @Test
    public void testArrowTypeConstructor_returnTypeInferredFalse() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ArrowType arrowType = new ArrowType(registry, null, stringType, false);
        assertFalse(arrowType.returnTypeInferred);
    }

}
