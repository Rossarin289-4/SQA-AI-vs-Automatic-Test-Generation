package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Test;

public class TypedScopeCreatorAI172Test {

  @Test
  public void testGlobalVariableTypedScope() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10;");

    compiler.compile(externs, new JSSourceFile[] { input });
    Scope scope = compiler.getTopScope();

    Assert.assertNotNull(scope);
    Scope.Var var = scope.getVar("x");
    Assert.assertNotNull(var);
    Assert.assertEquals("x", var.getName());
  }

  @Test
  public void testFunctionParametersTypedScope() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(a, b) { return a; }");

    compiler.compile(externs, new JSSourceFile[] { input });
    Scope scope = compiler.getTopScope();

    Assert.assertNotNull(scope);
    Scope.Var var = scope.getVar("f");
    Assert.assertNotNull(var);
  }

  @Test
  public void testTypedefDiagnosticTypeExists() {
    Assert.assertNotNull(TypedScopeCreator.MALFORMED_TYPEDEF);
    Assert.assertNotNull(TypedScopeCreator.ENUM_INITIALIZER);
  }
}
