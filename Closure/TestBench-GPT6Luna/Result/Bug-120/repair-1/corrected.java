package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticReference;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.StaticSymbolTable;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReferenceCollectingCallbackTest {
    @Test
    public void testReferenceCollectionIteratorEmpty() throws Exception {
        ReferenceCollectingCallback.ReferenceCollection refs =
                new ReferenceCollectingCallback.ReferenceCollection();
        assertFalse(refs.iterator().hasNext());
    }

    @Test
    public void testReferenceCollectionNeverAssignedEmpty() throws Exception {
        ReferenceCollectingCallback.ReferenceCollection refs =
                new ReferenceCollectingCallback.ReferenceCollection();
        assertTrue(refs.isNeverAssigned());
    }

    @Test
    public void testReferenceCollectionNotAssignedOnceWhenEmpty() throws Exception {
        ReferenceCollectingCallback.ReferenceCollection refs =
                new ReferenceCollectingCallback.ReferenceCollection();
        assertFalse(refs.isAssignedOnceInLifetime());
    }

    @Test
    public void testReferenceCollectionNotWellDefinedWhenEmpty() throws Exception {
        ReferenceCollectingCallback.ReferenceCollection refs =
                new ReferenceCollectingCallback.ReferenceCollection();
        assertFalse(refs.isWellDefined());
    }

    @Test
    public void testReferenceCollectionFirstReferenceNotAssigningWhenEmpty() throws Exception {
        ReferenceCollectingCallback.ReferenceCollection refs =
                new ReferenceCollectingCallback.ReferenceCollection();
        assertFalse(refs.firstReferenceIsAssigningDeclaration());
    }

    @Test
    public void testBasicBlockWithoutParentIsGlobalBlock() throws Exception {
        ReferenceCollectingCallback.BasicBlock block =
                new ReferenceCollectingCallback.BasicBlock(null, new Node(Token.SCRIPT));
        assertTrue(block.isGlobalScopeBlock());
        assertNull(block.getParent());
    }

    @Test
    public void testBasicBlockChildIsNotGlobalBlock() throws Exception {
        ReferenceCollectingCallback.BasicBlock parent =
                new ReferenceCollectingCallback.BasicBlock(null, new Node(Token.SCRIPT));
        ReferenceCollectingCallback.BasicBlock child =
                new ReferenceCollectingCallback.BasicBlock(parent, new Node(Token.BLOCK));
        assertFalse(child.isGlobalScopeBlock());
        assertSame(parent, child.getParent());
    }

    @Test
    public void testBasicBlockExecutionBeforeDescendant() throws Exception {
        ReferenceCollectingCallback.BasicBlock parent =
                new ReferenceCollectingCallback.BasicBlock(null, new Node(Token.SCRIPT));
        ReferenceCollectingCallback.BasicBlock child =
                new ReferenceCollectingCallback.BasicBlock(parent, new Node(Token.BLOCK));
        assertTrue(parent.provablyExecutesBefore(child));
    }

    @Test
    public void testBasicBlockDoesNotExecuteBeforeUnrelatedBlock() throws Exception {
        ReferenceCollectingCallback.BasicBlock first =
                new ReferenceCollectingCallback.BasicBlock(null, new Node(Token.SCRIPT));
        ReferenceCollectingCallback.BasicBlock second =
                new ReferenceCollectingCallback.BasicBlock(null, new Node(Token.SCRIPT));
        assertFalse(first.provablyExecutesBefore(second));
    }

    @Test
    public void testBasicBlockGlobalBlocksExecuteBeforeEachOther() throws Exception {
        ReferenceCollectingCallback.BasicBlock first =
                new ReferenceCollectingCallback.BasicBlock(null, new Node(Token.SCRIPT));
        ReferenceCollectingCallback.BasicBlock second =
                new ReferenceCollectingCallback.BasicBlock(null, new Node(Token.SCRIPT));
        assertTrue(first.provablyExecutesBefore(second));
    }

    @Test
    public void testBasicBlockLoopRootHasParentLoopToken() throws Exception {
        Node loop = new Node(Token.WHILE);
        Node body = new Node(Token.BLOCK);
        loop.addChildToBack(body);
        ReferenceCollectingCallback.BasicBlock block =
                new ReferenceCollectingCallback.BasicBlock(null, body);
        assertFalse(block.isGlobalScopeBlock());
        assertNull(block.getParent());
    }

    @Test
    public void testCallbackInitiallyHasNoSymbols() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null,
                        ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertFalse(callback.getAllSymbols().iterator().hasNext());
    }

    @Test
    public void testCallbackReferencesAbsentBeforeTraversal() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null,
                        ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertNull(callback.getReferences(null));
    }

    @Test
    public void testCallbackScopeOfNullVariableIsNull() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null,
                        ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertNull(callback.getScope(null));
    }

    @Test
    public void testShouldTraverseOrdinaryScriptReturnsTrue() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null,
                        ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertTrue(callback.shouldTraverse(null, new Node(Token.SCRIPT), null));
    }

    @Test
    public void testVisitNameWithoutTraversalScopeDoesNotCreateSymbol() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null,
                        ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        callback.visit(null, Node.newString(Token.NAME, "x"), null);
        assertFalse(callback.getAllSymbols().iterator().hasNext());
    }

    @Test
    public void testVisitNonNameDoesNotCreateSymbol() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null,
                        ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        callback.visit(null, new Node(Token.NUMBER), null);
        assertFalse(callback.getAllSymbols().iterator().hasNext());
    }

    @Test
    public void testReferenceCollectionIteratorHasExactAddedEntry() throws Exception {
        ReferenceCollectingCallback.Reference ref =
                ReferenceCollectingCallback.Reference.createRefForTest(
                        new CompilerInput(new SourceFile("input.js")));
        ReferenceCollectingCallback.ReferenceCollection refs =
                new ReferenceCollectingCallback.ReferenceCollection();
        refs.add(ref);
        Iterator<ReferenceCollectingCallback.Reference> iterator = refs.iterator();
        assertTrue(iterator.hasNext());
        assertSame(ref, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testCollectionDoesNotClaimNeverAssignedForReference() throws Exception {
        ReferenceCollectingCallback.Reference ref =
                ReferenceCollectingCallback.Reference.createRefForTest(
                        new CompilerInput(new SourceFile("input.js")));
        ReferenceCollectingCallback.ReferenceCollection refs =
                new ReferenceCollectingCallback.ReferenceCollection();
        refs.add(ref);
        assertFalse(refs.isNeverAssigned());
    }
}
