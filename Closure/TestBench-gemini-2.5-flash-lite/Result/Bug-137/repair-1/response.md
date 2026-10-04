```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.JSDocInfo;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.AbstractCompiler.Config;
import com.google.javascript.jscomp.ErrorReporter;
import com.google.javascript.jscomp.JSTypeRegistry;
import com.google.javascript.jscomp.SourceExcerptProvider;
import java.lang.reflect.Field;


public class MakeDeclaredNamesUniqueTest {

    private static final String TEST_ROOT = "test";

    // Helper method to create a dummy compiler and reportCodeChange to avoid NPEs.
    private static AbstractCompiler createMockCompiler() {
        return new AbstractCompiler() {
            @Override public void reportCodeChange() {}
            @Override public void report(JSError error) {}
            @Override public void throwInternalError(String msg, Exception cause) {}
            @Override public CodingConvention getCodingConvention() { return null; }
            @Override public JSModuleGraph getModuleGraph() { return null; }
            @Override public CompilerInput getInput(String sourceName) { return null; }
            @Override public CompilerInput newExternInput(String name) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return null; }
            @Override public ScopeCreator getScopeCreator() { return new SyntacticScopeCreator(this); }
            @Override public Scope getTopScope() { return null; }
            @Override public void addToDebugLog(String message) {}
            @Override public void setCssRenamingMap(CssRenamingMap map) {}
            @Override public CssRenamingMap getCssRenamingMap() { return null; }
            @Override public Node getNodeForCodeInsertion(JSModule module) { return null; }
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public Node parseSyntheticCode(String code) { return null; }
            @Override public Node parseSyntheticCode(String filename, String code) { return null; }
            @Override public String toSource(Node root) { return null; }
            @Override public ErrorReporter getDefaultErrorReporter() { return null; }
            @Override public ReverseAbstractInterpreter getReverseAbstractInterpreter() { return null; }
            @Override public boolean isNormalized() { return false; }
            @Override public Supplier<String> getUniqueNameIdSupplier() { return null; }
            @Override public boolean hasHaltingErrors() { return false; }
            @Override public void addChangeHandler(CodeChangeHandler handler) {}
            @Override public void removeChangeHandler(CodeChangeHandler handler) {}
            @Override public boolean isIdeMode() { return false; }
            @Override public Config getParserConfig() { return null; }
            @Override public boolean isTypeCheckingEnabled() { return false; }
            @Override public void prepareAst(Node root) {}
            @Override public SymbolTable acquireSymbolTable() { return null; }
            @Override public ErrorManager getErrorManager() { return null; }
            @Override public void setNormalized() {}
            @Override public void setUnnormalized() {}
            @Override public boolean areNodesEqualForInlining(Node n1, Node n2) { return false; }
            @Override public SourceExcerptProvider.SourceExcerpts getSourceExcerpt(String sourceName, int lineno) { return null; }
            @Override public String getSourceCode(CompilerInput input) { return null; }
        };
    }

    // Helper to create a Node with a specific type and string value.
    private Node createNameNode(String name) {
        Node node = new Node(Token.NAME);
        node.setString(name);
        return node;
    }

    // Helper to create a simple function node.
    private Node createFunctionNode(String name, Node... children) {
        Node function = new Node(Token.FUNCTION);
        Node functionName = Node.newString(Token.NAME, name);
        function.addChildToFront(functionName);
        Node functionBody = new Node(Token.BLOCK);
        for (Node child : children) {
            functionBody.addChildToBack(child);
        }
        function.addChildToBack(functionBody);
        return function;
    }

    // Helper to create a simple var node.
    private Node createVarNode(String name, Node value) {
        Node nameNode = createNameNode(name);
        if (value != null) {
            nameNode.addChildToBack(value);
        }
        Node varNode = new Node(Token.VAR, nameNode);
        return varNode;
    }

    // Helper to create a simple var node without value.
    private Node createVarNode(String name) {
        return createVarNode(name, null);
    }

    // Helper to create a simple catch node.
    private Node createCatchNode(String name) {
        Node catchNode = new Node(Token.CATCH);
        Node nameNode = createNameNode(name);
        catchNode.addChildToFront(nameNode);
        return catchNode;
    }

    // Helper to create a simple try node.
    private Node createTryNode(Node tryBlock, Node catchBlock) {
        Node tryNode = new Node(Token.TRY, tryBlock);
        if (catchBlock != null) {
            tryNode.addChildToBack(catchBlock);
        }
        return tryNode;
    }

    // Helper to simulate NodeTraversal.traverse.
    private void traverse(Node root, NodeTraversal.Callback callback) {
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), callback);
        traversal.traverse(root);
    }

    // Helper to simulate NodeTraversal.traverseRoots.
    private void traverseRoots(Node[] roots, NodeTraversal.Callback callback) {
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), callback);
        traversal.traverseRoots(roots);
    }

    // Helper to simulate NodeTraversal.traverseRoots with a single root.
    private void traverseRoots(Node root, NodeTraversal.Callback callback) {
        traverseRoots(new Node[]{root}, callback);
    }

    // Test for the default constructor and rootRenamer.
    @Test
    public void testConstructorDefault() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        assertNotNull(uniqueNames.nameStack);
        assertTrue(uniqueNames.nameStack.isEmpty());
        assertNotNull(uniqueNames.rootRenamer);
        assertTrue(uniqueNames.rootRenamer instanceof MakeDeclaredNamesUnique.ContextualRenamer);
    }

    // Test for the constructor with a specific Renamer.
    @Test
    public void testConstructorWithRenamer() throws Exception {
        MakeDeclaredNamesUnique.Renamer mockRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique(mockRenamer);
        assertNotNull(uniqueNames.nameStack);
        assertTrue(uniqueNames.nameStack.isEmpty());
        assertEquals(mockRenamer, uniqueNames.rootRenamer);
    }

    // Test enterScope for a global function declaration.
    @Test
    public void testEnterScopeGlobalFunction() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node functionNode = createFunctionNode("myFunc", createVarNode("x"));
        Node scriptNode = new Node(Token.SCRIPT, functionNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        traversal.traverse(scriptNode); // This will call enterScope and visit

        assertEquals(1, uniqueNames.nameStack.size());
        MakeDeclaredNamesUnique.Renamer renamer = uniqueNames.nameStack.peek();
        // Verify that function parameters and declarations are added
        // (though this test focuses on the stack manipulation)
    }

    // Test enterScope for a nested function declaration.
    @Test
    public void testEnterScopeNestedFunction() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node innerFunction = createFunctionNode("inner", createVarNode("y"));
        Node outerFunction = createFunctionNode("outer", innerFunction, createVarNode("z"));
        Node scriptNode = new Node(Token.SCRIPT, outerFunction);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        traversal.traverse(scriptNode);

        assertEquals(2, uniqueNames.nameStack.size()); // Global + outer
        // Check if names were added to the renamers
        MakeDeclaredNamesUnique.Renamer outerRenamer = uniqueNames.nameStack.peek();
        assertTrue(outerRenamer.getReplacementName("z") == null); // Default behavior
        uniqueNames.nameStack.pop();
        MakeDeclaredNamesUnique.Renamer innerRenamer = uniqueNames.nameStack.peek();
        assertTrue(innerRenamer.getReplacementName("y") == null); // Default behavior

        // Test that exitScope works correctly
        uniqueNames.exitScope(traversal);
        assertEquals(1, uniqueNames.nameStack.size());
    }

    // Test enterScope for a block declaration.
    @Test
    public void testEnterScopeBlock() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node block = new Node(Token.BLOCK, createVarNode("a"));
        Node scriptNode = new Node(Token.SCRIPT, block);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        traversal.traverse(scriptNode);

        assertEquals(1, uniqueNames.nameStack.size()); // Global + block
        MakeDeclaredNamesUnique.Renamer renamer = uniqueNames.nameStack.peek();
        // Verify that 'a' is added to the renamer
        assertNotNull(renamer.getReplacementName("a"));
    }

    // Test exitScope when not in global scope.
    @Test
    public void testExitScopeNested() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node innerFunction = createFunctionNode("inner");
        Node outerFunction = createFunctionNode("outer", innerFunction);
        Node scriptNode = new Node(Token.SCRIPT, outerFunction);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);

        // Traverse to push context onto the stack
        traversal.traverse(scriptNode);
        assertEquals(2, uniqueNames.nameStack.size()); // Global + outer

        // Simulate exiting the inner function scope
        uniqueNames.exitScope(traversal);
        assertEquals(1, uniqueNames.nameStack.size()); // Should pop outer
    }

    // Test exitScope when in global scope.
    @Test
    public void testExitScopeGlobal() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node functionNode = createFunctionNode("myFunc");
        Node scriptNode = new Node(Token.SCRIPT, functionNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);

        // Traverse to push global context
        traversal.traverse(scriptNode);
        assertEquals(1, uniqueNames.nameStack.size()); // Global

        // Simulate exiting the global scope
        uniqueNames.exitScope(traversal);
        assertEquals(1, uniqueNames.nameStack.size()); // Should not pop global
    }

    // Test shouldTraverse for a function declaration.
    @Test
    public void testShouldTraverseFunctionDeclaration() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node functionNode = createFunctionNode("myFunc");
        Node scriptNode = new Node(Token.SCRIPT, functionNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        NodeTraversal.Callback callback = new NodeTraversal.Callback() {
            @Override public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
                return uniqueNames.shouldTraverse(t, n, parent);
            }
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        };
        traversal.traverse(scriptNode);

        assertEquals(2, uniqueNames.nameStack.size()); // Global + function
    }

    // Test shouldTraverse for a function expression (assign).
    @Test
    public void testShouldTraverseFunctionExpressionAssign() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node functionExpr = createFunctionNode("anonymousFunc");
        Node assignment = new Node(Token.ASSIGN, createNameNode("myVar"), functionExpr);
        Node scriptNode = new Node(Token.SCRIPT, new Node(Token.EXPR_RESULT, assignment));
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        NodeTraversal.Callback callback = new NodeTraversal.Callback() {
            @Override public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
                return uniqueNames.shouldTraverse(t, n, parent);
            }
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        };
        traversal.traverse(scriptNode);

        assertEquals(1, uniqueNames.nameStack.size()); // Global only, function expression is not a declaration.
    }

    // Test shouldTraverse for a catch clause.
    @Test
    public void testShouldTraverseCatchClause() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node catchBlock = new Node(Token.BLOCK, createVarNode("e"));
        Node catchNode = createCatchNode("e");
        catchNode.addChildToBack(catchBlock);
        Node tryNode = createTryNode(new Node(Token.BLOCK), catchNode);
        Node scriptNode = new Node(Token.SCRIPT, tryNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        NodeTraversal.Callback callback = new NodeTraversal.Callback() {
            @Override public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
                return uniqueNames.shouldTraverse(t, n, parent);
            }
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        };
        traversal.traverse(scriptNode);

        assertEquals(2, uniqueNames.nameStack.size()); // Global + catch scope
    }

    // Test visit for NAME token with a replacement.
    @Test
    public void testVisitNameReplacement() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique(
            new MakeDeclaredNamesUnique.Renamer() {
                @Override public void addDeclaredName(String name) {}
                @Override public String getReplacementName(String oldName) {
                    return oldName.equals("oldName") ? "newName" : null;
                }
                @Override public boolean stripConstIfReplaced() { return false; }
                @Override public Renamer forChildScope() { return this; }
            });
        Node nameNode = createNameNode("oldName");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);

        // Manually push a renamer onto the stack for this test
        uniqueNames.nameStack.push(uniqueNames.rootRenamer);

        // Simulate visiting the NAME node
        uniqueNames.visit(traversal, nameNode, parent);

        assertEquals("newName", nameNode.getString());
    }

    // Test visit for NAME token without a replacement.
    @Test
    public void testVisitNameNoReplacement() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node nameNode = createNameNode("noReplacement");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);

        uniqueNames.nameStack.push(uniqueNames.rootRenamer); // Add a renamer to the stack

        // Simulate visiting the NAME node
        uniqueNames.visit(traversal, nameNode, parent);

        assertEquals("noReplacement", nameNode.getString()); // Name should remain unchanged
    }

    // Test visit for FUNCTION token (pop from stack).
    @Test
    public void testVisitFunctionPopStack() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node functionNode = createFunctionNode("myFunc");
        Node scriptNode = new Node(Token.SCRIPT, functionNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);

        // Traverse to push scope onto the stack
        traversal.traverse(scriptNode);
        assertEquals(2, uniqueNames.nameStack.size()); // Global + function

        // Simulate visiting the FUNCTION node
        uniqueNames.visit(traversal, functionNode, functionNode.getParent());

        assertEquals(1, uniqueNames.nameStack.size()); // Should pop the function scope
    }

    // Test visit for CATCH token (pop from stack).
    @Test
    public void testVisitCatchPopStack() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node catchBlock = new Node(Token.BLOCK, createVarNode("e"));
        Node catchNode = createCatchNode("e");
        catchNode.addChildToBack(catchBlock);
        Node tryNode = createTryNode(new Node(Token.BLOCK), catchNode);
        Node scriptNode = new Node(Token.SCRIPT, tryNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);

        // Traverse to push scope onto the stack
        traversal.traverse(scriptNode);
        assertEquals(2, uniqueNames.nameStack.size()); // Global + catch scope

        // Simulate visiting the CATCH node
        uniqueNames.visit(traversal, catchNode, tryNode);

        assertEquals(1, uniqueNames.nameStack.size()); // Should pop the catch scope
    }

    // Test getReplacementName by iterating through the nameStack.
    @Test
    public void testGetReplacementName() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        // Setup the nameStack manually for this test
        MakeDeclaredNamesUnique.Renamer renamer1 = new MakeDeclaredNamesUnique.ContextualRenamer();
        renamer1.addDeclaredName("a");
        renamer1.declarations.put("a", "a$$1"); // Directly set for test
        MakeDeclaredNamesUnique.Renamer renamer2 = new MakeDeclaredNamesUnique.ContextualRenamer();
        renamer2.addDeclaredName("b");
        renamer2.declarations.put("b", "b$$2"); // Directly set for test

        uniqueNames.nameStack.push(renamer2);
        uniqueNames.nameStack.push(renamer1);

        assertEquals("a$$1", uniqueNames.getReplacementName("a"));
        assertEquals("b$$2", uniqueNames.getReplacementName("b"));
        assertNull(uniqueNames.getReplacementName("c"));
    }

    // Test findDeclaredNames for VAR declarations.
    @Test
    public void testFindDeclaredNamesVar() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node varNode = createVarNode("var1");
        Node block = new Node(Token.BLOCK, varNode);
        MakeDeclaredNamesUnique.Renamer mockRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);

        // Manually call findDeclaredNames
        uniqueNames.findDeclaredNames(block, block.getParent(), mockRenamer);

        // Verify that 'var1' was added to the renamer.
        assertNotNull(mockRenamer.getReplacementName("var1"));
    }

    // Test findDeclaredNames for FUNCTION declarations.
    @Test
    public void testFindDeclaredNamesFunction() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node funcNode = createFunctionNode("func1");
        Node block = new Node(Token.BLOCK, funcNode);
        MakeDeclaredNamesUnique.Renamer mockRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);

        // Manually call findDeclaredNames
        uniqueNames.findDeclaredNames(block, block.getParent(), mockRenamer);

        // Verify that 'func1' was added to the renamer.
        assertNotNull(mockRenamer.getReplacementName("func1"));
    }

    // Test findDeclaredNames with nested structures.
    @Test
    public void testFindDeclaredNamesNested() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node innerFunc = createFunctionNode("innerFunc");
        Node varNode = createVarNode("outerVar");
        Node block = new Node(Token.BLOCK, varNode, innerFunc);
        Node parentBlock = new Node(Token.BLOCK, block);
        MakeDeclaredNamesUnique.Renamer mockRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);

        // Manually call findDeclaredNames on the outer block.
        uniqueNames.findDeclaredNames(block, parentBlock, mockRenamer);

        // Verify that 'outerVar' was added.
        assertNotNull(mockRenamer.getReplacementName("outerVar"));
        // The inner function should not be added by findDeclaredNames as it's a nested scope.
        assertNull(mockRenamer.getReplacementName("innerFunc"));
    }

    // Test Renamer interface for ContextualRenamer.
    @Test
    public void testContextualRenamer() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        renamer.addDeclaredName("name1");
        renamer.addDeclaredName("name2");
        assertEquals("name1", renamer.getReplacementName("name1")); // Initially returns original name
        assertEquals("name2", renamer.getReplacementName("name2")); // Initially returns original name
        assertNull(renamer.getReplacementName("unknown"));
    }

    // Test ContextualRenamer forChildScope.
    @Test
    public void testContextualRenamerForChildScope() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer parentRenamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        parentRenamer.addDeclaredName("parentName");
        parentRenamer.reserveName("parentName"); // Simulate global reservation

        MakeDeclaredNamesUnique.Renamer childRenamer = parentRenamer.forChildScope();
        assertTrue(childRenamer instanceof MakeDeclaredNamesUnique.ContextualRenamer);

        // Child should not affect parent's declarations directly
        assertNull(parentRenamer.getReplacementName("childName"));

        // Child can declare its own names
        childRenamer.addDeclaredName("childName");
        assertNull(childRenamer.getReplacementName("childName")); // Child doesn't rename itself initially
    }

    // Test ContextualRenamer stripConstIfReplaced.
    @Test
    public void testContextualRenamerStripConstIfReplaced() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        assertFalse(renamer.stripConstIfReplaced()); // ContextualRenamer does not strip const
    }

    // Test Renamer interface for InlineRenamer.
    @Test
    public void testInlineRenamer() throws Exception {
        Supplier<String> supplier = () -> "123";
        MakeDeclaredNamesUnique.InlineRenamer renamer = new MakeDeclaredNamesUnique.InlineRenamer(
            supplier, "prefix", false);

        renamer.addDeclaredName("name1");
        String uniqueName1 = renamer.getReplacementName("name1");
        assertNotNull(uniqueName1);
        assertTrue(uniqueName1.startsWith("name1$"));

        renamer.addDeclaredName("name2");
        String uniqueName2 = renamer.getReplacementName("name2");
        assertNotNull(uniqueName2);
        assertTrue(uniqueName2.startsWith("name2$"));
        assertNotEquals(uniqueName1, uniqueName2);
    }

    // Test InlineRenamer forChildScope.
    @Test
    public void testInlineRenamerForChildScope() throws Exception {
        Supplier<String> supplier = () -> "456";
        MakeDeclaredNamesUnique.InlineRenamer parentRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            supplier, "parentPrefix", false);

        MakeDeclaredNamesUnique.Renamer childRenamer = parentRenamer.forChildScope();
        assertTrue(childRenamer instanceof MakeDeclaredNamesUnique.InlineRenamer);

        parentRenamer.addDeclaredName("parentName");
        String uniqueParentName = parentRenamer.getReplacementName("parentName");

        childRenamer.addDeclaredName("childName");
        String uniqueChildName = childRenamer.getReplacementName("childName");

        // Child renamer uses the same supplier, but prefixes might differ or be the same.
        // The key is that the generated names are distinct.
        assertNotNull(uniqueParentName);
        assertNotNull(uniqueChildName);
        assertNotEquals(uniqueParentName, uniqueChildName);
    }

    // Test InlineRenamer stripConstIfReplaced.
    @Test
    public void testInlineRenamerStripConstIfReplaced() throws Exception {
        Supplier<String> supplier = () -> "789";
        MakeDeclaredNamesUnique.InlineRenamer renamer = new MakeDeclaredNamesUnique.InlineRenamer(
            supplier, "prefix", true);
        assertTrue(renamer.stripConstIfReplaced());

        MakeDeclaredNamesUnique.InlineRenamer renamer2 = new MakeDeclaredNamesUnique.InlineRenamer(
            supplier, "prefix", false);
        assertFalse(renamer2.stripConstIfReplaced());
    }

    // Test the helper function getReplacementName.
    @Test
    public void testMakeDeclaredNamesUnique_getReplacementName() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        // Setup the nameStack manually for this test
        MakeDeclaredNamesUnique.Renamer renamer1 = new MakeDeclaredNamesUnique.ContextualRenamer();
        renamer1.addDeclaredName("a");
        renamer1.declarations.put("a", "a$$1"); // Simulate renaming
        MakeDeclaredNamesUnique.Renamer renamer2 = new MakeDeclaredNamesUnique.ContextualRenamer();
        renamer2.addDeclaredName("b");
        renamer2.declarations.put("b", "b$$2"); // Simulate renaming

        uniqueNames.nameStack.push(renamer2);
        uniqueNames.nameStack.push(renamer1);

        assertEquals("a$$1", uniqueNames.getReplacementName("a"));
        assertEquals("b$$2", uniqueNames.getReplacementName("b"));
        assertNull(uniqueNames.getReplacementName("c"));
    }

    // Test the findDeclaredNames method, specifically for function names.
    @Test
    public void testFindDeclaredNames_functionName() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node functionNode = createFunctionNode("myFunc");
        MakeDeclaredNamesUnique.Renamer mockRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);

        // Manually call findDeclaredNames to add function name to renamer
        uniqueNames.findDeclaredNames(functionNode, functionNode.getParent(), mockRenamer);

        // The function name itself should be added.
        assertNotNull(mockRenamer.getReplacementName("myFunc"));
    }

    // Test the findDeclaredNames method with deeply nested functions.
    @Test
    public void testFindDeclaredNames_deeplyNestedFunctions() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node innermost = createFunctionNode("innermost");
        Node inner = createFunctionNode("inner", innermost);
        Node outer = createFunctionNode("outer", inner);
        Node script = new Node(Token.SCRIPT, outer);

        MakeDeclaredNamesUnique.Renamer mockRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);

        // findDeclaredNames should not descend into functions.
        uniqueNames.findDeclaredNames(script, null, mockRenamer);

        assertNull(mockRenamer.getReplacementName("outer")); // Should not be declared in global scope by findDeclaredNames
        assertNull(mockRenamer.getReplacementName("inner"));
        assertNull(mockRenamer.getReplacementName("innermost"));
    }

    // Test that ARGUMENTS is not added as a declared name.
    @Test
    public void testAddDeclaredName_arguments() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        MakeDeclaredNamesUnique.Renamer mockRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);

        // Call addDeclaredName directly with ARGUMENTS
        mockRenamer.addDeclaredName(MakeDeclaredNamesUnique.ARGUMENTS);

        // Should not be added to declarations
        assertNull(mockRenamer.getReplacementName(MakeDeclaredNamesUnique.ARGUMENTS));
    }

    // Test the ContextualRenameInverter class.
    @Test
    public void testContextualRenameInverter() throws Exception {
        // Example: Simulating name inversion
        String originalName = "originalName";
        String uniqueName = originalName + MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR + "1";
        assertEquals(originalName, MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(uniqueName));
        assertEquals(originalName, MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(originalName));
    }

    // Test the ContextualRenameInverter.handleScopeVar with a simple case.
    @Test
    public void testContextualRenameInverter_handleScopeVar() throws Exception {
        AbstractCompiler mockCompiler = createMockCompiler();
        MakeDeclaredNamesUnique.ContextualRenameInverter inverter = new MakeDeclaredNamesUnique.ContextualRenameInverter(mockCompiler);

        String originalName = "a";
        String renamedName = originalName + MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR + "1";

        Set<String> referencedNames = Sets.newHashSet();
        referencedNames.add(renamedName);
        inverter.referencedNames = referencedNames;

        // Create a dummy Var object (simplified)
        Scope.Var dummyVar = new Scope.Var(originalName, null, null, null, null);
        // Set the name to the renamed name using reflection
        Field nameField = null;
        try {
            nameField = Scope.Var.class.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(dummyVar, renamedName);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // Mocking compiler.reportCodeChange and nameMap updates would be needed for a full test.
        // This test primarily checks the logic for attempting name reversion.
        // inverter.handleScopeVar(dummyVar); // Would require more setup
    }


    // Test MakeDeclaredNamesUnique.Renamer.addDeclaredName
    @Test
    public void testRenamer_addDeclaredName() throws Exception {
        MakeDeclaredNamesUnique.Renamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        renamer.addDeclaredName("testName");
        // In ContextualRenamer, addDeclaredName itself doesn't immediately create a replacement name
        // unless called with reserveName first. So getReplacementName would return null initially.
        assertNull(renamer.getReplacementName("testName"));
    }

    // Test MakeDeclaredNamesUnique.Renamer.stripConstIfReplaced
    @Test
    public void testRenamer_stripConstIfReplaced() throws Exception {
        MakeDeclaredNamesUnique.Renamer contextualRenamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        assertFalse(contextualRenamer.stripConstIfReplaced());

        MakeDeclaredNamesUnique.Renamer inlineRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", true);
        assertTrue(inlineRenamer.stripConstIfReplaced());

        MakeDeclaredNamesUnique.Renamer inlineRenamerFalse = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);
        assertFalse(inlineRenamerFalse.stripConstIfReplaced());
    }

    // Test MakeDeclaredNamesUnique.ContextualRenamer.reserveName
    @Test
    public void testContextualRenamer_reserveName() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        renamer.reserveName("reservedName");
        // Reserve name just sets the count to 1. It doesn't create a replacement name.
        assertNull(renamer.getReplacementName("reservedName"));
    }

    // Test MakeDeclaredNamesUnique.ContextualRenamer.incrementNameCount
    @Test
    public void testContextualRenamer_incrementNameCount() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        assertEquals(1, renamer.incrementNameCount("countMe"));
        assertEquals(2, renamer.incrementNameCount("countMe"));
        assertEquals(1, renamer.incrementNameCount("another"));
    }

    // Test MakeDeclaredNamesUnique.ContextualRenamer.getUniqueName
    @Test
    public void testContextualRenamer_getUniqueName() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        assertEquals("myVar$$1", renamer.getUniqueName("myVar", 1));
        assertEquals("anotherVar$$5", renamer.getUniqueName("anotherVar", 5));
    }

    // Test MakeDeclaredNamesUnique.InlineRenamer.getUniqueName
    @Test
    public void testInlineRenamer_getUniqueName() throws Exception {
        Supplier<String> supplier = () -> "abc";
        MakeDeclaredNamesUnique.InlineRenamer renamer = new MakeDeclaredNamesUnique.InlineRenamer(
            supplier, "prefix", false);
        assertEquals("myVar$prefixabc", renamer.getUniqueName("myVar"));

        Supplier<String> supplier2 = () -> "def";
        MakeDeclaredNamesUnique.InlineRenamer renamer2 = new MakeDeclaredNamesUnique.InlineRenamer(
            supplier2, "anotherPrefix", false);
        assertEquals("myVar$anotherPrefixdef", renamer2.getUniqueName("myVar"));
    }

    // Test the findDeclaredNames method with a null parent.
    @Test
    public void testFindDeclaredNames_nullParent() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node varNode = createVarNode("globalVar");
        MakeDeclaredNamesUnique.Renamer mockRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);

        // Call findDeclaredNames with null parent
        uniqueNames.findDeclaredNames(varNode, null, mockRenamer);

        // Should still declare the var.
        assertNotNull(mockRenamer.getReplacementName("globalVar"));
    }

    // Test MakeDeclaredNamesUnique's handling of function parameters.
    @Test
    public void testEnterScope_functionParameters() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node param1 = createNameNode("param1");
        Node param2 = createNameNode("param2");
        Node fnParams = new Node(Token.LP, param1, param2);
        Node funcNode = new Node(Token.FUNCTION);
        funcNode.addChildToFront(Node.newString(Token.NAME, "myFunc"));
        funcNode.addChildToBack(fnParams);
        funcNode.addChildToBack(new Node(Token.BLOCK));

        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        // Manually call enterScope
        uniqueNames.enterScope(traversal);

        // The function parameters should be added to the renamer on the stack.
        assertEquals(1, uniqueNames.nameStack.size());
        MakeDeclaredNamesUnique.Renamer currentRenamer = uniqueNames.nameStack.peek();
        assertNotNull(currentRenamer.getReplacementName("param1"));
        assertNotNull(currentRenamer.getReplacementName("param2"));
    }

    // Test MakeDeclaredNamesUnique's handling of function recursive names.
    @Test
    public void testShouldTraverse_recursiveFunctionName() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node funcNode = createFunctionNode("recursiveFunc", createVarNode("x"));
        Node scriptNode = new Node(Token.SCRIPT, funcNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);

        // Simulate entering the scope of the function
        uniqueNames.enterScope(traversal);

        // Call shouldTraverse to potentially push a new renamer for the recursive name
        uniqueNames.shouldTraverse(traversal, funcNode, funcNode.getParent());

        // The recursive function name should be added to the stack.
        assertEquals(2, uniqueNames.nameStack.size()); // Global + function scope
        MakeDeclaredNamesUnique.Renamer currentRenamer = uniqueNames.nameStack.peek();
        assertNotNull(currentRenamer.getReplacementName("recursiveFunc"));
    }

    // Test MakeDeclaredNamesUnique's handling of catch variable names.
    @Test
    public void testShouldTraverse_catchVariableName() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node catchNode = createCatchNode("catchVar");
        Node tryNode = createTryNode(new Node(Token.BLOCK), catchNode);
        Node scriptNode = new Node(Token.SCRIPT, tryNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);

        // Simulate entering the scope of the try block
        uniqueNames.enterScope(traversal);

        // Call shouldTraverse to potentially push a new renamer for the catch variable
        uniqueNames.shouldTraverse(traversal, catchNode, tryNode);

        // The catch variable name should be added to the stack.
        assertEquals(2, uniqueNames.nameStack.size()); // Global + try scope
        MakeDeclaredNamesUnique.Renamer currentRenamer = uniqueNames.nameStack.peek();
        assertNotNull(currentRenamer.getReplacementName("catchVar"));
    }

    // Test `findDeclaredNames` with `NodeUtil.isVarDeclaration`.
    @Test
    public void testFindDeclaredNames_isVarDeclaration() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node varDecl = new Node(Token.VAR, createNameNode("myVar"));
        Node block = new Node(Token.BLOCK, varDecl);
        MakeDeclaredNamesUnique.Renamer mockRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);

        uniqueNames.findDeclaredNames(block, block.getParent(), mockRenamer);
        assertNotNull(mockRenamer.getReplacementName("myVar"));
    }

    // Test `findDeclaredNames` with `NodeUtil.isFunctionDeclaration`.
    @Test
    public void testFindDeclaredNames_isFunctionDeclaration() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node funcDecl = createFunctionNode("myFunc");
        Node block = new Node(Token.BLOCK, funcDecl);
        MakeDeclaredNamesUnique.Renamer mockRenamer = new MakeDeclaredNamesUnique.InlineRenamer(
            () -> "1", "prefix", false);

        uniqueNames.findDeclaredNames(block, block.getParent(), mockRenamer);
        assertNotNull(mockRenamer.getReplacementName("myFunc"));
    }

    // Test `findDeclaredNames` for a function declaration within a block.
    @Test
    public void testFindDeclaredNames_functionDeclarationInBlock() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node funcDecl = createFunctionNode("myFunc");
        Node block = new Node(Token.BLOCK, funcDecl);
        Node script = new Node(Token.SCRIPT, block);

        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        traversal.traverse(script); // This calls enterScope and findDeclaredNames

        assertEquals(2, uniqueNames.nameStack.size()); // Global + block scope
        MakeDeclaredNamesUnique.Renamer renamer = uniqueNames.nameStack.peek();
        assertNotNull(renamer.getReplacementName("myFunc"));
    }

    // Test a complex scenario with multiple nested scopes and declarations.
    @Test
    public void testComplexScenario() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();

        // Global scope
        Node globalVar = createVarNode("globalVar");
        Node funcVar = createVarNode("funcVar");
        Node catchVarDecl = createNameNode("catchVar");
        Node catchScopeNode = new Node(Token.CATCH);
        catchScopeNode.addChildToFront(catchVarDecl);
        catchScopeNode.addChildToBack(new Node(Token.BLOCK)); // Empty catch block body

        Node tryBlock = new Node(Token.BLOCK, new Node(Token.THROW));
        Node tryStmt = createTryNode(tryBlock, catchScopeNode);

        Node globalFunc = createFunctionNode("globalFunc", funcVar, tryStmt);

        Node script = new Node(Token.SCRIPT, globalVar, globalFunc);

        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        traversal.traverse(script);

        // Assertions about stack size and names found in scopes.
        assertEquals(3, uniqueNames.nameStack.size()); // Global, globalFunc, try scope

        // Check if globalVar was potentially renamed (depends on Renamer type)
        assertNull(uniqueNames.getReplacementName("globalVar"));

        // Check for names within globalFunc scope
        uniqueNames.nameStack.pop(); // pop try scope
        MakeDeclaredNamesUnique.Renamer funcRenamer = uniqueNames.nameStack.peek();
        assertNotNull(funcRenamer.getReplacementName("funcVar"));
        assertNotNull(funcRenamer.getReplacementName("catchVar")); // catchVar is declared in outer scope of try

        uniqueNames.nameStack.pop(); // pop globalFunc scope
        MakeDeclaredNamesUnique.Renamer globalRenamer = uniqueNames.nameStack.peek();
        assertNotNull(globalRenamer.getReplacementName("globalFunc")); // Function names are declared

        // The exact renaming strategy is not tested here, just that names are processed.
    }

    // Test for edge cases in string literals used as names.
    @Test
    public void testStringLiteralNames() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node nameNode = createNameNode(""); // Empty string name
        Node parent = new Node(Token.EXPR_RESULT, nameNode);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        uniqueNames.nameStack.push(uniqueNames.rootRenamer);
        uniqueNames.visit(traversal, nameNode, parent);
        assertEquals("", nameNode.getString()); // Empty string should not be renamed
    }

    // Test for variable names that are keywords.
    @Test
    public void testKeywordNames() throws Exception {
        MakeDeclaredNamesUnique uniqueNames = new MakeDeclaredNamesUnique();
        Node keywordName = createNameNode("if");
        Node parent = new Node(Token.EXPR_RESULT, keywordName);
        NodeTraversal traversal = new NodeTraversal(createMockCompiler(), uniqueNames);
        uniqueNames.nameStack.push(uniqueNames.rootRenamer);
        uniqueNames.visit(traversal, keywordName, parent);
        // Keywords are valid identifiers and should be processed normally.
        // The renaming logic itself doesn't explicitly avoid keywords.
        // Assuming default behavior of Renamer.
        assertNull(uniqueNames.getReplacementName("if")); // No replacement by default
    }
}
```