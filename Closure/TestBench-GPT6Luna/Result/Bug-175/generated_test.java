package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class FunctionInjectorTest {
    @Test
    public void testSetKnownConstantsAcceptsNonEmptySet() throws Exception {
        Compiler compiler = new Compiler();
        FunctionInjector injector = new FunctionInjector(
                compiler, new Supplier<String>() {
                    public String get() { return "id"; }
                }, false, false, false);
        injector.setKnownConstants(Sets.newHashSet("KNOWN"));
        assertTrue(true);
    }

    @Test
    public void testSetKnownConstantsAcceptsEmptySet() throws Exception {
        Compiler compiler = new Compiler();
        FunctionInjector injector = new FunctionInjector(
                compiler, new Supplier<String>() {
                    public String get() { return "id"; }
                }, false, false, false);
        injector.setKnownConstants(Sets.<String>newHashSet());
        assertTrue(true);
    }

    @Test
    public void testSetKnownConstantsRejectsSecondAssignment() throws Exception {
        Compiler compiler = new Compiler();
        FunctionInjector injector = new FunctionInjector(
                compiler, new Supplier<String>() {
                    public String get() { return "id"; }
                }, false, false, false);
        injector.setKnownConstants(Sets.newHashSet("FIRST"));
        try {
            injector.setKnownConstants(Sets.newHashSet("SECOND"));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals(IllegalStateException.class, expected.getClass());
        }
    }

    @Test
    public void testSetKnownConstantsAllowsReassignmentWhileCurrentSetEmpty() throws Exception {
        Compiler compiler = new Compiler();
        FunctionInjector injector = new FunctionInjector(
                compiler, new Supplier<String>() {
                    public String get() { return "id"; }
                }, false, false, false);
        injector.setKnownConstants(Sets.<String>newHashSet());
        injector.setKnownConstants(Sets.newHashSet("LATER"));
        assertTrue(true);
    }

    @Test
    public void testConstructorRejectsNullCompiler() throws Exception {
        try {
            new FunctionInjector(null, new Supplier<String>() {
                public String get() { return "id"; }
            }, false, false, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    @Test
    public void testConstructorRejectsNullSupplier() throws Exception {
        try {
            new FunctionInjector(new Compiler(), null, false, false, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }
}
