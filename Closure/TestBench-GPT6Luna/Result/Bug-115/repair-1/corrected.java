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
    public void testConstructorRejectsNullCompiler() throws Exception {
        try {
            new FunctionInjector(null, new Supplier<String>() {
                public String get() { return "x"; }
            }, false, false, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testConstructorRejectsNullSupplier() throws Exception {
        try {
            new FunctionInjector(null, null, false, false, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }
}
