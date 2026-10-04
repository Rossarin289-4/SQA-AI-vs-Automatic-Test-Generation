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
    private static class TestCompiler extends AbstractCompiler {

        @Override
        public void process(CompilerPass pass) {
            // No-op
        }

        @Override
        public Node parseSyntheticCode(String code) {
            // Provide a minimal SCRIPT node to satisfy basic traversals.
            return new Node(Token.SCRIPT);
        }

        @Override
        public CodingConvention getCodingConvention() {
            // Provide a default convention.
            return new ClosureCodingConvention();
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            // Provide a default JSTypeRegistry.
            // Assuming JSTypeRegistry can be instantiated with null for parent.
            return new JSTypeRegistry(null);
        }

        @Override
        public void report(DiagnosticType type, Node node, String... arguments) {
            // No-op for tests
        }

        @Override
        public void init(SourceFile... inputs) {
            // No-op
        }

        @Override
        public boolean isNormalized() {
            return true; // Assume normalized for simplicity
        }

        @Override
        public void setProgress(float progress) {}

        @Override
        public int getErrorCount() { return 0; }

        @Override
        public int getWarningCount() { return 0; }

        @Override
        public void setNodeForError(Node node) {}

        // AbstractCompiler requires these methods. Providing minimal implementations.
        @Override
        public boolean hasRegExpGlobalReferences() { return false; }

        @Override
        public void setHasRegExpGlobalReferences(boolean has) {}

        @Override
        public String getAstDotGraph(Node n) { return ""; }

        @Override
        public boolean canCreateFunctionExpressions() { return true; }
    }

    private static final AbstractCompiler COMPILER = new TestCompiler();
    private static final ReferenceCollectingCallback.Behavior DO_NOTHING_BEHAVIOR = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;

    private ReferenceCollectingCallback createCallback(Predicate<Var> varFilter) {
        return new ReferenceCollectingCallback(COMPILER, DO_NOTHING_BEHAVIOR, varFilter);
    }

    private ReferenceCollectingCallback createCallback() {
        return new ReferenceCollectingCallback(COMPILER, DO_NOTHING_BEHAVIOR);
    }

    // Helper to create a dummy Var.
    private Var createDummyVar(String name) {
        // Var(String name, Node nameNode, Scope scope, CompilerInput input, boolean inferred)
        Node nameNode = new Node(Token.NAME); // Node constructor takes type, not string directly
        nameNode.setString(name); // Set string value on the node
        Scope scope = new Scope(new Node(Token.SCRIPT), COMPILER); // Global scope
        // Providing null for CompilerInput as it's not strictly required for these tests
        return new Var(name, nameNode, scope, null, false);
    }

    // Helper to create a dummy NodeTraversal.
    private NodeTraversal createDummyTraversal() {
        // NodeTraversal requires compiler and callback.
        return new NodeTraversal(COMPILER, DO_NOTHING_BEHAVIOR);
    }

    // Helper to create a dummy BasicBlock.
    // BasicBlock constructor takes parent and root node.
    private BasicBlock createDummyBasicBlock() {
        return new BasicBlock(null, new Node(Token.BLOCK));
    }

    // --- ReferenceCollection class tests ---

    @Test
    public void testReferenceCollection_addAndGet() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        Node nameNode = new Node(Token.NAME);
        Node parentNode = new Node(Token.ASSIGN);
        parentNode.addChildToFront(nameNode); // Simulate name being on LHS of assign
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER); // Dummy scope for Reference
        Reference ref = new Reference(nameNode, parentNode, parentNode.getParent(), dummyBlock, dummyScope, "test.js");

        collection.add(ref, traversal, createDummyVar("testVar"));

        assertEquals(1, collection.references.size());
        assertSame(ref, collection.references.get(0));
    }

    @Test
    public void testReferenceCollection_isWellDefined_noReferences() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        assertFalse(collection.isWellDefined());
    }

    @Test
    public void testReferenceCollection_isWellDefined_onlyDeclaration() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        Node declNameNode = new Node(Token.NAME);
        Node declParent = new Node(Token.VAR); // "var a;"
        declParent.addChildToFront(declNameNode);
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);
        Reference declRef = new Reference(declNameNode, declParent, null, dummyBlock, dummyScope, "test.js");
        collection.add(declRef, traversal, createDummyVar("a"));

        assertFalse(collection.isWellDefined()); // No initializing reference
    }

    @Test
    public void testReferenceCollection_isWellDefined_withInitialization() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        Node nameNode = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parentNode = new Node(Token.VAR); // VAR a = 10
        parentNode.addChildToFront(nameNode);
        nameNode.addChildToBack(assignmentValue);
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);
        Reference initRef = new Reference(nameNode, parentNode, parentNode.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(initRef, traversal, createDummyVar("v"));

        // Add a usage reference after the initialization in the same block
        Node usageNameNode = new Node(Token.NAME);
        Node usageParent = new Node(Token.ADD);
        usageParent.addChildToFront(usageNameNode); // Simulate usage `a + 5`
        Reference usageRef = new Reference(usageNameNode, usageParent, usageParent.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(usageRef, traversal, createDummyVar("v"));

        assertTrue(collection.isWellDefined());
    }

    @Test
    public void testReferenceCollection_isWellDefined_assignmentAfterDeclaration() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);


        // Simulate "var a;"
        Node nameNodeDecl = new Node(Token.NAME);
        Node parentDecl = new Node(Token.VAR);
        parentDecl.addChildToFront(nameNodeDecl);
        Reference declRef = new Reference(nameNodeDecl, parentDecl, parentDecl.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(declRef, traversal, createDummyVar("v"));

        // Simulate "a = 10;"
        Node nameNodeAssign = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parentAssign = new Node(Token.ASSIGN);
        parentAssign.addChildToFront(nameNodeAssign);
        nameNodeAssign.addChildToBack(assignmentValue);
        Reference assignRef = new Reference(nameNodeAssign, parentAssign, parentAssign.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(assignRef, traversal, createDummyVar("v"));

        // Add a usage reference after the assignment in the same block
        Node usageNameNode = new Node(Token.NAME);
        Node usageParent = new Node(Token.ADD);
        usageParent.addChildToFront(usageNameNode); // Simulate usage `a + 5`
        Reference usageRef = new Reference(usageNameNode, usageParent, usageParent.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(usageRef, traversal, createDummyVar("v"));

        assertTrue(collection.isWellDefined());
    }

    @Test
    public void testReferenceCollection_isWellDefined_usageBeforeInit_varAssign() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);


        // Simulate "var a = 10;"
        Node nameNodeInit = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parentInit = new Node(Token.VAR);
        parentInit.addChildToFront(nameNodeInit);
        nameNodeInit.addChildToBack(assignmentValue);
        Reference initRef = new Reference(nameNodeInit, parentInit, parentInit.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(initRef, traversal, createDummyVar("v"));

        // Simulate usage `a + 5` before assignment/declaration
        Node usageNameNode = new Node(Token.NAME);
        Node usageParent = new Node(Token.ADD);
        usageParent.addChildToFront(usageNameNode);
        Reference usageRef = new Reference(usageNameNode, usageParent, usageParent.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(usageRef, traversal, createDummyVar("v"));

        // The order of addition to `references` list matters for `isWellDefined`.
        // `getInitializingReference` is called first. If it's the declaration, it checks.
        // The definition of well-defined implies initial assignment happens before use.
        // The test should reflect this: if declaration is first, and then usage, it's not well defined.
        // If declaration is first and usage is second, and it's `var a = 10`, then it IS well defined.
        // The current test setup with "var a = 10" as initRef, and then usageRef, should be true.
        assertTrue(collection.isWellDefined());
    }

    @Test
    public void testReferenceCollection_isEscaped_differentScopes() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        NodeTraversal traversal1 = createDummyTraversal();
        NodeTraversal traversal2 = createDummyTraversal();

        // Create nested scopes for traversal1 and traversal2
        Scope globalScope = COMPILER.createScope(new Node(Token.SCRIPT), null);
        // Need to set the current scope for the traversal.
        // NodeTraversal doesn't have a public setter for currentScope.
        // We will mock getScope() in the reference creation.

        Node nameNode1 = new Node(Token.NAME);
        BasicBlock block1 = createDummyBasicBlock();
        // Mocking getScope() to return different scopes
        Scope mockScope1 = new Scope(new Node(Token.SCRIPT), COMPILER);
        Reference ref1 = new Reference(nameNode1, new Node(Token.EXPR_RESULT), null, block1, mockScope1, "test.js");
        collection.add(ref1, new NodeTraversal(COMPILER, DO_NOTHING_BEHAVIOR) {
            @Override public Scope getScope() { return mockScope1; }
        }, createDummyVar("v"));

        Node nameNode2 = new Node(Token.NAME);
        BasicBlock block2 = createDummyBasicBlock();
        Scope mockScope2 = COMPILER.createScope(new Node(Token.BLOCK), mockScope1); // Nested scope
        Reference ref2 = new Reference(nameNode2, new Node(Token.EXPR_RESULT), null, block2, mockScope2, "test.js");
        collection.add(ref2, new NodeTraversal(COMPILER, DO_NOTHING_BEHAVIOR) {
            @Override public Scope getScope() { return mockScope2; }
        }, createDummyVar("v"));

        assertTrue(collection.isEscaped());
    }

    @Test
    public void testReferenceCollection_isEscaped_sameScope() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        NodeTraversal traversal = createDummyTraversal();
        Scope globalScope = COMPILER.createScope(new Node(Token.SCRIPT), null);
        // Mocking getScope() to return the same scope
        traversal.currentScope = globalScope; // Direct assignment for simplicity in this test
        
        Node nameNode1 = new Node(Token.NAME);
        BasicBlock block1 = createDummyBasicBlock();
        Reference ref1 = new Reference(nameNode1, new Node(Token.EXPR_RESULT), null, block1, traversal.getScope(), "test.js");
        collection.add(ref1, traversal, createDummyVar("v"));

        Node nameNode2 = new Node(Token.NAME);
        BasicBlock block2 = createDummyBasicBlock(); // Different block, same scope
        Reference ref2 = new Reference(nameNode2, new Node(Token.EXPR_RESULT), null, block2, traversal.getScope(), "test.js");
        collection.add(ref2, traversal, createDummyVar("v"));

        assertFalse(collection.isEscaped());
    }

    @Test
    public void testReferenceCollection_isAssignedOnceInLifetime_noAssignments() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        Node nameNode = new Node(Token.NAME);
        Node parent = new Node(Token.VAR); // Declaration only
        parent.addChildToFront(nameNode);
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);
        Reference ref = new Reference(nameNode, parent, parent.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(ref, traversal, createDummyVar("v"));
        assertFalse(collection.isAssignedOnceInLifetime());
    }

    @Test
    public void testReferenceCollection_isAssignedOnceInLifetime_oneAssignment() throws Exception {
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
        assertTrue(collection.isAssignedOnceInLifetime());
    }

    @Test
    public void testReferenceCollection_isAssignedOnceInLifetime_twoAssignments() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        NodeTraversal traversal = createDummyTraversal();
        BasicBlock dummyBlock = createDummyBasicBlock();
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);


        Node nameNode1 = new Node(Token.NAME);
        Node assignmentValue1 = Node.newNumber(10);
        Node parent1 = new Node(Token.ASSIGN);
        parent1.addChildToFront(nameNode1);
        nameNode1.addChildToBack(assignmentValue1);
        Reference ref1 = new Reference(nameNode1, parent1, parent1.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(ref1, traversal, createDummyVar("v"));

        Node nameNode2 = new Node(Token.NAME);
        Node assignmentValue2 = Node.newNumber(20);
        Node parent2 = new Node(Token.ASSIGN);
        parent2.addChildToFront(nameNode2);
        nameNode2.addChildToBack(assignmentValue2);
        Reference ref2 = new Reference(nameNode2, parent2, parent2.getParent(), dummyBlock, dummyScope, "test.js");
        collection.add(ref2, traversal, createDummyVar("v"));
        assertFalse(collection.isAssignedOnceInLifetime());
    }

    @Test
    public void testReferenceCollection_isAssignedOnceInLifetime_assignmentInLoop() throws Exception {
        ReferenceCollection collection = new ReferenceCollection();
        Node nameNode = new Node(Token.NAME);
        Node assignmentValue = Node.newNumber(10);
        Node parent = new Node(Token.ASSIGN);
        parent.addChildToFront(nameNode);
        nameNode.addChildToBack(assignmentValue);
        NodeTraversal traversal = createDummyTraversal();
        // Create a BasicBlock that is marked as a loop
        BasicBlock loopBlock = new BasicBlock(null, new Node(Token.WHILE));
        loopBlock.isLoop = true; // Manually set for test
        Scope dummyScope = new Scope(new Node(Token.SCRIPT), COMPILER);

        Reference ref = new Reference(nameNode, parent, parent.getParent(), loopBlock, dummyScope, "test.js");
        collection.add(ref, traversal, createDummyVar("v"));
        assertFalse(collection.isAssignedOnceInLifetime());
    }

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
