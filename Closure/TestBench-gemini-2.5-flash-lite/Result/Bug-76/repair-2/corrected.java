package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;


public class DeadAssignmentsEliminationTest {

    // Mock for AbstractCompiler
    private static class MockAbstractCompiler implements AbstractCompiler {
        private boolean codeChanged = false;

        @Override
        public void reportCodeChange() {
            this.codeChanged = true;
        }

        public boolean hasCodeChange() {
            return codeChanged;
        }

        // Add missing methods with default behavior
        @Override public boolean getLiftedVariables() { return false; }
        @Override public boolean isNormalized() { return false; }
        @Override public boolean getPreferSingleQuotes() { return false; }
        @Override public CodingConvention getCodingConvention() { return null; }
        @Override public List<PassConfig.State> getPassConfigStates() { return null; }
        @Override public void initCompilerOptionsIfTesting() {}
        @Override public void setExterns(Node externs) {}
        @Override public void setSourceFile(String source_file) {}
        @Override public void setPassConfig(PassConfig passConfig) {}
        @Override public void setProgress(Compiler.IntermediateState progress) {}
        @Override public Node[] getJsRoot() { return null; }
        @Override public void process(Node externs, Node root) {}
        @Override public void parse(String code) {}
        @Override public void parse(Supplier<String> codeSupplier) {}
        @Override public String toSource() { return null; }
        @Override public String toSource(Node node) { return null; }
        @Override public String getAstDotGraph() { return null; }
        @Override public String getCodeLodGraph() { return null; }
        @Override public String getControlFlowGraph(String functionName) { return null; }
        @Override public String getCfgGraph() { return null; }
        @Override public String getCfgGraphForNode(Node n) { return null; }
        @Override public String getJsCodeRamGraph() { return null; }
        @Override public String getVariableGraph() { return null; }
        @Override public String getDomGraph() { return null; }
        @Override public String getDomGraphForNode(Node node) { return null; }
        @Override public String getAliasGraph() { return null; }
        @Override public String getCallGraph() { return null; }
        @Override public String getAliasGraph(String fnName) { return null; }
        @Override public String getAliasGraphDotGraph() { return null; }
        @Override public String getDotGraph(String name) { return null; }
        @Override public String getTypedScopeGraph() { return null; }
        @Override public void setErrorManager(ErrorManager errorManager) {}
        @Override public ErrorManager getErrorManager() { return null; }
        @Override public void process(CompilerInput input) {}
        @Override public void process(List<CompilerInput> inputs) {}
        @Override public void process(JSModule[] modules) {}
        @Override public void process(ModuleWrapper moduleWrapper) {}
        @Override public void process(SourceFile[] sourceFiles) {}
        @Override public void process(SourceFile externs, SourceFile[] sources) {}
        @Override public void setNormalize_variables_in_loops(boolean normalize) {}
        @Override public boolean getNormalize_variables_in_loops() { return false; }
        @Override public void setOptimizeArgumentsArray(boolean optimize) {}
        @Override public boolean getOptimizeArgumentsArray() { return false; }
        @Override public void setReplaceIdGenerators(boolean replace) {}
        @Override public boolean getReplaceIdGenerators() { return false; }
        @Override public void setAliasMechanism(AliasMechanism aliasMechanism) {}
        @Override public AliasMechanism getAliasMechanism() { return null; }
        @Override public AliasPassConfig getAliasPassConfig() { return new MockAliasPassConfig(); }
    }

    private static class MockAliasPassConfig implements AliasPassConfig {
        @Override public boolean isEnableAliasCheck() { return false; }
        @Override public boolean isEnableAliasCheck(AbstractCompiler compiler) { return false; }
        @Override public boolean isIncludeCtorAssign() { return false; }
        @Override public boolean isIncludeCtorAssign(AbstractCompiler compiler) { return false; }
        @Override public boolean isIncludeReferenceAlias() { return false; }
        @Override public boolean isIncludeReferenceAlias(AbstractCompiler compiler) { return false; }
        @Override public boolean isAliasCheckSkipLocal() { return false; }
        @Override public boolean isAliasCheckSkipLocal(AbstractCompiler compiler) { return false; }
        @Override public Set<String> getAliasCheckSkipList() { return null; }
        @Override public Set<String> getAliasCheckSkipList(AbstractCompiler compiler) { return null; }
        @Override public Set<String> getAliasCheckSkipFile() { return null; }
        @Override public Set<String> getAliasCheckSkipFile(AbstractCompiler compiler) { return null; }
        @Override public String getAliasCheckLogDir() { return null; }
        @Override public String getAliasCheckLogDir(AbstractCompiler compiler) { return null; }
        @Override public boolean isAliasCheckLogDirProvided() { return false; }
        @Override public void setEnableAliasCheck(boolean enable) {}
        @Override public void setIncludeCtorAssign(boolean include) {}
        @Override public void setIncludeReferenceAlias(boolean include) {}
        @Override public void setAliasCheckSkipLocal(boolean skip) {}
        @Override public void setAliasCheckSkipList(Set<String> skipList) {}
        @Override public void setAliasCheckSkipFile(Set<String> skipFile) {}
        @Override public void setAliasCheckLogDir(String logDir) {}
    }

    // Mock Scope and Var implementations (simplified)
    private static class MockScope implements Scope {
        Map<String, Var> vars = new HashMap<>();
        boolean isGlobal = false;

