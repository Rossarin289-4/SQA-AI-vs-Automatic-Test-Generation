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


















    @Override
    public JSModuleGraph getModuleGraph() {
        return new JSModuleGraph(new ArrayList<>()); // Mock implementation with empty list
    }


    // Implement abstract methods from AbstractCompiler
    @Override
    public Node parseSyntheticCode(String code) {
        // Basic parsing for test purposes
        return new Node(Token.SCRIPT, new Node(Token.BLOCK));
    }





    
    // Mock implementation for getOldParseTreeByName
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






    private Node createExpressionStatement(Node expr) {
        return new Node(Token.EXPR_RESULT, expr);
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





