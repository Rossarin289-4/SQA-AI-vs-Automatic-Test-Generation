package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.UnknownType;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;

public class TypeValidatorTest {
    @Test
    public void testTypeMismatchEqualityAcceptsReversedTypes() throws Exception {
        TypeValidator.TypeMismatch first = new TypeValidator.TypeMismatch(null, null, null);
        TypeValidator.TypeMismatch reversed = new TypeValidator.TypeMismatch(null, null, null);
        assertTrue(first.equals(reversed));
    }

    @Test
    public void testTypeMismatchNotEqualToNull() throws Exception {
        TypeValidator.TypeMismatch mismatch = new TypeValidator.TypeMismatch(null, null, null);
        assertFalse(mismatch.equals(null));
    }

    @Test
    public void testTypeMismatchNotEqualToOtherObject() throws Exception {
        TypeValidator.TypeMismatch mismatch = new TypeValidator.TypeMismatch(null, null, null);
        assertFalse(mismatch.equals("other"));
    }

    @Test
    public void testTypeMismatchHashCodeForNullTypes() throws Exception {
        TypeValidator.TypeMismatch mismatch = new TypeValidator.TypeMismatch(null, null, null);
        assertEquals(Objects.hashCode(null, null), mismatch.hashCode());
    }

    @Test
    public void testTypeMismatchStringForNullTypes() throws Exception {
        TypeValidator.TypeMismatch mismatch = new TypeValidator.TypeMismatch(null, null, null);
        assertEquals("(null, null)", mismatch.toString());
    }

    @Test
    public void testGetMismatchesNotNull() throws Exception {
        assertNotNull(TypeValidator.class.getDeclaredMethods());
    }

    @Test
    public void testDiagnosticWarningLevelForInvalidCast() throws Exception {
        assertEquals(CheckLevel.WARNING, TypeValidator.INVALID_CAST.defaultLevel);
    }

    @Test
    public void testDiagnosticWarningLevelForTypeMismatch() throws Exception {
        assertEquals(CheckLevel.WARNING, TypeValidator.TYPE_MISMATCH_WARNING.defaultLevel);
    }

    @Test
    public void testDiagnosticWarningLevelForMissingExtends() throws Exception {
        assertEquals(CheckLevel.WARNING, TypeValidator.MISSING_EXTENDS_TAG_WARNING.defaultLevel);
    }

    @Test
    public void testDiagnosticWarningLevelForDuplicateVariable() throws Exception {
        assertEquals(CheckLevel.WARNING, TypeValidator.DUP_VAR_DECLARATION.defaultLevel);
    }

    @Test
    public void testDiagnosticWarningLevelForHiddenPropertyMismatch() throws Exception {
        assertEquals(CheckLevel.WARNING, TypeValidator.HIDDEN_PROPERTY_MISMATCH.defaultLevel);
    }

    @Test
    public void testDiagnosticWarningLevelForUnimplementedInterfaceMethod() throws Exception {
        assertEquals(CheckLevel.WARNING, TypeValidator.INTERFACE_METHOD_NOT_IMPLEMENTED.defaultLevel);
    }
}
