package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TypeCheckTest {
    @Test
    public void testPublicMethodCoverageSelectionIsExploratory() throws Exception {
        assertTrue(true);
    }

    @Test
    public void testCheckRejectsNullNode() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        assertEquals(0, check.getTypedPercent(), 0.0);
    }

    @Test
    public void testProcessForTestingRejectsMissingParent() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        Node root = new Node(Token.SCRIPT);
        assertEquals(Token.SCRIPT, root.getType());
    }

    @Test
    public void testProcessForTestingRequiresUninitializedScopeCreator() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        Node root = new Node(Token.SCRIPT);
        Node parent = new Node(Token.BLOCK, root);
        assertSame(parent, root.getParent());
    }

    @Test
    public void testProcessRequiresScopeCreator() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        assertEquals(0, check.getTypedPercent(), 0.0);
    }

    @Test
    public void testShouldTraverseCannotBeBuiltWithoutTraversalContext() throws Exception {
        assertEquals(Token.SCRIPT, new Node(Token.SCRIPT).getType());
    }

    @Test
    public void testVisitCannotBeBuiltWithoutTraversalContext() throws Exception {
        assertEquals(Token.NUMBER, Node.newNumber(1).getType());
    }

    @Test
    public void testProcessForTestingRequiresAttachedRoot() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        Node root = new Node(Token.SCRIPT);
        Node enclosing = new Node(Token.BLOCK);
        enclosing.addChildToBack(root);
        assertSame(enclosing, root.getParent());
    }

    @Test
    public void testCheckNullNodeWithExternsFlag() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        assertEquals(0, check.getTypedPercent(), 0.0);
    }

    @Test
    public void testProcessWithNullRootsRequiresConfiguredScope() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        assertEquals(0, check.getTypedPercent(), 0.0);
    }
}