        @Override public Var getVar(String name) { return vars.get(name); }
        @Override public boolean isDeclared(String name, boolean lookupGlobal) { return vars.containsKey(name); }
        @Override public void declare(String name, Var var, Node decl, Node typeNode) { vars.put(name, var); }
        @Override public Scope getParent() { return null; }
        @Override public Node getRootNode() { return null; }
        @Override public boolean isGlobal() { return isGlobal; }
        @Override public Var[] getAllSortedVariables() { return vars.values().toArray(new Var[0]); }
        @Override public Map<String, Var> getVisibleVariables(Node use) { return vars; }
        @Override public Var findCJSModuleVar() { return null; }
        @Override public Var getAssociatedVariable() { return null; }
        @Override public void setAssociatedVariable(Var associatedVariable) {}
        @Override public Set<Var> getClosingVarReferences() { return null; }
        @Override public void addClosingVarReference(Var v) {}
        @Override public boolean isFunctionScope() { return false; }
        @Override public boolean isBlockScope() { return false; }
        @Override public boolean isCatchScope() { return false; }
        @Override public boolean isInterface() { return false; }
        @Override public Var getArguments() { return null; }
        @Override public String getSourceFileName() { return null; }
        @Override public int getLineNumber() { return -1; }
        @Override public boolean isVar(Node node) { return false; }
        @Override public void setLineNumber(int lineNumber) {}
        @Override public void setSourceFileName(String sourceFileName) {}
        @Override public boolean isStaticScope() { return false; }
        @Override public boolean hasReferenceToName(String name) { return false; }
        @Override public void inferSlotType(String name, JSType type) {}
        @Override public void setDeclaredFormalParameter(Var v) {}
        @Override public Var getThisక్ర() { return null; }
        @Override public boolean isEarlyBinding() { return false; }
        @Override public Node getDeclarationNode(String name) { return null; }
        @Override public Scope getChildScope() { return null; }
        @Override public void setChildScope(Scope childScope) {}
        @Override public boolean isModuleScope() { return false; }
        @Override public void setModuleScope(boolean moduleScope) {}
        @Override public void addConsumer(Var consumer) {}
        @Override public void removeConsumer(Var consumer) {}
        @Override public Set<Var> getConsumers() { return null; }
        @Override public boolean isExterns() { return false; }
        @Override public void setExterns(boolean externs) {}
        @Override public void setGetterSlot(Var var) {}
        @Override public void setSetterSlot(Var var) {}
        @Override public Var getGetterSlot() { return null; }
        @Override public Var getSetterSlot() { return null; }
    }

    private static class MockVar implements Var {
        String name;
        Scope scope;
        Set<String> escapedLocals = new HashSet<>(); // Added to simulate escaped variables

        public MockVar(String name, Scope scope) { this.name = name; this.scope = scope; }

        @Override public String getName() { return name; }
        @Override public Scope getScope() { return scope; }
        @Override public Node getInitialStorage() { return null; }
        @Override public Node getDeclaration() { return null; }
        @Override public boolean isGlobal() { return false; }
        @Override public boolean isLocal() { return true; }
        @Override public boolean isConst() { return false; }
        @Override public boolean isLet() { return false; }
        @Override public boolean isDefaultParam() { return false; }
        @Override public boolean isRest() { return false; }
        @Override public boolean isFunction() { return false; }
        @Override public boolean isImplicit() { return false; }
        @Override public boolean isExported() { return false; }
        @Override public void setExported(boolean exported) {}
        @Override public boolean isAssigned() { return false; }
        @Override public void setAssigned(boolean assigned) {}
        @Override public boolean isInitialized() { return false; }
        @Override public void setInitialized(boolean initialized) {}
        @Override public boolean isUsados() { return false; }
        @Override public void setUsados(boolean used) {}
        @Override public boolean isDefined() { return true; }
        @Override public void setDefined(boolean defined) {}
        @Override public boolean isCapturedFn() { return false; }
        @Override public void setCapturedFn(boolean capturedFn) {}
        @Override public JSType getType() { return null; }
        @Override public void setType(JSType type) {}
        @Override public String getJSDocInfo() { return null; }
        @Override public void setJSDocInfo(String info) {}
        @Override public boolean isEnumParameter() { return false; }
        @Override public void setEnumParameter(boolean enumParameter) {}
        @Override public void setNeverDeclaredInScript(boolean neverDeclaredInScript) {}
        @Override public boolean isNeverDeclaredInScript() { return false; }
        @Override public void setLocalExpansion(Node expansion) {}
        @Override public Node getLocalExpansion() { return null; }
        @Override public void setColonColon(boolean colonColon) {}
        @Override public boolean isColonColon() { return false; }
        @Override public void setIsFromForIn(boolean isFromForIn) {}
        @Override public boolean isFromForIn() { return false; }
        @Override public void setImplicit (boolean implicit) {}
        @Override public void setClosure(boolean closure) {}
        @Override public boolean isClosure() { return false; }
        @Override public void setRequiresCtorAssign(boolean requiresCtorAssign) {}
        @Override public boolean requiresCtorAssign() { return false; }
        @Override public void setSideEffect(boolean sideEffect) {}
        @Override public boolean hasSideEffect() { return false; }
        @Override public void setTypeCapture(boolean typeCapture) {}
        @Override public boolean isTypeCapture() { return false; }
        @Override public void setTypeReference(boolean typeReference) {}
        @Override public boolean isTypeReference() { return false; }
        @Override public void setModuleVar(boolean moduleVar) {}
        @Override public boolean isModuleVar() { return false; }
        @Override public void setAlias(boolean alias) {}
        @Override public boolean isAlias() { return false; }
        @Override public void setBindingName(String bindingName) {}
        @Override public String getBindingName() { return null; }
        @Override public void setScope(Scope scope) {}
        @Override public void setLocal(boolean local) {}
        @Override public void setConst(boolean constVar) {}
        @Override public void setLet(boolean let) {}
        @Override public void setDefaultParam(boolean defaultParam) {}
        @Override public void setRest(boolean rest) {}
        @Override public void setFunction(boolean function) {}
        @Override public void setImplicit(boolean implicit) {}
        @Override public void setIsInitialized(boolean isInitialized) {}
        @Override public void setAssigned(boolean assigned) {}
        @Override public void setUsados(boolean used) {}
        @Override public void setDefined(boolean defined) {}
        @Override public void setCapturedFn(boolean capturedFn) {}
        @Override public void setType(JSType type) {}
        @Override public void setJSDocInfo(String info) {}
        @Override public void setEnumParameter(boolean enumParameter) {}
        @Override public void setNeverDeclaredInScript(boolean neverDeclaredInScript) {}
        @Override public void setLocalExpansion(Node expansion) {}
        @Override public void setColonColon(boolean colonColon) {}
        @Override public void setIsFromForIn(boolean isFromForIn) {}
        @Override public void setClosure(boolean closure) {}
        @Override public void setRequiresCtorAssign(boolean requiresCtorAssign) {}
        @Override public void setSideEffect(boolean sideEffect) {}
        @Override public void setTypeCapture(boolean typeCapture) {}
        @Override public void setTypeReference(boolean typeReference) {}
        @Override public void setModuleVar(boolean moduleVar) {}
        @Override public void setAlias(boolean alias) {}
        @Override public void setBindingName(String bindingName) {}
        @Override public boolean equals(Object o) { return this == o; }
        @Override public int hashCode() { return System.identityHashCode(this); }
    }

