package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InlineFunctionsTest {
    @Test
    public void testCandidateUsageForDeclaration() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        new Node(Token.VAR, name);
        assertTrue(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForFunctionDeclarationName() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        new Node(Token.FUNCTION, name);
        assertTrue(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForCallTarget() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        new Node(Token.CALL, name);
        assertTrue(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForOrdinaryReference() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        new Node(Token.EXPR_RESULT, name);
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForCallProperty() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node property = new Node(Token.GETPROP, name,
                Node.newString(Token.STRING, "call"));
        new Node(Token.CALL, property);
        assertTrue(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForNonCallProperty() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node property = new Node(Token.GETPROP, name,
                Node.newString(Token.STRING, "call"));
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForOtherPropertyName() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node property = new Node(Token.GETPROP, name,
                Node.newString(Token.STRING, "apply"));
        new Node(Token.CALL, property);
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForAssignmentTarget() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        new Node(Token.ASSIGN, name, Node.newNumber(1));
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageCallPropertyNeedsPropertyNodeAsTarget()
            throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node property = new Node(Token.GETPROP, name,
                Node.newString(Token.STRING, "call"));
        new Node(Token.CALL, Node.newString(Token.NAME, "other"), property);
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForGetElementCallProperty() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node property = new Node(Token.GETELEM, name,
                Node.newString(Token.STRING, "call"));
        new Node(Token.CALL, property);
        assertTrue(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForCallPropertyWithUnrelatedCallAncestor()
            throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node property = new Node(Token.GETPROP, name,
                Node.newString(Token.STRING, "call"));
        new Node(Token.CALL, property);
        assertTrue(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForCallPropertyWhenBaseIsNotFirstChild()
            throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node property = new Node(Token.GETPROP, Node.newString(Token.NAME, "g"),
                name, Node.newString(Token.STRING, "call"));
        new Node(Token.CALL, property);
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForCallPropertyWithoutNextNode()
            throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        new Node(Token.GETPROP, name);
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForCallPropertyWithNonStringProperty()
            throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node property = new Node(Token.GETPROP, name, Node.newNumber(1));
        new Node(Token.CALL, property);
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForNestedCallProperty() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node property = new Node(Token.GETPROP, name,
                Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, property);
        new Node(Token.CALL, call);
        assertTrue(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForNameInVarInitializer() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        new Node(Token.VAR, Node.newString(Token.NAME, "x", 0, 0), name);
        assertTrue(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForNameInFunctionBody() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node fn = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "g", 0, 0),
                new Node(Token.LP),
                new Node(Token.BLOCK, name));
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForNameInAssignmentValue() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        new Node(Token.ASSIGN, Node.newString(Token.NAME, "x", 0, 0), name);
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForGetPropWithDifferentCase()
            throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node property = new Node(Token.GETPROP, name,
                Node.newString(Token.STRING, "Call"));
        new Node(Token.CALL, property);
        assertFalse(InlineFunctions.isCandidateUsage(name));
    }

    @Test
    public void testCandidateUsageForCallNameWithExtraArguments()
            throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        new Node(Token.CALL, name, Node.newNumber(1), Node.newNumber(2));
        assertTrue(InlineFunctions.isCandidateUsage(name));
    }
}
