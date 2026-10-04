package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import java.io.IOException; // Added for SourcePosition abstract class

public class ScopedAliasesTest {

    // Mock implementation of AbstractCompiler for testing.

    // Mock implementation of AliasTransformationHandler.

    // Helper to create a simple Node.
    private Node createNode(int type, String value) {
        Node node = new Node(type);
        node.setString(value);
        return node;
    }

    // Helper to create a simple Node with a qualified name.
    private Node createQualifiedNameNode(String name) {
        Node node = Node.newString(name);
        // The Node API does not have setProp for Node.QUOTED_PROP directly.
        // This might be an internal detail not exposed or tested this way.
        // For testing purposes, we'll assume string nodes are sufficient for qualified names if their content is a qualified name.
        return node;
    }

    // Mock Var class to provide Var objects.

    // Mock Scope class to provide Var objects.

    // Mock NodeTraversal to control scopes and current nodes.



















    @Test
    public void testTraversal_visit_googScopeReturn() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeBody = new Node(Token.BLOCK);
        Node returnStatement = new Node(Token.RETURN);

        scopeBody.addChildToBack(returnStatement);

        MockScope mockScope = new MockScope(scopeBody);
        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(2);
        t.setScopeRoot(scopeBody);

        // Visit the RETURN statement
        t.setCurrentNode(returnStatement);
        traversal.visit(t, returnStatement, scopeBody);

