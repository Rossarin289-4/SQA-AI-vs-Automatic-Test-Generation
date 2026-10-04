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
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import java.util.ArrayDeque;
import java.util.Deque;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import java.util.LinkedHashMap;

public class InlineVariablesTest {
    @Test
    public void testReferenceCollectionEmptyAndMissingInitialization() throws Exception {
        ReferenceCollection refs = new ReferenceCollection();
        assertFalse(refs.isWellDefined());
        assertFalse(refs.isAssignedOnceInLifetime());
        assertTrue(refs.isNeverAssigned());
        assertNull(refs.getInitializingReference());
    }

    @Test
    public void testReferenceCollectionWithoutAssignments() throws Exception {
        ReferenceCollection refs = new ReferenceCollection();
        assertTrue(refs.references.isEmpty());
        assertNull(refs.getInitializingReferenceForConstants());
        assertFalse(refs.firstReferenceIsAssigningDeclaration());
    }

    @Test
    public void testBasicBlockRootWithoutParent() throws Exception {
        Node root = new Node(Token.BLOCK);
        ReferenceCollectingCallback.BasicBlock block =
            new ReferenceCollectingCallback.BasicBlock(null, root);
        assertNull(block.getParent());
        assertFalse(block.provablyExecutesBefore(block));
    }

