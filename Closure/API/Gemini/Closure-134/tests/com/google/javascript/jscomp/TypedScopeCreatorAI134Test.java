package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class TypedScopeCreatorAI134Test {

  @Test
  public void testCreateScopeWithNullParent() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x = 1;") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
  }

  @Test
  public void testCreateScopeWithParent() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f() { var y = 2; }") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);
    Scope innerScope = creator.createScope(root.getLastChild(), globalScope);
    assertNotNull(innerScope);
  }

  @Test
  public void testTypedScopeCreatorConstruction() {
    Compiler compiler = new Compiler();
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    assertNotNull(creator);
  }
}
