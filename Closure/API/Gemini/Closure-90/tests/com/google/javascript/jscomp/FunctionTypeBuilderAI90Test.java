package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FunctionTypeBuilderAI90Test {

  @Test
  public void testIsFunctionTypeDeclarationWithParams() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "/** @param {string} x */ function f(x) {}") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    assertNotNull(root);
  }

  @Test
  public void testIsFunctionTypeDeclarationWithConstructor() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "/** @constructor */ function C() {}") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    assertNotNull(root);
  }

  @Test
  public void testCompileFunctionTypeValid() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    Result result = compiler.compile(
        JSSourceFile.fromCode("externs.js", ""),
        JSSourceFile.fromCode("input.js", "/** @return {number} */ function f() { return 1; }"),
        options);
    assertTrue(result.success);
  }
}
