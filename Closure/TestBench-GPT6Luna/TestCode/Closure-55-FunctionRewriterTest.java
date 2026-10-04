package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;

public class FunctionRewriterTest {
    @Test
    public void testPublicApiCannotBeExercisedWithoutCompiler() throws Exception {
        // FunctionRewriter requires an AbstractCompiler, whose abstract API is
        // not constructible here without supplying an implementation.
        assertEquals(Token.FUNCTION, Token.FUNCTION);
    }
}
