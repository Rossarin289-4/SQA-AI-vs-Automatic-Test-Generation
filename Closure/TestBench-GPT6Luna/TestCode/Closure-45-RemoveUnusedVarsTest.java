package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.DefinitionsRemover.Definition;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.*;

public class RemoveUnusedVarsTest {
    @Test
    public void testRemoveUnreferencedLocal() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testPreserveReferencedLocal() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testRemoveUnreferencedGlobalWhenEnabled() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testPreserveGlobalWhenRemovalDisabled() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testPreserveExportedVariable() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testRemoveUnusedFunctionDeclaration() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testPreserveReferencedFunctionDeclaration() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testTrimUnusedTrailingFunctionParameters() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testKeepUsedTrailingFunctionParameter() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testRemoveUnusedDeclarationWithSideEffectingInitializer() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testRemoveUnusedAssignment() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }

    @Test
    public void testKeepVariableReferencedByFunctionBody() throws Exception {
        fail("Cannot construct the required compiler from the supplied API information.");
    }
}
