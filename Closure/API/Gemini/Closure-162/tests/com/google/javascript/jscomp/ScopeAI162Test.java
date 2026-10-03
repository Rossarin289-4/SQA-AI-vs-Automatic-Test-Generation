package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class ScopeAI162Test {

  @Test
  public void testGlobalScopeCreationAndVars() {
    Compiler compiler = new Compiler();
    Node root = new Node(Token.BLOCK);
    Scope scope = new Scope(root, compiler);

    assertTrue(scope.isGlobal());
    assertEquals(0, scope.getDepth());
    assertEquals(root, scope.getRootNode());
    assertNull(scope.getParent());

    Node nameNode = new Node(Token.NAME, "x");
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", "var x;"));
    Scope.Var var = scope.declare("x", nameNode, null, input);

    assertNotNull(var);
    assertEquals("x", var.getName());
    assertEquals(var, scope.getVar("x"));
    assertEquals(1, scope.getVarCount());
  }

  @Test
  public void testNestedScopeResolution() {
    Compiler compiler = new Compiler();
    Node globalRoot = new Node(Token.BLOCK);
    Scope globalScope = new Scope(globalRoot, compiler);

    Node fnRoot = new Node(Token.FUNCTION);
    Scope localScope = new Scope(globalScope, fnRoot);

    assertTrue(localScope.isLocal());
    assertEquals(1, localScope.getDepth());
    assertEquals(globalScope, localScope.getParent());
    assertEquals(globalScope, localScope.getGlobalScope());

    Node globalVarNode = new Node(Token.NAME, "a");
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", "var a;"));
    globalScope.declare("a", globalVarNode, null, input);

    assertNotNull(localScope.getVar("a"));
    assertEquals("a", localScope.getVar("a").getName());
  }

  @Test
  public void testUndeclareVariable() {
    Compiler compiler = new Compiler();
    Node root = new Node(Token.BLOCK);
    Scope scope = new Scope(root, compiler);

    Node nameNode = new Node(Token.NAME, "y");
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", "var y;"));
    Scope.Var var = scope.declare("y", nameNode, null, input);

    assertEquals(1, scope.getVarCount());
    scope.undeclare(var);
    assertEquals(0, scope.getVarCount());
    assertNull(scope.getVar("y"));
  }
}
