package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class DevirtualizePrototypeMethodsAI135Test {

  @Test
  public void testCreation() {
    Compiler compiler = new Compiler();
    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    assertNotNull(pass);
  }

  @Test
  public void testProcessWithEmptyInputs() {
    Compiler compiler = new Compiler();
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "");
    compiler.compile(externs, input, new CompilerOptions());

    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertNotNull(compiler.getRoot());
  }

  @Test
  public void testProcessWithPrototypeMethod() {
    Compiler compiler = new Compiler();
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function A() {} A.prototype.foo = function() { return this; }; var a = new A(); a.foo();");
    CompilerOptions options = new CompilerOptions();
    compiler.compile(externs, input, options);

    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertNotNull(compiler.toSource());
  }
}
