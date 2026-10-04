package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InlineObjectLiteralsTest {
    @Test
    public void testPrefixExactValue() throws Exception {
        assertEquals("JSCompiler_object_inline_", InlineObjectLiterals.VAR_PREFIX);
    }

    @Test
    public void testPrefixLength() throws Exception {
        assertEquals(25, InlineObjectLiterals.VAR_PREFIX.length());
    }

    @Test
    public void testPrefixStartsWithCompiler() throws Exception {
        assertTrue(InlineObjectLiterals.VAR_PREFIX.startsWith("JSCompiler"));
    }

    @Test
    public void testPrefixEndsWithUnderscore() throws Exception {
        assertEquals('_', InlineObjectLiterals.VAR_PREFIX.charAt(
                InlineObjectLiterals.VAR_PREFIX.length() - 1));
    }

    @Test
    public void testPrefixHasInlineMarker() throws Exception {
        assertTrue(InlineObjectLiterals.VAR_PREFIX.contains("_inline_"));
    }

    @Test
    public void testPrefixFirstCharacter() throws Exception {
        assertEquals('J', InlineObjectLiterals.VAR_PREFIX.charAt(0));
    }

    @Test
    public void testPrefixCompilerBoundary() throws Exception {
        assertEquals("JSCompiler_", InlineObjectLiterals.VAR_PREFIX.substring(0, 11));
    }

    @Test
    public void testPrefixInlineBoundary() throws Exception {
        assertEquals("_object_inline_", InlineObjectLiterals.VAR_PREFIX.substring(10));
    }

    @Test
    public void testPrefixDoesNotStartWithLowercase() throws Exception {
        assertFalse(InlineObjectLiterals.VAR_PREFIX.startsWith("jscompiler"));
    }

    @Test
    public void testPrefixDoesNotEndWithLetter() throws Exception {
        assertFalse(InlineObjectLiterals.VAR_PREFIX.endsWith("e"));
    }

    @Test
    public void testPrefixConcatenation() throws Exception {
        assertEquals("JSCompiler_object_inline_key",
                InlineObjectLiterals.VAR_PREFIX + "key");
    }

    @Test
    public void testPrefixInteriorUnderscore() throws Exception {
        assertEquals('_', InlineObjectLiterals.VAR_PREFIX.charAt(10));
    }
}
