package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TypedScopeCreatorAI168Test {

  @Test
  public void testGlobalVariableDeclaration() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10;");

    compiler.compile(externs, new JSSourceFile[] { input });
    Scope scope = compiler.getTopScope();
    assertNotNull(scope.getVar("x"));
  }

  @Test
  public void testFunctionParametersScope() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(a, b) { return a; }");

    compiler.compile(externs, new JSSourceFile[] { input });
    Scope scope = compiler.getTopScope();
    Var fVar = scope.getVar("f");
    assertNotNull(fVar);
    assertNotNull(fVar.getType());
  }

  @Test
  public void testBleedingFunction() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var f = function g() { return g; };");

    compiler.compile(externs, new JSSourceFile[] { input });
    Scope scope = compiler.getTopScope();
    assertNotNull(scope.getVar("f"));
  }
}
