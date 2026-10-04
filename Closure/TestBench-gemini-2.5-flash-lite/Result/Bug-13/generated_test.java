package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// Mock AbstractCompiler for testing
// Corrected to implement necessary abstract methods and use existing types
class MockCompiler extends AbstractCompiler {
    private final ArrayList<CodeChangeHandler> handlers = Lists.newArrayList();
    private boolean changeReported = false;

    @Override
    public void report(JSError error) {
        // No-op for tests
    }

    @Override
    public void throwInternalError(String msg, Exception cause) {
        throw new RuntimeException(msg, cause);
    }


    @Override
    public void reportCodeChange() {
        changeReported = true;
        for (CodeChangeHandler handler : handlers) {
            handler.reportChange();
        }
    }

    @Override
    public void addChangeHandler(CodeChangeHandler handler) {
        handlers.add(handler);
    }

    @Override
    public void removeChangeHandler(CodeChangeHandler handler) {
        handlers.remove(handler);
    }

    @Override
    public Node parseSyntheticCode(String code) {
        return Node.newString(code); // Simplified mock
    }

    @Override
    public Node parseSyntheticCode(String filename, String code) {
        return Node.newString(code); // Simplified mock
    }

    @Override
    public Node parseTestCode(String code) {
        return Node.newString(code); // Simplified mock
    }

    @Override
    public String toSource(Node root) {
        return "mocked source";
    }



    @Override
    public LifeCycleStage getLifeCycleStage() {
        return LifeCycleStage.NORMALIZED; // Default
    }


    @Override
    public boolean hasHaltingErrors() {
        return false;
    }

    @Override
    public boolean isIdeMode() {
        return false;
    }

    @Override
    public boolean acceptEcmaScript5() {
        return true;
    }

    @Override
    public boolean acceptConstKeyword() {
        return true;
    }


    @Override
    public boolean isTypeCheckingEnabled() {
        return false;
    }

    @Override
    public void prepareAst(Node root) {
        // No-op
    }


    @Override
    public void setLifeCycleStage(LifeCycleStage stage) {
        // No-op
    }

    @Override
    public boolean areNodesEqualForInlining(Node n1, Node n2) {
        return false; // Default
    }

    @Override
    public void setHasRegExpGlobalReferences(boolean references) {
        // No-op
    }

    @Override
    public boolean hasRegExpGlobalReferences() {
        return false;
    }

    @Override
    public CheckLevel getErrorLevel(JSError error) {
        return CheckLevel.ERROR; // Default
    }


    


    @Override
    public SourceFile getSourceFileByName(String sourceName) {
        return null; // Not relevant
    }

    @Override
    public CompilerInput newExternInput(String name) {
        return null; // Not relevant
    }

    @Override
    public JSModuleGraph getModuleGraph() {
        return null; // Not relevant
    }

    @Override
    public List<CompilerInput> getInputsInOrder() {
        return null; // Not relevant
    }


    @Override
    public ScopeCreator getTypedScopeCreator() {
        // Mock implementation for ScopeCreator.
        return null;
    }

    @Override
    public Scope getTopScope() {
        // Mock implementation for Scope.
        return null;
    }

    @Override
    public void addToDebugLog(String message) {
        // No-op
    }

    @Override
    public void setCssRenamingMap(CssRenamingMap map) {
        // No-op
    }

    @Override
    public CssRenamingMap getCssRenamingMap() {
        return null; // Not relevant
    }


    @Override
    public TypeValidator getTypeValidator() {
        // Mock implementation for TypeValidator.
        return null;
    }



    // Satisfy abstract method ensureLibraryInjected
    
    public boolean isChangeReported() {
        return changeReported;
    }
}

// Mock AbstractPeepholeOptimization to test the traversal logic
class MockOptimization extends AbstractPeepholeOptimization {
    private AbstractCompiler compiler;
    private boolean subtreeOptimized = false;
    private Node optimizedNode = null;
    private boolean codeChanged = false;


    @Override
    void beginTraversal(AbstractCompiler compiler) {
        this.compiler = compiler;
    }

    @Override
    void endTraversal(AbstractCompiler compiler) {
    }

    boolean isSubtreeOptimized() {
        return subtreeOptimized;
    }

    Node getOptimizedNode() {
        return optimizedNode;
    }
    
    boolean hasCodeChanged() {
        return codeChanged;
    }
}

// Mock AbstractPeepholeOptimization to test stateStack
class StateTrackingOptimization extends AbstractPeepholeOptimization {
    private AbstractCompiler compiler;
    private PeepholeOptimizationsPass peepholePass;

    void setPeepholePass(PeepholeOptimizationsPass pass) {
        this.peepholePass = pass;
    }

    @Override
    Node optimizeSubtree(Node subtree) {
        // This mock doesn't perform actual optimizations, just allows access to the pass.
        return subtree;
    }

    @Override
    void beginTraversal(AbstractCompiler compiler) {
        this.compiler = compiler;
    }

    @Override
    void endTraversal(AbstractCompiler compiler) {
    }
}

public class PeepholeOptimizationsPassTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }



    @Test
    public void testVisitNodeWithNoChanges() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockOptimization mockOpt = new MockOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                // Ensure no change is reported for the mock
                return subtree; // No change
            }
        };
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, mockOpt);
        Node root = Node.newNumber(10.0);
        pass.visit(root);
        assertFalse(mockOpt.isSubtreeOptimized());
    }

    @Test
    public void testVisitNodeWithMultipleOptimizations() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockOptimization mockOpt1 = new MockOptimization();
        MockOptimization mockOpt2 = new MockOptimization();

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, mockOpt1, mockOpt2);
        Node root = Node.newNumber(7.0);
        pass.visit(root);

        assertTrue(mockOpt1.isSubtreeOptimized());
        assertTrue(mockOpt2.isSubtreeOptimized());
        // The second optimization should act on the result of the first one
        assertEquals(9.0, mockOpt2.getOptimizedNode().getDouble(), 1e-9);
    }

    @Test
    public void testVisitNodeWithOptimizationCausingNoChangeThenChange() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockOptimization mockOpt1 = new MockOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                // First call, no change
                return subtree;
            }
        };
        MockOptimization mockOpt2 = new MockOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                // Second call, change
                reportCodeChange(); // This will trigger the compiler's handler
                return Node.newNumber(subtree.getDouble() + 1);
            }
        };

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, mockOpt1, mockOpt2);
        Node root = Node.newNumber(1.0);
        pass.visit(root); // This will call optimizeSubtree twice for each opt

        assertTrue(mockOpt1.isSubtreeOptimized());
        assertTrue(mockOpt2.isSubtreeOptimized());
        assertEquals(2.0, mockOpt2.getOptimizedNode().getDouble(), 1e-9); // 1.0 + 1
    }

















    @Test
    public void testBeginAndEndTraversalAreCalled() {
        MockCompiler compiler = new MockCompiler();
        final boolean[] beginCalled = {false};
        final boolean[] endCalled = {false};

        AbstractPeepholeOptimization trackerOpt = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) { return subtree; }
            @Override
            void beginTraversal(AbstractCompiler c) { beginCalled[0] = true; }
            @Override
            void endTraversal(AbstractCompiler c) { endCalled[0] = true; }
        };

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, trackerOpt);
        Node root = new Node(Token.ROOT);
        compiler.setRoot(root);
        pass.process(new Node(Token.EMPTY), root);

        assertTrue(beginCalled[0]);
        assertTrue(endCalled[0]);
    }

    @Test
    public void testGetCompilerReturnsCorrectInstance() {
        MockCompiler compiler = new MockCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        assertSame(compiler, pass.getCompiler());
    }

    @Test
    public void testVisitMethodIteratesUntilNoChangeWithMultipleOptimizations() throws Exception {
        MockCompiler compiler = new MockCompiler();
        // Optimization 1: Increments a number.
        AbstractPeepholeOptimization opt1 = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree.isNumber()) {
                    reportCodeChange(); // Signals change
                    return Node.newNumber(subtree.getDouble() + 1);
                }
                return subtree;
            }
            @Override void beginTraversal(AbstractCompiler c) {}
            @Override void endTraversal(AbstractCompiler c) {}
        };
        // Optimization 2: Does nothing if the number is already incremented.
        AbstractPeepholeOptimization opt2 = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                // This optimization will only change the node on the first pass if it's still a number.
                if (subtree.isNumber() && subtree.getDouble() < 100) { // Prevent infinite loop on test
                    reportCodeChange();
                    return Node.newNumber(subtree.getDouble() + 1);
                }
                return subtree;
            }
            @Override void beginTraversal(AbstractCompiler c) {}
            @Override void endTraversal(AbstractCompiler c) {}
        };

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt1, opt2);
        Node root = Node.newNumber(5.0);
        pass.visit(root); // Should run until no change.

        // opt1 makes it 6.0. Then opt2 makes it 7.0.
        // The do-while loop in visit should then run again.
        // opt1 sees 7.0, returns 7.0 (no change).
        // opt2 sees 7.0, returns 7.0 (no change).
        // The loop terminates. Final value should be 7.0.
        assertEquals(7.0, root.getDouble(), 1e-9);
    }

    @Test
    public void testNullOptimizationReturnDoesNotBreakProcess() throws Exception {
        MockCompiler compiler = new MockCompiler();
        // An optimization that returns null.
        AbstractPeepholeOptimization nullReturningOpt = new AbstractPeepholeOptimization() {
            @Override
            Node optimizeSubtree(Node subtree) {
                reportCodeChange(); // Report a change
                return null; // Simulate node removal
            }
            @Override void beginTraversal(AbstractCompiler c) {}
            @Override void endTraversal(AbstractCompiler c) {}
        };
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, nullReturningOpt);
        Node root = new Node(Token.ROOT, new Node(Token.NUMBER)); // Root with a child
        compiler.setRoot(root);
        pass.process(new Node(Token.EMPTY), root); // Should complete without error.
        assertTrue(true); // Test passes if no exception is thrown.
    }
}





