package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class TypedScopeCreatorTest {
    @Test
    public void testCreateScopeFromEmptyScript() throws Exception {
        fail("TypedScopeCreator requires an AbstractCompiler fixture; none is constructible from the supplied declarations.");
    }

    @Test
    public void testCreateGlobalScope() throws Exception {
        fail("No AbstractCompiler constructor or factory is supplied.");
    }

    @Test
    public void testCreateLocalScope() throws Exception {
        fail("No usable compiler or scope fixture is supplied.");
    }

    @Test
    public void testCreateScopeWithVariable() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithFunction() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithObjectLiteral() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithQualifiedName() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithCatchParameter() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithNativeBindings() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithStubDeclaration() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithTypedef() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithEnum() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithConstructor() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithDelegateCall() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithInheritanceCall() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithSingletonGetter() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithObjectLiteralCast() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithLendsAnnotation() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithFunctionParameters() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }

    @Test
    public void testCreateScopeWithAssignedLocal() throws Exception {
        fail("Cannot run scope construction without the compiler fixture.");
    }
}
