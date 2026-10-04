package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReferenceCollectingCallbackTest {
    @Test
    public void testEmptyCollectionIsNotWellDefined() throws Exception {
        assertFalse(new ReferenceCollectingCallback.ReferenceCollection().isWellDefined());
    }

    @Test
    public void testEmptyCollectionIsNeverAssigned() throws Exception {
        assertTrue(new ReferenceCollectingCallback.ReferenceCollection().isNeverAssigned());
    }

    @Test
    public void testEmptyCollectionIsNotAssignedOnce() throws Exception {
        assertFalse(new ReferenceCollectingCallback.ReferenceCollection().isAssignedOnceInLifetime());
    }

    @Test
    public void testEmptyCollectionIsNotEscaped() throws Exception {
        assertFalse(new ReferenceCollectingCallback.ReferenceCollection().isEscaped());
    }

    @Test
    public void testEmptyCollectionHasNoInitializingReference() throws Exception {
        assertNull(new ReferenceCollectingCallback.ReferenceCollection().getInitializingReference());
    }

    @Test
    public void testEmptyCollectionHasNoConstantInitializingReference() throws Exception {
        assertNull(new ReferenceCollectingCallback.ReferenceCollection().getInitializingReferenceForConstants());
    }

    @Test
    public void testEmptyCollectionDoesNotStartWithAssigningDeclaration() throws Exception {
        assertFalse(new ReferenceCollectingCallback.ReferenceCollection().firstReferenceIsAssigningDeclaration());
    }

    @Test
    public void testBasicBlockRootIsItsOwnParentlessBlock() throws Exception {
        Node root = new Node(Token.SCRIPT);
        ReferenceCollectingCallback.BasicBlock block =
                new ReferenceCollectingCallback.BasicBlock(null, root);
        assertNull(block.getParent());
        assertTrue(block.provablyExecutesBefore(block));
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
    public void testNestedBlockFollowsItsParent() throws Exception {
        ReferenceCollectingCallback.BasicBlock outer =
                new ReferenceCollectingCallback.BasicBlock(null, new Node(Token.SCRIPT));
        Node childRoot = new Node(Token.BLOCK);
        childRoot.addChildToBack(new Node(Token.EMPTY));
        ReferenceCollectingCallback.BasicBlock inner =
                new ReferenceCollectingCallback.BasicBlock(outer, childRoot);
        assertSame(outer, inner.getParent());
        assertTrue(outer.provablyExecutesBefore(inner));
    }

    @Test
    public void testConditionalBlockStartsAfterFirstChild() throws Exception {
        Node conditional = new Node(Token.IF);
        Node condition = new Node(Token.NAME);
        Node branch = new Node(Token.BLOCK);
        conditional.addChildToBack(condition);
        conditional.addChildToBack(branch);
        assertFalse(new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR)
                .shouldTraverse(null, condition, conditional));
    }

    @Test
    public void testShouldTraverseUnconditionallyReturnsTrueForNonBoundary() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertTrue(callback.shouldTraverse(null, new Node(Token.SCRIPT), null));
    }

    @Test
    public void testGetReferenceCollectionForUnknownVariableIsNull() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertNull(callback.getReferenceCollection(null));
    }

    @Test
    public void testProcessEmptyRootCompletes() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        callback.process(null, new Node(Token.SCRIPT));
        assertNull(callback.getReferenceCollection(null));
    }

    @Test
    public void testDeclarationClassificationForReferenceWithVarParent() throws Exception {
        Node name = Node.newString(Token.NAME, "v");
        Node parent = new Node(Token.VAR, name);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(parent);
        ReferenceCollectingCallback.Reference ref =
                new ReferenceCollectingCallback.Reference(name, parent,
                        null, new ReferenceCollectingCallback.BasicBlock(null, root));
        assertTrue(ref.isVarDeclaration());
        assertTrue(ref.isDeclaration());
        assertFalse(ref.isInitializingDeclaration());
    }

    @Test
    public void testInitializedVarIsLvalue() throws Exception {
        Node name = Node.newString(Token.NAME, "v");
        name.addChildToBack(Node.newNumber(1));
        Node parent = new Node(Token.VAR, name);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(parent);
        ReferenceCollectingCallback.Reference ref =
                new ReferenceCollectingCallback.Reference(name, parent,
                        null, new ReferenceCollectingCallback.BasicBlock(null, root));
        assertTrue(ref.isInitializingDeclaration());
        assertTrue(ref.isLvalue());
        assertSame(name.getFirstChild(), ref.getAssignedValue());
    }

    @Test
    public void testSimpleNameAssignmentIsLvalue() throws Exception {
        Node name = Node.newString(Token.NAME, "v");
        Node assignment = new Node(Token.ASSIGN, name, Node.newNumber(2));
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(assignment);
        ReferenceCollectingCallback.Reference ref =
                new ReferenceCollectingCallback.Reference(name, assignment,
                        null, new ReferenceCollectingCallback.BasicBlock(null, root));
        assertTrue(ref.isSimpleAssignmentToName());
        assertTrue(ref.isLvalue());
        assertSame(assignment.getLastChild(), ref.getAssignedValue());
    }

    @Test
    public void testDeclarationReferenceReportsNameAndParent() throws Exception {
        Node name = Node.newString(Token.NAME, "v");
        Node parent = new Node(Token.VAR, name);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(parent);
        ReferenceCollectingCallback.Reference ref =
                new ReferenceCollectingCallback.Reference(name, parent,
                        null, new ReferenceCollectingCallback.BasicBlock(null, root));
        assertSame(name, ref.getNameNode());
        assertSame(parent, ref.getParent());
        assertSame(root, ref.getGrandparent());
    }

    @Test
    public void testFunctionRootIsFunctionBlock() throws Exception {
        Node function = new Node(Token.FUNCTION);
        ReferenceCollectingCallback.BasicBlock block =
                new ReferenceCollectingCallback.BasicBlock(null, function);
        assertNull(block.getParent());
        assertTrue(block.provablyExecutesBefore(block));
    }

    @Test
    public void testCaseNodeIsTraversedAsBoundary() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        Node switchNode = new Node(Token.SWITCH);
        Node caseNode = new Node(Token.CASE);
        assertTrue(callback.shouldTraverse(null, caseNode, switchNode));
    }

    @Test
    public void testVisitWithNullTraversalOnNonNameLeavesCollectionAbsent() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        Node node = new Node(Token.EMPTY);
        callback.visit(null, node, null);
        assertNull(callback.getReferenceCollection(null));
    }

    @Test
    public void testGetReferenceCollectionOnEmptyCallbackIsNull() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertNull(callback.getReferenceCollection(null));
    }

    @Test
    public void testVisitNameWithNullTraversalCannotBeUsedToLookupReferences() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        Node name = Node.newString(Token.NAME, "v");
        try {
            callback.visit(null, name, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
        assertNull(callback.getReferenceCollection(null));
    }

    @Test
    public void testShouldTraverseAddsBoundaryBlockAndReturnsTrue() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        Node conditional = new Node(Token.IF);
        Node condition = new Node(Token.NAME);
        Node branch = new Node(Token.BLOCK);
        conditional.addChildToBack(condition);
        conditional.addChildToBack(branch);
        assertTrue(callback.shouldTraverse(null, branch, conditional));
        assertTrue(callback.shouldTraverse(null, new Node(Token.EMPTY), null));
    }

    @Test
    public void testShouldTraverseTreatsConditionalFirstChildAsNonBoundary() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        Node conditional = new Node(Token.OR);
        Node first = new Node(Token.NAME);
        Node second = new Node(Token.NAME);
        conditional.addChildToBack(first);
        conditional.addChildToBack(second);
        assertTrue(callback.shouldTraverse(null, first, conditional));
        assertTrue(callback.shouldTraverse(null, second, conditional));
    }

    @Test
    public void testShouldTraverseRecognizesCaseBoundary() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        Node caseNode = new Node(Token.CASE);
        assertTrue(callback.shouldTraverse(null, caseNode, null));
    }

    @Test
    public void testProcessEmptyRootWithNullExternsCompletes() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        callback.process(null, new Node(Token.SCRIPT));
        assertNull(callback.getReferenceCollection(null));
    }

    @Test
    public void testVisitDoesNotCreateReferenceForNonNameNode() throws Exception {
        ReferenceCollectingCallback callback =
                new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        callback.visit(null, new Node(Token.EMPTY), null);
        assertNull(callback.getReferenceCollection(null));
    }
}
