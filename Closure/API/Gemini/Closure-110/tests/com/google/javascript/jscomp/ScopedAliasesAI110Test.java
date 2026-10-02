package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ScopedAliasesAI110Test {

  @Test
  public void testValidScopeAlias() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] {
          JSSourceFile.fromCode(
              "input.js",
              "goog.scope(function() { var dom = goog.dom; dom.createElement('div'); });")
        },
        options);
    ScopedAliases scopedAliases = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    scopedAliases.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertEquals(0, compiler.getErrorCount());
    String output = compiler.toSource();
    assertTrue(output.contains("goog.dom.createElement"));
  }

  @Test
  public void testScopeReferencesThis() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] {
          JSSourceFile.fromCode(
              "input.js",
              "goog.scope(function() { this.foo = 1; });")
        },
        options);
    ScopedAliases scopedAliases = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    scopedAliases.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertEquals(1, compiler.getErrorCount());
    assertEquals(ScopedAliases.GOOG_SCOPE_REFERENCES_THIS, compiler.getErrors()[0].type);
  }

  @Test
  public void testScopeAliasRedefined() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] {
          JSSourceFile.fromCode(
              "input.js",
              "goog.scope(function() { var dom = goog.dom; dom = 1; });")
        },
        options);
    ScopedAliases scopedAliases = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    scopedAliases.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertEquals(1, compiler.getErrorCount());
    assertEquals(ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED, compiler.getErrors()[0].type);
  }
}
