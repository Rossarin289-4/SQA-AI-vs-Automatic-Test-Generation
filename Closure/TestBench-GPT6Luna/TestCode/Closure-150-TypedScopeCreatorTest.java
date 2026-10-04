package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
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
import javax.annotation.Nullable;

public class TypedScopeCreatorTest {
    @Test
    public void testCreateScopeCannotConstructWithoutCompiler() throws Exception {
        assertEquals("(Proxy)", TypedScopeCreator.DELEGATE_PROXY_SUFFIX);
    }

    @Test
    public void testPrototypeSuffixExactText() throws Exception {
        assertEquals("(Proxy)", TypedScopeCreator.DELEGATE_PROXY_SUFFIX);
    }

    @Test
    public void testMalformedTypedefDiagnosticKey() throws Exception {
        assertEquals("JSC_MALFORMED_TYPEDEF",
                TypedScopeCreator.MALFORMED_TYPEDEF.key);
    }

    @Test
    public void testMalformedTypedefDiagnosticIsWarning() throws Exception {
        assertEquals("JSC_MALFORMED_TYPEDEF",
                TypedScopeCreator.MALFORMED_TYPEDEF.key);
    }

    @Test
    public void testEnumInitializerDiagnosticKey() throws Exception {
        assertEquals("JSC_ENUM_INITIALIZER_NOT_ENUM",
                TypedScopeCreator.ENUM_INITIALIZER.key);
    }

    @Test
    public void testEnumInitializerDiagnosticMessage() throws Exception {
        assertNotNull(TypedScopeCreator.ENUM_INITIALIZER.format);
    }

    @Test
    public void testConstructorExpectedDiagnosticKey() throws Exception {
        assertEquals("JSC_REFLECT_CONSTRUCTOR_EXPECTED",
                TypedScopeCreator.CONSTRUCTOR_EXPECTED.key);
    }

    @Test
    public void testConstructorExpectedDiagnosticMessage() throws Exception {
        assertNotNull(TypedScopeCreator.CONSTRUCTOR_EXPECTED.format);
    }

    @Test
    public void testCreateScopeMethodIsPublic() throws Exception {
        assertTrue(java.lang.reflect.Modifier.isPublic(
                TypedScopeCreator.class.getDeclaredMethod(
                        "createScope", Node.class, Scope.class).getModifiers()));
    }

    @Test
    public void testCreateScopeHasExpectedReturnType() throws Exception {
        assertEquals(Scope.class, TypedScopeCreator.class.getDeclaredMethod(
                "createScope", Node.class, Scope.class).getReturnType());
    }

    @Test
    public void testCreateScopeAcceptsRootAndParentParameters() throws Exception {
        Class<?>[] parameters = TypedScopeCreator.class.getDeclaredMethod(
                "createScope", Node.class, Scope.class).getParameterTypes();
        assertEquals(2, parameters.length);
        assertEquals(Node.class, parameters[0]);
        assertEquals(Scope.class, parameters[1]);
    }

    @Test
    public void testDelegateSuffixLength() throws Exception {
        assertEquals(7, TypedScopeCreator.DELEGATE_PROXY_SUFFIX.length());
    }

    @Test
    public void testMalformedTypedefDiagnosticIsNotNull() throws Exception {
        assertNotNull(TypedScopeCreator.MALFORMED_TYPEDEF);
    }
}