    @Test
    public void testBasicBlockAncestorOrdering() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node child = new Node(Token.BLOCK);
        root.addChildToBack(child);
        ReferenceCollectingCallback.BasicBlock outer =
            new ReferenceCollectingCallback.BasicBlock(null, root);
        ReferenceCollectingCallback.BasicBlock inner =
            new ReferenceCollectingCallback.BasicBlock(outer, child);
        assertTrue(outer.provablyExecutesBefore(inner));
        assertFalse(inner.provablyExecutesBefore(outer));
    }

    @Test
    public void testBasicBlockSeparateBranchesAreNotOrdered() throws Exception {
        Node root = new Node(Token.BLOCK);
        Node leftNode = new Node(Token.BLOCK);
        Node rightNode = new Node(Token.BLOCK);
        root.addChildToBack(leftNode);
        root.addChildToBack(rightNode);
        ReferenceCollectingCallback.BasicBlock rootBlock =
            new ReferenceCollectingCallback.BasicBlock(null, root);
        ReferenceCollectingCallback.BasicBlock left =
            new ReferenceCollectingCallback.BasicBlock(rootBlock, leftNode);
        ReferenceCollectingCallback.BasicBlock right =
            new ReferenceCollectingCallback.BasicBlock(rootBlock, rightNode);
        assertFalse(left.provablyExecutesBefore(right));
        assertFalse(right.provablyExecutesBefore(left));
    }

    @Test
    public void testBasicBlockLoopAndParent() throws Exception {
        Node loop = new Node(Token.WHILE);
        Node body = new Node(Token.BLOCK);
        loop.addChildToBack(body);
        ReferenceCollectingCallback.BasicBlock loopBlock =
            new ReferenceCollectingCallback.BasicBlock(null, loop);
        ReferenceCollectingCallback.BasicBlock bodyBlock =
            new ReferenceCollectingCallback.BasicBlock(loopBlock, body);
        assertSame(loopBlock, bodyBlock.getParent());
        assertTrue(loopBlock.provablyExecutesBefore(bodyBlock));
    }

    @Test
    public void testBasicBlockHoistedFunctionBlocksOrdering() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node function = new Node(Token.FUNCTION);
        function.addChildToBack(Node.newString(Token.NAME, "f"));
        parent.addChildToBack(function);
        ReferenceCollectingCallback.BasicBlock outer =
            new ReferenceCollectingCallback.BasicBlock(null, parent);
        ReferenceCollectingCallback.BasicBlock hoisted =
            new ReferenceCollectingCallback.BasicBlock(outer, function);
        assertFalse(outer.provablyExecutesBefore(hoisted));
    }

    @Test
    public void testCallbackReferencedVariablesInitiallyEmpty() throws Exception {
        ReferenceCollectingCallback callback =
            new ReferenceCollectingCallback(null,
                ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertTrue(callback.getReferencedVariables().isEmpty());
        assertNull(callback.getReferenceCollection(null));
    }

    @Test
    public void testReferenceCollectionAssignmentQueriesInitiallyEmpty() throws Exception {
        ReferenceCollection refs = new ReferenceCollection();
        assertFalse(refs.firstReferenceIsAssigningDeclaration());
        assertNull(refs.getInitializingReferenceForConstants());
        assertNull(refs.getInitializingReference());
    }

    @Test
    public void testScopeRootAndGlobalStatus() throws Exception {
        Node root = new Node(Token.BLOCK);
        Scope scope = new Scope(root, (ObjectType) null);
        assertSame(root, scope.getRootNode());
        assertTrue(scope.isGlobal());
        assertFalse(scope.isLocal());
        assertNull(scope.getParent());
    }

    @Test
    public void testScopeVariablesInitiallyEmpty() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        assertEquals(0, scope.getVarCount());
        assertFalse(scope.isDeclared("missing", true));
        assertNull(scope.getVar("missing"));
        assertNull(scope.getOwnSlot("missing"));
        assertTrue(scope.getVars().hasNext() == false);
    }

    @Test
    public void testScopeArgumentsVariableIsStable() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Var arguments = scope.getArgumentsVar();
        assertSame(arguments, scope.getArgumentsVar());
        assertEquals("arguments", arguments.getName());
        assertTrue(arguments.isGlobal());
        assertFalse(arguments.isLocal());
    }

    @Test
    public void testCallbackBehaviorDoesNothingOnEmptyMap() throws Exception {
        ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR.afterExitScope(null, Maps.<Var, ReferenceCollection>newHashMap());
        assertTrue(true);
    }

    @Test
    public void testProcessWithEmptyScript() throws Exception {
        Node root = new Node(Token.SCRIPT);
        InlineVariables pass =
            new InlineVariables(new Compiler(), InlineVariables.Mode.ALL, false);
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
    }

    @Test
    public void testVisitNameWithoutScopeDoesNothing() throws Exception {
        ReferenceCollectingCallback callback =
            new ReferenceCollectingCallback(null,
                ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        Node name = Node.newString(Token.NAME, "x");
        callback.visit(null, name, null);
        assertTrue(callback.getReferencedVariables().isEmpty());
    }

    @Test
    public void testEnterExitScopeDoNothingBehavior() throws Exception {
        ReferenceCollectingCallback callback =
            new ReferenceCollectingCallback(null,
                ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        callback.enterScope(null);
        callback.exitScope(null);
        assertTrue(callback.getReferencedVariables().isEmpty());
    }

    @Test
    public void testShouldTraverseWithNullParent() throws Exception {
        ReferenceCollectingCallback callback =
            new ReferenceCollectingCallback(null,
                ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertTrue(callback.shouldTraverse(null, new Node(Token.SCRIPT), null));
    }

    @Test
    public void testArgumentsVarBasicNameAndType() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Var arguments = scope.getArgumentsVar();
        assertNull(arguments.getParentNode());
        assertNull(arguments.getNameNode());
        assertNull(arguments.getType());
        assertNull(arguments.getJSDocInfo());
        assertFalse(arguments.isConst());
        assertFalse(arguments.isDefine());
        assertFalse(arguments.isTypeInferred());
        assertFalse(arguments.isNoShadow());
        assertEquals("Scope.Var arguments", arguments.toString());
        assertEquals("<non-file>", arguments.getInputName());
    }

    @Test
    public void testScopeParentScopeAndTypeOfThis() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        assertNull(scope.getParentScope());
        assertNull(scope.getTypeOfThis());
    }

    @Test
    public void testScopeSlotLookupsMissing() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        assertNull(scope.getSlot("x"));
        assertNull(scope.getOwnSlot("x"));
    }

    @Test
    public void testShouldTraverseBlockBoundaryReturnsTrue() throws Exception {
        ReferenceCollectingCallback callback =
            new ReferenceCollectingCallback(null,
                ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertTrue(callback.shouldTraverse(null, new Node(Token.BLOCK), null));
    }
}