    // Mock ControlFlowGraph and its related classes
    private static class MockControlFlowGraph<N> extends ControlFlowGraph<N> {
        MockControlFlowGraph() {
            // Provide dummy constructor arguments for ControlFlowGraph
            super(new Node(Token.BLOCK), true, true);
        }

        @Override
        public Iterable<DiGraphNode<N, Branch>> getDirectedGraphNodes() {
            // This will be overridden in tests where we need specific nodes.
            return java.util.Collections.emptyList();
        }
        // Add other necessary overrides if tests require them.
        @Override public DiGraphNode<N, Branch> getImplicitReturn() { return null; }
        @Override public DiGraphNode<N, Branch> getEntry() { return null; }
        @Override public boolean isImplicitReturn(DiGraphNode<N, Branch> node) { return false; }
        @Override public void connectToImplicitReturn(N srcValue, Branch edgeValue) {}
        @Override public Comparator<DiGraphNode<N, Branch>> getOptionalNodeComparator( boolean isForward) { return null; }
    }

    private static class MockDiGraphNode<N, B> implements DiGraphNode<N, B> {
        private N value;
        public MockDiGraphNode(N value) { this.value = value; }
        @Override public N getValue() { return value; }
        @Override public Set<DiGraphNode<N, B>> getNeighbors() { return null; }
        @Override public Set<DiGraphNode<N, B>> getIncomingNeighbors() { return null; }
        @Override public Set<DiGraphNode<N, B>> getOutgoingNeighbors() { return null; }
        @Override public B getEdgeTo(DiGraphNode<N, B> neighbor) { return null; }
        @Override public B getEdgeFrom(DiGraphNode<N, B> neighbor) { return null; }
        @Override public void setAnnotation(Object annotation) {}
        @Override public Object getAnnotation() { return null; }
        @Override public void removeAnnotation() {}
        @Override public boolean hasAnnotation() { return false; }
    }

    // Mock LiveVariablesAnalysis
    private static class MockLiveVariablesAnalysis extends LiveVariablesAnalysis {
        private Set<Var> escapedLocals;

        MockLiveVariablesAnalysis(ControlFlowGraph<Node> cfg, Scope scope, AbstractCompiler compiler, Set<Var> escapedLocals) {
            // Use a dummy CFG as we are mocking the analysis results directly.
            super(new MockControlFlowGraph<>(), scope, compiler);
            this.escapedLocals = escapedLocals;
        }

        @Override
        public Set<Var> getEscapedLocals() {
            return escapedLocals;
        }

        // Mock analyze method to do nothing or set predefined values if needed for specific tests
        @Override
        public void analyze() {
            // No-op for mocks
        }
    }

    // Mock FlowState
    private static class MockFlowState<T extends DataFlowAnalysis.LatticeElement> implements FlowState<T> {
        T inLattice;
        T outLattice;

        MockFlowState(T inLattice, T outLattice) {
            this.inLattice = inLattice;
            this.outLattice = outLattice;
        }

        @Override public T getIn() { return inLattice; }
        @Override public T getOut() { return outLattice; }
    }

