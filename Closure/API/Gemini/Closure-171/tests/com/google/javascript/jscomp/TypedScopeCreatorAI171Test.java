package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TypedScopeCreatorAI171Test {

  @Test
  public void testGlobalScopeCreation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(externs, input);
    assertNotNull(compiler.getTopScope());
  }

  @Test
  public void testTypedScopeCreatorWithFunction() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(a) { return a; }");
    compiler.compile(externs, input);
    assertNotNull(compiler.getTopScope());
  }

  @Test
  public void testTypedScopeCreatorWithVarRedefinition() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1; var x = 2;");
    compiler.compile(externs, input);
    assertNotNull(compiler.getTopScope());
  }
}
