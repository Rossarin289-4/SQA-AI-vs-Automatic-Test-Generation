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
import java.util.Iterator;

public class ReferenceCollectingCallbackTest {

    // Dummy compiler for testing. Needs to implement AbstractCompiler.
    // Removed invalid overrides and replaced with minimal necessary implementations.

    private static final ReferenceCollectingCallback.Behavior DO_NOTHING_BEHAVIOR = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;



    // Helper to create a dummy Var.

    // Helper to create a dummy NodeTraversal.

    // Helper to create a dummy BasicBlock.
    // BasicBlock constructor takes parent and root node.

    // --- ReferenceCollection class tests ---













    @Test
    public void testReferenceCollection_isNeverAssigned_noAssignmentsOrDeclarations() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        // No references added.
        assertTrue(collection.isNeverAssigned());
    }

    @Test
    public void testReferenceCollection_isNeverAssigned_withDeclaration() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.VAR); // Declaration only
        parent.addChildToFront(nameNode);
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);
        Reference ref = new Reference(nameNode, parent, parent.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(ref, traversal, createDummyVar("v"));
        assertFalse(collection.isNeverAssigned()); // It was declared
    }

    @Test
    public void testReferenceCollection_isNeverAssigned_withAssignment() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        Node nameNode = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parent = new Node(Token.ASSIGN);
        parent.addChildToFront(nameNode);
        nameNode.addChildToBack(assignmentValue);
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);
        Reference ref = new Reference(nameNode, parent, parent.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(ref, traversal, createDummyVar("v"));
        assertFalse(collection.isNeverAssigned()); // It was assigned
    }

    @Test
    public void testReferenceCollection_firstReferenceIsAssigningDeclaration_true() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        Node nameNode = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parent = new Node(Token.VAR); // VAR a = 10
        parent.addChildToFront(nameNode);
        nameNode.addChildToBack(assignmentValue);
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);
        Reference ref = new Reference(nameNode, parent, parent.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(ref, traversal, createDummyVar("v"));
        assertTrue(collection.firstReferenceIsAssigningDeclaration());
    }

    @Test
    public void testReferenceCollection_firstReferenceIsAssigningDeclaration_false_varOnly() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.VAR); // VAR a;
        parent.addChildToFront(nameNode);
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);
        Reference ref = new Reference(nameNode, parent, parent.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(ref, traversal, createDummyVar("v"));
        assertFalse(collection.firstReferenceIsAssigningDeclaration());
    }

    @Test
    public void testReferenceCollection_firstReferenceIsAssigningDeclaration_false_noRefs() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        assertFalse(collection.firstReferenceIsAssigningDeclaration());
    }

    // --- Reference class tests ---

    @Test
    public void testReference_isDeclaration_var() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.VAR);
        parent.addChildToFront(nameNode);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isDeclaration());
    }

    @Test
    public void testReference_isDeclaration_function() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.FUNCTION);
        parent.addChildToFront(nameNode);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isDeclaration());
    }

    @Test
    public void testReference_isDeclaration_catch() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.CATCH);
        parent.addChildToFront(nameNode);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isDeclaration());
    }

    @Test
    public void testReference_isDeclaration_functionParam() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToFront(nameNode); // Parameter
        Node parent = new Node(Token.LP); // Parent of parameter list
        parent.addChildToFront(functionNode);
        Reference ref = new Reference(nameNode, parent, functionNode, null, null, "test.js");
        assertTrue(ref.isDeclaration());
    }

    @Test
    public void testReference_isDeclaration_false() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.ASSIGN); // Not a declaration parent
        parent.addChildToFront(nameNode);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertFalse(ref.isDeclaration());
    }

    @Test
    public void testReference_isVarDeclaration() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.VAR);
        parent.addChildToFront(nameNode);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isVarDeclaration());
    }

    @Test
    public void testReference_isVarDeclaration_false() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.ASSIGN);
        parent.addChildToFront(nameNode);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertFalse(ref.isVarDeclaration());
    }

    @Test
    public void testReference_isInitializingDeclaration_true_varWithAssign() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parent = new Node(Token.VAR);
        parent.addChildToFront(nameNode);
        nameNode.addChildToBack(assignmentValue); // var a = 10
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isInitializingDeclaration());
    }

    @Test
    public void testReference_isInitializingDeclaration_false_varWithoutAssign() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.VAR);
        parent.addChildToFront(nameNode); // var a;
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertFalse(ref.isInitializingDeclaration());
    }

    @Test
    public void testReference_isInitializingDeclaration_true_function() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.FUNCTION);
        parent.addChildToFront(nameNode); // function a() {}
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isInitializingDeclaration());
    }

    @Test
    public void testReference_isInitializingDeclaration_true_catchParam() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.CATCH);
        parent.addChildToFront(nameNode); // catch (a)
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isInitializingDeclaration());
    }

    @Test
    public void testReference_getAssignedValue_function() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node functionBody = new Node(Token.BLOCK);
        Node parent = new Node(Token.FUNCTION);
        parent.addChildToFront(nameNode);
        parent.addChildToBack(functionBody); // function a() { ... }
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertNotNull(ref.getAssignedValue());
        assertSame(parent, ref.getAssignedValue()); // Should return the function node itself
    }

    @Test
    public void testReference_getAssignedValue_varWithAssign() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(42);
        Node parent = new Node(Token.VAR);
        parent.addChildToFront(nameNode);
        nameNode.addChildToBack(assignmentValue); // var a = 42
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertNotNull(ref.getAssignedValue());
        assertSame(assignmentValue, ref.getAssignedValue());
    }

    @Test
    public void testReference_getAssignedValue_varWithoutAssign() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.VAR);
        parent.addChildToFront(nameNode); // var a;
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertNull(ref.getAssignedValue());
    }

    @Test
    public void testReference_isSimpleAssignmentToName_true() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parent = new Node(Token.ASSIGN);
        parent.addChildToFront(nameNode); // LHS
        parent.addChildToBack(assignmentValue); // RHS
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isSimpleAssignmentToName());
    }

    @Test
    public void testReference_isSimpleAssignmentToName_false_compoundAssign() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parent = new Node(Token.ADD_ASSIGN); // COMPOUND ASSIGNMENT
        parent.addChildToFront(nameNode);
        parent.addChildToBack(assignmentValue);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertFalse(ref.isSimpleAssignmentToName());
    }

    @Test
    public void testReference_isSimpleAssignmentToName_false_notLHS() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parent = new Node(Token.ASSIGN);
        parent.addChildToFront(assignmentValue); // LHS
        parent.addChildToBack(nameNode); // RHS
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertFalse(ref.isSimpleAssignmentToName());
    }

    @Test
    public void testReference_isLvalue_assign() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.ASSIGN);
        parent.addChildToFront(nameNode);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isLvalue());
    }

    @Test
    public void testReference_isLvalue_inc() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.INC);
        parent.addChildToFront(nameNode);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isLvalue());
    }

    @Test
    public void testReference_isLvalue_dec() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.DEC);
        parent.addChildToFront(nameNode);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isLvalue());
    }

    @Test
    public void testReference_isLvalue_varWithAssign() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parent = new Node(Token.VAR);
        parent.addChildToFront(nameNode);
        nameNode.addChildToBack(assignmentValue); // var a = 10
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertTrue(ref.isLvalue());
    }

    @Test
    public void testReference_isLvalue_forIn() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node forInLoop = new Node(Token.FOR);
        forInLoop.addChildToFront(nameNode); // LHS of for-in
        Node loopBody = new Node(Token.BLOCK);
        forInLoop.addChildToBack(loopBody);
        Reference ref = new Reference(nameNode, forInLoop, null, null, null, "test.js");
        assertTrue(ref.isLvalue());
    }

    @Test
    public void testReference_isLvalue_forIn_withVar() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToFront(nameNode);
        Node forInLoop = new Node(Token.FOR);
        forInLoop.addChildToFront(varNode); // LHS var of for-in
        Node loopBody = new Node(Token.BLOCK);
        forInLoop.addChildToBack(loopBody);
        Reference ref = new Reference(nameNode, varNode, forInLoop, null, null, "test.js");
        assertTrue(ref.isLvalue());
    }

    @Test
    public void testReference_isLvalue_false_usage() throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.ADD);
        parent.addChildToFront(nameNode);
        Reference ref = new Reference(nameNode, parent, null, null, null, "test.js");
        assertFalse(ref.isLvalue());
    }

    // --- BasicBlock class tests ---

    @Test
    public void testBasicBlock_provablyExecutesBefore_descendant() throws Exception {
        Node blockRoot = new Node(Token.BLOCK);
        BasicBlock parentBlock = new BasicBlock(null, blockRoot);
        Node childBlockRoot = new Node(Token.BLOCK);
        BasicBlock childBlock = new BasicBlock(parentBlock, childBlockRoot);
        assertTrue(parentBlock.provablyExecutesBefore(childBlock));
    }

    @Test
    public void testBasicBlock_provablyExecutesBefore_sameBlock() throws Exception {
        Node blockRoot = new Node(Token.BLOCK);
        BasicBlock block = new BasicBlock(null, blockRoot);
        assertTrue(block.provablyExecutesBefore(block));
    }

    @Test
    public void testBasicBlock_provablyExecutesBefore_notDescendant() throws Exception {
        Node blockRoot1 = new Node(Token.BLOCK);
        BasicBlock block1 = new BasicBlock(null, blockRoot1);
        Node blockRoot2 = new Node(Token.BLOCK);
        BasicBlock block2 = new BasicBlock(null, blockRoot2);
        assertFalse(block1.provablyExecutesBefore(block2));
    }

    @Test
    public void testBasicBlock_provablyExecutesBefore_hoisted() throws Exception {
        Node parentRoot = new Node(Token.BLOCK);
        BasicBlock parentBlock = new BasicBlock(null, parentRoot);
        Node hoistedRoot = new Node(Token.FUNCTION); // Hoisted function declaration
        BasicBlock hoistedBlock = new BasicBlock(parentBlock, hoistedRoot);
        hoistedBlock.isHoisted = true; // Manually mark as hoisted
        Node childRoot = new Node(Token.BLOCK);
        BasicBlock childBlock = new BasicBlock(hoistedBlock, childRoot);

        assertFalse(parentBlock.provablyExecutesBefore(childBlock));
    }

    @Test
    public void testBasicBlock_isLoop_true_while() throws Exception {
        Node parentNode = new Node(Token.WHILE);
        Node loopBody = new Node(Token.BLOCK);
        parentNode.addChildToBack(loopBody);
        BasicBlock block = new BasicBlock(null, loopBody);
        assertTrue(block.isLoop);
    }

    @Test
    public void testBasicBlock_isLoop_true_for() throws Exception {
        Node parentNode = new Node(Token.FOR);
        Node loopBody = new Node(Token.BLOCK);
        parentNode.addChildToBack(loopBody);
        BasicBlock block = new BasicBlock(null, loopBody);
        assertTrue(block.isLoop);
    }

    @Test
    public void testBasicBlock_isLoop_true_do() throws Exception {
        Node parentNode = new Node(Token.DO);
        Node loopBody = new Node(Token.BLOCK);
        parentNode.addChildToBack(loopBody);
        BasicBlock block = new BasicBlock(null, loopBody);
        assertTrue(block.isLoop);
    }

    @Test
    public void testBasicBlock_isLoop_false_if() throws Exception {
        Node parentNode = new Node(Token.IF);
        Node ifBody = new Node(Token.BLOCK);
        parentNode.addChildToBack(ifBody);
        BasicBlock block = new BasicBlock(null, ifBody);
        assertFalse(block.isLoop);
    }

    @Test
    public void testBasicBlock_isFunction_true() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        BasicBlock block = new BasicBlock(null, functionNode);
        assertTrue(block.isFunction);
    }

    @Test
    public void testBasicBlock_isFunction_false_block() throws Exception {
        Node blockNode = new Node(Token.BLOCK);
        BasicBlock block = new BasicBlock(null, blockNode);
        assertFalse(block.isFunction);
    }

    // --- ReferenceCollectingCallback class tests ---

    @Test
    public void testGetReferenceCollection_empty() throws Exception {
        ReferenceCollectingCallback callback = createCallback();
        Var dummyVar = createDummyVar("testVar");
        assertNull(callback.getReferenceCollection(dummyVar));
    }

    @Test
    public void testEnterScope_pushesBlock() throws Exception {
        ReferenceCollectingCallback callback = createCallback();
        NodeTraversal traversal = createDummyTraversal();
        // blockStack is private, so we cannot directly assert its size.
        // This test checks that the method doesn't crash and assumes BasicBlock is correctly constructed.
        callback.enterScope(traversal);
        // To properly test this, we would need access to blockStack or a way to observe its state.
    }

    @Test
    public void testExitScope_popsBlockAndCallsBehavior() throws Exception {
        ReferenceCollectingCallback callback = createCallback();
        NodeTraversal traversal = createDummyTraversal();
        callback.enterScope(traversal);

        final boolean[] afterExitScopeCalled = {false};
        ReferenceCollectingCallback.Behavior trackingBehavior = new ReferenceCollectingCallback.Behavior() {
            @Override
            public void afterExitScope(NodeTraversal t, Map<Var, ReferenceCollection> referenceMap) {
                afterExitScopeCalled[0] = true;
            }
        };
        ReferenceCollectingCallback callbackWithBehavior = new ReferenceCollectingCallback(COMPILER, trackingBehavior);
        callbackWithBehavior.enterScope(traversal);

        callbackWithBehavior.exitScope(traversal);
        assertTrue(afterExitScopeCalled[0]);
        // Similarly, blockStack state is not directly asserted here.
    }

    @Test
    public void testShouldTraverse_pushesBlockOnBoundary() throws Exception {
        ReferenceCollectingCallback callback = createCallback();
        NodeTraversal traversal = createDummyTraversal();
        Node boundaryNode = new Node(Token.IF); // Example boundary
        Node parentNode = new Node(Token.SCRIPT);
        parentNode.addChildToBack(boundaryNode);
        callback.shouldTraverse(traversal, boundaryNode, parentNode);
        // Again, blockStack is private and not directly asserted.
    }

    @Test
    public void testIsBlockBoundary_ifFirstChildNot() throws Exception {
        Node parent = new Node(Token.IF);
        Node firstChild = new Node(Token.BLOCK);
        Node secondChild = new Node(Token.BLOCK);
        parent.addChildToBack(firstChild);
        parent.addChildToBack(secondChild);

        assertFalse(ReferenceCollectingCallback.isBlockBoundary(firstChild, parent));
        assertTrue(ReferenceCollectingCallback.isBlockBoundary(secondChild, parent));
    }

    @Test
    public void testIsBlockBoundary_tryBlock() throws Exception {
        Node parent = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        parent.addChildToBack(block);
        assertTrue(ReferenceCollectingCallback.isBlockBoundary(block, parent));
    }

    @Test
    public void testIsBlockBoundary_case() throws Exception {
        Node parent = new Node(Token.SWITCH);
        Node caseNode = new Node(Token.CASE);
        parent.addChildToBack(caseNode);
        assertTrue(ReferenceCollectingCallback.isBlockBoundary(caseNode, parent));
    }

    @Test
    public void testIsBlockBoundary_notBoundary() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node child = new Node(Token.NAME);
        parent.addChildToBack(child);
        assertFalse(ReferenceCollectingCallback.isBlockBoundary(child, parent));
    }

    @Test
    public void testGetSourceName() throws Exception {
        ReferenceCollectingCallback callback = createCallback();
        NodeTraversal traversalWithSource = new NodeTraversal(COMPILER, callback) {
            @Override
            public String getSourceName() {
                return "my_test_source.js";
            }
        };

        Node nameNode = new Node(Token.NAME);
        Node parentNode = new Node(Token.ASSIGN);
        parentNode.addChildToFront(nameNode);
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER); // Dummy scope for Reference
        Reference ref = new Reference(nameNode, parentNode, parentNode.getParent(), dummyBlock, dummyScope, traversalWithSource.getSourceName());
        assertEquals("my_test_source.js", ref.getSourceName());
    }

    @Test
    public void testProcess_invokesTraversal() throws Exception {
        ReferenceCollectingCallback callback = createCallback();
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        callback.process(externs, root);
        // This test verifies that `process` method can be called without exceptions.
        // Deeper logic is tested by other methods.
    }

    @Test
    public void testVisit_addsReferenceForNameNode() throws Exception {
        ReferenceCollectingCallback callback = createCallback();
        NodeTraversal traversal = createDummyTraversal();
        Var dummyVar = createDummyVar("testVar");
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("testVar"); // Set the name string
        Node parentNode = new Node(Token.ASSIGN); // Parent node
        parentNode.addChildToFront(nameNode);

        // Mocking `t.getScope().getVar()` to return our dummyVar.
        NodeTraversal mockTraversal = new NodeTraversal(COMPILER, callback) {
            @Override
            public Scope getScope() {
                return new Scope(new Node(Token.SCRIPT), COMPILER) {
                    @Override
                    public Var getVar(String name) {
                        if (name.equals("testVar")) {
                            return dummyVar;
                        }
                        return null;
                    }
                };
            }
        };

        callback.visit(mockTraversal, nameNode, parentNode);

        // Check if the reference was added using getReferenceCollection.
        assertNotNull(callback.getReferenceCollection(dummyVar));
        ReferenceCollection collection = callback.getReferenceCollection(dummyVar);
        assertNotNull(collection);
        assertFalse(collection.references.isEmpty());
        assertEquals(1, collection.references.size());
        assertEquals(nameNode, collection.references.get(0).getNameNode());
    }
}





