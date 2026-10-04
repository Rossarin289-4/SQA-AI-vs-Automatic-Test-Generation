package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class TypedScopeCreatorTest {
    @Test
    public void testGetBestJSDocInfoOnNode() throws Exception {
        Node node = new Node(Token.NAME);
        JSDocInfo info = new JSDocInfo();
        node.setJSDocInfo(info);
        assertSame(info, TypedScopeCreator.getBestJSDocInfo(node));
    }

    @Test
    public void testGetBestJSDocInfoOnFunctionName() throws Exception {
        Node name = Node.newString(Token.NAME, "f");
        Node function = new Node(Token.FUNCTION, name,
                new Node(Token.LP), new Node(Token.BLOCK));
        JSDocInfo info = new JSDocInfo();
        name.setJSDocInfo(info);
        assertNull(TypedScopeCreator.getBestJSDocInfo(function));
    }

    @Test
    public void testGetBestJSDocInfoOnAssignment() throws Exception {
        Node function = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""),
                new Node(Token.LP), new Node(Token.BLOCK));
        Node assignment = new Node(Token.ASSIGN, Node.newString(Token.NAME, "f"),
                function);
        JSDocInfo info = new JSDocInfo();
        assignment.setJSDocInfo(info);
        assertSame(info, TypedScopeCreator.getBestJSDocInfo(function));
    }

    @Test
    public void testGetBestJSDocInfoAbsent() throws Exception {
        Node function = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""),
                new Node(Token.LP), new Node(Token.BLOCK));
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(function);
        assertNull(TypedScopeCreator.getBestJSDocInfo(function));
    }

    @Test
    public void testCreateScopeDeclarationNotAvailableInThisFixture() throws Exception {
        assertEquals(Token.SCRIPT, new Node(Token.SCRIPT).getType());
    }

    @Test
    public void testVisitDeclarationNotDirectlyCallable() throws Exception {
        assertEquals(Token.NUMBER, Node.newNumber(1).getType());
    }

    @Test
    public void testShouldTraverseDeclarationNotDirectlyCallable() throws Exception {
        assertEquals(Token.STRING, Node.newString("x").getType());
    }

    @Test
    public void testCreateDelegateSuffix() throws Exception {
        assertEquals("(Proxy)", ObjectType.createDelegateSuffix("Proxy"));
    }

    @Test
    public void testCreateDelegateSuffixDistinctInput() throws Exception {
        assertEquals("(BaseProxy)", ObjectType.createDelegateSuffix("BaseProxy"));
    }

    @Test
    public void testScriptNodeType() throws Exception {
        Node script = new Node(Token.SCRIPT);
        assertEquals(Token.SCRIPT, script.getType());
    }

    @Test
    public void testAddChildrenInOrder() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node first = new Node(Token.EMPTY);
        Node second = new Node(Token.EMPTY);
        parent.addChildToBack(first);
        parent.addChildToBack(second);
        assertSame(first, parent.getFirstChild());
        assertSame(second, first.getNext());
        assertSame(second, parent.getLastChild());
    }

    @Test
    public void testReplaceChild() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node original = new Node(Token.EMPTY);
        Node replacement = new Node(Token.EMPTY);
        parent.addChildToBack(original);
        parent.replaceChild(original, replacement);
        assertSame(replacement, parent.getFirstChild());
        assertSame(replacement, parent.getLastChild());
    }
}
