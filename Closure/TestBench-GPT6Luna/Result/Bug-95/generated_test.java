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
    public void testCreateGlobalScopeWithNativeBindings() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(root, null);
        assertNotNull(scope.getVar("undefined"));
        assertNotNull(scope.getVar("Object"));
        assertNotNull(scope.getVar("Array"));
        assertNotNull(scope.getVar("goog.typedef"));
        assertNotNull(scope.getVar("ActiveXObject"));
    }

    @Test
    public void testCreateGlobalScopeHasNativePrototypeBindings() throws Exception {
        Compiler compiler = new Compiler();
        Scope scope = new TypedScopeCreator(compiler).createScope(
            new Node(Token.SCRIPT), null);
        assertNotNull(scope.getVar("Object.prototype"));
        assertNotNull(scope.getVar("Array.prototype"));
        assertNotNull(scope.getVar("String.prototype"));
    }

    @Test
    public void testCreateGlobalScopeDoesNotDeclareOrdinaryName() throws Exception {
        Compiler compiler = new Compiler();
        Scope scope = new TypedScopeCreator(compiler).createScope(
            new Node(Token.SCRIPT), null);
        assertNull(scope.getVar("notDeclared"));
    }

    @Test
    public void testScopeRootIsScript() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        Scope scope = new TypedScopeCreator(compiler).createScope(root, null);
        assertSame(root, scope.getRootNode());
    }

    @Test
    public void testCreateScopeWithParentUsesRoot() throws Exception {
        Compiler compiler = new Compiler();
        Node globalRoot = new Node(Token.SCRIPT);
        Scope global = new TypedScopeCreator(compiler).createScope(globalRoot, null);
        Node localRoot = new Node(Token.BLOCK);
        Scope local = new TypedScopeCreator(compiler).createScope(localRoot, global);
        assertSame(localRoot, local.getRootNode());
        assertSame(global, local.getParent());
    }

    @Test
    public void testChildScopeReportsLocalState() throws Exception {
        Compiler compiler = new Compiler();
        Node globalRoot = new Node(Token.SCRIPT);
        globalRoot.putProp(Node.SOURCENAME_PROP, "test.js");
        Scope global = new TypedScopeCreator(compiler).createScope(globalRoot, null);
        Node localRoot = new Node(Token.BLOCK);
        Scope local = new TypedScopeCreator(compiler).createScope(localRoot, global);
        assertTrue(local.isLocal());
        assertFalse(local.isGlobal());
    }

    @Test
    public void testGlobalScopeReportsGlobalState() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        root.putProp(Node.SOURCENAME_PROP, "test.js");
        Scope global = new TypedScopeCreator(compiler).createScope(root, null);
        assertTrue(global.isGlobal());
        assertFalse(global.isLocal());
    }

    @Test
    public void testChildScopeInheritsNativeBinding() throws Exception {
        Compiler compiler = new Compiler();
        Node globalRoot = new Node(Token.SCRIPT);
        globalRoot.putProp(Node.SOURCENAME_PROP, "test.js");
        Scope global = new TypedScopeCreator(compiler).createScope(globalRoot, null);
        Node localRoot = new Node(Token.BLOCK);
        Scope local = new TypedScopeCreator(compiler).createScope(localRoot, global);
        assertNotNull(local.getVar("Object"));
    }

    @Test
    public void testShouldTraverseRoot() throws Exception {
        Compiler compiler = new Compiler();
        Node root = new Node(Token.SCRIPT);
        root.putProp(Node.SOURCENAME_PROP, "test.js");
        Scope scope = new TypedScopeCreator(compiler).createScope(root, null);
        assertSame(root, scope.getRootNode());
    }

    @Test
    public void testCreateScopeEmptyGlobalIsRepeatable() throws Exception {
        Compiler compiler = new Compiler();
        Node firstRoot = new Node(Token.SCRIPT);
        firstRoot.putProp(Node.SOURCENAME_PROP, "test.js");
        Node secondRoot = new Node(Token.SCRIPT);
        secondRoot.putProp(Node.SOURCENAME_PROP, "test.js");
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope first = creator.createScope(firstRoot, null);
        Scope second = creator.createScope(secondRoot, null);
        assertNotSame(first, second);
        assertNotNull(second.getVar("undefined"));
    }

    @Test
    public void testCreateScopeEmptyChildHasNoOrdinaryName() throws Exception {
        Compiler compiler = new Compiler();
        Node globalRoot = new Node(Token.SCRIPT);
        globalRoot.putProp(Node.SOURCENAME_PROP, "test.js");
        Scope global = new TypedScopeCreator(compiler).createScope(globalRoot, null);
        Node localRoot = new Node(Token.BLOCK);
        Scope local = new TypedScopeCreator(compiler).createScope(localRoot, global);
        assertNull(local.getVar("notDeclared"));
    }

    @Test
    public void testChildScopeParentChain() throws Exception {
        Compiler compiler = new Compiler();
        Node globalRoot = new Node(Token.SCRIPT);
        globalRoot.putProp(Node.SOURCENAME_PROP, "test.js");
        Scope global = new TypedScopeCreator(compiler).createScope(globalRoot, null);
        Node localRoot = new Node(Token.BLOCK);
        Scope local = new TypedScopeCreator(compiler).createScope(localRoot, global);
        assertSame(global, local.getParent());
        assertSame(global, local.getGlobalScope());
    }
}
