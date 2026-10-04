package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticReference;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.StaticSymbolTable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.SourcePosition;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class ScopeTest {
    @Test
    public void testArgumentsVarIsCachedAndHasNoDeclaration() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Var first = scope.getArgumentsVar();
        Var second = scope.getArgumentsVar();
        assertSame(first, second);
        assertEquals("arguments", first.getName());
        assertNull(first.getNode());
        assertNull(first.getDeclaration());
        assertEquals(-1, first.index);
    }

    @Test
    public void testArgumentsVarIsNotInDeclaredVariables() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        scope.getArgumentsVar();
        assertEquals(0, scope.getVarCount());
        assertFalse(scope.isDeclared("arguments", true));
    }

    @Test
    public void testGlobalScopePropertiesAndRoot() throws Exception {
        Node root = new Node(Token.BLOCK);
        Scope scope = new Scope(root, (ObjectType) null);
        assertSame(root, scope.getRootNode());
        assertNull(scope.getParent());
        assertNull(scope.getParentScope());
        assertTrue(scope.isGlobal());
        assertFalse(scope.isLocal());
    }

    @Test
    public void testBottomScopeRecordsBottomState() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        assertTrue(scope.isBottom());
        assertEquals(0, scope.getVarCount());
    }

    @Test
    public void testChildScopeHasParentAndLocalState() throws Exception {
        Scope parent = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node childRoot = new Node(Token.FUNCTION);
        Scope child = new Scope(parent, childRoot);
        assertSame(parent, child.getParent());
        assertSame(parent, child.getParentScope());
        assertSame(childRoot, child.getRootNode());
        assertTrue(child.isLocal());
        assertFalse(child.isGlobal());
        assertFalse(child.isBottom());
    }

    @Test
    public void testGetVarAndOwnSlotDistinguishParentDeclaration() throws Exception {
        Scope parent = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node declaration = Node.newString(Token.NAME, "item");
        Var declared = parent.declare("item", declaration, null, null);
        Scope child = new Scope(parent, new Node(Token.FUNCTION));
        assertSame(declared, child.getVar("item"));
        assertSame(declared, child.getSlot("item"));
        assertNull(child.getOwnSlot("item"));
    }

    @Test
    public void testOwnDeclarationAndMissingNameLookups() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node declaration = Node.newString(Token.NAME, "local");
        Var declared = scope.declare("local", declaration, null, null);
        assertSame(declared, scope.getOwnSlot("local"));
        assertSame(declared, scope.getVar("local"));
        assertNull(scope.getVar("absent"));
        assertNull(scope.getOwnSlot("absent"));
    }

    @Test
    public void testIsDeclaredCanLimitSearchToCurrentScope() throws Exception {
        Scope parent = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        parent.declare("outer", Node.newString(Token.NAME, "outer"), null, null);
        Scope child = new Scope(parent, new Node(Token.FUNCTION));
        assertTrue(child.isDeclared("outer", true));
        assertFalse(child.isDeclared("outer", false));
        assertFalse(child.isDeclared("missing", true));
    }

    @Test
    public void testDeclaredVarsRemainInInsertionOrder() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Var one = scope.declare("one", Node.newString(Token.NAME, "one"), null, null);
        Var two = scope.declare("two", Node.newString(Token.NAME, "two"), null, null);
        Iterator<Var> vars = scope.getVars();
        assertSame(one, vars.next());
        assertSame(two, vars.next());
        assertFalse(vars.hasNext());
        assertEquals(2, scope.getVarCount());
    }

    @Test
    public void testAllSymbolsAndReferencesContainDeclaredVariable() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Var declared = scope.declare("entry", Node.newString(Token.NAME, "entry"), null, null);
        Iterator<Var> symbols = scope.getAllSymbols().iterator();
        assertSame(declared, symbols.next());
        assertFalse(symbols.hasNext());
        Iterator<Var> references = scope.getReferences(declared).iterator();
        assertSame(declared, references.next());
        assertFalse(references.hasNext());
        assertSame(scope, scope.getScope(declared));
    }

    @Test
    public void testVarIdentityUsesItsNameNode() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node nameNode = Node.newString(Token.NAME, "same");
        Var declared = scope.declare("same", nameNode, null, null);
        assertSame(nameNode, declared.getNode());
        assertSame(nameNode, declared.getNameNode());
        assertSame(declared, declared.getSymbol());
        assertSame(declared, declared.getDeclaration());
        assertEquals("same", declared.getName());
    }

    @Test
    public void testVarWithoutTypeHasInferredStateAndStableString() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Var declared = scope.declare("plain", Node.newString(Token.NAME, "plain"), null, null);
        assertTrue(declared.isTypeInferred());
        assertNull(declared.getType());
        assertEquals("Scope.Var plain{null}", declared.toString());
    }

    @Test
    public void testNonInferredDeclarationReportsDeclaredTypeState() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Var declared = scope.declare(
            "fixed", Node.newString(Token.NAME, "fixed"), null, null, false);
        assertFalse(declared.isTypeInferred());
        assertNull(declared.getType());
        assertFalse(declared.isDefine());
        assertFalse(declared.isNoShadow());
    }

    @Test
    public void testInitialValueOfVarWithoutInitializerIsNull() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node name = Node.newString(Token.NAME, "plain");
        new Node(Token.VAR, name);
        Var declared = scope.declare("plain", name, null, null);
        assertNull(declared.getInitialValue());
        assertSame(name.getParent(), declared.getParentNode());
    }

    @Test
    public void testInitialValueOfVarWithInitializerIsFirstChild() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node value = Node.newNumber(7);
        Node name = Node.newString(Token.NAME, "count");
        name.addChildToBack(value);
        new Node(Token.VAR, name);
        Var declared = scope.declare("count", name, null, null);
        assertSame(value, declared.getInitialValue());
    }

    @Test
    public void testInitialValueOfAssignmentIsLastChild() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node name = Node.newString(Token.NAME, "value");
        Node rhs = Node.newNumber(3);
        new Node(Token.ASSIGN, name, rhs);
        Var declared = scope.declare("value", name, null, null);
        assertSame(rhs, declared.getInitialValue());
    }

    @Test
    public void testInitialValueForFunctionParentIsFunctionNode() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node name = Node.newString(Token.NAME, "fn");
        Node function = new Node(Token.FUNCTION, name);
        Var declared = scope.declare("fn", name, null, null);
        assertSame(function, declared.getInitialValue());
    }

    @Test
    public void testDeclarativelyUnboundFilterIncludesUntypedVarDeclaration() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node name = Node.newString(Token.NAME, "plain");
        new Node(Token.VAR, name);
        scope.declare("plain", name, null, null);
        assertFalse(scope.getDeclarativelyUnboundVarsWithoutTypes().hasNext());
    }

    @Test
    public void testDeclarativelyUnboundFilterExcludesTypedVarDeclaration() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node name = Node.newString(Token.NAME, "typed");
        new Node(Token.VAR, name);
        scope.declare("typed", name, null, null);
        assertFalse(scope.getDeclarativelyUnboundVarsWithoutTypes().hasNext());
    }

    @Test
    public void testVarWithoutInputHasNonFileInputNameAndNoSourceFile() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Var var = scope.declare("source", Node.newString(Token.NAME, "source"), null, null);
        assertEquals("<non-file>", var.getInputName());
        assertNull(var.getSourceFile());
    }

    @Test
    public void testConstNameAndParentExpressionAreNotBleedingFunction() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node name = Node.newString(Token.NAME, "CONST_VALUE");
        new Node(Token.VAR, name);
        Var var = scope.declare("CONST_VALUE", name, null, null);
        assertFalse(var.isConst());
        assertFalse(var.isBleedingFunction());
    }

    @Test
    public void testConstFlagIsFalseWithoutConstantNameProperty() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node name = Node.newString(Token.NAME, "value");
        Var var = scope.declare("value", name, null, null);
        assertFalse(var.isConst());
        assertNull(var.getJSDocInfo());
    }

    @Test
    public void testGetTypeOfThisRetainsBottomScopeType() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        assertNull(scope.getTypeOfThis());
    }

    @Test
    public void testArgumentsVarSourceAndTypeAreNull() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Var arguments = scope.getArgumentsVar();
        assertNull(arguments.getSourceFile());
        assertNull(arguments.getType());
        assertEquals("<non-file>", arguments.getInputName());
        assertNull(arguments.getParentNode());
    }

    @Test
    public void testConstNameWithoutConstPropertyRemainsFalse() throws Exception {
        Scope scope = new Scope(new Node(Token.BLOCK), (ObjectType) null);
        Node name = Node.newString(Token.NAME, "A");
        Var var = scope.declare("A", name, null, null, false);
        assertFalse(var.isConst());
        assertFalse(var.isTypeInferred());
    }
}
