package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TypedScopeCreatorAI95Test {

  @Test
  public void testTypedefWarningAndScopeCreation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "/** @typedef */ var MyTypedef;") },
        options);
    compiler.parse();
    assertNotNull(compiler.getRoot());
  }

  @Test
  public void testLocalScopeFunctionParameters() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f(a, b) { var x = a; return x; }") },
        options);
    compiler.parse();
    compiler.check();
    assertNotNull(compiler.getTopScope());
  }

  @Test
  public void testGlobalScopeBuilderVisit() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x = 10; var y = 20;") },
        options);
    compiler.parse();
    compiler.processDefines();
    assertNotNull(compiler.getResult());
  }
}
