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

public class ScopedAliasesTest {
    @Test
    public void testProcessEmptyScript() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node root = new Node(Token.SCRIPT);
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testHotSwapEmptyScript() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node root = new Node(Token.SCRIPT);
        pass.hotSwapScript(root, null);
        assertEquals(Token.SCRIPT, root.getType());
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testUnrecognizedCallDoesNotAlterTree() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "other"));
        Node statement = new Node(Token.EXPR_RESULT, call);
        Node root = new Node(Token.SCRIPT, statement);
        pass.process(null, root);
        assertSame(statement, root.getFirstChild());
        assertSame(call, statement.getFirstChild());
    }

    @Test
    public void testScopeCallWithoutParametersReportsError() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node callee = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "scope"));
        Node call = new Node(Token.CALL, callee);
        Node root = new Node(Token.SCRIPT,
                new Node(Token.EXPR_RESULT, call));
        pass.process(null, root);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testScopeCallUsedAsNonStatementReportsError() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node callee = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "scope"));
        Node call = new Node(Token.CALL, callee);
        Node root = new Node(Token.SCRIPT,
                new Node(Token.VAR, Node.newString(Token.NAME, "x")));
        root.getFirstChild().getFirstChild().addChildToBack(call);
        pass.process(null, root);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testDiagnosticKeys() throws Exception {
        assertEquals("JSC_GOOG_SCOPE_USED_IMPROPERLY",
                ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY.key);
        assertEquals("JSC_GOOG_SCOPE_HAS_BAD_PARAMETERS",
                ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS.key);
    }

    @Test
    public void testScopeMethodName() throws Exception {
        assertEquals("goog.scope", ScopedAliases.SCOPING_METHOD_NAME);
    }

    @Test
    public void testNullExternsAcceptedForEmptyScript() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node root = new Node(Token.SCRIPT);
        pass.process(null, root);
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testEmptyHotSwapIsStableWhenRepeated() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node root = new Node(Token.SCRIPT);
        pass.hotSwapScript(root, null);
        pass.hotSwapScript(root, null);
        assertEquals(Token.SCRIPT, root.getType());
        assertNull(root.getFirstChild());
    }

    @Test
    public void testUnknownGlobalCallIsNotReportedAsScopeError() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node root = new Node(Token.SCRIPT, new Node(Token.EXPR_RESULT,
                new Node(Token.CALL, Node.newString(Token.NAME, "notScope"))));
        pass.process(null, root);
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testEmptyRootHasNoChildrenAfterProcess() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node root = new Node(Token.SCRIPT);
        pass.process(null, root);
        assertNull(root.getFirstChild());
    }

    @Test
    public void testVisitScopeCallWithoutStatementParentReportsError() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node callee = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "scope"));
        Node call = new Node(Token.CALL, callee);
        Node root = new Node(Token.SCRIPT, new Node(Token.EXPR_RESULT, call));
        pass.process(null, root);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testVisitScopeCallWithExtraArgumentReportsError() throws Exception {
        Compiler compiler = new Compiler();
        ScopedAliases pass = new ScopedAliases(compiler, null, null);
        Node callee = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "goog"),
                Node.newString(Token.STRING, "scope"));
        Node call = new Node(Token.CALL, callee,
                new Node(Token.NUMBER), new Node(Token.NUMBER));
        Node root = new Node(Token.SCRIPT,
                new Node(Token.EXPR_RESULT, call));
        pass.process(null, root);
        assertTrue(compiler.hasErrors());
    }
}
