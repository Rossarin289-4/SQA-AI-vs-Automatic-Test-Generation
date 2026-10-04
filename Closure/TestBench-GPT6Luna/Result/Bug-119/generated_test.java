package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticReference;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.StaticSymbolTable;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GlobalNamespaceTest {
    @Test
    public void testRootNodeIsRootParent() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node parent = new Node(Token.BLOCK, root);
        GlobalNamespace namespace = new GlobalNamespace(null, root);
        assertSame(parent, namespace.getRootNode());
    }

    @Test
    public void testParentScopeIsNull() throws Exception {
        GlobalNamespace namespace = new GlobalNamespace(null, new Node(Token.SCRIPT));
        assertNull(namespace.getParentScope());
    }

    @Test
    public void testHasNoSlotForEmptyScript() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node parent = new Node(Token.BLOCK, root);
        GlobalNamespace namespace = new GlobalNamespace(null, root);
        assertNull(namespace.getSlot("missing"));
    }

    @Test
    public void testOwnSlotForEmptyScriptIsNull() throws Exception {
        Node root = new Node(Token.SCRIPT);
        new Node(Token.BLOCK, root);
        GlobalNamespace namespace = new GlobalNamespace(null, root);
        assertNull(namespace.getOwnSlot("missing"));
    }

    @Test
    public void testGetAllSymbolsForEmptyScript() throws Exception {
        Node root = new Node(Token.SCRIPT);
        new Node(Token.BLOCK, root);
        GlobalNamespace namespace = new GlobalNamespace(null, root);
        assertEquals(0, size(namespace.getAllSymbols()));
    }

    @Test
    public void testGetReferencesForNameFromEmptyNamespace() throws Exception {
        Node root = new Node(Token.SCRIPT);
        new Node(Token.BLOCK, root);
        GlobalNamespace namespace = new GlobalNamespace(null, root);
        GlobalNamespace.Name name = new GlobalNamespace.Name("x", null, false);
        assertEquals(0, size(namespace.getReferences(name)));
    }

    @Test
    public void testScopeOfNameIsThisNamespace() throws Exception {
        GlobalNamespace namespace = new GlobalNamespace(null, new Node(Token.SCRIPT));
        GlobalNamespace.Name name = new GlobalNamespace.Name("x", null, false);
        assertSame(namespace, namespace.getScope(name));
    }

    @Test
    public void testNameIsFullName() throws Exception {
        GlobalNamespace.Name root = new GlobalNamespace.Name("alpha", null, false);
        GlobalNamespace.Name child = root.addProperty("beta", false);
        assertEquals("alpha.beta", child.getName());
    }

    @Test
    public void testNameDeclarationInitiallyNull() throws Exception {
        GlobalNamespace.Name name = new GlobalNamespace.Name("alpha", null, false);
        assertNull(name.getDeclaration());
    }

    @Test
    public void testNameTypeIsNull() throws Exception {
        GlobalNamespace.Name name = new GlobalNamespace.Name("alpha", null, false);
        assertNull(name.getType());
    }

    @Test
    public void testNameTypeIsNotInferred() throws Exception {
        GlobalNamespace.Name name = new GlobalNamespace.Name("alpha", null, false);
        assertFalse(name.isTypeInferred());
    }

    @Test
    public void testGetParentScopeAfterGenerationIsNull() throws Exception {
        Node root = new Node(Token.SCRIPT);
        new Node(Token.BLOCK, root);
        GlobalNamespace namespace = new GlobalNamespace(null, root);
        namespace.getAllSymbols();
        assertNull(namespace.getParentScope());
    }

    @Test
    public void testGetScopeDoesNotDependOnSlot() throws Exception {
        GlobalNamespace namespace = new GlobalNamespace(null, new Node(Token.SCRIPT));
        GlobalNamespace.Name name = new GlobalNamespace.Name("unindexed", null, false);
        assertSame(namespace, namespace.getScope(name));
    }

    @Test
    public void testEmptyNameIndexAfterGeneration() throws Exception {
        Node root = new Node(Token.SCRIPT);
        new Node(Token.BLOCK, root);
        GlobalNamespace namespace = new GlobalNamespace(null, root);
        assertEquals(0, namespace.getNameIndex().size());
    }

    @Test
    public void testSimpleNameBaseName() throws Exception {
        GlobalNamespace.Name name = new GlobalNamespace.Name("single", null, false);
        assertEquals("single", name.getFullName());
    }

    @Test
    public void testNestedNameFullName() throws Exception {
        GlobalNamespace.Name root = new GlobalNamespace.Name("one", null, false);
        GlobalNamespace.Name middle = root.addProperty("two", false);
        GlobalNamespace.Name leaf = middle.addProperty("three", false);
        assertEquals("one.two.three", leaf.getFullName());
    }

    @Test
    public void testNewReferenceExposesItsNode() throws Exception {
        Node node = Node.newString(Token.NAME, "symbol");
        GlobalNamespace.Name name = new GlobalNamespace.Name("symbol", null, false);
        GlobalNamespace.Ref ref = new GlobalNamespace.Ref(
                null, null, node, name, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        assertSame(node, ref.getNode());
    }

    @Test
    public void testNewReferenceExposesItsSymbol() throws Exception {
        Node node = Node.newString(Token.NAME, "symbol");
        GlobalNamespace.Name name = new GlobalNamespace.Name("symbol", null, false);
        GlobalNamespace.Ref ref = new GlobalNamespace.Ref(
                null, null, node, name, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        assertSame(name, ref.getSymbol());
    }

    @Test
    public void testUnattachedReferenceHasNoSourceFile() throws Exception {
        Node node = Node.newString(Token.NAME, "symbol");
        GlobalNamespace.Name name = new GlobalNamespace.Name("symbol", null, false);
        GlobalNamespace.Ref ref = new GlobalNamespace.Ref(
                null, null, node, name, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        assertNull(ref.getSourceFile());
    }

    @Test
    public void testGlobalNamespaceIsNotItsOwnParent() throws Exception {
        GlobalNamespace namespace = new GlobalNamespace(null, new Node(Token.SCRIPT));
        assertNotSame(namespace, namespace.getParentScope());
    }

    @Test
    public void testNameDocInfoWithoutDeclarationIsNull() throws Exception {
        GlobalNamespace.Name name = new GlobalNamespace.Name("doc", null, false);
        assertNull(name.getJSDocInfo());
    }

    @Test
    public void testVarDeclarationDocInfoIsNull() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "varName");
        new Node(Token.VAR, nameNode);
        GlobalNamespace.Name name = new GlobalNamespace.Name("varName", null, false);
        name.addRef(new GlobalNamespace.Ref(null, null, nameNode, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0));
        assertNull(name.getJSDocInfo());
    }

    @Test
    public void testSecondVarNameDocInfoIsNull() throws Exception {
        Node firstName = Node.newString(Token.NAME, "first");
        Node secondName = Node.newString(Token.NAME, "second");
        new Node(Token.VAR, firstName, secondName);
        GlobalNamespace.Name name = new GlobalNamespace.Name("second", null, false);
        name.addRef(new GlobalNamespace.Ref(null, null, secondName, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0));
        assertNull(name.getJSDocInfo());
    }

    @Test
    public void testAssignmentDeclarationDocInfoIsNull() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "assigned");
        Node value = Node.newNumber(1);
        new Node(Token.ASSIGN, nameNode, value);
        GlobalNamespace.Name name = new GlobalNamespace.Name("assigned", null, false);
        name.addRef(new GlobalNamespace.Ref(null, null, nameNode, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0));
        assertNull(name.getJSDocInfo());
    }

    @Test
    public void testFunctionDeclarationDocInfoIsNull() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "functionName");
        new Node(Token.FUNCTION, nameNode);
        GlobalNamespace.Name name = new GlobalNamespace.Name("functionName", null, false);
        name.addRef(new GlobalNamespace.Ref(null, null, nameNode, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0));
        assertNull(name.getJSDocInfo());
    }

    @Test
    public void testNonDeclarationReferenceDoesNotSetDocInfo() throws Exception {
        Node nameNode = Node.newString(Token.NAME, "readName");
        new Node(Token.EXPR_RESULT, nameNode);
        GlobalNamespace.Name name = new GlobalNamespace.Name("readName", null, false);
        name.addRef(new GlobalNamespace.Ref(null, null, nameNode, name,
                GlobalNamespace.Ref.Type.DIRECT_GET, 0));
        assertNull(name.getJSDocInfo());
    }

    @Test
    public void testGetDeclarationReturnsFirstGlobalSet() throws Exception {
        Node firstNode = Node.newString(Token.NAME, "decl");
        Node secondNode = Node.newString(Token.NAME, "decl");
        new Node(Token.EXPR_RESULT, firstNode);
        new Node(Token.EXPR_RESULT, secondNode);
        GlobalNamespace.Name name = new GlobalNamespace.Name("decl", null, false);
        GlobalNamespace.Ref first = new GlobalNamespace.Ref(null, null, firstNode, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
        GlobalNamespace.Ref second = new GlobalNamespace.Ref(null, null, secondNode, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 1);
        name.addRef(first);
        name.addRef(second);
        assertSame(first, name.getDeclaration());
    }

    @Test
    public void testLocalSetDoesNotBecomeDeclaration() throws Exception {
        Node node = Node.newString(Token.NAME, "local");
        new Node(Token.EXPR_RESULT, node);
        GlobalNamespace.Name name = new GlobalNamespace.Name("local", null, false);
        name.addRef(new GlobalNamespace.Ref(null, null, node, name,
                GlobalNamespace.Ref.Type.SET_FROM_LOCAL, 0));
        assertNull(name.getDeclaration());
    }

    @Test
    public void testNameTypeRemainsNullAfterAddingReference() throws Exception {
        Node node = Node.newString(Token.NAME, "read");
        new Node(Token.EXPR_RESULT, node);
        GlobalNamespace.Name name = new GlobalNamespace.Name("read", null, false);
        name.addRef(new GlobalNamespace.Ref(null, null, node, name,
                GlobalNamespace.Ref.Type.DIRECT_GET, 0));
        assertNull(name.getType());
    }

    private int size(Iterable<?> values) {
        int count = 0;
        for (Object value : values) {
            count++;
        }
        return count;
    }
}
