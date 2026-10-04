package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.parsing.JsDocToken;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.jscomp.graph.GraphColoring;
import com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.jscomp.graph.LinkedUndirectedGraph;
import com.google.javascript.jscomp.graph.UndiGraph;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.ScriptRuntime;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter; // Added import for ErrorReporter

public class CoalesceVariableNamesTest {

    // Mock AbstractCompiler for testing
    private static class MockAbstractCompiler implements AbstractCompiler {
        private String sourceText = "";
        private boolean codeChanged = false;

        @Override
        public void reportChangeToEnclosingAssign(Node n) {
            codeChanged = true;
        }

        @Override
        public void reportCodeChange() {
            codeChanged = true;
        }

        @Override
        public SourceAst getSourceAst() {
            return null;
        }

        @Override
        public String getSourceFileName() {
            return "test.js";
        }

        @Override
        public void setSourceFile(SourceFile file) {}

        @Override
        public boolean isTypeCheckingEnabled() {
            return false;
        }

        @Override
        public PassFactory getPassFactory(String name) {
            return null;
        }

        @Override
        public void process(PassFactory[] passes, Node externs, Node root) {}

        @Override
        public void process(PassFactory[] passes, JSModule[] modules) {}

        @Override
        public JSTypeRegistry getTypeRegistry() {
            // Use the provided ErrorReporter from JsDocInfoParser
            ErrorReporter rh = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
            return new JSTypeRegistry(rh);
        }

        @Override
        public void throwInternalError(String message, Node... nodes) {
            throw new RuntimeException(message);
        }
        
        @Override
        public void ensureLibraryInjected(String libName) {}

        @Override
        public boolean isIdeMode() { return false;}

        @Override
        public void setIdeMode(boolean ideMode) {}
        
        @Override
        public void finalizeAst(Node root) {}

        @Override
        public void updateCodeChangeFlag() {
            codeChanged = true;
        }
        
        @Override
        public boolean getCodeChangeFlag() {
            return codeChanged;
        }

        @Override
        public String getAstRootString() {
            return "";
        }

        @Override
        public void setAstRootString(String astRootString) {}

        @Override
        public Var getVar(String name) { return null;}

        @Override
        public ErrorReporter getErrorReporter() {
            // Use the provided ErrorReporter from JsDocInfoParser
            return com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
        }

        @Override
        public Node parse(String source) {
            this.sourceText = source;
            // A minimal script node is sufficient for basic AST structure
            return new Node(Token.SCRIPT); 
        }

        @Override
        public void setExternProperties(Set<String> externProperties) {}
    }

    // Mock Scope.Var for testing
    private static class MockVar extends Scope.Var {
        String name;
        Node parentNode;
        int index;

        MockVar(String name, Node parentNode, int index) {
            // The super constructor requires a name, scope, declaration, and input. Providing null for simplicity.
            super(name, null, null, null, null); 
            this.name = name;
            this.parentNode = parentNode;
            this.index = index;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Node getParentNode() {
            return parentNode;
        }
        
        @Override
        public int getIndex() {
            return index;
        }
    }

    // Mock Scope for testing
    private static class MockScope extends Scope {
        private Map<String, Var> vars = new HashMap<>();
        private boolean isGlobal = false;
        private Node rootNode;

        MockScope(boolean isGlobal, Node rootNode) {
             // The super constructor requires a root, parent, type, and compiler. Providing null for simplicity.
            super(null, null, null, null, null); 
            this.isGlobal = isGlobal;
            this.rootNode = rootNode;
        }

        @Override
        public boolean isGlobal() {
            return isGlobal;
        }

        @Override
        public Var getVar(String name) {
            return vars.get(name);
        }

        @Override
        public Iterator<Var> getVars() {
            return vars.values().iterator();
        }

        @Override
        public int getVarCount() {
            return vars.size();
        }

        @Override
        public Node getRootNode() {
            return rootNode;
        }

        void addVar(MockVar var) {
            vars.put(var.getName(), var);
        }
    }

    // Mock NodeTraversal for testing
    private static class MockNodeTraversal extends NodeTraversal {
        MockScope currentScope;