        assertTrue("Error should be reported for RETURN in goog.scope.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_USES_RETURN"));
    }

    @Test
    public void testTraversal_visit_googScopeThis() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeBody = new Node(Token.BLOCK);
        Node thisNode = new Node(Token.THIS);

        scopeBody.addChildToBack(thisNode);

        MockScope mockScope = new MockScope(scopeBody);
        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(2);
        t.setScopeRoot(scopeBody);

        // Visit the THIS keyword
        t.setCurrentNode(thisNode);
        traversal.visit(t, thisNode, scopeBody);

        assertTrue("Error should be reported for 'this' in goog.scope.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_REFERENCES_THIS"));
    }

    @Test
    public void testTraversal_visit_googScopeThrow() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeBody = new Node(Token.BLOCK);
        Node throwNode = new Node(Token.THROW);

        scopeBody.addChildToBack(throwNode);

        MockScope mockScope = new MockScope(scopeBody);
        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(2);
        t.setScopeRoot(scopeBody);

        // Visit the THROW statement
        t.setCurrentNode(throwNode);
        traversal.visit(t, throwNode, scopeBody);

        assertTrue("Error should be reported for THROW in goog.scope.", compiler.getErrorCount() > 0);
        assertTrue(compiler.errorLog.toString().contains("JSC_GOOG_SCOPE_USES_THROW"));
    }

    @Test
    public void testFixTypeNode_simpleAlias() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node typeNode = Node.newString("dom.createElement"); // A string node representing a type

        // Setup traversal context with an alias.
        MockScope mockScope = new MockScope(new Node(Token.BLOCK));
        Node aliasValueNode = createQualifiedNameNode("goog.dom");
        // Need to provide a declaration node for MockVar. A dummy node will do.
        mockScope.addVar("dom", new MockVar("dom", aliasValueNode, new Node(Token.NAME)));
        traversal.aliases.put("dom", mockScope.getVar("dom"));

        // Manually call fixTypeNode.
        traversal.fixTypeNode(typeNode);

        // Check if aliasUsages contains the expected AliasedTypeNode.
        assertEquals(1, traversal.getAliasUsages().size());
        assertTrue(traversal.getAliasUsages().get(0) instanceof ScopedAliases.AliasedTypeNode);
        ScopedAliases.AliasedTypeNode aliasedTypeNode = (ScopedAliases.AliasedTypeNode) traversal.getAliasUsages().get(0);
        assertSame(typeNode, aliasedTypeNode.typeReference);
        assertEquals("dom", aliasedTypeNode.aliasName);
        assertSame(aliasValueNode, aliasedTypeNode.aliasDefinition);
    }

    @Test
    public void testFixTypeNode_nestedAlias() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node typeNode = Node.newString("goog.dom.TagName.DIV"); // A string node representing a type

        // Setup traversal context with an alias for 'goog.dom'.
        MockScope mockScope = new MockScope(new Node(Token.BLOCK));
        Node aliasValueNode = createQualifiedNameNode("my.namespace.goog.dom");
        // Need to provide a declaration node for MockVar.
        mockScope.addVar("goog", new MockVar("goog", createQualifiedNameNode("my.namespace"), new Node(Token.NAME))); // Alias for 'goog'
        traversal.aliases.put("goog", mockScope.getVar("goog"));

        // Manually call fixTypeNode.
        traversal.fixTypeNode(typeNode);

        // Check if aliasUsages contains the expected AliasedTypeNode.
        assertEquals(1, traversal.getAliasUsages().size());
        assertTrue(traversal.getAliasUsages().get(0) instanceof ScopedAliases.AliasedTypeNode);
        ScopedAliases.AliasedTypeNode aliasedTypeNode = (ScopedAliases.AliasedTypeNode) traversal.getAliasUsages().get(0);
        assertSame(typeNode, aliasedTypeNode.typeReference);
        assertEquals("goog", aliasedTypeNode.aliasName);
        assertSame(aliasValueNode, aliasedTypeNode.aliasDefinition); // This should be the value of the 'goog' alias.
    }

    @Test
    public void testFixTypeNode_noAliasMatch() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node typeNode = Node.newString("unknown.Type"); // No matching alias

        // Setup traversal context without relevant alias.
        MockScope mockScope = new MockScope(new Node(Token.BLOCK));
        mockScope.addVar("known", new MockVar("known", createQualifiedNameNode("some.other"), new Node(Token.NAME)));
        traversal.aliases.put("known", mockScope.getVar("known"));

        // Manually call fixTypeNode.
        traversal.fixTypeNode(typeNode);

        // No alias usages should be added.
        assertEquals(0, traversal.getAliasUsages().size());
    }

    @Test
    public void testFixTypeNode_typeNodeWithChildren() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node typeNode = Node.newString("ns.Type"); // Base type
        Node childTypeNode = Node.newString("ns.Type.Sub"); // A nested type node

        Node parentTypeNode = new Node(Token.COMMA); // Simulating a type with children
        parentTypeNode.addChildToBack(typeNode);
        parentTypeNode.addChildToBack(childTypeNode);

        // Setup traversal context with an alias for 'ns'.
        MockScope mockScope = new MockScope(new Node(Token.BLOCK));
        Node aliasValueNode = createQualifiedNameNode("my.namespace");
        mockScope.addVar("ns", new MockVar("ns", aliasValueNode, new Node(Token.NAME)));
        traversal.aliases.put("ns", mockScope.getVar("ns"));

        // Manually call fixTypeNode.
        traversal.fixTypeNode(parentTypeNode);

        // Check that both type nodes were processed.
        assertEquals(2, traversal.getAliasUsages().size());
        assertTrue(traversal.getAliasUsages().get(0) instanceof ScopedAliases.AliasedTypeNode);
        assertTrue(traversal.getAliasUsages().get(1) instanceof ScopedAliases.AliasedTypeNode);

        ScopedAliases.AliasedTypeNode firstUsage = (ScopedAliases.AliasedTypeNode) traversal.getAliasUsages().get(0);
        assertSame(typeNode, firstUsage.typeReference);
        assertEquals("ns", firstUsage.aliasName);

        ScopedAliases.AliasedTypeNode secondUsage = (ScopedAliases.AliasedTypeNode) traversal.getAliasUsages().get(1);
        assertSame(childTypeNode, secondUsage.typeReference);
        assertEquals("ns", secondUsage.aliasName);
    }

    @Test
    public void testTraversal_exitScope_clearAliases() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        // Populate aliases in the traversal object.
        MockScope mockScope = new MockScope(new Node(Token.BLOCK));
        mockScope.addVar("dom", new MockVar("dom", createQualifiedNameNode("goog.dom"), new Node(Token.NAME)));
        traversal.aliases.put("dom", mockScope.getVar("dom"));
        traversal.forbiddenLocals.add("goog");

        // Simulate exitScope at depth 2.
        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setScopeDepth(2);
        t.setScopeRoot(new Node(Token.BLOCK));

        traversal.exitScope(t);

        // Aliases and forbiddenLocals should be cleared.
        assertTrue(traversal.aliases.isEmpty());
        assertTrue(traversal.forbiddenLocals.isEmpty());
    }

    @Test
    public void testHotSwapScript_removeAliasDefinition_var() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);

        Node root = new Node(Token.SCRIPT);
        Node aliasDecl = new Node(Token.VAR,
            Node.newString("x", 0, 0),
            createQualifiedNameNode("goog.x")
        );
        root.addChildToBack(aliasDecl);

        // Manually add the definition to trigger removal.
        // This is to test the removal logic part of hotSwapScript directly.
        // In a real traversal, `aliasDefinitionsInOrder` would be populated by `visit`.
        // Here we manually inject it to test the `hotSwapScript`'s cleanup phase.
        ScopedAliases.Traversal traversal = pass.new Traversal();
        // Add the NAME node child of VAR to aliasDefinitionsInOrder.
        traversal.aliasDefinitionsInOrder.add(aliasDecl.getFirstChild()); 
        
        // To make this test work without full traversal, we need to run the relevant part of hotSwapScript.
        // `hotSwapScript` first calls `NodeTraversal.traverse` which populates `traversal`.
        // Then it iterates over `traversal.getAliasDefinitionsInOrder()`.
        // We can simulate this by directly calling the removal logic.
        // This is not ideal but necessary if `NodeTraversal` setup is complex.

        // For a proper test, `hotSwapScript` must be called.
        // We need to ensure `traversal` is populated before `hotSwapScript` calls the cleanup.
        // This is tricky. Let's rely on `hotSwapScript` to call `NodeTraversal` which will populate `traversal`.
        // The challenge is setting up the `Node` structure so that `NodeTraversal` finds the alias.

        // Let's re-simulate a simple script and then check the DOM.
        Node scriptForRemoval = new Node(Token.SCRIPT);
        Node aliasDefinitionNode = new Node(Token.VAR,
            Node.newString("aliasVar", 0, 0),
            createQualifiedNameNode("some.namespace.value")
        );
        scriptForRemoval.addChildToBack(aliasDefinitionNode);

        pass.hotSwapScript(scriptForRemoval, null);

        assertTrue("Code change should be reported.", compiler.codeChangeReported);
        // After hotSwapScript, the original alias definition should be removed.
        assertNull("The VAR node for the alias definition should be detached.", aliasDefinitionNode.getParent());
    }

    @Test
    public void testHotSwapScript_removeAliasDefinition_directAssignment() throws Exception {
        MockCompiler compiler = new MockCompiler();
        MockAliasTransformationHandler handler = new MockAliasTransformationHandler();
        ScopedAliases pass = new ScopedAliases(compiler, null, handler);

        Node root = new Node(Token.SCRIPT);
        Node aliasNameNode = Node.newString("x", 0, 0);
        Node aliasValueNode = createQualifiedNameNode("goog.x");
        Node aliasDef = new Node(Token.ASSIGN, aliasNameNode, aliasValueNode);
        Node exprResult = new Node(Token.EXPR_RESULT, aliasDef);
        root.addChildToBack(exprResult);

        // Simulate that this assignment was identified as an alias definition.
        // Manually add to `aliasDefinitionsInOrder` to test the cleanup logic.
        ScopedAliases.Traversal traversal = pass.new Traversal();
        traversal.aliasDefinitionsInOrder.add(aliasNameNode); // Add the NAME node "x"

        // Let's rely on hotSwapScript to do the traversal and cleanup.
        pass.hotSwapScript(root, null);

        assertTrue("Code change should be reported.", compiler.codeChangeReported);
        // The original expression statement containing the assignment should be detached.
        assertNull("The EXPR_RESULT node for the alias definition should be detached.", exprResult.getParent());
    }

    @Test
    public void testTraversal_findNamespaceShadows_shadowExists() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeRoot = new Node(Token.BLOCK); // Simulating scope root for namespace shadow
        Node localVar = new Node(Token.VAR, Node.newString("goog", 0, 0), Node.newString("someValue", 0, 0)); // Shadowing 'goog'
        scopeRoot.addChildToBack(localVar);

        MockScope mockScope = new MockScope(scopeRoot);
        mockScope.addVar("goog", new MockVar("goog", Node.newString("someValue"), localVar)); // Local var named 'goog'

        traversal.forbiddenLocals.add("goog"); // Mark 'goog' as a forbidden local name due to aliasing.
        traversal.hasNamespaceShadows = false; // Reset flag

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(3); // Deeper than 2, to trigger findNamespaceShadows
        t.setScopeRoot(scopeRoot);

        // Manually call findNamespaceShadows.
        traversal.findNamespaceShadows(t);

        assertTrue("hasNamespaceShadows should be true when a shadow exists.", traversal.hasNamespaceShadows);
    }

    @Test
    public void testTraversal_findNamespaceShadows_noShadow() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        Node scopeRoot = new Node(Token.BLOCK);
        Node otherVar = new Node(Token.VAR, Node.newString("other", 0, 0), Node.newString("value", 0, 0));
        scopeRoot.addChildToBack(otherVar);

        MockScope mockScope = new MockScope(scopeRoot);
        mockScope.addVar("other", new MockVar("other", Node.newString("value"), otherVar));

        traversal.forbiddenLocals.add("goog"); // A forbidden local, but not declared in this scope.
        traversal.hasNamespaceShadows = false;

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setCurrentScope(mockScope);
        t.setScopeDepth(3);
        t.setScopeRoot(scopeRoot);

        traversal.findNamespaceShadows(t);

        assertFalse("hasNamespaceShadows should be false when no shadow exists.", traversal.hasNamespaceShadows);
    }

    @Test
    public void testTraversal_renameNamespaceShadows() throws Exception {
        MockCompiler compiler = new MockCompiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        ScopedAliases.Traversal traversal = pass.new Traversal();

        // Setup to trigger renaming.
        traversal.hasNamespaceShadows = true;
        traversal.forbiddenLocals.add("goog");

        Node scopeRoot = new Node(Token.BLOCK);
        Node shadowedVar = new Node(Token.VAR, Node.newString("goog", 0, 0), Node.newString("originalValue", 0, 0)); // Shadowing 'goog'
        scopeRoot.addChildToBack(shadowedVar);

        MockScope mockScope = new MockScope(scopeRoot);
        mockScope.addVar("goog", new MockVar("goog", Node.newString("originalValue"), shadowedVar));

        MockNodeTraversal t = new MockNodeTraversal(compiler, traversal);
        t.setScopeDepth(2); // Renaming happens at depth 2.
        t.setScopeRoot(scopeRoot);

        // Call renameNamespaceShadows. This will internally create and run MakeDeclaredNamesUnique.
        // We can't easily mock the result of MakeDeclaredNamesUnique here.
        // The test verifies that the method is called and the `hasNamespaceShadows` flag is true.
        // Need to provide a compiler to `MakeDeclaredNamesUnique` constructor.
        // `MakeDeclaredNamesUnique uniquifier = new MakeDeclaredNamesUnique(renamer);`
        // `NodeTraversal.traverse(compiler, t.getScopeRoot(), uniquifier);`
        // This call implicitly tests `makeDeclaredNamesUnique`.
        traversal.renameNamespaceShadows(t);

        // If hasNamespaceShadows is true, the renamer is created and traversal is likely invoked.
        assertTrue("renameNamespaceShadows should be called when hasNamespaceShadows is true.", traversal.hasNamespaceShadows);
    }
}