    // Mock LiveVariableLattice
    private static class MockLiveVariableLattice implements LiveVariableLattice {
        private Set<Var> liveVars;

        MockLiveVariableLattice(Set<Var> liveVars) {
            this.liveVars = liveVars;
        }

        MockLiveVariableLattice(Var var, boolean isLive) {
            this.liveVars = new HashSet<>();
            if (isLive && var != null) {
                this.liveVars.add(var);
            }
        }

        @Override public boolean isLive(Var var) { return liveVars != null && liveVars.contains(var); }
        @Override public void join(LiveVariableLattice other) {}
        @Override public boolean equals(Object other) { return false; }
        @Override public int hashCode() { return 0; }
        @Override public String toString() { return ""; }
    }

    // Mock for NodeTraversal
    private static class MockNodeTraversal implements NodeTraversal {
        private Scope scope;
        private ControlFlowGraph<Node> cfg;
        private AbstractCompiler compiler;
        private Node currentNode;

        MockNodeTraversal(Scope scope, ControlFlowGraph<Node> cfg, AbstractCompiler compiler) {
            this.scope = scope;
            this.cfg = cfg;
            this.compiler = compiler;
        }

        @Override public void traverse(Node root) {}
        @Override public void traverseRoots(Node... roots) {}
        @Override public void traverseRoots(List<Node> roots) {}
        @Override void traverseWithScope(Node root, Scope s) {}
        @Override void traverseAtScope(Scope s) {}
        @Override protected void traverseInnerNode(Node node, Node parent, Scope refinedScope) {}
        @Override public Compiler getCompiler() { return null; } // Not implemented for mock
        @Override public int getLineNumber() { return -1; }
        @Override public String getSourceName() { return null; }
        @Override public CompilerInput getInput() { return null; }
        @Override public JSModule getModule() { return null; }
        @Override public Node getCurrentNode() { return currentNode; }
        public void setCurrentNode(Node node) { this.currentNode = node; }
        @Override public static void traverse( AbstractCompiler compiler, Node root, Callback cb) {}
        @Override public static void traverseRoots( AbstractCompiler compiler, List<Node> roots, Callback cb) {}
        @Override public Node getEnclosingFunction() { return null; }
        @Override public Scope getScope() { return scope; }
        @Override public ControlFlowGraph<Node> getControlFlowGraph() { return cfg; }
        @Override public Node getScopeRoot() { return scope.getRootNode(); }
        @Override boolean inGlobalScope() { return false; }
        @Override int getScopeDepth() { return 0; }
        @Override public boolean hasScope() { return true; }
        @Override public void report(Node n, DiagnosticType diagnosticType, String... arguments) {}
        @Override public JSError makeError(Node n, CheckLevel level, DiagnosticType type, String... arguments) { return null; }
        @Override public JSError makeError(Node n, DiagnosticType type, String... arguments) { return null; }
    }


    // Helper method to create a simple Node with type and value
    private Node createNode(int type, Object value) {
        Node node;
        if (value instanceof String) {
            node = Node.newString((String) value);
        } else if (value instanceof Double) {
            node = Node.newNumber((Double) value);
        } else if (value instanceof Integer) {
             node = Node.newNumber((double)(Integer) value); // Ensure double for newNumber
        } else {
            node = new Node(type);
        }
        node.setType(type);
        return node;
    }

    // Helper method to create a simple assignment node
    private Node createAssignment(Node lhs, Node rhs) {
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        return assign;
    }

    // Helper method to create an increment node
    private Node createIncrement(Node operand) {
        Node inc = new Node(Token.INC, operand);
        return inc;
    }

    // Helper method to create a decrement node
    private Node createDecrement(Node operand) {
        Node dec = new Node(Token.DEC, operand);
        return dec;
    }

    // Helper method to create a simple expression statement
    private Node createExpressionStatement(Node expr) {
        return new Node(Token.EXPR_RESULT, expr);
    }

    // Helper method to create a simple block
    private Node createBlock(Node... statements) {
        Node block = new Node(Token.BLOCK);
        for (Node stmt : statements) {
            block.addChildToBack(stmt);
        }
        return block;
    }

    // Helper to create a minimal CFG with just a node.
    private ControlFlowGraph<Node> createMinimalCFG(Node rootNode) {
        return new MockControlFlowGraph<Node>() {
            @Override
            public Iterable<DiGraphNode<Node, Branch>> getDirectedGraphNodes() {
                DiGraphNode<Node, Branch> node = new MockDiGraphNode<>(rootNode);
                return java.util.Collections.singletonList(node);
            }
        };
    }

    // Helper to create a minimal scope with one variable
    private MockScope createMockScopeWithVar(String varName) {
        MockScope scope = new MockScope();
        MockVar var = new MockVar(varName, scope);
        scope.declare(varName, var, null, null);
        return scope;
    }

