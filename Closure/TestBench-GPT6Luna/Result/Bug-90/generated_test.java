package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Collections;
import com.google.javascript.rhino.jstype.JSTypeNative;

public class FunctionTypeBuilderTest {
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testWhatItChecks() throws Exception {
        assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(new JSDocInfo()));
    }

    @Test
    public void testParameterCountMakesFunctionDeclaration() throws Exception {
        JSDocInfo info = new JSDocInfo();
        assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }

    @Test
    public void testDeclarationWithoutTypeSignalsIsFalse() throws Exception {
        assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(new JSDocInfo()));
    }

    @Test
    public void testFunctionFlagsAndCallability() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertTrue(fn.isOrdinaryFunction());
        assertFalse(fn.isConstructor());
        assertFalse(fn.isInterface());
        assertTrue(fn.isFunctionType());
        assertTrue(fn.canBeCalled());
        assertFalse(fn.hasInstanceType());
    }

    @Test
    public void testNoArgumentFunctionParameterBounds() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertEquals(0, fn.getMinArguments());
        assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());
        assertEquals(0, Iterables.size(fn.getParameters()));
        assertNotNull(fn.getParametersNode());
    }

    @Test
    public void testFunctionReturnTypeAndInferenceFlag() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        JSType result = registry.getNativeType(JSTypeNative.VOID_TYPE);
        FunctionType fn = new FunctionBuilder(registry)
                .withReturnType(result)
                .build();
        assertEquals(result, fn.getReturnType());
        assertFalse(fn.isReturnTypeInferred());
    }

    @Test
    public void testPrototypeIsLazilyAvailableAndPropertyExists() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertTrue(fn.hasProperty("prototype"));
        assertTrue(fn.hasOwnProperty("prototype"));
        assertNotNull(fn.getPrototype());
        assertTrue(fn.isPropertyTypeInferred("prototype"));
    }

    @Test
    public void testCallAndApplyPropertiesAreCreated() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertNotNull(fn.getPropertyType("call"));
        assertNotNull(fn.getPropertyType("apply"));
        assertTrue(fn.hasProperty("call"));
        assertTrue(fn.hasProperty("apply"));
    }

    @Test
    public void testSourceCanBeSetAndRetrieved() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        Node source = new Node(Token.FUNCTION);
        fn.setSource(source);
        assertSame(source, fn.getSource());
    }

    @Test
    public void testOrdinaryFunctionEquivalenceAndCallType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType first = new FunctionBuilder(registry).build();
        FunctionType second = new FunctionBuilder(registry).build();
        assertTrue(first.isEquivalentTo(second));
        assertTrue(first.hasEqualCallType(second));
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testEquivalentFunctionIsSubtypeOfItself() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertTrue(fn.isSubtype(fn));
    }

    @Test
    public void testFunctionWithItselfAsLeastAndGreatestType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertSame(fn, fn.getLeastSupertype(fn));
        assertSame(fn, fn.getGreatestSubtype(fn));
    }

    @Test
    public void testConstructorInstanceAndSupertypeState() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType ctor = registry.createConstructorType(
                "Ctor", null, new Node(Token.LP),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertTrue(ctor.isConstructor());
        assertTrue(ctor.hasInstanceType());
        assertNotNull(ctor.getInstanceType());
        assertNull(ctor.getSuperClassConstructor());
        assertFalse(ctor.hasUnknownSupertype());
    }

    @Test
    public void testImplementedInterfacesStartEmpty() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        fn.setImplementedInterfaces(Collections.<ObjectType>emptyList());
        assertEquals(0, Iterables.size(fn.getImplementedInterfaces()));
        assertEquals(0, Iterables.size(fn.getAllImplementedInterfaces()));
    }

    @Test
    public void testPrototypeSetterRejectsNull() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertFalse(fn.setPrototype(null));
    }

    @Test
    public void testTemplateNameDefaultIsNull() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertNull(fn.getTemplateTypeName());
    }

    @Test
    public void testSubtypeListInitiallyNull() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertNull(fn.getSubTypes());
    }

    @Test
    public void testNonPrototypePropertyIsAbsent() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertFalse(fn.hasProperty("missing"));
        assertFalse(fn.hasOwnProperty("missing"));
        assertNull(fn.getPropertyType("missing"));
    }

    @Test
    public void testParametersNodeAndIterableAreConsistent() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertEquals(fn.getParametersNode().getChildCount(),
                Iterables.size(fn.getParameters()));
    }

    @Test
    public void testNonFunctionIsNotEquivalent() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        JSType object = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertFalse(fn.isEquivalentTo(object));
    }

    @Test
    public void testPrototypeBasedOnObjectType() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        ObjectType base = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        fn.setPrototypeBasedOn(base);
        assertSame(base, fn.getPrototype().getImplicitPrototype());
    }

    @Test
    public void testNullSourceIsInitialSource() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        assertNull(fn.getSource());
    }

    @Test
    public void testUnknownSupertypeRequiresConstructor() throws Exception {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        FunctionType fn = new FunctionBuilder(registry).build();
        try {
            fn.hasUnknownSupertype();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
