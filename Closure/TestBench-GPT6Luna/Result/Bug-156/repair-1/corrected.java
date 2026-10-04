package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.jscomp.GlobalNamespace.Ref.Type;
import com.google.javascript.jscomp.ReferenceCollectingCallback;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.JSType;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollapsePropertiesTest {
    @Test
    public void testEmptyScriptRemainsEmpty() throws Exception {
        Node root = new Node(Token.SCRIPT);
        new CollapseProperties(null, false, false).process(null, root);
        assertFalse(root.hasChildren());
    }

    @Test
    public void testEmptyScriptWithExternTypesRemainsEmpty() throws Exception {
        Node root = new Node(Token.SCRIPT);
        new CollapseProperties(null, true, false).process(null, root);
        assertFalse(root.hasChildren());
    }

    @Test
    public void testEmptyScriptWithAliasInliningRemainsEmpty() throws Exception {
        Node root = new Node(Token.SCRIPT);
        new CollapseProperties(null, false, true).process(null, root);
        assertFalse(root.hasChildren());
    }

    @Test
    public void testEmptyScriptWithBothOptionsRemainsEmpty() throws Exception {
        Node root = new Node(Token.SCRIPT);
        new CollapseProperties(null, true, true).process(null, root);
        assertFalse(root.hasChildren());
    }

    @Test
    public void testSimpleGlobalVariableRemainsDeclared() throws Exception {
        Node name = Node.newString(Token.NAME, "x");
        name.addChildToBack(Node.newNumber(1));
        Node statement = new Node(Token.VAR, name);
        Node root = new Node(Token.SCRIPT, statement);

        new CollapseProperties(null, false, false).process(null, root);

        assertSame(statement, root.getFirstChild());
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("x", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testUninitializedGlobalVariableRemainsDeclared() throws Exception {
        Node root = new Node(Token.SCRIPT,
                new Node(Token.VAR, Node.newString(Token.NAME, "x")));

        new CollapseProperties(null, false, false).process(null, root);

        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("x", root.getFirstChild().getFirstChild().getString());
        assertFalse(root.getFirstChild().getFirstChild().hasChildren());
    }

    @Test
    public void testGlobalFunctionDeclarationRemainsFunction() throws Exception {
        Node function = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "f"),
                new Node(Token.EMPTY),
                new Node(Token.BLOCK));
        Node root = new Node(Token.SCRIPT, function);

        new CollapseProperties(null, false, false).process(null, root);

        assertSame(function, root.getFirstChild());
        assertEquals(Token.FUNCTION, root.getFirstChild().getType());
        assertEquals("f", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testEmptyBlockIsPreserved() throws Exception {
        Node block = new Node(Token.BLOCK);
        Node root = new Node(Token.SCRIPT, block);

        new CollapseProperties(null, false, false).process(null, root);

        assertSame(block, root.getFirstChild());
        assertFalse(block.hasChildren());
    }

    @Test
    public void testEmptyInputCanBeProcessedRepeatedly() throws Exception {
        Node root = new Node(Token.SCRIPT);
        CollapseProperties pass = new CollapseProperties(null, false, false);

        pass.process(null, root);
        pass.process(null, root);

        assertFalse(root.hasChildren());
    }

    @Test
    public void testEmptyInputWithAliasInliningCanBeProcessedRepeatedly() throws Exception {
        Node root = new Node(Token.SCRIPT);
        CollapseProperties pass = new CollapseProperties(null, false, true);

        pass.process(null, root);
        pass.process(null, root);

        assertFalse(root.hasChildren());
    }

    @Test
    public void testEmptyInputDoesNotAddDeclarations() throws Exception {
        Node root = new Node(Token.SCRIPT);

        new CollapseProperties(null, false, false).process(null, root);

        assertEquals(null, root.getFirstChild());
        assertEquals(null, root.getLastChild());
    }

    @Test
    public void testUnrelatedTopLevelExpressionsArePreserved() throws Exception {
        Node first = new Node(Token.EXPR_RESULT, Node.newNumber(1));
        Node second = new Node(Token.EXPR_RESULT, Node.newNumber(2));
        Node root = new Node(Token.SCRIPT, first, second);

        new CollapseProperties(null, false, false).process(null, root);

        assertSame(first, root.getFirstChild());
        assertSame(second, root.getLastChild());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
    }
}
