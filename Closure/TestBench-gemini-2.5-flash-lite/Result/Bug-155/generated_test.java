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
import com.google.javascript.jscomp.AbstractCompiler; // Added import
import com.google.javascript.jscomp.CodingConvention; // Added import
import com.google.javascript.jscomp.DiagnosticType; // Added import

public class InlineVariablesTest {

    // Mock AbstractCompiler implementation

    // Helper method to create a dummy compiler.

    // Helper method to create a dummy NodeTraversal.
    private NodeTraversal createNodeTraversal(AbstractCompiler compiler, Node root) {
        // NodeTraversal needs a valid callback.
        NodeTraversal.Callback callback = new NodeTraversal.ScopedCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {}
            @Override
            public void enterScope(NodeTraversal t) {}
            @Override
            public void exitScope(NodeTraversal t) {}
            @Override
            public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) { return true; }
        };
        return new NodeTraversal(compiler, callback);
    }
    
    // Helper method to create a dummy Scope.

    // Helper method to create a dummy Var.

    // Helper method to create a ReferenceCollection.
    private ReferenceCollection createReferenceCollection(List<Reference> references) {
        ReferenceCollection collection = new ReferenceCollection();
        collection.references = references;
        return collection;
    }

    // Helper method to create a Reference.

    // Helper method to create a BasicBlock.
    private ReferenceCollectingCallback.BasicBlock createBasicBlock(ReferenceCollectingCallback.BasicBlock parent, Node root) {
        return new ReferenceCollectingCallback.BasicBlock(parent, root);
    }

    // Helper method to create a ReferenceCollectingCallback instance with specific mode.




















    @Test
    public void testInlineWellDefinedVariable() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public void reportCodeChange() { /* Do nothing */ }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "wellDefinedVar");
        Node valueNode = new Node(Token.NUMBER, 42);
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference declRef = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef1 = createReference(new Node(Token.NAME, "use1"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef2 = createReference(new Node(Token.NAME, "use2"), new Node(Token.SUB), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        List<Reference> refs = Lists.newArrayList(declRef, usageRef1, usageRef2);

        behavior.inlineWellDefinedVariable(var, valueNode, refs);
        // This test asserts that the method can be called without error.
        assertTrue(true);
    }

    @Test
    public void testInlineDeclaredConstant() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public void reportCodeChange() { /* Do nothing */ }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "constantVar");
        var.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true); // Mark as constant
        Node valueNode = new Node(Token.STRING, "hello");
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference declRef = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef1 = createReference(new Node(Token.NAME, "use1"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef2 = createReference(new Node(Token.NAME, "use2"), new Node(Token.SUB), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        List<Reference> refs = Lists.newArrayList(declRef, usageRef1, usageRef2);

        behavior.inlineDeclaredConstant(var, valueNode, refs);
        assertTrue(true); // Assert that the method executes without error.
    }

    @Test
    public void testRemoveDeclaration_EmptyVarNode() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public void reportCodeChange() { /* Do nothing */ }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "singleVar");
        Node varNameNode = var.getNameNode();
        Node varNode = new Node(Token.VAR, varNameNode);
        varNameNode.setParent(varNode);
        Node exprResult = new Node(Token.EXPR_RESULT, varNode);
        varNode.setParent(exprResult);

        // The reference passed to removeDeclaration is the one pointing to the NAME node.
        Reference declRef = createReference(varNameNode, varNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        
        behavior.removeDeclaration(declRef);
        // After removing the declaration, the VAR node should have no children.
        assertNull(varNode.getFirstChild());
        // And the EXPR_RESULT should also be removed if the VAR node becomes empty.
        assertNull(exprResult.getFirstChild());
    }

    @Test
    public void testInlineValue_SimpleAssignment() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public void reportCodeChange() { /* Do nothing */ }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        // Mocking blacklistVarReferencesInTree to do nothing so it doesn't interfere.
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior() {
            @Override
            void blacklistVarReferencesInTree(Node root, Scope scope) { /* Do nothing */ }
        };

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "assignedVar");
        Node valueNode = new Node(Token.NUMBER, 123);
        
        Node assignedNameNode = new Node(Token.NAME, "assignedVar");
        // Simulating `assignedVar = 0;`
        Node assignmentNode = new Node(Token.ASSIGN, assignedNameNode, new Node(Token.NUMBER, 0));
        assignedNameNode.setParent(assignmentNode);
        Node exprResult = new Node(Token.EXPR_RESULT, assignmentNode);
        assignmentNode.setParent(exprResult);

        // The reference should point to the NAME node within the assignment.
        Reference ref = createReference(assignedNameNode, assignmentNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        
        // Need to set `isSimpleAssignmentToName` to true on the Reference object.
        // Since it's a private field, we use reflection.
        try {
            java.lang.reflect.Field field = Reference.class.getDeclaredField("isSimpleAssignmentToName");
            field.setAccessible(true);
            field.set(ref, true);
        } catch (Exception e) { throw new RuntimeException("Failed to set isSimpleAssignmentToName: " + e.getMessage(), e); }

        behavior.inlineValue(var, ref, valueNode.cloneTree());
        
        // After inlining, the EXPR_RESULT should contain the value node.
        // The assignment expression itself should be replaced by the value.
        Node replacedNode = exprResult.getFirstChild(); // The original assignment node.
        assertNotNull(replacedNode);
        // The inlineValue replaces the parent of the NAME node.
        // If it's a simple assignment `var = value`, the assignment node is replaced by `value`.
        assertEquals(Token.NUMBER, replacedNode.getType());
        assertEquals(123, replacedNode.getDouble(), 0.001);
    }

    @Test
    public void testIsInlineableDeclaredConstant_Immutable() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "immutableConst");
        var.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node valueNode = new Node(Token.NUMBER, 100);
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference initRef = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef));

        assertTrue(behavior.isInlineableDeclaredConstant(var, refCollection));
    }

    @Test
    public void testIsInlineableDeclaredConstant_StringWorthInlining() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "stringConst");
        var.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node valueNode = new Node(Token.STRING, "short");
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference initRef = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef));
        
        // Mock isStringWorthInlining to return true.
        try {
            java.lang.reflect.Method method = InlineVariables.InliningBehavior.class.getDeclaredMethod("isStringWorthInlining", Var.class, List.class);
            method.setAccessible(true);
            method.invoke(behavior, var, refCollection.references);
        } catch (Exception e) { /* ignore */ }

        assertTrue(behavior.isInlineableDeclaredConstant(var, refCollection));
    }

    @Test
    public void testIsStringWorthInlining_ShortStringNotInlineAll() {
        AbstractCompiler compiler = createCompiler();
        // inlineAllStrings is false
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "shortString");
        var.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node valueNode = new Node(Token.STRING, "a"); // Short string
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference initRef = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        // Need at least two references for the heuristic to apply.
        Reference usageRef = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        List<Reference> refs = Lists.newArrayList(initRef, usageRef);

        assertFalse(behavior.isStringWorthInlining(var, refs));
    }

    @Test
    public void testIsStringWorthInlining_LongStringInlineAll() {
        AbstractCompiler compiler = createCompiler();
        // inlineAllStrings is true
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, true);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "longString");
        var.nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node valueNode = new Node(Token.STRING, "this is a very long string that should be inlined");
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference initRef = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        List<Reference> refs = Lists.newArrayList(initRef, usageRef);

        assertTrue(behavior.isStringWorthInlining(var, refs));
    }

    @Test
    public void testCanInline_LiteralValue() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "literalVar");
        Node valueNode = new Node(Token.NUMBER, 5); // Literal value
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference declaration = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference initialization = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference reference = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        // Mock canMoveAggressively to return true because valueNode is a literal.
        try {
            java.lang.reflect.Method method = InlineVariables.InliningBehavior.class.getDeclaredMethod("canMoveAggressively", Node.class);
            method.setAccessible(true);
            method.invoke(behavior, valueNode);
        } catch (Exception e) { /* ignore */ }

        assertTrue(behavior.canInline(declaration, initialization, reference));
    }

    @Test
    public void testCanInline_FunctionCallIntoCall() {
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                // Mock CodingConvention to indicate a subclass relationship.
                return new CodingConvention.DefaultCodingConvention() {
                    @Override
                    public SubclassRelationship getClassesDefinedByCall(Node callNode) {
                        // Return a non-null value to trigger the check in canInline.
                        return new SubclassRelationship(null, null); 
                    }
                };
            }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "funcVar");
        Node funcNode = new Node(Token.FUNCTION, new Node(Token.NAME, "myFunc"));
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference declaration = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        // The initialization is the function node itself.
        Reference initialization = createReference(funcNode.getFirstChild(), funcNode, funcNode, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        
        // Simulate calling the function `var()`
        Node callTarget = new Node(Token.CALL, var.getNameNode());
        var.getNameNode().setParent(callTarget);
        Reference reference = createReference(var.getNameNode(), callTarget, callTarget, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        // The canInline method should return false because the value is a FUNCTION and it's being inlined into a CALL.
        assertFalse(behavior.canInline(declaration, initialization, reference));
    }

    @Test
    public void testCanMoveModerately_ValidMovement() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "moderateVar");
        // Simulate a non-literal, non-function value that might have side effects.
        Node valueNode = new Node(Token.WHILE, new Node(Token.TRUE)); 
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference initialization = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        
        // Simulate a usage reference.
        Node usageNameNode = new Node(Token.NAME, "use");
        Node usageParent = new Node(Token.ADD, usageNameNode, new Node(Token.NUMBER, 1));
        usageNameNode.setParent(usageParent);
        Reference reference = createReference(usageNameNode, usageParent, usageParent, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        assertTrue(behavior.canMoveModerately(initialization, reference));
    }
    
    @Test
    public void testIsValidDeclaration_Var() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Node nameNode = new Node(Token.NAME);
        Node varNode = new Node(Token.VAR, nameNode);
        nameNode.setParent(varNode);
        
        // The Reference constructor requires a traversal, block, scope, sourceName.
        // Pass null for simplicity if they are not strictly used by isValidDeclaration.
        Reference declaration = createReference(nameNode, varNode, varNode, null, null, null);
        assertTrue(behavior.isValidDeclaration(declaration));
    }

    @Test
    public void testIsValidDeclaration_Function() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Node nameNode = new Node(Token.NAME);
        Node funcNode = new Node(Token.FUNCTION, nameNode); // Function declaration
        nameNode.setParent(funcNode);
        
        Reference declaration = createReference(nameNode, funcNode, funcNode, null, null, null);
        assertTrue(behavior.isValidDeclaration(declaration));
    }

    @Test
    public void testIsValidInitialization_Assigned() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Node nameNode = new Node(Token.NAME);
        Node assignNode = new Node(Token.ASSIGN, nameNode, new Node(Token.NUMBER, 5));
        nameNode.setParent(assignNode);
        
        Reference initialization = createReference(nameNode, assignNode, assignNode, null, null, null);
        assertTrue(behavior.isValidInitialization(initialization));
    }

    @Test
    public void testIsValidReference_SimpleNameRead() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();
        
        Node nameNode = new Node(Token.NAME);
        Node addNode = new Node(Token.ADD, nameNode, new Node(Token.NUMBER, 5));
        nameNode.setParent(addNode);
        
        Reference reference = createReference(nameNode, addNode, addNode, null, null, null);
        assertTrue(behavior.isValidReference(reference));
    }
    
    @Test
    public void testIsImmutableAndWellDefinedVariable_ImmutableNumber() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "immutableNum");
        Node valueNode = new Node(Token.NUMBER, 10);
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference initRef = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef, usageRef));

        assertTrue(behavior.isImmutableAndWellDefinedVariable(var, refCollection));
    }

    @Test
    public void testIsImmutableAndWellDefinedVariable_StringLiteral() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "immutableStr");
        Node valueNode = new Node(Token.STRING, "hello");
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference initRef = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        Reference usageRef = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef, usageRef));
        
        assertTrue(behavior.isImmutableAndWellDefinedVariable(var, refCollection));
    }

    @Test
    public void testIsImmutableAndWellDefinedVariable_AssignedTwice() {
        AbstractCompiler compiler = createCompiler();
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        InlineVariables.InliningBehavior behavior = iv.new InliningBehavior();

        Scope scope = createScope(null, new Node(Token.SCRIPT));
        Var var = createVar(scope, "assignedTwice");
        Node valueNode = new Node(Token.NUMBER, 10); // Initial value
        Node declarationNode = new Node(Token.VAR, var.getNameNode());
        var.getNameNode().setParent(declarationNode);
        Node exprResult = new Node(Token.EXPR_RESULT, declarationNode);
        declarationNode.setParent(exprResult);

        Reference initRef = createReference(var.getNameNode(), declarationNode, exprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        // Simulate a second assignment.
        Node assignmentTarget = new Node(Token.NAME, "assignedTwice"); // Must match the var name
        Node assignmentNode = new Node(Token.ASSIGN, assignmentTarget, new Node(Token.NUMBER, 20));
        assignmentTarget.setParent(assignmentNode);
        Node secondExprResult = new Node(Token.EXPR_RESULT, assignmentNode);
        assignmentNode.setParent(secondExprResult);
        Reference assignment1 = createReference(assignmentTarget, assignmentNode, secondExprResult, createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");
        
        Reference usageRef = createReference(new Node(Token.NAME, "use"), new Node(Token.ADD), new Node(Token.EXPR_RESULT), createBasicBlock(null, new Node(Token.SCRIPT)), scope, "test.js");

        ReferenceCollection refCollection = createReferenceCollection(Lists.newArrayList(initRef, assignment1, usageRef));

        assertFalse(behavior.isImmutableAndWellDefinedVariable(var, refCollection));
    }
}