        MockNodeTraversal(AbstractCompiler compiler, MockScope scope) {
            super(compiler, null); // Pass null for callback, as we're not using it directly here.
            this.currentScope = scope;
        }

        @Override
        public Scope getScope() {
            return currentScope;
        }
        
        @Override
        public ControlFlowGraph<Node> getControlFlowGraph() {
            // Return a minimal CFG for basic checks
            return new ControlFlowGraph<Node>(new MockDiGraph<Node, Branch>(), null, false);
        }
        
        @Override
        public boolean inGlobalScope() {
            return currentScope.isGlobal();
        }
    }
    
    // Mock DiGraph for testing
    private static class MockDiGraph<N, E> implements com.google.javascript.jscomp.graph.DiGraph<N, E> {
        private final Map<N, GraphNode<N, E>> nodes = new HashMap<>();
        private final Set<GraphNode<N, E>> nodeSet = new java.util.HashSet<>();
        private final Map<GraphNode<N, E>, Map<N, E>> adjacency = new HashMap<>();

        @Override
        public GraphNode<N, E> createNode(N value) {
            GraphNode<N, E> node = new GraphNode<N, E>(value) {};
            nodes.put(value, node);
            nodeSet.add(node);
            adjacency.put(node, new HashMap<>());
            return node;
        }

        @Override
        public boolean hasNode(N value) {
            return nodes.containsKey(value);
        }

        @Override
        public GraphNode<N, E> getNode(N value) {
            return nodes.get(value);
        }

        @Override
        public Set<GraphNode<N, E>> getNodes() {
            return nodeSet;
        }

        @Override
        public void connect(GraphNode<N, E> from, GraphNode<N, E> to, E edge) {
            adjacency.get(from).put(to.getValue(), edge);
        }

        @Override
        public boolean connectIfNotFound(N from, E edge, N to) {
            GraphNode<N, E> fromNode = getNode(from);
            GraphNode<N, E> toNode = getNode(to);
            if (fromNode == null || toNode == null) return false;
            if (!adjacency.get(fromNode).containsKey(to)) {
                connect(fromNode, toNode, edge);
                return true;
            }
            return false;
        }

        @Override
        public void remove(GraphNode<N, E> node) {
            nodes.remove(node.getValue());
            nodeSet.remove(node);
            adjacency.remove(node);
        }

        @Override
        public Set<GraphNode<N, E>> getDirectedGraphNodes() {
            return nodeSet;
        }

        @Override
        public java.util.Collection<E> getEdges() {
            java.util.Collection<E> edges = new java.util.ArrayList<>();
            for (Map<N, E> targets : adjacency.values()) {
                edges.addAll(targets.values());
            }
            return edges;
        }

        @Override
        public GraphNode<N, E> getFirstNode() {
            return nodeSet.isEmpty() ? null : nodeSet.iterator().next();
        }

        @Override
        public int getWeight(GraphNode<N, E> node) { return 0; }
        @Override
        public void setWeight(GraphNode<N, E> node, int weight) {}
        
        // Stubbing methods from com.google.javascript.jscomp.graph.DiGraph
        @Override public void addEdgeTraversalListener(com.google.javascript.jscomp.graph.DiGraph.EdgeTraversalListener<N, E> listener) {}
        @Override public void removeEdgeTraversalListener(com.google.javascript.jscomp.graph.DiGraph.EdgeTraversalListener<N, E> listener) {}
    }


    @Test
    public void testColoringTieBreaker() {
        MockVar v1 = new MockVar("a", null, 5);
        MockVar v2 = new MockVar("b", null, 10);
        CoalesceVariableNames cvn = new CoalesceVariableNames(new MockAbstractCompiler(), false);
        Comparator<Var> tieBreaker = cvn.coloringTieBreaker;
        assertEquals(0, tieBreaker.compare(v1, v1));
        assertTrue(tieBreaker.compare(v1, v2) < 0);
        assertTrue(tieBreaker.compare(v2, v1) > 0);
    }

