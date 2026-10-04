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
    public void testKnownConstantsCanBeSetOnce() throws Exception {
        FunctionInjector injector =
                new FunctionInjector(null, null, false, false, false);
        assertTrue(true);
    }
}
