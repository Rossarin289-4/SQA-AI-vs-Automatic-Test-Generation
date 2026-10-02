package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class ScopeAI155Test {

  @Test
  public void testGlobalScopeCreation() {
    Compiler compiler = new Compiler();
    Node root = new Node(Token.BLOCK);
    Scope scope = new Scope(root, compiler);

    assertTrue(scope.isGlobal());
    assertTrue(!scope.isLocal());
    assertEquals(0, scope.getDepth());
    assertEquals(root, scope.getRootNode());
    assertNull(scope.getParent());
  }

  @Test
  public void testVariableDeclarationAndLookup() {
    Compiler compiler = new Compiler();
    Node root = new Node(Token.BLOCK);
    Scope scope = new Scope(root, compiler);

    Node nameNode = new Node(Token.NAME, "x");
    Scope.Var var = scope.declare("x", nameNode, null, null);

    assertNotNull(var);
    assertEquals("x", var.getName());
    assertEquals(var, scope.getVar("x"));
    assertEquals(var, scope.getSlot("x"));
    assertEquals(1, scope.getVarCount());
    assertTrue(scope.isDeclared("x", false));
  }

  @Test
  public void testNestedScopeLookup() {
    Compiler compiler = new Compiler();
    Node globalRoot = new Node(Token.BLOCK);
    Scope globalScope = new Scope(globalRoot, compiler);

    Node varNode = new Node(Token.NAME, "a");
    globalScope.declare("a", varNode, null, null);

    Node funcRoot = new Node(Token.FUNCTION);
    Scope localScope = new Scope(globalScope, funcRoot);

    assertTrue(localScope.isLocal());
    assertEquals(1, localScope.getDepth());
    assertEquals(globalScope, localScope.getParent());
    assertNotNull(localScope.getVar("a"));
    assertEquals("a", localScope.getVar("a").getName());
  }
}
