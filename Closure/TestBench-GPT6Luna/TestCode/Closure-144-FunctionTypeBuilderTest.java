package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import com.google.common.annotations.VisibleForTesting;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.common.collect.ImmutableList;
import java.util.Collections;

public class FunctionTypeBuilderTest {
    @Test
    public void testOrdinaryFunctionMinAndMaxArguments() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionParamBuilder params = new FunctionParamBuilder(registry);
        params.addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        params.addRequiredParams(registry.getNativeType(JSTypeNative.STRING_TYPE));
        FunctionType function = new FunctionBuilder(registry)
                .withParams(params)
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertEquals(2, function.getMinArguments());
        assertEquals(2, function.getMaxArguments());
    }

    @Test
    public void testOptionalParameterMinArguments() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionParamBuilder params = new FunctionParamBuilder(registry);
        params.addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        params.addOptionalParams(registry.getNativeType(JSTypeNative.STRING_TYPE));
        FunctionType function = new FunctionBuilder(registry)
                .withParams(params)
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertEquals(1, function.getMinArguments());
        assertEquals(2, function.getMaxArguments());
    }

    @Test
    public void testVarArgsMaximumAndMinimumArguments() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionParamBuilder params = new FunctionParamBuilder(registry);
        params.addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        params.addVarArgs(registry.getNativeType(JSTypeNative.STRING_TYPE));
        FunctionType function = new FunctionBuilder(registry)
                .withParams(params)
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertEquals(1, function.getMinArguments());
        assertEquals(Integer.MAX_VALUE, function.getMaxArguments());
    }

    @Test
    public void testEmptyFunctionHasNoArguments() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertEquals(0, function.getMinArguments());
        assertEquals(0, function.getMaxArguments());
        assertEquals(0, Iterables.size(function.getParameters()));
    }

    @Test
    public void testParametersNodeAndReturnType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Node parameters = new Node(Token.LP);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(parameters)
                .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
                .build();
        assertSame(parameters, function.getParametersNode());
        assertTrue(function.getReturnType().isNumber());
        assertFalse(function.isReturnTypeInferred());
    }

    @Test
    public void testInferredReturnTypeFlag() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withInferredReturnType(registry.getNativeType(JSTypeNative.STRING_TYPE))
                .build();
        assertTrue(function.isReturnTypeInferred());
        assertTrue(function.getReturnType().isString());
    }

    @Test
    public void testOrdinaryFunctionFlagsAndTypeOfThis() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .withTypeOfThis(thisType)
                .build();
        assertTrue(function.isOrdinaryFunction());
        assertTrue(function.isFunctionType());
        assertTrue(function.canBeCalled());
        assertFalse(function.isConstructor());
        assertFalse(function.isInterface());
        assertSame(thisType, function.getTypeOfThis());
        assertFalse(function.hasInstanceType());
    }

    @Test
    public void testConstructorBuilderCreatesInstanceType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withName("Ctor")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor()
                .build();
        assertTrue(function.isConstructor());
        assertTrue(function.hasInstanceType());
        assertSame(function.getInstanceType(), function.getTypeOfThis());
    }

    @Test
    public void testNameAndSourceNode() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        Node source = new Node(Token.FUNCTION);
        FunctionType function = new FunctionBuilder(registry)
                .withName("named")
                .withSourceNode(source)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertEquals("named", function.getReferenceName());
        assertSame(source, function.getSource());
    }

    @Test
    public void testSetSourceUpdatesSourceNode() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        Node source = new Node(Token.FUNCTION);
        function.setSource(source);
        assertSame(source, function.getSource());
        function.setSource(null);
        assertNull(function.getSource());
    }

    @Test
    public void testPrototypePropertyIsPresentAndSamePrototype() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertTrue(function.hasProperty("prototype"));
        assertTrue(function.hasOwnProperty("prototype"));
        assertSame(function.getPrototype(), function.getPropertyType("prototype"));
    }

    @Test
    public void testSetImplementedInterfacesCopiesSuppliedList() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        ObjectType iface = registry.createInterfaceType("Iface", null).getInstanceType();
        List<ObjectType> interfaces = Lists.newArrayList(iface);
        function.setImplementedInterfaces(interfaces);
        interfaces.clear();
        assertEquals(1, Iterables.size(function.getImplementedInterfaces()));
        assertSame(iface, Iterables.getOnlyElement(function.getImplementedInterfaces()));
    }

    @Test
    public void testFunctionEquivalentToItself() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertTrue(function.isEquivalentTo(function));
        assertTrue(function.hasEqualCallType(function));
    }

    @Test
    public void testDistinctConstructorTypesAreNotEquivalent() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType first = new FunctionBuilder(registry)
                .withName("First")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        FunctionType second = new FunctionBuilder(registry)
                .withName("Second")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        assertFalse(first.isEquivalentTo(second));
        assertTrue(first.hasInstanceType());
        assertTrue(second.hasInstanceType());
    }

    @Test
    public void testSetPrototypeBasedOnUpdatesImplicitPrototype() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType base = new FunctionBuilder(registry)
                .withName("Base")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        FunctionType derived = new FunctionBuilder(registry)
                .withName("Derived")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        derived.setPrototypeBasedOn(base.getInstanceType());
        assertSame(base, derived.getSuperClassConstructor());
        assertEquals(1, base.getSubTypes().size());
        assertSame(derived, base.getSubTypes().get(0));
    }

    @Test
    public void testConstructorWithoutBaseHasNoSuperclass() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType constructor = new FunctionBuilder(registry)
                .withName("Solo")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        assertNull(constructor.getSuperClassConstructor());
        assertFalse(constructor.hasUnknownSupertype());
    }

    @Test
    public void testGetPropertyTypeCallProducesCallableProperty() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
                .build();
        JSType callType = function.getPropertyType("call");
        assertTrue(callType.isFunctionType());
        assertTrue(function.hasProperty("call"));
    }

    @Test
    public void testGetPropertyTypeApplyProducesCallableProperty() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.STRING_TYPE))
                .build();
        JSType applyType = function.getPropertyType("apply");
        assertTrue(applyType.isFunctionType());
        assertTrue(function.hasProperty("apply"));
    }

    @Test
    public void testHasEqualCallTypeForMatchingSignatures() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType first = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
                .build();
        FunctionType second = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
                .build();
        assertTrue(first.hasEqualCallType(second));
    }

    @Test
    public void testDifferentReturnTypesHaveDifferentCallTypes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType numberFunction = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
                .build();
        FunctionType stringFunction = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.STRING_TYPE))
                .build();
        assertFalse(numberFunction.hasEqualCallType(stringFunction));
    }

    @Test
    public void testPrototypeBaseAndSupertypeQueries() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType base = new FunctionBuilder(registry)
                .withName("BaseType")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        FunctionType child = new FunctionBuilder(registry)
                .withName("ChildType")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        child.setPrototypeBasedOn(base.getInstanceType());
        assertSame(base, child.getSuperClassConstructor());
        assertFalse(child.hasUnknownSupertype());
        assertSame(child.getInstanceType(), child.getTopMostDefiningType("constructor"));
    }

    @Test
    public void testTemplateNameIsPreserved() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withTemplateName("T")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertEquals("T", function.getTemplateTypeName());
    }

    @Test
    public void testToStringIncludesSignatureTypes() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionParamBuilder params = new FunctionParamBuilder(registry);
        params.addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType function = new FunctionBuilder(registry)
                .withParams(params)
                .withReturnType(registry.getNativeType(JSTypeNative.STRING_TYPE))
                .build();
        assertEquals("function (number): string", function.toString());
    }

    @Test
    public void testSubtypeAndSupertypeOfMatchingSignature() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
                .build();
        assertTrue(function.isSubtype(function));
        assertTrue(function.getLeastSupertype(function).isEquivalentTo(function));
        assertTrue(function.getGreatestSubtype(function).isEquivalentTo(function));
    }

    @Test
    public void testCopyBuilderRetainsSignatureAndName() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType original = new FunctionBuilder(registry)
                .withName("original")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.STRING_TYPE))
                .build();
        FunctionType copy = new FunctionBuilder(registry)
                .copyFromOtherFunction(original)
                .build();
        assertEquals("original", copy.getReferenceName());
        assertTrue(copy.getReturnType().isString());
        assertTrue(copy.hasEqualCallType(original));
    }

    @Test
    public void testConstructorInstanceTypePredicate() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType constructor = new FunctionBuilder(registry)
                .withName("InstanceCtor")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        assertTrue(constructor.getInstanceType().isInstanceType());
        assertFalse(constructor.isInstanceType());
    }

    @Test
    public void testNullPrototypeRejectedForConstructor() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType constructor = new FunctionBuilder(registry)
                .withName("PrototypeCtor")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        assertFalse(constructor.setPrototype(null));
    }

    @Test
    public void testRepeatedPrototypeAssignmentPreservesSuperclass() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType base = new FunctionBuilder(registry)
                .withName("PrototypeBase")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        FunctionType child = new FunctionBuilder(registry)
                .withName("PrototypeChild")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        child.setPrototypeBasedOn(base.getInstanceType());
        child.setPrototypeBasedOn(base.getInstanceType());
        assertSame(base, child.getSuperClassConstructor());
        assertSame(child, base.getSubTypes().get(0));
        assertEquals(1, base.getSubTypes().size());
    }

    @Test
    public void testAllImplementedInterfacesIncludesRegisteredInterface() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType constructor = new FunctionBuilder(registry)
                .withName("InterfaceImpl")
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .forConstructor().build();
        ObjectType iface = registry.createInterfaceType("ImplementedIface", null).getInstanceType();
        constructor.setImplementedInterfaces(Lists.newArrayList(iface));
        assertEquals(1, Iterables.size(constructor.getAllImplementedInterfaces()));
        assertSame(iface, Iterables.getOnlyElement(constructor.getAllImplementedInterfaces()));
    }

    @Test
    public void testImplementedInterfaceIterableIsEmptyInitially() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertEquals(0, Iterables.size(function.getAllImplementedInterfaces()));
    }

    @Test
    public void testPrototypeIsReportedAsInferred() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertTrue(function.isPropertyTypeInferred("prototype"));
    }

    @Test
    public void testExplicitPropertyIsNotInferred() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(function.defineDeclaredProperty("count", number, false));
        assertFalse(function.isPropertyTypeInferred("count"));
    }

    @Test
    public void testFunctionHashCodeMatchesCallHashCodeEquality() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType first = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
                .build();
        FunctionType second = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
                .build();
        assertTrue(first.hasEqualCallType(second));
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testHashCodeForInterfaceUsesReferenceName() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType iface = registry.createInterfaceType("HashIface", null);
        assertEquals("HashIface".hashCode(), iface.hashCode());
    }

    @Test
    public void testPrototypeCacheStateChangesAfterGetter() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
                .build();
        assertFalse(function.hasCachedValues());
        function.getPrototype();
        assertTrue(function.hasCachedValues());
    }

    @Test
    public void testDebugHashStringIncludesFunctionSignature() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType function = new FunctionBuilder(registry)
                .withParamsNode(new Node(Token.LP))
                .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
                .build();
        assertTrue(function.toDebugHashCodeString().startsWith("function (): "));
    }
}
