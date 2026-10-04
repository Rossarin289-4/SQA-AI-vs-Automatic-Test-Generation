package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InlineVariablesTest {
    @Test
    public void testConstantsOnlyEmptyRoot() throws Exception {
        Compiler compiler = new Compiler();
        InlineVariables pass = new InlineVariables(
                compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        assertNotNull(pass);
    }

    @Test
    public void testLocalsOnlyEmptyRoot() throws Exception {
        Compiler compiler = new Compiler();
        InlineVariables pass = new InlineVariables(
                compiler, InlineVariables.Mode.LOCALS_ONLY, false);
        assertNotNull(pass);
    }

    @Test
    public void testAllModeEmptyRoot() throws Exception {
        Compiler compiler = new Compiler();
        InlineVariables pass = new InlineVariables(
                compiler, InlineVariables.Mode.ALL, false);
        assertNotNull(pass);
    }

    @Test
    public void testAllModeWithInlineAllStringsEmptyRoot() throws Exception {
        Compiler compiler = new Compiler();
        InlineVariables pass = new InlineVariables(
                compiler, InlineVariables.Mode.ALL, true);
        assertNotNull(pass);
    }

    @Test
    public void testConstantsOnlyWithInlineAllStringsEmptyRoot() throws Exception {
        Compiler compiler = new Compiler();
        InlineVariables pass = new InlineVariables(
                compiler, InlineVariables.Mode.CONSTANTS_ONLY, true);
        assertNotNull(pass);
    }

    @Test
    public void testLocalsOnlyWithInlineAllStringsEmptyRoot() throws Exception {
        Compiler compiler = new Compiler();
        InlineVariables pass = new InlineVariables(
                compiler, InlineVariables.Mode.LOCALS_ONLY, true);
        assertNotNull(pass);
    }

    @Test
    public void testProcessWithScriptRoot() throws Exception {
        Compiler compiler = new Compiler();
        InlineVariables pass = new InlineVariables(
                compiler, InlineVariables.Mode.ALL, false);
        assertNotNull(pass);
    }

    @Test
    public void testProcessWithEmptyBlockRoot() throws Exception {
        Compiler compiler = new Compiler();
        InlineVariables pass = new InlineVariables(
                compiler, InlineVariables.Mode.ALL, false);
        assertNotNull(pass);
    }

    @Test
    public void testPreconditionsCheckNotNullReturnsValue() throws Exception {
        Object value = new Object();
        assertSame(value, Preconditions.checkNotNull(value));
    }

    @Test
    public void testPreconditionsCheckNotNullThrowsOnNull() throws Exception {
        try {
            Preconditions.checkNotNull(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testPredicatesAlwaysTrueForNull() throws Exception {
        Predicate<Object> predicate = Predicates.alwaysTrue();
        assertTrue(predicate.apply(null));
    }

    @Test
    public void testPredicatesAlwaysTrueForObject() throws Exception {
        Predicate<Object> predicate = Predicates.alwaysTrue();
        assertTrue(predicate.apply(new Object()));
    }
}
