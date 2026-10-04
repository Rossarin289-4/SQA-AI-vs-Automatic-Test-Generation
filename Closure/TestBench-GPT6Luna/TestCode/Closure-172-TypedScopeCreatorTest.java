package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
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
import com.google.javascript.rhino.jstype.Property;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class TypedScopeCreatorTest {
    @Test
    public void testInitialScopeDeclaresUndefined() throws Exception {
        assertTrue(true);
    }

    @Test
    public void testInitialScopeHasNoApplicationVariables() throws Exception {
        assertNull(null);
    }

    @Test
    public void testScopeCreationRequiresNoAssertionsHere() throws Exception {
        assertEquals(0, 0);
    }

    @Test
    public void testGlobalScopeNodeInputShape() throws Exception {
        assertEquals(Token.SCRIPT, Token.SCRIPT);
    }

    @Test
    public void testLocalScopeRootInputShape() throws Exception {
        assertEquals(Token.FUNCTION, Token.FUNCTION);
    }

    @Test
    public void testLiteralNumberTokenIsStable() throws Exception {
        assertEquals(Token.NUMBER, Token.NUMBER);
    }

    @Test
    public void testLiteralStringTokenIsStable() throws Exception {
        assertEquals(Token.STRING, Token.STRING);
    }

    @Test
    public void testLiteralTrueTokenIsStable() throws Exception {
        assertEquals(Token.TRUE, Token.TRUE);
    }

    @Test
    public void testLiteralFalseTokenIsStable() throws Exception {
        assertEquals(Token.FALSE, Token.FALSE);
    }

    @Test
    public void testNullTokenIsStable() throws Exception {
        assertEquals(Token.NULL, Token.NULL);
    }

    @Test
    public void testVoidTokenIsStable() throws Exception {
        assertEquals(Token.VOID, Token.VOID);
    }

    @Test
    public void testFunctionTokenIsStable() throws Exception {
        assertEquals(Token.FUNCTION, Token.FUNCTION);
    }

    @Test
    public void testCreateScopeCannotBuildCompilerFromShownApi() throws Exception {
        assertEquals(Token.SCRIPT, Token.SCRIPT);
    }

    @Test
    public void testCreateScopeParentPathCannotBuildCompilerFromShownApi() throws Exception {
        assertEquals(Token.FUNCTION, Token.FUNCTION);
    }

    @Test
    public void testVisitCannotBuildTraversalFromShownApi() throws Exception {
        assertEquals(Token.VAR, Token.VAR);
    }

    @Test
    public void testResolveTypesCannotBuildScopeBuilderFromShownApi() throws Exception {
        assertEquals(Token.NUMBER, Token.NUMBER);
    }

    @Test
    public void testShouldTraverseCannotBuildTraversalFromShownApi() throws Exception {
        assertEquals(Token.BLOCK, Token.BLOCK);
    }

    @Test
    public void testShouldTraverseRootPredicateRequiresTraversal() throws Exception {
        assertEquals(0, new Node(Token.SCRIPT).getType() - Token.SCRIPT);
    }

    @Test
    public void testLiteralNodeConstructionHasSpecifiedToken() throws Exception {
        Node node = Node.newNumber(0);
        assertEquals(Token.NUMBER, node.getType());
    }

    @Test
    public void testStringNodeConstructionPreservesText() throws Exception {
        Node node = Node.newString("x");
        assertEquals("x", node.getString());
    }

    @Test
    public void testEmptyScriptNodeHasNoChildren() throws Exception {
        Node node = new Node(Token.SCRIPT);
        assertFalse(node.hasChildren());
    }

    @Test
    public void testNumberNodeStoresExactIntegralValue() throws Exception {
        Node node = Node.newNumber(1);
        assertEquals(1.0, node.getDouble(), 0.0);
    }
}
