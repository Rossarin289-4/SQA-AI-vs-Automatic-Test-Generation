package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TypedScopeCreatorAI54Test {

  @Test
  public void testTypedefHandling() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "var window;") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "/** @typedef {number} */ var MyNum;") },
        options);
    compiler.parse();
    compiler.getTopScope();
    assertNotNull(compiler.getTypeRegistry());
  }

  @Test
  public void testGlobalScopeBuilderVisitVar() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x = 10; var y = 20;") },
        options);
    compiler.parse();
    Scope scope = compiler.getTopScope();
    assertNotNull(scope.getVar("x"));
    assertNotNull(scope.getVar("y"));
  }

  @Test
  public void testLocalScopeBuilderFunctionInputs() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f(a, b) { var z = a; return z; }") },
        options);
    compiler.parse();
    Scope scope = compiler.getTopScope();
    assertNotNull(scope.getVar("f"));
  }
}
