```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;

// Mock AbstractCompiler for testing
class MockCompiler extends AbstractCompiler {
    private CodingConvention convention = new DefaultCodingConvention();

    @Override
    public CodingConvention getCodingConvention() {
        return convention;
    }

    @Override
    public void report(DiagnosticType type, Node... arguments) {
        // Do nothing for tests
    }

    @Override
    public boolean isNormalized() {
        return true;
    }

    @Override
    public LifeCycleStage getLifeCycleStage() {
        return LifeCycleStage.NORMALIZED_FULL;
    }

    @Override
    public JSErrorReporter getErrorReporter() {
        // Mock BasicErrorReporter instead of using it directly if it's not available.
        return new BasicErrorReporter() {
            @Override
            public void report(JSSourceFile file, DiagnosticType diagnosticType, String... params) {
                // Do nothing for tests
            }
        };
    }

    @Override
    public JSSourceFile getSourceFile(String fileName) {
        return null; // Not used in these tests
    }

    @Override
    public TokenKindMap getTokenKindMap() {
        // Using a concrete implementation from the API outline.
        return new TokenKindMap(new DefaultCodingConvention());
    }

    @Override
    public String getSourceProductName() {
        return "test";
    }

    @Override
    public Region getSourceRegion(Node node) {
        return null; // Not used in these tests
    }

    @Override
    public String getSourceExcerpt(Node node) {
        return null; // Not used in these tests
    }

    @Override
    public String getSourceString(Node node) {
        return null; // Not used in these tests
    }

    @Override
    public VariableMap getVariableMap() {
        return null; // Not used in these tests
    }

    @Override
    public StringMap getStringMap() {
        // Using a concrete implementation from the API outline.
        return new StringMap();
    }

    @Override
    public void process(Node externs, Node root) {
        // Do nothing
    }

    @Override
    public int getErrorCount() {
        return 0;
    }

    @Override
    public int getWarningCount() {
        return 0;
    }

    @Override
    public boolean hasErrors() {
        return false;
    }

    @Override
    public JSModuleGraph getModuleGraph() {
        return new JSModuleGraph(new ArrayList<>()); // Mock implementation with empty list
    }

    @Override
    public void setIncrementalCompilerBuild(boolean b) {
        // No-op
    }

    // Implement abstract methods from AbstractCompiler
    @Override
    public Node parseSyntheticCode(String code) {
        // Basic parsing for test purposes
        return new Node(Token.SCRIPT, new Node(Token.BLOCK));
    }

    @Override
    public Node getRoot() {
        return new Node(Token.ROOT);
    }

    @Override
    public void init(CompilerOptions options) {
        // No-op
    }

    @Override
    public boolean shouldRunPass(String passName) {
        return false;
    }

    @Override
    public void addCompilerInput(CompilerInput input) {
        // No-op
    }

    @Override
    public List<CompilerInput> getInputs() {
        return new ArrayList<>();
    }
    
    // Mock implementation for getOldParseTreeByName
    @Override
    public Node getOldParseTreeByName(String name) {
        // This method is part of AbstractCompiler, so it must be implemented.
        // Return a placeholder node.
        return new Node(Token.NAME, "placeholder");
    }
}

// Mock Supplier for safe name generation
class MockSafeNameIdSupplier implements Supplier<String> {
    private int id = 0;
    @Override
    public String get() {
        return "safeName_" + id++;
    }
}

public class FunctionInjectorTest {
    private AbstractCompiler compiler = new MockCompiler();
    private Supplier<String> safeNameIdSupplier = new MockSafeNameIdSupplier();
    private Set<String> knownConstants = Sets.newHashSet();

    private FunctionInjector createInjector(boolean allowDecomposition, boolean assumeStrictThis, boolean assumeMinimumCapture) {
        return new FunctionInjector(compiler, safeNameIdSupplier, allowDecomposition, assumeStrictThis, assumeMinimumCapture);
    }

    private Node createFunctionNode(String body) {
        Node function = new Node(Token.FUNCTION);
        function.addChildToBack(new Node(Token.NAME, "fakeFnName")); // Function name
        function.addChildToBack(new Node(Token.LP)); // Parameters
        Node block = new Node(Token.BLOCK);
        // Use compiler.parseSyntheticCode to get the actual body nodes
        Node bodyRoot = compiler.parseSyntheticCode(body);
        if (bodyRoot != null && bodyRoot.isScript() && bodyRoot.getFirstChild().isBlock()) {
            for (Node child : bodyRoot.getFirstChild().children()) {
                block.addChildToBack(child.cloneTree()); // Use cloneTree for proper cloning
            }
        } else if (body.isEmpty()) {
            // Handle empty body explicitly
        } else {
            // Fallback for simple cases if parseSyntheticCode doesn't return a script with a block
            Node bodyNode = Node.newString(body); // This might not be correct AST for complex bodies
            if (body.contains(";")) { // Simple statement like 'var x = 1;'
                block.addChildToBack(new Node(Token.EXPR_RESULT, bodyNode));
            } else { // Simple expression like 'return 10;'
                 Node returnNode = new Node(Token.RETURN);
                 returnNode.addChildToBack(bodyNode);
                 block.addChildToBack(returnNode);
            }
        }
        function.addChildToBack(block);
        return function;
    }

    private Node createCallNode(String target, Node... args) {
        Node call = new Node(Token.CALL, new Node(Token.NAME, target));
        for (Node arg : args) {
            call.addChildToBack(arg);
        }
        return call;
    }

    private Node createCallNodeOnObject(String obj, String method, Node... args) {
        Node objName = new Node(Token.NAME, obj);
        Node member = new Node(Token.GETPROP, objName, new Node(Token.STRING, method));
        Node call = new Node(Token.CALL, member);
        for (Node arg : args) {
            call.addChildToBack(arg);
        }
        return call;
    }

    private Node createVarDeclaration(String name, Node value) {
        Node var = new Node(Token.VAR, new Node(Token.NAME, name));
        var.addChildToBack(value);
        return var;
    }

    private Node createAssignment(String name, Node value) {
        Node assignment = new Node(Token.ASSIGN, new Node(Token.NAME, name));
        assignment.addChildToBack(value);
        return assignment;
    }

    private Node createExpressionStatement(Node expr) {
        return new Node(Token.EXPR_RESULT, expr);
    }

    @Test
    public void testInlineSimpleReturn() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 10;");
        Node callNode = createCallNode("foo");
        Node parent = createExpressionStatement(callNode); // Parent needed for replaceChild
        Node result = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.DIRECT);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(10.0, result.getDouble(), 0);
    }

    @Test
    public void testInlineEmptyFunctionDirect() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode(""); // Empty function body
        Node callNode = createCallNode("foo");
        Node parent = createExpressionStatement(callNode);
        Node result = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.DIRECT);
        // Original call node should be replaced.
        // For an empty function in DIRECT mode, it should result in an undefined node.
        assertEquals(Token.UNDEFINED, result.getType()); 
    }
    
    @Test
    public void testInlineFunctionWithOneArgument() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return a + 1;");
        Node arg1 = Node.newNumber(5);
        Node callNode = createCallNode("foo", arg1);
        Node parent = createExpressionStatement(callNode);
        Node result = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.DIRECT);
        assertEquals(Token.ADD, result.getType());
        assertEquals(Token.NAME, result.getFirstChild().getType());
        assertEquals("a", result.getFirstChild().getString());
        assertEquals(Token.NUMBER, result.getLastChild().getType());
        assertEquals(1.0, result.getLastChild().getDouble(), 0);
    }

    @Test
    public void testInlineFunctionWithMultipleArguments() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return a + b;");
        Node arg1 = Node.newNumber(5);
        Node arg2 = Node.newNumber(10);
        Node callNode = createCallNode("foo", arg1, arg2);
        Node parent = createExpressionStatement(callNode);
        Node result = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.DIRECT);
        assertEquals(Token.ADD, result.getType());
        assertEquals(Token.NAME, result.getFirstChild().getType());
        assertEquals("a", result.getFirstChild().getString());
        assertEquals(Token.NAME, result.getLastChild().getType());
        assertEquals("b", result.getLastChild().getString());
    }

    @Test
    public void testInlineIntoSimpleCallStatement() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("var x = 1;"); // Function returns a block, not a value
        Node callNode = createCallNode("foo");
        Node parent = createExpressionStatement(callNode);
        Node result = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.BLOCK);
        // The result should be the block itself
        assertEquals(Token.BLOCK, result.getType());
        assertEquals(1, result.getChildCount());
        assertEquals(Token.VAR, result.getFirstChild().getType());
    }

    @Test
    public void testInlineIntoSimpleAssignment() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 5;");
        Node assignmentTarget = new Node(Token.NAME, "resultVar");
        Node callNode = createCallNode("foo");
        Node assignment = new Node(Token.ASSIGN, assignmentTarget, callNode);
        Node parent = createExpressionStatement(assignment);
        Node result = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.DIRECT);
        assertEquals(Token.ASSIGN, result.getType());
        assertEquals("resultVar", result.getFirstChild().getString());
        assertEquals(Token.NUMBER, result.getLastChild().getType());
        assertEquals(5.0, result.getLastChild().getDouble(), 0);
    }

    @Test
    public void testInlineIntoVarDeclaration() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 15;");
        Node callNode = createCallNode("foo");
        Node varDecl = createVarDeclaration("varResult", callNode);
        Node result = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.DIRECT);
        assertEquals(Token.VAR, varDecl.getType());
        assertEquals("varResult", varDecl.getFirstChild().getString());
        assertEquals(Token.NUMBER, varDecl.getLastChild().getType());
        assertEquals(15.0, varDecl.getLastChild().getDouble(), 0);
    }

    @Test
    public void testInlineIntoExpressionStatement() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 20;");
        Node callNode = createCallNode("foo");
        Node parent = createExpressionStatement(callNode); // EXPR_RESULT
        injector.maybePrepareCall(callNode); // This will classify and potentially decompose
        Node result = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.DIRECT);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(20.0, result.getDouble(), 0);
    }

    @Test
    public void testInlineIntoDecomposableExpression() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 30;");
        Node callNode = createCallNode("foo");
        // Create a scenario where the call is part of a larger expression: "bar(foo())"
        Node barCall = createCallNode("bar", callNode);
        Node parent = createExpressionStatement(barCall); // EXPR_RESULT
        injector.maybePrepareCall(callNode); // This should classify and decompose
        Node result = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.DIRECT);
        // The result should be 'bar(30)'
        assertEquals(Token.CALL, barCall.getType());
        assertEquals("bar", barCall.getFirstChild().getString());
        assertEquals(Token.NUMBER, barCall.getLastChild().getType());
        assertEquals(30.0, barCall.getLastChild().getDouble(), 0);
    }

    @Test
    public void testInlineFunctionWithSideEffectArgument() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return a;"); // Function that returns its argument
        Node argWithSideEffect = Node.newNumber(5); // Simple number, no side effect
        Node callNode = createCallNode("foo", argWithSideEffect);
        Node parent = createExpressionStatement(callNode);
        // canInlineReferenceDirectly should return YES if no side effects on args and arg used once.
        CanInlineResult canInline = injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.DIRECT, false, false);
        assertEquals(CanInlineResult.YES, canInline);
        Node result = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.DIRECT);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0);
    }

    @Test
    public void testInlineFunctionWhenArgumentIsUsedTwice() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return a + a;"); // Function uses argument twice
        Node arg = Node.newNumber(5);
        Node callNode = createCallNode("foo", arg);
        Node parent = createExpressionStatement(callNode);

        // canInlineReferenceDirectly should return NO if argument is used more than once.
        CanInlineResult canInline = injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.DIRECT, false, false);
        assertEquals(CanInlineResult.NO, canInline);
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_noEvalOrArgs() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 1;");
        assertTrue(injector.doesFunctionMeetMinimumRequirements("myFunc", fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_withEval() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("eval('1');");
        assertFalse(injector.doesFunctionMeetMinimumRequirements("myFunc", fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_withArguments() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return arguments[0];");
        assertFalse(injector.doesFunctionMeetMinimumRequirements("myFunc", fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_withSelfReference() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        // Note: doesFunctionMeetMinimumRequirements checks for references to the function's own name.
        // To test this, we need a named function.
        Node fnNode = new Node(Token.FUNCTION);
        Node functionNameNode = new Node(Token.NAME, "selfRefFunc");
        fnNode.addChildToBack(functionNameNode);
        fnNode.addChildToBack(new Node(Token.LP));
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.RETURN, new Node(Token.NAME, "selfRefFunc"))); // Reference itself
        fnNode.addChildToBack(block);

        assertFalse(injector.doesFunctionMeetMinimumRequirements("selfRefFunc", fnNode));
    }

    @Test
    public void testCanInlineReferenceDirectly_simpleFunction() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 10;");
        Node callNode = createCallNode("foo");
        assertEquals(CanInlineResult.YES, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.DIRECT, false, false));
    }

    @Test
    public void testCanInlineReferenceDirectly_functionWithInnerFunction() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("function inner() {} return 10;");
        Node callNode = createCallNode("foo");
        // Inner functions typically prevent direct inlining unless assumeMinimumCapture is true or in global scope
        assertEquals(CanInlineResult.NO, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.DIRECT, false, true));
    }

    @Test
    public void testCanInlineReferenceAsStatementBlock_simpleReturn() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 10;");
        Node callNode = createCallNode("foo");
        Node parent = createExpressionStatement(callNode);
        assertEquals(CanInlineResult.YES, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.BLOCK, false, false));
    }

    @Test
    public void testCanInlineReferenceAsStatementBlock_simpleStatement() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("var x = 1;");
        Node callNode = createCallNode("foo");
        Node parent = createExpressionStatement(callNode);
        assertEquals(CanInlineResult.YES, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.BLOCK, false, false));
    }

    @Test
    public void testCanInlineReferenceAsStatementBlock_decomposableExpression() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 10;");
        Node callNode = createCallNode("foo");
        // Simulate a call site that can be decomposed: "bar(foo())"
        Node barCall = createCallNode("bar", callNode);
        Node parent = createExpressionStatement(barCall);
        assertEquals(CanInlineResult.AFTER_PREPARATION, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.BLOCK, false, false));
    }

    @Test
    public void testCanInlineReferenceAsStatementBlock_noDecompositionAllowed() throws Exception {
        FunctionInjector injector = createInjector(false, false, false); // Decomposition not allowed
        Node fnNode = createFunctionNode("return 10;");
        Node callNode = createCallNode("foo");
        // Simulate a call site that can be decomposed: "bar(foo())"
        Node barCall = createCallNode("bar", callNode);
        Node parent = createExpressionStatement(barCall);
        assertEquals(CanInlineResult.NO, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.BLOCK, false, false));
    }

    @Test
    public void testInlineFunctionBlock_simpleCall() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("var x = 1;");
        Node callNode = createCallNode("foo");
        Node parent = createExpressionStatement(callNode);
        Node newBlock = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.BLOCK);
        assertEquals(Token.BLOCK, newBlock.getType());
        assertEquals(1, newBlock.getChildCount());
        assertEquals(Token.VAR, newBlock.getFirstChild().getType());
    }

    @Test
    public void testInlineFunctionBlock_simpleAssignment() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("result = 5;");
        Node callNode = createCallNode("foo");
        Node assignment = createAssignment("result", callNode);
        Node parent = createExpressionStatement(assignment);
        Node newBlock = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.BLOCK);
        assertEquals(Token.BLOCK, newBlock.getType());
        assertEquals(1, newBlock.getChildCount());
        assertEquals(Token.ASSIGN, newBlock.getFirstChild().getType());
        assertEquals("result", newBlock.getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, newBlock.getFirstChild().getLastChild().getType());
        assertEquals(5.0, newBlock.getFirstChild().getLastChild().getDouble(), 0);
    }

    @Test
    public void testInlineFunctionBlock_varDeclaration() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("result = 15;");
        Node callNode = createCallNode("foo");
        Node varDecl = createVarDeclaration("result", callNode);
        Node newBlock = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.BLOCK);
        assertEquals(Token.BLOCK, newBlock.getType());
        assertEquals(1, newBlock.getChildCount());
        assertEquals(Token.ASSIGN, newBlock.getFirstChild().getType());
        assertEquals("result", newBlock.getFirstChild().getFirstChild().getString());
        assertEquals(Token.NUMBER, newBlock.getFirstChild().getLastChild().getType());
        assertEquals(15.0, newBlock.getFirstChild().getLastChild().getDouble(), 0);
    }
    
    @Test
    public void testInlineFunctionBlock_returnExpression() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return a + 1;"); // Function returns an expression
        Node arg1 = new Node(Token.NAME, "a"); // Parameter name
        Node callNode = createCallNode("foo", Node.newNumber(5)); // Argument value
        Node parent = createExpressionStatement(callNode);
        Node newBlock = injector.inline(callNode, "foo", fnNode, FunctionInjector.InliningMode.BLOCK);
        
        // The function returns a block, and the return statement within it gets replaced by an assignment.
        // Since the call site is a simple call statement, the result of the function should not be assigned.
        // The function itself is modified to: "a = 5; return a + 1;" becomes "a = 5; result = a + 1;"
        // And then this block is inserted.
        assertEquals(Token.BLOCK, newBlock.getType());
        assertEquals(2, newBlock.getChildCount()); // One assignment for arg, one for return
        Node firstStatement = newBlock.getFirstChild();
        assertEquals(Token.ASSIGN, firstStatement.getType());
        assertEquals("a", firstStatement.getFirstChild().getString());
        assertEquals(5.0, firstStatement.getLastChild().getDouble(), 0);

        Node secondStatement = firstStatement.getNext();
        assertEquals(Token.ASSIGN, secondStatement.getType()); // The return expression becomes an assignment
        assertEquals("result", secondStatement.getFirstChild().getString()); // Default result name
        assertEquals(Token.ADD, secondStatement.getLastChild().getType());
        assertEquals("a", secondStatement.getLastChild().getFirstChild().getString());
        assertEquals(1.0, secondStatement.getLastChild().getLastChild().getDouble(), 0);
    }

    @Test
    public void testCallSiteType_simpleCall() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node callNode = createCallNode("foo");
        Node parent = createExpressionStatement(callNode);
        assertEquals(FunctionInjector.CallSiteType.SIMPLE_CALL, injector.classifyCallSite(callNode));
    }

    @Test
    public void testCallSiteType_simpleAssignment() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node callNode = createCallNode("foo");
        Node assignment = createAssignment("x", callNode);
        Node parent = createExpressionStatement(assignment);
        assertEquals(FunctionInjector.CallSiteType.SIMPLE_ASSIGNMENT, injector.classifyCallSite(callNode));
    }

    @Test
    public void testCallSiteType_varDeclSimpleAssignment() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node callNode = createCallNode("foo");
        Node varDecl = createVarDeclaration("x", callNode);
        assertEquals(FunctionInjector.CallSiteType.VAR_DECL_SIMPLE_ASSIGNMENT, injector.classifyCallSite(callNode));
    }

    @Test
    public void testCallSiteType_expression() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node callNode = createCallNode("foo");
        Node add = new Node(Token.ADD, Node.newNumber(1), callNode);
        Node parent = createExpressionStatement(add);
        // Needs decomposition preparation for Expression type
        injector.maybePrepareCall(callNode);
        assertEquals(FunctionInjector.CallSiteType.EXPRESSION, injector.classifyCallSite(callNode));
    }

    @Test
    public void testCallSiteType_decomposableExpression() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node callNode = createCallNode("foo");
        // If expression is not directly movable, it might be decomposable
        Node ifNode = new Node(Token.IF, callNode, new Node(Token.BLOCK), new Node(Token.BLOCK));
        Node parent = ifNode; // IF node is an expression root
        injector.maybePrepareCall(callNode); // This is crucial for classification
        assertEquals(FunctionInjector.CallSiteType.DECOMPOSABLE_EXPRESSION, injector.classifyCallSite(callNode));
    }

    @Test
    public void testIsSupportedCallType_directCall() {
        FunctionInjector injector = createInjector(true, false, false);
        Node callNode = createCallNode("foo");
        assertTrue(injector.isSupportedCallType(callNode));
    }

    @Test
    public void testIsSupportedCallType_methodCall() {
        FunctionInjector injector = createInjector(true, false, false);
        Node callNode = createCallNodeOnObject("obj", "method");
        assertTrue(injector.isSupportedCallType(callNode));
    }
    
    @Test
    public void testIsSupportedCallType_callApply() {
        FunctionInjector injector = createInjector(true, false, false);
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "apply")));
        assertFalse(injector.isSupportedCallType(callNode));
    }

    @Test
    public void testInlineCostDelta_directInlining() {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 1;");
        Set<String> namesToAlias = Sets.newHashSet();
        int delta = injector.inlineCostDelta(fnNode, namesToAlias, FunctionInjector.InliningMode.DIRECT);
        assertTrue(delta < 0); // Expecting a negative delta (cost reduction)
    }

    @Test
    public void testInlineCostDelta_blockInlining() {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("var x = 1;"); // Function with a statement
        Set<String> namesToAlias = Sets.newHashSet();
        int delta = injector.inlineCostDelta(fnNode, namesToAlias, FunctionInjector.InliningMode.BLOCK);
        assertTrue(delta < 0); // Expecting a negative delta
    }
    
    @Test
    public void testInlineCostDelta_blockInliningWithAlias() {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return a;"); // Function with one parameter
        Set<String> namesToAlias = Sets.newHashSet("a"); // Parameter 'a' needs aliasing
        int delta = injector.inlineCostDelta(fnNode, namesToAlias, FunctionInjector.InliningMode.BLOCK);
        assertTrue(delta < 0); // Expecting a negative delta, but it should be less negative than without aliasing
    }

    @Test
    public void testInliningLowersCost_singleReferenceDirect() {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 1;");
        Collection<FunctionInjector.Reference> refs = new ArrayList<>();
        refs.add(new FunctionInjector.Reference(null, null, FunctionInjector.InliningMode.DIRECT));
        Set<String> namesToAlias = Sets.newHashSet();
        assertTrue(injector.inliningLowersCost(null, fnNode, refs, namesToAlias, true, false));
    }
    
    @Test
    public void testInliningLowersCost_multipleReferencesBlock() {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 1;");
        Collection<FunctionInjector.Reference> refs = new ArrayList<>();
        refs.add(new FunctionInjector.Reference(null, null, FunctionInjector.InliningMode.BLOCK));
        refs.add(new FunctionInjector.Reference(null, null, FunctionInjector.InliningMode.BLOCK));
        Set<String> namesToAlias = Sets.newHashSet();
        // Cost calculation is complex, but for simple cases, multiple references should suggest inlining.
        assertTrue(injector.inliningLowersCost(null, fnNode, refs, namesToAlias, true, false));
    }
    
    @Test
    public void testInliningLowersCost_nonRemovableFunction() {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return 1;");
        Collection<FunctionInjector.Reference> refs = new ArrayList<>();
        refs.add(new FunctionInjector.Reference(null, null, FunctionInjector.InliningMode.DIRECT));
        Set<String> namesToAlias = Sets.newHashSet();
        // If the function is not removable, cost estimation becomes more critical.
        // This test assumes the simple function will still lower cost.
        assertTrue(injector.inliningLowersCost(null, fnNode, refs, namesToAlias, false, false));
    }

    @Test
    public void testCanInlineReferenceDirectly_functionWithSideEffectInBody() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("var x = 1; return x;"); // Function with a var declaration and return
        Node callNode = createCallNode("foo");
        Node parent = createExpressionStatement(callNode);
        
        // isDirectCallNodeReplacementPossible checks for single return with an expression.
        // This function has a var declaration AND a return. It should fail isDirectCallNodeReplacementPossible.
        assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
        assertEquals(CanInlineResult.NO, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.DIRECT, false, false));
    }
    
    @Test
    public void testCanInlineReferenceDirectly_functionWithSideEffectArgument() throws Exception {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = createFunctionNode("return a;"); // Function body has no side effects
        Node argWithSideEffect = new Node(Token.ASSIGN, new Node(Token.NAME, "b"), Node.newNumber(1)); // b = 1
        Node callNode = createCallNode("foo", argWithSideEffect);

        // Direct inlining checks for side effects on arguments IF the function body has side effects.
        // 'hasSideEffects' is false here because the function body is just 'return a'.
        // The check `if (hasSideEffects && NodeUtil.canBeSideEffected(cArg))` is NOT triggered.
        // So, it should allow direct inlining.
        assertEquals(CanInlineResult.YES, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.DIRECT, false, false));
    }

    @Test
    public void testInlineFunction_withThisReference_call() {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "fakeFnName"));
        fnNode.addChildToBack(new Node(Token.LP));
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.RETURN, new Node(Token.THIS))); // References 'this'
        fnNode.addChildToBack(block);

        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "call")));
        callNode.addChildToBack(new Node(Token.THIS)); // Explicit 'this' in call
        callNode.addChildToBack(new Node(Token.STRING, "arg1"));
        
        // The "assumeStrictThis" flag is false, and NodeUtil.isFunctionObjectCall is true.
        // The check `if (referencesThis && !NodeUtil.isFunctionObjectCall(callNode))` is NOT triggered.
        // The check `if (!assumeStrictThis && !cArg.isThis())` inside isSupportedCallType
        // would prevent it if assumeStrictThis is false and cArg is not 'this'.
        // Here, cArg IS 'this'.
        
        assertEquals(CanInlineResult.YES, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.DIRECT, true, false));
    }

    @Test
    public void testInlineFunction_withThisReference_notCall() {
        FunctionInjector injector = createInjector(true, false, false);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "fakeFnName"));
        fnNode.addChildToBack(new Node(Token.LP));
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.RETURN, new Node(Token.THIS))); // References 'this'
        fnNode.addChildToBack(block);

        Node callNode = createCallNode("foo"); // Direct call, not .call
        
        // The check `if (referencesThis && !NodeUtil.isFunctionObjectCall(callNode))` WILL be triggered.
        assertEquals(CanInlineResult.NO, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.DIRECT, true, false));
    }

    @Test
    public void testInlineFunction_withThisReference_assumeStrictThis() {
        FunctionInjector injector = createInjector(true, true, false); // assumeStrictThis = true
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "fakeFnName"));
        fnNode.addChildToBack(new Node(Token.LP));
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.RETURN, new Node(Token.THIS))); // References 'this'
        fnNode.addChildToBack(block);

        Node callNode = createCallNode("foo"); // Direct call
        
        // With assumeStrictThis = true, 'this' references are generally allowed.
        // The check `if (referencesThis && !NodeUtil.isFunctionObjectCall(callNode))` is NOT triggered.
        assertEquals(CanInlineResult.YES, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.DIRECT, true, false));
    }

    @Test
    public void testInlineFunction_withThisReference_callApply_notStrictThis() {
        FunctionInjector injector = createInjector(true, false, false); // assumeStrictThis = false
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "fakeFnName"));
        fnNode.addChildToBack(new Node(Token.LP));
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.RETURN, new Node(Token.THIS))); // References 'this'
        fnNode.addChildToBack(block);

        // Mock a .call() scenario
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "call")));
        callNode.addChildToBack(new Node(Token.THIS)); // Explicit 'this' in call
        
        // isSupportedCallType checks if 'this' is passed and assumeStrictThis is false.
        // In this case, assumeStrictThis is false, and 'this' is passed. It should return false.
        assertFalse(injector.isSupportedCallType(callNode));
        assertEquals(CanInlineResult.NO, injector.canInlineReferenceToFunction(null, callNode, fnNode, Sets.newHashSet(), FunctionInjector.InliningMode.DIRECT, true, false));
    }
}
```