    @Test
    public void testSimpleDeadAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(assignX); // Use assignX as the root node for CFG
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, assignX, mockState);

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, assignX.getParent().getType()); // Replaced by RHS
        assertEquals(1.0, assignX.getParent().getDouble(), 0.0);
    }

    @Test
    public void testDeadIncrement() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node incX = createIncrement(x); // x++

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(incX);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        deadAssignmentsElimination.tryRemoveAssignment(null, incX, incX, mockState);

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.VOID, incX.getParent().getType()); // Replaced by VOID(0)
        assertEquals(Token.NUMBER, incX.getParent().getFirstChild().getType());
        assertEquals(0.0, incX.getParent().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testDeadDecrement() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node decX = createDecrement(x); // x--

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(decX);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        deadAssignmentsElimination.tryRemoveAssignment(null, decX, decX, mockState);

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.VOID, decX.getParent().getType()); // Replaced by VOID(0)
        assertEquals(Token.NUMBER, decX.getParent().getFirstChild().getType());
        assertEquals(0.0, decX.getParent().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testIdentityAssignment() throws Exception {
        Node x1 = createNode(Token.NAME, "x");
        Node x2 = createNode(Token.NAME, "x");
        Node assignX = createAssignment(x1, x2); // x = x

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");

        ControlFlowGraph<Node> cfg = createMinimalCFG(assignX);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, assignX, null); // state can be null

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NAME, assignX.getParent().getType()); // Replaced by RHS (x)
        assertEquals("x", assignX.getParent().getString());
    }

    @Test
    public void testVariableLive() throws Exception {
        Node x1 = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x1, one); // x = 1

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, true); // 'x' IS live out.
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(assignX);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, assignX, mockState);

        assertFalse(compiler.hasCodeChanged()); // No change should happen
        assertEquals(Token.ASSIGN, assignX.getType()); // Assignment should remain
    }

    @Test
    public void testVariableEscaped() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        Set<Var> escaped = new HashSet<>();
        escaped.add(varX);
        MockLiveVariablesAnalysis liveness = new MockLiveVariablesAnalysis(null, scope, compiler, escaped);

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = liveness; // Set the mocked liveness analysis

        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, assignX, mockState);

        assertFalse(compiler.hasCodeChanged()); // Should not be removed because it's escaped
        assertEquals(Token.ASSIGN, assignX.getType()); // Assignment should remain
    }

    @Test
    public void testVariableStillLiveWithinExpressionRead() throws Exception {
        // Example: `a = C && X = a;` where `a` is assigned `C` then read in `X = a`.
        Node a1 = createNode(Token.NAME, "a");
        Node C = createNode(Token.NUMBER, 3.0);
        Node assignA = createAssignment(a1, C); // a = C

        Node X = createNode(Token.NAME, "X");
        Node a2 = createNode(Token.NAME, "a");
        Node assignX = createAssignment(X, a2); // X = a

        Node andNode = new Node(Token.AND, assignA, assignX);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("a");
        MockVar varA = (MockVar) scope.getVar("a");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varA, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(andNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = new MockLiveVariablesAnalysis(cfg, scope, compiler, new HashSet<>());

        // The isVariableStillLiveWithinExpression should return true because 'a' is read in assignX
        assertTrue(deadAssignmentsElimination.isVariableStillLiveWithinExpression(assignA, andNode, "a"));

        // Call tryRemoveAssignment and check that no change occurs
        deadAssignmentsElimination.tryRemoveAssignment(null, assignA, andNode, mockState);

        assertFalse(compiler.hasCodeChanged());
        assertEquals(Token.ASSIGN, assignA.getType()); // Assignment should remain
    }

    @Test
    public void testVariableStillLiveWithinExpressionKill() throws Exception {
        // Example: `a = C; a = S;` where `a` is assigned `C` then reassigned `S`.
        Node a1 = createNode(Token.NAME, "a");
        Node C = createNode(Token.NUMBER, 3.0);
        Node assignA1 = createAssignment(a1, C); // a = C

        Node a2 = createNode(Token.NAME, "a");
        Node S = createNode(Token.NUMBER, 4.0);
        Node assignA2 = createAssignment(a2, S); // a = S

        Node sequence = new Node(Token.COMMA, assignA1, assignA2);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("a");
        MockVar varA = (MockVar) scope.getVar("a");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varA, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(sequence);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = new MockLiveVariablesAnalysis(cfg, scope, compiler, new HashSet<>());

        // The isVariableStillLiveWithinExpression should return false because 'a' is killed by the second assignment
        assertFalse(deadAssignmentsElimination.isVariableStillLiveWithinExpression(assignA1, sequence, "a"));

        // Call tryRemoveAssignment and check that change occurs
        deadAssignmentsElimination.tryRemoveAssignment(null, assignA1, sequence, mockState);

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, assignA1.getParent().getType()); // Replaced by RHS (C)
        assertEquals(3.0, assignA1.getParent().getDouble(), 0.0);
    }


    @Test
    public void testIfConditionDeadAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node cond = assignX;

        Node thenBlock = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, cond, thenBlock);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(ifNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // Simulate the call within tryRemoveDeadAssignments for IF
        deadAssignmentsElimination.tryRemoveAssignment(null, cond, ifNode, mockState); // n is cond, exprRoot is ifNode

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, cond.getParent().getType()); // x=1 is replaced by 1
        assertEquals(1.0, cond.getParent().getDouble(), 0.0);
    }

    @Test
    public void testForConditionDeadAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node cond = assignX;

        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, new Node(Token.VAR), cond, body); // FOR(VAR; x=1; )

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(forNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // Simulate the call within tryRemoveDeadAssignments for FOR
        deadAssignmentsElimination.tryRemoveAssignment(null, cond, forNode, mockState); // n is cond, exprRoot is forNode

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, cond.getParent().getType()); // x=1 is replaced by 1
        assertEquals(1.0, cond.getParent().getDouble(), 0.0);
    }

    @Test
    public void testSwitchCaseDeadAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node caseNode = new Node(Token.CASE, assignX); // CASE x=1:

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(caseNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // Simulate the call within tryRemoveDeadAssignments for CASE
        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, caseNode, mockState); // n is assignX, exprRoot is caseNode

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, assignX.getParent().getType()); // x=1 is replaced by 1
        assertEquals(1.0, assignX.getParent().getDouble(), 0.0);
    }

    @Test
    public void testReturnDeadAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node returnNode = new Node(Token.RETURN, assignX); // return x=1;

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(returnNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // Simulate the call within tryRemoveDeadAssignments for RETURN
        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, returnNode, mockState); // n is assignX, exprRoot is returnNode

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.RETURN, assignX.getParent().getType());
        assertEquals(Token.NUMBER, assignX.getParent().getFirstChild().getType()); // x=1 is replaced by 1
        assertEquals(1.0, assignX.getParent().getFirstChild().getDouble(), 0.0);
    }


    @Test
    public void testComplexExpressionDeadAssignment() throws Exception {
        Node a = createNode(Token.NAME, "a");
        Node b = createNode(Token.NAME, "b");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignB = createAssignment(b, one); // b = 1;
        Node mul = new Node(Token.MUL, a, assignB); // a * (b=1)

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("b");
        MockVar varB = (MockVar) scope.getVar("b");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varB, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(mul);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // The tryRemoveAssignment should recurse into the multiplication expression.
        deadAssignmentsElimination.tryRemoveAssignment(null, assignB, mul, mockState); // n is assignB, exprRoot is mul

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.MUL, assignB.getParent().getType());
        assertEquals(Token.NUMBER, assignB.getParent().getSecondChild().getType()); // b=1 replaced by 1
        assertEquals(1.0, assignB.getParent().getSecondChild().getDouble(), 0.0);
    }

    @Test
    public void testFunctionScopeSkipped() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        Node blockNode = new Node(Token.BLOCK, functionNode); // Function inside a block
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        MockScope scope = new MockScope(); // Not global, so enterScope logic applies
        scope.isGlobal = true; // Simulate global scope
        ControlFlowGraph<Node> cfg = createMinimalCFG(blockNode);
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, compiler);

        // This test calls enterScope to check the skip logic.
        deadAssignmentsElimination.enterScope(traversal);

        // If a function is detected, the liveness analysis should not be computed.
        assertNull(deadAssignmentsElimination.liveness);
    }

    @Test
    public void testNoAssignsSkipped() throws Exception {
        Node literalNode = createNode(Token.NUMBER, 5.0);
        Node blockNode = createBlock(literalNode); // No assignments

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        MockScope scope = new MockScope();
        ControlFlowGraph<Node> cfg = createMinimalCFG(blockNode);
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, compiler);

        deadAssignmentsElimination.enterScope(traversal);

        // If no assignments are found, liveness should not be computed.
        assertNull(deadAssignmentsElimination.liveness);
    }

    @Test
    public void testNonLocalAssignment() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = new MockScope(); // No 'x' declared in this scope
        scope.isGlobal = true; // Assume global scope where 'x' might be global.

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(null, false); // Var doesn't matter if not declared locally
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(assignX);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // tryRemoveAssignment should return early because `!scope.isDeclared(name, false)`
        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, assignX, mockState);

        assertFalse(compiler.hasCodeChanged());
        assertEquals(Token.ASSIGN, assignX.getType()); // Assignment should remain unchanged
    }

    @Test
    public void testForInLoopNoConditionCheck() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1

        Node iterator = createNode(Token.NAME, "key");
        Node object = new Node(Token.OBJECTLIT);
        Node forInNode = new Node(Token.FOR, iterator, object, new Node(Token.BLOCK)); // for (key in {})

        // Dead assignment inside the loop body, not the loop condition itself
        Node statementInLoop = createExpressionStatement(assignX);
        forInNode.getLastChild().addChildToBack(statementInLoop);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(forInNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // The tryRemoveDeadAssignments method should handle FOR loops by only checking the condition.
        // The assignment inside the loop body is handled by the generic case.
        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, forInNode, mockState);

        assertTrue(compiler.hasCodeChanged()); // The assignment inside should be considered
        assertEquals(Token.NUMBER, assignX.getParent().getType());
        assertEquals(1.0, assignX.getParent().getDouble(), 0.0);
    }

    @Test
    public void testAssignmentOpRemoval() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node addAssign = new Node(Token.ASSIGN_ADD, x, one); // x += 1

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(addAssign);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        deadAssignmentsElimination.tryRemoveAssignment(null, addAssign, addAssign, mockState);

        assertTrue(compiler.hasCodeChanged());
        // x += 1 is replaced by x + 1
        assertEquals(Token.ADD, addAssign.getParent().getType());
        assertEquals(Token.NAME, addAssign.getParent().getFirstChild().getType());
        assertEquals(Token.NUMBER, addAssign.getParent().getSecondChild().getType());
    }

    @Test
    public void testVariableStillLiveWithinExpressionHookTrueBranch() throws Exception {
        // Example: `a = 1 ? x : y;` where `a = 1` is dead, but `x` might be live.
        Node cond = createNode(Token.NUMBER, 1.0);
        Node x = createNode(Token.NAME, "x"); // Variable to check
        Node y = createNode(Token.NAME, "y");
        Node hook = new Node(Token.HOOK, cond, x, y);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(hook);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = new MockLiveVariablesAnalysis(cfg, scope, compiler, new HashSet<>());

        // The assignment is within the hook's true branch.
        // We simulate `isVariableStillLiveWithinExpression` being called for `x`.
        // The `checkHookBranchReadBeforeKill` for the true branch (`x`) will be called.
        // If `x` is read, it should return true.
        assertTrue(deadAssignmentsElimination.isVariableStillLiveWithinExpression(x, hook, "x"));
    }

    @Test
    public void testVariableStillLiveWithinExpressionHookFalseBranch() throws Exception {
        // Example: `a = 0 ? x : y;` where `a = 0` is dead, but `y` might be live.
        Node cond = createNode(Token.NUMBER, 0.0);
        Node x = createNode(Token.NAME, "x");
        Node y = createNode(Token.NAME, "y"); // Variable to check
        Node hook = new Node(Token.HOOK, cond, x, y);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("y");
        MockVar varY = (MockVar) scope.getVar("y");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varY, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(hook);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = new MockLiveVariablesAnalysis(cfg, scope, compiler, new HashSet<>());

        // The assignment is within the hook's false branch.
        // We simulate `isVariableStillLiveWithinExpression` being called for `y`.
        // The `checkHookBranchReadBeforeKill` for the false branch (`y`) will be called.
        // If `y` is read, it should return true.
        assertTrue(deadAssignmentsElimination.isVariableStillLiveWithinExpression(y, hook, "y"));
    }

    @Test
    public void testVariableStillLiveWithinExpressionAndOperator() throws Exception {
        // Example: `a = 1 && x;` where `a = 1` is dead, but `x` is live.
        Node assignA = createAssignment(createNode(Token.NAME, "a"), createNode(Token.NUMBER, 1.0)); // a = 1
        Node x = createNode(Token.NAME, "x"); // Variable to check
        Node andNode = new Node(Token.AND, assignA, x);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(andNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = new MockLiveVariablesAnalysis(cfg, scope, compiler, new HashSet<>());

        // The assignment `a=1` is the first child of AND. The variable `x` is the second child.
        // `isVariableStillLiveWithinExpression` should check if `x` is live.
        assertTrue(deadAssignmentsElimination.isVariableStillLiveWithinExpression(assignA, andNode, "x"));
    }

    @Test
    public void testVariableStillLiveWithinExpressionOrOperator() throws Exception {
        // Example: `a = 0 || x;` where `a = 0` is dead, but `x` is live.
        Node assignA = createAssignment(createNode(Token.NAME, "a"), createNode(Token.NUMBER, 0.0)); // a = 0
        Node x = createNode(Token.NAME, "x"); // Variable to check
        Node orNode = new Node(Token.OR, assignA, x);

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(orNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        deadAssignmentsElimination.liveness = new MockLiveVariablesAnalysis(cfg, scope, compiler, new HashSet<>());

        // The assignment `a=0` is the first child of OR. The variable `x` is the second child.
        // `isVariableStillLiveWithinExpression` should check if `x` is live.
        assertTrue(deadAssignmentsElimination.isVariableStillLiveWithinExpression(assignA, orNode, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillSimpleRead() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node readX = createNode(Token.NAME, "x"); // read x
        Node seq = new Node(Token.COMMA, assignX, readX);

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        assertEquals(DeadAssignmentsElimination.VariableLiveness.READ, dae.isVariableReadBeforeKill(readX, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillSimpleKill() throws Exception {
        Node x1 = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX1 = createAssignment(x1, one); // x = 1

        Node x2 = createNode(Token.NAME, "x");
        Node two = createNode(Token.NUMBER, 2.0);
        Node assignX2 = createAssignment(x2, two); // x = 2
        Node seq = new Node(Token.COMMA, assignX1, assignX2);

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        assertEquals(DeadAssignmentsElimination.VariableLiveness.KILL, dae.isVariableReadBeforeKill(assignX1, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillNestedRead() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node subAssign = createAssignment(createNode(Token.NAME, "y"), x); // y = x
        Node readX = createNode(Token.NAME, "x");
        Node seq = new Node(Token.COMMA, subAssign, readX);

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        assertEquals(DeadAssignmentsElimination.VariableLiveness.READ, dae.isVariableReadBeforeKill(subAssign, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillNestedKill() throws Exception {
        Node x1 = createNode(Token.NAME, "x");
        Node subAssign1 = createAssignment(createNode(Token.NAME, "y"), createNode(Token.NUMBER, 1.0)); // y = 1
        Node assignX1 = createAssignment(x1, subAssign1); // x = (y=1)

        Node x2 = createNode(Token.NAME, "x");
        Node subAssign2 = createAssignment(createNode(Token.NAME, "z"), createNode(Token.NUMBER, 2.0)); // z = 2
        Node assignX2 = createAssignment(x2, subAssign2); // x = (z=2)
        Node seq = new Node(Token.COMMA, assignX1, assignX2);

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        assertEquals(DeadAssignmentsElimination.VariableLiveness.KILL, dae.isVariableReadBeforeKill(assignX1, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillAssignRhsRead() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node readX = createNode(Token.NAME, "x"); // read x
        Node seq = new Node(Token.COMMA, assignX, readX);

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        // The logic for Token.ASSIGN is special: the RHS is evaluated before the kill.
        // So if x is read on the RHS, it's a READ.
        assertEquals(DeadAssignmentsElimination.VariableLiveness.READ, dae.isVariableReadBeforeKill(assignX, "x"));
    }

    @Test
    public void testIsVariableReadBeforeKillAssignRhsKill() throws Exception {
        Node x1 = createNode(Token.NAME, "x");
        Node x2 = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX2 = createAssignment(x2, one); // x = 1
        Node assignX1 = createAssignment(x1, assignX2); // x = (x = 1)

        DeadAssignmentsElimination dae = new DeadAssignmentsElimination(null);
        // The assignment x = (x = 1) means x is killed.
        assertEquals(DeadAssignmentsElimination.VariableLiveness.KILL, dae.isVariableReadBeforeKill(assignX1, "x"));
    }

    @Test
    public void testProcessMethod() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.SCRIPT);
        deadAssignmentsElimination.process(externs, root);
        // This method mainly triggers NodeTraversal.traverse, which is hard to mock fully here.
        // The side effect is that `enterScope` and `visit` would be called.
        // We can't assert much directly without a full traversal.
        // The key check is that it doesn't crash.
        assertTrue(true); // Indicates no exception was thrown.
    }

    @Test
    public void testEnterScopeWithFunction() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        Node blockNode = new Node(Token.BLOCK, functionNode); // Function inside a block
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        MockScope scope = new MockScope(); // Not global, so enterScope logic applies
        scope.isGlobal = false; // Ensure it's not global
        ControlFlowGraph<Node> cfg = createMinimalCFG(blockNode);
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, compiler);

        deadAssignmentsElimination.enterScope(traversal);

        // Liveness should not be computed because NodeUtil.containsFunction is true.
        assertNull(deadAssignmentsElimination.liveness);
    }

    @Test
    public void testEnterScopeNoAssigns() throws Exception {
        Node literalNode = createNode(Token.NUMBER, 5.0);
        Node blockNode = createBlock(literalNode); // No assignments

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);
        MockScope scope = new MockScope();
        ControlFlowGraph<Node> cfg = createMinimalCFG(blockNode);
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, compiler);

        deadAssignmentsElimination.enterScope(traversal);

        // Liveness should not be computed because NodeUtil.has(...) is false.
        assertNull(deadAssignmentsElimination.liveness);
    }

    @Test
    public void testTryRemoveDeadAssignmentsLoop() throws Exception {
        // Test for loops like WHILE, DO, FOR
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node cond = assignX; // assignment as condition

        Node whileNode = new Node(Token.WHILE, cond, new Node(Token.BLOCK)); // WHILE(x=1) {}

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(whileNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        // Simulate the call within tryRemoveDeadAssignments for IF (similar logic)
        deadAssignmentsElimination.tryRemoveAssignment(null, cond, whileNode, mockState);

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, cond.getParent().getType());
        assertEquals(1.0, cond.getParent().getDouble(), 0.0);
    }

    @Test
    public void testTryRemoveDeadAssignmentsCase() throws Exception {
        Node x = createNode(Token.NAME, "x");
        Node one = createNode(Token.NUMBER, 1.0);
        Node assignX = createAssignment(x, one); // x = 1
        Node caseNode = new Node(Token.CASE, assignX); // CASE x = 1

        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockScope scope = createMockScopeWithVar("x");
        MockVar varX = (MockVar) scope.getVar("x");

        LiveVariableLattice mockLiveOut = new MockLiveVariableLattice(varX, false);
        FlowState<LiveVariableLattice> mockState = new MockFlowState<>(null, mockLiveOut);

        ControlFlowGraph<Node> cfg = createMinimalCFG(caseNode);
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(compiler);

        deadAssignmentsElimination.tryRemoveAssignment(null, assignX, caseNode, mockState);

        assertTrue(compiler.hasCodeChanged());
        assertEquals(Token.NUMBER, assignX.getParent().getType());
        assertEquals(1.0, assignX.getParent().getDouble(), 0.0);
    }

    @Test
    public void testExitScopeDoesNothing() throws Exception {
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(null);
        MockScope scope = new MockScope();
        ControlFlowGraph<Node> cfg = createMinimalCFG(new Node(Token.BLOCK));
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, null);
        deadAssignmentsElimination.exitScope(traversal);
        // exitScope is expected to do nothing.
        assertTrue(true);
    }

    @Test
    public void testVisitDoesNothing() throws Exception {
        DeadAssignmentsElimination deadAssignmentsElimination = new DeadAssignmentsElimination(null);
        MockScope scope = new MockScope();
        ControlFlowGraph<Node> cfg = createMinimalCFG(new Node(Token.BLOCK));
        MockNodeTraversal traversal = new MockNodeTraversal(scope, cfg, null);
        Node n = new Node(Token.NAME, "x");
        Node parent = new Node(Token.BLOCK);
        deadAssignmentsElimination.visit(traversal, n, parent);
        // visit is an empty method.
        assertTrue(true);
    }
}
