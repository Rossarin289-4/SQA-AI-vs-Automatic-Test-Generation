package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinimizeExitPointsAI126Test {

  @Test
  public void testMinimizeReturn() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f() { if (x) { return; } foo(); }");

    compiler.compile(externs, new JSSourceFile[] { input }, new JSModule[0], new CompilerOptions());
    String output = compiler.toSource();
    assertEquals("function f(){if(x);else foo();}", output);
  }

  @Test
  public void testMinimizeBreak() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "mylabe: { if (x) { break mylabe; } foo(); }");

    compiler.compile(externs, new JSSourceFile[] { input }, new JSModule[0], new CompilerOptions());
    String output = compiler.toSource();
    assertEquals("mylabe:{if(x);else foo();}", output);
  }

  @Test
  public void testMinimizeContinue() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "while (x) { if (y) { continue; } foo(); }");

    compiler.compile(externs, new JSSourceFile[] { input }, new JSModule[0], new CompilerOptions());
    String output = compiler.toSource();
    assertEquals("while(x)if(y);else foo();", output);
  }
}
