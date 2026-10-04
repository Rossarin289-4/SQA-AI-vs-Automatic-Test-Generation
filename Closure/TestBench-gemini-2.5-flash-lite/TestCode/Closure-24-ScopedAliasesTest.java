package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Set;
import java.util.function.Predicate;

public class ScopedAliasesTest {

    // Mock AbstractCompiler to satisfy dependencies and capture errors.

    // Mock AliasTransformationHandler



    // Helper to create a script node containing a goog.scope call with the given body code.

    // Helper to create a Node representing a qualified name.
    private Node createQualifiedNameNode(String qualifiedName) {
        String[] parts = qualifiedName.split("\\.");
        Node node = null;
        for (int i = parts.length - 1; i >= 0; i--) {
            Node currentPart = Node.newString(parts[i], 1, 1); // Use Node.newString(String, lineno, charno)
            if (node == null) {
                node = currentPart;
            } else {
                Node getProp = new Node(Token.GETPROP, 1, 1);
                getProp.addChildToBack(node);
                getProp.addChildToBack(currentPart);
                node = getProp;
            }
        }
        return node;
    }






























    @Test
    public void testShouldTraverseSkipsGlobalFunctions() throws Exception {
        Node script = Node.newScript(new Node(Token.FUNCTION, 1, 1)); // A global function
        ScopedAliases scopedAliases = createScopedAliases();
        NodeTraversal traversal = new NodeTraversal(compiler, scopedAliases.traversal);

        // Should return false for global functions, unless they are part of goog.scope
        assertFalse(scopedAliases.traversal.shouldTraverse(traversal, script.getFirstChild(), script));
    }

    @Test
    public void testShouldTraverseEntersGoogScopeFunctions() throws Exception {
        Node root = createScriptWithGoogScope("var x = 1;"); // A function body inside goog.scope
        ScopedAliases scopedAliases = createScopedAliases();
        NodeTraversal traversal = new NodeTraversal(compiler, scopedAliases.traversal);

        // We need to find the function node within the goog.scope call.
        Node functionNode = null;
        NodeTraversal.traverse(compiler, root, new NodeTraversal.Callback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
                if (n.isFunction() && parent.isExprResult() && t.getScopeDepth() == 2) {
                    functionNode = n;
                    // Stop traversal once found
                    t.traverseRoots(new Node[0]); // Stop traversal
                }
            }
        });

        assertNotNull(functionNode);
        assertTrue(scopedAliases.traversal.shouldTraverse(traversal, functionNode, functionNode.getParent()));
    }

    @Test
    public void testGetSourceRegionCalculatesCorrectBounds() throws Exception {
        // Create a simple AST node that represents the 'goog.scope' call.
        Node scopeCall = new Node(Token.CALL, 10, 5); // Line 10, Char 5
        Node goog = new Node(Token.NAME, "goog", 1, 1);
        Node googScopeName = new Node(Token.CALL, 1, 1);
        goog.addChildToBack(googScopeName);
        scopeCall.addChildToBack(goog);

        // Simulate a subsequent node to define the end position.
        Node nextNode = new Node(Token.STRING, "some code", 20, 1); // Line 20, Char 1

        // Need to place these in a structure where getNext() and getParent() work as expected by getSourceRegion.
        Node parentForScopeCall = new Node(Token.EXPR_RESULT, scopeCall, 10, 5);
        Node parentForNextNode = new Node(Token.EXPR_RESULT, nextNode, 20, 1);
        
        // Link them as siblings for traversal to find the next node correctly.
        Node scriptRoot = Node.newScript(parentForScopeCall);
        scriptRoot.addChildAfter(parentForNextNode, parentForScopeCall);


        ScopedAliases scopedAliases = createScopedAliases();
        SourcePosition<AliasTransformation> region = scopedAliases.traversal.getSourceRegion(scopeCall);

        assertNotNull(region);
        assertEquals(10, region.getStartLine());
        assertEquals(5, region.getPositionOnStartLine());
        assertEquals(20, region.getEndLine());
        assertEquals(1, region.getPositionOnEndLine());
    }

    @Test
    public void testFindAliasesCollectsVarsInScope() throws Exception {
        Node root = createScriptWithGoogScope("var alias = goog.dom.TagName.DIV; var another = goog.dom.TagName.SPAN;");
        ScopedAliases scopedAliases = createScopedAliases();

        NodeTraversal.traverse(compiler, root, new NodeTraversal.ScopedCallback() {
            @Override
            public void enterScope(NodeTraversal t) {
                if (t.getScopeDepth() == 2) { // Inside goog.scope
                    scopedAliases.traversal.findAliases(t);
                }
            }
            @Override public void visit(NodeTraversal t, Node n, Node parent) { }
            @Override public void exitScope(NodeTraversal t) { }
            @Override public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) { return true; }
        });

        assertFalse(scopedAliases.traversal.aliases.isEmpty());
        assertTrue(scopedAliases.traversal.aliases.containsKey("alias"));
        assertTrue(scopedAliases.traversal.aliases.containsKey("another"));
    }

    @Test
    public void testEnterScopeLogsAliasTransformation() {
        Node root = createScriptWithGoogScope("var alias = goog.dom.TagName.DIV;");
        ScopedAliases scopedAliases = createScopedAliases();

        NodeTraversal.traverse(compiler, root, new NodeTraversal.ScopedCallback() {
            @Override
            public void enterScope(NodeTraversal t) {
                scopedAliases.traversal.enterScope(t);
            }
            @Override public void visit(NodeTraversal t, Node n, Node parent) { }
            @Override public void exitScope(NodeTraversal t) { }
            @Override public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) { return true; }
        });

        assertNotNull(scopedAliases.traversal.transformation);
    }

    @Test
    public void testExitScopeClearsAliasesAndResetsTransformation() {
        Node root = createScriptWithGoogScope("var alias = goog.dom.TagName.DIV;");
        ScopedAliases scopedAliases = createScopedAliases();

        NodeTraversal.traverse(compiler, root, new NodeTraversal.ScopedCallback() {
            @Override
            public void enterScope(NodeTraversal t) {
                scopedAliases.traversal.enterScope(t); // Sets transformation and populates aliases
            }
            @Override public void visit(NodeTraversal t, Node n, Node parent) { }
            @Override
            public void exitScope(NodeTraversal t) {
                scopedAliases.traversal.exitScope(t);
            }
            @Override public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) { return true; }
        });

        assertTrue(scopedAliases.traversal.aliases.isEmpty());
        assertNull(scopedAliases.traversal.transformation);
    }
}