    @Test
    public void testConstructorWithPseudoNames() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, true);
        assertNotNull(cvn);
    }
    
    @Test
    public void testConstructorWithoutPseudoNames() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        assertNotNull(cvn);
    }
    
    @Test
    public void testProcessWithEmptyNodes() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        cvn.process(new Node(Token.EMPTY), new Node(Token.EMPTY));
        assertFalse(compiler.codeChanged);
    }

    @Test
    public void testEnterScopeGlobalScope() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope globalScope = new MockScope(true, new Node(Token.SCRIPT));
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, globalScope);
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        cvn.enterScope(traversal); // Should do nothing for global scope
        assertTrue(cvn.colorings.isEmpty());
    }

    @Test
    public void testExitScopeGlobalScope() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope globalScope = new MockScope(true, new Node(Token.SCRIPT));
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, globalScope);
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        cvn.exitScope(traversal); // Should do nothing for global scope
        assertTrue(cvn.colorings.isEmpty());
    }

    @Test
    public void testVisitNonNameNode() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = new MockScope(false, new Node(Token.FUNCTION));
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        
        // Add a dummy coloring to the stack to simulate an in-scope traversal
        cvn.colorings.push(new GreedyGraphColoring<Var, Void>(new LinkedUndirectedGraph<Var, Void>(), coloringTieBreaker));
        
        Node nonNameNode = new Node(Token.NUMBER, 10, 0);
        cvn.visit(traversal, nonNameNode, null);
        assertFalse(compiler.codeChanged);
        cvn.colorings.pop();
    }

    @Test
    public void testVisitFunctionParent() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = new MockScope(false, new Node(Token.FUNCTION));
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        
        cvn.colorings.push(new GreedyGraphColoring<Var, Void>(new LinkedUndirectedGraph<Var, Void>(), coloringTieBreaker));
        
        Node nameNode = Node.newString("varName");
        Node functionNode = Node.newFunction("funcName", new Node(Token.BLOCK), nameNode);
        cvn.visit(traversal, nameNode, functionNode);
        assertFalse(compiler.codeChanged);
        cvn.colorings.pop();
    }

    @Test
    public void testVisitUnknownVar() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = new MockScope(false, new Node(Token.FUNCTION));
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        cvn.colorings.push(new GreedyGraphColoring<Var, Void>(new LinkedUndirectedGraph<Var, Void>(), coloringTieBreaker));
        
        Node nameNode = Node.newString("unknownVar");
        cvn.visit(traversal, nameNode, new Node(Token.ASSIGN));
        assertFalse(compiler.codeChanged);
        cvn.colorings.pop();
    }

    @Test
    public void testVisitCoalescedVarNoPseudoNames() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = new MockScope(false, new Node(Token.FUNCTION));
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        MockVar originalVar = new MockVar("original", null, 0);
        MockVar coalescedVar = new MockVar("coalesced", null, 1);
        scope.addVar(originalVar);
        
        LinkedUndirectedGraph<Var, Void> graph = new LinkedUndirectedGraph<>();
        graph.createNode(originalVar);
        graph.createNode(coalescedVar); // Add coalescedVar to graph to be partition supernode
        graph.connectIfNotFound(originalVar, null, coalescedVar); // Simulate coalescing

        GraphColoring<Var, Void> coloring = new GreedyGraphColoring<>(graph, coloringTieBreaker);
        coloring.color(); // This should partition originalVar under coalescedVar
        cvn.colorings.push(coloring);

        Node nameNode = Node.newString("original");
        Node varDecl = new Node(Token.VAR, nameNode);
        cvn.visit(traversal, nameNode, varDecl);

        assertEquals("coalesced", nameNode.getString());
        assertTrue(compiler.codeChanged);
        cvn.colorings.pop();
    }
    
    @Test
    public void testVisitCoalescedVarWithPseudoNames() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = new MockScope(false, new Node(Token.FUNCTION));
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, true);

        MockVar originalVar1 = new MockVar("a", null, 0);
        MockVar originalVar2 = new MockVar("b", null, 1);
        scope.addVar(originalVar1);
        scope.addVar(originalVar2);

        LinkedUndirectedGraph<Var, Void> graph = new LinkedUndirectedGraph<>();
        graph.createNode(originalVar1);
        graph.createNode(originalVar2);
        graph.connectIfNotFound(originalVar1, null, originalVar2);

        GraphColoring<Var, Void> coloring = new GreedyGraphColoring<>(graph, coloringTieBreaker);
        coloring.color(); // This should partition originalVar1 and originalVar2 under a supernode
        cvn.colorings.push(coloring);

        Node nameNode = Node.newString("a");
        Node varDecl = new Node(Token.VAR, nameNode);
        cvn.visit(traversal, nameNode, varDecl);

        assertEquals("a_b", nameNode.getString());
        assertTrue(compiler.codeChanged);
        cvn.colorings.pop();
    }

    @Test
    public void testVisitSelfCoalescedVarNoPseudoNames() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = new MockScope(false, new Node(Token.FUNCTION));
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        MockVar originalVar = new MockVar("original", null, 0);
        scope.addVar(originalVar);

        LinkedUndirectedGraph<Var, Void> graph = new LinkedUndirectedGraph<>();
        graph.createNode(originalVar);

        GraphColoring<Var, Void> coloring = new GreedyGraphColoring<>(graph, coloringTieBreaker);
        coloring.color();
        cvn.colorings.push(coloring);

        Node nameNode = Node.newString("original");
        cvn.visit(traversal, nameNode, new Node(Token.ASSIGN));

        assertEquals("original", nameNode.getString()); // Name should not change
        assertFalse(compiler.codeChanged);
        cvn.colorings.pop();
    }

    @Test
    public void testRemoveVarDeclarationSimple() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        Node nameNode = Node.newString("a");
        Node valueNode = Node.newNumber(1);
        Node varNode = new Node(Token.VAR, nameNode, valueNode);
        Node parentNode = new Node(Token.BLOCK, varNode);

        cvn.removeVarDeclaration(nameNode);

        assertEquals(Token.ASSIGN, parentNode.getFirstChild().getType());
        assertEquals(Token.NAME, parentNode.getFirstChild().getFirstChild().getType());
        assertEquals("a", parentNode.getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, parentNode.getFirstChild().getLastChild().getType());
        assertEquals(1, parentNode.getFirstChild().getLastChild().getDouble(), 0);
    }

    @Test
    public void testRemoveVarDeclarationSingleVar() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        Node nameNode = Node.newString("a");
        Node valueNode = Node.newNumber(1);
        Node varNode = new Node(Token.VAR, nameNode, valueNode);
        Node parentNode = new Node(Token.BLOCK, varNode);

        // Simulate the case where varNode only has one child (nameNode)
        varNode.removeChild(valueNode);

        cvn.removeVarDeclaration(nameNode);

        assertEquals(Token.ASSIGN, parentNode.getFirstChild().getType());
        assertEquals(Token.NAME, parentNode.getFirstChild().getFirstChild().getType());
        assertEquals("a", parentNode.getFirstChild().getFirstChild().getString());
        assertTrue(parentNode.getFirstChild().getLastChild() == null); // No value
    }

    @Test
    public void testRemoveVarDeclarationForInLoop() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        Node nameNode = Node.newString("a");
        Node varNode = new Node(Token.VAR, nameNode);
        Node forInNode = new Node(Token.FOR_IN, varNode, Node.newNumber(1));
        
        cvn.removeVarDeclaration(nameNode);

        assertEquals(Token.NAME, forInNode.getFirstChild().getType());
        assertEquals("a", forInNode.getFirstChild().getString());
        assertFalse(forInNode.hasChild(Token.VAR));
    }

    @Test
    public void testRemoveVarDeclarationNoChildren() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        Node nameNode = Node.newString("a");
        Node varNode = new Node(Token.VAR, nameNode);
        Node parentNode = new Node(Token.BLOCK, varNode);

        cvn.removeVarDeclaration(nameNode);

        assertEquals(Token.EMPTY, parentNode.getFirstChild().getType());
        assertFalse(parentNode.hasChild(Token.VAR));
    }
    
    @Test
    public void testComputeVariableNamesInterferenceGraph() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = new MockScope(false, new Node(Token.FUNCTION));
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        
        // Setup some mock Var objects
        MockVar varA = new MockVar("a", null, 0);
        MockVar varB = new MockVar("b", null, 1);
        MockVar varC = new MockVar("c", null, 2); // Escaped local
        
        scope.addVar(varA);
        scope.addVar(varB);
        
        // Mock escaped locals
        Set<Var> escapedLocals = new HashSet<>();
        escapedLocals.add(varC);
        
        // Mock ControlFlowGraph
        com.google.javascript.jscomp.ControlFlowGraph<Node> cfg = new com.google.javascript.jscomp.ControlFlowGraph<>(new MockDiGraph<Node, Branch>(), null, false);

        // Construct a simple interference graph
        UndiGraph<Var, Void> graph = cvn.computeVariableNamesInterferenceGraph(traversal, cfg, escapedLocals);
        
        assertNotNull(graph);
        assertTrue(graph.hasNode(varA));
        assertTrue(graph.hasNode(varB));
        assertFalse(graph.hasNode(varC)); // Escaped locals should not be in the graph
    }

    @Test
    public void testCheckRangesWithCrossedRanges() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        
        MockVar varA = new MockVar("a", null, 0);
        MockVar varB = new MockVar("b", null, 1);
        
        // Mock LiveRangeChecker that indicates a crossed range
        CoalesceVariableNames.LiveRangeChecker checker1 = new CoalesceVariableNames.LiveRangeChecker(varA, varB);
        checker1.defFound = true;
        checker1.crossed = true;

        CoalesceVariableNames.LiveRangeChecker checker2 = new CoalesceVariableNames.LiveRangeChecker(varB, varA);
        checker2.defFound = true;
        checker2.crossed = true;

        ArrayList<CoalesceVariableNames.CombinedLiveRangeChecker> rangesToCheck = new ArrayList<>();
        rangesToCheck.add(new CoalesceVariableNames.CombinedLiveRangeChecker(checker1, checker2));
        
        UndiGraph<Var, Void> interferenceGraph = new LinkedUndirectedGraph<>();
        interferenceGraph.createNode(varA);
        interferenceGraph.createNode(varB);

        Node dummyNode = new Node(Token.SCRIPT);
        cvn.checkRanges(rangesToCheck, dummyNode);
        
        // After checkRanges, the CombinedLiveRangeChecker should have updated the graph
        assertTrue(interferenceGraph.hasEdge(varA, varB));
    }
    
    @Test
    public void testCombinedLiveRangeCheckerVisit() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        MockVar varA = new MockVar("a", null, 0);
        MockVar varB = new MockVar("b", null, 1);

        CoalesceVariableNames.LiveRangeChecker lrChecker1 = new CoalesceVariableNames.LiveRangeChecker(varA, varB);
        CoalesceVariableNames.LiveRangeChecker lrChecker2 = new CoalesceVariableNames.LiveRangeChecker(varB, varA);

        CoalesceVariableNames.CombinedLiveRangeChecker combinedChecker = 
            new CoalesceVariableNames.CombinedLiveRangeChecker(lrChecker1, lrChecker2);

        // Mock NodeTraversal and Node
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, new MockScope(false, new Node(Token.SCRIPT)));
        Node nameNode = Node.newString("a");
        Node parentNode = new Node(Token.ASSIGN, nameNode, Node.newNumber(1));

        // Mock the visit call
        combinedChecker.visit(traversal, nameNode, parentNode);

        // Check if the internal LiveRangeCheckers were visited
        assertTrue(lrChecker1.defFound || lrChecker2.defFound); // depends on exact logic in LiveRangeChecker.isAssignTo
    }

    @Test
    public void testCombinedCfgNodeLiveRangeCheckerVisit() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);

        MockVar varA = new MockVar("a", null, 0);
        MockVar varB = new MockVar("b", null, 1);

        CoalesceVariableNames.LiveRangeChecker lrChecker1 = new CoalesceVariableNames.LiveRangeChecker(varA, varB);
        CoalesceVariableNames.LiveRangeChecker lrChecker2 = new CoalesceVariableNames.LiveRangeChecker(varB, varA);
        
        ArrayList<CoalesceVariableNames.CombinedLiveRangeChecker> callbacks = new ArrayList<>();
        callbacks.add(new CoalesceVariableNames.CombinedLiveRangeChecker(lrChecker1, lrChecker2));
        
        CoalesceVariableNames.CombinedCfgNodeLiveRangeChecker combinedChecker = 
            new CoalesceVariableNames.CombinedCfgNodeLiveRangeChecker(callbacks);

        // Mock NodeTraversal and Node
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, new MockScope(false, new Node(Token.SCRIPT)));
        Node nameNode = Node.newString("a");
        Node parentNode = new Node(Token.ASSIGN, nameNode, Node.newNumber(1));

        // Mock the visit call
        combinedChecker.visit(traversal, nameNode, parentNode);

        // Check if the internal CombinedLiveRangeChecker was visited and its visit method was called
        assertTrue(lrChecker1.defFound || lrChecker2.defFound);
    }
    
    @Test
    public void testLiveRangeCheckerIsAssignTo() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockVar varA = new MockVar("a", null, 0);

        // Test assignment
        Node nameNodeAssign = Node.newString("a");
        Node assignNode = new Node(Token.ASSIGN, nameNodeAssign, Node.newNumber(1));
        assertTrue(CoalesceVariableNames.LiveRangeChecker.isAssignTo(varA, nameNodeAssign, assignNode));

        // Test var declaration with value
        Node nameNodeVar = Node.newString("a");
        Node varDeclNode = new Node(Token.VAR, nameNodeVar, Node.newNumber(1));
        assertTrue(CoalesceVariableNames.LiveRangeChecker.isAssignTo(varA, nameNodeVar, varDeclNode));

        // Test function parameter
        Node nameNodeParam = Node.newString("a");
        Node funcNode = new Node(Token.FUNCTION, new Node(Token.BLOCK), nameNodeParam); // Mock parameter
        assertTrue(CoalesceVariableNames.LiveRangeChecker.isAssignTo(varA, nameNodeParam, funcNode));

        // Test no assignment
        Node nameNodeRead = Node.newString("a");
        Node readNode = new Node(Token.NAME, nameNodeRead);
        assertFalse(CoalesceVariableNames.LiveRangeChecker.isAssignTo(varA, nameNodeRead, readNode));
    }

    @Test
    public void testLiveRangeCheckerIsReadFrom() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockVar varA = new MockVar("a", null, 0);

        Node nameNodeRead = Node.newString("a");
        Node parentNode = new Node(Token.ADD, nameNodeRead, Node.newNumber(1));
        assertTrue(CoalesceVariableNames.LiveRangeChecker.isReadFrom(varA, nameNodeRead));

        // Test with LHS assignment - should not be read
        Node nameNodeLHS = Node.newString("a");
        Node assignNode = new Node(Token.ASSIGN, nameNodeLHS, Node.newNumber(1));
        assertFalse(CoalesceVariableNames.LiveRangeChecker.isReadFrom(varA, nameNodeLHS));

        // Test with different name
        Node differentNameNode = Node.newString("b");
        assertFalse(CoalesceVariableNames.LiveRangeChecker.isReadFrom(varA, differentNameNode));
    }

    @Test
    public void testLiveRangeCheckerShouldVisit() {
        assertTrue(CoalesceVariableNames.LiveRangeChecker.shouldVisit(Node.newString("a")));
        assertTrue(CoalesceVariableNames.LiveRangeChecker.shouldVisit(new Node(Token.ASSIGN, Node.newString("a"), Node.newNumber(1))));
        assertFalse(CoalesceVariableNames.LiveRangeChecker.shouldVisit(new Node(Token.NUMBER, 1.0)));
    }

    @Test
    public void testCoalesceVariableNamesWithSimpleCase() throws Exception {
        // Minimal setup for testing the process method
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        String source = "function f() { var a = 1; var b = 2; return a + b; }";
        Node root = compiler.parse(source);
        
        // Manually set up a Scope and Var for a simple case
        Node funcNode = root.getFirstChild();
        Node blockNode = funcNode.getChildAtIndex(1);
        Node varANode = blockNode.getFirstChild();
        Node varBNode = varANode.getNext();
        
        MockVar varA = new MockVar("a", varANode, 0);
        MockVar varB = new MockVar("b", varBNode, 1);
        
        MockScope scope = new MockScope(false, funcNode);
        scope.addVar(varA);
        scope.addVar(varB);
        
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        
        // Need to populate colorings manually for this test to work
        UndiGraph<Var, Void> interferenceGraph = new LinkedUndirectedGraph<Var, Void>();
        interferenceGraph.createNode(varA);
        interferenceGraph.createNode(varB);
        interferenceGraph.connectIfNotFound(varA, null, varB); // Assume they can be coalesced

        GraphColoring<Var, Void> coloring = new GreedyGraphColoring<>(interferenceGraph, coloringTieBreaker);
        coloring.color();
        
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        cvn.colorings.push(coloring);
        
        cvn.process(null, root); // externs can be null
        
        // Verify that 'b' has been replaced by 'a'
        Node returnNode = blockNode.getLastChild();
        Node addNode = returnNode.getFirstChild();
        assertEquals("a", addNode.getFirstChild().getString());
        assertEquals("a", addNode.getLastChild().getString());
        assertTrue(compiler.codeChanged);
        
        cvn.colorings.pop(); // Clean up
    }
    
    @Test
    public void testCoalesceVariableNamesWithPseudoNames() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        String source = "function f() { var a = 1; var b = 2; return a + b; }";
        Node root = compiler.parse(source);
        
        Node funcNode = root.getFirstChild();
        Node blockNode = funcNode.getChildAtIndex(1);
        Node varANode = blockNode.getFirstChild();
        Node varBNode = varANode.getNext();
        
        MockVar varA = new MockVar("a", varANode, 0);
        MockVar varB = new MockVar("b", varBNode, 1);
        
        MockScope scope = new MockScope(false, funcNode);
        scope.addVar(varA);
        scope.addVar(varB);
        
        MockNodeTraversal traversal = new MockNodeTraversal(compiler, scope);
        
        UndiGraph<Var, Void> interferenceGraph = new LinkedUndirectedGraph<Var, Void>();
        interferenceGraph.createNode(varA);
        interferenceGraph.createNode(varB);
        interferenceGraph.connectIfNotFound(varA, null, varB);

        GraphColoring<Var, Void> coloring = new GreedyGraphColoring<>(interferenceGraph, coloringTieBreaker);
        coloring.color();
        
        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, true); // Use pseudo names
        cvn.colorings.push(coloring);
        
        cvn.process(null, root);
        
        // Verify that 'a' and 'b' are renamed to 'a_b'
        Node returnNode = blockNode.getLastChild();
        Node addNode = returnNode.getFirstChild();
        assertEquals("a_b", addNode.getFirstChild().getString());
        assertEquals("a_b", addNode.getLastChild().getString());
        assertTrue(compiler.codeChanged);
        
        cvn.colorings.pop();
    }

    @Test
    public void testCoalesceVariableNamesWithExportedVar() throws Exception {
        // This test aims to check if exported variables are handled correctly, 
        // though the current implementation skips global scope processing in enterScope.
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        String source = "var x = 1; function f() { var y = 2; }";
        Node root = compiler.parse(source);

        CoalesceVariableNames cvn = new CoalesceVariableNames(compiler, false);
        cvn.process(null, root);

        // Expect no code change as global scope processing is a no-op
        assertFalse(compiler.codeChanged);
    }
    
    // Helper method to create a minimal CFG and Var for testing
    private void setupMinimalScopeAndCfg(MockAbstractCompiler compiler, MockScope scope, MockNodeTraversal traversal, CoalesceVariableNames cvn, Set<Var> escapedLocals) {
        // Minimal CFG
        com.google.javascript.jscomp.ControlFlowGraph<Node> cfg = new com.google.javascript.jscomp.ControlFlowGraph<>(new MockDiGraph<Node, Branch>(), null, false);
        
        // Need to manually add nodes and edges to simulate a basic CFG if required for specific tests
        // For now, a basic CFG object is sufficient for enterScope
        
        UndiGraph<Var, Void> interferenceGraph = cvn.computeVariableNamesInterferenceGraph(traversal, cfg, escapedLocals);
        GraphColoring<Var, Void> coloring = new GreedyGraphColoring<>(interferenceGraph, coloringTieBreaker);
        coloring.color();
        cvn.colorings.push(coloring);
    }
}
